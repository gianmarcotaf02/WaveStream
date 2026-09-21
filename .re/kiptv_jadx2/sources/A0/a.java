package A0;

import K0.C0657e;
import K0.C0661i;
import K0.w;
import K0.x;
import N6.C0708w;
import Q0.C0783q;
import Q0.F;
import Q0.H;
import S7.A;
import Y.B;
import Y.u;
import androidx.compose.ui.platform.AndroidComposeView;
import java.util.ArrayList;
import kotlin.jvm.functions.Function0;
import p136q.r;
import p163t.AbstractC2750d;
import p163t.AbstractC2781z;
import p163t.C2748c;
import p163t.D0;
import p188x0.C3098s;
import p191x3.C;

public final class a {

    public boolean f12a;

    public Object f13b;

    public Object f14c;

    public Object f15d;

    public Object f16e;

    public a() {
        this.f13b = new Object();
        this.f14c = new C0661i();
    }

    public void a(p059g4.a aVar) {
        ((C0661i) this.f14c).g(new p059g4.f(p059g4.e.f21866a, aVar));
        l();
    }

    public void b(p059g4.b bVar) {
        ((C0661i) this.f14c).g(new p059g4.f(p059g4.e.f21866a, bVar));
        l();
    }

    public void c(p059g4.c cVar) {
        ((C0661i) this.f14c).g(new p059g4.f(p059g4.e.f21866a, cVar));
        l();
    }

    public void d(H h9, float f9, long j) {
        float fFloatValue = ((Number) ((C2748c) this.f14c).d()).floatValue();
        if (fFloatValue > 0.0f) {
            long jC = C3098s.c(j, fFloatValue);
            if (!this.f12a) {
                p203z0.d.r(h9, jC, f9, 0L, null, 124);
                return;
            }
            p203z0.b bVar = h9.f8266h;
            float fD = p181w0.d.d(bVar.d());
            float fB = p181w0.d.b(bVar.d());
            j1.l lVar = bVar.f32128i;
            long jQ = lVar.q();
            lVar.j().e();
            try {
                ((j1.l) ((C) lVar.f23899i).f31153h).j().k(0.0f, 0.0f, fD, fB, 1);
                p203z0.d.r(h9, jC, f9, 0L, null, 124);
            } finally {
                p121o0.p.z(lVar, jQ);
            }
        }
    }

    public Exception e() {
        Exception exc;
        synchronized (this.f13b) {
            exc = (Exception) this.f16e;
        }
        return exc;
    }

    public Object f() {
        Object obj;
        synchronized (this.f13b) {
            try {
                H3.q.i("Task is not yet complete", this.f12a);
                Exception exc = (Exception) this.f16e;
                if (exc != null) {
                    throw new I3.b(exc);
                }
                obj = this.f15d;
            } catch (Throwable th) {
                throw th;
            }
        }
        return obj;
    }

    public void g(p202z.j jVar, A a2) {
        float f9;
        boolean z6 = jVar instanceof p202z.h;
        ArrayList arrayList = (ArrayList) this.f15d;
        if (z6) {
            arrayList.add(jVar);
        } else if (jVar instanceof p202z.i) {
            arrayList.remove(((p202z.i) jVar).f32116a);
        } else if (jVar instanceof p202z.d) {
            arrayList.add(jVar);
        } else if (jVar instanceof p202z.e) {
            arrayList.remove(((p202z.e) jVar).f32111a);
        } else if (jVar instanceof p202z.b) {
            arrayList.add(jVar);
        } else if (jVar instanceof p202z.c) {
            arrayList.remove(((p202z.c) jVar).f32110a);
        } else if (!(jVar instanceof p202z.a)) {
            return;
        } else {
            arrayList.remove(((p202z.a) jVar).f32109a);
        }
        p202z.j jVar2 = (p202z.j) p078i6.o.s1(arrayList);
        if (kotlin.jvm.internal.m.a((p202z.j) this.f16e, jVar2)) {
            return;
        }
        if (jVar2 != null) {
            Y.h hVar = (Y.h) ((kotlin.jvm.internal.o) this.f13b).invoke();
            if (z6) {
                f9 = hVar.f10979c;
            } else if (jVar instanceof p202z.d) {
                f9 = hVar.f10978b;
            } else {
                f9 = jVar instanceof p202z.b ? hVar.f10977a : 0.0f;
            }
            D0 d4 = u.f11016a;
            boolean z9 = jVar2 instanceof p202z.h;
            D0 d6 = u.f11016a;
            if (!z9 && ((jVar2 instanceof p202z.d) || (jVar2 instanceof p202z.b))) {
                d6 = new D0(45, AbstractC2781z.f27739c, 2);
            }
            S7.C.A(a2, null, new Y.A(this, f9, d6, null), 3);
        } else {
            p202z.j jVar3 = (p202z.j) this.f16e;
            D0 d9 = u.f11016a;
            boolean z10 = jVar3 instanceof p202z.h;
            D0 d10 = u.f11016a;
            if (!z10 && !(jVar3 instanceof p202z.d) && (jVar3 instanceof p202z.b)) {
                d10 = new D0(150, AbstractC2781z.f27739c, 2);
            }
            S7.C.A(a2, null, new B(this, d10, null), 3);
        }
        this.f16e = jVar2;
    }

