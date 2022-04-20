package com.gqz.gateway.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * <p>路由配置</p>
 *
 * @author gqz20
 * @create 2022-04-19 14:57
 **/
@Configuration
public class RouteConfig {
    @Bean
    public RouteLocator routeLocator(RouteLocatorBuilder builder) {
        return builder.routes()
                .route("leyou-item",
                        r -> r
                                .path("/api/item/**")
                                .filters(f -> f.stripPrefix(2))
                                .uri("lb://leyou-item"))
                .build();

    }
}
