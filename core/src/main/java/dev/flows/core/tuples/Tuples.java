package dev.flows.core.tuples;

public class Tuples {

  private Tuples() {}

  // T2 =============================================

  public static <E1, E2> T2<E1, E2> of(E1 e1, E2 e2) {
    return new T2<>(e1, e2);
  }

  // T3 =============================================

  public static <E1, E2, E3> T3<E1, E2, E3> of(E1 e1, E2 e2, E3 e3) {
    return new T3<>(e1, e2, e3);
  }

  // T4 =============================================

  public static <E1, E2, E3, E4> T4<E1, E2, E3, E4> of(E1 e1, E2 e2, E3 e3, E4 e4) {
    return new T4<>(e1, e2, e3, e4);
  }

  // T5 =============================================

  public static <E1, E2, E3, E4, E5> T5<E1, E2, E3, E4, E5> of(E1 e1, E2 e2, E3 e3, E4 e4, E5 e5) {
    return new T5<>(e1, e2, e3, e4, e5);
  }
}
