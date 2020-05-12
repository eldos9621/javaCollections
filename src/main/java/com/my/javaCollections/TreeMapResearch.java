package com.my.javaCollections;

import java.util.TreeMap;
import java.util.TreeSet;

/**
 * Created with Eldos.
 * Description:
 * Date: 2020-05-12
 */
public class TreeMapResearch {


    /*
    红黑树是一种近似平衡的二叉查找树，它能够确保任何一个节点的左右子树的高度差不会超过二者中较低那个的一倍。
    具体来说，红黑树是满足如下条件的二叉查找树（binary search tree）：

    1.每个节点要么是红色，要么是黑色。
    2.根节点必须是黑色
    3.红色节点不能连续（也即是，红色节点的孩子和父亲都不能是红色）。
    5.对于每个节点，从该点至null（树尾端）的任何路径，都含有相同个数的黑色节点。

    在树的结构发生改变时（插入或者删除操作），往往会破坏上述条件3或条件4，需要通过调整使得查找树重新满足红黑树的条件。
     */
    public static void main(String[] args) {
        TreeMap<Integer, Integer> treeMap = new TreeMap<Integer, Integer>();
        /*
        按照key的顺序变量每一个节点 向左或者向右  最终获取到值相等的Entry
         */
        treeMap.get(1);
        /*
        put(K key, V value)方法是将指定的key, value对添加到map里。该方法首先会对map做一次查找，看是否包含该元组，如果已经包含则直接返回，查找过程类似于getEntry()方法；如果没有找到则会在红黑树中插入新的entry，如果插入之后破       坏了红黑树的约束，还需要进行调整（旋转，改变某些节点的颜色）
        寻找 更新 替换值不难
        调整树结构难
         */
        treeMap.put(1,1);
        /*
        1.如果删除节点左右都非空，寻找继承节点,向左寻找最小，向右寻找最大
        2.如果有一个节点为空，替换该节点，删除
        3.调整树结构

        情景1：若删除结点无子结点，直接删除
        情景2：若删除结点只有一个子结点，用子结点替换删除结点
        情景3：若删除结点有两个子结点，用后继结点（大于删除结点的最小结点）替换删除结点

        删除替换节点以后要做平衡处理
         */
        treeMap.remove(1);

        TreeSet<Integer> treeSet = new TreeSet<Integer>();
        treeSet.add(1);
        treeSet.pollFirst();
        System.out.println(treeMap);
        System.out.println(treeSet);
    }
}
