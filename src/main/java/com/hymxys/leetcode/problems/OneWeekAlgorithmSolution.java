package com.hymxys.leetcode.problems;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: cheng.tang
 * @date: 2019/12/12
 * @see
 * @since
 */
public class OneWeekAlgorithmSolution {


    public int removeDuplicatesFromSortedArray(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        List<Integer> resultList = new ArrayList<Integer>();
        int firstValue = nums[0];
        resultList.add(firstValue);
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == firstValue) {
                continue;
            }
            firstValue = nums[i];
            resultList.add(firstValue);
        }
        return resultList.size();
    }


}
