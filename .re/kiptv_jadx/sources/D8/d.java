package D8;

/* JADX INFO: loaded from: classes4.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final M8.C0682j f2517a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f2519c;
    public int g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f2523h;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f2518b = androidx.media3.common.util.Log.LOG_LEVEL_OFF;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f2520d = 4096;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public D8.C0273b[] f2521e = new D8.C0273b[8];

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f2522f = 7;

    public d(M8.C0682j c0682j) {
        this.f2517a = c0682j;
    }

    public final void a(int i3) {
        int i9;
        if (i3 > 0) {
            int length = this.f2521e.length - 1;
            int i10 = 0;
            while (true) {
                i9 = this.f2522f;
                if (length < i9 || i3 <= 0) {
                    break;
                }
                D8.C0273b c0273b = this.f2521e[length];
                kotlin.jvm.internal.m.b(c0273b);
                i3 -= c0273b.f2510c;
                int i11 = this.f2523h;
                D8.C0273b c0273b2 = this.f2521e[length];
                kotlin.jvm.internal.m.b(c0273b2);
                this.f2523h = i11 - c0273b2.f2510c;
                this.g--;
                i10++;
                length--;
            }
            D8.C0273b[] c0273bArr = this.f2521e;
            int i12 = i9 + 1;
            java.lang.System.arraycopy(c0273bArr, i12, c0273bArr, i12 + i10, this.g);
            D8.C0273b[] c0273bArr2 = this.f2521e;
            int i13 = this.f2522f + 1;
            java.util.Arrays.fill(c0273bArr2, i13, i13 + i10, (java.lang.Object) null);
            this.f2522f += i10;
        }
    }

    public final void b(D8.C0273b c0273b) {
        int i3 = this.f2520d;
        int i9 = c0273b.f2510c;
        if (i9 > i3) {
            D8.C0273b[] c0273bArr = this.f2521e;
            p078i6.m.h0(c0273bArr, null, 0, c0273bArr.length);
            this.f2522f = this.f2521e.length - 1;
            this.g = 0;
            this.f2523h = 0;
            return;
        }
        a((this.f2523h + i9) - i3);
        int i10 = this.g + 1;
        D8.C0273b[] c0273bArr2 = this.f2521e;
        if (i10 > c0273bArr2.length) {
            D8.C0273b[] c0273bArr3 = new D8.C0273b[c0273bArr2.length * 2];
            java.lang.System.arraycopy(c0273bArr2, 0, c0273bArr3, c0273bArr2.length, c0273bArr2.length);
            this.f2522f = this.f2521e.length - 1;
            this.f2521e = c0273bArr3;
        }
        int i11 = this.f2522f;
        this.f2522f = i11 - 1;
        this.f2521e[i11] = c0273b;
        this.g++;
        this.f2523h += i9;
    }

    public final void c(M8.C0685m data) throws java.io.EOFException {
        kotlin.jvm.internal.m.e(data, "data");
        M8.C0682j c0682j = this.f2517a;
        int[] iArr = D8.y.f2611a;
        int iD = data.d();
        long j = 0;
        for (int i3 = 0; i3 < iD; i3++) {
            byte bI = data.i(i3);
            byte[] bArr = x8.b.f31716a;
            j += (long) D8.y.f2612b[bI & 255];
        }
        if (((int) ((j + ((long) 7)) >> 3)) >= data.d()) {
            e(data.d(), 127, 0);
            c0682j.X(data);
            return;
        }
        M8.C0682j c0682j2 = new M8.C0682j();
        int[] iArr2 = D8.y.f2611a;
        int iD2 = data.d();
        long j9 = 0;
        int i9 = 0;
        for (int i10 = 0; i10 < iD2; i10++) {
            byte bI2 = data.i(i10);
            byte[] bArr2 = x8.b.f31716a;
            int i11 = bI2 & 255;
            int i12 = D8.y.f2611a[i11];
            byte b9 = D8.y.f2612b[i11];
            j9 = (j9 << b9) | ((long) i12);
            i9 += b9;
            while (i9 >= 8) {
                i9 -= 8;
                c0682j2.Z((int) (j9 >> i9));
            }
        }
        if (i9 > 0) {
            c0682j2.Z((int) ((255 >>> i9) | (j9 << (8 - i9))));
        }
        M8.C0685m c0685mZ = c0682j2.z(c0682j2.f7260i);
        e(c0685mZ.d(), 127, 128);
        c0682j.X(c0685mZ);
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0069  */
    public final void d(java.util.ArrayList arrayList) throws java.io.EOFException {
        int length;
        int length2;
        if (this.f2519c) {
            int i3 = this.f2518b;
            if (i3 < this.f2520d) {
                e(i3, 31, 32);
            }
            this.f2519c = false;
            this.f2518b = androidx.media3.common.util.Log.LOG_LEVEL_OFF;
            e(this.f2520d, 31, 32);
        }
        int size = arrayList.size();
        for (int i9 = 0; i9 < size; i9++) {
            D8.C0273b c0273b = (D8.C0273b) arrayList.get(i9);
            M8.C0685m c0685mP = c0273b.f2508a.p();
            java.lang.Integer num = (java.lang.Integer) D8.e.f2525b.get(c0685mP);
            M8.C0685m c0685m = c0273b.f2509b;
            if (num != null) {
                int iIntValue = num.intValue();
                length2 = iIntValue + 1;
                if (2 > length2 || length2 >= 8) {
                    length = length2;
                    length2 = -1;
                } else {
                    D8.C0273b[] c0273bArr = D8.e.f2524a;
                    if (kotlin.jvm.internal.m.a(c0273bArr[iIntValue].f2509b, c0685m)) {
                        length = length2;
                    } else if (kotlin.jvm.internal.m.a(c0273bArr[length2].f2509b, c0685m)) {
                        length2 = iIntValue + 2;
                        length = length2;
                    } else {
                        length = length2;
                        length2 = -1;
                    }
                }
            } else {
                length = -1;
                length2 = -1;
            }
            if (length2 == -1) {
                int length3 = this.f2521e.length;
                for (int i10 = this.f2522f + 1; i10 < length3; i10++) {
                    D8.C0273b c0273b2 = this.f2521e[i10];
                    kotlin.jvm.internal.m.b(c0273b2);
                    if (kotlin.jvm.internal.m.a(c0273b2.f2508a, c0685mP)) {
                        D8.C0273b c0273b3 = this.f2521e[i10];
                        kotlin.jvm.internal.m.b(c0273b3);
                        if (kotlin.jvm.internal.m.a(c0273b3.f2509b, c0685m)) {
                            length2 = D8.e.f2524a.length + (i10 - this.f2522f);
                            break;
                        } else if (length == -1) {
                            length = (i10 - this.f2522f) + D8.e.f2524a.length;
                        }
                    }
                }
            }
            if (length2 != -1) {
                e(length2, 127, 128);
            } else if (length == -1) {
                this.f2517a.Z(64);
                c(c0685mP);
                c(c0685m);
                b(c0273b);
            } else {
                M8.C0685m prefix = D8.C0273b.f2503d;
                c0685mP.getClass();
                kotlin.jvm.internal.m.e(prefix, "prefix");
                if (!c0685mP.m(0, prefix, prefix.d()) || kotlin.jvm.internal.m.a(D8.C0273b.f2507i, c0685mP)) {
                    e(length, 63, 64);
                    c(c0685m);
                    b(c0273b);
                } else {
                    e(length, 15, 0);
                    c(c0685m);
                }
            }
        }
    }

    public final void e(int i3, int i9, int i10) {
        M8.C0682j c0682j = this.f2517a;
        if (i3 < i9) {
            c0682j.Z(i3 | i10);
            return;
        }
        c0682j.Z(i10 | i9);
        int i11 = i3 - i9;
        while (i11 >= 128) {
            c0682j.Z(128 | (i11 & 127));
            i11 >>>= 7;
        }
        c0682j.Z(i11);
    }
}
