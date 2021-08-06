/*
 * Copyright 2018-2020, 上海哈里奥科技有限公司
 * All Right Reserved.
 */

package com.demo.geek.c6_tree;

import com.demo.common.entity.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class LeetCode098 {  // LeetCode T98

    /**
     * 验证二叉搜索数树
     * <p>
     * 给定一个二叉树，判断其是否是一个有效的二叉搜索树。
     * <p>
     * 假设一个二叉搜索树具有如下特征：
     * <p>
     * 节点的左子树只包含小于当前节点的数。
     * 节点的右子树只包含大于当前节点的数。
     * 所有左子树和右子树自身必须也是二叉搜索树。
     */


    /**
     * 递归实现
     * @author liuzhen
     * @date 2021/8/6 17:37
     * @param root
     * @return boolean
     */
    public boolean isValidBST(TreeNode root) {
        return recurse(root, null, null);
    }

    /** 递归 */
    private boolean recurse(TreeNode root, Integer lower, Integer upper) {
        if (root == null)
            return true;

        int value = root.value;
        if (lower != null && value <= lower)
            return false;
        if (upper != null && value >= upper)
            return false;

        if (!recurse(root.right, value, upper))
            return false;
        if (!recurse(root.left, lower, value))
            return false;
        return true;
    }

    /**
     * 方法2：排序二叉树的中序遍历是递增
     * @author liuzhen
     * @date 2021/8/6 17:37
     * @param root
     * @return boolean
     */
    public boolean isValidBST2(TreeNode root) {
        if (root == null) {
            return true;
        }

        List<Integer> list = inOrder(root);
        for (int i = 0; i < list.size() - 1; i++) {
            int cur = list.get(i);
            int next = list.get(i + 1);
            if (cur >= next) {
                return false;
            }
        }

        return true;
    }



    /**
     * 中序遍历
     * @author liuzhen
     * @date 2021/8/6 18:10
     * @param root
     * @return java.util.List<java.lang.Integer>
     */
    List<Integer> list = new ArrayList<>();
    public List<Integer> inOrder(TreeNode root) {
        if (root == null) {
            return list;
        }

        inOrder(root.left);
        list.add(root.value);
        inOrder(root.right);
        return list;
    }

    public static void main(String[] args) {

    }

}
