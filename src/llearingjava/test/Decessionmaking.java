package llearingjava.test;

import java.util.Scanner;

public class Decessionmaking {
	static Scanner Sc =  new  Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("enter a number:");
         int  a=  Sc.nextInt();
           
          if (a%2==0 && a%4==0)
        	  
              System.out.println(a+" is a leap year");
         
        	  
          else
        	  System.out.println(a+" is odd number");

	  

}
        	  
 
          
	}
	
	

	