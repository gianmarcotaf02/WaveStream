package S1;

/* JADX INFO: loaded from: classes.dex */
public final class a extends kotlin.jvm.internal.o implements p194x6.j {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final S1.a f9199h = new S1.a(1);

    @Override // p194x6.j
    public final java.lang.Object invoke(java.lang.Object obj) {
        java.util.Map.Entry entry = (java.util.Map.Entry) obj;
        kotlin.jvm.internal.m.e(entry, "entry");
        java.lang.Object value = entry.getValue();
        return B2.a.o(new java.lang.StringBuilder("  "), ((S1.e) entry.getKey()).f9205a, " = ", value instanceof byte[] ? p078i6.m.u0((byte[]) value, ", ", null, 56) : java.lang.String.valueOf(entry.getValue()));
    }
}
