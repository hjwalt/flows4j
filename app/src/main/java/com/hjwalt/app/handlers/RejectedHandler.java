package com.hjwalt.app.handlers;

import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadPoolExecutor;
import com.hjwalt.app.exceptions.RejectedException;

public class RejectedHandler implements RejectedExecutionHandler{

  @Override
  public void rejectedExecution(Runnable r, ThreadPoolExecutor executor) {
    System.out.println(r.toString() + " is rejected");
    throw new RejectedException();
  }
  
}
