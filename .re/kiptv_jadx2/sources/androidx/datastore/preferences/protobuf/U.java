package androidx.datastore.preferences.protobuf;

import Z.AbstractC1149h0;
import java.util.concurrent.ConcurrentHashMap;

public final class U {

    public static final U f16162c = new U();

    public final ConcurrentHashMap f16164b = new ConcurrentHashMap();

    public final F f16163a = new F();

    public final X a(Class cls) {
        X x9;
        Class cls2;
        AbstractC1516x.a(cls, "messageType");
        ConcurrentHashMap concurrentHashMap = this.f16164b;
        X x10 = (X) concurrentHashMap.get(cls);
        if (x10 != null) {
            return x10;
        }
        F f9 = this.f16163a;
        f9.getClass();
        Class cls3 = Y.f16171a;
        if (!AbstractC1514v.class.isAssignableFrom(cls) && (cls2 = Y.f16171a) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
        W wA = ((E) f9.f16134a).a(cls);
        if ((wA.f16170d & 2) == 2) {
            boolean zIsAssignableFrom = AbstractC1514v.class.isAssignableFrom(cls);
            AbstractC1514v abstractC1514v = wA.f16167a;
            if (zIsAssignableFrom) {
                x9 = new O(Y.f16173c, AbstractC1509p.f16239a, abstractC1514v);
            } else {
                f0 f0Var = Y.f16172b;
                C1508o c1508o = AbstractC1509p.f16240b;
                if (c1508o == null) {
                    throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
                }
                x9 = new O(f0Var, c1508o, abstractC1514v);
            }
        } else if (AbstractC1514v.class.isAssignableFrom(cls)) {
            C1508o c1508o2 = null;
            P p2 = Q.f16161b;
            C c9 = D.f16131b;
            f0 f0Var2 = Y.f16173c;
            if (AbstractC1149h0.c(wA.a()) != 1) {
                c1508o2 = AbstractC1509p.f16239a;
            }
            C1508o c1508o3 = c1508o2;
            J j = K.f16142b;
            int[] iArr = N.f16144n;
            if (!(wA instanceof W)) {
                wA.getClass();
                throw new ClassCastException();
            }
            x9 = N.x(wA, p2, c9, f0Var2, c1508o3, j);
        } else {
            C1508o c1508o4 = null;
            P p9 = Q.f16160a;
            C c10 = D.f16130a;
            f0 f0Var3 = Y.f16172b;
            if (AbstractC1149h0.c(wA.a()) != 1 && (c1508o4 = AbstractC1509p.f16240b) == null) {
                throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
            }
            C1508o c1508o5 = c1508o4;
            J j9 = K.f16141a;
            int[] iArr2 = N.f16144n;
            if (!(wA instanceof W)) {
                wA.getClass();
                throw new ClassCastException();
            }
            x9 = N.x(wA, p9, c10, f0Var3, c1508o5, j9);
        }
        X x11 = (X) concurrentHashMap.putIfAbsent(cls, x9);
        return x11 != null ? x11 : x9;
    }
}
