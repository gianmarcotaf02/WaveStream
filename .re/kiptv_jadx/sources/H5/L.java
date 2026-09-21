package H5;

/* JADX INFO: loaded from: classes4.dex */
public final class L {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f4107a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f4108b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f4109c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f4110d;

    public L(boolean z6, int i3, int i9, int i10) {
        this.f4107a = i3;
        this.f4108b = i9;
        this.f4109c = i10;
        this.f4110d = z6;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof H5.L)) {
            return false;
        }
        H5.L l2 = (H5.L) obj;
        return this.f4107a == l2.f4107a && this.f4108b == l2.f4108b && this.f4109c == l2.f4109c && this.f4110d == l2.f4110d;
    }

    public final int hashCode() {
        return java.lang.Boolean.hashCode(this.f4110d) + p121o0.p.d(this.f4109c, p121o0.p.d(this.f4108b, java.lang.Integer.hashCode(this.f4107a) * 31, 31), 31);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("TvSagaPlayTarget(streamId=");
        sb.append(this.f4107a);
        sb.append(", index=");
        sb.append(this.f4108b);
        sb.append(", resumeSeconds=");
        sb.append(this.f4109c);
        sb.append(", isRewatch=");
        return com.google.android.gms.internal.play_billing.M0.o(sb, this.f4110d, ")");
    }
}
