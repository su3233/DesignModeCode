package com.design.libs.singleton;

/**
 * @auther:sutongsheng
 * @date:2020/4/25 11:33
 * @description: 双重检查锁 单例模式
 * 某种情况下出现失效问题
 */
public class DCLSingleton {
    private volatile static DCLSingleton dclSingleton = null;

    private DCLSingleton() {
    }

    private static DCLSingleton getInstance() {
        if (dclSingleton == null) {
            synchronized (DCLSingleton.class) {
                if (dclSingleton == null) {
                    dclSingleton = new DCLSingleton();
                }
            }
        }
        return dclSingleton;
    }
}
