package com.abc.test;

import java.util.Arrays;

public class RemoveDuplicateFromArray {

	public static void main(String[] args) {
		//int[] input = new int[]{10, 10, 1, 1, 3, 7, 7, 8, 9, 9, 9};
		int[] input = new int[]{1,2,1,4,4,3};
		removeDuplicates(input);
		
		for(int i : input) {
			System.out.println(i);
		}

	}
	
	public static int[] removeDuplicates(int[] numbersWithDuplicates) {

        // Sorting array to bring duplicates together      
        Arrays.sort(numbersWithDuplicates);     
      
        int[] result = new int[numbersWithDuplicates.length];
        int previous = numbersWithDuplicates[0];
        result[0] = previous;

        for (int i = 1; i < numbersWithDuplicates.length; i++) {
            int ch = numbersWithDuplicates[i];

            if (previous != ch) {
                result[i] = ch;
            }
            previous = ch;
        }
        return result;

    }
}
