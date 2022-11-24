package org.tns.gsa.framework;

public abstract class NormalAcc extends ShopAcc{
	private final float deliveryCharges;
	public NormalAcc(int accNo, String accNm, float charges, float deliveryCharges) {
		super(accNo, accNm, charges);
		this.deliveryCharges = deliveryCharges;
	}
	@Override
	public abstract void bookProduct(float charges);
	@Override
	public abstract String toString();
	public float getDeliveryCharges() {
		return deliveryCharges;
	}
}
