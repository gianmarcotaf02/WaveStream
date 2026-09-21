package p064h0;

/* JADX INFO: loaded from: classes.dex */
public final class k {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final p064h0.k f22446e = new p064h0.k(0, 0, new java.lang.Object[0], null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f22447a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f22448b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p081j0.b f22449c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public java.lang.Object[] f22450d;

    public k(int i3, int i9, java.lang.Object[] objArr, p081j0.b bVar) {
        this.f22447a = i3;
        this.f22448b = i9;
        this.f22449c = bVar;
        this.f22450d = objArr;
    }

    public static p064h0.k j(int i3, java.lang.Object obj, java.lang.Object obj2, int i9, java.lang.Object obj3, java.lang.Object obj4, int i10, p081j0.b bVar) {
        if (i10 > 30) {
            return new p064h0.k(0, 0, new java.lang.Object[]{obj, obj2, obj3, obj4}, bVar);
        }
        int iT0 = com.google.common.util.concurrent.U.t0(i3, i10);
        int iT1 = com.google.common.util.concurrent.U.t0(i9, i10);
        if (iT0 != iT1) {
            return new p064h0.k((1 << iT0) | (1 << iT1), 0, iT0 < iT1 ? new java.lang.Object[]{obj, obj2, obj3, obj4} : new java.lang.Object[]{obj3, obj4, obj, obj2}, bVar);
        }
        return new p064h0.k(0, 1 << iT0, new java.lang.Object[]{j(i3, obj, obj2, i9, obj3, obj4, i10 + 5, bVar)}, bVar);
    }

    public final java.lang.Object[] a(int i3, int i9, int i10, java.lang.Object obj, java.lang.Object obj2, int i11, p081j0.b bVar) {
        java.lang.Object obj3 = this.f22450d[i3];
        p064h0.k kVarJ = j(obj3 != null ? obj3.hashCode() : 0, obj3, x(i3), i10, obj, obj2, i11 + 5, bVar);
        int iT = t(i9);
        int i12 = iT + 1;
        java.lang.Object[] objArr = this.f22450d;
        java.lang.Object[] objArr2 = new java.lang.Object[objArr.length - 1];
        p078i6.m.e0(0, i3, 6, objArr, objArr2);
        p078i6.m.Z(i3, i3 + 2, i12, objArr, objArr2);
        objArr2[iT - 1] = kVarJ;
        p078i6.m.Z(iT, i12, objArr.length, objArr, objArr2);
        return objArr2;
    }

    public final int b() {
        if (this.f22448b == 0) {
            return this.f22450d.length / 2;
        }
        int iBitCount = java.lang.Integer.bitCount(this.f22447a);
        int length = this.f22450d.length;
        for (int i3 = iBitCount * 2; i3 < length; i3++) {
            iBitCount += s(i3).b();
        }
        return iBitCount;
    }

    public final boolean c(java.lang.Object obj) {
        D6.e eVarS = O7.r.S(O7.r.W(0, this.f22450d.length), 2);
        int i3 = eVarS.f2458h;
        int i9 = eVarS.f2459i;
        int i10 = eVarS.j;
        if ((i10 > 0 && i3 <= i9) || (i10 < 0 && i9 <= i3)) {
            while (!kotlin.jvm.internal.m.a(obj, this.f22450d[i3])) {
                if (i3 != i9) {
                    i3 += i10;
                }
            }
            return true;
        }
        return false;
    }

    public final boolean d(int i3, int i9, java.lang.Object obj) {
        int iT0 = 1 << com.google.common.util.concurrent.U.t0(i3, i9);
        if (h(iT0)) {
            return kotlin.jvm.internal.m.a(obj, this.f22450d[f(iT0)]);
        }
        if (!i(iT0)) {
            return false;
        }
        p064h0.k kVarS = s(t(iT0));
        return i9 == 30 ? kVarS.c(obj) : kVarS.d(i3, i9 + 5, obj);
    }

    public final boolean e(p064h0.k kVar) {
        if (this == kVar) {
            return true;
        }
        if (this.f22448b != kVar.f22448b || this.f22447a != kVar.f22447a) {
            return false;
        }
        int length = this.f22450d.length;
        for (int i3 = 0; i3 < length; i3++) {
            if (this.f22450d[i3] != kVar.f22450d[i3]) {
                return false;
            }
        }
        return true;
    }

    public final int f(int i3) {
        return java.lang.Integer.bitCount((i3 - 1) & this.f22447a) * 2;
    }

    public final java.lang.Object g(int i3, int i9, java.lang.Object obj) {
        int iT0 = 1 << com.google.common.util.concurrent.U.t0(i3, i9);
        if (h(iT0)) {
            int iF = f(iT0);
            if (kotlin.jvm.internal.m.a(obj, this.f22450d[iF])) {
                return x(iF);
            }
            return null;
        }
        if (!i(iT0)) {
            return null;
        }
        p064h0.k kVarS = s(t(iT0));
        if (i9 != 30) {
            return kVarS.g(i3, i9 + 5, obj);
        }
        D6.e eVarS = O7.r.S(O7.r.W(0, kVarS.f22450d.length), 2);
        int i10 = eVarS.f2458h;
        int i11 = eVarS.f2459i;
        int i12 = eVarS.j;
        if ((i12 <= 0 || i10 > i11) && (i12 >= 0 || i11 > i10)) {
            return null;
        }
        while (!kotlin.jvm.internal.m.a(obj, kVarS.f22450d[i10])) {
            if (i10 == i11) {
                return null;
            }
            i10 += i12;
        }
        return kVarS.x(i10);
    }

    public final boolean h(int i3) {
        return (i3 & this.f22447a) != 0;
    }

    public final boolean i(int i3) {
        return (i3 & this.f22448b) != 0;
    }

    public final p064h0.k k(int i3, p089k0.i iVar) {
        iVar.e(iVar.f24420l - 1);
        iVar.j = x(i3);
        java.lang.Object[] objArr = this.f22450d;
        if (objArr.length == 2) {
            return null;
        }
        if (this.f22449c != iVar.f24417h) {
            return new p064h0.k(0, 0, com.google.common.util.concurrent.U.a0(objArr, i3), iVar.f24417h);
        }
        this.f22450d = com.google.common.util.concurrent.U.a0(objArr, i3);
        return this;
    }

    public final p064h0.k l(int i3, java.lang.Object obj, java.lang.Object obj2, int i9, p089k0.i iVar) {
        p089k0.i iVar2;
        p064h0.k kVarL;
        int iT0 = 1 << com.google.common.util.concurrent.U.t0(i3, i9);
        boolean zH = h(iT0);
        p081j0.b bVar = this.f22449c;
        if (zH) {
            int iF = f(iT0);
            if (!kotlin.jvm.internal.m.a(obj, this.f22450d[iF])) {
                iVar.e(iVar.f24420l + 1);
                p081j0.b bVar2 = iVar.f24417h;
                if (bVar != bVar2) {
                    return new p064h0.k(this.f22447a ^ iT0, this.f22448b | iT0, a(iF, iT0, i3, obj, obj2, i9, bVar2), bVar2);
                }
                this.f22450d = a(iF, iT0, i3, obj, obj2, i9, bVar2);
                this.f22447a ^= iT0;
                this.f22448b |= iT0;
                return this;
            }
            iVar.j = x(iF);
            if (x(iF) == obj2) {
                return this;
            }
            if (bVar == iVar.f24417h) {
                this.f22450d[iF + 1] = obj2;
                return this;
            }
            iVar.f24419k++;
            java.lang.Object[] objArr = this.f22450d;
            java.lang.Object[] objArrCopyOf = java.util.Arrays.copyOf(objArr, objArr.length);
            kotlin.jvm.internal.m.d(objArrCopyOf, "copyOf(...)");
            objArrCopyOf[iF + 1] = obj2;
            return new p064h0.k(this.f22447a, this.f22448b, objArrCopyOf, iVar.f24417h);
        }
        if (!i(iT0)) {
            iVar.e(iVar.f24420l + 1);
            p081j0.b bVar3 = iVar.f24417h;
            int iF2 = f(iT0);
            if (bVar != bVar3) {
                return new p064h0.k(this.f22447a | iT0, this.f22448b, com.google.common.util.concurrent.U.W(this.f22450d, iF2, obj, obj2), bVar3);
            }
            this.f22450d = com.google.common.util.concurrent.U.W(this.f22450d, iF2, obj, obj2);
            this.f22447a |= iT0;
            return this;
        }
        int iT = t(iT0);
        p064h0.k kVarS = s(iT);
        if (i9 == 30) {
            D6.e eVarS = O7.r.S(O7.r.W(0, kVarS.f22450d.length), 2);
            int i10 = eVarS.f2458h;
            int i11 = eVarS.f2459i;
            int i12 = eVarS.j;
            if ((i12 > 0 && i10 <= i11) || (i12 < 0 && i11 <= i10)) {
                while (true) {
                    if (!kotlin.jvm.internal.m.a(obj, kVarS.f22450d[i10])) {
                        if (i10 == i11) {
                            iVar.e(iVar.f24420l + 1);
                            kVarL = new p064h0.k(0, 0, com.google.common.util.concurrent.U.W(kVarS.f22450d, 0, obj, obj2), iVar.f24417h);
                            break;
                        }
                        i10 += i12;
                    } else {
                        iVar.j = kVarS.x(i10);
                        if (kVarS.f22449c != iVar.f24417h) {
                            iVar.f24419k++;
                            java.lang.Object[] objArr2 = kVarS.f22450d;
                            java.lang.Object[] objArrCopyOf2 = java.util.Arrays.copyOf(objArr2, objArr2.length);
                            kotlin.jvm.internal.m.d(objArrCopyOf2, "copyOf(...)");
                            objArrCopyOf2[i10 + 1] = obj2;
                            kVarL = new p064h0.k(0, 0, objArrCopyOf2, iVar.f24417h);
                            break;
                        }
                        kVarS.f22450d[i10 + 1] = obj2;
                        kVarL = kVarS;
                        break;
                    }
                }
            } else {
                iVar.e(iVar.f24420l + 1);
                kVarL = new p064h0.k(0, 0, com.google.common.util.concurrent.U.W(kVarS.f22450d, 0, obj, obj2), iVar.f24417h);
                break;
            }
            iVar2 = iVar;
        } else {
            iVar2 = iVar;
            kVarL = kVarS.l(i3, obj, obj2, i9 + 5, iVar2);
        }
        return kVarS == kVarL ? this : r(iT, kVarL, iVar2.f24417h);
    }

    public final p064h0.k m(p064h0.k kVar, int i3, p081j0.a aVar, p089k0.i iVar) {
        p064h0.k kVar2;
        java.lang.Object[] objArr;
        p064h0.k kVarJ;
        if (this == kVar) {
            aVar.f23867a += b();
            return this;
        }
        int i9 = 0;
        if (i3 > 30) {
            p081j0.b bVar = iVar.f24417h;
            int i10 = kVar.f22448b;
            java.lang.Object[] objArr2 = this.f22450d;
            java.lang.Object[] objArrCopyOf = java.util.Arrays.copyOf(objArr2, objArr2.length + kVar.f22450d.length);
            kotlin.jvm.internal.m.d(objArrCopyOf, "copyOf(...)");
            int length = this.f22450d.length;
            D6.e eVarS = O7.r.S(O7.r.W(0, kVar.f22450d.length), 2);
            int i11 = eVarS.f2458h;
            int i12 = eVarS.f2459i;
            int i13 = eVarS.j;
            if ((i13 > 0 && i11 <= i12) || (i13 < 0 && i12 <= i11)) {
                while (true) {
                    if (c(kVar.f22450d[i11])) {
                        aVar.f23867a++;
                    } else {
                        java.lang.Object[] objArr3 = kVar.f22450d;
                        objArrCopyOf[length] = objArr3[i11];
                        objArrCopyOf[length + 1] = objArr3[i11 + 1];
                        length += 2;
                    }
                    if (i11 == i12) {
                        break;
                    }
                    i11 += i13;
                }
            }
            if (length != this.f22450d.length) {
                if (length == kVar.f22450d.length) {
                    return kVar;
                }
                if (length == objArrCopyOf.length) {
                    return new p064h0.k(0, 0, objArrCopyOf, bVar);
                }
                java.lang.Object[] objArrCopyOf2 = java.util.Arrays.copyOf(objArrCopyOf, length);
                kotlin.jvm.internal.m.d(objArrCopyOf2, "copyOf(...)");
                return new p064h0.k(0, 0, objArrCopyOf2, bVar);
            }
        } else {
            int i14 = this.f22448b | kVar.f22448b;
            int i15 = this.f22447a;
            int i16 = kVar.f22447a;
            int i17 = (i15 ^ i16) & (~i14);
            int i18 = i15 & i16;
            int i19 = i17;
            while (i18 != 0) {
                int iLowestOneBit = java.lang.Integer.lowestOneBit(i18);
                if (kotlin.jvm.internal.m.a(this.f22450d[f(iLowestOneBit)], kVar.f22450d[kVar.f(iLowestOneBit)])) {
                    i19 |= iLowestOneBit;
                } else {
                    i14 |= iLowestOneBit;
                }
                i18 ^= iLowestOneBit;
            }
            if ((i14 & i19) != 0) {
                p020c0.AbstractC1693m0.b("Check failed.");
            }
            if (kotlin.jvm.internal.m.a(this.f22449c, iVar.f24417h) && this.f22447a == i19 && this.f22448b == i14) {
                kVar2 = this;
            } else {
                kVar2 = new p064h0.k(i19, i14, new java.lang.Object[java.lang.Integer.bitCount(i14) + (java.lang.Integer.bitCount(i19) * 2)], null);
            }
            int i20 = i14;
            int i21 = 0;
            while (i20 != 0) {
                int iLowestOneBit2 = java.lang.Integer.lowestOneBit(i20);
                java.lang.Object[] objArr4 = kVar2.f22450d;
                int length2 = (objArr4.length - 1) - i21;
                if (i(iLowestOneBit2)) {
                    kVarJ = s(t(iLowestOneBit2));
                    if (kVar.i(iLowestOneBit2)) {
                        kVarJ = kVarJ.m(kVar.s(kVar.t(iLowestOneBit2)), i3 + 5, aVar, iVar);
                        objArr = objArr4;
                    } else if (kVar.h(iLowestOneBit2)) {
                        int iF = kVar.f(iLowestOneBit2);
                        java.lang.Object obj = kVar.f22450d[iF];
                        java.lang.Object objX = kVar.x(iF);
                        int i22 = iVar.f24420l;
                        objArr = objArr4;
                        kVarJ = kVarJ.l(obj != null ? obj.hashCode() : i9, obj, objX, i3 + 5, iVar);
                        if (iVar.f24420l == i22) {
                            aVar.f23867a++;
                        }
                    } else {
                        objArr = objArr4;
                    }
                } else {
                    objArr = objArr4;
                    if (kVar.i(iLowestOneBit2)) {
                        p064h0.k kVarS = kVar.s(kVar.t(iLowestOneBit2));
                        if (h(iLowestOneBit2)) {
                            int iF2 = f(iLowestOneBit2);
                            java.lang.Object obj2 = this.f22450d[iF2];
                            int i23 = i3 + 5;
                            if (kVarS.d(obj2 != null ? obj2.hashCode() : 0, i23, obj2)) {
                                aVar.f23867a++;
                                kVarJ = kVarS;
                            } else {
                                kVarJ = kVarS.l(obj2 != null ? obj2.hashCode() : 0, obj2, x(iF2), i23, iVar);
                            }
                        } else {
                            kVarJ = kVarS;
                        }
                    } else {
                        int iF3 = f(iLowestOneBit2);
                        java.lang.Object obj3 = this.f22450d[iF3];
                        java.lang.Object objX2 = x(iF3);
                        int iF4 = kVar.f(iLowestOneBit2);
                        java.lang.Object obj4 = kVar.f22450d[iF4];
                        kVarJ = j(obj3 != null ? obj3.hashCode() : 0, obj3, objX2, obj4 != null ? obj4.hashCode() : 0, obj4, kVar.x(iF4), i3 + 5, iVar.f24417h);
                    }
                }
                objArr[length2] = kVarJ;
                i21++;
                i20 ^= iLowestOneBit2;
                i9 = 0;
            }
            int i24 = 0;
            while (i19 != 0) {
                int iLowestOneBit3 = java.lang.Integer.lowestOneBit(i19);
                int i25 = i24 * 2;
                if (kVar.h(iLowestOneBit3)) {
                    int iF5 = kVar.f(iLowestOneBit3);
                    java.lang.Object[] objArr5 = kVar2.f22450d;
                    objArr5[i25] = kVar.f22450d[iF5];
                    objArr5[i25 + 1] = kVar.x(iF5);
                    if (h(iLowestOneBit3)) {
                        aVar.f23867a++;
                    }
                } else {
                    int iF6 = f(iLowestOneBit3);
                    java.lang.Object[] objArr6 = kVar2.f22450d;
                    objArr6[i25] = this.f22450d[iF6];
                    objArr6[i25 + 1] = x(iF6);
                }
                i24++;
                i19 ^= iLowestOneBit3;
            }
            if (!e(kVar2)) {
                return kVar.e(kVar2) ? kVar : kVar2;
            }
        }
        return this;
    }

    public final p064h0.k n(int i3, java.lang.Object obj, int i9, p089k0.i iVar) {
        p064h0.k kVarN;
        int iT0 = 1 << com.google.common.util.concurrent.U.t0(i3, i9);
        if (h(iT0)) {
            int iF = f(iT0);
            if (kotlin.jvm.internal.m.a(obj, this.f22450d[iF])) {
                return p(iF, iT0, iVar);
            }
        } else if (i(iT0)) {
            int iT = t(iT0);
            p064h0.k kVarS = s(iT);
            if (i9 == 30) {
                D6.e eVarS = O7.r.S(O7.r.W(0, kVarS.f22450d.length), 2);
                int i10 = eVarS.f2458h;
                int i11 = eVarS.f2459i;
                int i12 = eVarS.j;
                if ((i12 > 0 && i10 <= i11) || (i12 < 0 && i11 <= i10)) {
                    while (true) {
                        if (!kotlin.jvm.internal.m.a(obj, kVarS.f22450d[i10])) {
                            if (i10 == i11) {
                                kVarN = kVarS;
                                break;
                            }
                            i10 += i12;
                        } else {
                            kVarN = kVarS.k(i10, iVar);
                            break;
                        }
                    }
                } else {
                    kVarN = kVarS;
                    break;
                }
            } else {
                kVarN = kVarS.n(i3, obj, i9 + 5, iVar);
            }
            return q(kVarS, kVarN, iT, iT0, iVar.f24417h);
        }
        return this;
    }

    public final p064h0.k o(int i3, java.lang.Object obj, java.lang.Object obj2, int i9, p089k0.i iVar) {
        p064h0.k kVar;
        p064h0.k kVarO;
        int iT0 = 1 << com.google.common.util.concurrent.U.t0(i3, i9);
        if (h(iT0)) {
            int iF = f(iT0);
            if (kotlin.jvm.internal.m.a(obj, this.f22450d[iF]) && kotlin.jvm.internal.m.a(obj2, x(iF))) {
                return p(iF, iT0, iVar);
            }
        } else if (i(iT0)) {
            int iT = t(iT0);
            p064h0.k kVarS = s(iT);
            if (i9 == 30) {
                D6.e eVarS = O7.r.S(O7.r.W(0, kVarS.f22450d.length), 2);
                int i10 = eVarS.f2458h;
                int i11 = eVarS.f2459i;
                int i12 = eVarS.j;
                if ((i12 > 0 && i10 <= i11) || (i12 < 0 && i11 <= i10)) {
                    while (true) {
                        if (!kotlin.jvm.internal.m.a(obj, kVarS.f22450d[i10]) || !kotlin.jvm.internal.m.a(obj2, kVarS.x(i10))) {
                            if (i10 == i11) {
                                kVarO = kVarS;
                                break;
                            }
                            i10 += i12;
                        } else {
                            kVarO = kVarS.k(i10, iVar);
                            break;
                        }
                    }
                } else {
                    kVarO = kVarS;
                    break;
                }
                kVar = kVarS;
            } else {
                kVar = kVarS;
                kVarO = kVar.o(i3, obj, obj2, i9 + 5, iVar);
            }
            return q(kVar, kVarO, iT, iT0, iVar.f24417h);
        }
        return this;
    }

    public final p064h0.k p(int i3, int i9, p089k0.i iVar) {
        iVar.e(iVar.f24420l - 1);
        iVar.j = x(i3);
        java.lang.Object[] objArr = this.f22450d;
        if (objArr.length == 2) {
            return null;
        }
        if (this.f22449c != iVar.f24417h) {
            return new p064h0.k(i9 ^ this.f22447a, this.f22448b, com.google.common.util.concurrent.U.a0(objArr, i3), iVar.f24417h);
        }
        this.f22450d = com.google.common.util.concurrent.U.a0(objArr, i3);
        this.f22447a ^= i9;
        return this;
    }

    public final p064h0.k q(p064h0.k kVar, p064h0.k kVar2, int i3, int i9, p081j0.b bVar) {
        p081j0.b bVar2 = this.f22449c;
        if (kVar2 != null) {
            return (bVar2 == bVar || kVar != kVar2) ? r(i3, kVar2, bVar) : this;
        }
        java.lang.Object[] objArr = this.f22450d;
        if (objArr.length == 1) {
            return null;
        }
        if (bVar2 != bVar) {
            return new p064h0.k(this.f22447a, i9 ^ this.f22448b, com.google.common.util.concurrent.U.b0(objArr, i3), bVar);
        }
        this.f22450d = com.google.common.util.concurrent.U.b0(objArr, i3);
        this.f22448b ^= i9;
        return this;
    }

    public final p064h0.k r(int i3, p064h0.k kVar, p081j0.b bVar) {
        java.lang.Object[] objArr = this.f22450d;
        if (objArr.length == 1 && kVar.f22450d.length == 2 && kVar.f22448b == 0) {
            kVar.f22447a = this.f22448b;
            return kVar;
        }
        if (this.f22449c == bVar) {
            objArr[i3] = kVar;
            return this;
        }
        java.lang.Object[] objArrCopyOf = java.util.Arrays.copyOf(objArr, objArr.length);
        kotlin.jvm.internal.m.d(objArrCopyOf, "copyOf(...)");
        objArrCopyOf[i3] = kVar;
        return new p064h0.k(this.f22447a, this.f22448b, objArrCopyOf, bVar);
    }

    public final p064h0.k s(int i3) {
        java.lang.Object obj = this.f22450d[i3];
        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode>");
        return (p064h0.k) obj;
    }

    public final int t(int i3) {
        return (this.f22450d.length - 1) - java.lang.Integer.bitCount((i3 - 1) & this.f22448b);
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x00d9, code lost:
    
        if (r14 == null) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00e2, code lost:
    
        if (r14 == null) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00e5, code lost:
    
        r14.j = w(r12, r4, (p064h0.k) r14.j);
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00ef, code lost:
    
        return r14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Y2.L u(java.lang.Object obj, int i3, java.lang.Object obj2, int i9) {
        Y2.L lU;
        int i10 = 1;
        int iT0 = 1 << com.google.common.util.concurrent.U.t0(i3, i9);
        int i11 = 0;
        if (h(iT0)) {
            int iF = f(iT0);
            if (!kotlin.jvm.internal.m.a(obj, this.f22450d[iF])) {
                return new Y2.L(new p064h0.k(this.f22447a ^ iT0, this.f22448b | iT0, a(iF, iT0, i3, obj, obj2, i9, null), null), i10, 9);
            }
            if (x(iF) != obj2) {
                java.lang.Object[] objArr = this.f22450d;
                java.lang.Object[] objArrCopyOf = java.util.Arrays.copyOf(objArr, objArr.length);
                kotlin.jvm.internal.m.d(objArrCopyOf, "copyOf(...)");
                objArrCopyOf[iF + 1] = obj2;
                return new Y2.L(new p064h0.k(this.f22447a, this.f22448b, objArrCopyOf, null), i11, 9);
            }
        } else {
            if (!i(iT0)) {
                return new Y2.L(new p064h0.k(this.f22447a | iT0, this.f22448b, com.google.common.util.concurrent.U.W(this.f22450d, f(iT0), obj, obj2), null), i10, 9);
            }
            int iT = t(iT0);
            p064h0.k kVarS = s(iT);
            if (i9 == 30) {
                D6.e eVarS = O7.r.S(O7.r.W(0, kVarS.f22450d.length), 2);
                int i12 = eVarS.f2458h;
                int i13 = eVarS.f2459i;
                int i14 = eVarS.j;
                if ((i14 > 0 && i12 <= i13) || (i14 < 0 && i13 <= i12)) {
                    while (true) {
                        if (!kotlin.jvm.internal.m.a(obj, kVarS.f22450d[i12])) {
                            if (i12 == i13) {
                                lU = new Y2.L(new p064h0.k(0, 0, com.google.common.util.concurrent.U.W(kVarS.f22450d, 0, obj, obj2), null), i10, 9);
                                break;
                            }
                            i12 += i14;
                        } else {
                            if (obj2 != kVarS.x(i12)) {
                                java.lang.Object[] objArr2 = kVarS.f22450d;
                                java.lang.Object[] objArrCopyOf2 = java.util.Arrays.copyOf(objArr2, objArr2.length);
                                kotlin.jvm.internal.m.d(objArrCopyOf2, "copyOf(...)");
                                objArrCopyOf2[i12 + 1] = obj2;
                                lU = new Y2.L(new p064h0.k(0, 0, objArrCopyOf2, null), i11, 9);
                                break;
                            }
                            lU = null;
                            break;
                        }
                    }
                } else {
                    lU = new Y2.L(new p064h0.k(0, 0, com.google.common.util.concurrent.U.W(kVarS.f22450d, 0, obj, obj2), null), i10, 9);
                    break;
                }
            } else {
                lU = kVarS.u(obj, i3, obj2, i9 + 5);
            }
        }
        return null;
    }

    public final p064h0.k v(int i3, p020c0.C1676e c1676e, int i9) {
        p064h0.k kVarV;
        int iT0 = 1 << com.google.common.util.concurrent.U.t0(i3, i9);
        if (h(iT0)) {
            int iF = f(iT0);
            if (kotlin.jvm.internal.m.a(c1676e, this.f22450d[iF])) {
                java.lang.Object[] objArr = this.f22450d;
                if (objArr.length != 2) {
                    return new p064h0.k(this.f22447a ^ iT0, this.f22448b, com.google.common.util.concurrent.U.a0(objArr, iF), null);
                }
                return null;
            }
            return this;
        }
        if (i(iT0)) {
            int iT = t(iT0);
            p064h0.k kVarS = s(iT);
            if (i9 == 30) {
                D6.e eVarS = O7.r.S(O7.r.W(0, kVarS.f22450d.length), 2);
                int i10 = eVarS.f2458h;
                int i11 = eVarS.f2459i;
                int i12 = eVarS.j;
                if ((i12 > 0 && i10 <= i11) || (i12 < 0 && i11 <= i10)) {
                    while (true) {
                        if (!kotlin.jvm.internal.m.a(c1676e, kVarS.f22450d[i10])) {
                            if (i10 == i11) {
                                kVarV = kVarS;
                                break;
                            }
                            i10 += i12;
                        } else {
                            java.lang.Object[] objArr2 = kVarS.f22450d;
                            if (objArr2.length != 2) {
                                kVarV = new p064h0.k(0, 0, com.google.common.util.concurrent.U.a0(objArr2, i10), null);
                                break;
                            }
                            kVarV = null;
                            break;
                        }
                    }
                } else {
                    kVarV = kVarS;
                    break;
                }
            } else {
                kVarV = kVarS.v(i3, c1676e, i9 + 5);
            }
            if (kVarV == null) {
                java.lang.Object[] objArr3 = this.f22450d;
                if (objArr3.length != 1) {
                    return new p064h0.k(this.f22447a, iT0 ^ this.f22448b, com.google.common.util.concurrent.U.b0(objArr3, iT), null);
                }
                return null;
            }
            if (kVarS != kVarV) {
                return w(iT, iT0, kVarV);
            }
        }
        return this;
    }

    public final p064h0.k w(int i3, int i9, p064h0.k kVar) {
        java.lang.Object[] objArr = kVar.f22450d;
        if (objArr.length != 2 || kVar.f22448b != 0) {
            java.lang.Object[] objArr2 = this.f22450d;
            java.lang.Object[] objArrCopyOf = java.util.Arrays.copyOf(objArr2, objArr2.length);
            kotlin.jvm.internal.m.d(objArrCopyOf, "copyOf(...)");
            objArrCopyOf[i3] = kVar;
            return new p064h0.k(this.f22447a, this.f22448b, objArrCopyOf, null);
        }
        if (this.f22450d.length == 1) {
            kVar.f22447a = this.f22448b;
            return kVar;
        }
        int iF = f(i9);
        java.lang.Object[] objArr3 = this.f22450d;
        java.lang.Object obj = objArr[0];
        java.lang.Object obj2 = objArr[1];
        java.lang.Object[] objArrCopyOf2 = java.util.Arrays.copyOf(objArr3, objArr3.length + 1);
        kotlin.jvm.internal.m.d(objArrCopyOf2, "copyOf(...)");
        p078i6.m.Z(i3 + 2, i3 + 1, objArr3.length, objArrCopyOf2, objArrCopyOf2);
        p078i6.m.Z(iF + 2, iF, i3, objArrCopyOf2, objArrCopyOf2);
        objArrCopyOf2[iF] = obj;
        objArrCopyOf2[iF + 1] = obj2;
        return new p064h0.k(this.f22447a ^ i9, i9 ^ this.f22448b, objArrCopyOf2, null);
    }

    public final java.lang.Object x(int i3) {
        return this.f22450d[i3 + 1];
    }
}
