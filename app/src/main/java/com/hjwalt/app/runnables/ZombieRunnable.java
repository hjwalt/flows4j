package com.hjwalt.app.runnables;

public class ZombieRunnable implements Runnable {

  @Override
  public void run() {
    try {
      while (true) {
        Thread.sleep(6000);
      }
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
    throw new RuntimeException("test exception");
  }
}
