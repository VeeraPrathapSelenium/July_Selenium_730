package Strings_Examples;

public class PrinttheOutput_3DifferentLines {

	public static void main(String[] args) {

String str="The Transaction id : 1056 The Voucher Number is :45698 The Journal Number is :4571 ";

String temp="";
for(int i=0;i<=str.length()-1;i++)
{
	
	temp=temp+str.charAt(i);
	
	if(Character.isDigit(str.charAt(i)) && Character.isWhitespace(str.charAt(i+1)) )
	{
		temp=temp+"@";
			
	}
			
}
//System.out.println(temp);

String[] arr=temp.split("@");

for (String string : arr) {
	System.out.println(string.trim());
}

	}

}
