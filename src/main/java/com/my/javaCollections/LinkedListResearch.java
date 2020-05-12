package com.my.javaCollections;

import java.util.LinkedList;

/**
 * Created with Eldos.
 * Description:
 * Date: 2020-05-12
 */
public class LinkedListResearch {

    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<String>();
        /*
        简单的Node移动
         */
        linkedList.add("123");
        /*
        修改位置是末尾 == add
        否则先找到Node，修改引用
        寻找node 判断index在前半部分还是后半部分 离哪边近先从哪边开始找 双向链表
         */
        linkedList.add(2, "234");
        /*
        删除第一个元素
         */
        linkedList.remove();
        /*
        删除对应Node,修改引用
         */
        linkedList.remove(1);
        /*
        从第一个节点开始变了，删除第一个值相等的节点
         */
        linkedList.remove("123");
        /*
        获取指定节点元素
         */
        String getA = linkedList.get(1);
        /*
        替换指定节点的元素
         */
        linkedList.set(3, "3322");
        System.out.println(linkedList + getA);
    }
}
