package com.design.libs.singleton;

/**
 * @auther:sutongsheng
 * @date:2020/4/25 11:31
 * @description: 饿汉单例模式
 */
public class EHanSingleton {
    private static final EHanSingleton eHanSingleton = new EHanSingleton();

    private EHanSingleton() {
    }

    private static EHanSingleton getInstance() {
        return eHanSingleton;
    }
}
