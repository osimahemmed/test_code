package com.abc.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class CutSticks2 {

	public static List<Integer> askUserForStickLengths() {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        List<Integer> list = new ArrayList<>(size);

        for (int i = 0; i < size; ++i) {
            int length = scanner.nextInt();

            if (length < 0) {
                throw new IllegalArgumentException(
                        "Sticks of negative length are not allowed. Received " +
                        "a stick length " + length + ".");
            }

            list.add(length);
        }

        list.removeAll(Collections.<Integer>singleton(0));
        return list;
    }

    public static List<Integer> cutSticks(List<Integer> stickLengthList) {
        List<Integer> ret = new ArrayList<>(stickLengthList.size());

        // Sort the stick lengths into DESCENDING order.
       /* Collections.<Integer>sort(stickLengthList, 
                                  (a, b) -> { return b - a; });*/
        
        Collections.sort(stickLengthList, Collections.reverseOrder());
        while (!stickLengthList.isEmpty()) {
            int listSize = stickLengthList.size();
            int smallestStickLength = stickLengthList.get(listSize - 1);

            for (int i = 0; i < listSize; i++) {
                int currentStickLength = stickLengthList.get(i);
                stickLengthList.set(i, currentStickLength - smallestStickLength);
            }

            ret.add(listSize);
            removeZeros(stickLengthList);
            System.out.println(stickLengthList);
        }

        return ret;
    }

    // Assumes that the input list is in descending order. We start removing the
    // "zero sticks" from the end of the list. As soon as we get to a non-zero
    // entry, we can return as the invariant guarantees there is no other 
    // zero length sticks.
    private static void removeZeros(List<Integer> stickLengthList) {
        for (int i = stickLengthList.size() - 1; i >= 0; --i) {
            if (stickLengthList.get(i) == 0) {
                stickLengthList.remove(i);
            } else {
                return;
            }
        }
    }

    public static void main(String[] args) {
    	List<Integer> sticks = new ArrayList<>();
		sticks.add(5);
		sticks.add(4);
		sticks.add(4);
		sticks.add(2);
		sticks.add(2);
		sticks.add(8);
		 //System.out.println(cutSticks(sticks));
        //System.out.println(cutSticks(askUserForStickLengths()));
		cutSticks(sticks);
    }

}
