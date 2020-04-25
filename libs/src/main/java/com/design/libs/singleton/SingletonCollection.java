package com.design.libs.singleton;

import java.util.HashMap;
import java.util.Map;

/**
 * @auther:sutongsheng
 * @date:2020/4/25 14:20
 * @description: 使用集合存储生成的对象，使用时取出生成的对象
 */
public class SingletonCollection {
    private static Map<String, Object> singletonmaps = new HashMap<>();

    private SingletonCollection() {
    }

    private static void registerSingleton(String key, Object instance) {
        if (!singletonmaps.containsKey(key)) {
            singletonmaps.put(key, instance);
        }
    }

    private static Object getSingleton(String key) {
        return singletonmaps.get(key);
    }
}
