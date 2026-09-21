package com.google.crypto.tink.shaded.protobuf;

import Z.AbstractC1149h0;

public final class EnumC1923s {

    public static final EnumC1923s f19586i;
    public static final EnumC1923s j;

    public static final EnumC1923s[] f19587k;

    public static final EnumC1923s[] f19588l;

    public final int f19589h;

    EnumC1923s EF0;

    static {
        E e6 = E.DOUBLE;
        EnumC1923s enumC1923s = new EnumC1923s("DOUBLE", 0, 0, 1, e6);
        E e9 = E.FLOAT;
        EnumC1923s enumC1923s2 = new EnumC1923s("FLOAT", 1, 1, 1, e9);
        E e10 = E.LONG;
        EnumC1923s enumC1923s3 = new EnumC1923s("INT64", 2, 2, 1, e10);
        EnumC1923s enumC1923s4 = new EnumC1923s("UINT64", 3, 3, 1, e10);
        E e11 = E.INT;
        EnumC1923s enumC1923s5 = new EnumC1923s("INT32", 4, 4, 1, e11);
        EnumC1923s enumC1923s6 = new EnumC1923s("FIXED64", 5, 5, 1, e10);
        EnumC1923s enumC1923s7 = new EnumC1923s("FIXED32", 6, 6, 1, e11);
        E e12 = E.BOOLEAN;
        EnumC1923s enumC1923s8 = new EnumC1923s("BOOL", 7, 7, 1, e12);
        E e13 = E.STRING;
        EnumC1923s enumC1923s9 = new EnumC1923s("STRING", 8, 8, 1, e13);
        E e14 = E.MESSAGE;
        EnumC1923s enumC1923s10 = new EnumC1923s("MESSAGE", 9, 9, 1, e14);
        E e15 = E.BYTE_STRING;
        EnumC1923s enumC1923s11 = new EnumC1923s("BYTES", 10, 10, 1, e15);
        EnumC1923s enumC1923s12 = new EnumC1923s("UINT32", 11, 11, 1, e11);
        E e16 = E.ENUM;
        EnumC1923s enumC1923s13 = new EnumC1923s("ENUM", 12, 12, 1, e16);
        EnumC1923s enumC1923s14 = new EnumC1923s("SFIXED32", 13, 13, 1, e11);
        EnumC1923s enumC1923s15 = new EnumC1923s("SFIXED64", 14, 14, 1, e10);
        EnumC1923s enumC1923s16 = new EnumC1923s("SINT32", 15, 15, 1, e11);
        EnumC1923s enumC1923s17 = new EnumC1923s("SINT64", 16, 16, 1, e10);
        EnumC1923s enumC1923s18 = new EnumC1923s("GROUP", 17, 17, 1, e14);
        EnumC1923s enumC1923s19 = new EnumC1923s("DOUBLE_LIST", 18, 18, 2, e6);
        EnumC1923s enumC1923s20 = new EnumC1923s("FLOAT_LIST", 19, 19, 2, e9);
        EnumC1923s enumC1923s21 = new EnumC1923s("INT64_LIST", 20, 20, 2, e10);
        EnumC1923s enumC1923s22 = new EnumC1923s("UINT64_LIST", 21, 21, 2, e10);
        EnumC1923s enumC1923s23 = new EnumC1923s("INT32_LIST", 22, 22, 2, e11);
        EnumC1923s enumC1923s24 = new EnumC1923s("FIXED64_LIST", 23, 23, 2, e10);
        EnumC1923s enumC1923s25 = new EnumC1923s("FIXED32_LIST", 24, 24, 2, e11);
        EnumC1923s enumC1923s26 = new EnumC1923s("BOOL_LIST", 25, 25, 2, e12);
        EnumC1923s enumC1923s27 = new EnumC1923s("STRING_LIST", 26, 26, 2, e13);
        EnumC1923s enumC1923s28 = new EnumC1923s("MESSAGE_LIST", 27, 27, 2, e14);
        EnumC1923s enumC1923s29 = new EnumC1923s("BYTES_LIST", 28, 28, 2, e15);
        EnumC1923s enumC1923s30 = new EnumC1923s("UINT32_LIST", 29, 29, 2, e11);
        EnumC1923s enumC1923s31 = new EnumC1923s("ENUM_LIST", 30, 30, 2, e16);
        EnumC1923s enumC1923s32 = new EnumC1923s("SFIXED32_LIST", 31, 31, 2, e11);
        EnumC1923s enumC1923s33 = new EnumC1923s("SFIXED64_LIST", 32, 32, 2, e10);
        EnumC1923s enumC1923s34 = new EnumC1923s("SINT32_LIST", 33, 33, 2, e11);
        EnumC1923s enumC1923s35 = new EnumC1923s("SINT64_LIST", 34, 34, 2, e10);
        EnumC1923s enumC1923s36 = new EnumC1923s("DOUBLE_LIST_PACKED", 35, 35, 3, e6);
        f19586i = enumC1923s36;
        EnumC1923s enumC1923s37 = new EnumC1923s("FLOAT_LIST_PACKED", 36, 36, 3, e9);
        EnumC1923s enumC1923s38 = new EnumC1923s("INT64_LIST_PACKED", 37, 37, 3, e10);
        EnumC1923s enumC1923s39 = new EnumC1923s("UINT64_LIST_PACKED", 38, 38, 3, e10);
        EnumC1923s enumC1923s40 = new EnumC1923s("INT32_LIST_PACKED", 39, 39, 3, e11);
        EnumC1923s enumC1923s41 = new EnumC1923s("FIXED64_LIST_PACKED", 40, 40, 3, e10);
        EnumC1923s enumC1923s42 = new EnumC1923s("FIXED32_LIST_PACKED", 41, 41, 3, e11);
        EnumC1923s enumC1923s43 = new EnumC1923s("BOOL_LIST_PACKED", 42, 42, 3, e12);
        EnumC1923s enumC1923s44 = new EnumC1923s("UINT32_LIST_PACKED", 43, 43, 3, e11);
        EnumC1923s enumC1923s45 = new EnumC1923s("ENUM_LIST_PACKED", 44, 44, 3, e16);
        EnumC1923s enumC1923s46 = new EnumC1923s("SFIXED32_LIST_PACKED", 45, 45, 3, e11);
        EnumC1923s enumC1923s47 = new EnumC1923s("SFIXED64_LIST_PACKED", 46, 46, 3, e10);
        EnumC1923s enumC1923s48 = new EnumC1923s("SINT32_LIST_PACKED", 47, 47, 3, e11);
        EnumC1923s enumC1923s49 = new EnumC1923s("SINT64_LIST_PACKED", 48, 48, 3, e10);
        j = enumC1923s49;
        f19588l = new EnumC1923s[]{enumC1923s, enumC1923s2, enumC1923s3, enumC1923s4, enumC1923s5, enumC1923s6, enumC1923s7, enumC1923s8, enumC1923s9, enumC1923s10, enumC1923s11, enumC1923s12, enumC1923s13, enumC1923s14, enumC1923s15, enumC1923s16, enumC1923s17, enumC1923s18, enumC1923s19, enumC1923s20, enumC1923s21, enumC1923s22, enumC1923s23, enumC1923s24, enumC1923s25, enumC1923s26, enumC1923s27, enumC1923s28, enumC1923s29, enumC1923s30, enumC1923s31, enumC1923s32, enumC1923s33, enumC1923s34, enumC1923s35, enumC1923s36, enumC1923s37, enumC1923s38, enumC1923s39, enumC1923s40, enumC1923s41, enumC1923s42, enumC1923s43, enumC1923s44, enumC1923s45, enumC1923s46, enumC1923s47, enumC1923s48, enumC1923s49, new EnumC1923s("GROUP_LIST", 49, 49, 2, e14), new EnumC1923s("MAP", 50, 50, 4, E.VOID)};
        EnumC1923s[] enumC1923sArrValues = values();
        f19587k = new EnumC1923s[enumC1923sArrValues.length];
        for (EnumC1923s enumC1923s50 : enumC1923sArrValues) {
            f19587k[enumC1923s50.f19589h] = enumC1923s50;
        }
    }

    public EnumC1923s(String str, int i3, int i9, int i10, E e6) {
        super(str, i3);
        this.f19589h = i9;
        int iC = AbstractC1149h0.c(i10);
        if (iC == 1 || iC == 3) {
            e6.getClass();
        }
        if (i10 == 1) {
            e6.ordinal();
        }
    }

    public static EnumC1923s valueOf(String str) {
        return (EnumC1923s) Enum.valueOf(EnumC1923s.class, str);
    }

    public static EnumC1923s[] values() {
        return (EnumC1923s[]) f19588l.clone();
    }
}
