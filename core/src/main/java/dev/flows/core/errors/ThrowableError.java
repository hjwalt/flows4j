package dev.flows.core.errors;

import dev.flows.core.Error;

public class ThrowableError implements Error {

  final Throwable throwable;

  public ThrowableError(Throwable t) {
    this.throwable = t;
  }

  @Override
  public String getReason() {
    return this.throwable.getMessage();
  }
}
