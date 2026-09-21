package p011b1;

/* JADX INFO: loaded from: classes.dex */
public final class J {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p011b1.I f17772a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p011b1.C1658o f17773b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f17774c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f17775d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f17776e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final java.util.ArrayList f17777f;

    public J(p011b1.I i3, p011b1.C1658o c1658o, long j) {
        this.f17772a = i3;
        this.f17773b = c1658o;
        this.f17774c = j;
        java.util.ArrayList arrayList = c1658o.f17834h;
        float fD = 0.0f;
        this.f17775d = arrayList.isEmpty() ? 0.0f : ((p011b1.q) arrayList.get(0)).f17837a.f17794d.d(0);
        if (!arrayList.isEmpty()) {
            p011b1.q qVar = (p011b1.q) p078i6.o.q1(arrayList);
            p021c1.i iVar = qVar.f17837a.f17794d;
            fD = iVar.d(iVar.g - 1) + qVar.f17842f;
        }
        this.f17776e = fD;
        this.f17777f = c1658o.g;
    }

    public final p104m1.j a(int i3) {
        p011b1.C1658o c1658o = this.f17773b;
        c1658o.k(i3);
        int length = ((p011b1.C1650g) c1658o.f17828a.f2772i).f17809i.length();
        java.util.ArrayList arrayList = c1658o.f17834h;
        p011b1.q qVar = (p011b1.q) arrayList.get(i3 == length ? p078i6.p.A0(arrayList) : p011b1.D.d(i3, arrayList));
        return qVar.f17837a.f17794d.f18473f.isRtlCharAt(qVar.d(i3)) ? p104m1.j.f25174i : p104m1.j.f25173h;
    }

    public final p181w0.b b(int i3) {
        float fI;
        float fI2;
        float fH;
        float fH2;
        p011b1.C1658o c1658o = this.f17773b;
        c1658o.j(i3);
        java.util.ArrayList arrayList = c1658o.f17834h;
        p011b1.q qVar = (p011b1.q) arrayList.get(p011b1.D.d(i3, arrayList));
        p011b1.C1644a c1644a = qVar.f17837a;
        int iD = qVar.d(i3);
        java.lang.CharSequence charSequence = c1644a.f17795e;
        if (iD < 0 || iD >= charSequence.length()) {
            java.lang.StringBuilder sbT = p121o0.p.t(iD, "offset(", ") is out of bounds [0,");
            sbT.append(charSequence.length());
            sbT.append(')');
            p065h1.a.a(sbT.toString());
        }
        p021c1.i iVar = c1644a.f17794d;
        android.text.Layout layout = iVar.f18473f;
        int lineForOffset = layout.getLineForOffset(iD);
        float fG = iVar.g(lineForOffset);
        float fE = iVar.e(lineForOffset);
        boolean z6 = layout.getParagraphDirection(lineForOffset) == 1;
        boolean zIsRtlCharAt = layout.isRtlCharAt(iD);
        if (!z6 || zIsRtlCharAt) {
            if (z6 && zIsRtlCharAt) {
                fH = iVar.i(iD, false);
                fH2 = iVar.i(iD + 1, true);
            } else if (zIsRtlCharAt) {
                fH = iVar.h(iD, false);
                fH2 = iVar.h(iD + 1, true);
            } else {
                fI = iVar.i(iD, false);
                fI2 = iVar.i(iD + 1, true);
            }
            float f9 = fH;
            fI = fH2;
            fI2 = f9;
        } else {
            fI = iVar.h(iD, false);
            fI2 = iVar.h(iD + 1, true);
        }
        android.graphics.RectF rectF = new android.graphics.RectF(fI, fG, fI2, fE);
        return qVar.a(new p181w0.b(rectF.left, rectF.top, rectF.right, rectF.bottom));
    }

