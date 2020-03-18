package com.liuman.ioc.overview.domain;

import com.liuman.ioc.overview.annotation.Super;

/**
 * 超级用户
 * @Author: liuman05
 * @Date: 2020-03-17 16:03
 */
@Super
public class SuperUser extends User {

    private String address;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "SuperUser{" +
                "address='" + address + '\'' +
                "} " + super.toString();
    }
}
