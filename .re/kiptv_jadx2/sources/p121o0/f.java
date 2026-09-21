package p121o0;

import j1.l;
import p108m5.c;
import p194x6.j;

public abstract class f {

    public j f25976a;

    public long f25977b;

    public boolean f25978c;

    public int f25979d;

    public f(long j, j jVar) {
        int iA;
        int iNumberOfTrailingZeros;
        this.f25976a = jVar;
        this.f25977b = j;
        c cVar = k.f25991a;
        if (j != 0) {
            j jVarD = d();
            long[] jArr = jVarD.f25990k;
            if (jArr != null) {
                j = jArr[0];
            } else {
                long j9 = jVarD.f25989i;
                long j10 = jVarD.j;
                if (j9 != 0) {
                    iNumberOfTrailingZeros = Long.numberOfTrailingZeros(j9);
                } else {
                    long j11 = jVarD.f25988h;
                    if (j11 != 0) {
                        j10 += (long) 64;
                        iNumberOfTrailingZeros = Long.numberOfTrailingZeros(j11);
                    }
                }
                j = ((long) iNumberOfTrailingZeros) + j10;
            }
            synchronized (k.f25993c) {
                iA = k.f25996f.a(j);
            }
        } else {
            iA = -1;
        }
        this.f25979d = iA;
    }

    public static void q(f fVar) {
        k.f25992b.v(fVar);
    }

    public final void a() {
        synchronized (k.f25993c) {
            b();
            p();
        }
    }

    public void b() {
        k.f25994d = k.f25994d.e(g());
    }

    public abstract void c();

    public j d() {
        return this.f25976a;
    }

    public abstract j e();

    public abstract boolean f();

    public long g() {
        return this.f25977b;
    }

    public int h() {
        return 0;
    }

    public abstract j i();

    public final f j() {
        l lVar = k.f25992b;
        f fVar = (f) lVar.i();
        lVar.v(this);
        return fVar;
    }

    public abstract void k();

    public abstract void l();

    public abstract void m();

    public abstract void n(t tVar);

    public final void o() {
        int i3 = this.f25979d;
        if (i3 >= 0) {
            k.u(i3);
            this.f25979d = -1;
        }
    }

    public void p() {
        o();
    }

    public void r(j jVar) {
        this.f25976a = jVar;
    }

    public void s(long j) {
        this.f25977b = j;
    }

    public void t(int i3) {
        throw new IllegalStateException("Updating write count is not supported for this snapshot");
    }

    public abstract f u(j jVar);
}
