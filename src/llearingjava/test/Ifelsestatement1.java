package llearingjava.test;

import java.util.Scanner;

public class Ifelsestatement1 {

	public static void main(String[] args) {
    
		Scanner sc  = new Scanner(System.in);
		  int a =10;
		  int b =5 ;
		  int c =1;
		  
		  int sum = a+b+c;
		  System.out.println("The sum of numbers is: "+sum); 
		  
		  
		  if  (a>b && b>=c)
		  {
			  if  (b>c || a>c)
			  {
				  
				  System.out.println("the greater num is printing :" );

			  }
			  System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>" );
		  }
		  
		  else 
		  {
			  System.out.println(">>>>>>>>>>>>>>the number is  >>>>>>>>>>>>>");
		  }
		  
				  
	}

}
