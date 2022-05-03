package com.example.salemjavafx;

import java.util.concurrent.*;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class week13_ex30_4 {
    private int n = 0;

    public static void main(String[] args) {

        week13_ex30_4 ex = new week13_ex30_4();
        System.out.println("sum is " + ex.n + ".");

    }

    week13_ex30_4() {

        ExecutorService exe = Executors.newFixedThreadPool(1000);
        for(int i = 1; i <= 1000; i++) {
            exe.execute(new exercise());
            System.out.println("thread number " + i + " sum " + n + " , ");
        }

        exe.shutdown();

    }

    class exercise implements Runnable {

        public void run() {

            int value = n + 1;
            n = value;
        }
    }
}

