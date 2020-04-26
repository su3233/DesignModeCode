package com.design.libs.singleton;

/**
 * @auther:sutongsheng
 * @date:2020/4/25 14:08
 * @description:    静态内部类的形式
 */
public class StaticSingleton {
    private StaticSingleton() {
    }

    public static StaticSingleton getInstance() {
        return SingletonHolder.staticSingleton;
    }

    private static class SingletonHolder {
        private static final StaticSingleton staticSingleton = new StaticSingleton();
    }
}
