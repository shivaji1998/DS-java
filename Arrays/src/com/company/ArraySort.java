package com.company;

import java.util.Arrays;

public class ArraySort {
    public static int search(int array[], int key){
        for (int i=0;i<array.length;i++) {
            if (array[i]==key)
                return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        int a1[] = new int[] {3,7,2,4,6,9,1};
        for (int i=0;i<a1.length;i++) {
            System.out.print(a1[i]+" ");
        }
//        Arrays.sort(a1);
//        System.out.println();
//        for (int i =0;i<a1.length;i++) {
//            System.out.print(a1[i]);
//        }
        int indexValue= search(a1,9);
        if (indexValue==-1)
            System.out.println(" elements not found");
        else
            System.out.println("element is found at index "+ indexValue);

    }
}
