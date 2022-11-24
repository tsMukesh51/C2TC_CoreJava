package org.tns.gsa.framework;

public abstract class ShopAcc {
	private int accNo;
	private String accNm;
	private float charges;
	ShopAcc(int accNo, String accNm,float charges){
		this.accNo = accNo;
		this.accNm = accNm;
		this.charges = charges;
	}
	public abstract void bookProduct(float charges);
	public abstract void items(float item);
	public abstract String toString();
	public int getAccNo() {
		return accNo;
	}
	public String getAccNm() {
		return accNm;
	}
	public void setAccNm(String accNm) {
		this.accNm = accNm;
	}
	public float getCharges() {
		return charges;
	}
}
