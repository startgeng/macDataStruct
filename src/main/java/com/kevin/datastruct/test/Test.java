package com.kevin.datastruct.test;

import com.kevin.datastruct.entity.User;
import org.springframework.util.Assert;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.stream.Collectors;

/**
 * @author chenligeng
 */
public class Test {

//    public static void main(String[] args) {
////        AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(Appconfig.class);
//
//        //获取的是List<String> 里面的东西
////        ac.getBeanDefinitionNames();
////
////        GenericBeanDefinition beanDefinition = new GenericBeanDefinition();
////        beanDefinition.setBeanClassName("aaa");
////        beanDefinition.setParentName("aabb");
////        beanDefinition.setDependsOn("aa");
////        beanDefinition.setLazyInit(true);
////        beanDefinition.setPrimary(true);
////        beanDefinition.setDescription("aaa");
////        ac.getBean("");
//        List<Integer> list = new ArrayList<>();
////        list.add(1);
////        list.add(2);
////        list.add(3);
////        List<Integer> collect = list.stream().filter(e -> e.equals(2)).collect(Collectors.toList());
////        System.out.println(collect.toString());
////        System.out.println(list.toString());
////        List<Boolean> collect1 = list.stream().map(e -> {
////            return e.equals(2);
////        }).collect(Collectors.toList());
////        System.out.println(collect1.toString());
////        System.out.println(list.toString());
//        if (CollectionAndMapUtils.listIsEmpty(list)){
//            System.out.println("list == null");
//        }
//    }

    public static void main(String[] args) throws InterruptedException, CloneNotSupportedException, ParseException {
        Date date1 = new Date();
        Thread.sleep(3000);
        Date date2 = new Date();
        User user1 = new User("张三","23",1,date1,new Date());
        User user2 = new User("李四","24",1,date2,new Date());
        List<User> list = new ArrayList();
        list.add(user1);
        list.add(user2);
//        System.out.println(list.toString());
        List<User> userList = list.stream().sorted(Comparator.comparing(User::getCreateTime).reversed()).collect(Collectors.toList());
        System.out.println(userList.toString());
//        User user = User.UserBuilder.anUser().withAge("23").build();
//        User clone = (User) user1.clone();
//        System.out.println(clone);
//
//        User user3 = null;
//        Assert.isNull(user1,"用户为空");
//        Map<String,Integer> map = new HashMap<>();
//        map.put("1",1);
//        System.out.println(map.get(2));
        System.out.println(10%3);
        System.out.println("3" != "3" && "1" != "3");
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String date = "2019-09-08";
        Date startTime = sdf.parse(date);
        System.out.println(startTime);
    }
}
