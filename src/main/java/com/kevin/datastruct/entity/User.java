package com.kevin.datastruct.entity;

import java.util.Date;

/**
 * @author chenligeng
 */
public class User {

    private String name;

    private String age;

    private Integer sex;

    private Date createTime;

    private Date updateTime;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }



    public User(String name, String age, Integer sex, Date createTime, Date updateTime) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.createTime = createTime;
        this.updateTime = updateTime;
    }
}
