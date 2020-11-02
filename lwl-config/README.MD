# 从Nacos中读取配置文件
    @RefreshScope 支持实时刷新
    
```$xslt
spring:
  application:
    name: lwl-config
  cloud:
    nacos:
      discovery:
        server-addr: 192.168.31.33:8848
      config:
        server-addr: 192.168.31.33:8848
        file-extension: yaml # 文件后缀名
        name: lwl-config # 配置文件的文件名，可自定义

```     