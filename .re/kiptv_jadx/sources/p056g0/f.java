package p056g0;

/* JADX INFO: loaded from: classes.dex */
public final class f extends p078i6.AbstractC2257h implements java.util.Collection, p201y6.b {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public p056g0.c f21756h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public java.lang.Object[] f21757i;
    public java.lang.Object[] j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f21758k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public p081j0.b f21759l = new p081j0.b();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public java.lang.Object[] f21760m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public java.lang.Object[] f21761n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f21762o;

    public f(p056g0.c cVar, java.lang.Object[] objArr, java.lang.Object[] objArr2, int i3) {
        this.f21756h = cVar;
        this.f21757i = objArr;
        this.j = objArr2;
        this.f21758k = i3;
        this.f21760m = objArr;
        this.f21761n = objArr2;
        this.f21762o = cVar.d();
    }

    public static void o(java.lang.Object[] objArr, int i3, java.util.Iterator it) {
        while (i3 < 32 && it.hasNext()) {
            objArr[i3] = it.next();
            i3++;
        }
    }

    public final java.lang.Object[] A(java.lang.Object[] objArr, int i3, int i9, E2.j jVar) {
        java.lang.Object[] objArrA;
        int iY = com.google.android.gms.internal.play_billing.AbstractC1853k0.y(i9 - 1, i3);
        if (i3 == 5) {
            jVar.f2785a = objArr[iY];
            objArrA = null;
        } else {
            java.lang.Object obj = objArr[iY];
            kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            objArrA = A((java.lang.Object[]) obj, i3 - 5, i9, jVar);
        }
        if (objArrA == null && iY == 0) {
            return null;
        }
        java.lang.Object[] objArrV = v(objArr);
        objArrV[iY] = objArrA;
        return objArrV;
    }

    public final void B(java.lang.Object[] objArr, int i3, int i9) {
        if (i9 == 0) {
            this.f21760m = null;
            if (objArr == null) {
                objArr = new java.lang.Object[0];
            }
            this.f21761n = objArr;
            this.f21762o = i3;
            this.f21758k = i9;
            return;
        }
        E2.j jVar = new E2.j(null);
        kotlin.jvm.internal.m.b(objArr);
        java.lang.Object[] objArrA = A(objArr, i9, i3, jVar);
        kotlin.jvm.internal.m.b(objArrA);
        java.lang.Object obj = jVar.f2785a;
        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        this.f21761n = (java.lang.Object[]) obj;
        this.f21762o = i3;
        if (objArrA[1] == null) {
            this.f21760m = (java.lang.Object[]) objArrA[0];
            this.f21758k = i9 - 5;
        } else {
            this.f21760m = objArrA;
            this.f21758k = i9;
        }
    }

    public final java.lang.Object[] C(java.lang.Object[] objArr, int i3, int i9, java.util.Iterator it) {
        if (!it.hasNext()) {
            p020c0.AbstractC1693m0.a("invalid buffersIterator");
        }
        if (!(i9 >= 0)) {
            p020c0.AbstractC1693m0.a("negative shift");
        }
        if (i9 == 0) {
            return (java.lang.Object[]) it.next();
        }
        java.lang.Object[] objArrV = v(objArr);
        int iY = com.google.android.gms.internal.play_billing.AbstractC1853k0.y(i3, i9);
        int i10 = i9 - 5;
        objArrV[iY] = C((java.lang.Object[]) objArrV[iY], i3, i10, it);
        while (true) {
            iY++;
            if (iY >= 32 || !it.hasNext()) {
                break;
            }
            objArrV[iY] = C((java.lang.Object[]) objArrV[iY], 0, i10, it);
        }
        return objArrV;
    }

    public final java.lang.Object[] D(java.lang.Object[] objArr, int i3, java.lang.Object[][] objArr2) {
        D1.X xH = kotlin.jvm.internal.m.h(objArr2);
        int i9 = i3 >> 5;
        int i10 = this.f21758k;
        java.lang.Object[] objArrC = i9 < (1 << i10) ? C(objArr, i3, i10, xH) : v(objArr);
        while (xH.hasNext()) {
            this.f21758k += 5;
            objArrC = y(objArrC);
            int i11 = this.f21758k;
            C(objArrC, 1 << i11, i11, xH);
        }
        return objArrC;
    }

