package p163t;

import p154s.D;

public interface s0 {
    Object a();

    Object b();

    default boolean c(D d4, D d6) {
        return d4.equals(a()) && d6.equals(b());
    }
}
