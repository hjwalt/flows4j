package com.hjwalt.app.threads;

public class MyThread extends Thread {
  public MyThread(String name) {
    super(name);
  }

  @Override
  public void run() {
    try {
      Thread.sleep(6000);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
    System.out.println("mythread processing completed");
  }
}
