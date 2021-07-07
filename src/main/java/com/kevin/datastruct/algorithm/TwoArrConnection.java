package com.kevin.datastruct.algorithm;

import java.lang.reflect.Array;
import java.util.*;

/**
 * @author chenligeng 两个数组相交的数字
 */
public class TwoArrConnection {

    public int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        List<Integer> list3 = new ArrayList<>();
        for (int i : nums1) {
            list1.add(i);
        }
        for (Integer i : nums2) {
            list2.add(i);
        }
        for (Integer i : list2) {
            if (list1.contains(i)){
                list3.add(i);
                list1.remove(i);
            }
        }
        int[] arr = new int[list3.size()];
        for (int i = 0; i < list3.size(); i++) {
            arr[i] = list3.get(i);
        }
        return arr;
    }
}
