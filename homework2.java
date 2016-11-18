package Homeworks;

import java.util.Scanner;

public class homework2 {
	 static Scanner in = new Scanner(System.in);
	public static void main(String[] args) {  
	
		       String alphabet = "אבגדהו¸זחטיךכלםמןנסעףפץצקרשתûü‎‏ÿ ";  
		        String text1 = in.nextLine() ;  
		      for(int i =0; i< text1.length(); i++)  
		       {
		    	   
		    	   for(int j =0; j< alphabet.length(); j++)  
			       {
		    	   if (alphabet.charAt(j) == text1.charAt(i)){
		    		   System.out.print((j+1)+" "); 
		    		  
		    	   }
		    	   }
		       }  
		    }  

}
