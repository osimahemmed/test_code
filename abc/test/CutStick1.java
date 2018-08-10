package com.abc.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class CutStick1 {

	public static void main(String[] args) {
	    //List<Integer> sticks = readSticksFromStdin();
		List<Integer> sticks = new ArrayList<>();
		sticks.add(5);
		sticks.add(4);
		sticks.add(4);
		sticks.add(2);
		sticks.add(2);
		sticks.add(8);
	    Collections.sort(sticks);

	    int pos = 0;
	    int remaining = sticks.size();
	    while (0 < remaining) {
	        System.out.println(" osim "+remaining);
	        int count = countEqualFrom(sticks, pos);
	        pos += count;
	        remaining -= count;
	    }
	}

	private static int countEqualFrom(List<Integer> sticks, int from) {
	    int value = sticks.get(from);
	    for (int i = 1; from + i < sticks.size(); ++i) {
	        if (value != sticks.get(from + i)) {
	            return i;
	        }
	    }
	    return sticks.size() - from;
	}

	private static List<Integer> readSticksFromStdin() {
	    Scanner scanner = new Scanner(System.in);
	    int num = scanner.nextInt();
	    List<Integer> sticks = new ArrayList<>(num);
	    for (int i = 0; i < num; ++i) {
	        sticks.add(scanner.nextInt());
	    }
	    return sticks;
	}

}
