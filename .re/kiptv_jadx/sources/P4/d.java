package P4;

/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f8140a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f8141b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f8142c;

    public d(boolean z6, boolean z9, boolean z10) {
        this.f8140a = z6;
        this.f8141b = z9;
        this.f8142c = z10;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof P4.d)) {
            return false;
        }
        P4.d dVar = (P4.d) obj;
        return this.f8140a == dVar.f8140a && this.f8141b == dVar.f8141b && this.f8142c == dVar.f8142c;
    }

    public final int hashCode() {
        return java.lang.Boolean.hashCode(this.f8142c) + p121o0.p.f(java.lang.Boolean.hashCode(this.f8140a) * 31, 31, this.f8141b);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Release(images=");
        sb.append(this.f8140a);
        sb.append(", derivedIndexes=");
        sb.append(this.f8141b);
        sb.append(", catalogue=");
        return com.google.android.gms.internal.play_billing.M0.o(sb, this.f8142c, ")");
    }
}
