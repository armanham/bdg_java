package com.bdg.h15.collections.hashmap.consecutive_subsequence;

import java.util.HashMap;

public class ConsecutiveSubsequence {

    public static void of(int[] arr) {
        HashMap<Integer, Boolean> map = new HashMap<>();

        for (int val : arr) {
            map.put(val, true);
        }
        for (int val : arr) {
            if (map.containsKey(val - 1)) {
                map.put(val, false);
            }
        }
        int mh = 0;
        int mval = 0;
        for (int val : arr) {
            if (map.get(val).equals(true)) {
                int lh = 1;
                int lval = val;
                while (map.containsKey(lval + lh)) {
                    lh++;
                }
                if (lh > mh) {
                    mh = lh;
                    mval = val;
                }
            }
        }
        for (int i = 0; i < mh; i++) {
            System.out.println(mval + i);
        }
    }
}