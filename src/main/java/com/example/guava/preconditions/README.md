## Preconditions 介绍

### Preconditions

Guava提供了许多前提条件检查实用程序，强烈建议静态导入这些。
```java
import static com.google.common.base.Preconditions.checkArgument;
```
每种方法都有三种变体：
1. 没有多余的参数。引发任何异常而不会出现错误消息。
2. 一个额外的Object参数。错误消息object.toString()引发任何异常。
3. 一个额外的String参数，带有任意数量的其他Object参数。行为类似于`printf`，但是为了GWT的兼容性和效率，它仅允许`％s`指示符。
    * 注意：`checkNotNull`，`checkArgument`和`checkState`具有大量重载，这些重载采用原始参数和Object参数而不是varargs数组的组合-这允许上述调用避免大多数情况下避免原始装箱和varags数组分配。
    
| 方法签名 | 说明 | 检查失败抛出的异常 |
| :- | :- | :- |
|checkArgument(boolean)|检查布尔值是否为真。用于验证方法的参数|IllegalArgumentException|
|checkNotNull(T)|检查值是否不为null。直接返回值，因此可以内联使用checkNotNull(value)|NullPointerException|
|checkState(boolean)|||
|checkElementIndex(int index, int size)|||
|checkPositionIndex(int index, int size)|||
|checkPositionIndexes(int start, int end, int size)|||
