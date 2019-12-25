package com.example.guava;

import com.google.common.collect.Lists;
import com.google.common.reflect.TypeToken;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DemoTypeToken {

    // Java 运行时范型类型擦除问题。
    // 前两个输出都是java.util.ArrayList，而第三个输出竟然是true，也就是认为stringArrayList和integerArrayList的类型是一样的。
    // 这就是所谓的泛型类型擦除。运行时我们不知道泛型类型的类型参数是什么了。
    private void javaRuntimeGenericTypeRemoveProblem() {
        List<String> stringArrayList = Lists.newArrayList();
        List<Integer> integerArrayList = Lists.newArrayList();
        System.out.println("type of stringArrayList: " + stringArrayList.getClass()); // class java.util.ArrayList
        System.out.println("type of integerArrayList: " + integerArrayList.getClass()); // class java.util.ArrayList
        System.out.println(stringArrayList.getClass().isAssignableFrom(integerArrayList.getClass())); // true
    }

    // TypeToken 可以解决Java运行时类型擦除问题
    private void solveJavaRuntimeGenericTypeRemoveProblem() {
        TypeToken<ArrayList<String>> typeToken = new TypeToken<ArrayList<String>>() {}; // 使用空的匿名类
        TypeToken<?> genericTypeToken = typeToken.resolveType(ArrayList.class.getTypeParameters()[0]); // resolveType方法解析出范型
        System.out.println(genericTypeToken.getType()); // class java.lang.String
    }

    private void solveJavaRuntimeGenericTypeRemoveProblem2() {
        TypeToken<List<String>> stringListToken = new TypeToken<List<String>>() {};
        TypeToken<List<Integer>> integerListToken = new TypeToken<List<Integer>>() {};
        TypeToken<List<? extends Number>> numberListToken = new TypeToken<List<? extends Number>>() {};
        System.out.println(stringListToken.isSubtypeOf(integerListToken)); // false
        System.out.println(numberListToken.isSubtypeOf(integerListToken)); // false
        System.out.println(integerListToken.isSubtypeOf(numberListToken)); // true
    }

    public static void main(String[] args) {
        DemoTypeToken demoTypeToken = new DemoTypeToken();
        demoTypeToken.javaRuntimeGenericTypeRemoveProblem();
        demoTypeToken.solveJavaRuntimeGenericTypeRemoveProblem();
        demoTypeToken.solveJavaRuntimeGenericTypeRemoveProblem2();
        demoTypeToken.callGenericFunction();
        demoTypeToken.getGenericType();
    }

    private <T> void f(List<T> list, TypeToken<?> typeToken) {
        System.out.println("list.get(0).getClass(): " + list.get(0).getClass());
        System.out.println("list.getClass(): " + list.getClass());
        System.out.println("typeToken: " + typeToken);
        System.out.println(typeToken.resolveType(List.class.getTypeParameters()[0]).getType());
    }

    private void callGenericFunction() {
        List<String> strings = Arrays.asList("a", "b", "c");
        List<Integer> integers = Arrays.asList(1, 2, 3);
        f(strings, new TypeToken<List<String>>() {});
        f(integers, new TypeToken<List<Integer>>() {});
    }

    abstract class ParametrizedClass<T> {
        TypeToken<T> type = new TypeToken<T>(getClass()) {};
    }

    private void getGenericType() {
        ParametrizedClass<String> parametrizedClass = new ParametrizedClass<String>() {};
        System.out.println(parametrizedClass.type); // java.lang.String
    }

}
