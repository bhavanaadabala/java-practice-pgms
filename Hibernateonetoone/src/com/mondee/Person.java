package com.mondee;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
@Entity
@Table(name="person")
public class Person 
{
	@Id
	@Column(name="pid")
	private int personId;
	@Column(name="pname")
	private String personName;
	@OneToOne(targetEntity=Aadharcard.class,cascade=CascadeType.ALL)
	private Aadharcard aadharcard;
	public Aadharcard getAadharcard() {
		return aadharcard;
	}
	public void setAadharcard(Aadharcard aadharcard) {
		this.aadharcard = aadharcard;
	}
	public int getPersonId() 
	{
		return personId;
	}
	public void setPersonId(int personId) 
	{
		this.personId = personId;
	}
	public String getPersonName() 
	{
		return personName;
	}
	public void setPersonName(String personName) 
	{
		this.personName = personName;
	}
}
