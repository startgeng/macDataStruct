package com.kevin.datastruct.btree;

import com.google.common.collect.Lists;
import com.kevin.datastruct.algorithm.TreeNode;
import org.springframework.util.CollectionUtils;

import java.util.Collections;
import java.util.List;
import java.util.Stack;

/**
 * @author chenligeng
 */
public class PreOrderTree {

    public static void preOrder(TreeNode node) {
        if (node == null){
            return;
        }
        System.out.println(node.data);
        preOrder(node.leftChild);
        preOrder(node.rightChild);
    }


    public static void midOrder(TreeNode node){
        if (node == null){
            return;
        }
        midOrder(node.leftChild);
        System.out.println(node.data);
        midOrder(node.rightChild);
    }

    public static void afterOrder(TreeNode node){
        if (node == null){
            return;
        }
        afterOrder(node.leftChild);
        afterOrder(node.rightChild);
        System.out.println(node.data);
    }

    public List<Integer> preOrderTraversal(TreeNode treeNode){
        List<Integer> list = Lists.newArrayList();
        Stack<TreeNode> stack = new Stack<>();
        while (treeNode == null){
            return list;
        }
        stack.push(treeNode);
        if (!stack.empty()){
            list.add(treeNode.data);
            TreeNode node = stack.pop();
            if (node.leftChild != null){
                stack.push(node.leftChild);
            }
            if (node.rightChild != null){
                stack.push(node.rightChild);
            }
        }
        return list;
    }

    //中序遍历
    public void inOrderTraversal(TreeNode tree) {
        if (tree == null){
            return;
        }
        Stack<TreeNode> stack = new Stack<>();
        while (!stack.empty()){
            while (tree != null){
                stack.push(tree);
                tree = tree.leftChild;
            }

            if (!stack.empty()){
                TreeNode treeNode = stack.pop();
                System.out.println(treeNode.data);
                treeNode = treeNode.rightChild;
            }
        }
    }

    //后续遍历
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> list = Lists.newArrayList();
        if (root == null) {
            return list;
        }
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        while (!stack.empty()) {
            TreeNode treeNode = stack.pop();
            list.add(treeNode.data);
            if (treeNode.leftChild != null) {
                stack.push(treeNode.leftChild);
            }
            if (treeNode.rightChild != null) {
                stack.push(treeNode.rightChild);
            }
        }
        Collections.reverse(list);
        return list;
    }
    }
