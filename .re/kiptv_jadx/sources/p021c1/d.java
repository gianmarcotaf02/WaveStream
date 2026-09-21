package p021c1;

/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f18455a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f18456b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f18457c;

    public d(int i3, int i9, boolean z6) {
        this.f18455a = i3;
        this.f18456b = i9;
        this.f18457c = z6;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p021c1.d)) {
            return false;
        }
        p021c1.d dVar = (p021c1.d) obj;
        return this.f18455a == dVar.f18455a && this.f18456b == dVar.f18456b && this.f18457c == dVar.f18457c;
    }

    public final int hashCode() {
        return java.lang.Boolean.hashCode(this.f18457c) + p121o0.p.d(this.f18456b, java.lang.Integer.hashCode(this.f18455a) * 31, 31);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("BidiRun(start=");
        sb.append(this.f18455a);
        sb.append(", end=");
        sb.append(this.f18456b);
        sb.append(", isRtl=");
        return v5.L.a(sb, this.f18457c, ')');
    }
}
