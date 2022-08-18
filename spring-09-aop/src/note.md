##AOP实现
1、需要导入依赖包
```xml
<dependencies>
        <dependency>
            <groupId>org.aspectj</groupId>
            <artifactId>aspectjweaver</artifactId>
            <version>1.9.4</version>
        </dependency>
    </dependencies>
```
##AOP实现方式一(beans.xml配置)
```xml
<?xml version="1.0" encoding="UTF-8"?>
<beans xmlns="http://www.springframework.org/schema/beans"
       xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
       xmlns:aop="http://www.springframework.org/schema/aop"
       xsi:schemaLocation="http://www.springframework.org/schema/beans
        http://www.springframework.org/schema/beans/spring-beans.xsd
        http://www.springframework.org/schema/aop
        http://www.springframework.org/schema/aop/spring-aop.xsd" >

    <bean id="userService" class="org.example.service.UserServiceImpl"/>
    <bean id="log" class="org.example.Log.Log"/>
    <bean id="afterLog" class="org.example.Log.AfterLog"/>

    <aop:config>
        <aop:pointcut id="pointcut" expression="execution(* org.example.service.UserServiceImpl.*(..))"/>

        <aop:advisor advice-ref="log" pointcut-ref="pointcut"/>
        <aop:advisor advice-ref="afterLog" pointcut-ref="pointcut"/>

    </aop:config>
</beans>
``````
##AOP实现方式二（自定义实现AOP）
##AOP实现方式三（注解）
1.类上
2.方法前
