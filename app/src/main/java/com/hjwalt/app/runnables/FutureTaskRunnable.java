package com.hjwalt.app.runnables;

import java.util.concurrent.FutureTask;

public class FutureTaskRunnable<T> implements Runnable {

  final FutureTask<T> task;

  public FutureTaskRunnable(FutureTask<T> task) {
    this.task = task;
  }

  @Override
  public void run() {
    System.out.println("starting");
    try {
      task.run();
    } catch (Exception e) {
      e.printStackTrace();
    }
    System.out.println("ending");
  }
}
