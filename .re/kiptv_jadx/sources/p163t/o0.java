package p163t;

/* JADX INFO: loaded from: classes.dex */
public final class o0 implements p163t.InterfaceC2758h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p163t.G0 f27656a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p163t.E0 f27657b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public java.lang.Object f27658c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public java.lang.Object f27659d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public p163t.r f27660e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public p163t.r f27661f;
    public final p163t.r g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f27662h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public p163t.r f27663i;

    public o0(p163t.InterfaceC2766l interfaceC2766l, p163t.E0 e6, java.lang.Object obj, java.lang.Object obj2, p163t.r rVar) {
        this.f27656a = interfaceC2766l.a(e6);
        this.f27657b = e6;
        this.f27658c = obj2;
        this.f27659d = obj;
        this.f27660e = (p163t.r) e6.f27453a.invoke(obj);
        p194x6.j jVar = e6.f27453a;
        this.f27661f = (p163t.r) jVar.invoke(obj2);
        this.g = rVar != null ? p163t.AbstractC2750d.i(rVar) : ((p163t.r) jVar.invoke(obj)).c();
        this.f27662h = -1L;
    }

    @Override // p163t.InterfaceC2758h
    public final boolean a() {
        return this.f27656a.a();
    }

    @Override // p163t.InterfaceC2758h
    public final long b() {
        if (this.f27662h < 0) {
            this.f27662h = this.f27656a.b(this.f27660e, this.f27661f, this.g);
        }
        return this.f27662h;
    }

    @Override // p163t.InterfaceC2758h
    public final p163t.E0 c() {
        return this.f27657b;
    }

    @Override // p163t.InterfaceC2758h
    public final p163t.r d(long j) {
        if (!e(j)) {
            return this.f27656a.u(j, this.f27660e, this.f27661f, this.g);
        }
        p163t.r rVar = this.f27663i;
        if (rVar != null) {
            return rVar;
        }
        p163t.r rVarR = this.f27656a.r(this.f27660e, this.f27661f, this.g);
        this.f27663i = rVarR;
        return rVarR;
    }

    @Override // p163t.InterfaceC2758h
    public final java.lang.Object f(long j) {
        if (e(j)) {
            return this.f27658c;
        }
        p163t.r rVarE = this.f27656a.e(j, this.f27660e, this.f27661f, this.g);
        int iB = rVarE.b();
        for (int i3 = 0; i3 < iB; i3++) {
            if (java.lang.Float.isNaN(rVarE.a(i3))) {
                p163t.S.b("AnimationVector cannot contain a NaN. " + rVarE + ". Animation: " + this + ", playTimeNanos: " + j);
            }
        }
        return this.f27657b.f27454b.invoke(rVarE);
    }

    @Override // p163t.InterfaceC2758h
    public final java.lang.Object g() {
        return this.f27658c;
    }

    public final void h(java.lang.Object obj) {
        if (kotlin.jvm.internal.m.a(obj, this.f27659d)) {
            return;
        }
        this.f27659d = obj;
        this.f27660e = (p163t.r) this.f27657b.f27453a.invoke(obj);
        this.f27663i = null;
        this.f27662h = -1L;
    }

    public final void i(java.lang.Object obj) {
        if (kotlin.jvm.internal.m.a(this.f27658c, obj)) {
            return;
        }
        this.f27658c = obj;
        this.f27661f = (p163t.r) this.f27657b.f27453a.invoke(obj);
        this.f27663i = null;
        this.f27662h = -1L;
    }

    public final java.lang.String toString() {
        return "TargetBasedAnimation: " + this.f27659d + " -> " + this.f27658c + ",initial velocity: " + this.g + ", duration: " + (b() / 1000000) + " ms,animationSpec: " + this.f27656a;
    }
}
