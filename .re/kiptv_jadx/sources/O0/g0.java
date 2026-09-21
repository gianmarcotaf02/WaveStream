package O0;

/* JADX INFO: loaded from: classes.dex */
public abstract class g0 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f7639h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f7640i;
    public long j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f7641k = O0.i0.f7648a;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f7642l = 0;

    public g0() {
        long j = 0;
        this.j = (j & 4294967295L) | (j << 32);
    }

    public java.lang.Object E() {
        return null;
    }

    public abstract int b0(O0.C0723l c0723l);

    public int e0() {
        return (int) (this.j & 4294967295L);
    }

    public int f0() {
        return (int) (this.j >> 32);
    }

    public final void g0() {
        this.f7639h = O7.r.s((int) (this.j >> 32), p113n1.a.j(this.f7641k), p113n1.a.h(this.f7641k));
        int iS = O7.r.s((int) (this.j & 4294967295L), p113n1.a.i(this.f7641k), p113n1.a.g(this.f7641k));
        this.f7640i = iS;
        int i3 = this.f7639h;
        long j = this.j;
        this.f7642l = (((long) ((i3 - ((int) (j >> 32))) / 2)) << 32) | (4294967295L & ((long) ((iS - ((int) (j & 4294967295L))) / 2)));
    }

    public abstract void h0(long j, float f9, p194x6.j jVar);

    public final void i0(long j) {
        if (p113n1.m.a(this.j, j)) {
            return;
        }
        this.j = j;
        g0();
    }

    public final void j0(long j) {
        if (p113n1.a.b(this.f7641k, j)) {
            return;
        }
        this.f7641k = j;
        g0();
    }
}
