package com.hymxys.leetcode.problems;

import java.util.List;

/**
 * @author: cheng.tang
 * @date: 2020/5/15
 * @see
 * @since
 */
public class SortSolution {


    public void bubbleSortSolution(List<Integer> listNeedingToSort, boolean asc) {
        if (listNeedingToSort == null || listNeedingToSort.isEmpty()) {
            return;
        }

        int totalSize = listNeedingToSort.size();
        for (int sortedElementNum = 0; sortedElementNum < totalSize; sortedElementNum++) {
            /**
             * totalSize - sortedElementNum - 1
             * 因为最后一个元素，没有下一个可以比。如果不执行 -1 操作，则数据越界
             */
            int notSortedElementNum = totalSize - sortedElementNum - 1;
            for (int i = 0; i < notSortedElementNum; i++) {
                Integer before = listNeedingToSort.get(i);
                Integer after = listNeedingToSort.get(i + 1);

                if (before > after) {
                    if (asc) {
                        /**
                         * before大。
                         * 升序，大的要往后放
                         */
                        listNeedingToSort.set(i, after);
                        listNeedingToSort.set(i + 1, before);
                    }
                } else {
                    if (asc) {
                        continue;
                    }
                    /**
                     * after大。
                     * 降序，大的要往前放
                     */
                    listNeedingToSort.set(i, after);
                    listNeedingToSort.set(i + 1, before);
                }
            }
        }

    }


}
