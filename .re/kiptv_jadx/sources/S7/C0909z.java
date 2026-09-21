package S7;

/* JADX INFO: renamed from: S7.z, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0909z extends p100l6.a {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final S7.C0889g0 f9627i = new S7.C0889g0();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final java.lang.String f9628h;

    public C0909z(java.lang.String str) {
        super(f9627i);
        this.f9628h = str;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof S7.C0909z) && kotlin.jvm.internal.m.a(this.f9628h, ((S7.C0909z) obj).f9628h);
    }

    public final int hashCode() {
        return this.f9628h.hashCode();
    }

    public final java.lang.String toString() {
        return Y6.f.l(new java.lang.StringBuilder("CoroutineName("), this.f9628h, ')');
    }
}
