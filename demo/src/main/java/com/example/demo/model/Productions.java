package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Productions {
	
	 @Id
	   @GeneratedValue
	private int Productionid;
	private String Productionname;
	private String Address;
	private String DateofStarted;
	private String Ownername;
	
	
	public Productions() {
		super();
	}


	public Productions(int Productionid, String Productionname, String Address, String dos, String ownername) {
		super();
		this.Productionid=Productionid;
		this.Productionname=Productionname;
		this.Address=Address;
		this.DateofStarted=dos;
		this.Ownername=ownername;
	}
	
	
	
	public Productions(int n, String name, String address2, int year, String owner) {
		// TODO Auto-generated constructor stub
	}


	public int getProductionid() {
		return Productionid;
	}
	public void setProductionid(int productionid) {
		Productionid = productionid;
	}
	public String getProductionname() {
		return Productionname;
	}
	public void setProductionname(String productionname) {
		Productionname = productionname;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public String getDateofStarted() {
		return DateofStarted;
	}
	public void setDateofStarted(String dateofStarted) {
		DateofStarted = dateofStarted;
	}
	public String getOwnername() {
		return Ownername;
	}
	public void setOwnername(String ownername) {
		Ownername = ownername;
	}
	@Override
	public String toString() {
		return "Productionid=" + Productionid + ", Productionname=" + Productionname + ", Address="
				+ Address + ", DateofStarted=" + DateofStarted + ", Ownername=" + Ownername ;
	}
	
	

}
