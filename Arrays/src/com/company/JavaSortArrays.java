package com.company;

public class JavaSortArrays {

    public static void main(String[] args) {
//        printTrib(6);

//        System.out.println(fib(6));
        int ans = fun(100,2000);
        System.out.println(ans);

    }

    public static int fun(int a, int b){
        if(b==0){
            return a;
        }else
            return fun(b,a%b);
    }

    public static int fib(int n){
        if(n<=1){
            return n;
        }
        return fib(n-1)+fib(n-2);
    }

    public static int printTpRec(int n){
        if(n==0|| n==1||n==2){
            return 0;
        }
        if(n==3)
            return 1;

        else
            return printTpRec(n-1) + printTpRec(n-2) + printTpRec(n-3);
    }

    public static void printTrib(int n){
        for(int i=1;i<n;i++){
            System.out.println(printTpRec(i)+" ");
        }
    }
}


