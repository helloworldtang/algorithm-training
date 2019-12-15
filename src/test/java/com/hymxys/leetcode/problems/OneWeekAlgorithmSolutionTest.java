package com.hymxys.leetcode.problems;


import com.alibaba.fastjson.JSON;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * @author: cheng.tang
 * @date: 2019/12/12
 * @see
 * @since
 */
public class OneWeekAlgorithmSolutionTest {

    @Test
    public void removeDuplicatesFromSortedArray_Case_1() {
        OneWeekAlgorithmSolution algorithmSolution = new OneWeekAlgorithmSolution();
        int[] nums = {1, 1, 2};
        int newNumLength = algorithmSolution.removeDuplicatesFromSortedArray(nums);
        assertThat(newNumLength).isEqualTo(2);
    }

    @Test
    public void removeDuplicatesFromSortedArray_Case_2() {
        OneWeekAlgorithmSolution algorithmSolution = new OneWeekAlgorithmSolution();
        int[] nums = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int newNumLength = algorithmSolution.removeDuplicatesFromSortedArray(nums);
        assertThat(newNumLength).isEqualTo(5);
    }


}