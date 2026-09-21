package O2;

/* JADX INFO: loaded from: classes.dex */
public final class s {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final O2.s f7937b = new O2.s(p078i6.C.Y0(new java.util.LinkedHashMap()));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.util.Map f7938a;

    public s(java.util.Map map) {
        this.f7938a = map;
    }

    public final java.lang.String a() {
        java.lang.String lowerCase = "Content-Type".toLowerCase(java.util.Locale.ROOT);
        kotlin.jvm.internal.m.d(lowerCase, "toLowerCase(...)");
        java.util.List list = (java.util.List) this.f7938a.get(lowerCase);
        if (list != null) {
            return (java.lang.String) p078i6.o.s1(list);
        }
        return null;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof O2.s) && kotlin.jvm.internal.m.a(this.f7938a, ((O2.s) obj).f7938a);
    }

    public final int hashCode() {
        return this.f7938a.hashCode();
    }

    public final java.lang.String toString() {
        return p121o0.p.r(new java.lang.StringBuilder("NetworkHeaders(data="), this.f7938a, ')');
    }
}
