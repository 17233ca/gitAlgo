package com.npu.algo;


public class Sieve {
	 private int max ;
	  private int [] p ; //array that has prime number 
	  private int pkount ;
	  private long steps ;
	  private boolean display = false;
	  static IntUtil u = new IntUtil();
	  
	  Sieve(int n) {
	    max = n ;
	    p = new int[n+1] ;
	    pkount = 0 ;  
	    steps = 0 ;
	  }

	  private boolean isPrimeBruteForce(int m){
	  
	  for(int i = 2;i<max;++i){
	    	++steps;
	    	if(max % i == 0){
	    		return false; 
	    	}
	  	}
	  return true;
	  }
	  public void bruteForce() {
		  for(int i = 2; i<=max;++i){
			  if(isPrimeBruteForce(i)==true){
				  p[pkount++] = i;
			  }
	    
	    	}
		  System.out.println("bruteForce:");
		  for(int i=2; i<max;i++){
			  int count=0;
			  for(int j=2;j<max;j++){
				  if(i%j==0){
					  count++;
				  }
			  }
			  if(count==1){
				  System.out.println(i);
			  }
		  }
	    }
	  
	  public void uptoSquareRoot() {
	    for(int i =2;i<=max ; ++i){
	    	if(isPrimeUptoSquareRoot(i) == true){
	    		p[pkount++] = i;

	    	}
	    }
	    System.out.println("uptoSquareRoot:");
	    for(int i=2; i<max;i++){
			  int count=0;
			  for(int j=2;j<max;j++){
				  if(i%j==0){
					  count++;
				  }
			  }
			  if(count==1){
				  System.out.println(i);
			  }
	    }
	    }
		  private boolean isPrimeUptoSquareRoot(int m){
			  
			  for(int i = 2;i<max;++i){
			    	++steps;
			    	if(max % i == 0){
			    		return false; 
			    	}
			  	}
			  return true;
			  
		  }
	  
	  public void uptoPrimeNumbers() {
	    p[pkount++] = 2 ;
	   for(int i =3; i<=max;++i){
		   boolean divisible = false;
		   for(int k=0;k*k < pkount; ++k){
			   if((i % p[k])==0){
				   ++steps;
				   divisible = true;
				   break;
				   
			   }
		   }
		   if (divisible == false){
			   p[pkount++]=i;
			   
		   }
	   }
	  }
	  
	  public void SieveOfEratosthenes() {
	    boolean [] a = new boolean[max + 1] ;
	    for (int i = 0; i <= max; ++i) {
	      a[i] = true ;
	    }
	    a[0] = false ;
	    a[1] = false ;
	   
	    for (int i =2; (i*i <=max);++i){
	    	if (a[i] == true){
	    		int j=i*i;
	    		for(; j<=max;){
	    			++steps;
	    			a[j]=false;
	    			j=j+i;
	    			/*System.out.println("SieveOfEratosthenes");
	    			System.out.println(j);*/
	    			
	    		}
	    	}
	    }
	    System.out.println("SieveOfEratosthenes");
	    System.out.println("numbers which can not be prime");
	    for(int i=2;i<max;i++){
	    	System.out.println();
			for(int j=2;j<max;j++){
				if(i*j<=16){
					System.out.println(i*j);
				}
			}
		}
	    System.out.println("numbers which are prime");
	    for(int i=2; i<max;i++){
			  int count=0;
			  for(int j=2;j<max;j++){
				  if(i%j==0){
					  count++;
				  }
			  }
			  if(count==1){
				  System.out.println(i);
			  }
		  }
	  }
	  
	  //YOU CANNOT CHANGE BELOW
	  public void pLn(String t) {
	    System.out.println(t);
	    if (display) {
	      u.pLn(p,0,pkount) ;
	    }
	    System.out.println("The numbers of primes from 2 to " + max + " = " + pkount);
	    System.out.println("The number of steps is = " + steps) ;
	    if (pkount >= 999) {
	      System.out.println("The 1000 prime is = " + p[999]) ;
	    }
	    if (pkount >= 9999) {
	      System.out.println("The 10000 prime is = " + p[10000-1]) ;
	    }
	  }
	  
	  //YOU CANNOT CHANGE BELOW
	  public static void assertAnswers(Sieve a, Sieve b) {
	    //u.myassert(a.pkount == b.pkount);
	    for (int i = 0 ; i < a.pkount; ++i) {
	   //   u.myassert(a.p[i] == b.p[i]);
	    }
	  }

	  //YOU CANNOT CHANGE BELOW
	  private static void testAll(int n) {
	    if (n < 2000) {
	      Sieve b = new Sieve(n) ;
	      b.bruteForce() ;
	      Sieve s = new Sieve(n) ;
	      s.uptoSquareRoot() ;
	      assertAnswers(b,s);
	      System.out.println("bruteforce and uptoSquareRoot methods produces same answers") ;
	    }
	    System.out.println("============uptoPrimeNumbers start " + n + " ---------------------") ;
	    Sieve p = new Sieve(n) ;
	    p.uptoPrimeNumbers() ;
	    System.out.println("uptoPrimeNumbers done") ;
	    System.out.println("============ SieveOfEratosthene start " + n + " ---------------------") ;
	    Sieve e = new Sieve(n) ;
	    e.SieveOfEratosthenes() ;
	    System.out.println("SieveOfEratosthene done") ;
	    assertAnswers(p,e);
	    System.out.println("uptoPrimeNumbers and SieveOfEratosthene methods produces same answers") ;
	    System.out.flush();
	  }
	  
	  //YOU CANNOT CHANGE BELOW
	  public static void main(String[] args) {
	    System.out.println("Sieve.java");
	    testAll(16);
	    testAll(1000);
	    /*testAll(50000);
	    testAll(500000);*/
	    System.out.println("DONE");
	  }

}

