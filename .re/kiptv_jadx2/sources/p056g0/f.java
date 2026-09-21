package p056g0;

import D1.X;
import E2.j;
import com.google.android.gms.internal.play_billing.AbstractC1853k0;
import com.google.common.util.concurrent.D;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;
import kotlin.jvm.internal.m;
import p020c0.AbstractC1693m0;
import p078i6.AbstractC2257h;
import p201y6.b;

public final class f extends AbstractC2257h implements Collection, b {

    public c f21756h;

    public Object[] f21757i;
    public Object[] j;

    public int f21758k;

    public p081j0.b f21759l = new p081j0.b();

    public Object[] f21760m;

    public Object[] f21761n;

    public int f21762o;

    public f(c cVar, Object[] objArr, Object[] objArr2, int i3) {
        this.f21756h = cVar;
        this.f21757i = objArr;
        this.j = objArr2;
        this.f21758k = i3;
        this.f21760m = objArr;
        this.f21761n = objArr2;
        this.f21762o = cVar.d();
    }

    public static void o(Object[] objArr, int i3, Iterator it) {
        while (i3 < 32 && it.hasNext()) {
            objArr[i3] = it.next();
            i3++;
        }
    }

    public final Object[] A(Object[] objArr, int i3, int i9, j jVar) {
        Object[] objArrA;
        int iY = AbstractC1853k0.y(i9 - 1, i3);
        if (i3 == 5) {
            jVar.f2785a = objArr[iY];
            objArrA = null;
        } else {
            Object obj = objArr[iY];
            m.c(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            objArrA = A((Object[]) obj, i3 - 5, i9, jVar);
        }
        if (objArrA == null && iY == 0) {
            return null;
        }
        Object[] objArrV = v(objArr);
        objArrV[iY] = objArrA;
        return objArrV;
    }

    public final void B(Object[] objArr, int i3, int i9) {
        if (i9 == 0) {
            this.f21760m = null;
            if (objArr == null) {
                objArr = new Object[0];
            }
            this.f21761n = objArr;
            this.f21762o = i3;
            this.f21758k = i9;
            return;
        }
        j jVar = new j(null);
        m.b(objArr);
        Object[] objArrA = A(objArr, i9, i3, jVar);
        m.b(objArrA);
        Object obj = jVar.f2785a;
        m.c(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        this.f21761n = (Object[]) obj;
        this.f21762o = i3;
        if (objArrA[1] == null) {
            this.f21760m = (Object[]) objArrA[0];
            this.f21758k = i9 - 5;
        } else {
            this.f21760m = objArrA;
            this.f21758k = i9;
        }
    }

    public final Object[] C(Object[] objArr, int i3, int i9, Iterator it) {
        if (!it.hasNext()) {
            AbstractC1693m0.a("invalid buffersIterator");
        }
        if (!(i9 >= 0)) {
            AbstractC1693m0.a("negative shift");
        }
        if (i9 == 0) {
            return (Object[]) it.next();
        }
        Object[] objArrV = v(objArr);
        int iY = AbstractC1853k0.y(i3, i9);
        int i10 = i9 - 5;
        objArrV[iY] = C((Object[]) objArrV[iY], i3, i10, it);
        while (true) {
            iY++;
            if (iY >= 32 || !it.hasNext()) {
                break;
            }
            objArrV[iY] = C((Object[]) objArrV[iY], 0, i10, it);
        }
        return objArrV;
    }

    public final Object[] D(Object[] objArr, int i3, Object[][] objArr2) {
        X xH = m.h(objArr2);
        int i9 = i3 >> 5;
        int i10 = this.f21758k;
        Object[] objArrC = i9 < (1 << i10) ? C(objArr, i3, i10, xH) : v(objArr);
        while (xH.hasNext()) {
            this.f21758k += 5;
            objArrC = y(objArrC);
            int i11 = this.f21758k;
            C(objArrC, 1 << i11, i11, xH);
        }
        return objArrC;
    }

    public final void E(Object[] objArr, Object[] objArr2, Object[] objArr3) {
        int i3 = this.f21762o;
        int i9 = i3 >> 5;
        int i10 = this.f21758k;
        if (i9 > (1 << i10)) {
            this.f21760m = F(this.f21758k + 5, y(objArr), objArr2);
            this.f21761n = objArr3;
            this.f21758k += 5;
            this.f21762o++;
            return;
        }
        if (objArr == null) {
            this.f21760m = objArr2;
            this.f21761n = objArr3;
            this.f21762o = i3 + 1;
        } else {
            this.f21760m = F(i10, objArr, objArr2);
            this.f21761n = objArr3;
            this.f21762o++;
        }
    }

    public final Object[] F(int i3, Object[] objArr, Object[] objArr2) {
        int iY = AbstractC1853k0.y(d() - 1, i3);
        Object[] objArrV = v(objArr);
        if (i3 == 5) {
            objArrV[iY] = objArr2;
            return objArrV;
        }
        objArrV[iY] = F(i3 - 5, (Object[]) objArrV[iY], objArr2);
        return objArrV;
    }

    public final int G(p194x6.j jVar, Object[] objArr, int i3, int i9, j jVar2, ArrayList arrayList, ArrayList arrayList2) {
        if (t(objArr)) {
            arrayList.add(objArr);
        }
        Object obj = jVar2.f2785a;
        m.c(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        Object[] objArr2 = (Object[]) obj;
        Object[] objArrX = objArr2;
        for (int i10 = 0; i10 < i3; i10++) {
            Object obj2 = objArr[i10];
            if (!((Boolean) jVar.invoke(obj2)).booleanValue()) {
                if (i9 == 32) {
                    objArrX = !arrayList.isEmpty() ? (Object[]) arrayList.remove(arrayList.size() - 1) : x();
                    i9 = 0;
                }
                objArrX[i9] = obj2;
                i9++;
            }
        }
        jVar2.f2785a = objArrX;
        if (objArr2 != objArrX) {
            arrayList2.add(objArr2);
        }
        return i9;
    }

    public final int H(p194x6.j jVar, Object[] objArr, int i3, j jVar2) {
        Object[] objArrV = objArr;
        int i9 = i3;
        boolean z6 = false;
        for (int i10 = 0; i10 < i3; i10++) {
            Object obj = objArr[i10];
            if (((Boolean) jVar.invoke(obj)).booleanValue()) {
                if (!z6) {
                    objArrV = v(objArr);
                    z6 = true;
                    i9 = i10;
                }
            } else if (z6) {
                objArrV[i9] = obj;
                i9++;
            }
        }
        jVar2.f2785a = objArrV;
        return i9;
    }

    public final int I(p194x6.j jVar, int i3, j jVar2) {
        int iH = H(jVar, this.f21761n, i3, jVar2);
        if (iH == i3) {
            return i3;
        }
        Object obj = jVar2.f2785a;
        m.c(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        Object[] objArr = (Object[]) obj;
        Arrays.fill(objArr, iH, i3, (Object) null);
        this.f21761n = objArr;
        this.f21762o -= i3 - iH;
        return iH;
    }

    public final boolean J(p194x6.j jVar) {
        Object[] objArrC;
        int i3;
        p194x6.j jVar2 = jVar;
        int iP = P();
        Object[] objArrZ = null;
        j jVar3 = new j(null);
        boolean z6 = false;
        if (this.f21760m != null) {
            a aVarU = u(0);
            int iH = 32;
            while (iH == 32 && aVarU.hasNext()) {
                iH = H(jVar2, (Object[]) aVarU.next(), 32, jVar3);
            }
            if (iH == 32) {
                int I9 = I(jVar2, iP, jVar3);
                if (I9 == 0) {
                    B(this.f21760m, this.f21762o, this.f21758k);
                }
                if (I9 != iP) {
                }
            } else {
                int i9 = (aVarU.f21748h - 1) << 5;
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                int iG = iH;
                while (aVarU.hasNext()) {
                    iG = G(jVar2, (Object[]) aVarU.next(), 32, iG, jVar3, arrayList2, arrayList);
                    jVar2 = jVar;
                }
                int iG2 = G(jVar, this.f21761n, iP, iG, jVar3, arrayList2, arrayList);
                Object obj = jVar3.f2785a;
                m.c(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                Object[] objArr = (Object[]) obj;
                Arrays.fill(objArr, iG2, 32, (Object) null);
                if (arrayList.isEmpty()) {
                    objArrC = this.f21760m;
                    m.b(objArrC);
                } else {
                    objArrC = C(this.f21760m, i9, this.f21758k, arrayList.iterator());
                }
                int size = i9 + (arrayList.size() << 5);
                if ((size & 31) != 0) {
                    AbstractC1693m0.a("invalid size");
                }
                if (size == 0) {
                    this.f21758k = 0;
                } else {
                    int i10 = size - 1;
                    while (true) {
                        i3 = this.f21758k;
                        if ((i10 >> i3) != 0) {
                            break;
                        }
                        this.f21758k = i3 - 5;
                        Object[] objArr2 = objArrC[0];
                        m.c(objArr2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                        objArrC = objArr2;
                    }
                    objArrZ = z(objArrC, i10, i3);
                }
                this.f21760m = objArrZ;
                this.f21761n = objArr;
                this.f21762o = size + iG2;
            }
            z6 = true;
        } else if (I(jVar2, iP, jVar3) != iP) {
            z6 = true;
        }
        if (z6) {
            ((AbstractList) this).modCount++;
        }
        return z6;
    }

    public final Object[] K(Object[] objArr, int i3, int i9, j jVar) {
        int iY = AbstractC1853k0.y(i9, i3);
        if (i3 == 0) {
            Object obj = objArr[iY];
            Object[] objArrV = v(objArr);
            p078i6.m.Z(iY, iY + 1, 32, objArr, objArrV);
            objArrV[31] = jVar.f2785a;
            jVar.f2785a = obj;
            return objArrV;
        }
        int iY2 = objArr[31] == null ? AbstractC1853k0.y(M() - 1, i3) : 31;
        Object[] objArrV2 = v(objArr);
        int i10 = i3 - 5;
        int i11 = iY + 1;
        if (i11 <= iY2) {
            while (true) {
                Object obj2 = objArrV2[iY2];
                m.c(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                objArrV2[iY2] = K((Object[]) obj2, i10, 0, jVar);
                if (iY2 == i11) {
                    break;
                }
                iY2--;
            }
        }
        Object obj3 = objArrV2[iY];
        m.c(obj3, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        objArrV2[iY] = K((Object[]) obj3, i10, i9, jVar);
        return objArrV2;
    }

    public final Object L(Object[] objArr, int i3, int i9, int i10) {
        int i11 = this.f21762o - i3;
        if (i11 == 1) {
            Object obj = this.f21761n[0];
            B(objArr, i3, i9);
            return obj;
        }
        Object[] objArr2 = this.f21761n;
        Object obj2 = objArr2[i10];
        Object[] objArrV = v(objArr2);
        p078i6.m.Z(i10, i10 + 1, i11, objArr2, objArrV);
        objArrV[i11 - 1] = null;
        this.f21760m = objArr;
        this.f21761n = objArrV;
        this.f21762o = (i3 + i11) - 1;
        this.f21758k = i9;
        return obj2;
    }

    public final int M() {
        int i3 = this.f21762o;
        if (i3 <= 32) {
            return 0;
        }
        return (i3 - 1) & (-32);
    }

    public final Object[] N(Object[] objArr, int i3, int i9, Object obj, j jVar) {
        int iY = AbstractC1853k0.y(i9, i3);
        Object[] objArrV = v(objArr);
        if (i3 != 0) {
            Object obj2 = objArrV[iY];
            m.c(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            objArrV[iY] = N((Object[]) obj2, i3 - 5, i9, obj, jVar);
            return objArrV;
        }
        if (objArrV != objArr) {
            ((AbstractList) this).modCount++;
        }
        jVar.f2785a = objArrV[iY];
        objArrV[iY] = obj;
        return objArrV;
    }

    public final void O(Collection collection, int i3, Object[] objArr, int i9, Object[][] objArr2, int i10, Object[] objArr3) {
        Object[] objArrX;
        if (i10 < 1) {
            AbstractC1693m0.a("requires at least one nullBuffer");
        }
        Object[] objArrV = v(objArr);
        objArr2[0] = objArrV;
        int i11 = i3 & 31;
        int size = ((collection.size() + i3) - 1) & 31;
        int i12 = (i9 - i11) + size;
        if (i12 < 32) {
            p078i6.m.Z(size + 1, i11, i9, objArrV, objArr3);
        } else {
            int i13 = i12 - 31;
            if (i10 == 1) {
                objArrX = objArrV;
            } else {
                objArrX = x();
                i10--;
                objArr2[i10] = objArrX;
            }
            int i14 = i9 - i13;
            p078i6.m.Z(0, i14, i9, objArrV, objArr3);
            p078i6.m.Z(size + 1, i11, i14, objArrV, objArrX);
            objArr3 = objArrX;
        }
        Iterator it = collection.iterator();
        o(objArrV, i11, it);
        for (int i15 = 1; i15 < i10; i15++) {
            Object[] objArrX2 = x();
            o(objArrX2, 0, it);
            objArr2[i15] = objArrX2;
        }
        o(objArr3, 0, it);
    }

    public final int P() {
        int i3 = this.f21762o;
        return i3 <= 32 ? i3 : i3 - ((i3 - 1) & (-32));
    }

    @Override
    public final void add(int i3, Object obj) {
        D.f(i3, d());
        if (i3 == d()) {
            add(obj);
            return;
        }
        ((AbstractList) this).modCount++;
        int iM = M();
        if (i3 >= iM) {
            s(i3 - iM, obj, this.f21760m);
            return;
        }
        j jVar = new j(null);
        Object[] objArr = this.f21760m;
        m.b(objArr);
        s(0, jVar.f2785a, r(objArr, this.f21758k, i3, obj, jVar));
    }

    @Override
    public final boolean addAll(int i3, Collection collection) {
        Collection collection2;
        f fVar;
        Object[] objArrX;
        D.f(i3, this.f21762o);
        if (i3 == this.f21762o) {
            return addAll(collection);
        }
        if (collection.isEmpty()) {
            return false;
        }
        ((AbstractList) this).modCount++;
        int i9 = (i3 >> 5) << 5;
        int size = ((collection.size() + (this.f21762o - i9)) - 1) / 32;
        if (size == 0) {
            int i10 = i3 & 31;
            int size2 = ((collection.size() + i3) - 1) & 31;
            Object[] objArr = this.f21761n;
            Object[] objArrV = v(objArr);
            p078i6.m.Z(size2 + 1, i10, P(), objArr, objArrV);
            o(objArrV, i10, collection.iterator());
            this.f21761n = objArrV;
            this.f21762o = collection.size() + this.f21762o;
            return true;
        }
        Object[][] objArr2 = new Object[size][];
        int iP = P();
        int size3 = collection.size() + this.f21762o;
        if (size3 > 32) {
            size3 -= (size3 - 1) & (-32);
        }
        if (i3 >= M()) {
            objArrX = x();
            collection2 = collection;
            O(collection2, i3, this.f21761n, iP, objArr2, size, objArrX);
            fVar = this;
            objArr2 = objArr2;
        } else {
            collection2 = collection;
            fVar = this;
            if (size3 > iP) {
                int i11 = size3 - iP;
                Object[] objArrW = w(fVar.f21761n, i11);
                fVar.q(collection2, i3, i11, objArr2, size, objArrW);
                objArr2 = objArr2;
                objArrX = objArrW;
            } else {
                Object[] objArr3 = fVar.f21761n;
                objArrX = x();
                int i12 = iP - size3;
                p078i6.m.Z(0, i12, iP, objArr3, objArrX);
                int i13 = 32 - i12;
                Object[] objArrW2 = w(fVar.f21761n, i13);
                int i14 = size - 1;
                objArr2[i14] = objArrW2;
                fVar.q(collection2, i3, i13, objArr2, i14, objArrW2);
                collection2 = collection2;
            }
        }
        fVar.f21760m = D(fVar.f21760m, i9, objArr2);
        fVar.f21761n = objArrX;
        fVar.f21762o = collection2.size() + fVar.f21762o;
        return true;
    }

    @Override
    public final int d() {
        return this.f21762o;
    }

    @Override
    public final Object e(int i3) {
        D.e(i3, d());
        ((AbstractList) this).modCount++;
        int iM = M();
        if (i3 >= iM) {
            return L(this.f21760m, iM, this.f21758k, i3 - iM);
        }
        j jVar = new j(this.f21761n[0]);
        Object[] objArr = this.f21760m;
        m.b(objArr);
        L(K(objArr, this.f21758k, i3, jVar), iM, this.f21758k, 0);
        return jVar.f2785a;
    }

    @Override
    public final Object get(int i3) {
        Object[] objArr;
        D.e(i3, d());
        if (M() <= i3) {
            objArr = this.f21761n;
        } else {
            objArr = this.f21760m;
            m.b(objArr);
            for (int i9 = this.f21758k; i9 > 0; i9 -= 5) {
                Object obj = objArr[AbstractC1853k0.y(i3, i9)];
                m.c(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                objArr = (Object[]) obj;
            }
        }
        return objArr[i3 & 31];
    }

    @Override
    public final Iterator iterator() {
        return listIterator(0);
    }

    @Override
    public final ListIterator listIterator(int i3) {
        D.f(i3, this.f21762o);
        return new h(this, i3);
    }

    public final c n() {
        c eVar;
        Object[] objArr = this.f21760m;
        if (objArr == this.f21757i && this.f21761n == this.j) {
            eVar = this.f21756h;
        } else {
            this.f21759l = new p081j0.b();
            this.f21757i = objArr;
            Object[] objArr2 = this.f21761n;
            this.j = objArr2;
            if (objArr != null) {
                eVar = new e(objArr, objArr2, this.f21762o, this.f21758k);
            } else if (objArr2.length == 0) {
                eVar = i.f21767i;
            } else {
                Object[] objArrCopyOf = Arrays.copyOf(objArr2, this.f21762o);
                m.d(objArrCopyOf, "copyOf(...)");
                eVar = new i(objArrCopyOf);
            }
        }
        this.f21756h = eVar;
        return eVar;
    }

    public final int p() {
        return ((AbstractList) this).modCount;
    }

    public final void q(Collection collection, int i3, int i9, Object[][] objArr, int i10, Object[] objArr2) {
        if (this.f21760m == null) {
            throw new IllegalStateException("root is null");
        }
        int i11 = i3 >> 5;
        a aVarU = u(M() >> 5);
        int i12 = i10;
        Object[] objArrW = objArr2;
        while (aVarU.f21748h - 1 != i11) {
            Object[] objArr3 = (Object[]) aVarU.previous();
            p078i6.m.Z(0, 32 - i9, 32, objArr3, objArrW);
            objArrW = w(objArr3, i9);
            i12--;
            objArr[i12] = objArrW;
        }
        Object[] objArr4 = (Object[]) aVarU.previous();
        int iM = i10 - (((M() >> 5) - 1) - i11);
        if (iM < i10) {
            objArr2 = objArr[iM];
            m.b(objArr2);
        }
        O(collection, i3, objArr4, 32, objArr, iM, objArr2);
    }

    public final Object[] r(Object[] objArr, int i3, int i9, Object obj, j jVar) {
        Object obj2;
        int iY = AbstractC1853k0.y(i9, i3);
        if (i3 == 0) {
            jVar.f2785a = objArr[31];
            Object[] objArrV = v(objArr);
            p078i6.m.Z(iY + 1, iY, 31, objArr, objArrV);
            objArrV[iY] = obj;
            return objArrV;
        }
        Object[] objArrV2 = v(objArr);
        int i10 = i3 - 5;
        Object obj3 = objArrV2[iY];
        m.c(obj3, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        objArrV2[iY] = r((Object[]) obj3, i10, i9, obj, jVar);
        while (true) {
            iY++;
            if (iY >= 32 || (obj2 = objArrV2[iY]) == null) {
                break;
            }
            objArrV2[iY] = r((Object[]) obj2, i10, 0, jVar.f2785a, jVar);
        }
        return objArrV2;
    }

    @Override
    public final boolean removeAll(Collection collection) {
        return J(new b(1, collection));
    }

    public final void s(int i3, Object obj, Object[] objArr) {
        int iP = P();
        Object[] objArrV = v(this.f21761n);
        if (iP >= 32) {
            Object[] objArr2 = this.f21761n;
            Object obj2 = objArr2[31];
            p078i6.m.Z(i3 + 1, i3, 31, objArr2, objArrV);
            objArrV[i3] = obj;
            E(objArr, objArrV, y(obj2));
            return;
        }
        p078i6.m.Z(i3 + 1, i3, iP, this.f21761n, objArrV);
        objArrV[i3] = obj;
        this.f21760m = objArr;
        this.f21761n = objArrV;
        this.f21762o++;
    }

    @Override
    public final Object set(int i3, Object obj) {
        D.e(i3, d());
        if (M() > i3) {
            j jVar = new j(null);
            Object[] objArr = this.f21760m;
            m.b(objArr);
            this.f21760m = N(objArr, this.f21758k, i3, obj, jVar);
            return jVar.f2785a;
        }
        Object[] objArrV = v(this.f21761n);
        if (objArrV != this.f21761n) {
            ((AbstractList) this).modCount++;
        }
        int i9 = i3 & 31;
        Object obj2 = objArrV[i9];
        objArrV[i9] = obj;
        this.f21761n = objArrV;
        return obj2;
    }

    public final boolean t(Object[] objArr) {
        return objArr.length == 33 && objArr[32] == this.f21759l;
    }

    public final a u(int i3) {
        Object[] objArr = this.f21760m;
        if (objArr == null) {
            throw new IllegalStateException("Invalid root");
        }
        int iM = M() >> 5;
        D.f(i3, iM);
        int i9 = this.f21758k;
        return i9 == 0 ? new d(i3, objArr) : new j(objArr, i3, iM, i9 / 5);
    }

    public final Object[] v(Object[] objArr) {
        if (objArr == null) {
            return x();
        }
        if (t(objArr)) {
            return objArr;
        }
        Object[] objArrX = x();
        int length = objArr.length;
        if (length > 32) {
            length = 32;
        }
        p078i6.m.e0(0, length, 6, objArr, objArrX);
        return objArrX;
    }

    public final Object[] w(Object[] objArr, int i3) {
        if (t(objArr)) {
            p078i6.m.Z(i3, 0, 32 - i3, objArr, objArr);
            return objArr;
        }
        Object[] objArrX = x();
        p078i6.m.Z(i3, 0, 32 - i3, objArr, objArrX);
        return objArrX;
    }

    public final Object[] x() {
        Object[] objArr = new Object[33];
        objArr[32] = this.f21759l;
        return objArr;
    }

    public final Object[] y(Object obj) {
        Object[] objArr = new Object[33];
        objArr[0] = obj;
        objArr[32] = this.f21759l;
        return objArr;
    }

    public final Object[] z(Object[] objArr, int i3, int i9) {
        if (i9 < 0) {
            AbstractC1693m0.a("shift should be positive");
        }
        if (i9 == 0) {
            return objArr;
        }
        int iY = AbstractC1853k0.y(i3, i9);
        Object obj = objArr[iY];
        m.c(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        Object objZ = z((Object[]) obj, i3, i9 - 5);
        if (iY < 31) {
            int i10 = iY + 1;
            if (objArr[i10] != null) {
                if (t(objArr)) {
                    Arrays.fill(objArr, i10, 32, (Object) null);
                }
                Object[] objArrX = x();
                p078i6.m.Z(0, 0, i10, objArr, objArrX);
                objArr = objArrX;
            }
        }
        if (objZ == objArr[iY]) {
            return objArr;
        }
        Object[] objArrV = v(objArr);
        objArrV[iY] = objZ;
        return objArrV;
    }

    @Override
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override
    public final boolean add(Object obj) {
        ((AbstractList) this).modCount++;
        int iP = P();
        if (iP < 32) {
            Object[] objArrV = v(this.f21761n);
            objArrV[iP] = obj;
            this.f21761n = objArrV;
            this.f21762o = d() + 1;
        } else {
            E(this.f21760m, this.f21761n, y(obj));
        }
        return true;
    }

    @Override
    public final boolean addAll(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        ((AbstractList) this).modCount++;
        int iP = P();
        Iterator it = collection.iterator();
        if (32 - iP >= collection.size()) {
            Object[] objArrV = v(this.f21761n);
            o(objArrV, iP, it);
            this.f21761n = objArrV;
            this.f21762o = collection.size() + this.f21762o;
            return true;
        }
        int size = ((collection.size() + iP) - 1) / 32;
        Object[][] objArr = new Object[size][];
        Object[] objArrV2 = v(this.f21761n);
        o(objArrV2, iP, it);
        objArr[0] = objArrV2;
        for (int i3 = 1; i3 < size; i3++) {
            Object[] objArrX = x();
            o(objArrX, 0, it);
            objArr[i3] = objArrX;
        }
        this.f21760m = D(this.f21760m, M(), objArr);
        Object[] objArrX2 = x();
        o(objArrX2, 0, it);
        this.f21761n = objArrX2;
        this.f21762o = collection.size() + this.f21762o;
        return true;
    }
}
