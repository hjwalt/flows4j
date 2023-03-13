package dev.flows.core;

import dev.flows.core.tuples.T2;
import dev.flows.core.tuples.T3;
import org.apache.kafka.common.record.Record;

public interface Stateful<S> {
  T2<String, Error> persistenceId(Record input);
  T3<Record[], S, Error> apply(Record input, S state);
}
