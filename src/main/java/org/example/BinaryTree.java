package org.example;

import java.util.Arrays;

public class BinaryTree<E extends Integer> {

    int[] list = new int[4];


    int counter = 0;
    int sizeOfList = 1;

    public void add(int value) {

        if (list.length <= sizeOfList) {
            list = addElement(list);
        }
        if (value == list[counter / 2]) {
            System.out.println("dont insert doble value");
        } else if (value > list[counter / 2]) {
            list[counter + 1] = value;
            sizeOfList++;
        } else if (value < list[counter / 2]) {
            list[counter] = value;
            sizeOfList++;
        } else {
            sizeOfList++;
        }

        counter++;

    }


    public boolean search(int value) {
        int counter = 1;
        while (counter <= sizeOfList) {
            if (value == list[counter / 2]) {
                return true;
            }

            if (value > list[counter / 2]) {

                if (value == list[counter + 1]) {
                    return true;
                }
                counter++;
                continue;

            }

            if (value < list[counter / 2]) {
                if (value == list[counter]) {
                    return true;
                }

                counter++;
                continue;
            }
            if (counter == (sizeOfList / 2)) {
                return false;
            }
        }
        return false;
    }

    public void listTreeAsSortedArray() {
        int[] sortList = new int[list.length];

        for (int i = 0; i < list.length; i++) {
            sortList[i] = list[i];
        }
        Arrays.sort(sortList);

        System.out.println();
        for (int i = 0; i < sortList.length; i++) {
            System.out.print(sortList[i] + "  ");
        }

    }


    public void getAll() {
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + "  ");
        }
        System.out.println();
        System.out.println(sizeOfList);
    }


    //-------------------------------------------------
    private int[] addElement(int[] list) {
        int[] newArray = new int[list.length + 10];

        for (int i = 0; i < list.length; i++) {
            newArray[i] = list[i];
        }

        return newArray;
    }

}