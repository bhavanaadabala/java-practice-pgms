package com.mondee;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Table(name="Cheque")
@Entity
public class Cheque extends Payment
{
	@Column(name="ChequeType")
	private String ChequeType;
	
public String getChequeType() 
{
	return ChequeType;
}
public void setChequeType(String ChequeType)
{
	this.ChequeType=ChequeType;
}

}
