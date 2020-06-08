## 不可变集合

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

### 与JDK不可变集合对比