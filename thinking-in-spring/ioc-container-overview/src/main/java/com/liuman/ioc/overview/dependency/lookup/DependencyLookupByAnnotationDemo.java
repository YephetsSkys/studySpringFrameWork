package com.liuman.ioc.overview.dependency.lookup;

import com.liuman.ioc.overview.annotation.Super;
import com.liuman.ioc.overview.domain.User;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.ListableBeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Map;

/**
 * 依赖查找实例，根据注解查找
 * @Author: liuman05
 * @Date: 2020-03-17 15:11
 */
public class DependencyLookupByAnnotationDemo {

    public static void main(String[] args) {
        BeanFactory beanFactory = new ClassPathXmlApplicationContext("classpath:/META-INF/dependency-lookup-context.xml");
        lookupByAnnotation(beanFactory);

    }

    private static void lookupByAnnotation(BeanFactory beanFactory) {
        if (beanFactory instanceof ListableBeanFactory) {
            ListableBeanFactory listableBeanFactory = (ListableBeanFactory) beanFactory;
            Map<String, User> users = (Map)listableBeanFactory.getBeansWithAnnotation(Super.class);
            System.out.println("查找注解@Super标识的 user类型的bean集合:" + users);
        }
    }

}
