package com.design.libs.singleton;

/**
 * @auther:sutongsheng
 * @date:2020/4/25 14:14
 * @description: 使用枚举实现单例，内存中只创建一个对象，反序列化时也只有一个
 */
public enum SingletonEnum {
    INSTANCE;

    public void doSomething() {
        System.out.println("do thing");
    }
}
