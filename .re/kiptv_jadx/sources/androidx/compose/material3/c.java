package androidx.compose.material3;

/* JADX INFO: loaded from: classes.dex */
public final class c implements v.InterfaceC2886h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f15819a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f15820b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f15821c;

    public c(boolean z6, float f9, long j) {
        this.f15819a = z6;
        this.f15820b = f9;
        this.f15821c = j;
    }

    @Override // v.InterfaceC2886h0
    public final Q0.InterfaceC0775i a(p202z.k kVar) {
        Z.C1141d0 c1141d0 = new Z.C1141d0(this);
        return new androidx.compose.material3.DelegatingThemeAwareRippleNode(kVar, this.f15819a, this.f15820b, c1141d0);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof androidx.compose.material3.c)) {
            return false;
        }
        androidx.compose.material3.c cVar = (androidx.compose.material3.c) obj;
        if (this.f15819a == cVar.f15819a && p113n1.f.c(this.f15820b, cVar.f15820b)) {
            return p188x0.C3098s.d(this.f15821c, cVar.f15821c);
        }
        return false;
    }

    @Override // v.InterfaceC2886h0
    public final int hashCode() {
        int iC = p121o0.p.c(this.f15820b, java.lang.Boolean.hashCode(this.f15819a) * 31, 961);
        int i3 = p188x0.C3098s.f31128h;
        return java.lang.Long.hashCode(this.f15821c) + iC;
    }
}
