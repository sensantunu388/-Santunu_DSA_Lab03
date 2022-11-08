package com.gl.dsa.binarysearchtree.pairfinder;

public class BinarySearchTreePairFinderTest {
    public static void main(String[] args) {

        pairFinderTest(29);
        pairFinderTest(67);
        pairFinderTest(51);
        pairFinderTest(66);
        pairFinderTest(157);
        pairFinderTest(281);
        pairFinderTest(70);
        pairFinderTest(38);
        pairFinderTest(50);

    }

    static void pairFinderTest(int sum) {


        BinarySearchTree sampleTree
                = BinarySearchTreeTest.sampleBinaryTree1();

        BinarySearchTreeTest test = new BinarySearchTreeTest();
        BinarySearchTree sampleTree2 = test.sampleBinaryTree1();

        BinarySearchTreePairFinder finder =
                new BinarySearchTreePairFinder(sampleTree2);

        finder.findPair(sum);
        System.out.println("-----");
    }
}
