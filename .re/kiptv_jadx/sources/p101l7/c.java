package p101l7;

/* JADX INFO: loaded from: classes4.dex */
public final class c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final p101l7.c f24828c = new p101l7.c("");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p101l7.d f24829a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public transient p101l7.c f24830b;

    public c(java.lang.String fqName) {
        kotlin.jvm.internal.m.e(fqName, "fqName");
        this.f24829a = new p101l7.d(fqName, this);
    }

    public final p101l7.c a(p101l7.e name) {
        kotlin.jvm.internal.m.e(name, "name");
        return new p101l7.c(this.f24829a.a(name), this);
    }

    public final p101l7.c b() {
        p101l7.c cVar = this.f24830b;
        if (cVar != null) {
            return cVar;
        }
        p101l7.d dVar = this.f24829a;
        if (dVar.c()) {
            throw new java.lang.IllegalStateException("root");
        }
        p101l7.d dVar2 = dVar.f24834c;
        if (dVar2 == null) {
            if (dVar.c()) {
                throw new java.lang.IllegalStateException("root");
            }
            dVar.b();
            dVar2 = dVar.f24834c;
            kotlin.jvm.internal.m.b(dVar2);
        }
        p101l7.c cVar2 = new p101l7.c(dVar2);
        this.f24830b = cVar2;
        return cVar2;
    }

    public final boolean c(p101l7.e segment) {
        kotlin.jvm.internal.m.e(segment, "segment");
        p101l7.d dVar = this.f24829a;
        dVar.getClass();
        if (!dVar.c()) {
            java.lang.String str = dVar.f24832a;
            int iK0 = O7.q.K0(str, '.', 0, 6);
            if (iK0 == -1) {
                iK0 = str.length();
            }
            int i3 = iK0;
            java.lang.String strB = segment.b();
            kotlin.jvm.internal.m.d(strB, "asString(...)");
            if (i3 == strB.length() && O7.x.t0(0, 0, i3, dVar.f24832a, strB, false)) {
                return true;
            }
        }
        return false;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof p101l7.c) {
            return kotlin.jvm.internal.m.a(this.f24829a, ((p101l7.c) obj).f24829a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f24829a.f24832a.hashCode();
    }

    public final java.lang.String toString() {
        return this.f24829a.toString();
    }

    public c(p101l7.d fqName) {
        kotlin.jvm.internal.m.e(fqName, "fqName");
        this.f24829a = fqName;
    }

    public c(p101l7.d dVar, p101l7.c cVar) {
        this.f24829a = dVar;
        this.f24830b = cVar;
    }
}
