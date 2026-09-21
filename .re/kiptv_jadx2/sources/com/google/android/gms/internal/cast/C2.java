package com.google.android.gms.internal.cast;

public final class C2 {

    public static final C2 f18755i;
    public static final C2 j;

    public static final C2[] f18756k;

    public static final C2[] f18757l;

    public final int f18758h;

    C2 EF0;

    static {
        K2 k9 = K2.f18785l;
        C2 c9 = new C2("DOUBLE", 0, 0, 1, k9);
        K2 k10 = K2.f18784k;
        C2 c10 = new C2("FLOAT", 1, 1, 1, k10);
        K2 k11 = K2.j;
        C2 c11 = new C2("INT64", 2, 2, 1, k11);
        C2 c12 = new C2("UINT64", 3, 3, 1, k11);
        K2 k12 = K2.f18783i;
        C2 c13 = new C2("INT32", 4, 4, 1, k12);
        C2 c14 = new C2("FIXED64", 5, 5, 1, k11);
        C2 c15 = new C2("FIXED32", 6, 6, 1, k12);
        K2 k13 = K2.f18786m;
        C2 c16 = new C2("BOOL", 7, 7, 1, k13);
        K2 k14 = K2.f18787n;
        C2 c17 = new C2("STRING", 8, 8, 1, k14);
        K2 k15 = K2.f18790q;
        C2 c18 = new C2("MESSAGE", 9, 9, 1, k15);
        K2 k16 = K2.f18788o;
        C2 c19 = new C2("BYTES", 10, 10, 1, k16);
        C2 c20 = new C2("UINT32", 11, 11, 1, k12);
        K2 k17 = K2.f18789p;
        C2 c21 = new C2("ENUM", 12, 12, 1, k17);
        C2 c22 = new C2("SFIXED32", 13, 13, 1, k12);
        C2 c23 = new C2("SFIXED64", 14, 14, 1, k11);
        C2 c24 = new C2("SINT32", 15, 15, 1, k12);
        C2 c25 = new C2("SINT64", 16, 16, 1, k11);
        C2 c26 = new C2("GROUP", 17, 17, 1, k15);
        C2 c27 = new C2("DOUBLE_LIST", 18, 18, 2, k9);
        C2 c28 = new C2("FLOAT_LIST", 19, 19, 2, k10);
        C2 c29 = new C2("INT64_LIST", 20, 20, 2, k11);
        C2 c30 = new C2("UINT64_LIST", 21, 21, 2, k11);
        C2 c31 = new C2("INT32_LIST", 22, 22, 2, k12);
        C2 c32 = new C2("FIXED64_LIST", 23, 23, 2, k11);
        C2 c33 = new C2("FIXED32_LIST", 24, 24, 2, k12);
        C2 c34 = new C2("BOOL_LIST", 25, 25, 2, k13);
        C2 c35 = new C2("STRING_LIST", 26, 26, 2, k14);
        C2 c36 = new C2("MESSAGE_LIST", 27, 27, 2, k15);
        C2 c37 = new C2("BYTES_LIST", 28, 28, 2, k16);
        C2 c38 = new C2("UINT32_LIST", 29, 29, 2, k12);
        C2 c39 = new C2("ENUM_LIST", 30, 30, 2, k17);
        C2 c40 = new C2("SFIXED32_LIST", 31, 31, 2, k12);
        C2 c41 = new C2("SFIXED64_LIST", 32, 32, 2, k11);
        C2 c42 = new C2("SINT32_LIST", 33, 33, 2, k12);
        C2 c43 = new C2("SINT64_LIST", 34, 34, 2, k11);
        C2 c44 = new C2("DOUBLE_LIST_PACKED", 35, 35, 3, k9);
        f18755i = c44;
        C2 c45 = new C2("FLOAT_LIST_PACKED", 36, 36, 3, k10);
        C2 c46 = new C2("INT64_LIST_PACKED", 37, 37, 3, k11);
        C2 c47 = new C2("UINT64_LIST_PACKED", 38, 38, 3, k11);
        C2 c48 = new C2("INT32_LIST_PACKED", 39, 39, 3, k12);
        C2 c49 = new C2("FIXED64_LIST_PACKED", 40, 40, 3, k11);
        C2 c50 = new C2("FIXED32_LIST_PACKED", 41, 41, 3, k12);
        C2 c51 = new C2("BOOL_LIST_PACKED", 42, 42, 3, k13);
        C2 c52 = new C2("UINT32_LIST_PACKED", 43, 43, 3, k12);
        C2 c53 = new C2("ENUM_LIST_PACKED", 44, 44, 3, k17);
        C2 c54 = new C2("SFIXED32_LIST_PACKED", 45, 45, 3, k12);
        C2 c55 = new C2("SFIXED64_LIST_PACKED", 46, 46, 3, k11);
        C2 c56 = new C2("SINT32_LIST_PACKED", 47, 47, 3, k12);
        C2 c57 = new C2("SINT64_LIST_PACKED", 48, 48, 3, k11);
        j = c57;
        f18757l = new C2[]{c9, c10, c11, c12, c13, c14, c15, c16, c17, c18, c19, c20, c21, c22, c23, c24, c25, c26, c27, c28, c29, c30, c31, c32, c33, c34, c35, c36, c37, c38, c39, c40, c41, c42, c43, c44, c45, c46, c47, c48, c49, c50, c51, c52, c53, c54, c55, c56, c57, new C2("GROUP_LIST", 49, 49, 2, k15), new C2("MAP", 50, 50, 4, K2.f18782h)};
        C2[] c2ArrValues = values();
        f18756k = new C2[c2ArrValues.length];
        for (C2 c58 : c2ArrValues) {
            f18756k[c58.f18758h] = c58;
        }
    }

    public C2(String str, int i3, int i9, int i10, K2 k9) {
        super(str, i3);
        this.f18758h = i9;
        int i11 = i10 - 1;
        if (i11 == 1 || i11 == 3) {
            k9.getClass();
        }
        if (i10 == 1) {
            K2 k10 = K2.f18782h;
            k9.ordinal();
        }
    }

    public static C2[] values() {
        return (C2[]) f18757l.clone();
    }
}
