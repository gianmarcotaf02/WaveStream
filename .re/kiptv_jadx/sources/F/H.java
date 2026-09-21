package F;

/* JADX INFO: loaded from: classes.dex */
public final class H implements p020c0.e1 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f3340h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f3341i;
    public final p020c0.C1681g0 j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f3342k;

    public H(int i3, int i9, int i10) {
        this.f3340h = i9;
        this.f3341i = i10;
        int i11 = (i3 / i9) * i9;
        this.j = new p020c0.C1681g0(O7.r.W(java.lang.Math.max(i11 - i10, 0), i11 + i9 + i10), p020c0.C1676e.f18243n);
        this.f3342k = i3;
    }

    public final void c(int i3) {
        if (i3 != this.f3342k) {
            this.f3342k = i3;
            int i9 = this.f3340h;
            int i10 = (i3 / i9) * i9;
            int i11 = this.f3341i;
            this.j.setValue(O7.r.W(java.lang.Math.max(i10 - i11, 0), i10 + i9 + i11));
        }
    }

    @Override // p020c0.e1
    public final java.lang.Object getValue() {
        return (D6.g) this.j.getValue();
    }
}
