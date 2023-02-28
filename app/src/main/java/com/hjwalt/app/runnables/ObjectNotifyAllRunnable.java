package com.hjwalt.app.runnables;

public class ObjectNotifyAllRunnable implements Runnable {
  
  Object locked;
  String name;

  public ObjectNotifyAllRunnable(Object toLock, String name) {
    this.locked = toLock;
    this.name = name;
  }

  @Override
  public void run() {
    try {
      Thread.sleep(2000);
      System.out.println("Thread " + name + ": starting");
      synchronized(locked) {
        System.out.println("Thread " + name + ": sleeping");
        Thread.sleep(6000);
        System.out.println("Thread " + name + ": notifying");
        locked.notifyAll();
        System.out.println("Thread " + name + ": notify done");
      }
      System.out.println("Thread " + name + ": done");
    } catch (InterruptedException e) {
      System.out.println("Thread " + name + ": exception");
      e.printStackTrace();
    }
  }

}
