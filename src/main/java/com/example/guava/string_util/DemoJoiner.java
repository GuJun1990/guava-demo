package com.example.guava.string_util;

import com.google.common.base.Joiner;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author gujun@qiyi.com
 * @since 2020/1/14 7:35 下午
 */
public class DemoJoiner {

    // 合并数组
    void joinArray() {
        Object[] array = {"Tom", null, 12, new Date()};
        String result = Joiner
                .on(",") // 分隔符
                .useForNull("null") // 遇到null值使用何值，skipNulls跳过null值
                .join(array);
        System.out.println(result); // Tom,null,12,Tue Jan 14 19:38:51 CST 2020
    }

    // 合并Map
    void joinMap() {
        Map<Object, Object> map = new HashMap<Object, Object>();
        map.put("name", "Tom");
        map.put("age", 12);
        String result = Joiner
                .on("#") // 分隔符
                .withKeyValueSeparator("=") // 键值分隔符
                .join(map);
        System.out.println(result);
    }

    public static void main(String[] args) {
        DemoJoiner demo = new DemoJoiner();
        demo.joinArray();
        demo.joinMap();
    }

}
