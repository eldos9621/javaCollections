package com.my.javaCollections;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;

/**
 * Created with Eldos.
 * Description:
 * Date: 2020-05-12
 */
public class HashMapResearch {

    public static void main(String[] args) {
        HashMap<Integer, Integer> hashMap = new HashMap<Integer, Integer>();
        /*
        先找到对应的冲突链表
        再从链表中一一对比找到对应的Node or Entry
        获取Node中的value
         */
        hashMap.get(1);
        /*
        ①.判断键值对数组table[i]是否为空或为null，否则执行resize()进行扩容；

        ②.根据键值key计算hash值得到插入的数组索引i，如果table[i]==null，直接新建节点添加，转向⑥，如果table[i]不为空，转向③；

        ③.判断table[i]的首个元素是否和key一样，如果相同直接覆盖value，否则转向④，这里的相同指的是hashCode以及equals；

        ④.判断table[i] 是否为treeNode，即table[i] 是否是红黑树，如果是红黑树，则直接在树中插入键值对，否则转向⑤；

        ⑤.遍历table[i]，判断链表长度是否大于8，大于8的话把链表转换为红黑树，在红黑树中执行插入操作，否则进行链表的插入操作；遍历过程中若发现key已经存在直接覆盖value即可；

        ⑥.插入成功后，判断实际存在的键值对数量size是否超多了最大容量threshold，如果超过，进行扩容。
         */
        hashMap.put(1,1);

        /*
        对hashMap进行了一层包装
         */
        HashSet<Integer> hashSet = new HashSet<Integer>();
        hashSet.add(1);
        hashSet.remove(1);
        System.out.println(hashSet);

        LinkedHashMap<Integer, Integer> linkedHashMap = new LinkedHashMap<Integer, Integer>();
        linkedHashMap.get(1);

    }

}
