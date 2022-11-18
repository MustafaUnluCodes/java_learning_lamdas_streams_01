package com.example;

import com.example.chapter01.Calculator;
import com.example.chapter01.Greeting;
import com.example.chapter01.HelloGreeting;

import java.util.Random;
import java.util.function.IntBinaryOperator;

public class Main {

    public static void main(String[] args) {

        //  Method I: Normal Interface Implementation

        Greeting greeting = new HelloGreeting();

        greeting.sayHello();

        //  Method II: Anonoymous Method
        Greeting greeting2 = new Greeting() {
            @Override
            public void sayHello() {
                System.out.println("Hello World");
            }
        };

        greeting2.sayHello();


        //  Method III: use lambda
        Greeting greeting3 = () -> System.out.println("Hello World");

        greeting3.sayHello();




        Calculator calculator = (int x, int y) -> {
            Random random = new Random();

            int randomNumber = random.nextInt(50);

            return (x * y) + randomNumber;
        };

        System.out.println(calculator.calculate(1,2));




        IntBinaryOperator calculator2 = (int x, int y) -> {
            Random random = new Random();

            int randomNumber = random.nextInt(50);

            return (x * y) + randomNumber;
        };

        System.out.println(calculator2.applyAsInt(1,2));

    }
}
