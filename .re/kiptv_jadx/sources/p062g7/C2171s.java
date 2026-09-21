package p062g7;

/* JADX INFO: renamed from: g7.s, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2171s extends p110m7.AbstractC2638k {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f22303k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f22304l;

    @Override // p110m7.AbstractC2637j
    public final p110m7.AbstractC2629b b() {
        p062g7.C2172t c2172t = new p062g7.C2172t(this);
        int i3 = (this.f22303k & 1) != 1 ? 0 : 1;
        c2172t.f22308k = this.f22304l;
        c2172t.j = i3;
        if (c2172t.isInitialized()) {
            return c2172t;
        }
        throw new I3.b(12);
    }

    /* JADX WARN: Code duplicated, block: B:14:0x001b  */
    @Override // p110m7.AbstractC2637j
    public final p110m7.AbstractC2637j c(p110m7.C2633f c2633f, p110m7.C2635h c2635h) throws java.lang.Throwable {
        p062g7.C2172t c2172t = null;
        try {
            try {
                p062g7.C2172t.f22306o.getClass();
                f(new p062g7.C2172t(c2633f, c2635h));
                return this;
            } catch (p110m7.r e6) {
                p062g7.C2172t c2172t2 = (p062g7.C2172t) e6.f25503h;
                try {
                    throw e6;
                } catch (java.lang.Throwable th) {
                    th = th;
                    c2172t = c2172t2;
                    if (c2172t != null) {
                        f(c2172t);
                    }
                    throw th;
                }
            }
        } catch (java.lang.Throwable th2) {
            th = th2;
            if (c2172t != null) {
                f(c2172t);
            }
            throw th;
        }
    }

    public final java.lang.Object clone() {
        p062g7.C2171s c2171s = new p062g7.C2171s();
        p062g7.C2172t c2172t = new p062g7.C2172t(this);
        int i3 = (this.f22303k & 1) != 1 ? 0 : 1;
        c2172t.f22308k = this.f22304l;
        c2172t.j = i3;
        c2171s.f(c2172t);
        return c2171s;
    }

    @Override // p110m7.AbstractC2637j
    public final /* bridge */ /* synthetic */ p110m7.AbstractC2637j d(p110m7.o oVar) {
        f((p062g7.C2172t) oVar);
        return this;
    }

    public final void f(p062g7.C2172t c2172t) {
        if (c2172t == p062g7.C2172t.f22305n) {
            return;
        }
        if ((c2172t.j & 1) == 1) {
            int i3 = c2172t.f22308k;
            this.f22303k = 1 | this.f22303k;
            this.f22304l = i3;
        }
        e(c2172t);
        this.f25492h = this.f25492h.e(c2172t.f22307i);
    }
}
