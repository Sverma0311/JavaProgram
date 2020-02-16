package com.interviewProgram;

public class NumberTest {
	
	//Armstrong number?
	public static void armstrongNo(int a){
	    int n=1;
		int r=0;
		while(a>0){
			 n=a%10;
			 a=a/10;
			r=r+(n*n*n);
		}
		if(r==a){
			System.out.println("no. is armstrong");
		}
		else{
			System.out.println("no. is not armstrog");
		}
					
	}
	//Factorial ?
	public static void factorial(int a){
		int r=1;
		for(int i=1;i<=a;i++){
			r=i*r;
		}
		System.out.println("factorial of "+a+" is "+r);
	}
	
	//Square root of number in java?
	public static void squareRoot(int a){
		double r=Math.sqrt(a);
		
		System.out.println(r);
	}

	public static void main(String[] args) {
		//NumberTest.armstrongNo(514);
		//NumberTest.factorial(4);
		NumberTest.squareRoot(16);

	}

}
