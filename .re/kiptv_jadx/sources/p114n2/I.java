package p114n2;

/* JADX INFO: loaded from: classes.dex */
public abstract class I {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final p114n2.C2645d f25598b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final p114n2.C2644c f25599c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final p114n2.C2645d f25600d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final p114n2.C2644c f25601e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final p114n2.C2645d f25602f;
    public static final p114n2.C2644c g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final p114n2.C2645d f25603h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final p114n2.C2644c f25604i;
    public static final p114n2.C2645d j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final p114n2.C2644c f25605k;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f25606a;

    static {
        boolean z6 = false;
        f25598b = new p114n2.C2645d(z6, 2);
        boolean z9 = true;
        f25599c = new p114n2.C2644c(z9, 2);
        f25600d = new p114n2.C2645d(z6, 3);
        f25601e = new p114n2.C2644c(z9, 3);
        f25602f = new p114n2.C2645d(z6, 1);
        g = new p114n2.C2644c(z9, 1);
        f25603h = new p114n2.C2645d(z6, 0);
        f25604i = new p114n2.C2644c(z9, 0);
        j = new p114n2.C2645d(z9, 4);
        f25605k = new p114n2.C2644c(z9, 4);
    }

    public I(boolean z6) {
        this.f25606a = z6;
    }

    public abstract java.lang.Object a(java.lang.String str, android.os.Bundle bundle);

    public abstract java.lang.String b();

    public java.lang.Object c(java.lang.Object obj, java.lang.String str) {
        return d(str);
    }

    public abstract java.lang.Object d(java.lang.String str);

    public abstract void e(android.os.Bundle bundle, java.lang.String str, java.lang.Object obj);

    public boolean f(java.lang.Object obj, java.lang.Object obj2) {
        return kotlin.jvm.internal.m.a(obj, obj2);
    }

    public final java.lang.String toString() {
        return b();
    }
}
