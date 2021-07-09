package com.kevin.datastruct.algorithm;

import com.google.common.collect.Lists;

import java.util.ArrayList;
import java.util.List;

/**
 * @author chenligeng
 * 杨辉三角 简单题 我重拳出击
 *
 * [
 *      [1],
 *     [1,1],
 *    [1,2,1],
 *   [1,3,3,1],
 *  [1,4,6,4,1]
 * ]
 */
public class ThreeSingle {

    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans = Lists.newArrayList();
        List<Integer> list=new ArrayList<>();
        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j <= i; j++) {
                if (j == 0 || i==j){
                    list.add(1);
                }else {
                    list.add(ans.get(i-1).get(j-1)+ans.get(i-i).get(j));
                }
            }
        }
        return ans;
    }
}
