package dev.flows.core.functions;

import java.util.function.BiFunction;

@FunctionalInterface
public interface Fn2<E1, E2, R1> extends BiFunction<E1, E2, R1> {}
