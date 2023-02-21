package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        BinaryTree binary = new BinaryTree();
        binary.add(5);
        binary.add(1);
        binary.add(8);
        binary.add(9);
        binary.add(55);
        binary.add(96);
        binary.add(98);
        binary.add(88);
        binary.add(95);
//        binary.add(35);
//        binary.add(25);
//        binary.add(20);


        binary.getAll();

        printer(binary.search(55));
        printer(binary.search(5));
        printer(binary.search(10));
        printer(binary.search(10));
//        printer(binary.search(1));
        printer(binary.search(8));
        printer(binary.search(9));
        printer(binary.search(55));



        binary.listTreeAsSortedArray();
    }

    public static void printer(boolean value){
        System.out.print(value+" ");
    }
}
