package dev.flows.core.functions;

@FunctionalInterface
public interface Fn5<E1, E2, E3, E4, E5, R1> {
  R1 apply(E1 e1, E2 e2, E3 e3, E4 e4, E5 e5);
}
