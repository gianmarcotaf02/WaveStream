package F3;

import C7.C0173e;
import D1.X;
import N6.InterfaceC0698l;
import N6.U;
import android.graphics.Paint;
import android.graphics.PorterDuffXfermode;
import android.graphics.Shader;
import android.os.Build;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import p136q.T;
import p188x0.AbstractC3087g;
import p188x0.C3089i;
import p188x0.C3092l;

public final class C0371k implements Z6.f {

    public int f3600a;

    public Object f3601b;

    public Object f3602c;

    public Object f3603d;

    public Object f3604e;

    public C0371k(A7.m c9, InterfaceC0698l interfaceC0698l, p027c7.e typeParameterOwner, int i3) {
        kotlin.jvm.internal.m.e(c9, "c");
        kotlin.jvm.internal.m.e(typeParameterOwner, "typeParameterOwner");
        this.f3601b = c9;
        this.f3602c = interfaceC0698l;
        this.f3600a = i3;
        ArrayList typeParameters = typeParameterOwner.getTypeParameters();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it = typeParameters.iterator();
        int i9 = 0;
        while (it.hasNext()) {
            linkedHashMap.put(it.next(), Integer.valueOf(i9));
            i9++;
        }
        this.f3603d = linkedHashMap;
        this.f3604e = ((Z6.b) ((A7.m) this.f3601b).f321i).f12992a.c(new C0173e(14, this));
    }

    @Override
    public U a(T6.C javaTypeParameter) {
        kotlin.jvm.internal.m.e(javaTypeParameter, "javaTypeParameter");
        p007a7.F f9 = (p007a7.F) ((B7.j) this.f3604e).invoke(javaTypeParameter);
        return f9 != null ? f9 : ((Z6.f) ((A7.m) this.f3601b).j).a(javaTypeParameter);
    }

    public p114n2.t b(int i3) {
        return d(i3, (p114n2.v) this.f3601b, null, false);
    }

