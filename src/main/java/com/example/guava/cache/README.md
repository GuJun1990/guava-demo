## 本地缓存

### 示例
```java
LoadingCache<Key, Graph> graphs = CacheBuilder.newBuilder()
    .maximumSize(1000)
    .expireAfterWrite(10, TimeUnit.MINUTES)
    .removalListener(MY_LISTENER)
    .builder(
        new CacheLoader<Key, Graph>() {
            @Override
            public Graph load(Key, key) throws AnyException {
                return createExpensiveGraph(key);
            }   
        }   
    );
```