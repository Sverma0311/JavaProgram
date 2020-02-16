package com.interviewProgram;

import java.util.*;

public class ArrayListTest {
	private List<Integer> al = new ArrayList<>();
	
	//Given an element write a program to check if element(value) exists in ArrayList?
	public boolean isExists(int a){
		al.add(2);
		al.add(4);
		al.add(6);
		al.add(8);
		al.add(10);
		return al.contains(a);
	}
	//How to find intersection of two arrays in java?
	public void intersection(){
		int ar1[]={1,4,6,2,7};
		int ar2[]={3,5,2,1,6,7};
		int l=0;
		int k=0;
		ArrayList <Integer> ar = new ArrayList<>();
		
		for(int i=0;i<ar1.length;i++){
			for(int j=0;j<ar2.length;j++){
				if(ar1[i]==ar2[j]){
					ar.add(ar1[i]);				
					
				}
				
			}
		}
			for(int a:ar){
				System.out.print(a+" ");
			}
		}
	
	//Arraylist example
	public void arrayList(){
		List<Integer> list = new ArrayList<>();
		list.add(50);
		list.add(10);
		list.add(150);
		list.add(20);
		
		for(int a: list){
			System.out.println(a);
		}
		
		Set<Integer> set = new TreeSet<>(list);
		System.out.println(set);
		
		Collections.sort(list,Collections.reverseOrder());
		System.out.println(list);
		
		Collections.sort(list);
		System.out.println(list);
	}
	
	public void arrayToArrayList(){
		int arr[]={4,2,6,9};
		//ArrayList<Integer>list = new ArrayList<Integer>(Arrays.asList(arr));
		
	}
	

	public static void main(String[] args) {
		ArrayListTest obj = new ArrayListTest();
		//System.out.println(obj.isExists(5));
		obj.intersection();
		obj.arrayList();
		obj.arrayToArrayList();

	}

}
