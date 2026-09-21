package x;

/* JADX INFO: renamed from: x.s0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3066s0 implements p113n1.c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ p113n1.c f31001h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f31002i;
    public boolean j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final p028c8.d f31003k = new p028c8.d();

    public C3066s0(p113n1.c cVar) {
        this.f31001h = cVar;
    }

    @Override // p113n1.c
    public final long G(float f9) {
        return this.f31001h.G(f9);
    }

    @Override // p113n1.c
    public final float K(int i3) {
        return this.f31001h.K(i3);
    }

    @Override // p113n1.c
    public final float N(float f9) {
        return this.f31001h.N(f9);
    }

    @Override // p113n1.c
    public final float S() {
        return this.f31001h.S();
    }

    @Override // p113n1.c
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

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object c(p117n6.c cVar) {
        x.C3063q0 c3063q0;
        if (cVar instanceof x.C3063q0) {
            c3063q0 = (x.C3063q0) cVar;
            int i3 = c3063q0.j;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                c3063q0.j = i3 - Integer.MIN_VALUE;
            } else {
                c3063q0 = new x.C3063q0(this, cVar);
            }
        } else {
            c3063q0 = new x.C3063q0(this, cVar);
        }
        java.lang.Object obj = c3063q0.f30986h;
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
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.google.common.util.concurrent.P.u0(obj);
        }
        this.f31002i = false;
        this.j = false;
        return p070h6.A.f22523a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object f(p117n6.c cVar) {
        x.C3064r0 c3064r0;
        if (cVar instanceof x.C3064r0) {
            c3064r0 = (x.C3064r0) cVar;
            int i3 = c3064r0.j;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                c3064r0.j = i3 - Integer.MIN_VALUE;
            } else {
                c3064r0 = new x.C3064r0(this, cVar);
            }
        } else {
            c3064r0 = new x.C3064r0(this, cVar);
        }
        java.lang.Object obj = c3064r0.f30993h;
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
            return java.lang.Boolean.valueOf(this.f31002i);
        }
        if (i9 != 1) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        com.google.common.util.concurrent.P.u0(obj);
        dVar.g(null);
        return java.lang.Boolean.valueOf(this.f31002i);
    }

    @Override // p113n1.c
    public final float getDensity() {
        return this.f31001h.getDensity();
    }

    @Override // p113n1.c
    public final int k0(float f9) {
        return this.f31001h.k0(f9);
    }

    @Override // p113n1.c
    public final long l(float f9) {
        return this.f31001h.l(f9);
    }

    @Override // p113n1.c
    public final long m(long j) {
        return this.f31001h.m(j);
    }

    @Override // p113n1.c
    public final long o0(long j) {
        return this.f31001h.o0(j);
    }

    @Override // p113n1.c
    public final float s0(long j) {
        return this.f31001h.s0(j);
    }

    @Override // p113n1.c
    public final float t(long j) {
        return this.f31001h.t(j);
    }
}
