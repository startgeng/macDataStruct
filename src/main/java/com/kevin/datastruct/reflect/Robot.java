package com.kevin.datastruct.reflect;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author clg
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Robot {

    private String name;
    public void sayHi(){
        System.out.println("HelloClg" + name);
    }

    private String throwHello(String tag){
        return "Hello" + tag;
    }


}
