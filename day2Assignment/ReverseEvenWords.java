package week3.day2Assignment;

public class ReverseEvenWords {

	public static void main(String[] args) {
		/* Pseudo Code:
		 
		 * Declare the input as Follow
	      		String test = "I am a software tester"; 
		a) split the words and have it in an array
		b) Traverse through each word (using loop)
		c) find the odd index within the loop (use mod operator)
		
		d)split the words and have it in an array
		
		e)print the even position words in reverse order using another loop (nested loop)
		f) Convert words to character array if the position is even else print the word as it is(concatenate space at the end).
		
		 
	*/
            String test="I am a software tester";
            String[] s = test.split(" ");
            String test2="";
           
            int length=s.length;
            
            
           
            for(int i=0;i<length;i++) {
            	if(i%2!=0) {
            		
            		
            	   char[] ch = new char[s[i].length()];
            	   char[] ch1 = new char[s[i].length()];
            	   
            	   ch=s[i].toCharArray();
            	   
            	   for(int j=(s[i].length()-1),k=0;j>=0;j--,k++) { 
            		   ch1[k]=ch[j];
            		   //test2 = ch1.toString();
                	   //System.out.println(ch1);
                	  
            		   }
            		 String s1=new String(ch1);
            	   System.out.println(ch1);
            	   test2=test2.concat(s1.concat(" "));
            	  
            	   
            	}
            	else
            		test2=test2.concat(s[i].toString().concat(" "));
            	
            		
            		
            	
            		
            		
            }
            System.out.println(test2);
            
            
            
            		
            	

	}

}
