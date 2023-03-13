package dev.flows.core.functions;

@FunctionalInterface
public interface Fn3<E1, E2, E3, R1> {
  R1 apply(E1 e1, E2 e2, E3 e3);
}
