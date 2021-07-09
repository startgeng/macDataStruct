package com.kevin.datastruct.algorithm;

import com.google.common.collect.Lists;

import java.util.List;
import java.util.Stack;

/**
 * @author chenligeng
 * 前序遍历二叉树方法2
 */
public class BeforeTraversal1 {

//    public List<Integer> preorderTraversal(TreeNode root) {
//        List<Integer> list = Lists.newArrayList();
//        if (root == null){
//            return list;
//        }
//        Stack<TreeNode> stack = new Stack<>();
//        stack.push(root);
//        while (!stack.isEmpty()){
//            TreeNode t1 = stack.pop();
//            if (t1.left!=null){
//                stack.push(t1.left);
//            }
//            if (t1.right!=null){
//                stack.push(t1.right);
//            }
//            list.add(t1.val);
//        }
//        return list;
//    }
}
