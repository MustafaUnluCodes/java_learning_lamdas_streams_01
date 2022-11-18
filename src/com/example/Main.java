package com.example;

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

    }
}
