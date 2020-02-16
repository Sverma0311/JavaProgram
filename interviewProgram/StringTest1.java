package com.interviewProgram;

import java.util.*;

public class StringTest1 {
	// How to calculate total number of characters in the String?
	public void countChar(String s){
		int c=0;
		for(int i=0;i<s.length();i++){
			if(s.charAt(i)!=' '){
				c++;
			}
		}
		System.out.println(c);
	}
	
	//How to Convert Signed Integer to String?
	
	public void intToString(int a){
		String s = String.valueOf(a);
		System.out.println(s);
	}
	
	//How to calculate total number of vowels in String?
	public void countVowel(String s){
		int count=0;
		for(int i=0;i<s.length();i++){
			char c=s.charAt(i);
			if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U'){
				count++;
			}
		}
		System.out.println(count);
	}
	
	//Convert Uppercase to Lowercase in java without using built in method?
	public void upperCaseToLower(String s){
		String temp="";
		for(int i=0;i<s.length();i++){
			if(s.charAt(i)>='A'&& s.charAt(i)<'Z'){
				temp = temp+(char)(s.charAt(i)+32);
			}
			else{
				temp = temp+s.charAt(i);
			}
		}
		System.out.println(temp);
	}
	
	public void StringSort(String s){
		
		char arr[] = s.toLowerCase().toCharArray();
		Arrays.sort(arr);
		
		System.out.println(arr);
		String s1 = String.valueOf(arr);
		System.out.println(s1);
		
	}
	
	public static void main(String[] args) {
	
		StringTest1 obj = new StringTest1();
		obj.countChar("life is ");
		obj.intToString(456);
		obj.countVowel("life is too hard");
		obj.upperCaseToLower("SWATi@");
		obj.StringSort("Helloasd");
	}

}
