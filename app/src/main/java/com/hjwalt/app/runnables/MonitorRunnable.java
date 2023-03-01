package com.hjwalt.app.runnables;

import java.util.concurrent.ThreadPoolExecutor;

public class MonitorRunnable implements Runnable {

  public MonitorRunnable(ThreadPoolExecutor executor) {
    this.executor = executor;
  }

  final ThreadPoolExecutor executor;

  boolean run = true;

  @Override
  public void run() {
    while (run) {
      System.out.println(String.format(
          "[monitor] [%d/%d] Active: %d, Queued: %d, Completed: %d, Task: %d, isShutdown: %s, isTerminated: %s",
          this.executor.getPoolSize(), this.executor.getCorePoolSize(),
          this.executor.getActiveCount(), this.executor.getQueue().size(),
          this.executor.getCompletedTaskCount(), this.executor.getTaskCount(),
          this.executor.isShutdown(), this.executor.isTerminated()));
      try {
        Thread.sleep(1 * 1000);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }
  }

  public void shutdown() {
    this.run = false;
  }

}
