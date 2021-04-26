package com.kevin.datastruct.test;

import com.kevin.datastruct.demo.Product;
import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @author clg
 * 分组数据
 */
@Slf4j
public class GroupByData {

    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        Product product1 = new Product("食物",1);
        Product product2 = new Product("食物",2);
        Product product3 = new Product("清理",3);
        products.add(product1);
        products.add(product2);
        products.add(product3);

        Map<String, List<Product>> map = products.stream().collect(Collectors.groupingBy(e -> fetchGreoupBy(e)));
        log.info("map->{}",map.size());

    }

    /**
     * 分组的参数
     * @param e 商品类
     * @return 返回一个分组的字符串对象
     */
    private static String fetchGreoupBy(Product e) {
        return e.getProductType();
    }
}
