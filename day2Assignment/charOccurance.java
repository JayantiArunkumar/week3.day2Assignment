package week3.day2Assignment;

public class charOccurance {

	public static void main(String[] args) {
		// Check number of occurrences of a char (eg 'e') in a String
		
					String str = "welcome to chennai";

					// declare and initialize a variable count to store the number of occurrences
					 int count=0;
					// convert the string into char array
						char[] ch=str.toCharArray();
					//get the length of the array
						int length=ch.length;
					// traverse from 0 till the array length 
						// Check the char array has the particular char in it 
				// if is has increment the count
					// print the count out of the loop
						
						for(int i=0;i<length;i++)
							if(ch[i]=='e')
								count++;
						System.out.println(count);
						
						

	}

}
