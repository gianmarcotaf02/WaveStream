package p043e5;

/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.String f21430a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.util.List f21431b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p043e5.f f21432c;

    public e(java.lang.String version, java.util.List list, p043e5.f fVar) {
        kotlin.jvm.internal.m.e(version, "version");
        this.f21430a = version;
        this.f21431b = list;
        this.f21432c = fVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p043e5.e)) {
            return false;
        }
        p043e5.e eVar = (p043e5.e) obj;
        return kotlin.jvm.internal.m.a(this.f21430a, eVar.f21430a) && kotlin.jvm.internal.m.a(this.f21431b, eVar.f21431b) && kotlin.jvm.internal.m.a(this.f21432c, eVar.f21432c);
    }

    public final int hashCode() {
        int iB = B2.a.b(this.f21430a.hashCode() * 31, 31, this.f21431b);
        p043e5.f fVar = this.f21432c;
        return iB + (fVar == null ? 0 : fVar.hashCode());
    }

    public final java.lang.String toString() {
        return "WhatsNewEntry(version=" + this.f21430a + ", bullets=" + this.f21431b + ", headline=" + this.f21432c + ")";
    }
}
