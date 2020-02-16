package com.interviewProgram;

import java.awt.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class ArrayTest {
	private int arr[] = {1,5,2,9,4,3};
	//Find the maximum value in Array without using Collection?
	public  void maxValue(){
		int a = arr[0];
		for(int i=1;i<arr.length;i++){
			if(arr[i]>a){
				a=arr[i];
			}
		}
		System.out.println("maximum value : "+a);
	}
	
	//Find the maximum value in Array using Collection?
	public void maxElement(){
		ArrayList<Integer> list = new ArrayList<>();
		for(int a:arr){
			list.add(a);
		}
		System.out.println(Collections.max(list));
		
	}

	public static void main(String[] args) {
		ArrayTest obj = new ArrayTest();
		obj.maxValue();
		obj.maxElement();

	}

}
