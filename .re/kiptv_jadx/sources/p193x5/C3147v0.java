package p193x5;

/* JADX INFO: renamed from: x5.v0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3147v0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p193x5.InterfaceC3137q f31663a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.util.Map f31664b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final java.util.Set f31665c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final java.util.List f31666d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f31667e;

    public C3147v0(p193x5.InterfaceC3137q interfaceC3137q, java.util.Map groups, java.util.Set favIds, java.util.List recents, int i3) {
        kotlin.jvm.internal.m.e(groups, "groups");
        kotlin.jvm.internal.m.e(favIds, "favIds");
        kotlin.jvm.internal.m.e(recents, "recents");
        this.f31663a = interfaceC3137q;
        this.f31664b = groups;
        this.f31665c = favIds;
        this.f31666d = recents;
        this.f31667e = i3;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p193x5.C3147v0)) {
            return false;
        }
        p193x5.C3147v0 c3147v0 = (p193x5.C3147v0) obj;
        return kotlin.jvm.internal.m.a(this.f31663a, c3147v0.f31663a) && kotlin.jvm.internal.m.a(this.f31664b, c3147v0.f31664b) && kotlin.jvm.internal.m.a(this.f31665c, c3147v0.f31665c) && kotlin.jvm.internal.m.a(this.f31666d, c3147v0.f31666d) && this.f31667e == c3147v0.f31667e;
    }

    public final int hashCode() {
        p193x5.InterfaceC3137q interfaceC3137q = this.f31663a;
        return java.lang.Integer.hashCode(this.f31667e) + B2.a.b(p121o0.p.g(this.f31665c, B2.a.c((interfaceC3137q == null ? 0 : interfaceC3137q.hashCode()) * 31, 31, this.f31664b), 31), 31, this.f31666d);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("RowPrefillKey(sel=");
        sb.append(this.f31663a);
        sb.append(", groups=");
        sb.append(this.f31664b);
        sb.append(", favIds=");
        sb.append(this.f31665c);
        sb.append(", recents=");
        sb.append(this.f31666d);
        sb.append(", overridesVersion=");
        return Y6.f.k(sb, this.f31667e, ")");
    }
}
