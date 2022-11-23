package org.tns.gsa;

public abstract class PrimeAcc extends ShopAcc {
	private boolean isPrime;
	private static final float deliveryCharges = 0;
	PrimeAcc(int AccNo, String accNm,float charges, boolean isPrime){
		super(AccNo, accNm, charges);
		this.isPrime = isPrime;
	}
	@Override
	public abstract void bookProduct(float charges);
	@Override
	public abstract String toString();
	
	public boolean isPrime() {
		return isPrime;
	}
	public float getDeliveryCharges() {
		return deliveryCharges;
	}
	@Override
	public int getAccNo() {
		return super.getAccNo();
	}
	@Override
	public String getaccNm() {
		return super.getaccNm();
	}
	@Override
	public void setAccNm(String accNm) {
		super.setAccNm(accNm);
	}
	@Override
	public float getcharges() {
		return getcharges();
	}
}
