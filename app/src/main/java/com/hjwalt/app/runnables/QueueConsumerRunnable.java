package com.hjwalt.app.runnables;

import java.util.concurrent.BlockingQueue;

public class QueueConsumerRunnable implements Runnable {

  BlockingQueue<String> queue;

  String name;

  int delay;

  public QueueConsumerRunnable(BlockingQueue<String> queue, String name, int delay) {
    this.queue = queue;
    this.name = name;
    this.delay = delay;
  }

  @Override
  public void run() {
    try {
      String message;  
      while ((message = queue.take()) != "exit") {
        Thread.sleep(delay);
        System.out.println("consumer "+name+": " + message);
      }
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
  }
  
}
