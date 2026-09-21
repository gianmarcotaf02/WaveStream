package U;

/* JADX INFO: loaded from: classes.dex */
public final class J {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final J.L f9915a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f9916b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final U.I f9917c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f9918d;

    public J(J.L l2, long j, U.I i3, boolean z6) {
        this.f9915a = l2;
        this.f9916b = j;
        this.f9917c = i3;
        this.f9918d = z6;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof U.J)) {
            return false;
        }
        U.J j = (U.J) obj;
        return this.f9915a == j.f9915a && p181w0.a.b(this.f9916b, j.f9916b) && this.f9917c == j.f9917c && this.f9918d == j.f9918d;
    }

    public final int hashCode() {
        return java.lang.Boolean.hashCode(this.f9918d) + ((this.f9917c.hashCode() + p121o0.p.e(this.f9915a.hashCode() * 31, 31, this.f9916b)) * 31);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("SelectionHandleInfo(handle=");
        sb.append(this.f9915a);
        sb.append(", position=");
        sb.append((java.lang.Object) p181w0.a.i(this.f9916b));
        sb.append(", anchor=");
        sb.append(this.f9917c);
        sb.append(", visible=");
        return v5.L.a(sb, this.f9918d, ')');
    }
}
