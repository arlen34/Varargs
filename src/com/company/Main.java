package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(themethod(88,1,88,3,4,5,6,7));
    }
    public static boolean themethod(int a, int ... val){
        for (int i = 0; i < val.length; i++) {
            if (a== val[i]) {
                return true;
            }
        }return false;
    }
}
