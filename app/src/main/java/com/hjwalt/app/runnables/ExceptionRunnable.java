package com.hjwalt.app.runnables;

public class ExceptionRunnable implements Runnable {

  @Override
  public void run() {
    try {
      Thread.sleep(6000);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
    throw new RuntimeException("test exception");
  }
}
