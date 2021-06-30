package com.kevin.datastruct.test.demoannotion;

import com.kevin.datastruct.annotion.ThreadSafe;
import com.kevin.datastruct.demo.Person;
import com.kevin.datastruct.util.CollectionAndMapUtils;
import org.junit.Test;
import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.List;

public class AnnotionDemo1 {

    @Test
    public void demo1() throws IllegalAccessException {
        Person person1 = new Person(2,"lisi");
        Person person2 = new Person(3,"wangwu");
        List<Person> list = new ArrayList<>();
        Person dto = new Person();
        list.add(person1);
        list.add(person2);
//        for (Person person : list) {
//            if (person != null){
//                Field[] fields = person.getClass().getDeclaredFields();
//                for (Field field : fields) {
//                    field.setAccessible(true);
//                    System.out.println(field.get(person));
//                }
//            }
//        }
        if (!CollectionAndMapUtils.listIsEmpty(list)){
            for (Person person : list) {
                ThreadSafe annotation = person.getClass().getAnnotation(ThreadSafe.class);
                System.out.println(annotation.value());
            }
        }
    }
}
