package Application;


public class User
{
	public static void main(String[] args) 
	{
		// Step 1 - Step a
		GsShopFactory gssfactory = new GsShopFactory();
		// Step 2
		
		GsPrimeAcc gsprime = gssfactory.getNewPrimeAccount(567, "Vaibhavi", 8000, true);
		//GSPrimeAcc gsprime = new GSPrimeAcc();
	
		System.out.println(gsprime.getAccNm());
		
		System.out.println(gsprime.getAccNo());
		
		System.out.println(gsprime.getCharges());
		
		
		
		// Step 3
		GsNormalAcc gsnormal = new GsNormalAcc(); 
		gssfactory.getNewNormalAccount(267, "Harsh", 7000, 200);
		
		
		System.out.println(gsnormal.getAccNm());
		System.out.println(gsnormal.getAccNo());
		System.out.println(gsnormal.getCharges());
		gsnormal.getDeliveryCharge();
		
		// Step 4 / Step d.
		gsprime.bookProduct(1000);
		
		// Step 5 / Step e.
		gsprime.toString();
		
	
		// Step 4 / Step d.
		gsnormal.bookProduct(1000);
		// Step 5 / Step e.
		gsnormal.toString();
	
		

	}

}

