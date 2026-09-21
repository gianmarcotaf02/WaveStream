package p035d7;

/* JADX INFO: loaded from: classes4.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p035d7.g f21265a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f21266b;

    public h(p035d7.g gVar) {
        this.f21265a = gVar;
        this.f21266b = false;
    }

    public static p035d7.h a(p035d7.h hVar, p035d7.g qualifier, boolean z6, int i3) {
        if ((i3 & 1) != 0) {
            qualifier = hVar.f21265a;
        }
        if ((i3 & 2) != 0) {
            z6 = hVar.f21266b;
        }
        hVar.getClass();
        kotlin.jvm.internal.m.e(qualifier, "qualifier");
        return new p035d7.h(qualifier, z6);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p035d7.h)) {
            return false;
        }
        p035d7.h hVar = (p035d7.h) obj;
        return this.f21265a == hVar.f21265a && this.f21266b == hVar.f21266b;
    }

    public final int hashCode() {
        return java.lang.Boolean.hashCode(this.f21266b) + (this.f21265a.hashCode() * 31);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("NullabilityQualifierWithMigrationStatus(qualifier=");
        sb.append(this.f21265a);
        sb.append(", isForWarningOnly=");
        return v5.L.a(sb, this.f21266b, ')');
    }

    public h(p035d7.g gVar, boolean z6) {
        this.f21265a = gVar;
        this.f21266b = z6;
    }
}
