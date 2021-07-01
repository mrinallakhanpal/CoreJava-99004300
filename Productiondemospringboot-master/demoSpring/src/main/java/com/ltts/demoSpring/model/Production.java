package com.ltts.demoSpring.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


@Entity
public class Production {
	
	@Id
	@GeneratedValue
	private int Production_ID;
	private String Address;
	private String ProductionName;
	private int Year;
	private String Ownername;
	
	
	public Production() {
		super();
	}

	public Production(int Production_ID, String ProductionName,String Address, int Year, String Ownername) {
		super();
		this.Production_ID = Production_ID;
		this.ProductionName = ProductionName;
		this.Address = Address;
		this.Year = Year;
		this.Ownername = Ownername;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}

	public int getProductionID() {
		return Production_ID;
	}

	public void setProductionID(int productionID) {
		Production_ID = productionID;
	}

	

	public String getProductionName() {
		return ProductionName;
	}

	public void setProductionName(String productionName) {
		ProductionName = productionName;
	}

	public int getYear() {
		return Year;
	}

	public void setYear(int year) {
		Year = year;
	}

	public String getOwnername() {
		return Ownername;
	}

	public void setOwnername(String ownername) {
		Ownername = ownername;
	}

	@Override
	public String toString() {
		return "Production =" + Production_ID + ", Address=" + Address + ", ProductionName="
				+ ProductionName + ", Year=" + Year + ", Ownername=" + Ownername;
	}

	
	
	
	
	
	

}
