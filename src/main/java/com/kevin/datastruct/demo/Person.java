package com.kevin.datastruct.demo;

import com.kevin.datastruct.annotion.AnnotionName;
import com.kevin.datastruct.annotion.ThreadSafe;
import lombok.*;
import org.junit.runner.notification.RunListener;

/**
 * @author clg 人员表的字段
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode
@ThreadSafe(value = "person")
public class Person implements Comparable{

    @AnnotionName(value = "1",name = "编号",max = "5")
    private Integer id;

    @AnnotionName(value = "张三",name = "姓名")
    private String name;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int compareTo(Object o) {
        Person person = (Person) o;
        return this.id.compareTo(((Person) o).getId());
    }


}
