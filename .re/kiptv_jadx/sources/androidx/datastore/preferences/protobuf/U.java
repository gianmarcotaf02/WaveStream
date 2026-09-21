package androidx.datastore.preferences.protobuf;

/* JADX INFO: loaded from: classes.dex */
public final class U {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final androidx.datastore.preferences.protobuf.U f16162c = new androidx.datastore.preferences.protobuf.U();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f16164b = new java.util.concurrent.ConcurrentHashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final androidx.datastore.preferences.protobuf.F f16163a = new androidx.datastore.preferences.protobuf.F();

    public final androidx.datastore.preferences.protobuf.X a(java.lang.Class cls) {
        androidx.datastore.preferences.protobuf.X x9;
        java.lang.Class cls2;
        androidx.datastore.preferences.protobuf.AbstractC1516x.a(cls, "messageType");
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f16164b;
        androidx.datastore.preferences.protobuf.X x10 = (androidx.datastore.preferences.protobuf.X) concurrentHashMap.get(cls);
        if (x10 != null) {
            return x10;
        }
        androidx.datastore.preferences.protobuf.F f9 = this.f16163a;
        f9.getClass();
        java.lang.Class cls3 = androidx.datastore.preferences.protobuf.Y.f16171a;
        if (!androidx.datastore.preferences.protobuf.AbstractC1514v.class.isAssignableFrom(cls) && (cls2 = androidx.datastore.preferences.protobuf.Y.f16171a) != null && !cls2.isAssignableFrom(cls)) {
            throw new java.lang.IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
        androidx.datastore.preferences.protobuf.W wA = ((androidx.datastore.preferences.protobuf.E) f9.f16134a).a(cls);
        if ((wA.f16170d & 2) == 2) {
            boolean zIsAssignableFrom = androidx.datastore.preferences.protobuf.AbstractC1514v.class.isAssignableFrom(cls);
            androidx.datastore.preferences.protobuf.AbstractC1514v abstractC1514v = wA.f16167a;
            if (zIsAssignableFrom) {
                x9 = new androidx.datastore.preferences.protobuf.O(androidx.datastore.preferences.protobuf.Y.f16173c, androidx.datastore.preferences.protobuf.AbstractC1509p.f16239a, abstractC1514v);
            } else {
                androidx.datastore.preferences.protobuf.f0 f0Var = androidx.datastore.preferences.protobuf.Y.f16172b;
                androidx.datastore.preferences.protobuf.C1508o c1508o = androidx.datastore.preferences.protobuf.AbstractC1509p.f16240b;
                if (c1508o == null) {
                    throw new java.lang.IllegalStateException("Protobuf runtime is not correctly loaded.");
                }
                x9 = new androidx.datastore.preferences.protobuf.O(f0Var, c1508o, abstractC1514v);
            }
        } else if (androidx.datastore.preferences.protobuf.AbstractC1514v.class.isAssignableFrom(cls)) {
            androidx.datastore.preferences.protobuf.C1508o c1508o2 = null;
            androidx.datastore.preferences.protobuf.P p2 = androidx.datastore.preferences.protobuf.Q.f16161b;
            androidx.datastore.preferences.protobuf.C c9 = androidx.datastore.preferences.protobuf.D.f16131b;
            androidx.datastore.preferences.protobuf.f0 f0Var2 = androidx.datastore.preferences.protobuf.Y.f16173c;
            if (Z.AbstractC1149h0.c(wA.a()) != 1) {
                c1508o2 = androidx.datastore.preferences.protobuf.AbstractC1509p.f16239a;
            }
            androidx.datastore.preferences.protobuf.C1508o c1508o3 = c1508o2;
            androidx.datastore.preferences.protobuf.J j = androidx.datastore.preferences.protobuf.K.f16142b;
            int[] iArr = androidx.datastore.preferences.protobuf.N.f16144n;
            if (!(wA instanceof androidx.datastore.preferences.protobuf.W)) {
                wA.getClass();
                throw new java.lang.ClassCastException();
            }
            x9 = androidx.datastore.preferences.protobuf.N.x(wA, p2, c9, f0Var2, c1508o3, j);
        } else {
            androidx.datastore.preferences.protobuf.C1508o c1508o4 = null;
            androidx.datastore.preferences.protobuf.P p9 = androidx.datastore.preferences.protobuf.Q.f16160a;
            androidx.datastore.preferences.protobuf.C c10 = androidx.datastore.preferences.protobuf.D.f16130a;
            androidx.datastore.preferences.protobuf.f0 f0Var3 = androidx.datastore.preferences.protobuf.Y.f16172b;
            if (Z.AbstractC1149h0.c(wA.a()) != 1 && (c1508o4 = androidx.datastore.preferences.protobuf.AbstractC1509p.f16240b) == null) {
                throw new java.lang.IllegalStateException("Protobuf runtime is not correctly loaded.");
            }
            androidx.datastore.preferences.protobuf.C1508o c1508o5 = c1508o4;
            androidx.datastore.preferences.protobuf.J j9 = androidx.datastore.preferences.protobuf.K.f16141a;
            int[] iArr2 = androidx.datastore.preferences.protobuf.N.f16144n;
            if (!(wA instanceof androidx.datastore.preferences.protobuf.W)) {
                wA.getClass();
                throw new java.lang.ClassCastException();
            }
            x9 = androidx.datastore.preferences.protobuf.N.x(wA, p9, c10, f0Var3, c1508o5, j9);
        }
        androidx.datastore.preferences.protobuf.X x11 = (androidx.datastore.preferences.protobuf.X) concurrentHashMap.putIfAbsent(cls, x9);
        return x11 != null ? x11 : x9;
    }
}
