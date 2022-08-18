##常用依赖
```xml
<dependencies>
        <dependency>
            <groupId>org.springframework</groupId>
            <artifactId>spring-webmvc</artifactId>
            <version>5.2.0.RELEASE</version>
        </dependency>
    </dependencies>
```
##Beans配置
```xml
<?xml version="1.0" encoding="UTF-8"?>
<beans xmlns="http://www.springframework.org/schema/beans"
       xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
       xsi:schemaLocation="http://www.springframework.org/schema/beans
http://www.springframework.org/schema/beans/spring-beans.xsd">

    <bean id="hello" class="org.example.pojo.Hello">
        <property name="name" value="Spring"/>
    </bean>
</beans> 
```
别名&其他

##依赖注入
1.构造方法

2.set注入

3.拓展:p标签和c标签

##自动装配

##注解说明
@Autowired:有时需与@Qualifiers(value="xxx")结合使用，常见于同一个类在xml文件中配置了多个的情况下。
常标注于成员变量上
（xml也需要简单配置）

@Resource

##使用注解开发
（必须要导aop的包，还需要导context的约束，增加注解的支持）

依赖
```xml
<?xml version="1.0" encoding="UTF-8"?>
<beans xmlns="http://www.springframework.org/schema/beans"
       xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
       xmlns:context="http://www.springframework.org/schema/context"
       xsi:schemaLocation="http://www.springframework.org/schema/beans 
       http://www.springframework.org/schema/beans/spring-beans.xsd
       http://www.springframework.org/schema/context  
       http://www.springframework.org/schema/context/spring-context.xsd"
>
    <context:component-scan base-package="org.example.pojo"/>
    <context:annotation-config></context:annotation-config>
</beans>
```
1.bean
2.属性如何注入
3.衍生的注解
4.自动装配置
5.作用域
6.小结

##注解配置不成功？？后面成功了，怎么处理的？





