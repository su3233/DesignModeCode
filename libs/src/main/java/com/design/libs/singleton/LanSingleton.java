package com.design.libs.singleton;

/**
 * @auther:sutongsheng
 * @date:2020/4/25 11:27
 * @description: 懒汉单例模式
 */
public class LanSingleton {
    private static LanSingleton lanSingleton = null;

    private LanSingleton() {
    }

    private static synchronized LanSingleton getInstance() {
        if (lanSingleton != null) {
            lanSingleton = new LanSingleton();
        }
        return lanSingleton;
    }
}
