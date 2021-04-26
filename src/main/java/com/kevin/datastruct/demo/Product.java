package com.kevin.datastruct.demo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * @author clg
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Product {

    /**
     * 商品类型
     */
    private String productType;

    /**
     * 商品数量
     */
    private Integer productNum;
}
