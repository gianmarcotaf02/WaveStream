package M8;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.logging.Logger;

public abstract class AbstractC0674b {

    public static final C0680h f7239a = new C0680h();

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

    public static final D b(I i3) {
        kotlin.jvm.internal.m.e(i3, "<this>");
        return new D(i3);
    }

    public static final E c(K k9) {
        kotlin.jvm.internal.m.e(k9, "<this>");
        return new E(k9);
    }

    public static void d(long j, C0682j c0682j, int i3, ArrayList arrayList, int i9, int i10, ArrayList arrayList2) {
        int i11;
        int i12;
        ArrayList arrayList3;
        long j9;
        int i13;
        int i14 = i3;
        ArrayList arrayList4 = arrayList;
        ArrayList arrayList5 = arrayList2;
        if (i9 >= i10) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        for (int i15 = i9; i15 < i10; i15++) {
            if (((C0685m) arrayList4.get(i15)).d() < i14) {
                throw new IllegalArgumentException("Failed requirement.");
            }
        }
        C0685m c0685m = (C0685m) arrayList.get(i9);
        C0685m c0685m2 = (C0685m) arrayList4.get(i10 - 1);
        if (i14 == c0685m.d()) {
            int iIntValue = ((Number) arrayList5.get(i9)).intValue();
            int i16 = i9 + 1;
            C0685m c0685m3 = (C0685m) arrayList4.get(i16);
            i11 = i16;
            i12 = iIntValue;
            c0685m = c0685m3;
        } else {
            i11 = i9;
            i12 = -1;
        }
        if (c0685m.i(i14) == c0685m2.i(i14)) {
            int iMin = Math.min(c0685m.d(), c0685m2.d());
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
                if (i19 != ((C0685m) arrayList4.get(i11)).d()) {
                    throw new IllegalStateException("Check failed.");
                }
                c0682j.n(((Number) arrayList5.get(i11)).intValue());
                return;
            } else {
                C0682j c0682j2 = new C0682j();
                c0682j.n(((int) ((c0682j2.f7260i / j10) + j11)) * (-1));
                d(j11, c0682j2, i19, arrayList4, i11, i10, arrayList5);
                c0682j.M(c0682j2);
                return;
            }
        }
        int i20 = 1;
        for (int i21 = i11 + 1; i21 < i10; i21++) {
            if (((C0685m) arrayList4.get(i21 - 1)).i(i14) != ((C0685m) arrayList4.get(i21)).i(i14)) {
                i20++;
            }
        }
        long j12 = 4;
        long j13 = (c0682j.f7260i / j12) + j + ((long) 2) + ((long) (i20 * 2));
        c0682j.n(i20);
        c0682j.n(i12);
        for (int i22 = i11; i22 < i10; i22++) {
            int i23 = ((C0685m) arrayList4.get(i22)).i(i14);
            if (i22 == i11 || i23 != ((C0685m) arrayList4.get(i22 - 1)).i(i14)) {
                c0682j.n(i23 & 255);
            }
        }
        C0682j c0682j3 = new C0682j();
        int i24 = i11;
        while (i24 < i10) {
            byte bI = ((C0685m) arrayList4.get(i24)).i(i14);
            int i25 = i24 + 1;
            int i26 = i25;
            while (true) {
                if (i26 >= i10) {
                    i26 = i10;
                    break;
                } else if (bI != ((C0685m) arrayList4.get(i26)).i(i14)) {
                    break;
                } else {
                    i26++;
                }
            }
            if (i25 == i26 && i14 + 1 == ((C0685m) arrayList4.get(i24)).d()) {
                c0682j.n(((Number) arrayList5.get(i24)).intValue());
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
            StringBuilder sbU = p121o0.p.u(j, "size=", " offset=");
            sbU.append(j9);
            sbU.append(" byteCount=");
            sbU.append(j10);
            throw new ArrayIndexOutOfBoundsException(sbU.toString());
        }
    }

    public static final boolean f(AssertionError assertionError) {
        Logger logger = y.f7290a;
        if (assertionError.getCause() != null) {
            String message = assertionError.getMessage();
            if (message != null ? O7.q.B0(message, "getsockname failed", false) : false) {
                return true;
            }
        }
        return false;
    }

    public static z g(C0685m... c0685mArr) {
        if (c0685mArr.length == 0) {
            return new z(new C0685m[0], new int[]{0, -1});
        }
        ArrayList arrayList = new ArrayList(new p078i6.k(c0685mArr, false));
        p078i6.t.K0(arrayList);
        int size = arrayList.size();
        ArrayList arrayList2 = new ArrayList(size);
        for (int i3 = 0; i3 < size; i3++) {
            arrayList2.add(-1);
        }
        int length = c0685mArr.length;
        int i9 = 0;
        int i10 = 0;
        while (i9 < length) {
            arrayList2.set(p078i6.p.y0(arrayList, c0685mArr[i9]), Integer.valueOf(i10));
            i9++;
            i10++;
        }
        if (((C0685m) arrayList.get(0)).d() <= 0) {
            throw new IllegalArgumentException("the empty byte string is not a supported option");
        }
        int i11 = 0;
        while (i11 < arrayList.size()) {
            C0685m prefix = (C0685m) arrayList.get(i11);
            int i12 = i11 + 1;
            int i13 = i12;
            while (i13 < arrayList.size()) {
                C0685m c0685m = (C0685m) arrayList.get(i13);
                c0685m.getClass();
                kotlin.jvm.internal.m.e(prefix, "prefix");
                if (!c0685m.m(0, prefix, prefix.d())) {
                    break;
                }
                if (c0685m.d() == prefix.d()) {
                    throw new IllegalArgumentException(("duplicate option: " + c0685m).toString());
                }
                if (((Number) arrayList2.get(i13)).intValue() > ((Number) arrayList2.get(i11)).intValue()) {
                    arrayList.remove(i13);
                    ((Number) arrayList2.remove(i13)).intValue();
                } else {
                    i13++;
                }
            }
            i11 = i12;
        }
        C0682j c0682j = new C0682j();
        d(0L, c0682j, 0, arrayList, 0, arrayList.size(), arrayList2);
        int i14 = (int) (c0682j.f7260i / ((long) 4));
        int[] iArr = new int[i14];
        for (int i15 = 0; i15 < i14; i15++) {
            iArr[i15] = c0682j.readInt();
        }
        Object[] objArrCopyOf = Arrays.copyOf(c0685mArr, c0685mArr.length);
        kotlin.jvm.internal.m.d(objArrCopyOf, "copyOf(...)");
        return new z((C0685m[]) objArrCopyOf, iArr);
    }

    public static final C0676d h(Socket socket) throws IOException {
        Logger logger = y.f7290a;
        J j = new J(socket);
        OutputStream outputStream = socket.getOutputStream();
        kotlin.jvm.internal.m.d(outputStream, "getOutputStream(...)");
        return new C0676d(j, new C0676d(outputStream, j, 1), 0);
    }

    public static final C0677e i(InputStream inputStream) {
        Logger logger = y.f7290a;
        kotlin.jvm.internal.m.e(inputStream, "<this>");
        return new C0677e(inputStream, new M());
    }

    public static final C0677e j(Socket socket) throws IOException {
        Logger logger = y.f7290a;
        J j = new J(socket);
        InputStream inputStream = socket.getInputStream();
        kotlin.jvm.internal.m.d(inputStream, "getInputStream(...)");
        return new C0677e(j, new C0677e(inputStream, j));
    }

    public static final String k(int i3) {
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
