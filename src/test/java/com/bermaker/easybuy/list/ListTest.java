package com.bermaker.easybuy.list;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * @Title: ListTest
 * @Project: easy-buy
 * @Description: TODO
 * @Author: yuzhongchun
 * @Date: 2018/11/30 7:28 PM
 * @Version: 1.0
 */
public class ListTest {

    @Test
    public void testArrayList() {
        List<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.forEach(num -> {
            System.out.println(num);
        });
    }

}
