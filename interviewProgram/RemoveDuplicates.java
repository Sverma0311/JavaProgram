package com.interviewProgram;

import java.util.*;

//How to remove all duplicates from a given string?
public class RemoveDuplicates {
	
	 private String s ="java";
	public void remove(){
		Set<Character> set = new HashSet<>();
		for(int i=0;i<s.length();i++){
			set.add(s.charAt(i));
		}
		for(char c: set){
			System.out.println(c);
		}
	}
	
	//How to print the duplicate characters from the given String? 
	
	public void printDuplicate(String s1){
		System.out.println("print the duplicate characters from the given String");
		for(int i=0;i<s1.length();i++){
			if(s.contains(s1.charAt(i)+"")){
				System.out.println(s1.charAt(i));
				
			}
		}
	}
	
	// How to remove characters from the first String which are present in the second String?
	
	public void removeChar(String s1){
		System.out.println("remove characters from the first String which are present in the second String");
		for(int i=0;i<s.length();i++){
			if(!s1.contains(s.charAt(i)+"")){
				System.out.println(s.charAt(i));
				
			}
		}
		
	}
	
	//How to check if two strings are rotations of each other?
	
	public boolean rotation(String s1){
		
		if(s.length()!= s1.length())
			return false;
		
		String concat = s+s;
		return (concat.contains(s1));
			
		
		
	}

	public static void main(String[] args) {
		RemoveDuplicates obj = new RemoveDuplicates();
		obj.remove();
		obj.printDuplicate("javaascript");
		obj.removeChar("av");
		System.out.println(obj.rotation("aaaj"));
	}

}
