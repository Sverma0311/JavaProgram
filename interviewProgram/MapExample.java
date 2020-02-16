package com.interviewProgram;

import java.util.*;

public class MapExample {
	
	public void treeMap(){
		Map<String, Integer> tm = new TreeMap<>();
		tm.put("aaa", 3);
		tm.put("bbbb", 5);
		tm.put("cc", 2);
		tm.put("wwww", 50);
		
		for(Map.Entry m: tm.entrySet()){
			System.out.println(m.getKey()+" "+m.getValue());
		}
	}
	
	//sorting of hashmap by key
	
	public void sortHashMap(){
		Map<String,Integer> map = new HashMap<>();
		map.put("aaaaa", 4);
		map.put("rrr", 6);
		map.put("zzz", 5);
		System.out.println("before sorting");
		for(Map.Entry m: map.entrySet()){
			System.out.println(m.getKey()+" "+m.getValue());
		}
		
		Map<String, Integer>sortedMap = new TreeMap<>(map);
		System.out.println("after sorting");
		for(Map.Entry s: sortedMap.entrySet()){
			System.out.println(s.getKey()+" "+s.getValue());
		}
	}

	public static void main(String[] args) {
		MapExample obj = new MapExample();
		obj.treeMap();
		obj.sortHashMap();

	}

}
