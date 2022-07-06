package com.datastructures;

public class BinarySearchTree {

    private TreeNode root;

    private void insert(int data) {
        if (root == null)
            this.root = new TreeNode(data);
        else
            root.insert(data);
    }

    private Integer find(int data) throws Exception {
        if (root == null)
            throw new Exception("NO DATA");
        else
            return root.find(data);
    }

    private Integer smallest() throws Exception {
        if (root == null)
            throw new Exception("NO DATA");
        else
            return root.smallest();
    }

    private Integer largest() throws Exception {
        if (root == null)
            throw new Exception("NO DATA");
        else
            return root.largest();
    }

    private void traverseInOrder() throws Exception {
        if (root == null)
            throw new Exception("NO DATA");
        else
            root.traverseInOrder();
    }

    private Integer numOfLeafNodes() throws Exception {
        if (root == null)
            throw new Exception("NO DATA");
        else
            return root.numOfLeafNodes();
    }

    private Integer level() throws Exception {
        if (root == null)
            throw new Exception("NO DATA");
        else
            return root.level();
    }

    public static void main(String[] args) throws Exception {
        int[] sample = { 212, 580, 6, 7, 28, 84, 112, 434, 1000};
        BinarySearchTree bst = new BinarySearchTree();
        for (int x : sample) {
            bst.insert(x);
        }
        System.out.println(bst.find(580));
        System.out.println(bst.smallest());
        System.out.println(bst.largest());

        System.out.println(bst.numOfLeafNodes());
        System.out.println(bst.level());
        bst.traverseInOrder();

//
//        System.out.println(bst.smallest());
//
//		bst.delete(84);
//        System.out.println(bst.numOfLeafNodes());
//        System.out.println(bst.height());
//        bst.traverseInOrder();
    }



}
