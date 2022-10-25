package com.bridgelab.LineComparison;

import java.util.Scanner;

public class UC2_EqualityOfTwoLine {

public static void main(String arg[]){
	
             	 int x1,x2,y1,y2,x3,x4,y3,y4;
 
	         double lenght1,lenght2;
	
	         Scanner sc=new Scanner(System.in);
	         //for first line
	         System.out.println("enter x1 point");
	   
                 x1=sc.nextInt();
	    
                 System.out.println("enter y1 point");
	   
                 y1=sc.nextInt();
 
	         System.out.println("enter x2point");
	   
                 x2=sc.nextInt();
 
	         System.out.println("enter y2 point");
	   
                 y2=sc.nextInt();
	  	    
		 lenght1=Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1));
 	 	    	 	   
  	         System.out.println("Lenght of line = " +lenght1);
  	         // for Second line
  	       System.out.println("enter x3 point");
  		   
           x3=sc.nextInt();
  
           System.out.println("enter y3 point");
 
           y3=sc.nextInt();

       System.out.println("enter x4 point");
 
           x4=sc.nextInt();

       System.out.println("enter yy4 point");
 
           y4=sc.nextInt();
	    
	 lenght2=Math.sqrt((x4-x3)*(x4-x3) + (y4-y3)*(y4-y3));
	    	 	   
         System.out.println("Lenght of line = " +lenght2);
         	String str1=String.valueOf(lenght1);
 			String str2=String.valueOf(lenght2);
        if (str1.equals(str2)) {
        	System.out.println("Two Lines are of equal lenght");
        }
        else {
        	System.out.println("Two Lines are of not equal lenght");
        }
	}

}
