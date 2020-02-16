package com.interviewProgram;

import java.util.*;

public class MapTest {
	private Map<String,Integer> map = new HashMap<>();
	public void insertElement(){
		map.put("Swati", 101);
		map.put("Sweta", 105);
		map.put("Ravi", 102);
		map.put("Anu", 106);
		map.put("Pari", 109);
		for(String s:map.keySet()){
			System.out.println("key : "+s+" value : "+map.get(s));
		}
	}
	
	//How to Print duplicate characters from String?
	public void printDuplicate(String s){
		HashMap<Character, Integer> chars = new HashMap<>();
		int k=0;
		for(int i=0;i<s.length();i++){
			if(chars.containsKey(s.charAt(i))){
				k=chars.get(s.charAt(i))+1;
				chars.put(s.charAt(i), k);
			}
			else{
				chars.put(s.charAt(i), 1);
			}
		}
		
		Set<Map.Entry<Character, Integer>> set =chars.entrySet();
		for(Map.Entry<Character, Integer> entry:set ){
			if(entry.getValue()>1){
				System.out.println(entry.getKey());
			}
		}
	}
	

	public static void main(String[] args) {
		MapTest m = new MapTest();
		m.insertElement();
		m.printDuplicate("javaavsda");
		

	}

}
