package com.datastructures;

public class TreeNode<T> implements Comparable<Integer> {
    private Integer data;
    private TreeNode<T> leftNode;
    private TreeNode<T> rightNode;

    public TreeNode(Integer data) {
        this.data = data;
    }
    public void insert(Integer data) {
        if (data.compareTo(this.data) > 0) { // insert in right subtree
            if (this.rightNode == null)
                this.rightNode = new TreeNode(data);
            else
                this.rightNode.insert(data);
        } else { // insert in left subtree
            if (this.leftNode == null)
                this.leftNode = new TreeNode(data);
            else
                this.leftNode.insert(data);
        }
    }

    public Integer find(int data) {
        if (this.data == data){
            return data;
        }if (data < this.data && this.leftNode != null){
            return leftNode.find(data);
        }
        if (data > this.data && this.rightNode != null){
            return rightNode.find(data);
        }
        return -1;
    }


    public Integer smallest() {
        if (this.leftNode != null){
            return leftNode.smallest();
        }else {
            return this.data;
        }
    }

    public Integer largest() {
        if (this.rightNode != null){
            return rightNode.largest();
        }else {
            return this.data;
        }
    }


    public void traverseInOrder() {
        if (this.leftNode != null){
            leftNode.traverseInOrder();
        }
        System.out.print(this + " ");
        if (this.rightNode != null){
            rightNode.traverseInOrder();
        }
    }

    public Integer numOfLeafNodes() {
        int leftLeaves = 0;
        int rightLeaves = 0;

        if (this.leftNode == null && this.rightNode == null) {
            return 1;
        }
        if (this.leftNode != null)
            leftLeaves = leftNode.numOfLeafNodes();
        if (this.rightNode != null)
            rightLeaves = rightNode.numOfLeafNodes();
        return leftLeaves + rightLeaves;
    }


    public Integer level() {
        int ll = 0;
        int rl = 0;
        if (this.leftNode == null && this.rightNode == null) {
            return 1;
        }
        if (this.leftNode != null)
            ll = leftNode.level();
        if (this.rightNode != null)
            rl = rightNode.level();
        return (ll > rl) ? (ll + 1) : (rl + 1);
    }

    public Integer getData() {
        return data;
    }

    public TreeNode<T> getLeftNode() {
        return leftNode;
    }

    public void setLeftNode(TreeNode<T> leftNode) {
        this.leftNode = leftNode;
    }

    public TreeNode<T> getRightNode() {
        return rightNode;
    }

    public void setRightNode(TreeNode<T> rightNode) {
        this.rightNode = rightNode;
    }

    @Override
    public int compareTo(Integer data) {
        if (this.data > data) return 1;
        if (this.data == data) return 0;
        return -1;
    }

    @Override
    public String toString() {
        return String.valueOf(this.data);
    }


}