    public p114n2.t c(String route, boolean z6) {
        Object next;
        p114n2.v vVar;
        p114n2.t tVar;
        kotlin.jvm.internal.m.e(route, "route");
        T t9 = (T) this.f3602c;
        kotlin.jvm.internal.m.e(t9, "<this>");
        Iterator it = ((N7.a) N7.o.g0(new X(8, t9))).iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            tVar = (p114n2.t) next;
            if (O7.x.r0((String) tVar.f25671i.f8486e, route, false)) {
                break;
            }
        } while (tVar.f25671i.l(route) == null);
        p114n2.t tVar2 = (p114n2.t) next;
        if (tVar2 != null) {
            return tVar2;
        }
        if (!z6 || (vVar = ((p114n2.v) this.f3601b).j) == null) {
            return null;
        }
        C0371k c0371k = vVar.f25679m;
        c0371k.getClass();
        if (O7.q.N0(route)) {
            return null;
        }
        return c0371k.c(route, true);
    }

    public p114n2.t d(int i3, p114n2.t tVar, p114n2.t tVar2, boolean z6) {
        T t9 = (T) this.f3602c;
        p114n2.t tVarD = (p114n2.t) t9.d(i3);
        if (tVar2 != null) {
            if (kotlin.jvm.internal.m.a(tVarD, tVar2) && kotlin.jvm.internal.m.a(tVarD.j, tVar2.j)) {
                return tVarD;
            }
            tVarD = null;
        } else if (tVarD != null) {
            return tVarD;
        }
        p114n2.v vVar = (p114n2.v) this.f3601b;
        if (z6) {
            Iterator it = ((N7.a) N7.o.g0(new X(8, t9))).iterator();
            do {
                if (!it.hasNext()) {
                    tVarD = null;
                    break;
                }
                p114n2.t tVar3 = (p114n2.t) it.next();
                tVarD = (!(tVar3 instanceof p114n2.v) || kotlin.jvm.internal.m.a(tVar3, tVar)) ? null : ((p114n2.v) tVar3).f25679m.d(i3, vVar, tVar2, true);
            } while (tVarD == null);
        }
        if (tVarD != null) {
            return tVarD;
        }
        p114n2.v vVar2 = vVar.j;
        if (vVar2 == null || vVar2.equals(tVar)) {
            return null;
        }
        p114n2.v vVar3 = vVar.j;
        kotlin.jvm.internal.m.b(vVar3);
        return vVar3.f25679m.d(i3, vVar, tVar2, z6);
    }

    public int e() {
        Paint.Cap strokeCap = ((Paint) this.f3601b).getStrokeCap();
        int i3 = strokeCap == null ? -1 : AbstractC3087g.f31109a[strokeCap.ordinal()];
        if (i3 == 1) {
            return 0;
        }
        if (i3 != 2) {
            return i3 != 3 ? 0 : 2;
        }
        return 1;
    }

    public int f() {
        Paint.Join strokeJoin = ((Paint) this.f3601b).getStrokeJoin();
        int i3 = strokeJoin == null ? -1 : AbstractC3087g.f31110b[strokeJoin.ordinal()];
        if (i3 == 1) {
            return 0;
        }
        if (i3 != 2) {
            return i3 != 3 ? 0 : 1;
        }
        return 2;
    }

    public p114n2.s g(p114n2.s sVar, j1.l lVar, boolean z6, p114n2.t lastVisited) {
        p114n2.s sVarO;
        kotlin.jvm.internal.m.e(lastVisited, "lastVisited");
        ArrayList arrayList = new ArrayList();
        p114n2.v vVar = (p114n2.v) this.f3601b;
        Iterator it = vVar.iterator();
        while (true) {
            q2.h hVar = (q2.h) it;
            sVarO = null;
            if (!hVar.hasNext()) {
                break;
            }
            p114n2.t tVar = (p114n2.t) hVar.next();
            sVarO = kotlin.jvm.internal.m.a(tVar, lastVisited) ? null : tVar.n(lVar);
            if (sVarO != null) {
                arrayList.add(sVarO);
            }
        }
        p114n2.s sVar2 = (p114n2.s) p078i6.o.t1(arrayList);
        p114n2.v vVar2 = vVar.j;
        if (vVar2 != null && z6 && !vVar2.equals(lastVisited)) {
            sVarO = vVar2.o(lVar, vVar);
        }
        return (p114n2.s) p078i6.o.t1(p078i6.m.l0(new p114n2.s[]{sVar, sVar2, sVarO}));
    }

    public void h(float f9) {
        ((Paint) this.f3601b).setAlpha((int) Math.rint(f9 * 255.0f));
    }

    public void i(int i3) {
        if (this.f3600a == i3) {
            return;
        }
        this.f3600a = i3;
        int i9 = Build.VERSION.SDK_INT;
        Paint paint = (Paint) this.f3601b;
        if (i9 >= 29) {
            paint.setBlendMode(p188x0.z.E(i3));
        } else {
            paint.setXfermode(new PorterDuffXfermode(p188x0.z.L(i3)));
        }
    }

    public void j(long j) {
        ((Paint) this.f3601b).setColor(p188x0.z.H(j));
    }

    public void k(C3092l c3092l) {
        this.f3603d = c3092l;
        ((Paint) this.f3601b).setColorFilter(c3092l != null ? c3092l.f31116a : null);
    }

    public void l(int i3) {
        ((Paint) this.f3601b).setFilterBitmap(!(i3 == 0));
    }

    public void m(C3089i c3089i) {
        ((Paint) this.f3601b).setPathEffect(c3089i != null ? c3089i.f31114a : null);
        this.f3604e = c3089i;
    }

    public void n(Shader shader) {
        this.f3602c = shader;
        ((Paint) this.f3601b).setShader(shader);
    }

    public void o(int i3) {
        Paint.Cap cap;
        if (i3 == 2) {
            cap = Paint.Cap.SQUARE;
        } else if (i3 == 1) {
            cap = Paint.Cap.ROUND;
        } else {
            cap = i3 == 0 ? Paint.Cap.BUTT : Paint.Cap.BUTT;
        }
        ((Paint) this.f3601b).setStrokeCap(cap);
    }

    public void p(int i3) {
        Paint.Join join;
        if (i3 == 0) {
            join = Paint.Join.MITER;
        } else if (i3 == 2) {
            join = Paint.Join.BEVEL;
        } else {
            join = i3 == 1 ? Paint.Join.ROUND : Paint.Join.MITER;
        }
        ((Paint) this.f3601b).setStrokeJoin(join);
    }

    public void q(float f9) {
        ((Paint) this.f3601b).setStrokeWidth(f9);
    }

    public void r(int i3) {
        ((Paint) this.f3601b).setStyle(i3 == 1 ? Paint.Style.STROKE : Paint.Style.FILL);
    }

    public C0371k(Paint paint) {
        this.f3601b = paint;
        this.f3600a = 3;
    }
}
