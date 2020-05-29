package com.example.guava.preconditions;

import org.junit.Test;

import static com.google.common.base.Preconditions.checkArgument;
import static com.google.common.base.Preconditions.checkNotNull;

/**
 * @author gujun@qiyi.com
 * @since 2020/5/29 4:26 下午
 */
public class DemoPreconditions {

    @Test
    public void check_argument() {
        fun1(1);
        fun1(-1); // java.lang.IllegalArgumentException: Argument is -1, but expected non negative
    }

    @Test
    public void check_argument_2() {
        fun2(1, 2);
        fun2(2, 1); // java.lang.IllegalArgumentException: Expected i < j, but 2 >= 1
    }

    @Test
    public void check_not_null() {
        fun3(new Object()); // java.lang.NullPointerException
        fun3(null);
    }

    void fun1(int i) {
        checkArgument(i >= 0, "Argument is %s, but expected non negative", i);
    }

    void fun2(int i, int j) {
        checkArgument(i < j, "Expected i < j, but %s >= %s", i, j);
    }

    void fun3(Object obj) {
        checkNotNull(obj);
    }


}
