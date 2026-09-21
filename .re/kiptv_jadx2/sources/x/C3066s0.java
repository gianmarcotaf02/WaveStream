package x;

public final class C3066s0 implements p113n1.c {

    public final p113n1.c f31001h;

    public boolean f31002i;
    public boolean j;

    public final p028c8.d f31003k = new p028c8.d();

    public C3066s0(p113n1.c cVar) {
        this.f31001h = cVar;
    }

    @Override
    public final long G(float f9) {
        return this.f31001h.G(f9);
    }

    @Override
    public final float K(int i3) {
        return this.f31001h.K(i3);
    }

    @Override
    public final float N(float f9) {
        return this.f31001h.N(f9);
    }

    @Override
    public final float S() {
        return this.f31001h.S();
    }

    @Override
    public final float Y(float f9) {
        return this.f31001h.Y(f9);
    }

    public final void a() {
        this.j = true;
        p028c8.d dVar = this.f31003k;
        if (dVar.d()) {
            dVar.g(null);
        }
    }

    public final void b() {
        this.f31002i = true;
        p028c8.d dVar = this.f31003k;
        if (dVar.d()) {
            dVar.g(null);
        }
    }

    public final Object c(p117n6.c cVar) {
        C3063q0 c3063q0;
        if (cVar instanceof C3063q0) {
            c3063q0 = (C3063q0) cVar;
            int i3 = c3063q0.j;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                c3063q0.j = i3 - Integer.MIN_VALUE;
            } else {
                c3063q0 = new C3063q0(this, cVar);
            }
        } else {
            c3063q0 = new C3063q0(this, cVar);
        }
        Object obj = c3063q0.f30986h;
        p109m6.a aVar = p109m6.a.f25430h;
        int i9 = c3063q0.j;
        if (i9 == 0) {
            com.google.common.util.concurrent.P.u0(obj);
            c3063q0.j = 1;
            if (this.f31003k.e(c3063q0) == aVar) {
                return aVar;
            }
        } else {
            if (i9 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.google.common.util.concurrent.P.u0(obj);
        }
        this.f31002i = false;
        this.j = false;
        return p070h6.A.f22523a;
    }

    public final Object f(p117n6.c cVar) {
        C3064r0 c3064r0;
        if (cVar instanceof C3064r0) {
            c3064r0 = (C3064r0) cVar;
            int i3 = c3064r0.j;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                c3064r0.j = i3 - Integer.MIN_VALUE;
            } else {
                c3064r0 = new C3064r0(this, cVar);
            }
        } else {
            c3064r0 = new C3064r0(this, cVar);
        }
        Object obj = c3064r0.f30993h;
        p109m6.a aVar = p109m6.a.f25430h;
        int i9 = c3064r0.j;
        p028c8.d dVar = this.f31003k;
        if (i9 == 0) {
            com.google.common.util.concurrent.P.u0(obj);
            if (!this.f31002i && !this.j) {
                c3064r0.j = 1;
                if (dVar.e(c3064r0) == aVar) {
                    return aVar;
                }
            }
            return Boolean.valueOf(this.f31002i);
        }
        if (i9 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        com.google.common.util.concurrent.P.u0(obj);
        dVar.g(null);
        return Boolean.valueOf(this.f31002i);
    }

    @Override
    public final float getDensity() {
        return this.f31001h.getDensity();
    }

    @Override
    public final int k0(float f9) {
        return this.f31001h.k0(f9);
    }

    @Override
    public final long l(float f9) {
        return this.f31001h.l(f9);
    }

    @Override
    public final long m(long j) {
        return this.f31001h.m(j);
    }

    @Override
    public final long o0(long j) {
        return this.f31001h.o0(j);
    }

    @Override
    public final float s0(long j) {
        return this.f31001h.s0(j);
    }

    @Override
    public final float t(long j) {
        return this.f31001h.t(j);
    }
}
