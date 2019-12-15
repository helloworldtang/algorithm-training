package com.hymxys.leetcode.bo;

import lombok.Data;

/**
 * @author: cheng.tang
 * @date: 2019/12/15
 * @see
 * @since
 */
@Data
public class ListNodeBO {
    Integer val;
    ListNodeBO next;

    ListNodeBO(Integer x) {
        val = x;
    }
}
