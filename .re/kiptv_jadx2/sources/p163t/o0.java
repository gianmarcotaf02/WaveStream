package p163t;

import kotlin.jvm.internal.m;
import p194x6.j;

public final class o0 implements InterfaceC2758h {

    public final G0 f27656a;

    public final E0 f27657b;

    public Object f27658c;

    public Object f27659d;

    public r f27660e;

    public r f27661f;
    public final r g;

    public long f27662h;

    public r f27663i;

    public o0(InterfaceC2766l interfaceC2766l, E0 e6, Object obj, Object obj2, r rVar) {
        this.f27656a = interfaceC2766l.a(e6);
        this.f27657b = e6;
        this.f27658c = obj2;
        this.f27659d = obj;
        this.f27660e = (r) e6.f27453a.invoke(obj);
        j jVar = e6.f27453a;
        this.f27661f = (r) jVar.invoke(obj2);
        this.g = rVar != null ? AbstractC2750d.i(rVar) : ((r) jVar.invoke(obj)).c();
        this.f27662h = -1L;
    }

    @Override
    public final boolean a() {
        return this.f27656a.a();
    }

    @Override
    public final long b() {
        if (this.f27662h < 0) {
            this.f27662h = this.f27656a.b(this.f27660e, this.f27661f, this.g);
        }
        return this.f27662h;
    }

    @Override
    public final E0 c() {
        return this.f27657b;
    }

    @Override
    public final r d(long j) {
        if (!e(j)) {
            return this.f27656a.u(j, this.f27660e, this.f27661f, this.g);
        }
        r rVar = this.f27663i;
        if (rVar != null) {
            return rVar;
        }
        r rVarR = this.f27656a.r(this.f27660e, this.f27661f, this.g);
        this.f27663i = rVarR;
        return rVarR;
    }

    @Override
    public final Object f(long j) {
        if (e(j)) {
            return this.f27658c;
        }
        r rVarE = this.f27656a.e(j, this.f27660e, this.f27661f, this.g);
        int iB = rVarE.b();
        for (int i3 = 0; i3 < iB; i3++) {
            if (Float.isNaN(rVarE.a(i3))) {
                S.b("AnimationVector cannot contain a NaN. " + rVarE + ". Animation: " + this + ", playTimeNanos: " + j);
            }
        }
        return this.f27657b.f27454b.invoke(rVarE);
    }

    @Override
    public final Object g() {
        return this.f27658c;
    }

    public final void h(Object obj) {
        if (m.a(obj, this.f27659d)) {
            return;
        }
        this.f27659d = obj;
        this.f27660e = (r) this.f27657b.f27453a.invoke(obj);
        this.f27663i = null;
        this.f27662h = -1L;
    }

    public final void i(Object obj) {
        if (m.a(this.f27658c, obj)) {
            return;
        }
        this.f27658c = obj;
        this.f27661f = (r) this.f27657b.f27453a.invoke(obj);
        this.f27663i = null;
        this.f27662h = -1L;
    }

    public final String toString() {
        return "TargetBasedAnimation: " + this.f27659d + " -> " + this.f27658c + ",initial velocity: " + this.g + ", duration: " + (b() / 1000000) + " ms,animationSpec: " + this.f27656a;
    }
}
