package com.spring.anything.service;

import java.util.concurrent.atomic.AtomicLong;

public class AtomicLongClass {

    public static void main(String[] args) {
        useAtomicLong();
    }

    static void useAtomicLong() {

        AtomicLong long0 = new AtomicLong();
        System.out.println("atomicLong - 0: " + long0.get()); // 0

        AtomicLong long10 = new AtomicLong(10);
        System.out.println("atomicLong - 10: " + long10.get()); // 10

        long0.set(100);
        System.out.println("atomicLong - 0 -> set(100): " + long0.get()); // 100

        long long0AndSet = long0.getAndSet(200);
        System.out.println("getAndSet()-return: " + long0AndSet); // 100
        System.out.println("getAndSet()-long0: " + long0.get()); // 200

    }

}
