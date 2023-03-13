package com.hjwalt.app.runnables;

public class NamedRunnable implements Runnable {

  public NamedRunnable(String name) {
    this.name = name;
  }

  final String name;

  @Override
  public void run() {
    try {
      Thread.sleep(1000);
      System.out.println("Thread " + name + ": starting");
      Thread.sleep(5000);
      System.out.println("Thread " + name + ": stopping");
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
  }

  @Override
  public String toString() {
    // TODO Auto-generated method stub
    return name;
  }
}
