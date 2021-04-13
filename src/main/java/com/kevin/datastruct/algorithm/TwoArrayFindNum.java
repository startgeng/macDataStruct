package com.kevin.datastruct.algorithm;

/**
 * 在二维数组中寻找值
 * @author 陈立庚
 */
public class TwoArrayFindNum {

    /**
     * 在二维数组中寻找一个值 这块考虑的是二维数组 所以我们这里考虑使用边界值
     * @param matrix 二维数组
     * @param target 目标数
     * @return true 代码有 false 代表没有
     */
    public boolean findNumberIn2DArray(int[][] matrix, int target) {
        if (matrix == null || matrix.length==0){
            return false;
        }
        int x = 0;
        int y = matrix.length - 1;
        //考虑到这里的x 不能为负数
        while (x < matrix[0].length && y >= 0){
            if (matrix[y][x] > target){
                y--;
            }else if (matrix[y][x] < target){
                x++;
            }else {
                return true;
            }
        }
        return false;
    }
}
