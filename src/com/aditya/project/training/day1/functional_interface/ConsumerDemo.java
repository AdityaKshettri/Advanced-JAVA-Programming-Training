package com.aditya.project.training.day1.functional_interface;

import java.util.function.Consumer;

public class ConsumerDemo {

    public static void main(String[] args) {

        Consumer<String> consumer = new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        };
        consumer.accept("Aditya");

        Consumer<String> consumer1 = (s) -> System.out.println(s);
        consumer1.accept("Adi");

        Consumer<Integer> consumer2 = (s) -> {
            if (s%2==0) {
                System.out.println("EVEN");
            } else {
                System.out.println("ODD");
            }
        };
        consumer2.accept(20);

        Consumer<Integer> consumer3 = (s) -> {
            int ans = s + 100;
            System.out.println(ans);
        };
        consumer3.accept(25);

        System.out.println("--- Using andThen ---");
        Consumer<Integer> consumer4 = consumer2.andThen(consumer3);
        consumer4.accept(45);
    }
}
