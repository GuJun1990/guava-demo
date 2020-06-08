## 不可变集合

### Why?
不可变对象具有许多优点，包括：
* 可供不受信任的库使用。
* 线程安全：可以被许多线程使用，而不会出现竞争状况。
* 不需要支持变更操作，并且可以通过这种假设节省时间和空间。所有不可变的集合实现比其可变的同级具有更高的内存效率。

创建不可变集合的方法
* 使用`copyOf`方法，例如`ImmutableSet.copyOf(set)`
* 使用`of`方法，例如`ImmutableSet.of("a","b","c")`
* 使用`Builder`，例如
```java
public static final ImmutableSet<Color> GOOGLE_COLORS =
   ImmutableSet.<Color>builder()
       .addAll(WEBSAFE_COLORS)
       .add(new Color(0, 191, 255))
       .build();
```

### `copyOf`比你想象的还要聪明
记住，`ImmutableXXX.copyOf`会在安全的情况下尝试避免复制数据，虽然具体的细节没有说明但实现通常是智能的，这很有用，例如：


### 与JDK不可变集合对比