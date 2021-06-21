package com.movieproduction.details;

public class Production {
	private int Productionid,DateofStarted;
	private String Productionname,Adress,Ownername;
	
	
	
	
	public Production(int productionid, String productionname, String address, int dateofstarted,String ownername) {
		super();
		this.Productionid = productionid;
		this.DateofStarted = dateofstarted;
		this.Productionname = productionname;
		this.Adress = address;
		this.Ownername = ownername;
	}
	public Production() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getProductionid() {
		return Productionid;
	}
	public void setProductionid(int productionid) {
		Productionid = productionid;
	}
	public int getDateofStarted() {
		return DateofStarted;
	}
	public void setDateofStarted(int dateofStarted) {
		DateofStarted = dateofStarted;
	}
	public String getProductionname() {
		return Productionname;
	}
	public void setProductionname(String productionname) {
		Productionname = productionname;
	}
	public String getAdress() {
		return Adress;
	}
	public void setAdress(String adress) {
		Adress = adress;
	}
	public String getOwnername() {
		return Ownername;
	}
	public void setOwnername(String ownername) {
		Ownername = ownername;
	}
	@Override
	public String toString() {
		return "Production Productionid=" + Productionid + ", DateofStarted=" + DateofStarted + ", Productionname="
				+ Productionname + ", Adress=" + Adress + ", Ownername=" + Ownername;
	}
	
	
	
}
