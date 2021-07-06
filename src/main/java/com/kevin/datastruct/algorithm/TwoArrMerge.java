package com.kevin.datastruct.algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @author chenligeng 两个数组合并
 */
public class TwoArrMerge {

//    public static void merge(int[] nums1, int m, int[] nums2, int n) {
//        List<Integer> list = new ArrayList();
//        for (int i : nums1) {
//            if (i != 0){
//                list.add(i);
//            }
//        }
//        for (int i : nums2) {
//            if (i != 0){
//                list.add(i);
//            }
//        }
//        Object[] array = list.toArray();
//        Arrays.sort(array);
//        System.out.println(array.toString());
//        nums1 = new int[m+n];
//        nums2 = new int[m+n];
//        for (int i = 0; i < array.length; i++) {
//            nums2[i] = (int) array[i];
//        }
//        for (int i = 0; i < array.length; i++) {
//            nums1[i] = (int) array[i];
//        }
//        System.out.println(1);
//    }
//
//    public static void main(String[] args) {
//        int[] nums1 = new int[]{1,2,3,0,0,0};
//        int m = 3;
//        int[] num2 = new int[]{2,5,6};
//        int n = 3;
//        merge(nums1,m,num2,n);
//    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8,9,0};
        int[] Arr=new int[11];
        System.arraycopy(arr,1,Arr,0,4);
        System.out.println(1);
    }
}
