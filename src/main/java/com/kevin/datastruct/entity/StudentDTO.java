package com.kevin.datastruct.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

/**
 * @author chenligeng
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class StudentDTO {

    private static final long serialVersionUID = -7716352032236707189L;

    /**
     * id
     */
    private Long id;
    /**
     * 学号 唯一标识
     */
    private String code;
    /**
     * 学生名字
     */
    private String name;

    /**
     * 性别
     */
    private String sex;

    /**
     * 分数
     */
    private Double scope;

    /**
     * 要学习的课程
     */
    private List<Course> learningCources;

}
