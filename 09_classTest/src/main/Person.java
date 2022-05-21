package main;

import helper.*;

import java.util.Scanner;


public class Person {

    public static int sum(int a, int n){
        return a + n;
    }
    public static void main(String[] args) {
        System.out.println(Test.pi);
        Test.getPi();


        Test test1= new Test();
        test1.setNumber(19);
        Test test2=new Test();
        test2.setNumber(20);


        Test[] tests;
        System.out.println(test1.getNumber());
        System.out.println(test2.getNumber());


    }
}
