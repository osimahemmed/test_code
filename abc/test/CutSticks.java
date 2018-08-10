package com.abc.test;

import java.util.Scanner;

public class CutSticks {

	private static int findMin (int[] A)
    {
        int min = A[0];
        for (int i =0; i<A.length; i++)
        {
            if (A[i] < min && A[i] != 0 )
            {
                min = A[i];
            }
        }
        return min;
    }
    private static int countNonZeros (int[] A)
    {
        int zeros = 0;
        for (int i =0; i<A.length; i++)
        {
            if (A[i] == 0)
            {
                zeros++;
            }
        }
        int nonZeros = A.length - zeros;
        return nonZeros;
    }    
    public static void main(String[] args) {
/*        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] A = new int[n];
        for (int i=0; i<n; i++)
        {
            A[i] = scanner.nextInt();
        } */  
    	int [] A = {2,4,5,7,8};  
        int nums = countNonZeros(A);
        while (nums > 0)
        {
            int mins = findMin(A);
            for (int j = 0; j<A.length; j++)
            {
                A[j]=A[j]-mins;
            }
            nums = countNonZeros(A);
            System.out.println("osim " +nums);
        }
    }

}
