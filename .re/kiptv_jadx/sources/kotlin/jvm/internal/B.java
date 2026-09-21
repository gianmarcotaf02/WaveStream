package kotlin.jvm.internal;

/* JADX INFO: loaded from: classes4.dex */
public abstract class B {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final kotlin.jvm.internal.C f24540a;

    static {
        kotlin.jvm.internal.C c9 = null;
        try {
            c9 = (kotlin.jvm.internal.C) H6.x0.class.newInstance();
        } catch (java.lang.ClassCastException | java.lang.ClassNotFoundException | java.lang.IllegalAccessException | java.lang.InstantiationException unused) {
        }
        if (c9 == null) {
            c9 = new kotlin.jvm.internal.C();
        }
        f24540a = c9;
    }

    public static E6.v a(java.lang.Class cls) {
        kotlin.jvm.internal.C c9 = f24540a;
        return c9.l(c9.b(cls), java.util.Collections.EMPTY_LIST, false);
    }

    public static E6.v b(java.lang.Class cls, E6.y yVar) {
        kotlin.jvm.internal.C c9 = f24540a;
        return c9.l(c9.b(cls), java.util.Collections.singletonList(yVar), false);
    }

    public static E6.v c(java.lang.Class cls, E6.y... yVarArr) {
        kotlin.jvm.internal.C c9 = f24540a;
        return c9.l(c9.b(cls), p078i6.m.E0(yVarArr), false);
    }
}
