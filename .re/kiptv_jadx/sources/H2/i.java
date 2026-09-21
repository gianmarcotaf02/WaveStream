package H2;

/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final E2.l f3890a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f3891b;

    public i(E2.l lVar, boolean z6) {
        this.f3890a = lVar;
        this.f3891b = z6;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof H2.i)) {
            return false;
        }
        H2.i iVar = (H2.i) obj;
        return kotlin.jvm.internal.m.a(this.f3890a, iVar.f3890a) && this.f3891b == iVar.f3891b;
    }

    public final int hashCode() {
        return java.lang.Boolean.hashCode(this.f3891b) + (this.f3890a.hashCode() * 31);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("DecodeResult(image=");
        sb.append(this.f3890a);
        sb.append(", isSampled=");
        return v5.L.a(sb, this.f3891b, ')');
    }
}
