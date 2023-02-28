package com.hjwalt.app.runnables;

import java.util.Date;
import java.util.TimerTask;

public class TimerRunnable extends TimerTask {

  @Override
  public void run() {
    System.out.println("Timer task started at:" + new Date());
    try {
      // assuming it takes 20 secs to complete the task
      Thread.sleep(2000);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
    System.out.println("Timer task finished at:" + new Date());
  }

}
