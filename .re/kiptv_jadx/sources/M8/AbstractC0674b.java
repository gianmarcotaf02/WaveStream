package M8;

/* JADX INFO: renamed from: M8.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC0674b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final M8.C0680h f7239a = new M8.C0680h();

    public static final boolean a(byte[] a2, int i3, int i9, byte[] b9, int i10) {
        kotlin.jvm.internal.m.e(a2, "a");
        kotlin.jvm.internal.m.e(b9, "b");
        for (int i11 = 0; i11 < i10; i11++) {
            if (a2[i11 + i3] != b9[i11 + i9]) {
                return false;
            }
        }
        return true;
    }

    public static final M8.D b(M8.I i3) {
        kotlin.jvm.internal.m.e(i3, "<this>");
        return new M8.D(i3);
    }

    public static final M8.E c(M8.K k9) {
        kotlin.jvm.internal.m.e(k9, "<this>");
        return new M8.E(k9);
    }

    public static void d(long j, M8.C0682j c0682j, int i3, java.util.ArrayList arrayList, int i9, int i10, java.util.ArrayList arrayList2) {
        int i11;
        int i12;
        java.util.ArrayList arrayList3;
        long j9;
        int i13;
        int i14 = i3;
        java.util.ArrayList arrayList4 = arrayList;
        java.util.ArrayList arrayList5 = arrayList2;
        if (i9 >= i10) {
            throw new java.lang.IllegalArgumentException("Failed requirement.");
        }
        for (int i15 = i9; i15 < i10; i15++) {
            if (((M8.C0685m) arrayList4.get(i15)).d() < i14) {
                throw new java.lang.IllegalArgumentException("Failed requirement.");
            }
        }
        M8.C0685m c0685m = (M8.C0685m) arrayList.get(i9);
        M8.C0685m c0685m2 = (M8.C0685m) arrayList4.get(i10 - 1);
        if (i14 == c0685m.d()) {
            int iIntValue = ((java.lang.Number) arrayList5.get(i9)).intValue();
            int i16 = i9 + 1;
            M8.C0685m c0685m3 = (M8.C0685m) arrayList4.get(i16);
            i11 = i16;
            i12 = iIntValue;
            c0685m = c0685m3;
        } else {
            i11 = i9;
            i12 = -1;
        }
        if (c0685m.i(i14) == c0685m2.i(i14)) {
            int iMin = java.lang.Math.min(c0685m.d(), c0685m2.d());
            int i17 = 0;
            for (int i18 = i14; i18 < iMin && c0685m.i(i18) == c0685m2.i(i18); i18++) {
                i17++;
            }
            long j10 = 4;
            long j11 = (c0682j.f7260i / j10) + j + ((long) 2) + ((long) i17) + 1;
            c0682j.n(-i17);
            c0682j.n(i12);
            int i19 = i14 + i17;
            while (i14 < i19) {
                c0682j.n(c0685m.i(i14) & 255);
                i14++;
            }
            if (i11 + 1 == i10) {
                if (i19 != ((M8.C0685m) arrayList4.get(i11)).d()) {
                    throw new java.lang.IllegalStateException("Check failed.");
                }
                c0682j.n(((java.lang.Number) arrayList5.get(i11)).intValue());
                return;
            } else {
                M8.C0682j c0682j2 = new M8.C0682j();
                c0682j.n(((int) ((c0682j2.f7260i / j10) + j11)) * (-1));
                d(j11, c0682j2, i19, arrayList4, i11, i10, arrayList5);
                c0682j.M(c0682j2);
                return;
            }
        }
        int i20 = 1;
        for (int i21 = i11 + 1; i21 < i10; i21++) {
            if (((M8.C0685m) arrayList4.get(i21 - 1)).i(i14) != ((M8.C0685m) arrayList4.get(i21)).i(i14)) {
                i20++;
            }
        }
        long j12 = 4;
        long j13 = (c0682j.f7260i / j12) + j + ((long) 2) + ((long) (i20 * 2));
        c0682j.n(i20);
        c0682j.n(i12);
        for (int i22 = i11; i22 < i10; i22++) {
            int i23 = ((M8.C0685m) arrayList4.get(i22)).i(i14);
            if (i22 == i11 || i23 != ((M8.C0685m) arrayList4.get(i22 - 1)).i(i14)) {
                c0682j.n(i23 & 255);
            }
        }
        M8.C0682j c0682j3 = new M8.C0682j();
        int i24 = i11;
        while (i24 < i10) {
            byte bI = ((M8.C0685m) arrayList4.get(i24)).i(i14);
            int i25 = i24 + 1;
            int i26 = i25;
            while (true) {
                if (i26 >= i10) {
                    i26 = i10;
                    break;
                } else if (bI != ((M8.C0685m) arrayList4.get(i26)).i(i14)) {
                    break;
                } else {
                    i26++;
                }
            }
            if (i25 == i26 && i14 + 1 == ((M8.C0685m) arrayList4.get(i24)).d()) {
                c0682j.n(((java.lang.Number) arrayList5.get(i24)).intValue());
                arrayList3 = arrayList5;
                j9 = j13;
                i13 = i26;
            } else {
                c0682j.n(((int) ((c0682j3.f7260i / j12) + j13)) * (-1));
                arrayList3 = arrayList5;
                j9 = j13;
                i13 = i26;
                d(j9, c0682j3, i14 + 1, arrayList, i24, i13, arrayList3);
                arrayList4 = arrayList;
            }
            j13 = j9;
            i24 = i13;
            arrayList5 = arrayList3;
        }
        c0682j.M(c0682j3);
    }

    public static final void e(long j, long j9, long j10) {
        if ((j9 | j10) < 0 || j9 > j || j - j9 < j10) {
            java.lang.StringBuilder sbU = p121o0.p.u(j, "size=", " offset=");
            sbU.append(j9);
            sbU.append(" byteCount=");
            sbU.append(j10);
            throw new java.lang.ArrayIndexOutOfBoundsException(sbU.toString());
        }
    }

    public static final boolean f(java.lang.AssertionError assertionError) {
        java.util.logging.Logger logger = M8.y.f7290a;
        if (assertionError.getCause() != null) {
            java.lang.String message = assertionError.getMessage();
            if (message != null ? O7.q.B0(message, "getsockname failed", false) : false) {
                return true;
            }
        }
        return false;
    }

    public static M8.z g(M8.C0685m... c0685mArr) {
        if (c0685mArr.length == 0) {
            return new M8.z(new M8.C0685m[0], new int[]{0, -1});
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(new p078i6.k(c0685mArr, false));
        p078i6.t.K0(arrayList);
        int size = arrayList.size();
        java.util.ArrayList arrayList2 = new java.util.ArrayList(size);
        for (int i3 = 0; i3 < size; i3++) {
            arrayList2.add(-1);
        }
        int length = c0685mArr.length;
        int i9 = 0;
        int i10 = 0;
        while (i9 < length) {
            arrayList2.set(p078i6.p.y0(arrayList, c0685mArr[i9]), java.lang.Integer.valueOf(i10));
            i9++;
            i10++;
        }
        if (((M8.C0685m) arrayList.get(0)).d() <= 0) {
            throw new java.lang.IllegalArgumentException("the empty byte string is not a supported option");
        }
        int i11 = 0;
        while (i11 < arrayList.size()) {
            M8.C0685m prefix = (M8.C0685m) arrayList.get(i11);
            int i12 = i11 + 1;
            int i13 = i12;
            while (i13 < arrayList.size()) {
                M8.C0685m c0685m = (M8.C0685m) arrayList.get(i13);
                c0685m.getClass();
                kotlin.jvm.internal.m.e(prefix, "prefix");
                if (!c0685m.m(0, prefix, prefix.d())) {
                    break;
                }
                if (c0685m.d() == prefix.d()) {
                    throw new java.lang.IllegalArgumentException(("duplicate option: " + c0685m).toString());
                }
                if (((java.lang.Number) arrayList2.get(i13)).intValue() > ((java.lang.Number) arrayList2.get(i11)).intValue()) {
                    arrayList.remove(i13);
                    ((java.lang.Number) arrayList2.remove(i13)).intValue();
                } else {
                    i13++;
                }
            }
            i11 = i12;
        }
        M8.C0682j c0682j = new M8.C0682j();
        d(0L, c0682j, 0, arrayList, 0, arrayList.size(), arrayList2);
        int i14 = (int) (c0682j.f7260i / ((long) 4));
        int[] iArr = new int[i14];
        for (int i15 = 0; i15 < i14; i15++) {
            iArr[i15] = c0682j.readInt();
        }
        java.lang.Object[] objArrCopyOf = java.util.Arrays.copyOf(c0685mArr, c0685mArr.length);
        kotlin.jvm.internal.m.d(objArrCopyOf, "copyOf(...)");
        return new M8.z((M8.C0685m[]) objArrCopyOf, iArr);
    }

    public static final M8.C0676d h(java.net.Socket socket) throws java.io.IOException {
        java.util.logging.Logger logger = M8.y.f7290a;
        M8.J j = new M8.J(socket);
        java.io.OutputStream outputStream = socket.getOutputStream();
        kotlin.jvm.internal.m.d(outputStream, "getOutputStream(...)");
        return new M8.C0676d(j, new M8.C0676d(outputStream, j, 1), 0);
    }

    public static final M8.C0677e i(java.io.InputStream inputStream) {
        java.util.logging.Logger logger = M8.y.f7290a;
        kotlin.jvm.internal.m.e(inputStream, "<this>");
        return new M8.C0677e(inputStream, new M8.M());
    }

    public static final M8.C0677e j(java.net.Socket socket) throws java.io.IOException {
        java.util.logging.Logger logger = M8.y.f7290a;
        M8.J j = new M8.J(socket);
        java.io.InputStream inputStream = socket.getInputStream();
        kotlin.jvm.internal.m.d(inputStream, "getInputStream(...)");
        return new M8.C0677e(j, new M8.C0677e(inputStream, j));
    }

    public static final java.lang.String k(int i3) {
        int i9 = 0;
        if (i3 == 0) {
            return "0";
        }
        char[] cArr = N8.b.f7474a;
        char[] cArr2 = {cArr[(i3 >> 28) & 15], cArr[(i3 >> 24) & 15], cArr[(i3 >> 20) & 15], cArr[(i3 >> 16) & 15], cArr[(i3 >> 12) & 15], cArr[(i3 >> 8) & 15], cArr[(i3 >> 4) & 15], cArr[i3 & 15]};
        while (i9 < 8 && cArr2[i9] == '0') {
            i9++;
        }
        return O7.x.m0(cArr2, i9, 8);
    }
}