    public final p181w0.b c(int i3) {
        p011b1.C1658o c1658o = this.f17773b;
        c1658o.k(i3);
        int length = ((p011b1.C1650g) c1658o.f17828a.f2772i).f17809i.length();
        java.util.ArrayList arrayList = c1658o.f17834h;
        p011b1.q qVar = (p011b1.q) arrayList.get(i3 == length ? p078i6.p.A0(arrayList) : p011b1.D.d(i3, arrayList));
        p011b1.C1644a c1644a = qVar.f17837a;
        int iD = qVar.d(i3);
        java.lang.CharSequence charSequence = c1644a.f17795e;
        if (iD < 0 || iD > charSequence.length()) {
            java.lang.StringBuilder sbT = p121o0.p.t(iD, "offset(", ") is out of bounds [0,");
            sbT.append(charSequence.length());
            sbT.append(']');
            p065h1.a.a(sbT.toString());
        }
        p021c1.i iVar = c1644a.f17794d;
        float fH = iVar.h(iD, false);
        int lineForOffset = iVar.f18473f.getLineForOffset(iD);
        return qVar.a(new p181w0.b(fH, iVar.g(lineForOffset), fH, iVar.e(lineForOffset)));
    }

    public final float d(int i3, boolean z6) {
        p011b1.C1658o c1658o = this.f17773b;
        c1658o.k(i3);
        int length = ((p011b1.C1650g) c1658o.f17828a.f2772i).f17809i.length();
        java.util.ArrayList arrayList = c1658o.f17834h;
        p011b1.q qVar = (p011b1.q) arrayList.get(i3 == length ? p078i6.p.A0(arrayList) : p011b1.D.d(i3, arrayList));
        p011b1.C1644a c1644a = qVar.f17837a;
        int iD = qVar.d(i3);
        p021c1.i iVar = c1644a.f17794d;
        return z6 ? iVar.h(iD, false) : iVar.i(iD, false);
    }

