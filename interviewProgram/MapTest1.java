package com.interviewProgram;

import java.util.*;

public class MapTest1 {
	 // How to find the first non repeated character in the String?
	public static void firstNonRepeatedChar(String str){
		Map<Character,Integer> map = new LinkedHashMap<>();
		 int k=0;
		for(int i=0;i<str.length();i++){
			char c = str.charAt(i);
			if(map.containsKey(c)){
				k=map.get(c)+1;
				map.put(c, k);
			}
			else{
				map.put(c, 1);
			}
		}
		System.out.println(map);
		for(char a: map.keySet()){
			if(map.get(a)==1){
				System.out.println(a);
				return ;
			}
		}
		
		
	}

	public static void main(String[] args) {
		MapTest1.firstNonRepeatedChar("javajdf");
	}

}
