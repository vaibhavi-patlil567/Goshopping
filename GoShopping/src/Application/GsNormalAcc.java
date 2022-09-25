package Application;

import Framework.NormalAcc;

public class GsNormalAcc extends NormalAcc 
{

	public GsNormalAcc(int accNo, String accNm, float charges, float deliveryCharge) {
		super(accNo, accNm, charges, deliveryCharge);
		// TODO Auto-generated constructor stub
	}
	
	public GsNormalAcc() {
		super(accNo, accNm, deliveryCharge, deliveryCharge);
		// TODO Auto-generated constructor stub
	}

	public void bookProduct(float charges)
	{
		System.out.println("Dear Normal User,Your Charges are : "+charges+" with Delivery Charges is: "+deliveryCharge);
	}

	@Override
	public String toString() {
		return "GSNormalAcc [accNo=" + getAccNo() + ", charges=" + getCharges() + ", toString()=" + super.toString()
				+ ", getAccNm()=" + getAccNm() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}

	@Override
	public void items(float f) {
		// TODO Auto-generated method stub
		
	}
	

}

	
