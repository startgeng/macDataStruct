package com.kevin.datastruct.demo;

import lombok.*;

/**
 * @author clg 人员表的字段
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode
public class Person implements Comparable{

    private Integer id;

    private String name;

    @Override
    public int compareTo(Object o) {
        Person person = (Person) o;
        return this.id.compareTo(((Person) o).getId());
    }
}