    public final float e(int i3) {
        p011b1.C1658o c1658o = this.f17773b;
        c1658o.l(i3);
        java.util.ArrayList arrayList = c1658o.f17834h;
        p011b1.q qVar = (p011b1.q) arrayList.get(p011b1.D.e(i3, arrayList));
        p011b1.C1644a c1644a = qVar.f17837a;
        int i9 = i3 - qVar.f17840d;
        p021c1.i iVar = c1644a.f17794d;
        return iVar.f18473f.getLineLeft(i9) + (i9 == iVar.g + (-1) ? iVar.j : 0.0f);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p011b1.J)) {
            return false;
        }
        p011b1.J j = (p011b1.J) obj;
        return kotlin.jvm.internal.m.a(this.f17772a, j.f17772a) && this.f17773b.equals(j.f17773b) && p113n1.m.a(this.f17774c, j.f17774c) && this.f17775d == j.f17775d && this.f17776e == j.f17776e && kotlin.jvm.internal.m.a(this.f17777f, j.f17777f);
    }

    public final float f(int i3) {
        p011b1.C1658o c1658o = this.f17773b;
        c1658o.l(i3);
        java.util.ArrayList arrayList = c1658o.f17834h;
        p011b1.q qVar = (p011b1.q) arrayList.get(p011b1.D.e(i3, arrayList));
        p011b1.C1644a c1644a = qVar.f17837a;
        int i9 = i3 - qVar.f17840d;
        p021c1.i iVar = c1644a.f17794d;
        return iVar.f18473f.getLineRight(i9) + (i9 == iVar.g + (-1) ? iVar.f18476k : 0.0f);
    }

    public final int g(int i3) {
        p011b1.C1658o c1658o = this.f17773b;
        c1658o.l(i3);
        java.util.ArrayList arrayList = c1658o.f17834h;
        p011b1.q qVar = (p011b1.q) arrayList.get(p011b1.D.e(i3, arrayList));
        p011b1.C1644a c1644a = qVar.f17837a;
        return c1644a.f17794d.f18473f.getLineStart(i3 - qVar.f17840d) + qVar.f17838b;
    }

    public final p104m1.j h(int i3) {
        p011b1.C1658o c1658o = this.f17773b;
        c1658o.k(i3);
        int length = ((p011b1.C1650g) c1658o.f17828a.f2772i).f17809i.length();
        java.util.ArrayList arrayList = c1658o.f17834h;
        p011b1.q qVar = (p011b1.q) arrayList.get(i3 == length ? p078i6.p.A0(arrayList) : p011b1.D.d(i3, arrayList));
        p011b1.C1644a c1644a = qVar.f17837a;
        int iD = qVar.d(i3);
        p021c1.i iVar = c1644a.f17794d;
        return iVar.f18473f.getParagraphDirection(iVar.f18473f.getLineForOffset(iD)) == 1 ? p104m1.j.f25173h : p104m1.j.f25174i;
    }

    public final int hashCode() {
        return this.f17777f.hashCode() + p121o0.p.c(this.f17776e, p121o0.p.c(this.f17775d, p121o0.p.e((this.f17773b.hashCode() + (this.f17772a.hashCode() * 31)) * 31, 31, this.f17774c), 31), 31);
    }

    public final p188x0.C3088h i(int i3, int i9) {
        p011b1.C1658o c1658o = this.f17773b;
        p011b1.C1650g c1650g = (p011b1.C1650g) c1658o.f17828a.f2772i;
        if (i3 < 0 || i3 > i9 || i9 > c1650g.f17809i.length()) {
            java.lang.StringBuilder sbS = p121o0.p.s(i3, i9, "Start(", ") or End(", ") is out of range [0..");
            sbS.append(c1650g.f17809i.length());
            sbS.append("), or start > end!");
            p065h1.a.a(sbS.toString());
        }
        if (i3 == i9) {
            return p188x0.AbstractC3091k.a();
        }
        p188x0.C3088h c3088hA = p188x0.AbstractC3091k.a();
        p011b1.D.g(c1658o.f17834h, p011b1.D.b(i3, i9), new B.T(i3, i9, 1, c3088hA));
        return c3088hA;
    }

    public final long j(int i3) {
        int iT;
        int I9;
        int I10;
        p011b1.C1658o c1658o = this.f17773b;
        c1658o.k(i3);
        int length = ((p011b1.C1650g) c1658o.f17828a.f2772i).f17809i.length();
        java.util.ArrayList arrayList = c1658o.f17834h;
        p011b1.q qVar = (p011b1.q) arrayList.get(i3 == length ? p078i6.p.A0(arrayList) : p011b1.D.d(i3, arrayList));
        p011b1.C1644a c1644a = qVar.f17837a;
        int iD = qVar.d(i3);
        Z2.M mJ = c1644a.f17794d.j();
        if (mJ.F(mJ.T(iD))) {
            mJ.i(iD);
            iT = iD;
            while (iT != -1 && (!mJ.F(iT) || mJ.B(iT))) {
                iT = mJ.T(iT);
            }
        } else {
            mJ.i(iD);
            if (mJ.E(iD)) {
                iT = (!mJ.C(iD) || mJ.A(iD)) ? mJ.T(iD) : iD;
            } else {
                iT = mJ.A(iD) ? mJ.T(iD) : -1;
            }
        }
        if (iT == -1) {
            iT = iD;
        }
        if (mJ.B(mJ.I(iD))) {
            mJ.i(iD);
            I9 = iD;
            while (I9 != -1 && (mJ.F(I9) || !mJ.B(I9))) {
                I9 = mJ.I(I9);
            }
        } else {
            mJ.i(iD);
            if (mJ.A(iD)) {
                if (!mJ.C(iD) || mJ.E(iD)) {
                    I10 = mJ.I(iD);
                    I9 = I10;
                } else {
                    I9 = iD;
                }
            } else if (mJ.E(iD)) {
                I10 = mJ.I(iD);
                I9 = I10;
            } else {
                I9 = -1;
            }
        }
        if (I9 != -1) {
            iD = I9;
        }
        return qVar.b(p011b1.D.b(iT, iD), false);
    }

    public final java.lang.String toString() {
        return "TextLayoutResult(layoutInput=" + this.f17772a + ", multiParagraph=" + this.f17773b + ", size=" + ((java.lang.Object) p113n1.m.b(this.f17774c)) + ", firstBaseline=" + this.f17775d + ", lastBaseline=" + this.f17776e + ", placeholderRects=" + this.f17777f + ')';
    }
}
