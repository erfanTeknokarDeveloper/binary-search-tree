package org.example;

public class BinaryTree<E extends Integer> {

    int[] list = new int[4];


    int counter = 0;
    int sizeOfList = 1;

    public void add(int value) {

        if (list.length <= sizeOfList) {
            list = addElement(list);
        }

//        if (counter == 1) {
//            list[counter] = value;
//        }
        if (value == list[counter / 2]) {
            System.out.println("dont insert doble value");
        } else if (value > list[counter / 2]) {
            list[counter + 1] = value;
//            list[ counter + 1] = value;
            sizeOfList++;
        } else if (value < list[counter / 2]) {
            list[counter] = value;
//            list[counter] = value;
            sizeOfList++;
        } else {
            sizeOfList++;
        }

        counter++;

    }


    public boolean search(int value) {
//        int halfOfSize = sizeOfList/2;
        int counter = 1;
        while (counter <= sizeOfList) {
            if (value == list[counter / 2]) {
                return true;
            }

            if (value > list[counter / 2]) {

                if (value == list[counter + 1]) {
                    return true;
                }
//                else if (value > list[counter + 1]) {
//                    counter++;
//                    continue;
//                }
                counter++;
                continue;

            }

            if (value < list[counter / 2]) {
                if (value == list[counter]) {
                    return true;
                }

//                else if (value < list[counter]) {
//                    counter++;
//                    continue;
//                }
                counter++;
                continue;
            }
            if (counter == (sizeOfList / 2)) {
                return false;
            }
        }
        return false;
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