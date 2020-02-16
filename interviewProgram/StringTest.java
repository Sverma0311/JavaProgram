package com.interviewProgram;

public class StringTest {

//How to reverse a string in java?
	public  String reverseString(String s){
		String str="";
		for(int i=s.length()-1;i>=0;i--){
			str=str+s.charAt(i);
			
		}
		System.out.println(str);
		return str;
	}
	//How to check if two Strings are anagrams of each other?
	public void checkAnagram(String s1, String s2){
		if(s1.length()==s2.length()){
			for(int i=0;i<s1.length();i++){
				if(!s2.contains(s1.charAt(i)+"")){
					System.out.println("not anagram");
					return;
					
				}
			}
			        System.out.println("Anagram");
			        return;
		}
		    System.out.println("not anagram");
	}
	//Find out if String has all Unique Characters?
	public void checkUniqueChar(String s){
		for(int i=0;i<s.length()-1;i++){
			for(int j=i+1;j<s.length();j++){
				if(s.charAt(i)!=s.charAt(j)){
					continue;
				}
				else{
					System.out.println("not unique");
					return;
				
				}
			}
		}
		System.out.println("unique");
	}
	
	//How to Count number of words in the String?
	public void countWords(String s){
		String [] arr =s.split(" ");
		System.out.println("no. of words : "+arr.length);
		
		//How to remove all the white-spaces in the String?
		System.out.println(s.replaceAll(" ", ""));
	}
	
	public void palindrome(String s){
		int l=s.length()-1;
		for(int i=0;i<s.length()/2;i++){
			if(s.charAt(i)!=s.charAt(l-i)){
				System.out.println("not palindrome");
				return;
			}
			
		}
		System.out.println("palindrome");
	}
	
	public void lowerCase(String s){
		String str="";
		for(int i=0;i<s.length();i++){
			str = str+(char)(s.charAt(i)+32);
		}
		System.out.println(str);
		
	}
	
	

	public static void main(String[] args) {
	     StringTest obj = new StringTest();
	     
	    // obj.reverseString("swati verma");
	    // obj.checkAnagram("java", "avaja");
	    // obj.checkUniqueChar("swati");
	    // obj.countWords("life is more beautiful if you learn how to live alone");
	     obj.palindrome("asdrdsa");
	     obj.lowerCase("SWATI");
	     
		}
	
	

}
