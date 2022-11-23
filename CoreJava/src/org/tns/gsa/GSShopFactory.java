package org.tns.gsa;

public class GSShopFactory implements ShopFactory{

	public PrimeAcc getNewPrimeAccount(int AccNo, String accNm, float charges, boolean isPrime) {
		GSPrimeAcc primeMbr = new GSPrimeAcc(AccNo, accNm, charges, isPrime);
		return primeMbr;
	}

	public NormalAcc getNewNormalAccount(int AccNo, String accNm, float charges, float deliveryCharges) {
		GSNormalAcc normalMbr = new GSNormalAcc(AccNo, accNm, charges, deliveryCharges);
		return normalMbr;
	}
	
	public static void main(String[] args) {
		GSShopFactory gssfactory = new GSShopFactory();
		gssfactory.getNewPrimeAccount(236, "Ram", 1000, true);
		gssfactory.getNewNormalAccount(785, "Shashank", 1000, 50);
	}
}
