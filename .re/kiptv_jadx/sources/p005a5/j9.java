package p005a5;

/* JADX INFO: loaded from: classes.dex */
public final class j9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.String f14675a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.lang.String f14676b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f14677c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f14678d;

    public j9(boolean z6, java.lang.String id, int i3, java.lang.String name) {
        kotlin.jvm.internal.m.e(id, "id");
        kotlin.jvm.internal.m.e(name, "name");
        this.f14675a = id;
        this.f14676b = name;
        this.f14677c = i3;
        this.f14678d = z6;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p005a5.j9)) {
            return false;
        }
        p005a5.j9 j9Var = (p005a5.j9) obj;
        return kotlin.jvm.internal.m.a(this.f14675a, j9Var.f14675a) && kotlin.jvm.internal.m.a(this.f14676b, j9Var.f14676b) && this.f14677c == j9Var.f14677c && this.f14678d == j9Var.f14678d;
    }

    public final int hashCode() {
        return java.lang.Boolean.hashCode(this.f14678d) + p121o0.p.d(this.f14677c, B2.a.a(this.f14675a.hashCode() * 31, 31, this.f14676b), 31);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("XMLTVChannelOption(id=");
        sb.append(this.f14675a);
        sb.append(", name=");
        sb.append(this.f14676b);
        sb.append(", programCount=");
        sb.append(this.f14677c);
        sb.append(", isDeclared=");
        return com.google.android.gms.internal.play_billing.M0.o(sb, this.f14678d, ")");
    }
}
