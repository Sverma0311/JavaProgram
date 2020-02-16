package com.interviewProgram;

import java.util.*;

public class SetExample {
	
	public void treeSet(){
		Set<String> ts = new TreeSet<>();
		ts.add("asd");
		ts.add("eds");
		ts.add("234");
		ts.add("hgf");
		ts.add("mnb");
		//ts.add(null); // java.lang.NullPointerException
		for(String a: ts){
			System.out.println(a);
		}
	}
	
	public void hashSet(){
		Set<Integer> hs = new HashSet<>();
		hs.add(2);
		hs.add(4);
		hs.add(50);
		hs.add(100);
		
		for(int a: hs){
			System.out.println(a);
		}
		List<Integer> list = new ArrayList<>(hs);
		System.out.println(list);
		
		Integer a[]= new Integer[hs.size()];
		hs.toArray(a);
		for(Integer i:a){
			System.out.println(i);
		}
	}

	public static void main(String[] args) {
		SetExample obj = new SetExample();
		obj.treeSet();
		obj.hashSet();
		

	}

}
