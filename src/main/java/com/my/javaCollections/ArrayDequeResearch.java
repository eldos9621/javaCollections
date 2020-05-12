package com.my.javaCollections;

import java.util.ArrayDeque;

/**
 * Created with Eldos.
 * Description:
 * Date: 2020-05-12
 */
public class ArrayDequeResearch {

    /*double ended queue*/

    private static int tail;
    private static int head;

    /*
    (tail+1)&(elements.length-1) 核心公式
    但建立在容器大小为2的倍数的基础上
     */

    public static void main(String[] args) {
        testAddFirst();
        /*
        初始化指定容量，会自动调整成2的倍数
        如果<=8 初始容量为8
        容量按指数倍增加
         */
        ArrayDeque<String> arrayDeque = new ArrayDeque<String>(5);
        /*
        往队尾添加1，tail+1 并通过&运算判断是否越界
        如果和head相等 扩容 == addLast
         */
        arrayDeque.add("1");
        arrayDeque.add("2");
        arrayDeque.add("3");
        arrayDeque.add("4");
        /*
        删除首位元素,head+1 之前的位置置为null
         */
        arrayDeque.remove();
        arrayDeque.remove();
        /*
        在首位添加元素,head-1
         */
        arrayDeque.addFirst("5");
        /*
        获取并删除首位元素
         */
        arrayDeque.pollFirst();
        /*
        获取并删除末尾元素
         */
        arrayDeque.pollLast();
        /*
        获取不删除首位元素
         */
        arrayDeque.peekFirst();
        /*
        获取不删除尾端元素
         */
        arrayDeque.peekLast();
    }


    private static void testAddFirst() {
        Object[] elements = new Object[8];
        elements[tail] = "1";
        tail = (tail + 1) & (elements.length - 1);
        elements[tail] = "2";
        tail = (tail + 1) & (elements.length - 1);
        elements[tail] = "3";
        tail = (tail + 1) & (elements.length - 1);
        elements[tail] = "4";
        tail = (tail + 1) & (elements.length - 1);
        int h = head;
        elements[h] = null;
        head = (h + 1) & (elements.length - 1);
        h = head;
        elements[h] = null;
        head = (h + 1) & (elements.length - 1);
        head = (head - 1) & (elements.length - 1);
        elements[head] = "5";
    }
}
