package com.gqz.item;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * <p>商品启动类</p>
 *
 * @author gqz20
 * @create 2022-04-19 09:07
 **/
@SpringBootApplication
@EnableDiscoveryClient
@MapperScan(basePackages = "com.gqz.item.mapper")
public class ItemApplication {
    public static void main(String[] args) {
        SpringApplication.run(ItemApplication.class, args);
    }
}
