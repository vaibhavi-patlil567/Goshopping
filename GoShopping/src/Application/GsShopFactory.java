package Application;

import Framework.ShopFactory;

public class GsShopFactory implements ShopFactory 
{

	public GsPrimeAcc getNewPrimeAccount(int AccNo, String accNm, float charges, boolean isPrime) 
	{
		GsPrimeAcc gsprime = new GsPrimeAcc(AccNo, accNm, charges,isPrime);
		return gsprime;
	}

	public GsNormalAcc getNewNormalAccount(int AccNo, String accNm, float charges, float deliveryCharges) 
	{
		GsNormalAcc gsnormal = new GsNormalAcc(AccNo, accNm, deliveryCharges, deliveryCharges);
		return gsnormal;
	}
	
	

	
}