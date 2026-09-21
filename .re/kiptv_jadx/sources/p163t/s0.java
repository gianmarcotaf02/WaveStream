package p163t;

/* JADX INFO: loaded from: classes.dex */
public interface s0 {
    java.lang.Object a();

    java.lang.Object b();

    default boolean c(p154s.D d4, p154s.D d6) {
        return d4.equals(a()) && d6.equals(b());
    }
}
