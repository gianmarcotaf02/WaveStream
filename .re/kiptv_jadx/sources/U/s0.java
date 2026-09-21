package U;

/* JADX INFO: loaded from: classes.dex */
public final class s0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f10079a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f10080b;

    public s0(long j, long j9) {
        this.f10079a = j;
        this.f10080b = j9;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof U.s0)) {
            return false;
        }
        U.s0 s0Var = (U.s0) obj;
        return p188x0.C3098s.d(this.f10079a, s0Var.f10079a) && p188x0.C3098s.d(this.f10080b, s0Var.f10080b);
    }

    public final int hashCode() {
        int i3 = p188x0.C3098s.f31128h;
        return java.lang.Long.hashCode(this.f10080b) + (java.lang.Long.hashCode(this.f10079a) * 31);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("SelectionColors(selectionHandleColor=");
        p121o0.p.x(this.f10079a, ", selectionBackgroundColor=", sb);
        sb.append((java.lang.Object) p188x0.C3098s.j(this.f10080b));
        sb.append(')');
        return sb.toString();
    }
}
