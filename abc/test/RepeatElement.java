package com.abc.test;

public class RepeatElement {

	 void printRepeating(int arr[], int size) 
	    {
		 
		 	int count[] = new int[size];
		 	int i;
		 	for(i = 0; i < size; i++) {
		 		if(count[arr[i]] == 1) {
		 			System.out.println(arr[i] + " ");
		 		} else {
		 			count[arr[i]]++;
		 		}
		 	}
	    }
	 
	    public static void main(String[] args)
	    {
	        RepeatElement repeat = new RepeatElement();
	        int arr[] = {4, 2, 4, 5, 2, 3, 1, 5};
	        int arr_size = arr.length;
	        repeat.printRepeating(arr, arr_size);
	    }

}
