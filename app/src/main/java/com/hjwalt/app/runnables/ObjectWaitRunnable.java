package com.hjwalt.app.runnables;

public class ObjectWaitRunnable implements Runnable {

  Object locked;
  String name;

  public ObjectWaitRunnable(Object toLock, String name) {
    this.locked = toLock;
    this.name = name;
  }

  @Override
  public void run() {
    try {
      Thread.sleep(1000);
      System.out.println("Thread " + name + ": starting");
      synchronized (locked) {
        System.out.println("Thread " + name + ": waiting");
        locked.wait();
        System.out.println("Thread " + name + ": wait done");
      }
      System.out.println("Thread " + name + ": done");
    } catch (InterruptedException e) {
      System.out.println("Thread " + name + ": exception");
      e.printStackTrace();
    }
  }
}
