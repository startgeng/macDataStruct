package com.kevin.datastruct.util;

import com.sun.istack.internal.NotNull;
import org.springframework.lang.NonNull;
import java.util.Collection;
import java.util.Map;

/**
 * @author chenligeng
 * 集合工具类
 */
public class CollectionAndMapUtils {

    /**
     * list集合是否为空
     * @param list
     * @return
     */
    public static Boolean listIsEmpty(@NonNull @NotNull Collection<?> list){
        return list.isEmpty() || list == null || list.size() == 0;
    }

    /**
     * map集合是否为空
     * @param map
     * @return
     */
    public static Boolean mapIsEmpty(@NonNull @NotNull Map<?,?> map){
        return map.isEmpty() || map == null || map.size() == 0;
    }
}
