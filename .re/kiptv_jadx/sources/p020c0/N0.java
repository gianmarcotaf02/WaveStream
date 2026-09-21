package p020c0;

/* JADX INFO: loaded from: classes.dex */
public final class N0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p020c0.K0 f18153a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int[] f18154b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public java.lang.Object[] f18155c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public java.util.ArrayList f18156d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public java.util.HashMap f18157e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public p136q.w f18158f;
    public int g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f18159h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f18160i;
    public int j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f18161k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f18162l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f18163m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f18164n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f18165o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Q0.C0784s f18166p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final Q0.C0784s f18167q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Q0.C0784s f18168r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public p136q.w f18169s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f18170t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f18171u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f18172v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f18173w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public p136q.C2677v f18174x;

    public N0(p020c0.K0 k1) {
        this.f18153a = k1;
        int[] iArr = k1.f18134h;
        this.f18154b = iArr;
        java.lang.Object[] objArr = k1.j;
        this.f18155c = objArr;
        this.f18156d = k1.f18141p;
        this.f18157e = k1.f18142q;
        this.f18158f = k1.f18143r;
        int i3 = k1.f18135i;
        this.g = i3;
        this.f18159h = (iArr.length / 5) - i3;
        int i9 = k1.f18136k;
        this.f18161k = i9;
        this.f18162l = objArr.length - i9;
        this.f18163m = i3;
        this.f18166p = new Q0.C0784s();
        this.f18167q = new Q0.C0784s();
        this.f18168r = new Q0.C0784s();
        this.f18171u = i3;
        this.f18172v = -1;
    }

    public static int i(int i3, int i9, int i10, int i11) {
        return i3 > i9 ? -(((i11 - i10) - i3) + 1) : i3;
    }

    public static void z(p020c0.N0 n3) {
        int i3 = n3.f18172v;
        int iR = n3.r(i3);
        int[] iArr = n3.f18154b;
        int i9 = (iR * 5) + 1;
        int i10 = iArr[i9];
        if ((i10 & androidx.media3.common.C.BUFFER_FLAG_FIRST_SAMPLE) != 0) {
            return;
        }
        int i11 = (i10 & (-134217729)) | androidx.media3.common.C.BUFFER_FLAG_FIRST_SAMPLE;
        iArr[i9] = i11;
        if ((67108864 & i11) != 0) {
            return;
        }
        n3.T(n3.E(iArr, i3));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void A(p020c0.K0 k1, int i3) {
        if (this.f18164n <= 0) {
            p020c0.AbstractC1705t.a("Check failed");
        }
        boolean z6 = false;
        java.lang.Object[] objArr = 0;
        java.lang.Object[] objArr2 = 0;
        if (i3 == 0 && this.f18170t == 0 && this.f18153a.f18135i == 0) {
            int[] iArr = k1.f18134h;
            int i9 = iArr[(i3 * 5) + 3];
            int i10 = k1.f18135i;
            if (i9 == i10) {
                int[] iArr2 = this.f18154b;
                java.lang.Object[] objArr3 = this.f18155c;
                java.util.ArrayList arrayList = this.f18156d;
                java.util.HashMap map = this.f18157e;
                p136q.w wVar = this.f18158f;
                java.lang.Object[] objArr4 = k1.j;
                int i11 = k1.f18136k;
                java.util.HashMap map2 = k1.f18142q;
                p136q.w wVar2 = k1.f18143r;
                this.f18154b = iArr;
                this.f18155c = objArr4;
                this.f18156d = k1.f18141p;
                this.g = i10;
                this.f18159h = (iArr.length / 5) - i10;
                this.f18161k = i11;
                this.f18162l = objArr4.length - i11;
                this.f18163m = i10;
                this.f18157e = map2;
                this.f18158f = wVar2;
                k1.f18134h = iArr2;
                k1.f18135i = objArr2 == true ? 1 : 0;
                k1.j = objArr3;
                k1.f18136k = objArr == true ? 1 : 0;
                k1.f18141p = arrayList;
                k1.f18142q = map;
                k1.f18143r = wVar;
                return;
            }
        }
        p020c0.N0 n0O = k1.o();
        try {
            p020c0.AbstractC1703s.x(n0O, i3, this, true, true, false);
            boolean z9 = true;
        } finally {
            n0O.e(z6);
        }
    }

    public final void B(int i3) {
        p020c0.C1668a c1668a;
        int i9;
        p020c0.C1668a c1668a2;
        int i10;
        int i11;
        int i12 = this.f18159h;
        int i13 = this.g;
        if (i13 != i3) {
            if (!this.f18156d.isEmpty()) {
                int iO = o() - this.f18159h;
                if (i13 < i3) {
                    for (int iB = p020c0.M0.b(this.f18156d, i13, iO); iB < this.f18156d.size() && (i10 = (c1668a2 = (p020c0.C1668a) this.f18156d.get(iB)).f18215a) < 0 && (i11 = i10 + iO) < i3; iB++) {
                        c1668a2.f18215a = i11;
                    }
                } else {
                    for (int iB2 = p020c0.M0.b(this.f18156d, i3, iO); iB2 < this.f18156d.size() && (i9 = (c1668a = (p020c0.C1668a) this.f18156d.get(iB2)).f18215a) >= 0; iB2++) {
                        c1668a.f18215a = -(iO - i9);
                    }
                }
            }
            if (i12 > 0) {
                int[] iArr = this.f18154b;
                int i14 = i3 * 5;
                int i15 = i12 * 5;
                int i16 = i13 * 5;
                if (i3 < i13) {
                    p078i6.m.Y(i15 + i14, i14, i16, iArr, iArr);
                } else {
                    p078i6.m.Y(i16, i16 + i15, i14 + i15, iArr, iArr);
                }
            }
            if (i3 < i13) {
                i13 = i3 + i12;
            }
            int iO2 = o();
            if (i13 >= iO2) {
                p020c0.AbstractC1705t.a("Check failed");
            }
            while (i13 < iO2) {
                int i17 = (i13 * 5) + 2;
                int i18 = this.f18154b[i17];
                int iP = i18 > -2 ? i18 : (p() + i18) - (-2);
                if (iP >= i3) {
                    iP = -((p() - iP) - (-2));
                }
                if (iP != i18) {
                    this.f18154b[i17] = iP;
                }
                i13++;
                if (i13 == i3) {
                    i13 += i12;
                }
            }
        }
        this.g = i3;
    }

    public final void C(int i3, int i9) {
        int i10 = this.f18162l;
        int i11 = this.f18161k;
        int i12 = this.f18163m;
        if (i11 != i3) {
            java.lang.Object[] objArr = this.f18155c;
            if (i3 < i11) {
                java.lang.System.arraycopy(objArr, i3, objArr, i3 + i10, i11 - i3);
            } else {
                int i13 = i11 + i10;
                java.lang.System.arraycopy(objArr, i13, objArr, i11, (i3 + i10) - i13);
            }
        }
        int iMin = java.lang.Math.min(i9 + 1, p());
        if (i12 != iMin) {
            int length = this.f18155c.length - i10;
            if (iMin < i12) {
                int iR = r(iMin);
                int iR2 = r(i12);
                int i14 = this.g;
                while (iR < iR2) {
                    int i15 = (iR * 5) + 4;
                    int i16 = this.f18154b[i15];
                    if (!(i16 >= 0)) {
                        p020c0.AbstractC1705t.a("Unexpected anchor value, expected a positive anchor");
                    }
                    this.f18154b[i15] = -((length - i16) + 1);
                    iR++;
                    if (iR == i14) {
                        iR += this.f18159h;
                    }
                }
            } else {
                int iR3 = r(i12);
                int iR4 = r(iMin);
                while (iR3 < iR4) {
                    int i17 = (iR3 * 5) + 4;
                    int i18 = this.f18154b[i17];
                    if (!(i18 < 0)) {
                        p020c0.AbstractC1705t.a("Unexpected anchor value, expected a negative anchor");
                    }
                    this.f18154b[i17] = i18 + length + 1;
                    iR3++;
                    if (iR3 == this.g) {
                        iR3 += this.f18159h;
                    }
                }
            }
            this.f18163m = iMin;
        }
        this.f18161k = i3;
    }

    public final java.lang.Object D(int i3) {
        int iR = r(i3);
        int[] iArr = this.f18154b;
        if ((iArr[(iR * 5) + 1] & 1073741824) != 0) {
            return this.f18155c[h(g(iArr, iR))];
        }
        return null;
    }

    public final int E(int[] iArr, int i3) {
        int i9 = iArr[(r(i3) * 5) + 2];
        return i9 > -2 ? i9 : (p() + i9) - (-2);
    }

    public final java.lang.Object F(java.lang.Object obj) {
        if (this.f18164n > 0) {
            x(1, this.f18172v);
        }
        java.lang.Object[] objArr = this.f18155c;
        int i3 = this.f18160i;
        this.f18160i = i3 + 1;
        java.lang.Object obj2 = objArr[h(i3)];
        if (this.f18160i > this.j) {
            p020c0.AbstractC1705t.a("Writing to an invalid slot");
        }
        this.f18155c[h(this.f18160i - 1)] = obj;
        return obj2;
    }

    public final void G() {
        int i3;
        p136q.C2677v c2677v = this.f18174x;
        if (c2677v != null) {
            while (c2677v.f26431b != 0) {
                int iJ = p020c0.AbstractC1703s.J(c2677v);
                int iR = r(iJ);
                int iU = iJ + 1;
                int iU2 = u(iJ) + iJ;
                while (true) {
                    if (iU >= iU2) {
                        i3 = 0;
                        break;
                    } else {
                        if ((this.f18154b[(r(iU) * 5) + 1] & 201326592) != 0) {
                            i3 = 1;
                            break;
                        }
                        iU += u(iU);
                    }
                }
                int[] iArr = this.f18154b;
                int i9 = (iR * 5) + 1;
                int i10 = iArr[i9];
                if (((67108864 & i10) == 0 ? 0 : 1) != i3) {
                    iArr[i9] = (i3 << 26) | ((-67108865) & i10);
                    int iE = E(iArr, iJ);
                    if (iE >= 0) {
                        p020c0.AbstractC1703s.k(c2677v, iE);
                    }
                }
            }
        }
    }

    public final boolean H() {
        if (!(this.f18164n == 0)) {
            p020c0.AbstractC1705t.a("Cannot remove group while inserting");
        }
        int i3 = this.f18170t;
        int i9 = this.f18160i;
        int iG = g(this.f18154b, r(i3));
        int iL = L();
        O(this.f18172v);
        p136q.C2677v c2677v = this.f18174x;
        if (c2677v != null) {
            while (true) {
                int i10 = c2677v.f26431b;
                if (i10 == 0) {
                    break;
                }
                if (i10 == 0) {
                    p144r.a.e("IntList is empty.");
                    throw null;
                }
                if (c2677v.f26430a[0] < i3) {
                    break;
                }
                p020c0.AbstractC1703s.J(c2677v);
            }
        }
        boolean zI = I(i3, this.f18170t - i3);
        J(iG, this.f18160i - iG, i3 - 1);
        this.f18170t = i3;
        this.f18160i = i9;
        this.f18165o -= iL;
        return zI;
    }

    public final boolean I(int i3, int i9) {
        boolean z6 = false;
        if (i9 > 0) {
            java.util.ArrayList arrayList = this.f18156d;
            B(i3);
            if (!arrayList.isEmpty()) {
                java.util.HashMap map = this.f18157e;
                int i10 = i3 + i9;
                int iB = p020c0.M0.b(this.f18156d, i10, o() - this.f18159h);
                if (iB >= this.f18156d.size()) {
                    iB--;
                }
                int i11 = iB + 1;
                int i12 = 0;
                while (iB >= 0) {
                    p020c0.C1668a c1668a = (p020c0.C1668a) this.f18156d.get(iB);
                    int iC = c(c1668a);
                    if (iC < i3) {
                        break;
                    }
                    if (iC < i10) {
                        c1668a.f18215a = Integer.MIN_VALUE;
                        if (map != null) {
                        }
                        if (i12 == 0) {
                            i12 = iB + 1;
                        }
                        i11 = iB;
                    }
                    iB--;
                }
                z6 = i11 < i12;
                if (z6) {
                    this.f18156d.subList(i11, i12).clear();
                }
            }
            this.g = i3;
            this.f18159h += i9;
            int i13 = this.f18163m;
            if (i13 > i3) {
                this.f18163m = java.lang.Math.max(i3, i13 - i9);
            }
            int i14 = this.f18171u;
            if (i14 >= this.g) {
                this.f18171u = i14 - i9;
            }
            int i15 = this.f18172v;
            if (i15 >= 0 && (this.f18154b[(r(i15) * 5) + 1] & androidx.media3.common.C.BUFFER_FLAG_NOT_DEPENDED_ON) != 0) {
                T(i15);
            }
        }
        return z6;
    }

    public final void J(int i3, int i9, int i10) {
        if (i9 > 0) {
            int i11 = this.f18162l;
            int i12 = i3 + i9;
            C(i12, i10);
            this.f18161k = i3;
            this.f18162l = i11 + i9;
            java.util.Arrays.fill(this.f18155c, i3, i12, (java.lang.Object) null);
            int i13 = this.j;
            if (i13 >= i3) {
                this.j = i13 - i9;
            }
        }
    }

    public final java.lang.Object K(int i3, int i9, java.lang.Object obj) {
        int iN = N(this.f18154b, r(i3));
        int iG = g(this.f18154b, r(i3 + 1));
        int i10 = iN + i9;
        if (i10 < iN || i10 >= iG) {
            p020c0.AbstractC1705t.a("Write to an invalid slot index " + i9 + " for group " + i3);
        }
        int iH = h(i10);
        java.lang.Object[] objArr = this.f18155c;
        java.lang.Object obj2 = objArr[iH];
        objArr[iH] = obj;
        return obj2;
    }

    public final int L() {
        int iR = r(this.f18170t);
        int iA = p020c0.M0.a(this.f18154b, iR) + this.f18170t;
        this.f18170t = iA;
        this.f18160i = g(this.f18154b, r(iA));
        int i3 = this.f18154b[(iR * 5) + 1];
        if ((1073741824 & i3) != 0) {
            return 1;
        }
        return i3 & 67108863;
    }

    public final void M() {
        int i3 = this.f18171u;
        this.f18170t = i3;
        this.f18160i = g(this.f18154b, r(i3));
    }

    public final int N(int[] iArr, int i3) {
        if (i3 >= o()) {
            return this.f18155c.length - this.f18162l;
        }
        int iC = p020c0.M0.c(iArr, i3);
        return iC < 0 ? (this.f18155c.length - this.f18162l) + iC + 1 : iC;
    }

    public final p020c0.N O(int i3) {
        p020c0.C1668a c1668aR;
        java.util.HashMap map = this.f18157e;
        if (map == null || (c1668aR = R(i3)) == null) {
            return null;
        }
        return (p020c0.N) map.get(c1668aR);
    }

    public final void P() {
        if (this.f18164n != 0) {
            p020c0.AbstractC1705t.a("Key must be supplied when inserting");
        }
        p020c0.C1676e c1676e = p020c0.C1690l.f18284a;
        Q(0, c1676e, c1676e, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void Q(int i3, java.lang.Object obj, java.lang.Object obj2, boolean z6) {
        int i9;
        int i10 = this.f18172v;
        java.lang.Object[] objArr = this.f18164n > 0;
        this.f18168r.c(this.f18165o);
        p020c0.C1676e c1676e = p020c0.C1690l.f18284a;
        if (objArr == true) {
            int i11 = this.f18170t;
            int iG = g(this.f18154b, r(i11));
            w(1);
            this.f18160i = iG;
            this.j = iG;
            int iR = r(i11);
            int i12 = obj != c1676e ? 1 : 0;
            int i13 = (z6 || obj2 == c1676e) ? 0 : 1;
            int i14 = i(iG, this.f18161k, this.f18162l, this.f18155c.length);
            if (i14 >= 0 && this.f18163m < i11) {
                i14 = -(((this.f18155c.length - this.f18162l) - i14) + 1);
            }
            int[] iArr = this.f18154b;
            int i15 = this.f18172v;
            int i16 = iR * 5;
            iArr[i16] = i3;
            iArr[i16 + 1] = ((z6 ? 1 : 0) << 30) | (i12 << 29) | (i13 << 28);
            iArr[i16 + 2] = i15;
            iArr[i16 + 3] = 0;
            iArr[i16 + 4] = i14;
            int i17 = (z6 ? 1 : 0) + i12 + i13;
            if (i17 > 0) {
                x(i17, i11);
                java.lang.Object[] objArr2 = this.f18155c;
                int i18 = this.f18160i;
                if (z6) {
                    objArr2[i18] = obj2;
                    i18++;
                }
                if (i12 != 0) {
                    objArr2[i18] = obj;
                    i18++;
                }
                if (i13 != 0) {
                    objArr2[i18] = obj2;
                    i18++;
                }
                this.f18160i = i18;
            }
            this.f18165o = 0;
            i9 = i11 + 1;
            this.f18172v = i11;
            this.f18170t = i9;
            if (i10 >= 0) {
                O(i10);
            }
        } else {
            this.f18166p.c(i10);
            this.f18167q.c((o() - this.f18159h) - this.f18171u);
            int i19 = this.f18170t;
            int iR2 = r(i19);
            if (!kotlin.jvm.internal.m.a(obj2, c1676e)) {
                if (z6) {
                    U(this.f18170t, obj2);
                } else {
                    S(obj2);
                }
            }
            this.f18160i = N(this.f18154b, iR2);
            this.j = g(this.f18154b, r(this.f18170t + 1));
            int[] iArr2 = this.f18154b;
            int i20 = iR2 * 5;
            this.f18165o = iArr2[i20 + 1] & 67108863;
            this.f18172v = i19;
            this.f18170t = i19 + 1;
            i9 = i19 + iArr2[i20 + 3];
        }
        this.f18171u = i9;
    }

    public final p020c0.C1668a R(int i3) {
        java.util.ArrayList arrayList;
        int iE;
        if (i3 < 0 || i3 >= p() || (iE = p020c0.M0.e((arrayList = this.f18156d), i3, p())) < 0) {
            return null;
        }
        return (p020c0.C1668a) arrayList.get(iE);
    }

    public final void S(java.lang.Object obj) {
        int iR = r(this.f18170t);
        int i3 = (iR * 5) + 1;
        if ((this.f18154b[i3] & 268435456) == 0) {
            p020c0.AbstractC1705t.a("Updating the data of a group that was not created with a data slot");
        }
        java.lang.Object[] objArr = this.f18155c;
        int[] iArr = this.f18154b;
        objArr[h(java.lang.Integer.bitCount(iArr[i3] >> 29) + g(iArr, iR))] = obj;
    }

    public final void T(int i3) {
        if (i3 >= 0) {
            p136q.C2677v c2677v = this.f18174x;
            if (c2677v == null) {
                c2677v = new p136q.C2677v();
                this.f18174x = c2677v;
            }
            p020c0.AbstractC1703s.k(c2677v, i3);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public final void U(int i3, java.lang.Object obj) {
        boolean z6;
        int iR = r(i3);
        int[] iArr = this.f18154b;
        if (iR < iArr.length) {
            z6 = (iArr[(iR * 5) + 1] & 1073741824) != 0;
        }
        if (!z6) {
            p020c0.AbstractC1705t.a("Updating the node of a group at " + i3 + " that was not created with as a node group");
        }
        this.f18155c[h(g(this.f18154b, iR))] = obj;
    }

    public final void a(int i3) {
        boolean z6 = false;
        if (!(i3 >= 0)) {
            p020c0.AbstractC1705t.a("Cannot seek backwards");
        }
        if (!(this.f18164n <= 0)) {
            p020c0.AbstractC1693m0.b("Cannot call seek() while inserting");
        }
        if (i3 == 0) {
            return;
        }
        int i9 = this.f18170t + i3;
        if (i9 >= this.f18172v && i9 <= this.f18171u) {
            z6 = true;
        }
        if (!z6) {
            p020c0.AbstractC1705t.a("Cannot seek outside the current group (" + this.f18172v + '-' + this.f18171u + ')');
        }
        this.f18170t = i9;
        int iG = g(this.f18154b, r(i9));
        this.f18160i = iG;
        this.j = iG;
    }

    public final p020c0.C1668a b(int i3) {
        java.util.ArrayList arrayList = this.f18156d;
        int iE = p020c0.M0.e(arrayList, i3, p());
        if (iE >= 0) {
            return (p020c0.C1668a) arrayList.get(iE);
        }
        if (i3 > this.g) {
            i3 = -(p() - i3);
        }
        p020c0.C1668a c1668a = new p020c0.C1668a(i3);
        arrayList.add(-(iE + 1), c1668a);
        return c1668a;
    }

    public final int c(p020c0.C1668a c1668a) {
        int i3 = c1668a.f18215a;
        return i3 < 0 ? p() + i3 : i3;
    }

    public final void d() {
        int i3 = this.f18164n;
        this.f18164n = i3 + 1;
        if (i3 == 0) {
            this.f18167q.c((o() - this.f18159h) - this.f18171u);
        }
    }

    public final void e(boolean z6) {
        this.f18173w = true;
        if (z6 && this.f18166p.f8468b == 0) {
            B(p());
            C(this.f18155c.length - this.f18162l, this.g);
            int i3 = this.f18161k;
            java.util.Arrays.fill(this.f18155c, i3, this.f18162l + i3, (java.lang.Object) null);
            G();
        }
        int[] iArr = this.f18154b;
        int i9 = this.g;
        java.lang.Object[] objArr = this.f18155c;
        int i10 = this.f18161k;
        java.util.ArrayList arrayList = this.f18156d;
        java.util.HashMap map = this.f18157e;
        p136q.w wVar = this.f18158f;
        p020c0.K0 k1 = this.f18153a;
        k1.getClass();
        if (!k1.f18139n) {
            p020c0.AbstractC1693m0.a("Unexpected writer close()");
        }
        k1.f18139n = false;
        k1.f18134h = iArr;
        k1.f18135i = i9;
        k1.j = objArr;
        k1.f18136k = i10;
        k1.f18141p = arrayList;
        k1.f18142q = map;
        k1.f18143r = wVar;
    }

    public final int f(int i3) {
        return g(this.f18154b, r(i3));
    }

    public final int g(int[] iArr, int i3) {
        if (i3 >= o()) {
            return this.f18155c.length - this.f18162l;
        }
        int i9 = iArr[(i3 * 5) + 4];
        return i9 < 0 ? (this.f18155c.length - this.f18162l) + i9 + 1 : i9;
    }

    public final int h(int i3) {
        return (this.f18162l * (i3 < this.f18161k ? 0 : 1)) + i3;
    }

    public final void j() {
        p136q.D d4;
        boolean z6 = this.f18164n > 0;
        int i3 = this.f18170t;
        int i9 = this.f18171u;
        int i10 = this.f18172v;
        int iR = r(i10);
        int i11 = this.f18165o;
        int i12 = i3 - i10;
        int i13 = iR * 5;
        int i14 = i13 + 1;
        boolean z9 = (this.f18154b[i14] & 1073741824) != 0;
        Q0.C0784s c0784s = this.f18168r;
        if (z6) {
            p136q.w wVar = this.f18169s;
            if (wVar != null && (d4 = (p136q.D) wVar.b(i10)) != null) {
                java.lang.Object[] objArr = d4.f26303a;
                int i15 = d4.f26304b;
                for (int i16 = 0; i16 < i15; i16++) {
                    F(objArr[i16]);
                }
            }
            int[] iArr = this.f18154b;
            iArr[i13 + 3] = i12;
            p020c0.M0.d(iR, i11, iArr);
            int iB = c0784s.b();
            if (z9) {
                i11 = 1;
            }
            this.f18165o = iB + i11;
            int iE = E(this.f18154b, i10);
            this.f18172v = iE;
            int iP = iE < 0 ? p() : r(iE + 1);
            int iG = iP >= 0 ? g(this.f18154b, iP) : 0;
            this.f18160i = iG;
            this.j = iG;
            return;
        }
        if (i3 != i9) {
            p020c0.AbstractC1705t.a("Expected to be at the end of a group");
        }
        int[] iArr2 = this.f18154b;
        int i17 = i13 + 3;
        int i18 = iArr2[i17];
        int i19 = iArr2[i14] & 67108863;
        iArr2[i17] = i12;
        p020c0.M0.d(iR, i11, iArr2);
        int iB2 = this.f18166p.b();
        this.f18171u = (o() - this.f18159h) - this.f18167q.b();
        this.f18172v = iB2;
        int iE2 = E(this.f18154b, i10);
        int iB3 = c0784s.b();
        this.f18165o = iB3;
        if (iE2 == iB2) {
            this.f18165o = iB3 + (z9 ? 0 : i11 - i19);
            return;
        }
        int i20 = i12 - i18;
        int i21 = z9 ? 0 : i11 - i19;
        if (i20 != 0 || i21 != 0) {
            while (iE2 != 0 && iE2 != iB2 && (i21 != 0 || i20 != 0)) {
                int iR2 = r(iE2);
                if (i20 != 0) {
                    int[] iArr3 = this.f18154b;
                    int i22 = (iR2 * 5) + 3;
                    iArr3[i22] = iArr3[i22] + i20;
                }
                if (i21 != 0) {
                    int[] iArr4 = this.f18154b;
                    p020c0.M0.d(iR2, (iArr4[(iR2 * 5) + 1] & 67108863) + i21, iArr4);
                }
                int[] iArr5 = this.f18154b;
                if ((iArr5[(iR2 * 5) + 1] & 1073741824) != 0) {
                    i21 = 0;
                }
                iE2 = E(iArr5, iE2);
            }
        }
        this.f18165o += i21;
    }

    public final void k() {
        if (this.f18164n <= 0) {
            p020c0.AbstractC1693m0.b("Unbalanced begin/end insert");
        }
        int i3 = this.f18164n - 1;
        this.f18164n = i3;
        if (i3 == 0) {
            if (this.f18168r.f8468b != this.f18166p.f8468b) {
                p020c0.AbstractC1705t.a("startGroup/endGroup mismatch while inserting");
            }
            this.f18171u = (o() - this.f18159h) - this.f18167q.b();
        }
    }

    public final void l(int i3) {
        boolean z6 = false;
        if (!(this.f18164n <= 0)) {
            p020c0.AbstractC1705t.a("Cannot call ensureStarted() while inserting");
        }
        int i9 = this.f18172v;
        if (i9 != i3) {
            if (i3 >= i9 && i3 < this.f18171u) {
                z6 = true;
            }
            if (!z6) {
                p020c0.AbstractC1705t.a("Started group at " + i3 + " must be a subgroup of the group at " + i9);
            }
            int i10 = this.f18170t;
            int i11 = this.f18160i;
            int i12 = this.j;
            this.f18170t = i3;
            P();
            this.f18170t = i10;
            this.f18160i = i11;
            this.j = i12;
        }
    }

    public final void m(int i3, int i9, int i10) {
        if (i3 >= this.g) {
            i3 = -((p() - i3) + 2);
        }
        while (i10 < i9) {
            this.f18154b[(r(i10) * 5) + 2] = i3;
            int i11 = this.f18154b[(r(i10) * 5) + 3] + i10;
            m(i10, i11, i10 + 1);
            i10 = i11;
        }
    }

    public final void n(int i3, p194x6.m mVar) {
        int i9;
        int i10;
        int i11;
        int i12;
        int iE = E(this.f18154b, i3);
        int iP = p();
        int iU = u(i3) + i3;
        int i13 = i3;
        p136q.x xVar = null;
        p136q.C2677v c2677v = null;
        while (i13 < iU) {
            int iF = f(i13);
            int i14 = i13 + 1;
            int iF2 = f(i14);
            while (iF < iF2) {
                java.lang.Object obj = this.f18155c[h(iF)];
                if (!(obj instanceof p020c0.D0) || (i12 = ((p020c0.D0) obj).f18105b) < 0) {
                    i11 = iE;
                    mVar.invoke(java.lang.Integer.valueOf(iF), obj);
                } else {
                    int iU2 = u(i13) + i13;
                    int i15 = i14;
                    int i16 = 0;
                    while (i15 < iU2 && i16 < i12) {
                        int iR = r(i15);
                        int i17 = iE;
                        int[] iArr = this.f18154b;
                        int i18 = iR * 5;
                        i15 = iArr[i18 + 3] + i15;
                        if (i15 < iU2 && (iArr[i18 + 1] & androidx.media3.common.C.BUFFER_FLAG_LAST_SAMPLE) == 0) {
                            i16++;
                        }
                        iE = i17;
                    }
                    i11 = iE;
                    if (xVar == null) {
                        int[] iArr2 = p136q.AbstractC2670n.f26403a;
                        xVar = new p136q.x();
                    }
                    if (c2677v == null) {
                        c2677v = new p136q.C2677v();
                    }
                    xVar.a(i15);
                    c2677v.a(i15);
                    c2677v.a(iF);
                }
                iF++;
                iE = i11;
            }
            int i19 = iE;
            iE = i14 < iP ? E(this.f18154b, i14) : -1;
            if (iE != i13) {
                int iE2 = i19;
                while (true) {
                    if (c2677v == null || xVar == null || !xVar.e(i13)) {
                        i9 = iP;
                    } else {
                        int i20 = c2677v.f26431b;
                        int i21 = i20 / 2;
                        int i22 = 0;
                        int i23 = 0;
                        while (i22 < i21) {
                            int i24 = i22 * 2;
                            int i25 = iP;
                            int iC = c2677v.c(i24);
                            if (iC == i13) {
                                int iC2 = c2677v.c(i24 + 1);
                                mVar.invoke(java.lang.Integer.valueOf(iC2), this.f18155c[h(iC2)]);
                            } else if (i24 != i23) {
                                int i26 = i23 + 1;
                                c2677v.e(i23, iC);
                                i23 += 2;
                                c2677v.e(i26, c2677v.c(i24 + 1));
                            } else {
                                i23 += 2;
                            }
                            i22++;
                            mVar = mVar;
                            iP = i25;
                        }
                        i9 = iP;
                        if (i23 != i20) {
                            if (i23 < 0 || i23 > (i10 = c2677v.f26431b) || i20 < 0 || i20 > i10) {
                                p144r.a.d("Index must be between 0 and size");
                                throw null;
                            }
                            if (i20 < i23) {
                                p144r.a.c("The end index must be < start index");
                                throw null;
                            }
                            if (i20 != i23) {
                                if (i20 < i10) {
                                    int[] iArr3 = c2677v.f26430a;
                                    p078i6.m.Y(i23, i20, i10, iArr3, iArr3);
                                }
                                c2677v.f26431b -= i20 - i23;
                            }
                        }
                    }
                    if (i13 == i3 || iE2 == iE) {
                        break;
                    }
                    i13 = iE2;
                    iP = i9;
                    iE2 = E(this.f18154b, iE2);
                    mVar = mVar;
                }
            } else {
                i9 = iP;
            }
            i13 = i14;
            iP = i9;
        }
    }

    public final int o() {
        return this.f18154b.length / 5;
    }

    public final int p() {
        return o() - this.f18159h;
    }

    public final java.lang.Object q(int i3) {
        int iR = r(i3);
        int[] iArr = this.f18154b;
        int i9 = (iR * 5) + 1;
        if ((iArr[i9] & 268435456) == 0) {
            return p020c0.C1690l.f18284a;
        }
        return this.f18155c[java.lang.Integer.bitCount(iArr[i9] >> 29) + g(iArr, iR)];
    }

    public final int r(int i3) {
        return (this.f18159h * (i3 < this.g ? 0 : 1)) + i3;
    }

    public final int s(int i3) {
        return this.f18154b[r(i3) * 5];
    }

    public final java.lang.Object t(int i3) {
        int iR = r(i3);
        int[] iArr = this.f18154b;
        int i9 = iR * 5;
        int i10 = iArr[i9 + 1];
        if ((536870912 & i10) == 0) {
            return null;
        }
        return this.f18155c[java.lang.Integer.bitCount(i10 >> 30) + iArr[i9 + 4]];
    }

    public final java.lang.String toString() {
        return "SlotWriter(current = " + this.f18170t + " end=" + this.f18171u + " size = " + p() + " gap=" + this.g + '-' + (this.g + this.f18159h) + ')';
    }

    public final int u(int i3) {
        return p020c0.M0.a(this.f18154b, r(i3));
    }

    public final boolean v(int i3, int i9) {
        int iO;
        int iU;
        if (i9 == this.f18172v) {
            iO = this.f18171u;
        } else {
            Q0.C0784s c0784s = this.f18166p;
            if (i9 > c0784s.a(0)) {
                iU = u(i9);
            } else {
                int[] iArr = c0784s.f8467a;
                int iMin = java.lang.Math.min(iArr.length, c0784s.f8468b);
                int i10 = 0;
                while (true) {
                    if (i10 >= iMin) {
                        i10 = -1;
                        break;
                    }
                    if (iArr[i10] == i9) {
                        break;
                    }
                    i10++;
                }
                if (i10 < 0) {
                    iU = u(i9);
                } else {
                    iO = (o() - this.f18159h) - this.f18167q.f8467a[i10];
                }
            }
            iO = iU + i9;
        }
        return i3 > i9 && i3 < iO;
    }

    public final void w(int i3) {
        if (i3 > 0) {
            int i9 = this.f18170t;
            B(i9);
            int i10 = this.g;
            int i11 = this.f18159h;
            int[] iArr = this.f18154b;
            int length = iArr.length / 5;
            int i12 = length - i11;
            if (i11 < i3) {
                int iMax = java.lang.Math.max(java.lang.Math.max(length * 2, i12 + i3), 32);
                int[] iArr2 = new int[iMax * 5];
                int i13 = iMax - i12;
                p078i6.m.Y(0, 0, i10 * 5, iArr, iArr2);
                p078i6.m.Y((i10 + i13) * 5, (i11 + i10) * 5, length * 5, iArr, iArr2);
                this.f18154b = iArr2;
                i11 = i13;
            }
            int i14 = this.f18171u;
            if (i14 >= i10) {
                this.f18171u = i14 + i3;
            }
            int i15 = i10 + i3;
            this.g = i15;
            this.f18159h = i11 - i3;
            int i16 = i(i12 > 0 ? f(i9 + i3) : 0, this.f18163m >= i10 ? this.f18161k : 0, this.f18162l, this.f18155c.length);
            for (int i17 = i10; i17 < i15; i17++) {
                this.f18154b[(i17 * 5) + 4] = i16;
            }
            int i18 = this.f18163m;
            if (i18 >= i10) {
                this.f18163m = i18 + i3;
            }
        }
    }

    public final void x(int i3, int i9) {
        if (i3 > 0) {
            C(this.f18160i, i9);
            int i10 = this.f18161k;
            int i11 = this.f18162l;
            if (i11 < i3) {
                java.lang.Object[] objArr = this.f18155c;
                int length = objArr.length;
                int i12 = length - i11;
                int iMax = java.lang.Math.max(java.lang.Math.max(length * 2, i12 + i3), 32);
                java.lang.Object[] objArr2 = new java.lang.Object[iMax];
                for (int i13 = 0; i13 < iMax; i13++) {
                    objArr2[i13] = null;
                }
                int i14 = iMax - i12;
                int i15 = i11 + i10;
                java.lang.System.arraycopy(objArr, 0, objArr2, 0, i10);
                java.lang.System.arraycopy(objArr, i15, objArr2, i10 + i14, length - i15);
                this.f18155c = objArr2;
                i11 = i14;
            }
            int i16 = this.j;
            if (i16 >= i10) {
                this.j = i16 + i3;
            }
            this.f18161k = i10 + i3;
            this.f18162l = i11 - i3;
        }
    }

    public final boolean y(int i3) {
        return (this.f18154b[(r(i3) * 5) + 1] & 1073741824) != 0;
    }
}
