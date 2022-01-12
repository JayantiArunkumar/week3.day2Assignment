package week3.day2Assignment;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		/*
		 * Pseudo Code
		  
		 *Declare a String 
			String text1 = "stops";
		 *Declare another String
			String text2 = "potss"; 
		 * a) Check length of the strings are same then (Use A Condition)
		 * b) Convert both Strings in to characters
		 * c) Sort Both the arrays
		 * d) Check both the arrays has same value
		 * 
		 */
        String text1="stops";
        int count=0;
        String text2="potss";
        int length1=text1.length();
        System.out.println(length1);
        int length2=text2.length();
        if(length1==length2) {
        	char[] ch1=text1.toCharArray();
        	char[] ch2=text2.toCharArray();
        	Arrays.sort(ch1);
        	System.out.print(ch1);
        	System.out.println();
        	Arrays.sort(ch2);
        	System.out.print(ch2);
        	for(int i=0;i<length1;i++) 
        		for(int j=0;j<length2;j++) 
        			if(ch1[i]==ch2[j]) {
        			count=count+1;
        			break;
        			}
        			  
        	if(count==length1)		
        		 System.out.println("Both Arrays have same value");	
        	else
        		 System.out.println("Both Arrays don't have same value ");
    		
         
        	
        }
		
		
	}

}
