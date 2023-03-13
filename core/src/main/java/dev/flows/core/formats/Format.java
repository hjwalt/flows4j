package dev.flows.core.formats;

import dev.flows.core.tuples.T2;

public interface Format<T> {
  T getDefault();

  T2<byte[], Error> serialize(T value);

  T2<T, Error> deserialize(byte[] bytes);

  T2<byte[], Error> toJson(T value);

  T2<T, Error> fromJson(byte[] bytes);
}
