package com.hjwalt.app.runnables;

public class ThreadLocalRunnable implements Runnable {

  static final ThreadLocal<Integer> count = new ThreadLocal<Integer>(){
    @Override
    protected Integer initialValue() {
      return 0;
    }
  };

  String name;

  public ThreadLocalRunnable(String name) {
    this.name = name;
  }

  @Override
  public void run() {
    for(int i=0 ; i<10; i++){
      System.out.println("Thread " + name + ": count" + count.get());
      count.set(count.get() + 1);  
    }
  }
  
}
