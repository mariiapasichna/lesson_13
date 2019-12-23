package com.mariiapasichna;

import java.util.Random;

public class Main {

    /*1) реализовать методы get, set, add
2*) реализовать все остальные перечисленные методы + проверки*/

    public static void main(String[] args) {
        MyList myList = new MyList();
        System.out.println(myList.toString());
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            myList.add(random.nextInt(100));
        }
        System.out.println(myList.toString());
        System.out.println(myList.get(4));
        myList.set(2, 56);
        System.out.println(myList.toString());
        myList.add(34);
        System.out.println(myList.toString());
        myList.add(12);
        System.out.println(myList.toString());
        System.out.println(myList.size());
        System.out.println(myList.isEmpty());
        myList.add(12, 90);
        System.out.println(myList.toString());
        myList.remove(5);
        System.out.println(myList.toString());
        myList.removeByValue(56);
        System.out.println(myList.toString());
        myList.toArray();
        System.out.println(myList.toString());
        myList.sort();
        System.out.println(myList);
        myList.clear();
        System.out.println(myList.toString());
    }
}