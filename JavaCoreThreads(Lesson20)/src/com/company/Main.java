package com.company;

import java.util.Scanner;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        myThread myThread = new myThread();
        RunnableThread runnableThread = new RunnableThread();

        myThread.start();
        myThread.join();
        myThread.getState();
        runnableThread.run();




    }
}
