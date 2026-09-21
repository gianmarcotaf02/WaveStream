package p101l7;

/* JADX INFO: loaded from: classes4.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p101l7.c f24823a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p101l7.e f24824b;

    static {
        p101l7.e eVar = p101l7.g.f24845f;
        p101l7.c cVar = p101l7.c.f24828c;
        com.google.common.util.concurrent.D.M(eVar);
    }

    public a(p101l7.c packageName, p101l7.e eVar) {
        kotlin.jvm.internal.m.e(packageName, "packageName");
        this.f24823a = packageName;
        this.f24824b = eVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p101l7.a)) {
            return false;
        }
        p101l7.a aVar = (p101l7.a) obj;
        return kotlin.jvm.internal.m.a(this.f24823a, aVar.f24823a) && this.f24824b.equals(aVar.f24824b);
    }

    public final int hashCode() {
        return this.f24824b.hashCode() + ((this.f24823a.hashCode() + 527) * 961);
    }

    public final java.lang.String toString() {
        return O7.x.v0(this.f24823a.f24829a.f24832a, '.', '/') + "/" + this.f24824b;
    }
}
