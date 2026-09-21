package p076i4;

/* JADX INFO: renamed from: i4.o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2212o0 extends p076i4.U {
    @Override // p076i4.V
    public final /* bridge */ /* synthetic */ p076i4.V a(java.lang.Object obj) {
        f(obj);
        return this;
    }

    public final void f(java.lang.Object obj) {
        obj.getClass();
        c(obj);
    }

    public final p076i4.AbstractC2214p0 g() {
        int i3 = this.f22835b;
        if (i3 == 0) {
            int i9 = p076i4.AbstractC2214p0.j;
            return p076i4.Z0.f22857q;
        }
        if (i3 != 1) {
            p076i4.AbstractC2214p0 abstractC2214p0S = p076i4.AbstractC2214p0.s(this.f22834a, i3);
            this.f22835b = abstractC2214p0S.size();
            this.f22836c = true;
            return abstractC2214p0S;
        }
        java.lang.Object obj = this.f22834a[0];
        java.util.Objects.requireNonNull(obj);
        int i10 = p076i4.AbstractC2214p0.j;
        return new p076i4.f1(obj);
    }
}
