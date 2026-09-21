package p062g7;

/* JADX INFO: renamed from: g7.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2164k extends p110m7.AbstractC2638k {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f22263k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f22264l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public java.util.List f22265m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public java.util.List f22266n;

    public static p062g7.C2164k g() {
        p062g7.C2164k c2164k = new p062g7.C2164k();
        c2164k.f22264l = 6;
        java.util.List list = java.util.Collections.EMPTY_LIST;
        c2164k.f22265m = list;
        c2164k.f22266n = list;
        return c2164k;
    }

    @Override // p110m7.AbstractC2637j
    public final p110m7.AbstractC2629b b() {
        p062g7.C2165l c2165lF = f();
        if (c2165lF.isInitialized()) {
            return c2165lF;
        }
        throw new I3.b(12);
    }

    /* JADX WARN: Code duplicated, block: B:14:0x001b  */
    @Override // p110m7.AbstractC2637j
    public final p110m7.AbstractC2637j c(p110m7.C2633f c2633f, p110m7.C2635h c2635h) throws java.lang.Throwable {
        p062g7.C2165l c2165l = null;
        try {
            try {
                p062g7.C2165l.f22268q.getClass();
                h(new p062g7.C2165l(c2633f, c2635h));
                return this;
            } catch (p110m7.r e6) {
                p062g7.C2165l c2165l2 = (p062g7.C2165l) e6.f25503h;
                try {
                    throw e6;
                } catch (java.lang.Throwable th) {
                    th = th;
                    c2165l = c2165l2;
                    if (c2165l != null) {
                        h(c2165l);
                    }
                    throw th;
                }
            }
        } catch (java.lang.Throwable th2) {
            th = th2;
            if (c2165l != null) {
                h(c2165l);
            }
            throw th;
        }
    }

    public final java.lang.Object clone() {
        p062g7.C2164k c2164kG = g();
        c2164kG.h(f());
        return c2164kG;
    }

    @Override // p110m7.AbstractC2637j
    public final /* bridge */ /* synthetic */ p110m7.AbstractC2637j d(p110m7.o oVar) {
        h((p062g7.C2165l) oVar);
        return this;
    }

    public final p062g7.C2165l f() {
        p062g7.C2165l c2165l = new p062g7.C2165l(this);
        int i3 = this.f22263k;
        int i9 = (i3 & 1) != 1 ? 0 : 1;
        c2165l.f22270k = this.f22264l;
        if ((i3 & 2) == 2) {
            this.f22265m = java.util.Collections.unmodifiableList(this.f22265m);
            this.f22263k &= -3;
        }
        c2165l.f22271l = this.f22265m;
        if ((this.f22263k & 4) == 4) {
            this.f22266n = java.util.Collections.unmodifiableList(this.f22266n);
            this.f22263k &= -5;
        }
        c2165l.f22272m = this.f22266n;
        c2165l.j = i9;
        return c2165l;
    }

    public final void h(p062g7.C2165l c2165l) {
        if (c2165l == p062g7.C2165l.f22267p) {
            return;
        }
        if ((c2165l.j & 1) == 1) {
            int i3 = c2165l.f22270k;
            this.f22263k = 1 | this.f22263k;
            this.f22264l = i3;
        }
        if (!c2165l.f22271l.isEmpty()) {
            if (this.f22265m.isEmpty()) {
                this.f22265m = c2165l.f22271l;
                this.f22263k &= -3;
            } else {
                if ((this.f22263k & 2) != 2) {
                    this.f22265m = new java.util.ArrayList(this.f22265m);
                    this.f22263k |= 2;
                }
                this.f22265m.addAll(c2165l.f22271l);
            }
        }
        if (!c2165l.f22272m.isEmpty()) {
            if (this.f22266n.isEmpty()) {
                this.f22266n = c2165l.f22272m;
                this.f22263k &= -5;
            } else {
                if ((this.f22263k & 4) != 4) {
                    this.f22266n = new java.util.ArrayList(this.f22266n);
                    this.f22263k |= 4;
                }
                this.f22266n.addAll(c2165l.f22272m);
            }
        }
        e(c2165l);
        this.f25492h = this.f25492h.e(c2165l.f22269i);
    }
}
