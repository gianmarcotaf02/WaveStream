package Z;

/* JADX INFO: renamed from: Z.p0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1165p0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Z.C1167q0 f12474a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final S7.C0895k f12475b;

    public C1165p0(Z.C1167q0 c1167q0, S7.C0895k c0895k) {
        this.f12474a = c1167q0;
        this.f12475b = c0895k;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || Z.C1165p0.class != obj.getClass()) {
            return false;
        }
        Z.C1165p0 c1165p0 = (Z.C1165p0) obj;
        return kotlin.jvm.internal.m.a(this.f12474a, c1165p0.f12474a) && this.f12475b.equals(c1165p0.f12475b);
    }

    public final int hashCode() {
        return this.f12475b.hashCode() + (this.f12474a.hashCode() * 31);
    }
}
