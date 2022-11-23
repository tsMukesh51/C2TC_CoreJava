package org.tns.gsa;

public abstract class NormalAcc extends ShopAcc{
	private final float deliveryCharges;
	NormalAcc(int AccNo, String accNm, float charges, float deliveryCharges) {
		super(AccNo, accNm, charges);
		this.deliveryCharges = deliveryCharges;
	}
	@Override
	public abstract void bookProduct(float charges);
	@Override
	public abstract String toString();
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
