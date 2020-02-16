package com.interviewProgram;

public class NumberCheck {
	
	public void primeNo(int n){
		
		for(int i=2; i<=Math.sqrt(n);i++){
			if(n%i==0){
				System.out.println(n+" is not a prime no. ");
				return;
			}
		}
		System.out.println(n+" is a prime no.");
	}

	public static void main(String[] args) {
		NumberCheck obj = new NumberCheck();
		obj.primeNo(7);
		
	}

}
