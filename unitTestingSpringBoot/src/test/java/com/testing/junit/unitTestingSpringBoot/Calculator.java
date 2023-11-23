package com.testing.junit.unitTestingSpringBoot;

public class Calculator {

    public int doSum(int a , int b , int c){
        return  a + b+ c;
    }

    public int doProduct(int a , int b){
        return a * b;
    }

    //Compare

    public Boolean compareTwoNums(int a , int b){
        return  a == b;
    }
}
