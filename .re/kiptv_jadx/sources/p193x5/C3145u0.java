package p193x5;

/* JADX INFO: renamed from: x5.u0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3145u0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f31657a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.util.List f31658b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final java.util.Map f31659c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final java.util.Map f31660d;

    public C3145u0(boolean z6, java.util.List categories, java.util.Map byCategory, java.util.Map nameMap) {
        kotlin.jvm.internal.m.e(categories, "categories");
        kotlin.jvm.internal.m.e(byCategory, "byCategory");
        kotlin.jvm.internal.m.e(nameMap, "nameMap");
        this.f31657a = z6;
        this.f31658b = categories;
        this.f31659c = byCategory;
        this.f31660d = nameMap;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p193x5.C3145u0)) {
            return false;
        }
        p193x5.C3145u0 c3145u0 = (p193x5.C3145u0) obj;
        return this.f31657a == c3145u0.f31657a && kotlin.jvm.internal.m.a(this.f31658b, c3145u0.f31658b) && kotlin.jvm.internal.m.a(this.f31659c, c3145u0.f31659c) && kotlin.jvm.internal.m.a(this.f31660d, c3145u0.f31660d);
    }

    public final int hashCode() {
        return this.f31660d.hashCode() + B2.a.c(B2.a.b(java.lang.Boolean.hashCode(this.f31657a) * 31, 31, this.f31658b), 31, this.f31659c);
    }

    public final java.lang.String toString() {
        return "RawLive(ready=" + this.f31657a + ", categories=" + this.f31658b + ", byCategory=" + this.f31659c + ", nameMap=" + this.f31660d + ")";
    }
}
