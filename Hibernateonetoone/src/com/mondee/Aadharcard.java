package com.mondee;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
@Entity
@Table(name="Aadharcard")
public class Aadharcard 
{
	@Id
	@Column(name="Aadharcardno")
	private int AadharcardNo;
	@Column(name="Aadharname")
	private String AadharName;
	@OneToOne(targetEntity=Person.class)
	private Person person;
	public Person getPerson() {
		return person;
	}
	public void setPerson(Person person) {
		this.person = person;
	}
	public int getAadharcardNo() {
		return AadharcardNo;
	}
	public void setAadharcardNo(int aadharcardNo) {
		AadharcardNo = aadharcardNo;
	}
	public String getAadharName() {
		return AadharName;
	}
	public void setAadharName(String aadharName) {
		AadharName = aadharName;
	}
}
