# Feign调用demo
    调用链： one-api------>feign(ribbon)-------->one-service
                                    |---------->one-service2
                     
    可以通过网关，先启动gateway,然后启动调用链中的项目，网关设置路由

# 网关配置    
```$xslt
spring:
  cloud:
    gateway:
      routes:
        - id: api-route
          uri: lb://one-api
          predicates:
            - Path=/api/**
```