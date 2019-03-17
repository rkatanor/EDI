package com.mybenefits.model;

import java.util.List;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
public class Subscriber {
	private int oid;
	private String first_name;
	private String last_name;
	private String guid;
	private String salary;
	private String SSN;
	private String address;
	@JacksonXmlElementWrapper(useWrapping= false)
	private List<Benefits> benefits;

	public int getOid() {
		return oid;
	}

	public void setOid(int oid) {
		this.oid = oid;
	}

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public String getGuid() {
		return guid;
	}

	public void setGuid(String guid) {
		this.guid = guid;
	}

	public String getSalary() {
		return salary;
	}

	public void setSalary(String salary) {
		this.salary = salary;
	}

	public String getSSN() {
		return SSN;
	}

	public void setSSN(String sSN) {
		SSN = sSN;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public List<Benefits> getBenefits() {
		return benefits;
	}

	public void setBenefits(List<Benefits> benefits) {
		this.benefits = benefits;
	}

	@Override
	public String toString() {
		return "Subscriber [oid=" + oid + ", first_name=" + first_name + ", last_name=" + last_name + ", guid=" + guid
				+ ", salary=" + salary + ", SSN=" + SSN + ", address=" + address + ", benefits=" + benefits + "]";
	}

}
