package week3.day2Assignment;

public class Palindrome {

	public static void main(String[] args) {
		/*
		 * Pseudo Code
		
		 * a) Declare A String value as"madam"
		 
		 * b) Declare another String rev value as ""
		 * c) Iterate over the String in reverse order
		 * d) Add the char into rev
		 * e) Compare the original String with the reversed String, if it is same then print palinDrome 
		 
		 * Hint: Use .equals or .equalsIgnoreCase when you compare a String 
		 */
		String s="madam";
		String rev="";
		
		int length = s.length()-1;
		for(int i=length; i>=0;i--)
		{
			System.out.println(s.charAt(i));
		          rev=rev+s.charAt(i);
		          
		         
		          
		 }
		System.out.println(rev);
		if(s.equalsIgnoreCase(rev))
			System.out.println("The given String is a palindrome");
		else
			System.out.println("The given String is not a palindrome");
		
		

	}

}
