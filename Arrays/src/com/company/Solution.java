package com.company;

import java.util.*;

class Solution{
    public static void main(String []argh) {

//        int[] a1 = new int[6];
//        int count =1;
//
//        for (int i=0;i<a1.length;i++)
//        {
//            a1[i]=count;
//            count++;
//        }
//        for (int j=0;j<a1.length;j++) {
//            System.out.println(a1[j]+" ");
//        }
        //implementation of 2d array
        int[][] a1 = new int[3][4];
        int count = 1;
        for (int i = 0; i < a1.length; i++) {
            for (int j = 0; j < a1[i].length; j++) {
                a1[i][j] = count;
                count++;
            }
        }
            for (int i = 0; i < a1.length; i++) {
                for (int j = 0; j < a1[i].length; j++) {
                    System.out.println(a1[i][j]+" ");
                }
                System.out.println();
            }

        }

    }