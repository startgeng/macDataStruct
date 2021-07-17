package com.kevin.datastruct.xywy;

import java.util.Random;

/**
 * 服务期单号创建规则
 * @author chenligeng
 */
public class ServiceOrderCreateRule {

    public static void main(String[] args) {
        System.out.println(getUserServicePriodId());
    }

    public static String getUserServicePriodId(){
        StringBuilder sb = new StringBuilder();
        String phone = "17695648013";
        phone = phone.substring(phone.length()-4);
        Random random = new Random();
        int randomNumber = random.nextInt(10);
        return sb.append(System.currentTimeMillis()).append(phone).append(randomNumber).toString();
    }
}
