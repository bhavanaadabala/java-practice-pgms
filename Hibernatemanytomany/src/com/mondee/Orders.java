package com.mondee;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
@Entity
@Table(name="orders")

public class Orders 
{
	@Id
	@Column(name="oid")
	private int orderId;
	
	@Column(name="oName")
	private String orderName;
	
	@ManyToMany(fetch=FetchType.LAZY,targetEntity = Customers.class,cascade = CascadeType.ALL)
	@JoinTable(name="customersorders",
    joinColumns=@JoinColumn(name="oid"),
    inverseJoinColumns=@JoinColumn(name="cid"))
	private Set<Customers> customers;
	
	public int getOrderId() 
	{
		return orderId;
	}
	public Set<Customers> getCustomers() {
		return customers;
	}
	public void setCustomers(Set<Customers> customers) {
		this.customers = customers;
	}
	public void setOrderId(int orderId) 
	{
		this.orderId = orderId;
	}
	public String getOrderName() 
	{
		return orderName;
	}
	public void setOrderName(String orderName) 
	{
		this.orderName = orderName;
	}
}
