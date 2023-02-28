/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package com.hjwalt.app;

import java.lang.Thread.UncaughtExceptionHandler;
import java.util.Timer;
import com.hjwalt.app.runnables.ExceptionRunnable;
import com.hjwalt.app.runnables.HeavyWorkRunnable;
import com.hjwalt.app.runnables.ObjectNotifyAllRunnable;
import com.hjwalt.app.runnables.ObjectNotifyRunnable;
import com.hjwalt.app.runnables.ObjectWaitRunnable;
import com.hjwalt.app.runnables.ThreadLocalRunnable;
import com.hjwalt.app.runnables.TimerRunnable;
import com.hjwalt.app.runnables.ZombieRunnable;
import com.hjwalt.app.threads.MyThread;

public class App {
    public static void main(String[] args) {
        timer();
    }

    static class Handler implements UncaughtExceptionHandler {

        @Override
        public void uncaughtException(Thread t, Throwable e) {
            // TODO Auto-generated method stub
            throw new UnsupportedOperationException("Unimplemented method 'uncaughtException'");
        }

    }

    static void timer() {
        // if timer delay is shorter than execution, task will always run
        Timer timer = new Timer(true);
        timer.scheduleAtFixedRate(new TimerRunnable(), 0, 4*1000);
        try {
            Thread.sleep(120000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    static void zombie() {
        Thread zombie = new Thread(new ZombieRunnable(), "zombie");
        zombie.start();
    }

    static void threadLocal() {
        for (int i = 0; i < 10; i++) {
            Thread local = new Thread(new ThreadLocalRunnable("local"+i),"local"+i);
            local.start();
        }
    }

    static void exception() {
        Object toLock = new Object();
        Thread wait1 = new Thread(new ObjectWaitRunnable(toLock, "wait1"), "wait1");
        Thread wait2 = new Thread(new ObjectWaitRunnable(toLock, "wait2"), "wait2");
        Thread notify1 = new Thread(new ObjectNotifyAllRunnable(toLock, "notify1"), "notify1");
        Thread exception = new Thread(new ExceptionRunnable(), "exception");

        wait1.start();
        wait2.start();
        notify1.start();
        exception.start();

        exception.setUncaughtExceptionHandler(null);
    }

    static void signalNotifyAll() {
        Object toLock = new Object();
        Thread wait1 = new Thread(new ObjectWaitRunnable(toLock, "wait1"), "wait1");
        Thread wait2 = new Thread(new ObjectWaitRunnable(toLock, "wait2"), "wait2");
        Thread notify1 = new Thread(new ObjectNotifyAllRunnable(toLock, "notify1"), "notify1");

        wait1.start();
        wait2.start();
        notify1.start();
    }

    static void signalNotify() {
        Object toLock = new Object();
        Thread wait1 = new Thread(new ObjectWaitRunnable(toLock, "wait1"), "wait1");
        Thread wait2 = new Thread(new ObjectWaitRunnable(toLock, "wait2"), "wait2");
        Thread notify1 = new Thread(new ObjectNotifyRunnable(toLock, "notify1"), "notify1");
        Thread notify2 = new Thread(new ObjectNotifyRunnable(toLock, "notify2"), "notify2");

        wait1.start();
        wait2.start();
        notify1.start();
        notify2.start();
    }

    static void basic() {

        Thread t1 = new Thread(new HeavyWorkRunnable(), "t1");
        Thread t2 = new Thread(new HeavyWorkRunnable(), "t2");

        System.out.println("starting runnable");
        
        t1.start();
        t2.start();

        System.out.println("runnable started");

        Thread t3 = new MyThread("t3");
        Thread t4 = new MyThread("t4");

        System.out.println("starting my threads");

        t3.start();
        t4.start();

        System.out.println("my threads started");
    }
}
