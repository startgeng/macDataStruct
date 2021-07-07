package com.kevin.datastruct.test;

import com.google.common.collect.Lists;
import com.kevin.datastruct.entity.Course;
import com.kevin.datastruct.entity.StudentDTO;
import com.kevin.datastruct.util.DateUtils;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.junit.Test;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @author chenligeng
 */
@Slf4j
public class Demo {



    List<StudentDTO> students = new ArrayList<StudentDTO>() {
        {
            // 添加学生数据
            add(new StudentDTO(1L, "W199", "小美", "WM", 100D, new ArrayList<Course>() {
                {
                    // 添加学生学习的课程
                    add(new Course(300L, "语文"));
                    add(new Course(301L, "数学"));
                    add(new Course(302L, "英语"));
                }
            }));
            add(new StudentDTO(2L, "W1", "小美", "WM", 100D, Lists.newArrayList()));
            add(new StudentDTO(3L, "W3", "小名", "M", 90D, new ArrayList<Course>() {
                {
                    add(new Course(300L, "语文"));
                    add(new Course(304L, "体育"));
                }
            }));
            add(new StudentDTO(4L, "W1", "小蓝", "M", 10D, new ArrayList<Course>() {
                {
                    add(new Course(301L, "数学"));
                    add(new Course(305L, "美术"));
                }
            }));

        }
    };

    @Test
    public void demo1(){
        List<String> list = new ArrayList<String>();
        list.add("abc");
        list.add("bcd");
        list.add("abcd");
        List<String> stringList = list.stream().filter(e -> e.equals("abc")).collect(Collectors.toList());
        System.out.println(stringList.toString());
    }

    @Test
    public void demo2(){

        List<String> list = students.stream().map(StudentDTO::getCode).collect(Collectors.toList());
        System.out.println(list.toString());
    }

    @Test
    public void demo3(){
        //与map没有区别
        List<Integer> list = students.stream().mapToInt(e -> Integer.valueOf(e.getId() + "")).mapToObj(e -> e).collect(Collectors.toList());
        System.out.println(list.toString());

        //可以进行累加
        double sum = students.stream().mapToDouble(e -> e.getScope()).sum();
        System.out.println(sum);
    }

    /**
     * 可以求出一个对象下面的list的数据 flatMap
     */
    @Test
    public void demo4(){
        //可以求出一个对象下面的list的数据
        List<Course> list = students.stream().flatMap(e -> e.getLearningCources().stream()).collect(Collectors.toList());
        System.out.println(list.toString());

        List<List<Course>> collect = students.stream().map(e -> e.getLearningCources()).collect(Collectors.toList());
        System.out.println(collect.toString());
    }

    @Test
    public void demo5(){
        List<String> list = students.stream().map(e -> e.getName()).distinct().collect(Collectors.toList());
        System.out.println(list.toString());
        List<String> stringList = students.stream().map(StudentDTO::getName).collect(Collectors.toList());
        System.out.println(stringList);
    }

    @Test
    public void demo6(){
        List<String> list = students.stream().map(e -> e.getCode()).collect(Collectors.toList());
        System.out.println(list.toString());
        List<String> stringList = students.stream().map(e -> e.getCode()).sorted().collect(Collectors.toList());
        System.out.println(stringList);
        List<String> stringList1 = students.stream().map(e -> e.getCode()).sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println(stringList1);
    }

    @Test
    public void demo7(){
        students.stream().map(StudentDTO::getCode)
                .peek(e -> log.info("学号是:{}",e)).
                        collect(Collectors.toList());
    }

    @Test
    public void demo8(){
        List<String> list = students.stream().map(StudentDTO::getCode).collect(Collectors.toList());
        System.out.println(list);
        List<String> stringList = students.stream().map(StudentDTO::getCode).limit(2).collect(Collectors.toList());
        System.out.println(stringList);
    }

    @Test
    public void demo9(){
        List<Double> list = students.stream().map(StudentDTO::getScope).collect(Collectors.toList());
        System.out.println(list.toString());
        Double grade = students.stream().map(StudentDTO::getScope).reduce((scope1, scope2) -> scope1 + scope2).orElse(0d);
        System.out.println(grade);
        Double sum = students.stream().map(StudentDTO::getScope).reduce(100d, (scope1, scope2) -> scope1 + scope2);
        System.out.println(sum);
    }

    @Test
    public void demo10(){
        Long id = students.stream().filter(s -> StringUtils.equals(s.getName(), "小美"))
                .findFirst()
                .get()
                .getId();
        System.out.println(id);

        Long id1 = students.stream().filter(s -> StringUtils.equals(s.getName(), "小美"))
                .findFirst()
                .orElse(new StudentDTO())
                .getId();
        System.out.println(id1);
    }

    @Test
    public void demo11(){
        Map<String, List<StudentDTO>> map = students.stream().collect(Collectors.groupingBy(StudentDTO::getName));
        for (Map.Entry<String, List<StudentDTO>> entry : map.entrySet()) {
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }
    }

    @Test
    public void demo12(){
        Map<String, StudentDTO> map = students.stream().collect(Collectors.toMap(s -> s.getCode(), s -> s, (s1, s2) -> s2));
        for (Map.Entry<String, StudentDTO> entry : map.entrySet()) {
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }
    }

    @Test
    public void demo13() throws InterruptedException {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(1);
        list.add(2);
        for (Integer i : list) {
            if (i==1){
                list.remove(1);
            }
        }
        System.out.println(list.toString());
    }

}
