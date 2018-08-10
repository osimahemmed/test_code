package com.abc.test;

public class PrintRepeatingElementsArr {

	public static void main(String[] args) {
		int[] orig = {1, 2, 3, 1, 3, 4, 5, 2};
		printRepeating(orig);
	}
	
	private static void printRepeating(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			if(arr[Math.abs(arr[i])] >= 0) {
				arr[Math.abs(arr[i])] = -arr[Math.abs(arr[i])];
			} else {
				System.out.println("Dups are : " + Math.abs(arr[i]));
			}
		}
	}

}
