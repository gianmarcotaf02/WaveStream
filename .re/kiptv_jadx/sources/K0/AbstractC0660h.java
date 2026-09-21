package K0;

/* JADX INFO: renamed from: K0.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0660h extends p137q0.o implements Q0.C0, Q0.t0, Q0.InterfaceC0774h {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public Q0.C0778l f6702v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public K0.C0653a f6703w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f6704x;

    public AbstractC0660h(K0.C0653a c0653a, Q0.C0778l c0778l) {
        this.f6702v = c0778l;
        this.f6703w = c0653a;
    }

    @Override // Q0.t0
    public final void D() {
        R0();
    }

    @Override // p137q0.o
    public final void G0() {
        R0();
    }

    public final void N0() {
        K0.C0653a c0653a;
        kotlin.jvm.internal.A a2 = new kotlin.jvm.internal.A();
        Q0.AbstractC0777k.x(this, new K0.C0659g(1));
        K0.AbstractC0660h abstractC0660h = (K0.AbstractC0660h) a2.f24539h;
        if (abstractC0660h == null || (c0653a = abstractC0660h.f6703w) == null) {
            c0653a = this.f6703w;
        }
        O0(c0653a);
    }

    public abstract void O0(K0.InterfaceC0672u interfaceC0672u);

    public final void P0() {
        kotlin.jvm.internal.w wVar = new kotlin.jvm.internal.w();
        wVar.f24553h = true;
        Q0.AbstractC0777k.y(this, new K0.C0658f(wVar));
        if (wVar.f24553h) {
            N0();
        }
    }

    public abstract boolean Q0(int i3);

    public final void R0() {
        if (this.f6704x) {
            this.f6704x = false;
            if (this.f26487u) {
                kotlin.jvm.internal.A a2 = new kotlin.jvm.internal.A();
                Q0.AbstractC0777k.x(this, new J0.j(a2, 1));
                K0.AbstractC0660h abstractC0660h = (K0.AbstractC0660h) a2.f24539h;
                if (abstractC0660h != null) {
                    abstractC0660h.N0();
                } else {
                    O0(null);
                }
            }
        }
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, java.util.Collection, java.util.List] */
    @Override // Q0.t0
    public final void X(K0.C0667o c0667o, K0.EnumC0668p enumC0668p, long j) {
        if (enumC0668p == K0.EnumC0668p.f6731i) {
            ?? r9 = c0667o.f6724a;
            int size = r9.size();
            for (int i3 = 0; i3 < size; i3++) {
                if (Q0(((K0.x) r9.get(i3)).f6745i)) {
                    int i9 = c0667o.f6729f;
                    if (i9 == 4) {
                        this.f6704x = true;
                        P0();
                        return;
                    } else {
                        if (i9 == 5) {
                            R0();
                            return;
                        }
                        return;
                    }
                }
            }
        }
    }

    @Override // Q0.t0
    public final long h() {
        Q0.C0778l c0778l = this.f6702v;
        if (c0778l == null) {
            return Q0.A0.f8200a;
        }
        p113n1.c cVar = Q0.AbstractC0777k.t(this).f8226G;
        int i3 = Q0.A0.f8201b;
        return Q0.C0767c0.c(cVar.k0(c0778l.f8446a), cVar.k0(c0778l.f8447b), cVar.k0(c0778l.f8448c), cVar.k0(c0778l.f8449d));
    }
}
