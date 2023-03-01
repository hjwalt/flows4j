package com.hjwalt.app.callables;

import java.util.concurrent.Callable;

public class StringCallable implements Callable<String> {

  public StringCallable(String result) {
    this.result = result;
  }

  final String result;

  @Override
  public String call() throws Exception {
    Thread.sleep(5000);
    return this.result;
  }
}
