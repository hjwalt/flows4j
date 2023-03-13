package com.hjwalt.app.runnables;

import java.util.concurrent.BlockingQueue;

public class QueueProducerRunnable implements Runnable {

  BlockingQueue<String> queue;

  public QueueProducerRunnable(BlockingQueue<String> queue) {
    this.queue = queue;
  }

  @Override
  public void run() {
    for (int i = 0; i < 100; i++) {
      System.out.println("offering " + i);
      try {
        this.queue.put("offering " + i);
      } catch (InterruptedException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
      }
    }
  }
}
