package com.mondee;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Table(name="Payment")
@Entity
public class Payment {
	@Column(name="PaymentId")
	private int PaymentId;
	@Column(name="amount")
	private double amount;
	public int getPaymentId()
	{
		return PaymentId;
	}
	public void setPaymentId(int PaymentId)
	{
		this.PaymentId=PaymentId;
	}
	public double getAmount()
	{
		return amount;
	}
public void setAmount(double amount) {
	this.amount=amount;
}
}
