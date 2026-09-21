package p011b1;

/* JADX INFO: renamed from: b1.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1658o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final E2.d f17828a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f17829b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f17830c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f17831d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f17832e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f17833f;
    public final java.util.ArrayList g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final java.util.ArrayList f17834h;

    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Object, java.util.Collection, java.util.List] */
    public C1658o(E2.d dVar, long j, int i3, int i9) {
        boolean z6;
        int i10;
        int iG;
        int i11;
        this.f17828a = dVar;
        this.f17829b = i3;
        if (p113n1.a.j(j) != 0 || p113n1.a.i(j) != 0) {
            p065h1.a.a("Setting Constraints.minWidth and Constraints.minHeight is not supported, these should be the default zero values instead.");
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.ArrayList arrayList2 = (java.util.ArrayList) dVar.f2771h;
        int size = arrayList2.size();
        float f9 = 0.0f;
        int i12 = 0;
        int i13 = 0;
        while (true) {
            if (i12 >= size) {
                z6 = false;
                break;
            }
            p011b1.r rVar = (p011b1.r) arrayList2.get(i12);
            j1.c cVar = rVar.f17843a;
            int iH = p113n1.a.h(j);
            if (p113n1.a.c(j)) {
                i10 = i12;
                iG = p113n1.a.g(j) - ((int) java.lang.Math.ceil(f9));
                if (iG < 0) {
                    iG = 0;
                }
            } else {
                i10 = i12;
                iG = p113n1.a.g(j);
            }
            p011b1.C1644a c1644a = new p011b1.C1644a(cVar, this.f17829b - i13, i9, p113n1.b.b(iH, iG, 5));
            float fB = c1644a.b() + f9;
            p021c1.i iVar = c1644a.f17794d;
            int i14 = i13 + iVar.g;
            arrayList.add(new p011b1.q(c1644a, rVar.f17844b, rVar.f17845c, i13, i14, f9, fB));
            if (!iVar.f18471d) {
                if (i14 == this.f17829b) {
                    i11 = i10;
                    if (i11 != p078i6.p.A0((java.util.ArrayList) this.f17828a.f2771h)) {
                    }
                } else {
                    i11 = i10;
                }
                i12 = i11 + 1;
                i13 = i14;
                f9 = fB;
            }
            z6 = true;
            i13 = i14;
            f9 = fB;
            break;
        }
        this.f17832e = f9;
        this.f17833f = i13;
        this.f17830c = z6;
        this.f17834h = arrayList;
        this.f17831d = p113n1.a.h(j);
        java.util.ArrayList arrayList3 = new java.util.ArrayList(arrayList.size());
        int size2 = arrayList.size();
        for (int i15 = 0; i15 < size2; i15++) {
            p011b1.q qVar = (p011b1.q) arrayList.get(i15);
            ?? r9 = qVar.f17837a.f17796f;
            java.util.ArrayList arrayList4 = new java.util.ArrayList(r9.size());
            int size3 = r9.size();
            for (int i16 = 0; i16 < size3; i16++) {
                p181w0.b bVar = (p181w0.b) r9.get(i16);
                arrayList4.add(bVar != null ? qVar.a(bVar) : null);
            }
            p078i6.u.M0(arrayList3, arrayList4);
        }
        if (arrayList3.size() < ((java.util.List) this.f17828a.j).size()) {
            int size4 = ((java.util.List) this.f17828a.j).size() - arrayList3.size();
            java.util.ArrayList arrayList5 = new java.util.ArrayList(size4);
            for (int i17 = 0; i17 < size4; i17++) {
                arrayList5.add(null);
            }
            arrayList3 = p078i6.o.A1(arrayList3, arrayList5);
        }
        this.g = arrayList3;
    }

    public static void i(p011b1.C1658o c1658o, p188x0.InterfaceC3097q interfaceC3097q, p188x0.AbstractC3095o abstractC3095o, float f9, p188x0.N n3, p104m1.l lVar, p203z0.c cVar) {
        interfaceC3097q.e();
        java.util.ArrayList arrayList = c1658o.f17834h;
        if (arrayList.size() <= 1 || (abstractC3095o instanceof p188x0.S)) {
            j1.j.b(c1658o, interfaceC3097q, abstractC3095o, f9, n3, lVar, cVar);
        } else {
            if (!(abstractC3095o instanceof p188x0.M)) {
                throw new I3.b();
            }
            int size = arrayList.size();
            float fMax = 0.0f;
            float fB = 0.0f;
            for (int i3 = 0; i3 < size; i3++) {
                p011b1.q qVar = (p011b1.q) arrayList.get(i3);
                fB += qVar.f17837a.b();
                fMax = java.lang.Math.max(fMax, qVar.f17837a.d());
            }
            android.graphics.Shader shaderB = ((p188x0.M) abstractC3095o).b((((long) java.lang.Float.floatToRawIntBits(fMax)) << 32) | (((long) java.lang.Float.floatToRawIntBits(fB)) & 4294967295L));
            android.graphics.Matrix matrix = new android.graphics.Matrix();
            shaderB.getLocalMatrix(matrix);
            int size2 = arrayList.size();
            for (int i9 = 0; i9 < size2; i9++) {
                p011b1.q qVar2 = (p011b1.q) arrayList.get(i9);
                qVar2.f17837a.g(interfaceC3097q, new p188x0.C3096p(shaderB), f9, n3, lVar, cVar);
                p011b1.C1644a c1644a = qVar2.f17837a;
                interfaceC3097q.l(0.0f, c1644a.b());
                matrix.setTranslate(0.0f, -c1644a.b());
                shaderB.setLocalMatrix(matrix);
            }
        }
        interfaceC3097q.p();
    }

    public final void a(long j, float[] fArr) {
        j(p011b1.L.f(j));
        k(p011b1.L.e(j));
        kotlin.jvm.internal.y yVar = new kotlin.jvm.internal.y();
        yVar.f24555h = 0;
        p011b1.D.g(this.f17834h, j, new p011b1.C1657n(j, fArr, yVar, new kotlin.jvm.internal.x()));
    }

    public final float b(int i3) {
        l(i3);
        java.util.ArrayList arrayList = this.f17834h;
        p011b1.q qVar = (p011b1.q) arrayList.get(p011b1.D.e(i3, arrayList));
        p011b1.C1644a c1644a = qVar.f17837a;
        return c1644a.f17794d.e(i3 - qVar.f17840d) + qVar.f17842f;
    }

    public final int c(int i3, boolean z6) {
        int iF;
        l(i3);
        java.util.ArrayList arrayList = this.f17834h;
        p011b1.q qVar = (p011b1.q) arrayList.get(p011b1.D.e(i3, arrayList));
        p011b1.C1644a c1644a = qVar.f17837a;
        int i9 = i3 - qVar.f17840d;
        p021c1.i iVar = c1644a.f17794d;
        if (z6) {
            android.text.Layout layout = iVar.f18473f;
            java.lang.ThreadLocal threadLocal = p021c1.j.f18483a;
            if (layout.getEllipsisCount(i9) <= 0 || iVar.f18469b != android.text.TextUtils.TruncateAt.END) {
                E2.d dVarC = iVar.c();
                android.text.Layout layout2 = (android.text.Layout) dVarC.j;
                iF = dVarC.r(layout2.getLineEnd(i9), layout2.getLineStart(i9));
            } else {
                iF = layout.getEllipsisStart(i9) + layout.getLineStart(i9);
            }
        } else {
            iF = iVar.f(i9);
        }
        return iF + qVar.f17838b;
    }

    public final int d(int i3) {
        int iD;
        int length = ((p011b1.C1650g) this.f17828a.f2772i).f17809i.length();
        java.util.ArrayList arrayList = this.f17834h;
        if (i3 >= length) {
            iD = p078i6.p.A0(arrayList);
        } else {
            iD = i3 < 0 ? 0 : p011b1.D.d(i3, arrayList);
        }
        p011b1.q qVar = (p011b1.q) arrayList.get(iD);
        return qVar.f17837a.f17794d.f18473f.getLineForOffset(qVar.d(i3)) + qVar.f17840d;
    }

    public final int e(float f9) {
        java.util.ArrayList arrayList = this.f17834h;
        p011b1.q qVar = (p011b1.q) arrayList.get(p011b1.D.f(arrayList, f9));
        int i3 = qVar.f17839c - qVar.f17838b;
        int i9 = qVar.f17840d;
        if (i3 == 0) {
            return i9;
        }
        float f10 = f9 - qVar.f17842f;
        p021c1.i iVar = qVar.f17837a.f17794d;
        return iVar.f18473f.getLineForVertical(((int) f10) - iVar.f18474h) + i9;
    }

    public final float f(int i3) {
        l(i3);
        java.util.ArrayList arrayList = this.f17834h;
        p011b1.q qVar = (p011b1.q) arrayList.get(p011b1.D.e(i3, arrayList));
        p011b1.C1644a c1644a = qVar.f17837a;
        return c1644a.f17794d.g(i3 - qVar.f17840d) + qVar.f17842f;
    }

    public final int g(long j) {
        java.util.ArrayList arrayList = this.f17834h;
        int i3 = (int) (j & 4294967295L);
        p011b1.q qVar = (p011b1.q) arrayList.get(p011b1.D.f(arrayList, java.lang.Float.intBitsToFloat(i3)));
        int i9 = qVar.f17839c;
        int i10 = qVar.f17838b;
        if (i9 - i10 == 0) {
            return i10;
        }
        float fIntBitsToFloat = java.lang.Float.intBitsToFloat((int) (j >> 32));
        long jFloatToRawIntBits = (((long) java.lang.Float.floatToRawIntBits(java.lang.Float.intBitsToFloat(i3) - qVar.f17842f)) & 4294967295L) | (java.lang.Float.floatToRawIntBits(fIntBitsToFloat) << 32);
        p011b1.C1644a c1644a = qVar.f17837a;
        int iIntBitsToFloat = (int) java.lang.Float.intBitsToFloat((int) (4294967295L & jFloatToRawIntBits));
        p021c1.i iVar = c1644a.f17794d;
        int i11 = iIntBitsToFloat - iVar.f18474h;
        android.text.Layout layout = iVar.f18473f;
        int lineForVertical = layout.getLineForVertical(i11);
        return layout.getOffsetForHorizontal(lineForVertical, (iVar.b(lineForVertical) * (-1)) + java.lang.Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32))) + i10;
    }

    public final long h(p181w0.b bVar, int i3, D1.C0223h c0223h) {
        long jB;
        long j;
        java.util.ArrayList arrayList = this.f17834h;
        int iF = p011b1.D.f(arrayList, bVar.f29747b);
        float f9 = ((p011b1.q) arrayList.get(iF)).g;
        float f10 = bVar.f29749d;
        if (f9 >= f10 || iF == p078i6.p.A0(arrayList)) {
            p011b1.q qVar = (p011b1.q) arrayList.get(iF);
            return qVar.b(qVar.f17837a.c(qVar.c(bVar), i3, c0223h), true);
        }
        int iF2 = p011b1.D.f(arrayList, f10);
        long jB2 = p011b1.L.f17782b;
        while (true) {
            jB = p011b1.L.f17782b;
            if (!p011b1.L.b(jB2, jB) || iF > iF2) {
                break;
            }
            p011b1.q qVar2 = (p011b1.q) arrayList.get(iF);
            jB2 = qVar2.b(qVar2.f17837a.c(qVar2.c(bVar), i3, c0223h), true);
            iF++;
        }
        if (p011b1.L.b(jB2, jB)) {
            return jB;
        }
        while (true) {
            j = p011b1.L.f17782b;
            if (!p011b1.L.b(jB, j) || iF > iF2) {
                break;
            }
            p011b1.q qVar3 = (p011b1.q) arrayList.get(iF2);
            jB = qVar3.b(qVar3.f17837a.c(qVar3.c(bVar), i3, c0223h), true);
            iF2--;
        }
        return p011b1.L.b(jB, j) ? jB2 : p011b1.D.b((int) (jB2 >> 32), (int) (4294967295L & jB));
    }

    public final void j(int i3) {
        boolean z6 = false;
        E2.d dVar = this.f17828a;
        if (i3 >= 0 && i3 < ((p011b1.C1650g) dVar.f2772i).f17809i.length()) {
            z6 = true;
        }
        if (z6) {
            return;
        }
        java.lang.StringBuilder sbT = p121o0.p.t(i3, "offset(", ") is out of bounds [0, ");
        sbT.append(((p011b1.C1650g) dVar.f2772i).f17809i.length());
        sbT.append(')');
        p065h1.a.a(sbT.toString());
    }

    public final void k(int i3) {
        boolean z6 = false;
        E2.d dVar = this.f17828a;
        if (i3 >= 0 && i3 <= ((p011b1.C1650g) dVar.f2772i).f17809i.length()) {
            z6 = true;
        }
        if (z6) {
            return;
        }
        java.lang.StringBuilder sbT = p121o0.p.t(i3, "offset(", ") is out of bounds [0, ");
        sbT.append(((p011b1.C1650g) dVar.f2772i).f17809i.length());
        sbT.append(']');
        p065h1.a.a(sbT.toString());
    }

    public final void l(int i3) {
        boolean z6 = false;
        int i9 = this.f17833f;
        if (i3 >= 0 && i3 < i9) {
            z6 = true;
        }
        if (z6) {
            return;
        }
        p065h1.a.a("lineIndex(" + i3 + ") is out of bounds [0, " + i9 + ')');
    }
}
