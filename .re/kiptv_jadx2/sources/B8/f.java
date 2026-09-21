package B8;

import E.i;
import E.j;
import E.s;
import E.t;
import F.C0344i;
import Y2.L;
import java.util.ArrayList;
import kotlin.jvm.internal.m;
import p078i6.w;
import w8.B;
import w8.p;
import w8.v;

public final class f {

    public final ArrayList f850a;

    public int f851b;

    public int f852c;

    public int f853d;

    public int f854e;

    public int f855f;
    public final Object g;

    public final Object f856h;

    public Object f857i;

    public f(j jVar) {
        this.g = jVar;
        ArrayList arrayList = new ArrayList();
        arrayList.add(new s(0, 0));
        this.f850a = arrayList;
        this.f854e = -1;
        this.f856h = new ArrayList();
        this.f857i = w.f23205h;
    }

    public static f a(f fVar, int i3, A8.e eVar, v vVar, int i9) {
        if ((i9 & 1) != 0) {
            i3 = fVar.f851b;
        }
        int i10 = i3;
        if ((i9 & 2) != 0) {
            eVar = (A8.e) fVar.f856h;
        }
        A8.e eVar2 = eVar;
        if ((i9 & 4) != 0) {
            vVar = (v) fVar.f857i;
        }
        v request = vVar;
        m.e(request, "request");
        return new f((A8.j) fVar.g, fVar.f850a, i10, eVar2, request, fVar.f852c, fVar.f853d, fVar.f854e);
    }

    public int b() {
        return ((int) Math.sqrt((((double) e()) * 1.0d) / ((double) this.f855f))) + 1;
    }

    public L c(int i3) {
        Object obj;
        ((j) this.g).getClass();
        int i9 = this.f855f;
        int i10 = i3 * i9;
        int iE = e() - i10;
        if (i9 > iE) {
            i9 = iE;
        }
        if (i9 < 0) {
            i9 = 0;
        }
        if (i9 == this.f857i.size()) {
            obj = this.f857i;
        } else {
            ArrayList arrayList = new ArrayList(i9);
            for (int i11 = 0; i11 < i9; i11++) {
                arrayList.add(new E.e(1));
            }
            this.f857i = arrayList;
            obj = arrayList;
        }
        return new L(i10, obj, 3);
    }

    public int d(int i3) {
        if (e() <= 0) {
            return 0;
        }
        if (i3 >= e()) {
            A.b.a("ItemIndex > total count");
        }
        ((j) this.g).getClass();
        return i3 / this.f855f;
    }

    public int e() {
        return ((j) this.g).f2641c.f861i;
    }

    public B f(v request) {
        m.e(request, "request");
        ArrayList arrayList = this.f850a;
        int size = arrayList.size();
        int i3 = this.f851b;
        if (i3 >= size) {
            throw new IllegalStateException("Check failed.");
        }
        this.f855f++;
        A8.e eVar = (A8.e) this.f856h;
        if (eVar != null) {
            if (!eVar.f386b.b(request.f30659a)) {
                throw new IllegalStateException(("network interceptor " + arrayList.get(i3 - 1) + " must retain the same host and port").toString());
            }
            if (this.f855f != 1) {
                throw new IllegalStateException(("network interceptor " + arrayList.get(i3 - 1) + " must call proceed() exactly once").toString());
            }
        }
        int i9 = i3 + 1;
        f fVarA = a(this, i9, null, request, 58);
        p pVar = (p) arrayList.get(i3);
        B bA = pVar.a(fVarA);
        if (bA == null) {
            throw new NullPointerException("interceptor " + pVar + " returned null");
        }
        if (eVar != null && i9 < arrayList.size() && fVarA.f855f != 1) {
            throw new IllegalStateException(("network interceptor " + pVar + " must call proceed() exactly once").toString());
        }
        if (bA.f30491n != null) {
            return bA;
        }
        throw new IllegalStateException(("interceptor " + pVar + " returned a response with no body").toString());
    }

    public int g(int i3) {
        t tVar = t.f2706a;
        C0344i c0344iC = ((j) this.g).f2641c.c(i3);
        return (int) ((E.e) ((i) c0344iC.f3463c).f2636b.invoke(tVar, Integer.valueOf(i3 - c0344iC.f3461a))).f2617a;
    }

    public f(A8.j call, ArrayList arrayList, int i3, A8.e eVar, v request, int i9, int i10, int i11) {
        m.e(call, "call");
        m.e(request, "request");
        this.g = call;
        this.f850a = arrayList;
        this.f851b = i3;
        this.f856h = eVar;
        this.f857i = request;
        this.f852c = i9;
        this.f853d = i10;
        this.f854e = i11;
    }
}
