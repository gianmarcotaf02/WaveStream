package K0;

/* JADX INFO: loaded from: classes.dex */
public final class S implements p113n1.c, p100l6.c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ K0.U f6670h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final S7.C0895k f6671i;
    public S7.C0895k j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public K0.EnumC0668p f6672k = K0.EnumC0668p.f6731i;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final p100l6.i f6673l = p100l6.i.f24820h;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ K0.U f6674m;

    public S(K0.U u6, S7.C0895k c0895k) {
        this.f6674m = u6;
        this.f6670h = u6;
        this.f6671i = c0895k;
    }

    @Override // p113n1.c
    public final long G(float f9) {
        return this.f6670h.G(f9);
    }

    @Override // p113n1.c
    public final float K(int i3) {
        return this.f6670h.K(i3);
    }

    @Override // p113n1.c
    public final float N(float f9) {
        return f9 / this.f6670h.getDensity();
    }

    @Override // p113n1.c
    public final float S() {
        return this.f6670h.S();
    }

    @Override // p113n1.c
    public final float Y(float f9) {
        return this.f6670h.getDensity() * f9;
    }

    public final java.lang.Object a(K0.EnumC0668p enumC0668p, p117n6.a aVar) {
        S7.C0895k c0895k = new S7.C0895k(1, com.google.common.util.concurrent.P.h0(aVar));
        c0895k.r();
        this.f6672k = enumC0668p;
        this.j = c0895k;
        java.lang.Object objQ = c0895k.q();
        p109m6.a aVar2 = p109m6.a.f25430h;
        return objQ;
    }

    public final long b() {
        K0.U u6 = this.f6674m;
        u6.getClass();
        long jO0 = u6.o0(Q0.AbstractC0777k.t(u6).f8227I.d());
        long j = u6.f6681E;
        return (((long) java.lang.Float.floatToRawIntBits(java.lang.Math.max(0.0f, java.lang.Float.intBitsToFloat((int) (jO0 >> 32)) - ((int) (j >> 32))) / 2.0f)) << 32) | (((long) java.lang.Float.floatToRawIntBits(java.lang.Math.max(0.0f, java.lang.Float.intBitsToFloat((int) (jO0 & 4294967295L)) - ((int) (j & 4294967295L))) / 2.0f)) & 4294967295L);
    }

    public final R0.V0 c() {
        K0.U u6 = this.f6674m;
        u6.getClass();
        return Q0.AbstractC0777k.t(u6).f8227I;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v0, types: [long] */
    /* JADX WARN: Type inference failed for: r7v1, types: [S7.h0] */
    /* JADX WARN: Type inference failed for: r7v4, types: [S7.h0] */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r9v0, types: [x6.m] */
    public final java.lang.Object f(long j, p194x6.m mVar, p117n6.c cVar) {
        K0.O o8;
        S7.C0895k c0895k;
        if (cVar instanceof K0.O) {
            o8 = (K0.O) cVar;
            int i3 = o8.f6665k;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                o8.f6665k = i3 - Integer.MIN_VALUE;
            } else {
                o8 = new K0.O(this, cVar);
            }
        } else {
            o8 = new K0.O(this, cVar);
        }
        java.lang.Object objInvoke = o8.f6664i;
        p109m6.a aVar = p109m6.a.f25430h;
        int i9 = o8.f6665k;
        try {
            if (i9 == 0) {
                com.google.common.util.concurrent.P.u0(objInvoke);
                if (j <= 0 && (c0895k = this.j) != null) {
                    c0895k.resumeWith(com.google.common.util.concurrent.P.T(new K0.C0669q(j)));
                }
                S7.w0 w0VarA = S7.C.A(this.f6674m.B0(), null, new K0.P(j, this, null), 3);
                o8.f6663h = w0VarA;
                o8.f6665k = 1;
                objInvoke = mVar.invoke(this, o8);
                j = w0VarA;
                if (objInvoke == aVar) {
                    return aVar;
                }
            } else {
                if (i9 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                S7.w0 w0Var = o8.f6663h;
                com.google.common.util.concurrent.P.u0(objInvoke);
                j = w0Var;
            }
            j.e(K0.C0654b.f6687i);
            return objInvoke;
        } catch (java.lang.Throwable th) {
            j.e(K0.C0654b.f6687i);
            throw th;
        }
    }

    @Override // p100l6.c
    public final p100l6.h getContext() {
        return this.f6673l;
    }

    @Override // p113n1.c
    public final float getDensity() {
        return this.f6670h.getDensity();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object h(long j, p194x6.m mVar, p117n6.a aVar) {
        K0.Q q9;
        if (aVar instanceof K0.Q) {
            q9 = (K0.Q) aVar;
            int i3 = q9.j;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                q9.j = i3 - Integer.MIN_VALUE;
            } else {
                q9 = new K0.Q(this, aVar);
            }
        } else {
            q9 = new K0.Q(this, aVar);
        }
        java.lang.Object obj = q9.f6668h;
        java.lang.Object obj2 = p109m6.a.f25430h;
        int i9 = q9.j;
        try {
            if (i9 != 0) {
                if (i9 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                com.google.common.util.concurrent.P.u0(obj);
                return obj;
            }
            com.google.common.util.concurrent.P.u0(obj);
            q9.j = 1;
            java.lang.Object objF = f(j, mVar, q9);
            return objF == obj2 ? obj2 : objF;
        } catch (K0.C0669q unused) {
            return null;
        }
    }

    @Override // p113n1.c
    public final int k0(float f9) {
        return this.f6670h.k0(f9);
    }

    @Override // p113n1.c
    public final long l(float f9) {
        return this.f6670h.l(f9);
    }

    @Override // p113n1.c
    public final long m(long j) {
        return this.f6670h.m(j);
    }

    @Override // p113n1.c
    public final long o0(long j) {
        return this.f6670h.o0(j);
    }

    @Override // p100l6.c
    public final void resumeWith(java.lang.Object obj) {
        K0.U u6 = this.f6674m;
        synchronized (u6.f6678B) {
            u6.f6677A.l(this);
        }
        this.f6671i.resumeWith(obj);
    }

    @Override // p113n1.c
    public final float s0(long j) {
        return this.f6670h.s0(j);
    }

    @Override // p113n1.c
    public final float t(long j) {
        return this.f6670h.t(j);
    }
}
