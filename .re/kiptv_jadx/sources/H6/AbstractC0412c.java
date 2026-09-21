package H6;

/* JADX INFO: renamed from: H6.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC0412c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final H6.C0414d f4423a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final H6.C0414d f4424b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final H6.C0414d f4425c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final H6.C0414d f4426d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final H6.C0414d f4427e;

    static {
        H6.C0410b c0410b = H6.C0410b.f4410i;
        int i3 = H6.AbstractC0408a.f4408a;
        f4423a = new H6.C0414d(0, c0410b);
        f4424b = new H6.C0414d(0, H6.C0410b.j);
        f4425c = new H6.C0414d(0, H6.C0410b.f4411k);
        f4426d = new H6.C0414d(0, H6.C0410b.f4412l);
        f4427e = new H6.C0414d(0, H6.C0410b.f4413m);
    }

    public static final H6.B a(java.lang.Class jClass) {
        kotlin.jvm.internal.m.e(jClass, "jClass");
        java.lang.Object objA = f4423a.a(jClass);
        kotlin.jvm.internal.m.c(objA, "null cannot be cast to non-null type kotlin.reflect.jvm.internal.KClassImpl<T of kotlin.reflect.jvm.internal.CachesKt.getOrCreateKotlinClass>");
        return (H6.B) objA;
    }
}
