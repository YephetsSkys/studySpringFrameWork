package com.liuman.ioc.overview.container;

import com.liuman.ioc.overview.domain.User;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.ListableBeanFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;

import java.util.Map;

/**
 * IoC容器示例
 * @Author: liuman05
 * @Date: 2020-03-17 18:31
 */
public class AnnotationApplicationContextAsIocContainerDemo {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext();
        applicationContext.register(AnnotationApplicationContextAsIocContainerDemo.class);
        applicationContext.refresh();
        lookupCollectionByType(applicationContext);
//        applicationContext.close();
    }

    @Bean
    public User user() {
        User user = new User();
        user.setId(3);
        user.setName("萧梓菁");
        return user;
    }


    private static void lookupCollectionByType(BeanFactory beanFactory) {
        if (beanFactory instanceof ListableBeanFactory) {
            ListableBeanFactory listableBeanFactory = (ListableBeanFactory) beanFactory;
            Map<String, User> users = listableBeanFactory.getBeansOfType(User.class);
            System.out.println("查找到的所有的 User 集合对象：" + users);
        }
    }
}
