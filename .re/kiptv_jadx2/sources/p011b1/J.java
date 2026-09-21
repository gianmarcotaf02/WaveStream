package p011b1;

import B.T;
import Z2.M;
import android.graphics.RectF;
import android.text.Layout;
import java.util.ArrayList;
import kotlin.jvm.internal.m;
import p021c1.i;
import p065h1.a;
import p078i6.o;
import p078i6.p;
import p104m1.j;
import p181w0.b;
import p188x0.AbstractC3091k;
import p188x0.C3088h;

public final class J {

    public final I f17772a;

    public final C1658o f17773b;

    public final long f17774c;

    public final float f17775d;

    public final float f17776e;

    public final ArrayList f17777f;

    public J(I i3, C1658o c1658o, long j) {
        this.f17772a = i3;
        this.f17773b = c1658o;
        this.f17774c = j;
        ArrayList arrayList = c1658o.f17834h;
        float fD = 0.0f;
        this.f17775d = arrayList.isEmpty() ? 0.0f : ((q) arrayList.get(0)).f17837a.f17794d.d(0);
        if (!arrayList.isEmpty()) {
            q qVar = (q) o.q1(arrayList);
            i iVar = qVar.f17837a.f17794d;
            fD = iVar.d(iVar.g - 1) + qVar.f17842f;
        }
        this.f17776e = fD;
        this.f17777f = c1658o.g;
    }

    public final j a(int i3) {
        C1658o c1658o = this.f17773b;
        c1658o.k(i3);
        int length = ((C1650g) c1658o.f17828a.f2772i).f17809i.length();
        ArrayList arrayList = c1658o.f17834h;
        q qVar = (q) arrayList.get(i3 == length ? p.A0(arrayList) : D.d(i3, arrayList));
        return qVar.f17837a.f17794d.f18473f.isRtlCharAt(qVar.d(i3)) ? j.f25174i : j.f25173h;
    }

    public final b b(int i3) {
        float fI;
        float fI2;
        float fH;
        float fH2;
        C1658o c1658o = this.f17773b;
        c1658o.j(i3);
        ArrayList arrayList = c1658o.f17834h;
        q qVar = (q) arrayList.get(D.d(i3, arrayList));
        C1644a c1644a = qVar.f17837a;
        int iD = qVar.d(i3);
        CharSequence charSequence = c1644a.f17795e;
        if (iD < 0 || iD >= charSequence.length()) {
            StringBuilder sbT = p121o0.p.t(iD, "offset(", ") is out of bounds [0,");
            sbT.append(charSequence.length());
            sbT.append(')');
            a.a(sbT.toString());
        }
        i iVar = c1644a.f17794d;
        Layout layout = iVar.f18473f;
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
        RectF rectF = new RectF(fI, fG, fI2, fE);
        return qVar.a(new b(rectF.left, rectF.top, rectF.right, rectF.bottom));
    }

    public final b c(int i3) {
        C1658o c1658o = this.f17773b;
        c1658o.k(i3);
        int length = ((C1650g) c1658o.f17828a.f2772i).f17809i.length();
        ArrayList arrayList = c1658o.f17834h;
        q qVar = (q) arrayList.get(i3 == length ? p.A0(arrayList) : D.d(i3, arrayList));
        C1644a c1644a = qVar.f17837a;
        int iD = qVar.d(i3);
        CharSequence charSequence = c1644a.f17795e;
        if (iD < 0 || iD > charSequence.length()) {
            StringBuilder sbT = p121o0.p.t(iD, "offset(", ") is out of bounds [0,");
            sbT.append(charSequence.length());
            sbT.append(']');
            a.a(sbT.toString());
        }
        i iVar = c1644a.f17794d;
        float fH = iVar.h(iD, false);
        int lineForOffset = iVar.f18473f.getLineForOffset(iD);
        return qVar.a(new b(fH, iVar.g(lineForOffset), fH, iVar.e(lineForOffset)));
    }

    public final float d(int i3, boolean z6) {
        C1658o c1658o = this.f17773b;
        c1658o.k(i3);
        int length = ((C1650g) c1658o.f17828a.f2772i).f17809i.length();
        ArrayList arrayList = c1658o.f17834h;
        q qVar = (q) arrayList.get(i3 == length ? p.A0(arrayList) : D.d(i3, arrayList));
        C1644a c1644a = qVar.f17837a;
        int iD = qVar.d(i3);
        i iVar = c1644a.f17794d;
        return z6 ? iVar.h(iD, false) : iVar.i(iD, false);
    }

