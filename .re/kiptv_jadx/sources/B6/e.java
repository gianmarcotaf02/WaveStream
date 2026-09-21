package B6;

/* JADX INFO: loaded from: classes4.dex */
public final class e extends B6.d implements java.io.Serializable {
    public int j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f819k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f820l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f821m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f822n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f823o;

    @Override // B6.d
    public final int a(int i3) {
        return ((-i3) >> 31) & (d() >>> (32 - i3));
    }

    @Override // B6.d
    public final int d() {
        int i3 = this.j;
        int i9 = i3 ^ (i3 >>> 2);
        this.j = this.f819k;
        this.f819k = this.f820l;
        this.f820l = this.f821m;
        int i10 = this.f822n;
        this.f821m = i10;
        int i11 = ((i9 ^ (i9 << 1)) ^ i10) ^ (i10 << 4);
        this.f822n = i11;
        int i12 = this.f823o + 362437;
        this.f823o = i12;
        return i11 + i12;
    }
}
