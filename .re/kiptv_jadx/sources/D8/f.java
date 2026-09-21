package D8;

/* JADX INFO: loaded from: classes4.dex */
public abstract class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final M8.C0685m f2526a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final java.lang.String[] f2527b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final java.lang.String[] f2528c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final java.lang.String[] f2529d;

    static {
        M8.C0685m c0685m = M8.C0685m.f7261k;
        f2526a = B3.o.j("PRI * HTTP/2.0\r\n\r\nSM\r\n\r\n");
        f2527b = new java.lang.String[]{"DATA", "HEADERS", "PRIORITY", "RST_STREAM", "SETTINGS", "PUSH_PROMISE", "PING", "GOAWAY", "WINDOW_UPDATE", "CONTINUATION"};
        f2528c = new java.lang.String[64];
        java.lang.String[] strArr = new java.lang.String[256];
        for (int i3 = 0; i3 < 256; i3++) {
            java.lang.String binaryString = java.lang.Integer.toBinaryString(i3);
            kotlin.jvm.internal.m.d(binaryString, "toBinaryString(it)");
            strArr[i3] = O7.x.v0(x8.b.i("%8s", binaryString), ' ', '0');
        }
        f2529d = strArr;
        java.lang.String[] strArr2 = f2528c;
        strArr2[0] = "";
        strArr2[1] = "END_STREAM";
        int[] iArr = {1};
        strArr2[8] = "PADDED";
        int i9 = iArr[0];
        strArr2[i9 | 8] = Y6.f.m(new java.lang.StringBuilder(), strArr2[i9], "|PADDED");
        strArr2[4] = "END_HEADERS";
        strArr2[32] = "PRIORITY";
        strArr2[36] = "END_HEADERS|PRIORITY";
        int[] iArr2 = {4, 32, 36};
        for (int i10 = 0; i10 < 3; i10++) {
            int i11 = iArr2[i10];
            int i12 = iArr[0];
            java.lang.String[] strArr3 = f2528c;
            int i13 = i12 | i11;
            strArr3[i13] = strArr3[i12] + '|' + strArr3[i11];
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(strArr3[i12]);
            sb.append('|');
            strArr3[i13 | 8] = Y6.f.m(sb, strArr3[i11], "|PADDED");
        }
        int length = f2528c.length;
        for (int i14 = 0; i14 < length; i14++) {
            java.lang.String[] strArr4 = f2528c;
            if (strArr4[i14] == null) {
                strArr4[i14] = f2529d[i14];
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:38:0x0067  */
    public static java.lang.String a(int i3, int i9, boolean z6, int i10, int i11) {
        java.lang.String strW0;
        java.lang.String str;
        java.lang.String[] strArr = f2527b;
        java.lang.String strI = i10 < strArr.length ? strArr[i10] : x8.b.i("0x%02x", java.lang.Integer.valueOf(i10));
        if (i11 == 0) {
            strW0 = "";
        } else {
            java.lang.String[] strArr2 = f2529d;
            if (i10 == 2 || i10 == 3) {
                strW0 = strArr2[i11];
            } else if (i10 == 4 || i10 == 6) {
                strW0 = i11 == 1 ? "ACK" : strArr2[i11];
            } else if (i10 == 7 || i10 == 8) {
                strW0 = strArr2[i11];
            } else {
                java.lang.String[] strArr3 = f2528c;
                if (i11 < strArr3.length) {
                    str = strArr3[i11];
                    kotlin.jvm.internal.m.b(str);
                } else {
                    str = strArr2[i11];
                }
                if (i10 != 5 || (i11 & 4) == 0) {
                    strW0 = (i10 != 0 || (i11 & 32) == 0) ? str : O7.x.w0(str, "PRIORITY", "COMPRESSED");
                } else {
                    strW0 = O7.x.w0(str, "HEADERS", "PUSH_PROMISE");
                }
            }
        }
        return x8.b.i("%s 0x%08x %5d %-13s %s", z6 ? "<<" : ">>", java.lang.Integer.valueOf(i3), java.lang.Integer.valueOf(i9), strI, strW0);
    }
}
