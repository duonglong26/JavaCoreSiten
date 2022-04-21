package com.nduonglong02.unit10.entity;

public class TreeNode<T> {
    private T value;

    private TreeNode<T> nextSibling;
    private TreeNode<T> firstChild;
    private TreeNode<T> parent;

    public TreeNode(T value) {
        this.value = value;
    }

    public void addChild(TreeNode<T> child) {
        if (child == null)
            return;
        child.parent = parent;
        if (firstChild == null)
            firstChild = child;
        else {
            TreeNode<T> temp = firstChild;
            while (temp.nextSibling != null) {
                temp = temp.nextSibling;
            }
            temp.nextSibling = child;
        }
    }

    public TreeNode<T> addChild(T child) {
        TreeNode<T> node = new TreeNode<T>(value);
        addChild(node);
        return node;
    }

    public T getValue() {
        return value;
    }

    public TreeNode<T> getNextSibling() {
        return nextSibling;
    }

    public TreeNode<T> getFirstChild() {
        return firstChild;
    }

    public TreeNode<T> getParent() {
        return parent;
    }
}
