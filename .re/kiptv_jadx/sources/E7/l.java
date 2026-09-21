package E7;

/* JADX INFO: loaded from: classes4.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final E7.l f3279a = new E7.l();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final E7.e f3280b = E7.e.f3230h;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final E7.a f3281c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final E7.i f3282d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final E7.i f3283e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final java.util.Set f3284f;

    static {
        E7.b[] bVarArr = E7.b.f3228h;
        f3281c = new E7.a(p101l7.e.g(java.lang.String.format("<Error class: %s>", java.util.Arrays.copyOf(new java.lang.Object[]{"unknown class"}, 1))));
        f3282d = c(E7.k.f3266o, new java.lang.String[0]);
        f3283e = c(E7.k.f3251B, new java.lang.String[0]);
        f3284f = com.google.crypto.tink.shaded.protobuf.AbstractC1909d.h0(new E7.f());
    }

    public static final E7.g a(E7.h hVar, boolean z6, java.lang.String... formatParams) {
        kotlin.jvm.internal.m.e(formatParams, "formatParams");
        if (!z6) {
            return new E7.g(hVar, (java.lang.String[]) java.util.Arrays.copyOf(formatParams, formatParams.length));
        }
        java.lang.String[] formatParams2 = (java.lang.String[]) java.util.Arrays.copyOf(formatParams, formatParams.length);
        kotlin.jvm.internal.m.e(formatParams2, "formatParams");
        return new E7.m(hVar, (java.lang.String[]) java.util.Arrays.copyOf(formatParams2, formatParams2.length));
    }

    public static final E7.g b(E7.h hVar, java.lang.String... strArr) {
        return a(hVar, false, (java.lang.String[]) java.util.Arrays.copyOf(strArr, strArr.length));
    }

    public static final E7.i c(E7.k kind, java.lang.String... strArr) {
        kotlin.jvm.internal.m.e(kind, "kind");
        p078i6.w wVar = p078i6.w.f23205h;
        java.lang.String[] formatParams = (java.lang.String[]) java.util.Arrays.copyOf(strArr, strArr.length);
        kotlin.jvm.internal.m.e(formatParams, "formatParams");
        return e(kind, wVar, d(kind, (java.lang.String[]) java.util.Arrays.copyOf(formatParams, formatParams.length)), (java.lang.String[]) java.util.Arrays.copyOf(formatParams, formatParams.length));
    }

    public static E7.j d(E7.k kind, java.lang.String... formatParams) {
        kotlin.jvm.internal.m.e(kind, "kind");
        kotlin.jvm.internal.m.e(formatParams, "formatParams");
        return new E7.j(kind, (java.lang.String[]) java.util.Arrays.copyOf(formatParams, formatParams.length));
    }

    public static E7.i e(E7.k kind, java.util.List list, C7.M m8, java.lang.String... formatParams) {
        kotlin.jvm.internal.m.e(kind, "kind");
        kotlin.jvm.internal.m.e(formatParams, "formatParams");
        return new E7.i(m8, b(E7.h.ERROR_TYPE_SCOPE, m8.toString()), kind, list, false, (java.lang.String[]) java.util.Arrays.copyOf(formatParams, formatParams.length));
    }

    public static final boolean f(N6.InterfaceC0697k interfaceC0697k) {
        if (interfaceC0697k != null) {
            return (interfaceC0697k instanceof E7.a) || (interfaceC0697k.h() instanceof E7.a) || interfaceC0697k == f3280b;
        }
        return false;
    }
}
