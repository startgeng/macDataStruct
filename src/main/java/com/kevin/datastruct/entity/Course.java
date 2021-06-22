package com.kevin.datastruct.entity;

import com.google.common.collect.Lists;
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
public class Course {
    private static final long serialVersionUID = 2896201730223729591L;

    /**
     * 课程 ID
     */
    private Long id;

    /**
     * 课程 name
     */
    private String name;



}


