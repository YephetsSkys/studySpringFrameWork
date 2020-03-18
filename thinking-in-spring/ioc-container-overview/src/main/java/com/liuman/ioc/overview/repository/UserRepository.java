package com.liuman.ioc.overview.repository;

import com.liuman.ioc.overview.domain.User;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.ObjectFactory;
import org.springframework.context.ApplicationContext;

import java.util.Collection;

/**
 * @Author: liuman05
 * @Date: 2020-03-17 17:08
 */
public class UserRepository {

    private Collection<User> users;//自定义 bean

    private BeanFactory beanFactory;//内建非bean对象(依赖 )

    private ObjectFactory<ApplicationContext> userObjectFactory;

    public Collection<User> getUsers() {
        return users;
    }

    public void setUsers(Collection<User> users) {
        this.users = users;
    }

    public BeanFactory getBeanFactory() {
        return beanFactory;
    }

    public void setBeanFactory(BeanFactory beanFactory) {
        this.beanFactory = beanFactory;
    }

    public ObjectFactory<ApplicationContext> getUserObjectFactory() {
        return userObjectFactory;
    }

    public void setUserObjectFactory(ObjectFactory<ApplicationContext> userObjectFactory) {
        this.userObjectFactory = userObjectFactory;
    }
}
