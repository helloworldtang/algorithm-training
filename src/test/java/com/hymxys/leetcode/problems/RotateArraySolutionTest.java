package com.hymxys.leetcode.problems;

import com.alibaba.fastjson.JSON;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * @author: cheng.tang
 * @date: 2019/12/14
 * @see
 * @since
 */
public class RotateArraySolutionTest {


    @Test
    public void rotateArray_Case_1() {
        int[] expected = {5, 6, 7, 1, 2, 3, 4};
        RotateArraySolution algorithmSolution = new RotateArraySolution();
        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;
        algorithmSolution.rotateArray(nums, k);
        System.out.println(JSON.toJSONString(nums));
        assertThat(nums).isEqualTo(expected);
    }

    @Test
    public void rotateArray_Case_2() {
        int[] expected = {3, 99, -1, -100};
        RotateArraySolution algorithmSolution = new RotateArraySolution();
        int[] nums = {-1, -100, 3, 99};
        int k = 2;
        algorithmSolution.rotateArray(nums, k);
        System.out.println(JSON.toJSONString(nums));
        assertThat(nums).isEqualTo(expected);
    }


}
