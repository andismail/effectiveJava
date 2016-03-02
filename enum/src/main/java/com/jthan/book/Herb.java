package com.jthan.book;

import java.util.EnumMap;
import java.util.HashSet;
import java.util.Set;

/**
 * 2016-03-02 16:51
 * 感觉吊吊的,数组和Map的其它用法
 */
public class Herb {
    public enum Type{ ANNUAL, PERENNIAL, BIENNIAL}

    private final String name;
    private final Type type;

    public Herb(String name, Type type) {
        this.name = name;
        this.type = type;
    }

    @Override
    public String toString() {
        return name;
    }

    public static void main(String[] args) {
        //需求:把所有相同分类的花园放在一起
        //A
        Herb[] garden = new Herb[]{};
        Set<Herb>[] herbsByType = (Set<Herb>[])new Set[Type.values().length];//Set类型的数组
        for (int i = 0;i < herbsByType.length; i ++) {
            herbsByType[i] = new HashSet<>();//初始化
        }
        for (Herb h : garden) {
            herbsByType[h.type.ordinal()].add(h);//也很巧妙
        }

        //B,感觉非常非常地巧妙
        EnumMap<Type, Set<Herb>> herbsByType2 = new EnumMap<>(Type.class);//key-花园类型  val-花园
        for (Type t : Type.values()) {
            herbsByType2.put(t, new HashSet<>());//初始化三个key是花园类型的EnumMap
        }
        for (Herb h : garden) {//遍历所有花园
            herbsByType2.get(h.type).add(h);//把相同类型的garden放在同一个set中
        }
        System.out.println(herbsByType2);
    }

}
