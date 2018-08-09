"#my-boot" 
后端技术采用
spring-boot
mybatis
thymeleaf  学习地址 https://blog.csdn.net/qq_32923745/article/details/78257686


前端框架
layui 学习地址： http://www.layui.com/doc/modules/element.html


架构规划

dev-parent 为所有工程父类：定义依赖jar组件版本

eureka-server 定义为eureka模块的服务注册中心

dev-server 定义为服务提供方，只要提供各类服务接口，并切注册到eureka-server中

dev-web 定义为服务消费方，作为eureka-server中注册的服务消费方，
        用于接收用户请求并利用openfeign调用eureka-server中注册的服务

dev-zuul 作为智能路由