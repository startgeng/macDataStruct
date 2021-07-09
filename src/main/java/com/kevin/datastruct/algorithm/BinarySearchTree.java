package com.kevin.datastruct.algorithm;


import java.util.Stack;

/**
 * @author chenligeng
 * 二叉树的定义和创建
 */
public class BinarySearchTree {

    /**
     * 前序遍历
     * @param node
     */
    public static void preOrderTraveral(TreeNode node){
        if (node == null){
            return;
        }
        System.out.println(node.data);
        preOrderTraveral(node.leftChild);
        preOrderTraveral(node.rightChild);
    }

    /**
     * 中序遍历
     * @param node
     */
    public static void inOrderTraveral(TreeNode node){
        if (node == null){
            return;
        }
        inOrderTraveral(node.leftChild);
        System.out.println(node.data);
        inOrderTraveral(node.rightChild);
    }

    /**
     * 后续遍历
     * @param node
     */
    public static void postORderTraveral(TreeNode node){
        if (node == null){
            return;
        }
        inOrderTraveral(node.leftChild);
        inOrderTraveral(node.rightChild);
        System.out.println(node.data);
    }


    /**
     * 非递前序归遍历二叉树
     * @param node
     */
    public static void preOrderTraveralWithStack(TreeNode node){
        if (node == null){
            return;
        }
        Stack<TreeNode> stack = new Stack<>();
        while (node != null || !stack.isEmpty()){
            //访问左孩子
            while (node != null){
                System.out.println(node.data);
                stack.push(node);
                node = node.leftChild;
            }
            //如果左节点没有还在,弹出站顶元素，访问右孩子
            if (!stack.isEmpty()){
                node = stack.pop();
                node = node.rightChild;
            }
        }
    }
}
