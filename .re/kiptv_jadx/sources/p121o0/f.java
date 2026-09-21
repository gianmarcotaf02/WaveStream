package p121o0;

/* JADX INFO: loaded from: classes.dex */
public abstract class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public p121o0.j f25976a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f25977b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f25978c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f25979d;

    public f(long j, p121o0.j jVar) {
        int iA;
        int iNumberOfTrailingZeros;
        this.f25976a = jVar;
        this.f25977b = j;
        p108m5.c cVar = p121o0.k.f25991a;
        if (j != 0) {
            p121o0.j jVarD = d();
            long[] jArr = jVarD.f25990k;
            if (jArr != null) {
                j = jArr[0];
            } else {
                long j9 = jVarD.f25989i;
                long j10 = jVarD.j;
                if (j9 != 0) {
                    iNumberOfTrailingZeros = java.lang.Long.numberOfTrailingZeros(j9);
                } else {
                    long j11 = jVarD.f25988h;
                    if (j11 != 0) {
                        j10 += (long) 64;
                        iNumberOfTrailingZeros = java.lang.Long.numberOfTrailingZeros(j11);
                    }
                }
                j = ((long) iNumberOfTrailingZeros) + j10;
            }
            synchronized (p121o0.k.f25993c) {
                iA = p121o0.k.f25996f.a(j);
            }
        } else {
            iA = -1;
        }
        this.f25979d = iA;
    }

    public static void q(p121o0.f fVar) {
        p121o0.k.f25992b.v(fVar);
    }

    public final void a() {
        synchronized (p121o0.k.f25993c) {
            b();
            p();
        }
    }

    public void b() {
        p121o0.k.f25994d = p121o0.k.f25994d.e(g());
    }

    public abstract void c();

    public p121o0.j d() {
        return this.f25976a;
    }

    public abstract p194x6.j e();

    public abstract boolean f();

    public long g() {
        return this.f25977b;
    }

    public int h() {
        return 0;
    }

    public abstract p194x6.j i();

    public final p121o0.f j() {
        j1.l lVar = p121o0.k.f25992b;
        p121o0.f fVar = (p121o0.f) lVar.i();
        lVar.v(this);
        return fVar;
    }

    public abstract void k();

    public abstract void l();

    public abstract void m();

    public abstract void n(p121o0.t tVar);

    public final void o() {
        int i3 = this.f25979d;
        if (i3 >= 0) {
            p121o0.k.u(i3);
            this.f25979d = -1;
        }
    }

    public void p() {
        o();
    }

    public void r(p121o0.j jVar) {
        this.f25976a = jVar;
    }

    public void s(long j) {
        this.f25977b = j;
    }

    public void t(int i3) {
        throw new java.lang.IllegalStateException("Updating write count is not supported for this snapshot");
    }

    public abstract p121o0.f u(p194x6.j jVar);
}
