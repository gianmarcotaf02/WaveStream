package Z;

/* JADX INFO: renamed from: Z.q0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1167q0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.String f12478a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f12479b;

    public C1167q0(java.lang.String str, int i3) {
        this.f12478a = str;
        this.f12479b = i3;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || Z.C1167q0.class != obj.getClass()) {
            return false;
        }
        Z.C1167q0 c1167q0 = (Z.C1167q0) obj;
        return kotlin.jvm.internal.m.a(this.f12478a, c1167q0.f12478a) && this.f12479b == c1167q0.f12479b;
    }

    public final int hashCode() {
        return Z.AbstractC1149h0.c(this.f12479b) + p121o0.p.f(this.f12478a.hashCode() * 961, 31, false);
    }
}
