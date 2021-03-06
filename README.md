# guava-demo

[![Build Status](https://travis-ci.org/GuJun1990/guava-demo.svg?branch=master)](https://travis-ci.org/GuJun1990/guava-demo)

## Guava使用指南
Guava项目包含Google的几个核心库：集合，缓存，原语支持，并发库，通用注解，字符串处理，I/O操作等。这些工具每天都会被Google员工用于生产服务中。

本文尝试对于Guava常用的的功能作出可读且令人愉快的解释。

* 基本实用程序：使用Java语言更加愉快
    * [避免使用null](https://github.com/GuJun1990/guava-demo/tree/master/src/main/java/com/example/guava/optional)：`null`是模棱两可的，容易引起混乱的错误，有时甚至是很不愉快的。许多Guava实用程序拒绝`null`并快速失败，而不是盲目地接受它们。
    * [Preconditions](https://github.com/GuJun1990/guava-demo/tree/master/src/main/java/com/example/guava/preconditions)：前提条件，更轻松地测试方法的前提条件。
    * 常用的对象方法：简化实现`Object`方法，例如`hashCode()`和`toString()`。
    * Ordering：Guava功能强大的“流利比较器”类。
    * Throwable：简化传播和检查异常和错误。
* 集合：Guava对JDK集合生态系统的扩展。这些是Guava中最成熟，最受欢迎的部分
* 图：用于对图结构数据（即实体及其之间的关系）进行建模的库。主要功能包括：
* 缓存：本地缓存，操作正确，并且支持各种过期行为。
* 功能习惯用法：Guava的功能习惯用法很少使用，可以显着简化代码。
* 并发：功能强大，简单的抽象，使编写正确的并发代码更加容易
* 字符串：一些非常有用的字符串实用程序：拆分，连接，填充等。
* 原始体：JDK未提供对原始类型（如int和char）的操作，包括某些类型的无符号变体。
* 范围：Guava强大的API，用于处理可比较类型（连续和离散）上的范围。
* I/O：针对Java 5和6的简化的I/O操作，尤其是在整个I/O流和文件上。
* 哈希：比Object.hashCode()提供的哈希更复杂的工具，包括Bloom过滤器。
* EventBus：组件之间的发布-订阅式通信，而无需组件之间进行显式注册。
* 数学：JDK未提供经过优化，经过全面测试的数学实用程序。
* 反射：用于Java反射功能的Guava实用程序。
* 提示：使用Guava使您的应用程序按您希望的方式工作
