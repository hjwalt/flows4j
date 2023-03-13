package dev.flows.core.errors;

import dev.flows.core.Error;

public class BasicError implements Error {

  final String reason;

  public BasicError(String reason) {
    this.reason = reason;
  }

  @Override
  public String getReason() {
    return this.reason;
  }
}
