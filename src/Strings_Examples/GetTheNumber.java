package Strings_Examples;

public class GetTheNumber {

	public static void main(String[] args) {
		
		String str="The Voucher id (AZXO1089)is generated sucessfully";
		
		
		int firstpos=str.indexOf("(")+1;
		
		int secondpos=str.indexOf(")");

		String voucherid=str.substring(firstpos,secondpos);
		
		System.out.println(voucherid);
		
		
		
	}

}
