package com.my.javaCollections;

import java.util.ArrayList;

/**
 * Created with Eldos.
 * Description:
 * Date: 2020-05-12
 */
public class ArrayListResearch {


    public static void main(String[] args) {

        /*底层由数组实现*/
        ArrayList<String> arrayList = new ArrayList<String>();
        /*
        1.检查是否越界
        2.直接在指定位置复制赋值
        3.返回该位置的旧值 oldValue
         */
        arrayList.set(1, "sunday");
        /*
         * 获取指定位置元素，并进行类型转换
         */
        String getA = arrayList.get(1);
        /*
         1.检查是否是否超出数组容量
         2.如果超出，扩容原来数组的一半
         3.如果扩容大小超出最大值，赋值为最大值
         4.将旧数组赋值到新数组
         */
        arrayList.add("monday");
        /*
         * 指定位置插入 有操作复杂性
         */
        arrayList.add(2,"index");
        /*
         * 将新数组加到老数组之后，返回新数组的长度加上老数组的长度
         * 指定位置插入，也需要空间移动
         */
        arrayList.addAll(new ArrayList<String>());
        /*
        1.检查越界
        2.删除指定节点元素，删除点之后的元素向前移动一个位置
         */
        arrayList.remove(1);
        /*
        删除一地个满足传入值的元素，并删除, 只删除第一个
         */
        arrayList.remove("sunDay");
        System.out.println(arrayList + getA);
    }

}
