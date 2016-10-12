package com.ryx.server.bean;

import java.io.Serializable;

/**
 * 用户类
 * Created by lenovo on 2016/8/3.
 */
public class User implements Serializable {
    private String id;    //id主键 32位UUID
    private String name;    //名字
    private String phone;    //手机号码 11位
    private String pwd;    //密码 64MD5
    private Integer sex;    //未定：0，男：1，女：2


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

}
