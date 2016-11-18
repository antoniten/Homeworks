package Homeworks;

import java.io.PrintStream;
import java.util.Scanner;

public class homework_1 {
	 public static void main(String[] args) {
	        System.out.print("Stroka: ");
	        Scanner a = new Scanner(System.in);
	        String str = a.nextLine();
	        
	        System.out.print("Nomer simvola:");
	        int k=a.nextInt();
	        String p;
	        String []words=str.split("[\\s\\.\\!\\,]");
	        for(int l=0;l<words.length;l++){
	            System.out.print("");
	 
	            if(k<words[l].length()){
	                p="";
	                p+=words[l].substring(0, k-1);
	                p+='@';
	                p+=words[l].substring(k,words[l].length());
	 
	                words[l]=p;
	            }
	            System.out.print(" "+words[l]);

}
	 }
}
