package com.kevin.datastruct.entity;

import java.util.Date;

/**
 * @author chenligeng
 */
public class User implements Cloneable{

    private String name;

    private String age;

    private Integer sex;

    private Date createTime;

    private Date updateTime;

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

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


    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", sex=" + sex +
                ", createTime=" + createTime +
                ", updateTime=" + updateTime +
                '}';
    }

    public User(String name, String age, Integer sex, Date createTime, Date updateTime) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.createTime = createTime;
        this.updateTime = updateTime;
    }


    public static final class UserBuilder {
        private String name;
        private String age;
        private Integer sex;
        private Date createTime;
        private Date updateTime;

        private UserBuilder() {
        }

        public static UserBuilder anUser() {
            return new UserBuilder();
        }

        public UserBuilder withName(String name) {
            this.name = name;
            return this;
        }

        public UserBuilder withAge(String age) {
            this.age = age;
            return this;
        }

        public UserBuilder withSex(Integer sex) {
            this.sex = sex;
            return this;
        }

        public UserBuilder withCreateTime(Date createTime) {
            this.createTime = createTime;
            return this;
        }

        public UserBuilder withUpdateTime(Date updateTime) {
            this.updateTime = updateTime;
            return this;
        }

        public User build() {
            return new User(name, age, sex, createTime, updateTime);
        }
    }
}
