package p011b1;

import D1.C0223h;
import E2.d;
import android.graphics.Matrix;
import android.graphics.Shader;
import android.text.Layout;
import android.text.TextUtils;
import j1.c;
import j1.j;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.x;
import kotlin.jvm.internal.y;
import p021c1.i;
import p078i6.o;
import p078i6.p;
import p078i6.u;
import p104m1.l;
import p113n1.a;
import p113n1.b;
import p188x0.AbstractC3095o;
import p188x0.C3096p;
import p188x0.InterfaceC3097q;
import p188x0.M;
import p188x0.N;
import p188x0.S;

public final class C1658o {

    public final d f17828a;

    public final int f17829b;

    public final boolean f17830c;

    public final float f17831d;

    public final float f17832e;

    public final int f17833f;
    public final ArrayList g;

    public final ArrayList f17834h;

    public C1658o(d dVar, long j, int i3, int i9) {
        boolean z6;
        int i10;
        int iG;
        int i11;
        this.f17828a = dVar;
        this.f17829b = i3;
        if (a.j(j) != 0 || a.i(j) != 0) {
            p065h1.a.a("Setting Constraints.minWidth and Constraints.minHeight is not supported, these should be the default zero values instead.");
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = (ArrayList) dVar.f2771h;
        int size = arrayList2.size();
        float f9 = 0.0f;
        int i12 = 0;
        int i13 = 0;
        while (true) {
            if (i12 >= size) {
                z6 = false;
                break;
            }
            r rVar = (r) arrayList2.get(i12);
            c cVar = rVar.f17843a;
            int iH = a.h(j);
            if (a.c(j)) {
                i10 = i12;
                iG = a.g(j) - ((int) Math.ceil(f9));
                if (iG < 0) {
                    iG = 0;
                }
            } else {
                i10 = i12;
                iG = a.g(j);
            }
            C1644a c1644a = new C1644a(cVar, this.f17829b - i13, i9, b.b(iH, iG, 5));
            float fB = c1644a.b() + f9;
            i iVar = c1644a.f17794d;
            int i14 = i13 + iVar.g;
            arrayList.add(new q(c1644a, rVar.f17844b, rVar.f17845c, i13, i14, f9, fB));
            if (!iVar.f18471d) {
                if (i14 == this.f17829b) {
                    i11 = i10;
                    if (i11 != p.A0((ArrayList) this.f17828a.f2771h)) {
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
        this.f17831d = a.h(j);
        ArrayList arrayList3 = new ArrayList(arrayList.size());
        int size2 = arrayList.size();
        for (int i15 = 0; i15 < size2; i15++) {
            q qVar = (q) arrayList.get(i15);
            ?? r9 = qVar.f17837a.f17796f;
            ArrayList arrayList4 = new ArrayList(r9.size());
            int size3 = r9.size();
            for (int i16 = 0; i16 < size3; i16++) {
                p181w0.b bVar = (p181w0.b) r9.get(i16);
                arrayList4.add(bVar != null ? qVar.a(bVar) : null);
            }
            u.M0(arrayList3, arrayList4);
        }
        if (arrayList3.size() < ((List) this.f17828a.j).size()) {
            int size4 = ((List) this.f17828a.j).size() - arrayList3.size();
            ArrayList arrayList5 = new ArrayList(size4);
            for (int i17 = 0; i17 < size4; i17++) {
                arrayList5.add(null);
            }
            arrayList3 = o.A1(arrayList3, arrayList5);
        }
        this.g = arrayList3;
    }

    public static void i(C1658o c1658o, InterfaceC3097q interfaceC3097q, AbstractC3095o abstractC3095o, float f9, N n3, l lVar, p203z0.c cVar) {
        interfaceC3097q.e();
        ArrayList arrayList = c1658o.f17834h;
        if (arrayList.size() <= 1 || (abstractC3095o instanceof S)) {
            j.b(c1658o, interfaceC3097q, abstractC3095o, f9, n3, lVar, cVar);
        } else {
            if (!(abstractC3095o instanceof M)) {
                throw new I3.b();
            }
            int size = arrayList.size();
            float fMax = 0.0f;
            float fB = 0.0f;
            for (int i3 = 0; i3 < size; i3++) {
                q qVar = (q) arrayList.get(i3);
                fB += qVar.f17837a.b();
                fMax = Math.max(fMax, qVar.f17837a.d());
            }
            Shader shaderB = ((M) abstractC3095o).b((((long) Float.floatToRawIntBits(fMax)) << 32) | (((long) Float.floatToRawIntBits(fB)) & 4294967295L));
            Matrix matrix = new Matrix();
            shaderB.getLocalMatrix(matrix);
            int size2 = arrayList.size();
            for (int i9 = 0; i9 < size2; i9++) {
                q qVar2 = (q) arrayList.get(i9);
                qVar2.f17837a.g(interfaceC3097q, new C3096p(shaderB), f9, n3, lVar, cVar);
                C1644a c1644a = qVar2.f17837a;
                interfaceC3097q.l(0.0f, c1644a.b());
                matrix.setTranslate(0.0f, -c1644a.b());
                shaderB.setLocalMatrix(matrix);
            }
        }
        interfaceC3097q.p();
    }

    public final void a(long j, float[] fArr) {
        j(L.f(j));
        k(L.e(j));
        y yVar = new y();
        yVar.f24555h = 0;
        D.g(this.f17834h, j, new C1657n(j, fArr, yVar, new x()));
    }

    public final float b(int i3) {
        l(i3);
        ArrayList arrayList = this.f17834h;
        q qVar = (q) arrayList.get(D.e(i3, arrayList));
        C1644a c1644a = qVar.f17837a;
        return c1644a.f17794d.e(i3 - qVar.f17840d) + qVar.f17842f;
    }

    public final int c(int i3, boolean z6) {
        int iF;
        l(i3);
        ArrayList arrayList = this.f17834h;
        q qVar = (q) arrayList.get(D.e(i3, arrayList));
        C1644a c1644a = qVar.f17837a;
        int i9 = i3 - qVar.f17840d;
        i iVar = c1644a.f17794d;
        if (z6) {
            Layout layout = iVar.f18473f;
            ThreadLocal threadLocal = p021c1.j.f18483a;
            if (layout.getEllipsisCount(i9) <= 0 || iVar.f18469b != TextUtils.TruncateAt.END) {
                d dVarC = iVar.c();
                Layout layout2 = (Layout) dVarC.j;
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
        int length = ((C1650g) this.f17828a.f2772i).f17809i.length();
        ArrayList arrayList = this.f17834h;
        if (i3 >= length) {
            iD = p.A0(arrayList);
        } else {
            iD = i3 < 0 ? 0 : D.d(i3, arrayList);
        }
        q qVar = (q) arrayList.get(iD);
        return qVar.f17837a.f17794d.f18473f.getLineForOffset(qVar.d(i3)) + qVar.f17840d;
    }

    public final int e(float f9) {
        ArrayList arrayList = this.f17834h;
        q qVar = (q) arrayList.get(D.f(arrayList, f9));
        int i3 = qVar.f17839c - qVar.f17838b;
        int i9 = qVar.f17840d;
        if (i3 == 0) {
            return i9;
        }
        float f10 = f9 - qVar.f17842f;
        i iVar = qVar.f17837a.f17794d;
        return iVar.f18473f.getLineForVertical(((int) f10) - iVar.f18474h) + i9;
    }

    public final float f(int i3) {
        l(i3);
        ArrayList arrayList = this.f17834h;
        q qVar = (q) arrayList.get(D.e(i3, arrayList));
        C1644a c1644a = qVar.f17837a;
        return c1644a.f17794d.g(i3 - qVar.f17840d) + qVar.f17842f;
    }

    public final int g(long j) {
        ArrayList arrayList = this.f17834h;
        int i3 = (int) (j & 4294967295L);
        q qVar = (q) arrayList.get(D.f(arrayList, Float.intBitsToFloat(i3)));
        int i9 = qVar.f17839c;
        int i10 = qVar.f17838b;
        if (i9 - i10 == 0) {
            return i10;
        }
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(Float.intBitsToFloat(i3) - qVar.f17842f)) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32);
        C1644a c1644a = qVar.f17837a;
        int iIntBitsToFloat = (int) Float.intBitsToFloat((int) (4294967295L & jFloatToRawIntBits));
        i iVar = c1644a.f17794d;
        int i11 = iIntBitsToFloat - iVar.f18474h;
        Layout layout = iVar.f18473f;
        int lineForVertical = layout.getLineForVertical(i11);
        return layout.getOffsetForHorizontal(lineForVertical, (iVar.b(lineForVertical) * (-1)) + Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32))) + i10;
    }

    public final long h(p181w0.b bVar, int i3, C0223h c0223h) {
        long jB;
        long j;
        ArrayList arrayList = this.f17834h;
        int iF = D.f(arrayList, bVar.f29747b);
        float f9 = ((q) arrayList.get(iF)).g;
        float f10 = bVar.f29749d;
        if (f9 >= f10 || iF == p.A0(arrayList)) {
            q qVar = (q) arrayList.get(iF);
            return qVar.b(qVar.f17837a.c(qVar.c(bVar), i3, c0223h), true);
        }
        int iF2 = D.f(arrayList, f10);
        long jB2 = L.f17782b;
        while (true) {
            jB = L.f17782b;
            if (!L.b(jB2, jB) || iF > iF2) {
                break;
            }
            q qVar2 = (q) arrayList.get(iF);
            jB2 = qVar2.b(qVar2.f17837a.c(qVar2.c(bVar), i3, c0223h), true);
            iF++;
        }
        if (L.b(jB2, jB)) {
            return jB;
        }
        while (true) {
            j = L.f17782b;
            if (!L.b(jB, j) || iF > iF2) {
                break;
            }
            q qVar3 = (q) arrayList.get(iF2);
            jB = qVar3.b(qVar3.f17837a.c(qVar3.c(bVar), i3, c0223h), true);
            iF2--;
        }
        return L.b(jB, j) ? jB2 : D.b((int) (jB2 >> 32), (int) (4294967295L & jB));
    }

    public final void j(int i3) {
        boolean z6 = false;
        d dVar = this.f17828a;
        if (i3 >= 0 && i3 < ((C1650g) dVar.f2772i).f17809i.length()) {
            z6 = true;
        }
        if (z6) {
            return;
        }
        StringBuilder sbT = p121o0.p.t(i3, "offset(", ") is out of bounds [0, ");
        sbT.append(((C1650g) dVar.f2772i).f17809i.length());
        sbT.append(')');
        p065h1.a.a(sbT.toString());
    }

    public final void k(int i3) {
        boolean z6 = false;
        d dVar = this.f17828a;
        if (i3 >= 0 && i3 <= ((C1650g) dVar.f2772i).f17809i.length()) {
            z6 = true;
        }
        if (z6) {
            return;
        }
        StringBuilder sbT = p121o0.p.t(i3, "offset(", ") is out of bounds [0, ");
        sbT.append(((C1650g) dVar.f2772i).f17809i.length());
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
