package dev.flows.core;

import dev.flows.core.tuples.T2;
import org.apache.kafka.common.record.Record;

public interface Stateless {
  T2<Record[], Error> apply(Record input);
}
