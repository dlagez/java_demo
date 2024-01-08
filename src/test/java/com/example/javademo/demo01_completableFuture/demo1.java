package com.example.javademo.demo01_completableFuture;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.concurrent.CompletableFuture;

@SpringBootTest
class demo1 {

    @Test
    void demo() throws Exception{
        System.out.println("主线程开始");
        CompletableFuture<Void> future = CompletableFuture.runAsync(
                () -> {
                    try {
                        System.out.println("子线程干活");
                        Thread.sleep(5000);
                        System.out.println("子线程完成");
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                });
        future.get();
        System.out.println("main finish");
    }
}
