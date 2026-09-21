package F3;

/* JADX INFO: renamed from: F3.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0371k implements Z6.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f3600a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public java.lang.Object f3601b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public java.lang.Object f3602c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public java.lang.Object f3603d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public java.lang.Object f3604e;

    public C0371k(A7.m c9, N6.InterfaceC0698l interfaceC0698l, p027c7.e typeParameterOwner, int i3) {
        kotlin.jvm.internal.m.e(c9, "c");
        kotlin.jvm.internal.m.e(typeParameterOwner, "typeParameterOwner");
        this.f3601b = c9;
        this.f3602c = interfaceC0698l;
        this.f3600a = i3;
        java.util.ArrayList typeParameters = typeParameterOwner.getTypeParameters();
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        java.util.Iterator it = typeParameters.iterator();
        int i9 = 0;
        while (it.hasNext()) {
            linkedHashMap.put(it.next(), java.lang.Integer.valueOf(i9));
            i9++;
        }
        this.f3603d = linkedHashMap;
        this.f3604e = ((Z6.b) ((A7.m) this.f3601b).f321i).f12992a.c(new C7.C0173e(14, this));
    }

    @Override // Z6.f
    public N6.U a(T6.C javaTypeParameter) {
        kotlin.jvm.internal.m.e(javaTypeParameter, "javaTypeParameter");
        p007a7.F f9 = (p007a7.F) ((B7.j) this.f3604e).invoke(javaTypeParameter);
        return f9 != null ? f9 : ((Z6.f) ((A7.m) this.f3601b).j).a(javaTypeParameter);
    }

    public p114n2.t b(int i3) {
        return d(i3, (p114n2.v) this.f3601b, null, false);
    }

    public p114n2.t c(java.lang.String route, boolean z6) {
        java.lang.Object next;
        p114n2.v vVar;
        p114n2.t tVar;
        kotlin.jvm.internal.m.e(route, "route");
        p136q.T t9 = (p136q.T) this.f3602c;
        kotlin.jvm.internal.m.e(t9, "<this>");
        java.util.Iterator it = ((N7.a) N7.o.g0(new D1.X(8, t9))).iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            tVar = (p114n2.t) next;
            if (O7.x.r0((java.lang.String) tVar.f25671i.f8486e, route, false)) {
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
        F3.C0371k c0371k = vVar.f25679m;
        c0371k.getClass();
        if (O7.q.N0(route)) {
            return null;
        }
        return c0371k.c(route, true);
    }

    public p114n2.t d(int i3, p114n2.t tVar, p114n2.t tVar2, boolean z6) {
        p136q.T t9 = (p136q.T) this.f3602c;
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
            java.util.Iterator it = ((N7.a) N7.o.g0(new D1.X(8, t9))).iterator();
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
        android.graphics.Paint.Cap strokeCap = ((android.graphics.Paint) this.f3601b).getStrokeCap();
        int i3 = strokeCap == null ? -1 : p188x0.AbstractC3087g.f31109a[strokeCap.ordinal()];
        if (i3 == 1) {
            return 0;
        }
        if (i3 != 2) {
            return i3 != 3 ? 0 : 2;
        }
        return 1;
    }

    public int f() {
        android.graphics.Paint.Join strokeJoin = ((android.graphics.Paint) this.f3601b).getStrokeJoin();
        int i3 = strokeJoin == null ? -1 : p188x0.AbstractC3087g.f31110b[strokeJoin.ordinal()];
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
        java.util.ArrayList arrayList = new java.util.ArrayList();
        p114n2.v vVar = (p114n2.v) this.f3601b;
        java.util.Iterator it = vVar.iterator();
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
        ((android.graphics.Paint) this.f3601b).setAlpha((int) java.lang.Math.rint(f9 * 255.0f));
    }

    public void i(int i3) {
        if (this.f3600a == i3) {
            return;
        }
        this.f3600a = i3;
        int i9 = android.os.Build.VERSION.SDK_INT;
        android.graphics.Paint paint = (android.graphics.Paint) this.f3601b;
        if (i9 >= 29) {
            paint.setBlendMode(p188x0.z.E(i3));
        } else {
            paint.setXfermode(new android.graphics.PorterDuffXfermode(p188x0.z.L(i3)));
        }
    }

    public void j(long j) {
        ((android.graphics.Paint) this.f3601b).setColor(p188x0.z.H(j));
    }

    public void k(p188x0.C3092l c3092l) {
        this.f3603d = c3092l;
        ((android.graphics.Paint) this.f3601b).setColorFilter(c3092l != null ? c3092l.f31116a : null);
    }

    public void l(int i3) {
        ((android.graphics.Paint) this.f3601b).setFilterBitmap(!(i3 == 0));
    }

    public void m(p188x0.C3089i c3089i) {
        ((android.graphics.Paint) this.f3601b).setPathEffect(c3089i != null ? c3089i.f31114a : null);
        this.f3604e = c3089i;
    }

    public void n(android.graphics.Shader shader) {
        this.f3602c = shader;
        ((android.graphics.Paint) this.f3601b).setShader(shader);
    }

    public void o(int i3) {
        android.graphics.Paint.Cap cap;
        if (i3 == 2) {
            cap = android.graphics.Paint.Cap.SQUARE;
        } else if (i3 == 1) {
            cap = android.graphics.Paint.Cap.ROUND;
        } else {
            cap = i3 == 0 ? android.graphics.Paint.Cap.BUTT : android.graphics.Paint.Cap.BUTT;
        }
        ((android.graphics.Paint) this.f3601b).setStrokeCap(cap);
    }

    public void p(int i3) {
        android.graphics.Paint.Join join;
        if (i3 == 0) {
            join = android.graphics.Paint.Join.MITER;
        } else if (i3 == 2) {
            join = android.graphics.Paint.Join.BEVEL;
        } else {
            join = i3 == 1 ? android.graphics.Paint.Join.ROUND : android.graphics.Paint.Join.MITER;
        }
        ((android.graphics.Paint) this.f3601b).setStrokeJoin(join);
    }

    public void q(float f9) {
        ((android.graphics.Paint) this.f3601b).setStrokeWidth(f9);
    }

    public void r(int i3) {
        ((android.graphics.Paint) this.f3601b).setStyle(i3 == 1 ? android.graphics.Paint.Style.STROKE : android.graphics.Paint.Style.FILL);
    }

    public C0371k(android.graphics.Paint paint) {
        this.f3601b = paint;
        this.f3600a = 3;
    }
}
