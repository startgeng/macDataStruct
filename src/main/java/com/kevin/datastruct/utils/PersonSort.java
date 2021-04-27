package com.kevin.datastruct.utils;

import com.kevin.datastruct.demo.Person;
import lombok.extern.slf4j.Slf4j;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * @author clg 商品排序
 */

@Slf4j
public class PersonSort {

    public static void main(String[] args) {
        List<Person> list = new ArrayList<>();
        Person person1 = new Person(2,"clg");
        Person person2 = new Person(1,"abc");
        list.add(person1);
        list.add(person2);
        log.info("person->{}",list);
        Collections.sort(list, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getId() - o2.getId();
            }
        });
        log.info("person->{}",list);
    }
}
