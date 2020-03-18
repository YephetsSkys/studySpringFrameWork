package com.liuman.ioc.overview.dependency.lookup;

import com.liuman.ioc.overview.domain.User;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.ObjectFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 依赖查找实例，根据名称查找
 * @Author: liuman05
 * @Date: 2020-03-17 15:11
 */
public class DependencyLookupByNameDemo {

    public static void main(String[] args) {
        BeanFactory beanFactory = new ClassPathXmlApplicationContext("classpath:/META-INF/dependency-lookup-context.xml");
        lookupInRealTime(beanFactory);
        lookupInLazy(beanFactory);

    }

    private static void lookupInRealTime(BeanFactory beanFactory) {
        User user = (User)beanFactory.getBean("user");
        System.out.println("实时查找:" + user);
    }

    private static void lookupInLazy(BeanFactory beanFactory) {
        ObjectFactory<User> objectFactory = (ObjectFactory<User>) beanFactory.getBean("objectFactory");
        User user = objectFactory.getObject();
        System.out.println("延时查找:" + user);
    }
}
