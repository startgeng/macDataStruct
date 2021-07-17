package com.kevin.datastruct.test;

import com.kevin.datastruct.entity.User;

import java.util.Date;
import java.util.Optional;


/**
 * java8新特性
 */
public class TestDemo3 {

    public static void main(String[] args) {
        Optional<User> optional = Optional.of(new User("张三","23",1,new Date(),new Date()));
        User user = optional.get();
        System.out.println(user);

//        Optional<Object> empty = Optional.empty();
//        System.out.println(empty.get());

        Optional<User> optionalUser = Optional.ofNullable(new User("张三", "23", 1, new Date(), new Date()));
        System.out.println(optionalUser.get());
        if (optionalUser.isPresent()){
            System.out.println("aaaa");
        }

        Optional<Object> objectOptional = Optional.ofNullable(null);
        if (objectOptional.isPresent()){
            System.out.println(111);
        }
        Object bbbb = objectOptional.orElse("bbbb");
        System.out.println(bbbb);

        Optional<User> objectOptional1 = Optional.ofNullable(null);
        User user1 = objectOptional1.orElseGet(() -> new User("张三", "23", 1, new Date(), new Date()));
        System.out.println(user1);


        Optional<User> users = Optional.ofNullable(new User("张三", "23", 1, new Date(), new Date()));
        Optional<String> optionalS = users.map(e -> e.getName());
        System.out.println(optionalS.get());
    }
}
