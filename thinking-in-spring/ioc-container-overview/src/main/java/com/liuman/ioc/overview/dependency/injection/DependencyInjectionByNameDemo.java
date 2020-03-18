package com.liuman.ioc.overview.dependency.injection;

import com.liuman.ioc.overview.repository.UserRepository;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.ObjectFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 依赖注入实例，根据名称注入
 * @Author: liuman05
 * @Date: 2020-03-17 15:11
 */
public class DependencyInjectionByNameDemo {

    public static void main(String[] args) {
        BeanFactory beanFactory = new ClassPathXmlApplicationContext("classpath:/META-INF/dependency-injection-context.xml");
        UserRepository userRepository = beanFactory.getBean("userRepository",UserRepository.class);
//        System.out.println(userRepository.getUsers());

        //依赖注入
        System.out.println(userRepository.getBeanFactory());
//        System.out.println(userRepository.getBeanFactory() == beanFactory);

        //依赖查找
//        System.out.println(beanFactory.getBean(BeanFactory.class));

        ObjectFactory objectFactory = userRepository.getUserObjectFactory();
        System.out.println(objectFactory.getObject());
        System.out.println(beanFactory == objectFactory.getObject());
    }

}