    public boolean h() {
        boolean z6;
        synchronized (this.f13b) {
            z6 = false;
            if (this.f12a && ((Exception) this.f16e) == null) {
                z6 = true;
            }
        }
        return z6;
    }

    public int i(S.p pVar, AndroidComposeView androidComposeView, boolean z6) {
        int i3;
        Object[] objArr;
        C0657e c0657e;
        int i9;
        int i10;
        C0783q c0783q = (C0783q) this.f16e;
        if (this.f12a) {
            return 0;
        }
        try {
            this.f12a = true;
            C0661i c0661iI = ((A.a) this.f15d).I(pVar, androidComposeView);
            r rVar = (r) c0661iI.f6707c;
            int iF = rVar.f();
            while (true) {
                if (i3 >= iF) {
                    objArr = true;
                    break;
                }
                x xVar = (x) rVar.g(i3);
                i3 = (xVar.f6741d || xVar.f6744h) ? 0 : i3 + 1;
                objArr = false;
                break;
            }
            int iF2 = rVar.f();
            int i11 = 0;
            while (true) {
                c0657e = (C0657e) this.f14c;
                if (i11 >= iF2) {
                    break;
                }
                x xVar2 = (x) rVar.g(i11);
                if (objArr != false || w.b(xVar2)) {
                    ((F) this.f13b).D(xVar2.f6740c, (C0783q) this.f16e, xVar2.f6745i, true);
                    if (!c0783q.f8458h.h()) {
                        c0657e.a(xVar2.f6738a, w.b(xVar2), c0783q);
                        c0783q.clear();
                    }
                }
                i11++;
            }
            boolean zB = c0657e.b(c0661iI, z6);
            if (c0661iI.f6706b) {
                i9 = 0;
                break;
            }
            int iF3 = rVar.f();
            int i12 = 0;
            while (true) {
                if (i12 >= iF3) {
                    i9 = 0;
                    break;
                }
                x xVar3 = (x) rVar.g(i12);
                if (!p181w0.a.b(w.g(xVar3, true), 0L) && xVar3.b()) {
                    i9 = 1;
                    break;
                }
                i12++;
            }
            int iF4 = rVar.f();
            for (int i13 = 0; i13 < iF4; i13++) {
                if (((x) rVar.g(i13)).b()) {
                    i10 = 1;
                    return (zB ? 1 : 0) | (i9 << 1) | (i10 << 2);
                }
            }
            i10 = 0;
            return (zB ? 1 : 0) | (i9 << 1) | (i10 << 2);
        } finally {
            this.f12a = false;
        }
    }

    public void j(Exception exc) {
        synchronized (this.f13b) {
            k();
            this.f12a = true;
            this.f16e = exc;
        }
        ((C0661i) this.f14c).h(this);
    }

    public void k() {
        boolean z6;
        String strConcat;
        if (this.f12a) {
            int i3 = C0708w.f7424h;
            synchronized (this.f13b) {
                z6 = this.f12a;
            }
            if (!z6) {
                throw new IllegalStateException("DuplicateTaskCompletionException can only be created from completed Task.");
            }
            Exception excE = e();
            if (excE == null) {
                strConcat = h() ? "result ".concat(String.valueOf(f())) : "unknown issue";
            } else {
                strConcat = "failure";
            }
        }
    }

    public void l() {
        synchronized (this.f13b) {
            try {
                if (this.f12a) {
                    ((C0661i) this.f14c).h(this);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public a(boolean z6, Function0 function0) {
        this.f12a = z6;
        this.f13b = (kotlin.jvm.internal.o) function0;
        this.f14c = AbstractC2750d.a(0.0f);
        this.f15d = new ArrayList();
    }
}
