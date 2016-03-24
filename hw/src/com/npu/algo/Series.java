package com.npu.algo;

import java.math.BigInteger;
import java.util.Objects;

/**
 * File Name: Series.java 
 * 
 * @author Jagadeesh Vasudevamurthy
 * @year 2015
 */

class Series {

private static void testLog() {
    
    final double e = 2.718281;
    
//for log base 2
    System.out.println("for n=1 to n=10");
    System.out.println("n"+"  "+"base10"+"  "+"base2"+"   "+"basee");
    for(int i=1; i<=10; i++){
    	
    	System.out.print(i+" "+String.format("%.5f", (Math.log(i)/Math.log(10))));
    	System.out.print(" "+String.format("%.5f", (Math.log(i)/Math.log(2))));
    	System.out.println(" "+String.format("%.5f", (Math.log(i)/Math.log(e))));
    	//double a = (double)(Math.log(i)/Math.log(2));
    }
    
  //for log base 2
    System.out.println();
    System.out.println("for n=10 to n=100");
    System.out.println("n"+"  "+"base10"+"  "+"base2"+"   "+"basee");
    for(int i=10; i<=100; i = i+10){
    	
    	System.out.print(i+" "+String.format("%.5f", (Math.log(i)/Math.log(10))));
    	System.out.print(" "+String.format("%.5f", (Math.log(i)/Math.log(2))));
    	System.out.println(" "+String.format("%.5f", (Math.log(i)/Math.log(e))));
    	//double a = (double)(Math.log(i)/Math.log(2));
    }
    
  //for log base 2
    System.out.println();
    System.out.println("for n=100 to n=1000");
    System.out.println("n"+"  "+"base10"+"  "+"base2"+"   "+"basee");
    for(int i=100; i<=1000; i = i+100){
    	
    	System.out.print(i+" "+String.format("%.5f", (Math.log(i)/Math.log(10))));
    	System.out.print(" "+String.format("%.5f", (Math.log(i)/Math.log(2))));
    	System.out.println(" "+String.format("%.5f", (Math.log(i)/Math.log(e))));
    	//double a = (double)(Math.log(i)/Math.log(2));
    }
    
  //for log base 2
    System.out.println();
    System.out.println("for n=1000 to n=10000");
    System.out.println("n"+"  "+"base10"+"  "+"base2"+"   "+"basee");
    for(int i=1000; i<=10000; i = i+1000){
    	
    	System.out.print(i+" "+String.format("%.5f", (Math.log(i)/Math.log(10))));
    	System.out.print(" "+String.format("%.5f", (Math.log(i)/Math.log(2))));
    	System.out.println(" "+String.format("%.5f", (Math.log(i)/Math.log(e))));
    	//System.out.println();
    	//double a = (double)(Math.log(i)/Math.log(2));
    }
  }
  
  /*
   * 1 + 1/2 + 1/4 + 1/8 + 1/16 +... + = 2
   */
  private static void seriesConvergesAbsolutely() { 

	  System.out.println();
	  double sum = 0;
	  double temp;
	  System.out.print("1 + ");
	  for(int i=1; i<=100; i++){
		  System.out.print("1/"+(int)Math.pow(2, i)+" + ");
		  temp = 1/Math.pow(2, i);
		  sum = sum + temp;
		  
		  
	  }
	  System.out.println("");
	  System.out.println((int)sum+1);
	  System.out.println();
  }
  
  /*
   * 1 + 1/2 + 1/3 + 1/4 + 1/5 + .. = 
   */
  private static void harmonicSeries() {
	  
	  double sum =0;
	  System.out.print("1 + ");
	  for(int i=1; i<=100; i++){
		  
		  int x = i+1;
		  System.out.print("1/"+x+" + ");
		  sum = sum + (double)1/x;
		  
		  
	  }
	  System.out.println("");
	  System.out.println(sum+1);
	  System.out.println("");
  }
  
  private static void chess() {
	BigInteger sum;
	BigInteger b1;
	BigInteger b2;
	long temp = 0;
	String flag;
	String flag2 = null;
    int m = 64 ;
    for(int i=0; i<m ; i++){
    	System.out.print("On square "+Math.addExact(i, 1)+"= ");
    	temp = (long)Math.pow(2, i);
    	System.out.println(temp);
    	flag = String.valueOf(temp);
    	b1 = new BigInteger(flag);
    	sum = b1.add(b1).add(BigInteger.ONE);
    	flag2 = sum.toString();
    	
    }
    
    System.out.println("Total rice = "+flag2);
    System.out.println("2^0 + 2^1 + 2^2+ 2^3+ ...+ 2^63 = (2^64 -1) = " + flag2) ;
  }
  
  private static void testbed() {
    //testLog();
    seriesConvergesAbsolutely();
    //harmonicSeries() ;
    //chess() ;
  }

  public static void main(String[] args) {
    System.out.println("Series.java");
    testbed();
    System.out.println("Done");
  }
}
