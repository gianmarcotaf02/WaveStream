package K0;

import Q0.A0;
import Q0.AbstractC0777k;
import Q0.C0;
import Q0.C0767c0;
import Q0.C0778l;
import Q0.InterfaceC0774h;
import Q0.t0;

public abstract class AbstractC0660h extends p137q0.o implements C0, t0, InterfaceC0774h {

    public C0778l f6702v;

    public C0653a f6703w;

    public boolean f6704x;

    public AbstractC0660h(C0653a c0653a, C0778l c0778l) {
        this.f6702v = c0778l;
        this.f6703w = c0653a;
    }

    @Override
    public final void D() {
        R0();
    }

    @Override
    public final void G0() {
        R0();
    }

    public final void N0() {
        C0653a c0653a;
        kotlin.jvm.internal.A a2 = new kotlin.jvm.internal.A();
        AbstractC0777k.x(this, new C0659g(1));
        AbstractC0660h abstractC0660h = (AbstractC0660h) a2.f24539h;
        if (abstractC0660h == null || (c0653a = abstractC0660h.f6703w) == null) {
            c0653a = this.f6703w;
        }
        O0(c0653a);
    }

    public abstract void O0(InterfaceC0672u interfaceC0672u);

    public final void P0() {
        kotlin.jvm.internal.w wVar = new kotlin.jvm.internal.w();
        wVar.f24553h = true;
        AbstractC0777k.y(this, new C0658f(wVar));
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
                AbstractC0777k.x(this, new J0.j(a2, 1));
                AbstractC0660h abstractC0660h = (AbstractC0660h) a2.f24539h;
                if (abstractC0660h != null) {
                    abstractC0660h.N0();
                } else {
                    O0(null);
                }
            }
        }
    }

    @Override
    public final void X(C0667o c0667o, EnumC0668p enumC0668p, long j) {
        if (enumC0668p == EnumC0668p.f6731i) {
            ?? r9 = c0667o.f6724a;
            int size = r9.size();
            for (int i3 = 0; i3 < size; i3++) {
                if (Q0(((x) r9.get(i3)).f6745i)) {
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

    @Override
    public final long h() {
        C0778l c0778l = this.f6702v;
        if (c0778l == null) {
            return A0.f8200a;
        }
        p113n1.c cVar = AbstractC0777k.t(this).f8226G;
        int i3 = A0.f8201b;
        return C0767c0.c(cVar.k0(c0778l.f8446a), cVar.k0(c0778l.f8447b), cVar.k0(c0778l.f8448c), cVar.k0(c0778l.f8449d));
    }
}
