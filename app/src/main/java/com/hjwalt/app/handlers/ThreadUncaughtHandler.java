package com.hjwalt.app.handlers;

import java.lang.Thread.UncaughtExceptionHandler;

public class ThreadUncaughtHandler implements UncaughtExceptionHandler {

  @Override
  public void uncaughtException(Thread t, Throwable e) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'uncaughtException'");
  }
}
