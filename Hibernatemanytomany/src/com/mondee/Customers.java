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
import javax.persistence.criteria.Order;

@Entity
@Table(name="customers")
public class Customers {
	@Id
	@Column(name="cid")
	private int customerId;
	@Column(name="cname")
	private String customerName;
	@ManyToMany(mappedBy="customers")
	
	
	private Set< Orders > orders;
	public int getCustomerId() {
		return customerId;
	}
	public Set<Orders> getOrders() {
		return orders;
	}
	public void setOrders(Set<Orders> orders) {
		this.orders = orders;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

}
