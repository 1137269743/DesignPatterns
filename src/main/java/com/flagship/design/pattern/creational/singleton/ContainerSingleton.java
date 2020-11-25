package com.flagship.design.pattern.creational.singleton;

import org.apache.commons.lang.StringUtils;

import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName: ContainerSingleton
 * @Author: Flagship
 * @Description: 容器单例，用HashMap线程不安全，使用HashTable虽然线程安全但有锁会影响性能
 * @Date: 2020/11/1 15:31
 */

public class ContainerSingleton {
    private static Map<String,Object> stringObjectMap = new HashMap<String,Object>();

    private ContainerSingleton() {

    }

    public static void putInstance(String key, Object instance) {
        if (StringUtils.isNotBlank(key) && instance != null){
            if (!stringObjectMap.containsKey(key)) {
                stringObjectMap.put(key, instance);
            }
        }
    }

    public static Object getInstance(String key) {
        return stringObjectMap.get(key);
    }
}
