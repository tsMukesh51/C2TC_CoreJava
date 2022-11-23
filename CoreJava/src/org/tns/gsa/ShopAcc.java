package org.tns.gsa;

public abstract class ShopAcc {
	private int accNo;
	private String accNm;
	private float charges;
	ShopAcc(int AccNo, String accNm,float charges){
		accNo = AccNo;
		this.accNm = accNm;
		this.charges = charges;
	}
	public abstract void bookProduct(float charges);
	public abstract void items(float item);
	public abstract String toString();
	public int getAccNo() {
		return accNo;
	}
	public String getaccNm() {
		return accNm;
	}
	public void setAccNm(String accNm) {
		this.accNm = accNm;
	}
	public float getcharges() {
		return charges;
	}
}
