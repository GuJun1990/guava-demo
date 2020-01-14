package com.example.guava.stringutil;

import com.google.common.base.Splitter;
import com.google.common.collect.Lists;

/**
 * @author gujun@qiyi.com
 * @since 2020/1/14 6:14 下午
 */
public class DemoSplitter {

    public static void main(String[] args) {
        String string = "1,\n2,  3, 4,    5";
        System.out.println(string);
        System.out.println(Lists.newArrayList(string.split(","))); // 不会处理控制字符串
        System.out.println(Splitter.on(",").trimResults().omitEmptyStrings().split(string)); // 处理控制字符串。
    }
}
