package K0;

import D1.C0223h;
import N6.InterfaceC0688b;
import N6.InterfaceC0694h;
import S7.w0;
import U.C0948v;
import U.EnumC0935h;
import U.i0;
import U7.EnumC0955c;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.concurrent.CancellationException;

public final class C0661i implements D7.c {

    public final int f6705a;

    public boolean f6706b;

    public Object f6707c;

    public Object f6708d;

    public C0661i() {
        this.f6705a = 4;
        this.f6707c = new Object();
    }

    @Override
    public boolean a(C7.M c9, C7.M c10) {
        kotlin.jvm.internal.m.e(c9, "c1");
        kotlin.jvm.internal.m.e(c10, "c2");
        if (c9.equals(c10)) {
            return true;
        }
        InterfaceC0694h interfaceC0694hH = c9.h();
        InterfaceC0694h interfaceC0694hH2 = c10.h();
        if (!(interfaceC0694hH instanceof N6.U) || !(interfaceC0694hH2 instanceof N6.U)) {
            return false;
        }
        return p127o7.b.f26146a.d((N6.U) interfaceC0694hH, (N6.U) interfaceC0694hH2, this.f6706b, new B5.n((InterfaceC0688b) this.f6707c, (InterfaceC0688b) this.f6708d, 13));
    }

    public boolean b(long j) {
        Object obj;
        ArrayList arrayList = (ArrayList) ((S.p) this.f6708d).f9153i;
        int size = arrayList.size();
        int i3 = 0;
        while (true) {
            if (i3 >= size) {
                obj = null;
                break;
            }
            obj = arrayList.get(i3);
            if (w.e(((z) obj).f6754a, j)) {
                break;
            }
            i3++;
        }
        z zVar = (z) obj;
        if (zVar != null) {
            return zVar.f6760h;
        }
        return false;
    }

    public void c() {
        ((U7.j) this.f6707c).i(new CancellationException("onBack cancelled"), true);
        ((w0) this.f6708d).e(null);
    }

    public EnumC0935h d() {
        C0948v c0948v = (C0948v) this.f6708d;
        int i3 = c0948v.f10086b;
        int i9 = c0948v.f10087c;
        if (i3 < i9) {
            return EnumC0935h.f9998i;
        }
        return i3 > i9 ? EnumC0935h.f9997h : EnumC0935h.j;
    }

    public void e() {
        if (this.f6706b) {
            i0.b((i0) this.f6708d, (p011b1.L) this.f6707c);
        }
    }

    public long f(g1.x xVar, long j, boolean z6, C0223h c0223h) {
        long jC = i0.c((i0) this.f6708d, xVar, j, z6, false, c0223h, false);
        if (!p011b1.L.a(jC, (p011b1.L) this.f6707c)) {
            this.f6706b = false;
        }
        ((i0) this.f6708d).q(p011b1.L.c(jC) ? J.M.j : J.M.f5655i);
        return jC;
    }

    public void g(p059g4.f fVar) {
        synchronized (this.f6707c) {
            try {
                if (((ArrayDeque) this.f6708d) == null) {
                    this.f6708d = new ArrayDeque();
                }
                ((ArrayDeque) this.f6708d).add(fVar);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void h(A0.a aVar) {
        p059g4.f fVar;
        synchronized (this.f6707c) {
            if (((ArrayDeque) this.f6708d) != null && !this.f6706b) {
                this.f6706b = true;
                while (true) {
                    synchronized (this.f6707c) {
                        try {
                            fVar = (p059g4.f) ((ArrayDeque) this.f6708d).poll();
                            if (fVar == null) {
                                this.f6706b = false;
                                return;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    fVar.a(aVar);
                }
            }
        }
    }

    public String toString() {
        switch (this.f6705a) {
            case 1:
                return "SingleSelectionLayout(isStartHandle=" + this.f6706b + ", crossed=" + d() + ", info=\n\t" + ((C0948v) this.f6708d) + ')';
            default:
                return super.toString();
        }
    }

    public C0661i(int i3, Object obj, Object obj2, boolean z6) {
        this.f6705a = i3;
        this.f6706b = z6;
        this.f6707c = obj;
        this.f6708d = obj2;
    }

    public C0661i(p136q.r rVar, S.p pVar) {
        this.f6705a = 0;
        this.f6707c = rVar;
        this.f6708d = pVar;
    }

    public C0661i(S7.A a2, boolean z6, p194x6.m mVar, p029d.j jVar) {
        this.f6705a = 3;
        this.f6706b = z6;
        this.f6707c = N3.a.b(-2, 4, EnumC0955c.f10175h);
        this.f6708d = S7.C.A(a2, null, new p029d.i(jVar, mVar, this, null), 3);
    }

    public C0661i(i0 i0Var) {
        this.f6705a = 2;
        this.f6708d = i0Var;
        this.f6706b = true;
    }
}
