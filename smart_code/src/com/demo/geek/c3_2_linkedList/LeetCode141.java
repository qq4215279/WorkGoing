/*
 * Copyright 2018-2020, 上海哈里奥科技有限公司
 * All Right Reserved.
 */

package com.demo.geek.c3_2_linkedList;

import com.demo.common.entity.Node;

import java.util.LinkedHashSet;
import java.util.Set;

public class LeetCode141 {  // LeetCode T141

    /**
     * 环形链表
     * 给定一个链表，判断链表中是否有环。
     *
     * 为了表示给定链表中的环，我们使用整数 pos 来表示链表尾连接到链表中的位置（索引从 0 开始）。 如果 pos 是 -1，则在该链表中没有环。
     *
     *  
     * 输入：head = [3,2,0,-4], pos = 1
     * 输出：true
     * 解释：链表中有一个环，其尾部连接到第二个节点。
     */

    public boolean hasCycle(Node head) {//hash函数法

        if (head == null || head.next == null)
            return false;

        Set<Node> set = new LinkedHashSet<>();
        while (head != null) {
            if (set.contains(head)) {
                return true;
            }
            set.add(head);
            head = head.next;

        }
        return false;

    }

    public boolean hasCycle02(Node head) { //快慢指针法
        if (head == null || head.next == null)
            return false;

        Node slow = head.next;
        Node fast = head.next.next;

        while (fast != null || fast.next != null) {//fast.next判断作用：判断fast是否移动到末尾
            if (slow == fast) {
                return true;
            }
            slow = slow.next;
            fast = fast.next.next;
        }
        return false;
    }




    public static void main(String[] args) {

    }

}
