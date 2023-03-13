package com.hjwalt.app.runnables;

public class HeavyWorkRunnable implements Runnable {

  @Override
  public void run() {
    try {
      Thread.sleep(6000);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
    System.out.println("heavy work runnable processing completed");
  }
}
