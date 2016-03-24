package com.npu.algo;

import java.util.Random;

/**
 * File Name: BarAttender.java 
 * Simulates Bar attender puzzle
 * 
 * @author Jagadeesh Vasudevamurthy
 * @year 2014
 */

class BarAttender{
  private int min; //Work in the range of min to max
  private int max;
  
  BarAttender(int min, int max){
    this.min = min ;
    this.max = max  ;
  }

  private int guess(int g, boolean show) {
	  
	  	int guessCounter = 0;  
		int l= min;				//1
		int r = max;
	  if(show==true){
		
		  System.out.println("");
			System.out.print("l:"+l+"\t");
			System.out.print("r:"+r+"\t");
			
			do{
				int mid = (l+r-1)/2;
				System.out.println("m="+mid);
				if(g<mid){				//4<5
					guessCounter++;
					r = mid-1;			//r=5
					System.out.print("l="+l+"\t");
					System.out.print("r="+r+"\t");
					
				}else if(g>mid){		//4>3
					guessCounter++;
					l = mid+1;
					System.out.print("l="+l+"\t");
					System.out.print("r="+r+"\t");
					
				}
				else{
					guessCounter++;
					break;
				}
				//break;
			}while(l!=r);
			return guessCounter;
		  }

	  else{
			do{
				int mid = (l+r-1)/2;
				
				if(g<mid){				//4<5
					guessCounter++;
					r = mid-1;			//r=5
					
				}else if(g>mid){		//4>3
					guessCounter++;
					l = mid+1;
				}
				else{
					break;
				}
				//break;
			}while(l!=r);
			return guessCounter;
	  }
	 }
	  
  // Cannot change code below
  private static void test(int s, int b, int m, boolean useRandom,boolean show) {
    Random r = new Random() ;
    int min = 9999 ;
    int max = 0 ; 
    BarAttender h = new BarAttender(s,b);
    for (int i = 0; i < m; ++i) {
      int v = i + s ;
      if (useRandom) {
        v = RandomInt.getRandomInt(r,s,b); //This gives number between 1 to 1000000-1
      }
      int n = h.guess(v,show) ;
      if (n > max) {
        max = n;
      }
      if (n < min) {
        min = n ;
      }
    } 
    System.out.print("For numbers  between " + s + " to " +  b +  " ");
    if (useRandom) {
       System.out.print("(random numbers)") ;
    }else {
      System.out.print("(not random numbers)") ;
    }
    System.out.println(" the min guess is " + min + " max guess is " + max) ;
  }

  // Cannot change code below
  private static void testBench() { 
    test(1,10,10,false,true) ;
    test(1,1000000,1000,false,false);
    test(1,1000000,1000,true,false);
  }

  // Cannot change code below
  public static void main(String[] args) {
    System.out.println("BarAttender.java");
    testBench();
    System.out.println("DONE");
  }
}