    public final float e(int i3) {
        C1658o c1658o = this.f17773b;
        c1658o.l(i3);
        ArrayList arrayList = c1658o.f17834h;
        q qVar = (q) arrayList.get(D.e(i3, arrayList));
        C1644a c1644a = qVar.f17837a;
        int i9 = i3 - qVar.f17840d;
        i iVar = c1644a.f17794d;
        return iVar.f18473f.getLineLeft(i9) + (i9 == iVar.g + (-1) ? iVar.j : 0.0f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof J)) {
            return false;
        }
        J j = (J) obj;
        return m.a(this.f17772a, j.f17772a) && this.f17773b.equals(j.f17773b) && p113n1.m.a(this.f17774c, j.f17774c) && this.f17775d == j.f17775d && this.f17776e == j.f17776e && m.a(this.f17777f, j.f17777f);
    }

    public final float f(int i3) {
        C1658o c1658o = this.f17773b;
        c1658o.l(i3);
        ArrayList arrayList = c1658o.f17834h;
        q qVar = (q) arrayList.get(D.e(i3, arrayList));
        C1644a c1644a = qVar.f17837a;
        int i9 = i3 - qVar.f17840d;
        i iVar = c1644a.f17794d;
        return iVar.f18473f.getLineRight(i9) + (i9 == iVar.g + (-1) ? iVar.f18476k : 0.0f);
    }

    public final int g(int i3) {
        C1658o c1658o = this.f17773b;
        c1658o.l(i3);
        ArrayList arrayList = c1658o.f17834h;
        q qVar = (q) arrayList.get(D.e(i3, arrayList));
        C1644a c1644a = qVar.f17837a;
        return c1644a.f17794d.f18473f.getLineStart(i3 - qVar.f17840d) + qVar.f17838b;
    }

    public final j h(int i3) {
        C1658o c1658o = this.f17773b;
        c1658o.k(i3);
        int length = ((C1650g) c1658o.f17828a.f2772i).f17809i.length();
        ArrayList arrayList = c1658o.f17834h;
        q qVar = (q) arrayList.get(i3 == length ? p.A0(arrayList) : D.d(i3, arrayList));
        C1644a c1644a = qVar.f17837a;
        int iD = qVar.d(i3);
        i iVar = c1644a.f17794d;
        return iVar.f18473f.getParagraphDirection(iVar.f18473f.getLineForOffset(iD)) == 1 ? j.f25173h : j.f25174i;
    }

    public final int hashCode() {
        return this.f17777f.hashCode() + p121o0.p.c(this.f17776e, p121o0.p.c(this.f17775d, p121o0.p.e((this.f17773b.hashCode() + (this.f17772a.hashCode() * 31)) * 31, 31, this.f17774c), 31), 31);
    }

    public final C3088h i(int i3, int i9) {
        C1658o c1658o = this.f17773b;
        C1650g c1650g = (C1650g) c1658o.f17828a.f2772i;
        if (i3 < 0 || i3 > i9 || i9 > c1650g.f17809i.length()) {
            StringBuilder sbS = p121o0.p.s(i3, i9, "Start(", ") or End(", ") is out of range [0..");
            sbS.append(c1650g.f17809i.length());
            sbS.append("), or start > end!");
            a.a(sbS.toString());
        }
        if (i3 == i9) {
            return AbstractC3091k.a();
        }
        C3088h c3088hA = AbstractC3091k.a();
        D.g(c1658o.f17834h, D.b(i3, i9), new T(i3, i9, 1, c3088hA));
        return c3088hA;
    }

    public final long j(int i3) {
        int iT;
        int I9;
        int I10;
        C1658o c1658o = this.f17773b;
        c1658o.k(i3);
        int length = ((C1650g) c1658o.f17828a.f2772i).f17809i.length();
        ArrayList arrayList = c1658o.f17834h;
        q qVar = (q) arrayList.get(i3 == length ? p.A0(arrayList) : D.d(i3, arrayList));
        C1644a c1644a = qVar.f17837a;
        int iD = qVar.d(i3);
        M mJ = c1644a.f17794d.j();
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
        return qVar.b(D.b(iT, iD), false);
    }

    public final String toString() {
        return "TextLayoutResult(layoutInput=" + this.f17772a + ", multiParagraph=" + this.f17773b + ", size=" + ((Object) p113n1.m.b(this.f17774c)) + ", firstBaseline=" + this.f17775d + ", lastBaseline=" + this.f17776e + ", placeholderRects=" + this.f17777f + ')';
    }
}
