package org.example;

public class Main {
    public static void main(String[] args) {
        //пример переполнения
        int a = 130;
        byte b = a;
        System.out.println(b);

        //пример вычисления комбинаций типов данных
        int intValue = 100;
        byte byteValue = 5;
        double doubleValue = 2.0;

        System.out.println(intValue + doubleValue);//102.0
        System.out.println(intValue / doubleValue);//50.0
        System.out.println(intValue % doubleValue);//0.0

        System.out.println(intValue + byteValue);//105
        System.out.println(intValue / byteValue);//20
        System.out.println(intValue % byteValue);//0


    }
}