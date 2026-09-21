package p076i4;

/* JADX INFO: loaded from: classes.dex */
public final class D extends java.util.AbstractMap implements java.io.Serializable {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final java.lang.Object f22779q = new java.lang.Object();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public transient java.lang.Object f22780h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public transient int[] f22781i;
    public transient java.lang.Object[] j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public transient java.lang.Object[] f22782k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public transient int f22783l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public transient int f22784m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public transient p076i4.B f22785n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public transient p076i4.B f22786o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public transient p076i4.C2218s f22787p;

    public static p076i4.D a() {
        p076i4.D d4 = new p076i4.D();
        d4.f22783l = com.google.crypto.tink.shaded.protobuf.q0.p(3, 1);
        return d4;
    }

    public static p076i4.D b(int i3) {
        p076i4.D d4 = new p076i4.D();
        com.google.android.gms.internal.play_billing.AbstractC1864o0.M(i3 >= 0, "Expected size must be >= 0");
        d4.f22783l = com.google.crypto.tink.shaded.protobuf.q0.p(i3, 1);
        return d4;
    }

    public final java.util.Map c() {
        java.lang.Object obj = this.f22780h;
        if (obj instanceof java.util.Map) {
            return (java.util.Map) obj;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        if (h()) {
            return;
        }
        this.f22783l += 32;
        java.util.Map mapC = c();
        if (mapC != null) {
            this.f22783l = com.google.crypto.tink.shaded.protobuf.q0.p(size(), 3);
            mapC.clear();
            this.f22780h = null;
            this.f22784m = 0;
            return;
        }
        java.util.Arrays.fill(k(), 0, this.f22784m, (java.lang.Object) null);
        java.util.Arrays.fill(l(), 0, this.f22784m, (java.lang.Object) null);
        java.lang.Object obj = this.f22780h;
        java.util.Objects.requireNonNull(obj);
        if (obj instanceof byte[]) {
            java.util.Arrays.fill((byte[]) obj, (byte) 0);
        } else if (obj instanceof short[]) {
            java.util.Arrays.fill((short[]) obj, (short) 0);
        } else {
            java.util.Arrays.fill((int[]) obj, 0);
        }
        java.util.Arrays.fill(j(), 0, this.f22784m, 0);
        this.f22784m = 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(java.lang.Object obj) {
        java.util.Map mapC = c();
        if (mapC != null) {
            return mapC.containsKey(obj);
        }
        return e(obj) != -1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsValue(java.lang.Object obj) {
        java.util.Map mapC = c();
        if (mapC != null) {
            return mapC.containsValue(obj);
        }
        for (int i3 = 0; i3 < this.f22784m; i3++) {
            if (com.google.android.gms.internal.play_billing.AbstractC1853k0.m(obj, l()[i3])) {
                return true;
            }
        }
        return false;
    }

    public final int d() {
        return (1 << (this.f22783l & 31)) - 1;
    }

    public final int e(java.lang.Object obj) {
        if (h()) {
            return -1;
        }
        int iW = p076i4.AbstractC2230y.w(obj);
        int iD = d();
        java.lang.Object obj2 = this.f22780h;
        java.util.Objects.requireNonNull(obj2);
        int iX = p076i4.AbstractC2230y.x(iW & iD, obj2);
        if (iX == 0) {
            return -1;
        }
        int i3 = ~iD;
        int i9 = iW & i3;
        do {
            int i10 = iX - 1;
            int i11 = j()[i10];
            if ((i11 & i3) == i9 && com.google.android.gms.internal.play_billing.AbstractC1853k0.m(obj, k()[i10])) {
                return i10;
            }
            iX = i11 & iD;
        } while (iX != 0);
        return -1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final java.util.Set entrySet() {
        p076i4.B b9 = this.f22786o;
        if (b9 != null) {
            return b9;
        }
        p076i4.B b10 = new p076i4.B(this, 0);
        this.f22786o = b10;
        return b10;
    }

    public final void g(int i3, int i9) {
        java.lang.Object obj = this.f22780h;
        java.util.Objects.requireNonNull(obj);
        int[] iArrJ = j();
        java.lang.Object[] objArrK = k();
        java.lang.Object[] objArrL = l();
        int size = size();
        int i10 = size - 1;
        if (i3 >= i10) {
            objArrK[i3] = null;
            objArrL[i3] = null;
            iArrJ[i3] = 0;
            return;
        }
        java.lang.Object obj2 = objArrK[i10];
        objArrK[i3] = obj2;
        objArrL[i3] = objArrL[i10];
        objArrK[i10] = null;
        objArrL[i10] = null;
        iArrJ[i3] = iArrJ[i10];
        iArrJ[i10] = 0;
        int iW = p076i4.AbstractC2230y.w(obj2) & i9;
        int iX = p076i4.AbstractC2230y.x(iW, obj);
        if (iX == size) {
            p076i4.AbstractC2230y.y(iW, i3 + 1, obj);
            return;
        }
        while (true) {
            int i11 = iX - 1;
            int i12 = iArrJ[i11];
            int i13 = i12 & i9;
            if (i13 == size) {
                iArrJ[i11] = p076i4.AbstractC2230y.p(i12, i3 + 1, i9);
                return;
            }
            iX = i13;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final java.lang.Object get(java.lang.Object obj) {
        java.util.Map mapC = c();
        if (mapC != null) {
            return mapC.get(obj);
        }
        int iE = e(obj);
        if (iE == -1) {
            return null;
        }
        return l()[iE];
    }

    public final boolean h() {
        return this.f22780h == null;
    }

    public final java.lang.Object i(java.lang.Object obj) {
        boolean zH = h();
        java.lang.Object obj2 = f22779q;
        if (!zH) {
            int iD = d();
            java.lang.Object obj3 = this.f22780h;
            java.util.Objects.requireNonNull(obj3);
            int iS = p076i4.AbstractC2230y.s(obj, null, iD, obj3, j(), k(), null);
            if (iS != -1) {
                java.lang.Object obj4 = l()[iS];
                g(iS, iD);
                this.f22784m--;
                this.f22783l += 32;
                return obj4;
            }
        }
        return obj2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean isEmpty() {
        return size() == 0;
    }

    public final int[] j() {
        int[] iArr = this.f22781i;
        java.util.Objects.requireNonNull(iArr);
        return iArr;
    }

    public final java.lang.Object[] k() {
        java.lang.Object[] objArr = this.j;
        java.util.Objects.requireNonNull(objArr);
        return objArr;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final java.util.Set keySet() {
        p076i4.B b9 = this.f22785n;
        if (b9 != null) {
            return b9;
        }
        p076i4.B b10 = new p076i4.B(this, 1);
        this.f22785n = b10;
        return b10;
    }

    public final java.lang.Object[] l() {
        java.lang.Object[] objArr = this.f22782k;
        java.util.Objects.requireNonNull(objArr);
        return objArr;
    }

    public final int m(int i3, int i9, int i10, int i11) {
        java.lang.Object objG = p076i4.AbstractC2230y.g(i9);
        int i12 = i9 - 1;
        if (i11 != 0) {
            p076i4.AbstractC2230y.y(i10 & i12, i11 + 1, objG);
        }
        java.lang.Object obj = this.f22780h;
        java.util.Objects.requireNonNull(obj);
        int[] iArrJ = j();
        for (int i13 = 0; i13 <= i3; i13++) {
            int iX = p076i4.AbstractC2230y.x(i13, obj);
            while (iX != 0) {
                int i14 = iX - 1;
                int i15 = iArrJ[i14];
                int i16 = ((~i3) & i15) | i13;
                int i17 = i16 & i12;
                int iX2 = p076i4.AbstractC2230y.x(i17, objG);
                p076i4.AbstractC2230y.y(i17, iX, objG);
                iArrJ[i14] = p076i4.AbstractC2230y.p(i16, iX2, i12);
                iX = i15 & i3;
            }
        }
        this.f22780h = objG;
        this.f22783l = p076i4.AbstractC2230y.p(this.f22783l, 32 - java.lang.Integer.numberOfLeadingZeros(i12), 31);
        return i12;
    }

    /* JADX WARN: Code duplicated, block: B:37:0x00de  */
    /* JADX WARN: Code duplicated, block: B:55:0x00f4 A[SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x00f1 -> B:34:0x00d9). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:55:0x00f4
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // java.util.AbstractMap, java.util.Map
    public final java.lang.Object put(java.lang.Object r20, java.lang.Object r21) {
        /*
            Method dump skipped, instruction units count: 380
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p076i4.D.put(java.lang.Object, java.lang.Object):java.lang.Object");
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final java.lang.Object remove(java.lang.Object obj) {
        java.util.Map mapC = c();
        if (mapC != null) {
            return mapC.remove(obj);
        }
        java.lang.Object objI = i(obj);
        if (objI == f22779q) {
            return null;
        }
        return objI;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        java.util.Map mapC = c();
        return mapC != null ? mapC.size() : this.f22784m;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final java.util.Collection values() {
        p076i4.C2218s c2218s = this.f22787p;
        if (c2218s != null) {
            return c2218s;
        }
        p076i4.C2218s c2218s2 = new p076i4.C2218s(2, this);
        this.f22787p = c2218s2;
        return c2218s2;
    }
}
