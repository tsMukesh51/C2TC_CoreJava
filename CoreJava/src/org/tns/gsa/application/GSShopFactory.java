package org.tns.gsa.application;

import org.tns.gsa.framework.NormalAcc;
import org.tns.gsa.framework.PrimeAcc;
//import org.tns.gsa.framework.ShopFactory;

public class GSShopFactory extends org.tns.gsa.framework.ShopFactory{

	public PrimeAcc getNewPrimeAccount(int accNo, String accNm, float charges, boolean isPrime) {
		GSPrimeAcc primeMbr = new GSPrimeAcc(accNo, accNm, charges, isPrime);
		return primeMbr;
	}

	public NormalAcc getNewNormalAccount(int accNo, String accNm, float charges, float deliveryCharges) {
		GSNormalAcc normalMbr = new GSNormalAcc(accNo, accNm, charges, deliveryCharges);
		return normalMbr;
	}
	
	public static void main(String[] args) {
		GSShopFactory gssfactory = new GSShopFactory();
		PrimeAcc acc1 = gssfactory.getNewPrimeAccount(236, "Ram", 1000, true);
		NormalAcc acc2 = gssfactory.getNewNormalAccount(785, "Shashank", 1000, 50);

		acc1.toString();
		acc2.toString();
		
	}
}
