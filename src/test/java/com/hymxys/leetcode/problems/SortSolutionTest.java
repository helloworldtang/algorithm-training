package com.hymxys.leetcode.problems;

import com.alibaba.fastjson.JSON;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;


/**
 * @author: cheng.tang
 * @date: 2020/5/19
 * @see
 * @since
 */
public class SortSolutionTest {

    @Test
    public void bubbleSortSolutionWhenAsc() {
        List<Integer> source = Arrays.asList(1, 9, 3, 22, 5);
        List<Integer> expected = Arrays.asList(1, 3, 5, 9, 22);
        assertThat(source).isNotEqualTo(expected);

        SortSolution sortSolution = new SortSolution();
        sortSolution.bubbleSortSolution(source, true);
        assertThat(source).isEqualTo(expected);
    }

    @Test
    public void bubbleSortSolutionWhenDesc() {
        List<Integer> source = Arrays.asList(1, 9, 3, 22, 5);
        List<Integer> expected = Arrays.asList(22, 9, 5, 3, 1);
        assertThat(source).isNotEqualTo(expected);

        SortSolution sortSolution = new SortSolution();
        sortSolution.bubbleSortSolution(source, false);
        assertThat(source).isEqualTo(expected);
    }

}