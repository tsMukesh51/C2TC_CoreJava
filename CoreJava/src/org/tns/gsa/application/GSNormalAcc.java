package org.tns.gsa.application;

import org.tns.gsa.framework.NormalAcc;

public class GSNormalAcc extends NormalAcc{
	public GSNormalAcc(int AccNo, String accNm, float charges, float deliveryCharges){
		super(AccNo, accNm, charges, deliveryCharges);
	}
	public void bookProduct(float charges) {
		System.out.println("Your total payable amount is: "+ charges);
	}
	public String toString() {
		return ("Name: " + super.getAccNm() + "\nAccount Number" + super.getAccNo() + "Total Charges" + (super.getDeliveryCharges() + super.getCharges()));
		}
	@Override
	public void items(float item) {
		System.out.println("Items are brought");
	}
}