    public final void E(java.lang.Object[] objArr, java.lang.Object[] objArr2, java.lang.Object[] objArr3) {
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

    public final java.lang.Object[] F(int i3, java.lang.Object[] objArr, java.lang.Object[] objArr2) {
        int iY = com.google.android.gms.internal.play_billing.AbstractC1853k0.y(d() - 1, i3);
        java.lang.Object[] objArrV = v(objArr);
        if (i3 == 5) {
            objArrV[iY] = objArr2;
            return objArrV;
        }
        objArrV[iY] = F(i3 - 5, (java.lang.Object[]) objArrV[iY], objArr2);
        return objArrV;
    }

    public final int G(p194x6.j jVar, java.lang.Object[] objArr, int i3, int i9, E2.j jVar2, java.util.ArrayList arrayList, java.util.ArrayList arrayList2) {
        if (t(objArr)) {
            arrayList.add(objArr);
        }
        java.lang.Object obj = jVar2.f2785a;
        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        java.lang.Object[] objArr2 = (java.lang.Object[]) obj;
        java.lang.Object[] objArrX = objArr2;
        for (int i10 = 0; i10 < i3; i10++) {
            java.lang.Object obj2 = objArr[i10];
            if (!((java.lang.Boolean) jVar.invoke(obj2)).booleanValue()) {
                if (i9 == 32) {
                    objArrX = !arrayList.isEmpty() ? (java.lang.Object[]) arrayList.remove(arrayList.size() - 1) : x();
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

    public final int H(p194x6.j jVar, java.lang.Object[] objArr, int i3, E2.j jVar2) {
        java.lang.Object[] objArrV = objArr;
        int i9 = i3;
        boolean z6 = false;
        for (int i10 = 0; i10 < i3; i10++) {
            java.lang.Object obj = objArr[i10];
            if (((java.lang.Boolean) jVar.invoke(obj)).booleanValue()) {
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

    public final int I(p194x6.j jVar, int i3, E2.j jVar2) {
        int iH = H(jVar, this.f21761n, i3, jVar2);
        if (iH == i3) {
            return i3;
        }
        java.lang.Object obj = jVar2.f2785a;
        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        java.lang.Object[] objArr = (java.lang.Object[]) obj;
        java.util.Arrays.fill(objArr, iH, i3, (java.lang.Object) null);
        this.f21761n = objArr;
        this.f21762o -= i3 - iH;
        return iH;
    }

    public final boolean J(p194x6.j jVar) {
        java.lang.Object[] objArrC;
        int i3;
        p194x6.j jVar2 = jVar;
        int iP = P();
        java.lang.Object[] objArrZ = null;
        E2.j jVar3 = new E2.j(null);
        boolean z6 = false;
        if (this.f21760m != null) {
            p056g0.a aVarU = u(0);
            int iH = 32;
            while (iH == 32 && aVarU.hasNext()) {
                iH = H(jVar2, (java.lang.Object[]) aVarU.next(), 32, jVar3);
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
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                int iG = iH;
                while (aVarU.hasNext()) {
                    iG = G(jVar2, (java.lang.Object[]) aVarU.next(), 32, iG, jVar3, arrayList2, arrayList);
                    jVar2 = jVar;
                }
                int iG2 = G(jVar, this.f21761n, iP, iG, jVar3, arrayList2, arrayList);
                java.lang.Object obj = jVar3.f2785a;
                kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                java.lang.Object[] objArr = (java.lang.Object[]) obj;
                java.util.Arrays.fill(objArr, iG2, 32, (java.lang.Object) null);
                if (arrayList.isEmpty()) {
                    objArrC = this.f21760m;
                    kotlin.jvm.internal.m.b(objArrC);
                } else {
                    objArrC = C(this.f21760m, i9, this.f21758k, arrayList.iterator());
                }
                int size = i9 + (arrayList.size() << 5);
                if ((size & 31) != 0) {
                    p020c0.AbstractC1693m0.a("invalid size");
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
                        java.lang.Object[] objArr2 = objArrC[0];
                        kotlin.jvm.internal.m.c(objArr2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
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
            ((java.util.AbstractList) this).modCount++;
        }
        return z6;
    }

    public final java.lang.Object[] K(java.lang.Object[] objArr, int i3, int i9, E2.j jVar) {
        int iY = com.google.android.gms.internal.play_billing.AbstractC1853k0.y(i9, i3);
        if (i3 == 0) {
            java.lang.Object obj = objArr[iY];
            java.lang.Object[] objArrV = v(objArr);
            p078i6.m.Z(iY, iY + 1, 32, objArr, objArrV);
            objArrV[31] = jVar.f2785a;
            jVar.f2785a = obj;
            return objArrV;
        }
        int iY2 = objArr[31] == null ? com.google.android.gms.internal.play_billing.AbstractC1853k0.y(M() - 1, i3) : 31;
        java.lang.Object[] objArrV2 = v(objArr);
        int i10 = i3 - 5;
        int i11 = iY + 1;
        if (i11 <= iY2) {
            while (true) {
                java.lang.Object obj2 = objArrV2[iY2];
                kotlin.jvm.internal.m.c(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                objArrV2[iY2] = K((java.lang.Object[]) obj2, i10, 0, jVar);
                if (iY2 == i11) {
                    break;
                }
                iY2--;
            }
        }
        java.lang.Object obj3 = objArrV2[iY];
        kotlin.jvm.internal.m.c(obj3, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        objArrV2[iY] = K((java.lang.Object[]) obj3, i10, i9, jVar);
        return objArrV2;
    }

    public final java.lang.Object L(java.lang.Object[] objArr, int i3, int i9, int i10) {
        int i11 = this.f21762o - i3;
        if (i11 == 1) {
            java.lang.Object obj = this.f21761n[0];
            B(objArr, i3, i9);
            return obj;
        }
        java.lang.Object[] objArr2 = this.f21761n;
        java.lang.Object obj2 = objArr2[i10];
        java.lang.Object[] objArrV = v(objArr2);
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

    public final java.lang.Object[] N(java.lang.Object[] objArr, int i3, int i9, java.lang.Object obj, E2.j jVar) {
        int iY = com.google.android.gms.internal.play_billing.AbstractC1853k0.y(i9, i3);
        java.lang.Object[] objArrV = v(objArr);
        if (i3 != 0) {
            java.lang.Object obj2 = objArrV[iY];
            kotlin.jvm.internal.m.c(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            objArrV[iY] = N((java.lang.Object[]) obj2, i3 - 5, i9, obj, jVar);
            return objArrV;
        }
        if (objArrV != objArr) {
            ((java.util.AbstractList) this).modCount++;
        }
        jVar.f2785a = objArrV[iY];
        objArrV[iY] = obj;
        return objArrV;
    }

    public final void O(java.util.Collection collection, int i3, java.lang.Object[] objArr, int i9, java.lang.Object[][] objArr2, int i10, java.lang.Object[] objArr3) {
        java.lang.Object[] objArrX;
        if (i10 < 1) {
            p020c0.AbstractC1693m0.a("requires at least one nullBuffer");
        }
        java.lang.Object[] objArrV = v(objArr);
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
        java.util.Iterator it = collection.iterator();
        o(objArrV, i11, it);
        for (int i15 = 1; i15 < i10; i15++) {
            java.lang.Object[] objArrX2 = x();
            o(objArrX2, 0, it);
            objArr2[i15] = objArrX2;
        }
        o(objArr3, 0, it);
    }

    public final int P() {
        int i3 = this.f21762o;
        return i3 <= 32 ? i3 : i3 - ((i3 - 1) & (-32));
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i3, java.lang.Object obj) {
        com.google.common.util.concurrent.D.f(i3, d());
        if (i3 == d()) {
            add(obj);
            return;
        }
        ((java.util.AbstractList) this).modCount++;
        int iM = M();
        if (i3 >= iM) {
            s(i3 - iM, obj, this.f21760m);
            return;
        }
        E2.j jVar = new E2.j(null);
        java.lang.Object[] objArr = this.f21760m;
        kotlin.jvm.internal.m.b(objArr);
        s(0, jVar.f2785a, r(objArr, this.f21758k, i3, obj, jVar));
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i3, java.util.Collection collection) {
        java.util.Collection collection2;
        p056g0.f fVar;
        java.lang.Object[] objArrX;
        com.google.common.util.concurrent.D.f(i3, this.f21762o);
        if (i3 == this.f21762o) {
            return addAll(collection);
        }
        if (collection.isEmpty()) {
            return false;
        }
        ((java.util.AbstractList) this).modCount++;
        int i9 = (i3 >> 5) << 5;
        int size = ((collection.size() + (this.f21762o - i9)) - 1) / 32;
        if (size == 0) {
            int i10 = i3 & 31;
            int size2 = ((collection.size() + i3) - 1) & 31;
            java.lang.Object[] objArr = this.f21761n;
            java.lang.Object[] objArrV = v(objArr);
            p078i6.m.Z(size2 + 1, i10, P(), objArr, objArrV);
            o(objArrV, i10, collection.iterator());
            this.f21761n = objArrV;
            this.f21762o = collection.size() + this.f21762o;
            return true;
        }
        java.lang.Object[][] objArr2 = new java.lang.Object[size][];
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
                java.lang.Object[] objArrW = w(fVar.f21761n, i11);
                fVar.q(collection2, i3, i11, objArr2, size, objArrW);
                objArr2 = objArr2;
                objArrX = objArrW;
            } else {
                java.lang.Object[] objArr3 = fVar.f21761n;
                objArrX = x();
                int i12 = iP - size3;
                p078i6.m.Z(0, i12, iP, objArr3, objArrX);
                int i13 = 32 - i12;
                java.lang.Object[] objArrW2 = w(fVar.f21761n, i13);
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

    @Override // p078i6.AbstractC2257h
    public final int d() {
        return this.f21762o;
    }

    @Override // p078i6.AbstractC2257h
    public final java.lang.Object e(int i3) {
        com.google.common.util.concurrent.D.e(i3, d());
        ((java.util.AbstractList) this).modCount++;
        int iM = M();
        if (i3 >= iM) {
            return L(this.f21760m, iM, this.f21758k, i3 - iM);
        }
        E2.j jVar = new E2.j(this.f21761n[0]);
        java.lang.Object[] objArr = this.f21760m;
        kotlin.jvm.internal.m.b(objArr);
        L(K(objArr, this.f21758k, i3, jVar), iM, this.f21758k, 0);
        return jVar.f2785a;
    }

    @Override // java.util.AbstractList, java.util.List
    public final java.lang.Object get(int i3) {
        java.lang.Object[] objArr;
        com.google.common.util.concurrent.D.e(i3, d());
        if (M() <= i3) {
            objArr = this.f21761n;
        } else {
            objArr = this.f21760m;
            kotlin.jvm.internal.m.b(objArr);
            for (int i9 = this.f21758k; i9 > 0; i9 -= 5) {
                java.lang.Object obj = objArr[com.google.android.gms.internal.play_billing.AbstractC1853k0.y(i3, i9)];
                kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                objArr = (java.lang.Object[]) obj;
            }
        }
        return objArr[i3 & 31];
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final java.util.Iterator iterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractList, java.util.List
    public final java.util.ListIterator listIterator(int i3) {
        com.google.common.util.concurrent.D.f(i3, this.f21762o);
        return new p056g0.h(this, i3);
    }

    public final p056g0.c n() {
        p056g0.c eVar;
        java.lang.Object[] objArr = this.f21760m;
        if (objArr == this.f21757i && this.f21761n == this.j) {
            eVar = this.f21756h;
        } else {
            this.f21759l = new p081j0.b();
            this.f21757i = objArr;
            java.lang.Object[] objArr2 = this.f21761n;
            this.j = objArr2;
            if (objArr != null) {
                eVar = new p056g0.e(objArr, objArr2, this.f21762o, this.f21758k);
            } else if (objArr2.length == 0) {
                eVar = p056g0.i.f21767i;
            } else {
                java.lang.Object[] objArrCopyOf = java.util.Arrays.copyOf(objArr2, this.f21762o);
                kotlin.jvm.internal.m.d(objArrCopyOf, "copyOf(...)");
                eVar = new p056g0.i(objArrCopyOf);
            }
        }
        this.f21756h = eVar;
        return eVar;
    }

    public final int p() {
        return ((java.util.AbstractList) this).modCount;
    }

    public final void q(java.util.Collection collection, int i3, int i9, java.lang.Object[][] objArr, int i10, java.lang.Object[] objArr2) {
        if (this.f21760m == null) {
            throw new java.lang.IllegalStateException("root is null");
        }
        int i11 = i3 >> 5;
        p056g0.a aVarU = u(M() >> 5);
        int i12 = i10;
        java.lang.Object[] objArrW = objArr2;
        while (aVarU.f21748h - 1 != i11) {
            java.lang.Object[] objArr3 = (java.lang.Object[]) aVarU.previous();
            p078i6.m.Z(0, 32 - i9, 32, objArr3, objArrW);
            objArrW = w(objArr3, i9);
            i12--;
            objArr[i12] = objArrW;
        }
        java.lang.Object[] objArr4 = (java.lang.Object[]) aVarU.previous();
        int iM = i10 - (((M() >> 5) - 1) - i11);
        if (iM < i10) {
            objArr2 = objArr[iM];
            kotlin.jvm.internal.m.b(objArr2);
        }
        O(collection, i3, objArr4, 32, objArr, iM, objArr2);
    }

    public final java.lang.Object[] r(java.lang.Object[] objArr, int i3, int i9, java.lang.Object obj, E2.j jVar) {
        java.lang.Object obj2;
        int iY = com.google.android.gms.internal.play_billing.AbstractC1853k0.y(i9, i3);
        if (i3 == 0) {
            jVar.f2785a = objArr[31];
            java.lang.Object[] objArrV = v(objArr);
            p078i6.m.Z(iY + 1, iY, 31, objArr, objArrV);
            objArrV[iY] = obj;
            return objArrV;
        }
        java.lang.Object[] objArrV2 = v(objArr);
        int i10 = i3 - 5;
        java.lang.Object obj3 = objArrV2[iY];
        kotlin.jvm.internal.m.c(obj3, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        objArrV2[iY] = r((java.lang.Object[]) obj3, i10, i9, obj, jVar);
        while (true) {
            iY++;
            if (iY >= 32 || (obj2 = objArrV2[iY]) == null) {
                break;
            }
            objArrV2[iY] = r((java.lang.Object[]) obj2, i10, 0, jVar.f2785a, jVar);
        }
        return objArrV2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(java.util.Collection collection) {
        return J(new p056g0.b(1, collection));
    }

    public final void s(int i3, java.lang.Object obj, java.lang.Object[] objArr) {
        int iP = P();
        java.lang.Object[] objArrV = v(this.f21761n);
        if (iP >= 32) {
            java.lang.Object[] objArr2 = this.f21761n;
            java.lang.Object obj2 = objArr2[31];
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

    @Override // java.util.AbstractList, java.util.List
    public final java.lang.Object set(int i3, java.lang.Object obj) {
        com.google.common.util.concurrent.D.e(i3, d());
        if (M() > i3) {
            E2.j jVar = new E2.j(null);
            java.lang.Object[] objArr = this.f21760m;
            kotlin.jvm.internal.m.b(objArr);
            this.f21760m = N(objArr, this.f21758k, i3, obj, jVar);
            return jVar.f2785a;
        }
        java.lang.Object[] objArrV = v(this.f21761n);
        if (objArrV != this.f21761n) {
            ((java.util.AbstractList) this).modCount++;
        }
        int i9 = i3 & 31;
        java.lang.Object obj2 = objArrV[i9];
        objArrV[i9] = obj;
        this.f21761n = objArrV;
        return obj2;
    }

    public final boolean t(java.lang.Object[] objArr) {
        return objArr.length == 33 && objArr[32] == this.f21759l;
    }

    public final p056g0.a u(int i3) {
        java.lang.Object[] objArr = this.f21760m;
        if (objArr == null) {
            throw new java.lang.IllegalStateException("Invalid root");
        }
        int iM = M() >> 5;
        com.google.common.util.concurrent.D.f(i3, iM);
        int i9 = this.f21758k;
        return i9 == 0 ? new p056g0.d(i3, objArr) : new p056g0.j(objArr, i3, iM, i9 / 5);
    }

    public final java.lang.Object[] v(java.lang.Object[] objArr) {
        if (objArr == null) {
            return x();
        }
        if (t(objArr)) {
            return objArr;
        }
        java.lang.Object[] objArrX = x();
        int length = objArr.length;
        if (length > 32) {
            length = 32;
        }
        p078i6.m.e0(0, length, 6, objArr, objArrX);
        return objArrX;
    }

    public final java.lang.Object[] w(java.lang.Object[] objArr, int i3) {
        if (t(objArr)) {
            p078i6.m.Z(i3, 0, 32 - i3, objArr, objArr);
            return objArr;
        }
        java.lang.Object[] objArrX = x();
        p078i6.m.Z(i3, 0, 32 - i3, objArr, objArrX);
        return objArrX;
    }

    public final java.lang.Object[] x() {
        java.lang.Object[] objArr = new java.lang.Object[33];
        objArr[32] = this.f21759l;
        return objArr;
    }

    public final java.lang.Object[] y(java.lang.Object obj) {
        java.lang.Object[] objArr = new java.lang.Object[33];
        objArr[0] = obj;
        objArr[32] = this.f21759l;
        return objArr;
    }

    public final java.lang.Object[] z(java.lang.Object[] objArr, int i3, int i9) {
        if (i9 < 0) {
            p020c0.AbstractC1693m0.a("shift should be positive");
        }
        if (i9 == 0) {
            return objArr;
        }
        int iY = com.google.android.gms.internal.play_billing.AbstractC1853k0.y(i3, i9);
        java.lang.Object obj = objArr[iY];
        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        java.lang.Object objZ = z((java.lang.Object[]) obj, i3, i9 - 5);
        if (iY < 31) {
            int i10 = iY + 1;
            if (objArr[i10] != null) {
                if (t(objArr)) {
                    java.util.Arrays.fill(objArr, i10, 32, (java.lang.Object) null);
                }
                java.lang.Object[] objArrX = x();
                p078i6.m.Z(0, 0, i10, objArr, objArrX);
                objArr = objArrX;
            }
        }
        if (objZ == objArr[iY]) {
            return objArr;
        }
        java.lang.Object[] objArrV = v(objArr);
        objArrV[iY] = objZ;
        return objArrV;
    }

    @Override // java.util.AbstractList, java.util.List
    public final java.util.ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(java.lang.Object obj) {
        ((java.util.AbstractList) this).modCount++;
        int iP = P();
        if (iP < 32) {
            java.lang.Object[] objArrV = v(this.f21761n);
            objArrV[iP] = obj;
            this.f21761n = objArrV;
            this.f21762o = d() + 1;
        } else {
            E(this.f21760m, this.f21761n, y(obj));
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(java.util.Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        ((java.util.AbstractList) this).modCount++;
        int iP = P();
        java.util.Iterator it = collection.iterator();
        if (32 - iP >= collection.size()) {
            java.lang.Object[] objArrV = v(this.f21761n);
            o(objArrV, iP, it);
            this.f21761n = objArrV;
            this.f21762o = collection.size() + this.f21762o;
            return true;
        }
        int size = ((collection.size() + iP) - 1) / 32;
        java.lang.Object[][] objArr = new java.lang.Object[size][];
        java.lang.Object[] objArrV2 = v(this.f21761n);
        o(objArrV2, iP, it);
        objArr[0] = objArrV2;
        for (int i3 = 1; i3 < size; i3++) {
            java.lang.Object[] objArrX = x();
            o(objArrX, 0, it);
            objArr[i3] = objArrX;
        }
        this.f21760m = D(this.f21760m, M(), objArr);
        java.lang.Object[] objArrX2 = x();
        o(objArrX2, 0, it);
        this.f21761n = objArrX2;
        this.f21762o = collection.size() + this.f21762o;
        return true;
    }
}
