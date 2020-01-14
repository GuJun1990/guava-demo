package com.example.guava.stringutil;

import com.google.common.base.Splitter;
import com.google.common.collect.Lists;

import java.util.List;

/**
 * @author gujun@qiyi.com
 * @since 2020/1/14 6:14 下午
 */
public class DemoSplitter {

    public static void main(String[] args) {
        String string = "1,\n2,  3, 4,    5";
        System.out.println(string);
        System.out.println(Lists.newArrayList(string.split(","))); // 不会处理控制字符串
        List<String> result = Splitter
                .on(",") // 分隔符，支持字符、字符串和正则表达式
                .trimResults() // 移除字符串前后空格
                .omitEmptyStrings() // 忽略空字符串
                .splitToList(string);
        System.out.println(result); // 处理控制字符串。
    }
}
