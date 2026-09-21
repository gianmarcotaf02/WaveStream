package p101l7;

/* JADX INFO: loaded from: classes4.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p101l7.c f24825a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p101l7.c f24826b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f24827c;

    public b(p101l7.c packageFqName, p101l7.c relativeClassName, boolean z6) {
        kotlin.jvm.internal.m.e(packageFqName, "packageFqName");
        kotlin.jvm.internal.m.e(relativeClassName, "relativeClassName");
        this.f24825a = packageFqName;
        this.f24826b = relativeClassName;
        this.f24827c = z6;
        relativeClassName.f24829a.c();
    }

    public static final java.lang.String c(p101l7.c cVar) {
        java.lang.String str = cVar.f24829a.f24832a;
        return O7.q.C0(str, '/') ? B2.a.i('`', "`", str) : str;
    }

    public final p101l7.c a() {
        p101l7.c cVar = this.f24825a;
        boolean zC = cVar.f24829a.c();
        p101l7.c cVar2 = this.f24826b;
        if (zC) {
            return cVar2;
        }
        return new p101l7.c(cVar.f24829a.f24832a + '.' + cVar2.f24829a.f24832a);
    }

    public final java.lang.String b() {
        p101l7.c cVar = this.f24825a;
        boolean zC = cVar.f24829a.c();
        p101l7.c cVar2 = this.f24826b;
        if (zC) {
            return c(cVar2);
        }
        return O7.x.v0(cVar.f24829a.f24832a, '.', '/') + "/" + c(cVar2);
    }

    public final p101l7.b d(p101l7.e name) {
        kotlin.jvm.internal.m.e(name, "name");
        return new p101l7.b(this.f24825a, this.f24826b.a(name), this.f24827c);
    }

    public final p101l7.b e() {
        p101l7.c cVarB = this.f24826b.b();
        if (cVarB.f24829a.c()) {
            return null;
        }
        return new p101l7.b(this.f24825a, cVarB, this.f24827c);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p101l7.b)) {
            return false;
        }
        p101l7.b bVar = (p101l7.b) obj;
        return kotlin.jvm.internal.m.a(this.f24825a, bVar.f24825a) && kotlin.jvm.internal.m.a(this.f24826b, bVar.f24826b) && this.f24827c == bVar.f24827c;
    }

    public final p101l7.e f() {
        return this.f24826b.f24829a.f();
    }

    public final boolean g() {
        return !this.f24826b.b().f24829a.c();
    }

    public final int hashCode() {
        return java.lang.Boolean.hashCode(this.f24827c) + ((this.f24826b.hashCode() + (this.f24825a.hashCode() * 31)) * 31);
    }

    public final java.lang.String toString() {
        if (!this.f24825a.f24829a.c()) {
            return b();
        }
        return "/" + b();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public b(p101l7.c packageFqName, p101l7.e topLevelName) {
        this(packageFqName, com.google.common.util.concurrent.D.M(topLevelName), false);
        kotlin.jvm.internal.m.e(packageFqName, "packageFqName");
        kotlin.jvm.internal.m.e(topLevelName, "topLevelName");
        p101l7.c cVar = p101l7.c.f24828c;
    }
}
