package com.mondee;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Table(name="CreditCard")
@Entity
public class CreditCard extends Payment
	 {
	    @Column(name="CreditCardType")
	 	private String CreditCardType;
	 	
	 public String getCreditCardType() 
	 {
	 	return CreditCardType;
	 }
	 public void setCreditCardType(String CreditCardType)
	 {
	 	this.CreditCardType=CreditCardType;
	 }

}
