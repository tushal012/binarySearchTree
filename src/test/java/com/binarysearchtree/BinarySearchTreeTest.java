package com.binarysearchtree;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BinarySearchTreeTest<I extends Number> {
    @Test
    public void given3NumbersWhenAddedToBinaryTreeShouldReturnSizeThree() {
        BinarySearchTreeTest<Integer> myBinaryTree = new BinarySearchTreeTest<>();
        myBinaryTree.add(56);
        myBinaryTree.add(30);
        myBinaryTree.add(70);
        int size = myBinaryTree.getSize();
        Assertions.assertEquals(3, size);
    }

    private int getSize() {
    }

    private void add(int i) {
    }
    @Test
    public void givenNumbersWhenAddedToBinaryTreeShouldReturnSizeThirteen() {
        BinarySearchTree<Integer> myBinaryTree = new BinarySearchTree<>();
        myBinaryTree.add(56);
        myBinaryTree.add(30);
        myBinaryTree.add(70);
        myBinaryTree.add(22);
        myBinaryTree.add(40);
        myBinaryTree.add(60);
        myBinaryTree.add(95);
        myBinaryTree.add(11);
        myBinaryTree.add(65);
        myBinaryTree.add(3);
        myBinaryTree.add(16);
        myBinaryTree.add(63);
        myBinaryTree.add(67);
        int size = myBinaryTree.getSize();
        Assertions.assertEquals(13, size);
    }
    @Test
    public void givenNumbersAddedToBST_WhenSearched_ShouldReturn_True() {
        BinarySearchTree<Integer> myBinaryTree = new BinarySearchTree<>();
        myBinaryTree.add(56);
        myBinaryTree.add(30);
        myBinaryTree.add(70);
        myBinaryTree.add(22);
        myBinaryTree.add(40);
        myBinaryTree.add(60);
        myBinaryTree.add(95);
        myBinaryTree.add(11);
        myBinaryTree.add(65);
        myBinaryTree.add(3);
        myBinaryTree.add(16);
        myBinaryTree.add(63);
        myBinaryTree.add(67);
        Boolean result = myBinaryTree.search(63);
        Assertions.assertTrue(result);
    }


}


