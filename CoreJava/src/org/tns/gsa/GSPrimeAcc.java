package org.tns.gsa;

public class GSPrimeAcc extends PrimeAcc{
	private final float Charges = 0;
	public GSPrimeAcc(int AccNo, String accNm,float charges, boolean isPrime){
		super(AccNo, accNm, charges, isPrime);
	}
	@Override
	public void bookProduct(float charges) {
		System.out.println("Your total payable amount is: "+ charges);
	}
	@Override
	public String toString() {
		return ("Name: " + super.getaccNm() + "\nAccount Number" + super.getAccNo() + "Total Charges" + (super.getDeliveryCharges() + super.getcharges()));
	}
	@Override
	public void items(float item) {
		System.out.println("Items are brought");
	}
	
}
