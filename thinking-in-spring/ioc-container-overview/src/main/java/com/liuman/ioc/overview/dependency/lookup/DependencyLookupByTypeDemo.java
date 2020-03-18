package com.liuman.ioc.overview.dependency.lookup;

import com.liuman.ioc.overview.domain.User;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.ListableBeanFactory;
import org.springframework.beans.factory.ObjectFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Map;

/**
 * 依赖查找实例，根据类型查找
 * @Author: liuman05
 * @Date: 2020-03-17 15:11
 */
public class DependencyLookupByTypeDemo {

    public static void main(String[] args) {
        BeanFactory beanFactory = new ClassPathXmlApplicationContext("classpath:/META-INF/dependency-lookup-context.xml");
        lookupByType(beanFactory);
        lookupByCollectionType(beanFactory);

    }

    private static void lookupByType(BeanFactory beanFactory) {
        User user = beanFactory.getBean(User.class);
        System.out.println("单个类型查找:" + user);
    }

    private static void lookupByCollectionType(BeanFactory beanFactory) {
        if (beanFactory instanceof ListableBeanFactory) {
            ListableBeanFactory listableBeanFactory = (ListableBeanFactory) beanFactory;
            Map<String,User> users = listableBeanFactory.getBeansOfType(User.class);
            System.out.println("user类型的bean集合:" + users);
        }
    }
}
