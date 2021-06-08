package com.binarysearchtree;



public class BinarySearchTree<K extends Comparable<K>> {
    private Node<K> root;

    public void add(K key) {
        this.root = this.addRecursively(root, key);
    }

    private Node<K> addRecursively(Node<K> current, K key) {
        if (current == null)
            return new Node<>(key);
        int compareResult = key.compareTo(current.key);
        if (compareResult == 0) return current;
        if (compareResult < 0) {
            current.left = addRecursively(current.left, key);
        } else {
            current.right = addRecursively(current.right, key);
        }
        return current;
    }

    public int getSize() {
        return this.getSizeRecursive(root);
    }

    private int getSizeRecursive(Node<K> current) {
        return current == null ? 0 : 1 + this.getSizeRecursive(current.left) +
                this.getSizeRecursive(current.right);
    }
}
