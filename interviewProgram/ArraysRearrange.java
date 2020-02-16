package com.interviewProgram;

import java.util.Arrays;

public class ArraysRearrange {
	
	int arr[]={6,5,4,3,2,1};
	
	public void sortArray(){
		Arrays.sort(arr);
		int n = arr.length;
		int arr1[] = new int[n];
		int index =0;
		for(int i=0,j=n-1;i<n/2||j>n/2;i++, j--){
			if(index<n){
				arr1[index]=arr[i];
				index++;
			}
			if(index<n){
				arr1[index]= arr[j];
				index++;
			}
		}
		
		for(int a:arr1){
			System.out.println(a);
		}
	}

	public static void main(String[] args) {
		ArraysRearrange obj = new ArraysRearrange();
		obj.sortArray();
		

	}

}
