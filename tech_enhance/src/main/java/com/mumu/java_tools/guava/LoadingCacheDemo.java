package com.mumu.java_tools.guava;

import com.google.common.cache.CacheBuilder;
import com.google.common.cache.CacheLoader;
import com.google.common.cache.LoadingCache;
import org.junit.Test;

import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

/**
 * LoadingCacheDemo
 * guava的 本地缓存
 * @author liuzhen
 * @version 1.0.0 2024/5/21 15:05
 */
public class LoadingCacheDemo {

    /**
     *
     * @return void
     * @date 2024/5/21 15:06
     */
    @Test
    public void demo() {

        LoadingCache<String, Object> cache = CacheBuilder.newBuilder()
                // 指定并发级别
                .concurrencyLevel(8)
                // 初始化大小 配合并发级别做分段锁
                .initialCapacity(60)
                //设置缓存大小
                .maximumSize(1000)
                // 同步刷新 刷新过程中会阻塞 值到新的值出来
                .expireAfterWrite(1, TimeUnit.SECONDS)
                // 异步刷新  如果是在刷新过程中 会取到旧值 需要重写reload方法
                // .refreshAfterWrite(2, TimeUnit.SECONDS)
                // 开启缓存的统计功能
                .recordStats()
                //移除时的监听任务
                // .removalListener()
                // 构建缓存
                .build(new CacheLoader<String, Object>() {
                    // 此处实现如果根据key找不到value需要去如何获取
                    @Override
                    public Object load(String s) throws Exception {
                        return "load值";
                    }

                    // 如果批量加载有比反复调用load更优的方法则重写这个方法
                    @Override
                    public Map<String, Object> loadAll(Iterable<? extends String> keys) throws Exception {
                        return super.loadAll(keys);
                    }
                });


        cache.put("1", "1");

        try {

            while (true) {
                Object o = cache.get("1");
                Thread.sleep(1000);
                System.out.println(o);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }



    }
}
