package com.google.android.gms.internal.play_billing;

/* JADX INFO: loaded from: classes.dex */
public final class N0 implements com.google.android.gms.internal.play_billing.T0 {
    public static final int[] j = new int[0];

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final sun.misc.Unsafe f19260k = com.google.android.gms.internal.play_billing.AbstractC1830c1.h();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int[] f19261a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.lang.Object[] f19262b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f19263c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f19264d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final com.google.android.gms.internal.play_billing.AbstractC1841g0 f19265e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int[] f19266f;
    public final int g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f19267h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final com.google.android.gms.internal.play_billing.C1873t0 f19268i;

    public N0(int[] iArr, java.lang.Object[] objArr, int i3, int i9, com.google.android.gms.internal.play_billing.AbstractC1841g0 abstractC1841g0, int[] iArr2, int i10, int i11, com.google.android.gms.internal.play_billing.C1873t0 c1873t0, com.google.android.gms.internal.play_billing.C1873t0 c1873t1) {
        this.f19261a = iArr;
        this.f19262b = objArr;
        this.f19263c = i3;
        this.f19264d = i9;
        this.f19266f = iArr2;
        this.g = i10;
        this.f19267h = i11;
        this.f19268i = c1873t0;
        this.f19265e = abstractC1841g0;
    }

    public static java.lang.reflect.Field E(java.lang.Class cls, java.lang.String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (java.lang.NoSuchFieldException e6) {
            java.lang.reflect.Field[] declaredFields = cls.getDeclaredFields();
            for (java.lang.reflect.Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            java.lang.String name = cls.getName();
            java.lang.String string = java.util.Arrays.toString(declaredFields);
            java.lang.StringBuilder sbO = Y6.f.o("Field ", str, " for ", name, " not found. Known fields are ");
            sbO.append(string);
            throw new java.lang.RuntimeException(sbO.toString(), e6);
        }
    }

    public static boolean r(java.lang.Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof com.google.android.gms.internal.play_billing.AbstractC1877v0) {
            return ((com.google.android.gms.internal.play_billing.AbstractC1877v0) obj).h();
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:126:0x0271  */
    /* JADX WARN: Code duplicated, block: B:128:0x0277  */
    /* JADX WARN: Code duplicated, block: B:131:0x028f  */
    /* JADX WARN: Code duplicated, block: B:132:0x0292  */
    /* JADX WARN: Code duplicated, block: B:185:0x03a8  */
    public static com.google.android.gms.internal.play_billing.N0 u(com.google.android.gms.internal.play_billing.S0 s9, com.google.android.gms.internal.play_billing.C1873t0 c1873t0, com.google.android.gms.internal.play_billing.C1873t0 c1873t1) {
        int i3;
        int iCharAt;
        int i9;
        int[] iArr;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        char cCharAt;
        int i16;
        char cCharAt2;
        int i17;
        char cCharAt3;
        int i18;
        char cCharAt4;
        int i19;
        char cCharAt5;
        int i20;
        char cCharAt6;
        int i21;
        char cCharAt7;
        int i22;
        char cCharAt8;
        int i23;
        int i24;
        int i25;
        java.lang.Object[] objArr;
        int i26;
        int i27;
        int i28;
        int iObjectFieldOffset;
        int iObjectFieldOffset2;
        char c9;
        int i29;
        int i30;
        int i31;
        int i32;
        java.lang.reflect.Field fieldE;
        int i33;
        char cCharAt9;
        int i34;
        int i35;
        int i36;
        int i37;
        int i38;
        int i39;
        java.lang.Object obj;
        java.lang.reflect.Field fieldE2;
        int i40;
        java.lang.Object obj2;
        java.lang.reflect.Field fieldE3;
        int i41;
        char cCharAt10;
        int i42;
        int i43;
        char cCharAt11;
        int i44;
        char cCharAt12;
        int i45;
        char cCharAt13;
        if (!(s9 instanceof com.google.android.gms.internal.play_billing.S0)) {
            s9.getClass();
            throw new java.lang.ClassCastException();
        }
        java.lang.String str = s9.f19285b;
        int length = str.length();
        char c10 = 55296;
        if (str.charAt(0) >= 55296) {
            int i46 = 1;
            while (true) {
                i3 = i46 + 1;
                if (str.charAt(i46) < 55296) {
                    break;
                }
                i46 = i3;
            }
        } else {
            i3 = 1;
        }
        int i47 = i3 + 1;
        int iCharAt2 = str.charAt(i3);
        if (iCharAt2 >= 55296) {
            int i48 = iCharAt2 & 8191;
            int i49 = 13;
            while (true) {
                i45 = i47 + 1;
                cCharAt13 = str.charAt(i47);
                if (cCharAt13 < 55296) {
                    break;
                }
                i48 |= (cCharAt13 & 8191) << i49;
                i49 += 13;
                i47 = i45;
            }
            iCharAt2 = i48 | (cCharAt13 << i49);
            i47 = i45;
        }
        if (iCharAt2 == 0) {
            i11 = 0;
            i13 = 0;
            iCharAt = 0;
            i10 = 0;
            i12 = 0;
            i14 = 0;
            iArr = j;
            i9 = 0;
        } else {
            int i50 = i47 + 1;
            int iCharAt3 = str.charAt(i47);
            if (iCharAt3 >= 55296) {
                int i51 = iCharAt3 & 8191;
                int i52 = 13;
                while (true) {
                    i22 = i50 + 1;
                    cCharAt8 = str.charAt(i50);
                    if (cCharAt8 < 55296) {
                        break;
                    }
                    i51 |= (cCharAt8 & 8191) << i52;
                    i52 += 13;
                    i50 = i22;
                }
                iCharAt3 = i51 | (cCharAt8 << i52);
                i50 = i22;
            }
            int i53 = i50 + 1;
            int iCharAt4 = str.charAt(i50);
            if (iCharAt4 >= 55296) {
                int i54 = iCharAt4 & 8191;
                int i55 = 13;
                while (true) {
                    i21 = i53 + 1;
                    cCharAt7 = str.charAt(i53);
                    if (cCharAt7 < 55296) {
                        break;
                    }
                    i54 |= (cCharAt7 & 8191) << i55;
                    i55 += 13;
                    i53 = i21;
                }
                iCharAt4 = i54 | (cCharAt7 << i55);
                i53 = i21;
            }
            int i56 = i53 + 1;
            int iCharAt5 = str.charAt(i53);
            if (iCharAt5 >= 55296) {
                int i57 = iCharAt5 & 8191;
                int i58 = 13;
                while (true) {
                    i20 = i56 + 1;
                    cCharAt6 = str.charAt(i56);
                    if (cCharAt6 < 55296) {
                        break;
                    }
                    i57 |= (cCharAt6 & 8191) << i58;
                    i58 += 13;
                    i56 = i20;
                }
                iCharAt5 = i57 | (cCharAt6 << i58);
                i56 = i20;
            }
            int i59 = i56 + 1;
            int iCharAt6 = str.charAt(i56);
            if (iCharAt6 >= 55296) {
                int i60 = iCharAt6 & 8191;
                int i61 = 13;
                while (true) {
                    i19 = i59 + 1;
                    cCharAt5 = str.charAt(i59);
                    if (cCharAt5 < 55296) {
                        break;
                    }
                    i60 |= (cCharAt5 & 8191) << i61;
                    i61 += 13;
                    i59 = i19;
                }
                iCharAt6 = i60 | (cCharAt5 << i61);
                i59 = i19;
            }
            int i62 = i59 + 1;
            iCharAt = str.charAt(i59);
            if (iCharAt >= 55296) {
                int i63 = iCharAt & 8191;
                int i64 = 13;
                while (true) {
                    i18 = i62 + 1;
                    cCharAt4 = str.charAt(i62);
                    if (cCharAt4 < 55296) {
                        break;
                    }
                    i63 |= (cCharAt4 & 8191) << i64;
                    i64 += 13;
                    i62 = i18;
                }
                iCharAt = i63 | (cCharAt4 << i64);
                i62 = i18;
            }
            int i65 = i62 + 1;
            int iCharAt7 = str.charAt(i62);
            if (iCharAt7 >= 55296) {
                int i66 = iCharAt7 & 8191;
                int i67 = 13;
                while (true) {
                    i17 = i65 + 1;
                    cCharAt3 = str.charAt(i65);
                    if (cCharAt3 < 55296) {
                        break;
                    }
                    i66 |= (cCharAt3 & 8191) << i67;
                    i67 += 13;
                    i65 = i17;
                }
                iCharAt7 = i66 | (cCharAt3 << i67);
                i65 = i17;
            }
            int i68 = i65 + 1;
            int iCharAt8 = str.charAt(i65);
            if (iCharAt8 >= 55296) {
                int i69 = iCharAt8 & 8191;
                int i70 = 13;
                while (true) {
                    i16 = i68 + 1;
                    cCharAt2 = str.charAt(i68);
                    if (cCharAt2 < 55296) {
                        break;
                    }
                    i69 |= (cCharAt2 & 8191) << i70;
                    i70 += 13;
                    i68 = i16;
                }
                iCharAt8 = i69 | (cCharAt2 << i70);
                i68 = i16;
            }
            int i71 = i68 + 1;
            int iCharAt9 = str.charAt(i68);
            if (iCharAt9 >= 55296) {
                int i72 = iCharAt9 & 8191;
                int i73 = 13;
                while (true) {
                    i15 = i71 + 1;
                    cCharAt = str.charAt(i71);
                    if (cCharAt < 55296) {
                        break;
                    }
                    i72 |= (cCharAt & 8191) << i73;
                    i73 += 13;
                    i71 = i15;
                }
                iCharAt9 = i72 | (cCharAt << i73);
                i71 = i15;
            }
            int i74 = iCharAt3 + iCharAt3 + iCharAt4;
            i9 = iCharAt3;
            i47 = i71;
            iArr = new int[iCharAt9 + iCharAt7 + iCharAt8];
            int i75 = iCharAt7;
            i10 = iCharAt5;
            i11 = i75;
            i12 = iCharAt6;
            i13 = i74;
            i14 = iCharAt9;
        }
        sun.misc.Unsafe unsafe = f19260k;
        java.lang.Class<?> cls = s9.f19284a.getClass();
        int i76 = i14 + i11;
        int i77 = iCharAt + iCharAt;
        int[] iArr2 = new int[iCharAt * 3];
        java.lang.Object[] objArr2 = new java.lang.Object[i77];
        int i78 = i76;
        int i79 = i14;
        int i80 = 0;
        int i81 = 0;
        while (i47 < length) {
            int i82 = i47 + 1;
            int iCharAt10 = str.charAt(i47);
            if (iCharAt10 >= c10) {
                int i83 = iCharAt10 & 8191;
                int i84 = i82;
                int i85 = 13;
                while (true) {
                    i44 = i84 + 1;
                    cCharAt12 = str.charAt(i84);
                    if (cCharAt12 < c10) {
                        break;
                    }
                    i83 |= (cCharAt12 & 8191) << i85;
                    i85 += 13;
                    i84 = i44;
                }
                iCharAt10 = i83 | (cCharAt12 << i85);
                i23 = i44;
            } else {
                i23 = i82;
            }
            int i86 = i23 + 1;
            int iCharAt11 = str.charAt(i23);
            if (iCharAt11 >= c10) {
                int i87 = iCharAt11 & 8191;
                int i88 = i86;
                int i89 = 13;
                while (true) {
                    i43 = i88 + 1;
                    cCharAt11 = str.charAt(i88);
                    i24 = length;
                    if (cCharAt11 < 55296) {
                        break;
                    }
                    i87 |= (cCharAt11 & 8191) << i89;
                    i89 += 13;
                    i88 = i43;
                    length = i24;
                }
                iCharAt11 = i87 | (cCharAt11 << i89);
                i25 = i43;
            } else {
                i24 = length;
                i25 = i86;
            }
            if ((iCharAt11 & 1024) != 0) {
                iArr[i80] = i81;
                i80++;
            }
            int i90 = iCharAt11 & 255;
            int i91 = iCharAt10;
            int i92 = iCharAt11 & 2048;
            java.lang.Object[] objArr3 = s9.f19286c;
            if (i90 >= 51) {
                int i93 = i25 + 1;
                int iCharAt12 = str.charAt(i25);
                if (iCharAt12 >= 55296) {
                    int i94 = iCharAt12 & 8191;
                    int i95 = i93;
                    int i96 = 13;
                    while (true) {
                        i41 = i95 + 1;
                        cCharAt10 = str.charAt(i95);
                        i42 = i94;
                        if (cCharAt10 < 55296) {
                            break;
                        }
                        i94 = i42 | ((cCharAt10 & 8191) << i96);
                        i96 += 13;
                        i95 = i41;
                    }
                    iCharAt12 = i42 | (cCharAt10 << i96);
                    i36 = i41;
                } else {
                    i36 = i93;
                }
                int i97 = iCharAt12;
                int i98 = i90 - 51;
                int i99 = i36;
                if (i98 == 9 || i98 == 17) {
                    i37 = i13 + 1;
                    int i100 = i81 / 3;
                    objArr2[i100 + i100 + 1] = objArr3[i13];
                } else {
                    if (i98 != 12) {
                        i38 = i92;
                    } else if (s9.a() == 1 || i92 != 0) {
                        i37 = i13 + 1;
                        int i101 = i81 / 3;
                        objArr2[i101 + i101 + 1] = objArr3[i13];
                    } else {
                        i38 = 0;
                    }
                    i39 = i97 + i97;
                    obj = objArr3[i39];
                    int i102 = i38;
                    if (obj instanceof java.lang.reflect.Field) {
                        fieldE2 = (java.lang.reflect.Field) obj;
                    } else {
                        fieldE2 = E(cls, (java.lang.String) obj);
                        objArr3[i39] = fieldE2;
                    }
                    int i103 = i9;
                    objArr = objArr2;
                    int iObjectFieldOffset3 = (int) unsafe.objectFieldOffset(fieldE2);
                    i40 = i39 + 1;
                    obj2 = objArr3[i40];
                    if (obj2 instanceof java.lang.reflect.Field) {
                        fieldE3 = (java.lang.reflect.Field) obj2;
                    } else {
                        fieldE3 = E(cls, (java.lang.String) obj2);
                        objArr3[i40] = fieldE3;
                    }
                    int iObjectFieldOffset4 = (int) unsafe.objectFieldOffset(fieldE3);
                    i26 = i103;
                    i28 = i102;
                    str = str;
                    i27 = i13;
                    i29 = i99;
                    i31 = 0;
                    c9 = 55296;
                    iObjectFieldOffset2 = iObjectFieldOffset4;
                    i32 = iObjectFieldOffset3;
                }
                i13 = i37;
                i38 = i92;
                i39 = i97 + i97;
                obj = objArr3[i39];
                int i104 = i38;
                if (obj instanceof java.lang.reflect.Field) {
                    fieldE2 = (java.lang.reflect.Field) obj;
                } else {
                    fieldE2 = E(cls, (java.lang.String) obj);
                    objArr3[i39] = fieldE2;
                }
                int i105 = i9;
                objArr = objArr2;
                int iObjectFieldOffset5 = (int) unsafe.objectFieldOffset(fieldE2);
                i40 = i39 + 1;
                obj2 = objArr3[i40];
                if (obj2 instanceof java.lang.reflect.Field) {
                    fieldE3 = (java.lang.reflect.Field) obj2;
                } else {
                    fieldE3 = E(cls, (java.lang.String) obj2);
                    objArr3[i40] = fieldE3;
                }
                int iObjectFieldOffset6 = (int) unsafe.objectFieldOffset(fieldE3);
                i26 = i105;
                i28 = i104;
                str = str;
                i27 = i13;
                i29 = i99;
                i31 = 0;
                c9 = 55296;
                iObjectFieldOffset2 = iObjectFieldOffset6;
                i32 = iObjectFieldOffset5;
            } else {
                int i106 = i9;
                objArr = objArr2;
                int i107 = i13 + 1;
                java.lang.reflect.Field fieldE4 = E(cls, (java.lang.String) objArr3[i13]);
                i26 = i106;
                if (i90 == 9 || i90 == 17) {
                    i27 = i107;
                    int i108 = i81 / 3;
                    objArr[i108 + i108 + 1] = fieldE4.getType();
                } else {
                    if (i90 != 27) {
                        if (i90 == 49) {
                            i35 = i13 + 2;
                            i34 = 1;
                        } else {
                            if (i90 == 12 || i90 == 30 || i90 == 44) {
                                i27 = i107;
                                if (s9.a() == 1 || i92 != 0) {
                                    i35 = i13 + 2;
                                    int i109 = i81 / 3;
                                    objArr[i109 + i109 + 1] = objArr3[i27];
                                    i27 = i35;
                                }
                            } else if (i90 == 50) {
                                int i110 = i13 + 2;
                                int i111 = i79 + 1;
                                iArr[i79] = i81;
                                int i112 = i81 / 3;
                                int i113 = i112 + i112;
                                objArr[i113] = objArr3[i107];
                                if (i92 != 0) {
                                    objArr[i113 + 1] = objArr3[i110];
                                    i28 = i92;
                                    i79 = i111;
                                    i27 = i13 + 3;
                                } else {
                                    i79 = i111;
                                    i27 = i110;
                                }
                            } else {
                                i27 = i107;
                            }
                            i28 = 0;
                        }
                        iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldE4);
                        iObjectFieldOffset2 = 1048575;
                        if ((iCharAt11 & 4096) != 0 || i90 > 17) {
                            c9 = 55296;
                            i29 = i25;
                            i30 = 0;
                        } else {
                            i29 = i25 + 1;
                            int iCharAt13 = str.charAt(i25);
                            if (iCharAt13 >= 55296) {
                                int i114 = iCharAt13 & 8191;
                                int i115 = 13;
                                while (true) {
                                    i33 = i29 + 1;
                                    cCharAt9 = str.charAt(i29);
                                    if (cCharAt9 < 55296) {
                                        break;
                                    }
                                    i114 |= (cCharAt9 & 8191) << i115;
                                    i115 += 13;
                                    i29 = i33;
                                }
                                iCharAt13 = i114 | (cCharAt9 << i115);
                                i29 = i33;
                            }
                            int i116 = (iCharAt13 / 32) + i26 + i26;
                            java.lang.Object obj3 = objArr3[i116];
                            if (obj3 instanceof java.lang.reflect.Field) {
                                fieldE = (java.lang.reflect.Field) obj3;
                            } else {
                                fieldE = E(cls, (java.lang.String) obj3);
                                objArr3[i116] = fieldE;
                            }
                            i30 = iCharAt13 % 32;
                            iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldE);
                            c9 = 55296;
                        }
                        if (i90 >= 18 && i90 <= 49) {
                            iArr[i78] = iObjectFieldOffset;
                            i78++;
                        }
                        i31 = i30;
                        i32 = iObjectFieldOffset;
                    } else {
                        i34 = 1;
                        i35 = i13 + 2;
                    }
                    int i117 = i81 / 3;
                    objArr[i117 + i117 + i34] = objArr3[i107];
                    i27 = i35;
                }
                i28 = i92;
                iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldE4);
                iObjectFieldOffset2 = 1048575;
                if ((iCharAt11 & 4096) != 0) {
                    c9 = 55296;
                    i29 = i25;
                    i30 = 0;
                } else {
                    c9 = 55296;
                    i29 = i25;
                    i30 = 0;
                }
                if (i90 >= 18) {
                    iArr[i78] = iObjectFieldOffset;
                    i78++;
                }
                i31 = i30;
                i32 = iObjectFieldOffset;
            }
            int i118 = i81 + 1;
            iArr2[i81] = i91;
            int i119 = i81 + 2;
            int i120 = i31;
            iArr2[i118] = ((iCharAt11 & 512) != 0 ? androidx.media3.common.C.BUFFER_FLAG_LAST_SAMPLE : 0) | ((iCharAt11 & 256) != 0 ? 268435456 : 0) | (i28 != 0 ? Integer.MIN_VALUE : 0) | (i90 << 20) | i32;
            i81 += 3;
            iArr2[i119] = (i120 << 20) | iObjectFieldOffset2;
            i47 = i29;
            c10 = c9;
            length = i24;
            i9 = i26;
            i13 = i27;
            str = str;
            objArr2 = objArr;
        }
        return new com.google.android.gms.internal.play_billing.N0(iArr2, objArr2, i10, i12, s9.f19284a, iArr, i14, i76, c1873t0, c1873t1);
    }

    public static int v(long j9, java.lang.Object obj) {
        return ((java.lang.Integer) com.google.android.gms.internal.play_billing.AbstractC1830c1.g(j9, obj)).intValue();
    }

    public static int x(int i3) {
        return (i3 >>> 20) & 255;
    }

    public static long z(long j9, java.lang.Object obj) {
        return ((java.lang.Long) com.google.android.gms.internal.play_billing.AbstractC1830c1.g(j9, obj)).longValue();
    }

    public final com.google.android.gms.internal.play_billing.InterfaceC1881x0 A(int i3) {
        int i9 = i3 / 3;
        return (com.google.android.gms.internal.play_billing.InterfaceC1881x0) this.f19262b[i9 + i9 + 1];
    }

    public final com.google.android.gms.internal.play_billing.T0 B(int i3) {
        int i9 = i3 / 3;
        int i10 = i9 + i9;
        java.lang.Object[] objArr = this.f19262b;
        com.google.android.gms.internal.play_billing.T0 t9 = (com.google.android.gms.internal.play_billing.T0) objArr[i10];
        if (t9 != null) {
            return t9;
        }
        com.google.android.gms.internal.play_billing.T0 t0A = com.google.android.gms.internal.play_billing.Q0.f19276c.a((java.lang.Class) objArr[i10 + 1]);
        objArr[i10] = t0A;
        return t0A;
    }

    public final java.lang.Object C(int i3, java.lang.Object obj) {
        com.google.android.gms.internal.play_billing.T0 t0B = B(i3);
        int iY = y(i3) & 1048575;
        if (!p(i3, obj)) {
            return t0B.h();
        }
        java.lang.Object object = f19260k.getObject(obj, iY);
        if (r(object)) {
            return object;
        }
        com.google.android.gms.internal.play_billing.AbstractC1877v0 abstractC1877v0H = t0B.h();
        if (object != null) {
            t0B.g(abstractC1877v0H, object);
        }
        return abstractC1877v0H;
    }

    public final java.lang.Object D(int i3, int i9, java.lang.Object obj) {
        com.google.android.gms.internal.play_billing.T0 t0B = B(i9);
        if (!s(i3, i9, obj)) {
            return t0B.h();
        }
        java.lang.Object object = f19260k.getObject(obj, y(i9) & 1048575);
        if (r(object)) {
            return object;
        }
        com.google.android.gms.internal.play_billing.AbstractC1877v0 abstractC1877v0H = t0B.h();
        if (object != null) {
            t0B.g(abstractC1877v0H, object);
        }
        return abstractC1877v0H;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0071  */
    /* JADX WARN: Code duplicated, block: B:30:0x0077  */
    /* JADX WARN: Code duplicated, block: B:44:0x0084 A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.play_billing.T0
    public final void a(java.lang.Object obj) {
        if (!r(obj)) {
            return;
        }
        if (obj instanceof com.google.android.gms.internal.play_billing.AbstractC1877v0) {
            com.google.android.gms.internal.play_billing.AbstractC1877v0 abstractC1877v0 = (com.google.android.gms.internal.play_billing.AbstractC1877v0) obj;
            abstractC1877v0.g();
            abstractC1877v0.zza = 0;
            abstractC1877v0.e();
        }
        int i3 = 0;
        while (true) {
            int[] iArr = this.f19261a;
            if (i3 >= iArr.length) {
                this.f19268i.getClass();
                com.google.android.gms.internal.play_billing.X0 x9 = ((com.google.android.gms.internal.play_billing.AbstractC1877v0) obj).zzc;
                if (x9.f19305e) {
                    x9.f19305e = false;
                    return;
                }
                return;
            }
            int iY = y(i3);
            int i9 = 1048575 & iY;
            int iX = x(iY);
            long j9 = i9;
            if (iX != 9) {
                if (iX != 60 && iX != 68) {
                    switch (iX) {
                        case 17:
                            if (p(i3, obj)) {
                                B(i3).a(f19260k.getObject(obj, j9));
                            }
                            break;
                        case 18:
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                        case 23:
                        case 24:
                        case 25:
                        case 26:
                        case 27:
                        case 28:
                        case 29:
                        case 30:
                        case 31:
                        case 32:
                        case 33:
                        case 34:
                        case 35:
                        case androidx.media3.extractor.ts.TsExtractor.TS_STREAM_TYPE_H265 /* 36 */:
                        case 37:
                        case androidx.media3.extractor.flac.FlacConstants.STREAM_INFO_BLOCK_SIZE /* 38 */:
                        case androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_PREFIX_SEI /* 39 */:
                        case 40:
                        case 41:
                        case androidx.media3.extractor.AacUtil.AUDIO_OBJECT_TYPE_AAC_XHE /* 42 */:
                        case 43:
                        case 44:
                        case androidx.media3.extractor.ts.TsExtractor.TS_STREAM_TYPE_MHAS /* 45 */:
                        case 46:
                        case 47:
                        case androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED /* 48 */:
                        case com.revenuecat.purchases.utils.PurchaseParamsValidator.MAX_NUMBER_OF_ADD_ON_PRODUCTS /* 49 */:
                            com.google.android.gms.internal.play_billing.AbstractC1844h0 abstractC1844h0 = (com.google.android.gms.internal.play_billing.AbstractC1844h0) ((com.google.android.gms.internal.play_billing.InterfaceC1885z0) com.google.android.gms.internal.play_billing.AbstractC1830c1.g(j9, obj));
                            if (abstractC1844h0.f19335h) {
                                abstractC1844h0.f19335h = false;
                            }
                            break;
                        case 50:
                            sun.misc.Unsafe unsafe = f19260k;
                            java.lang.Object object = unsafe.getObject(obj, j9);
                            if (object != null) {
                                ((com.google.android.gms.internal.play_billing.H0) object).f19222h = false;
                                unsafe.putObject(obj, j9, object);
                            }
                            break;
                    }
                } else if (s(iArr[i3], i3, obj)) {
                    B(i3).a(f19260k.getObject(obj, j9));
                }
            } else if (p(i3, obj)) {
                B(i3).a(f19260k.getObject(obj, j9));
            }
            i3 += 3;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:17:0x004e  */
    @Override // com.google.android.gms.internal.play_billing.T0
    public final void b(java.lang.Object obj, com.google.android.gms.internal.play_billing.G0 g9) throws androidx.datastore.preferences.protobuf.C1504k {
        int i3;
        int i9;
        boolean z6;
        boolean z9;
        boolean z10 = true;
        int i10 = 3;
        sun.misc.Unsafe unsafe = f19260k;
        int i11 = 1048575;
        int i12 = 1048575;
        int i13 = 0;
        int i14 = 0;
        while (true) {
            int[] iArr = this.f19261a;
            if (i13 >= iArr.length) {
                ((com.google.android.gms.internal.play_billing.AbstractC1877v0) obj).zzc.d(g9);
                return;
            }
            int iY = y(i13);
            int iX = x(iY);
            int i15 = iArr[i13];
            if (iX <= 17) {
                int i16 = iArr[i13 + 2];
                int i17 = i16 & i11;
                if (i17 != i12) {
                    i14 = i17 == i11 ? 0 : unsafe.getInt(obj, i17);
                    i12 = i17;
                }
                i3 = (z10 ? 1 : 0) << (i16 >>> 20);
            } else {
                i3 = 0;
            }
            long j9 = iY & i11;
            switch (iX) {
                case 0:
                    z10 = z10 ? 1 : 0;
                    if (q(obj, i13, i12, i14, i3)) {
                        ((com.google.android.gms.internal.play_billing.C1866p0) g9.f19215a).L(i15, java.lang.Double.doubleToRawLongBits(com.google.android.gms.internal.play_billing.AbstractC1830c1.f19310c.a(j9, obj)));
                    }
                    i10 = 3;
                    i13 += 3;
                    z10 = z10;
                    i10 = i10;
                    i11 = 1048575;
                    break;
                case 1:
                    z10 = z10 ? 1 : 0;
                    if (q(obj, i13, i12, i14, i3)) {
                        ((com.google.android.gms.internal.play_billing.C1866p0) g9.f19215a).J(i15, java.lang.Float.floatToRawIntBits(com.google.android.gms.internal.play_billing.AbstractC1830c1.f19310c.b(j9, obj)));
                    }
                    i10 = 3;
                    i13 += 3;
                    z10 = z10;
                    i10 = i10;
                    i11 = 1048575;
                    break;
                case 2:
                    z10 = z10 ? 1 : 0;
                    if (q(obj, i13, i12, i14, i3)) {
                        ((com.google.android.gms.internal.play_billing.C1866p0) g9.f19215a).S(i15, unsafe.getLong(obj, j9));
                    }
                    i10 = 3;
                    i13 += 3;
                    z10 = z10;
                    i10 = i10;
                    i11 = 1048575;
                    break;
                case 3:
                    z10 = z10 ? 1 : 0;
                    if (q(obj, i13, i12, i14, i3)) {
                        ((com.google.android.gms.internal.play_billing.C1866p0) g9.f19215a).S(i15, unsafe.getLong(obj, j9));
                    }
                    i10 = 3;
                    i13 += 3;
                    z10 = z10;
                    i10 = i10;
                    i11 = 1048575;
                    break;
                case 4:
                    z10 = z10 ? 1 : 0;
                    if (q(obj, i13, i12, i14, i3)) {
                        ((com.google.android.gms.internal.play_billing.C1866p0) g9.f19215a).N(i15, unsafe.getInt(obj, j9));
                    }
                    i10 = 3;
                    i13 += 3;
                    z10 = z10;
                    i10 = i10;
                    i11 = 1048575;
                    break;
                case 5:
                    z10 = z10 ? 1 : 0;
                    if (q(obj, i13, i12, i14, i3)) {
                        ((com.google.android.gms.internal.play_billing.C1866p0) g9.f19215a).L(i15, unsafe.getLong(obj, j9));
                    }
                    i10 = 3;
                    i13 += 3;
                    z10 = z10;
                    i10 = i10;
                    i11 = 1048575;
                    break;
                case 6:
                    z10 = z10 ? 1 : 0;
                    if (q(obj, i13, i12, i14, i3)) {
                        ((com.google.android.gms.internal.play_billing.C1866p0) g9.f19215a).J(i15, unsafe.getInt(obj, j9));
                    }
                    i10 = 3;
                    i13 += 3;
                    z10 = z10;
                    i10 = i10;
                    i11 = 1048575;
                    break;
                case 7:
                    z10 = z10 ? 1 : 0;
                    if (q(obj, i13, i12, i14, i3)) {
                        boolean zG = com.google.android.gms.internal.play_billing.AbstractC1830c1.f19310c.g(j9, obj);
                        com.google.android.gms.internal.play_billing.C1866p0 c1866p0 = (com.google.android.gms.internal.play_billing.C1866p0) g9.f19215a;
                        c1866p0.R(i15 << 3);
                        c1866p0.H(zG ? (byte) 1 : (byte) 0);
                    }
                    i10 = 3;
                    i13 += 3;
                    z10 = z10;
                    i10 = i10;
                    i11 = 1048575;
                    break;
                case 8:
                    z10 = z10 ? 1 : 0;
                    if (q(obj, i13, i12, i14, i3)) {
                        java.lang.Object object = unsafe.getObject(obj, j9);
                        if (object instanceof java.lang.String) {
                            java.lang.String str = (java.lang.String) object;
                            com.google.android.gms.internal.play_billing.C1866p0 c1866p1 = (com.google.android.gms.internal.play_billing.C1866p0) g9.f19215a;
                            c1866p1.R((i15 << 3) | 2);
                            int i18 = c1866p1.f19375o;
                            try {
                                int iU = com.google.android.gms.internal.play_billing.C1866p0.U(str.length() * 3);
                                int iU2 = com.google.android.gms.internal.play_billing.C1866p0.U(str.length());
                                byte[] bArr = c1866p1.f19373m;
                                int i19 = c1866p1.f19374n;
                                if (iU2 == iU) {
                                    int i20 = i18 + iU2;
                                    c1866p1.f19375o = i20;
                                    int iA = com.google.android.gms.internal.play_billing.AbstractC1839f1.a(str, bArr, i20, i19 - i20);
                                    c1866p1.f19375o = i18;
                                    c1866p1.R((iA - i18) - iU2);
                                    c1866p1.f19375o = iA;
                                } else {
                                    c1866p1.R(com.google.android.gms.internal.play_billing.AbstractC1839f1.b(str));
                                    int i21 = c1866p1.f19375o;
                                    c1866p1.f19375o = com.google.android.gms.internal.play_billing.AbstractC1839f1.a(str, bArr, i21, i19 - i21);
                                }
                            } catch (java.lang.IndexOutOfBoundsException e6) {
                                throw new androidx.datastore.preferences.protobuf.C1504k("CodedOutputStream was writing to a flat byte array and ran out of space.", e6);
                            }
                        } else {
                            com.google.android.gms.internal.play_billing.AbstractC1859m0 abstractC1859m0 = (com.google.android.gms.internal.play_billing.AbstractC1859m0) object;
                            com.google.android.gms.internal.play_billing.C1866p0 c1866p2 = (com.google.android.gms.internal.play_billing.C1866p0) g9.f19215a;
                            c1866p2.R((i15 << 3) | 2);
                            c1866p2.R(abstractC1859m0.n());
                            abstractC1859m0.p(c1866p2);
                        }
                    }
                    i10 = 3;
                    i13 += 3;
                    z10 = z10;
                    i10 = i10;
                    i11 = 1048575;
                    break;
                case 9:
                    z10 = z10 ? 1 : 0;
                    if (q(obj, i13, i12, i14, i3)) {
                        g9.c(i15, unsafe.getObject(obj, j9), B(i13));
                    }
                    i10 = 3;
                    i13 += 3;
                    z10 = z10;
                    i10 = i10;
                    i11 = 1048575;
                    break;
                case 10:
                    z10 = z10 ? 1 : 0;
                    if (q(obj, i13, i12, i14, i3)) {
                        com.google.android.gms.internal.play_billing.AbstractC1859m0 abstractC1859m1 = (com.google.android.gms.internal.play_billing.AbstractC1859m0) unsafe.getObject(obj, j9);
                        com.google.android.gms.internal.play_billing.C1866p0 c1866p3 = (com.google.android.gms.internal.play_billing.C1866p0) g9.f19215a;
                        c1866p3.R((i15 << 3) | 2);
                        c1866p3.R(abstractC1859m1.n());
                        abstractC1859m1.p(c1866p3);
                    }
                    i10 = 3;
                    i13 += 3;
                    z10 = z10;
                    i10 = i10;
                    i11 = 1048575;
                    break;
                case 11:
                    z10 = z10 ? 1 : 0;
                    if (q(obj, i13, i12, i14, i3)) {
                        ((com.google.android.gms.internal.play_billing.C1866p0) g9.f19215a).Q(i15, unsafe.getInt(obj, j9));
                    }
                    i10 = 3;
                    i13 += 3;
                    z10 = z10;
                    i10 = i10;
                    i11 = 1048575;
                    break;
                case 12:
                    z10 = z10 ? 1 : 0;
                    if (q(obj, i13, i12, i14, i3)) {
                        ((com.google.android.gms.internal.play_billing.C1866p0) g9.f19215a).N(i15, unsafe.getInt(obj, j9));
                    }
                    i10 = 3;
                    i13 += 3;
                    z10 = z10;
                    i10 = i10;
                    i11 = 1048575;
                    break;
                case 13:
                    z10 = z10 ? 1 : 0;
                    if (q(obj, i13, i12, i14, i3)) {
                        ((com.google.android.gms.internal.play_billing.C1866p0) g9.f19215a).J(i15, unsafe.getInt(obj, j9));
                    }
                    i10 = 3;
                    i13 += 3;
                    z10 = z10;
                    i10 = i10;
                    i11 = 1048575;
                    break;
                case 14:
                    z10 = z10 ? 1 : 0;
                    if (q(obj, i13, i12, i14, i3)) {
                        ((com.google.android.gms.internal.play_billing.C1866p0) g9.f19215a).L(i15, unsafe.getLong(obj, j9));
                    }
                    i10 = 3;
                    i13 += 3;
                    z10 = z10;
                    i10 = i10;
                    i11 = 1048575;
                    break;
                case 15:
                    z10 = z10 ? 1 : 0;
                    if (q(obj, i13, i12, i14, i3)) {
                        int i22 = unsafe.getInt(obj, j9);
                        ((com.google.android.gms.internal.play_billing.C1866p0) g9.f19215a).Q(i15, (i22 >> 31) ^ (i22 + i22));
                    }
                    i10 = 3;
                    i13 += 3;
                    z10 = z10;
                    i10 = i10;
                    i11 = 1048575;
                    break;
                case 16:
                    z10 = z10 ? 1 : 0;
                    if (q(obj, i13, i12, i14, i3)) {
                        long j10 = unsafe.getLong(obj, j9);
                        ((com.google.android.gms.internal.play_billing.C1866p0) g9.f19215a).S(i15, (j10 >> 63) ^ (j10 + j10));
                    }
                    i10 = 3;
                    i13 += 3;
                    z10 = z10;
                    i10 = i10;
                    i11 = 1048575;
                    break;
                case 17:
                    z10 = z10 ? 1 : 0;
                    if (q(obj, i13, i12, i14, i3)) {
                        java.lang.Object object2 = unsafe.getObject(obj, j9);
                        com.google.android.gms.internal.play_billing.T0 t0B = B(i13);
                        g9.getClass();
                        com.google.android.gms.internal.play_billing.C1866p0 c1866p4 = (com.google.android.gms.internal.play_billing.C1866p0) g9.f19215a;
                        c1866p4.P(i15, 3);
                        t0B.b((com.google.android.gms.internal.play_billing.AbstractC1841g0) object2, g9);
                        c1866p4.P(i15, 4);
                    }
                    i10 = 3;
                    i13 += 3;
                    z10 = z10;
                    i10 = i10;
                    i11 = 1048575;
                    break;
                case 18:
                    i9 = i13;
                    com.google.android.gms.internal.play_billing.U0.r(iArr[i9], (java.util.List) unsafe.getObject(obj, j9), g9, false);
                    i13 = i9;
                    i10 = 3;
                    i13 += 3;
                    z10 = z10;
                    i10 = i10;
                    i11 = 1048575;
                    break;
                case 19:
                    i9 = i13;
                    com.google.android.gms.internal.play_billing.U0.v(iArr[i9], (java.util.List) unsafe.getObject(obj, j9), g9, false);
                    i13 = i9;
                    i10 = 3;
                    i13 += 3;
                    z10 = z10;
                    i10 = i10;
                    i11 = 1048575;
                    break;
                case 20:
                    i9 = i13;
                    com.google.android.gms.internal.play_billing.U0.x(iArr[i9], (java.util.List) unsafe.getObject(obj, j9), g9, false);
                    i13 = i9;
                    i10 = 3;
                    i13 += 3;
                    z10 = z10;
                    i10 = i10;
                    i11 = 1048575;
                    break;
                case 21:
                    i9 = i13;
                    com.google.android.gms.internal.play_billing.U0.e(iArr[i9], (java.util.List) unsafe.getObject(obj, j9), g9, false);
                    i13 = i9;
                    i10 = 3;
                    i13 += 3;
                    z10 = z10;
                    i10 = i10;
                    i11 = 1048575;
                    break;
                case 22:
                    i9 = i13;
                    com.google.android.gms.internal.play_billing.U0.w(iArr[i9], (java.util.List) unsafe.getObject(obj, j9), g9, false);
                    i13 = i9;
                    i10 = 3;
                    i13 += 3;
                    z10 = z10;
                    i10 = i10;
                    i11 = 1048575;
                    break;
                case 23:
                    i9 = i13;
                    com.google.android.gms.internal.play_billing.U0.u(iArr[i9], (java.util.List) unsafe.getObject(obj, j9), g9, false);
                    i13 = i9;
                    i10 = 3;
                    i13 += 3;
                    z10 = z10;
                    i10 = i10;
                    i11 = 1048575;
                    break;
                case 24:
                    i9 = i13;
                    com.google.android.gms.internal.play_billing.U0.t(iArr[i9], (java.util.List) unsafe.getObject(obj, j9), g9, false);
                    i13 = i9;
                    i10 = 3;
                    i13 += 3;
                    z10 = z10;
                    i10 = i10;
                    i11 = 1048575;
                    break;
                case 25:
                    i9 = i13;
                    com.google.android.gms.internal.play_billing.U0.q(iArr[i9], (java.util.List) unsafe.getObject(obj, j9), g9, false);
                    i13 = i9;
                    i10 = 3;
                    i13 += 3;
                    z10 = z10;
                    i10 = i10;
                    i11 = 1048575;
                    break;
                case 26:
                    int i23 = iArr[i13];
                    java.util.List list = (java.util.List) unsafe.getObject(obj, j9);
                    com.google.android.gms.internal.play_billing.C1873t0 c1873t0 = com.google.android.gms.internal.play_billing.U0.f19291a;
                    if (list != null && !list.isEmpty()) {
                        g9.getClass();
                        int i24 = 0;
                        while (i24 < list.size()) {
                            java.lang.String str2 = (java.lang.String) list.get(i24);
                            com.google.android.gms.internal.play_billing.C1866p0 c1866p5 = (com.google.android.gms.internal.play_billing.C1866p0) g9.f19215a;
                            c1866p5.R((i23 << 3) | 2);
                            int i25 = c1866p5.f19375o;
                            try {
                                int iU3 = com.google.android.gms.internal.play_billing.C1866p0.U(str2.length() * i10);
                                int iU4 = com.google.android.gms.internal.play_billing.C1866p0.U(str2.length());
                                byte[] bArr2 = c1866p5.f19373m;
                                int i26 = i13;
                                int i27 = c1866p5.f19374n;
                                if (iU4 == iU3) {
                                    int i28 = i25 + iU4;
                                    c1866p5.f19375o = i28;
                                    int iA2 = com.google.android.gms.internal.play_billing.AbstractC1839f1.a(str2, bArr2, i28, i27 - i28);
                                    c1866p5.f19375o = i25;
                                    c1866p5.R((iA2 - i25) - iU4);
                                    c1866p5.f19375o = iA2;
                                } else {
                                    c1866p5.R(com.google.android.gms.internal.play_billing.AbstractC1839f1.b(str2));
                                    int i29 = c1866p5.f19375o;
                                    c1866p5.f19375o = com.google.android.gms.internal.play_billing.AbstractC1839f1.a(str2, bArr2, i29, i27 - i29);
                                }
                                i24++;
                                i13 = i26;
                                i10 = 3;
                            } catch (java.lang.IndexOutOfBoundsException e9) {
                                throw new androidx.datastore.preferences.protobuf.C1504k("CodedOutputStream was writing to a flat byte array and ran out of space.", e9);
                            }
                        }
                    }
                    z10 = true;
                    i10 = i10;
                    i13 += 3;
                    z10 = z10;
                    i10 = i10;
                    i11 = 1048575;
                    break;
                case 27:
                    int i30 = iArr[i13];
                    java.util.List list2 = (java.util.List) unsafe.getObject(obj, j9);
                    com.google.android.gms.internal.play_billing.T0 t0B2 = B(i13);
                    com.google.android.gms.internal.play_billing.C1873t0 c1873t1 = com.google.android.gms.internal.play_billing.U0.f19291a;
                    if (list2 != null && !list2.isEmpty()) {
                        for (int i31 = 0; i31 < list2.size(); i31++) {
                            g9.c(i30, list2.get(i31), t0B2);
                        }
                    }
                    z10 = true;
                    i13 += 3;
                    z10 = z10;
                    i10 = i10;
                    i11 = 1048575;
                    break;
                case 28:
                    int i32 = iArr[i13];
                    java.util.List list3 = (java.util.List) unsafe.getObject(obj, j9);
                    com.google.android.gms.internal.play_billing.C1873t0 c1873t2 = com.google.android.gms.internal.play_billing.U0.f19291a;
                    if (list3 != null && !list3.isEmpty()) {
                        g9.getClass();
                        for (int i33 = 0; i33 < list3.size(); i33++) {
                            com.google.android.gms.internal.play_billing.AbstractC1859m0 abstractC1859m2 = (com.google.android.gms.internal.play_billing.AbstractC1859m0) list3.get(i33);
                            com.google.android.gms.internal.play_billing.C1866p0 c1866p6 = (com.google.android.gms.internal.play_billing.C1866p0) g9.f19215a;
                            c1866p6.R((i32 << 3) | 2);
                            c1866p6.R(abstractC1859m2.n());
                            abstractC1859m2.p(c1866p6);
                        }
                    }
                    z10 = true;
                    i13 += 3;
                    z10 = z10;
                    i10 = i10;
                    i11 = 1048575;
                    break;
                case 29:
                    z6 = false;
                    com.google.android.gms.internal.play_billing.U0.d(iArr[i13], (java.util.List) unsafe.getObject(obj, j9), g9, false);
                    z10 = true;
                    i13 += 3;
                    z10 = z10;
                    i10 = i10;
                    i11 = 1048575;
                    break;
                case 30:
                    z6 = false;
                    com.google.android.gms.internal.play_billing.U0.s(iArr[i13], (java.util.List) unsafe.getObject(obj, j9), g9, false);
                    z10 = true;
                    i13 += 3;
                    z10 = z10;
                    i10 = i10;
                    i11 = 1048575;
                    break;
                case 31:
                    z6 = false;
                    com.google.android.gms.internal.play_billing.U0.y(iArr[i13], (java.util.List) unsafe.getObject(obj, j9), g9, false);
                    z10 = true;
                    i13 += 3;
                    z10 = z10;
                    i10 = i10;
                    i11 = 1048575;
                    break;
                case 32:
                    z6 = false;
                    com.google.android.gms.internal.play_billing.U0.a(iArr[i13], (java.util.List) unsafe.getObject(obj, j9), g9, false);
                    z10 = true;
                    i13 += 3;
                    z10 = z10;
                    i10 = i10;
                    i11 = 1048575;
                    break;
                case 33:
                    z6 = false;
                    com.google.android.gms.internal.play_billing.U0.b(iArr[i13], (java.util.List) unsafe.getObject(obj, j9), g9, false);
                    z10 = true;
                    i13 += 3;
                    z10 = z10;
                    i10 = i10;
                    i11 = 1048575;
                    break;
                case 34:
                    z6 = false;
                    com.google.android.gms.internal.play_billing.U0.c(iArr[i13], (java.util.List) unsafe.getObject(obj, j9), g9, false);
                    z10 = true;
                    i13 += 3;
                    z10 = z10;
                    i10 = i10;
                    i11 = 1048575;
                    break;
                case 35:
                    z9 = z10 ? 1 : 0;
                    com.google.android.gms.internal.play_billing.U0.r(iArr[i13], (java.util.List) unsafe.getObject(obj, j9), g9, z9);
                    i10 = i10;
                    z10 = z9;
                    i13 += 3;
                    z10 = z10;
                    i10 = i10;
                    i11 = 1048575;
                    break;
                case androidx.media3.extractor.ts.TsExtractor.TS_STREAM_TYPE_H265 /* 36 */:
                    z9 = z10 ? 1 : 0;
                    com.google.android.gms.internal.play_billing.U0.v(iArr[i13], (java.util.List) unsafe.getObject(obj, j9), g9, z9);
                    i10 = i10;
                    z10 = z9;
                    i13 += 3;
                    z10 = z10;
                    i10 = i10;
                    i11 = 1048575;
                    break;
                case 37:
                    z9 = z10 ? 1 : 0;
                    com.google.android.gms.internal.play_billing.U0.x(iArr[i13], (java.util.List) unsafe.getObject(obj, j9), g9, z9);
                    i10 = i10;
                    z10 = z9;
                    i13 += 3;
                    z10 = z10;
                    i10 = i10;
                    i11 = 1048575;
                    break;
                case androidx.media3.extractor.flac.FlacConstants.STREAM_INFO_BLOCK_SIZE /* 38 */:
                    z9 = z10 ? 1 : 0;
                    com.google.android.gms.internal.play_billing.U0.e(iArr[i13], (java.util.List) unsafe.getObject(obj, j9), g9, z9);
                    i10 = i10;
                    z10 = z9;
                    i13 += 3;
                    z10 = z10;
                    i10 = i10;
                    i11 = 1048575;
                    break;
                case androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_PREFIX_SEI /* 39 */:
                    z9 = z10 ? 1 : 0;
                    com.google.android.gms.internal.play_billing.U0.w(iArr[i13], (java.util.List) unsafe.getObject(obj, j9), g9, z9);
                    i10 = i10;
                    z10 = z9;
                    i13 += 3;
                    z10 = z10;
                    i10 = i10;
                    i11 = 1048575;
                    break;
                case 40:
                    z9 = z10 ? 1 : 0;
                    com.google.android.gms.internal.play_billing.U0.u(iArr[i13], (java.util.List) unsafe.getObject(obj, j9), g9, z9);
                    i10 = i10;
                    z10 = z9;
                    i13 += 3;
                    z10 = z10;
                    i10 = i10;
                    i11 = 1048575;
                    break;
                case 41:
                    z9 = z10 ? 1 : 0;
                    com.google.android.gms.internal.play_billing.U0.t(iArr[i13], (java.util.List) unsafe.getObject(obj, j9), g9, z9);
                    i10 = i10;
                    z10 = z9;
                    i13 += 3;
                    z10 = z10;
                    i10 = i10;
                    i11 = 1048575;
                    break;
                case androidx.media3.extractor.AacUtil.AUDIO_OBJECT_TYPE_AAC_XHE /* 42 */:
                    z9 = z10 ? 1 : 0;
                    com.google.android.gms.internal.play_billing.U0.q(iArr[i13], (java.util.List) unsafe.getObject(obj, j9), g9, z9);
                    i10 = i10;
                    z10 = z9;
                    i13 += 3;
                    z10 = z10;
                    i10 = i10;
                    i11 = 1048575;
                    break;
                case 43:
                    z9 = z10 ? 1 : 0;
                    com.google.android.gms.internal.play_billing.U0.d(iArr[i13], (java.util.List) unsafe.getObject(obj, j9), g9, z9);
                    i10 = i10;
                    z10 = z9;
                    i13 += 3;
                    z10 = z10;
                    i10 = i10;
                    i11 = 1048575;
                    break;
                case 44:
                    z9 = z10 ? 1 : 0;
                    com.google.android.gms.internal.play_billing.U0.s(iArr[i13], (java.util.List) unsafe.getObject(obj, j9), g9, z9);
                    i10 = i10;
                    z10 = z9;
                    i13 += 3;
                    z10 = z10;
                    i10 = i10;
                    i11 = 1048575;
                    break;
                case androidx.media3.extractor.ts.TsExtractor.TS_STREAM_TYPE_MHAS /* 45 */:
                    z9 = z10 ? 1 : 0;
                    com.google.android.gms.internal.play_billing.U0.y(iArr[i13], (java.util.List) unsafe.getObject(obj, j9), g9, z9);
                    i10 = i10;
                    z10 = z9;
                    i13 += 3;
                    z10 = z10;
                    i10 = i10;
                    i11 = 1048575;
                    break;
                case 46:
                    z9 = z10 ? 1 : 0;
                    com.google.android.gms.internal.play_billing.U0.a(iArr[i13], (java.util.List) unsafe.getObject(obj, j9), g9, z9);
                    i10 = i10;
                    z10 = z9;
                    i13 += 3;
                    z10 = z10;
                    i10 = i10;
                    i11 = 1048575;
                    break;
                case 47:
                    z9 = z10 ? 1 : 0;
                    com.google.android.gms.internal.play_billing.U0.b(iArr[i13], (java.util.List) unsafe.getObject(obj, j9), g9, z9);
                    i10 = i10;
                    z10 = z9;
                    i13 += 3;
                    z10 = z10;
                    i10 = i10;
                    i11 = 1048575;
                    break;
                case androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED /* 48 */:
                    z10 = z10 ? 1 : 0;
                    com.google.android.gms.internal.play_billing.U0.c(iArr[i13], (java.util.List) unsafe.getObject(obj, j9), g9, z10);
                    i10 = i10;
                    i13 += 3;
                    z10 = z10;
                    i10 = i10;
                    i11 = 1048575;
                    break;
                case com.revenuecat.purchases.utils.PurchaseParamsValidator.MAX_NUMBER_OF_ADD_ON_PRODUCTS /* 49 */:
                    z10 = z10 ? 1 : 0;
                    int i34 = iArr[i13];
                    java.util.List list4 = (java.util.List) unsafe.getObject(obj, j9);
                    com.google.android.gms.internal.play_billing.T0 t0B3 = B(i13);
                    com.google.android.gms.internal.play_billing.C1873t0 c1873t3 = com.google.android.gms.internal.play_billing.U0.f19291a;
                    if (list4 != null && !list4.isEmpty()) {
                        for (int i35 = 0; i35 < list4.size(); i35++) {
                            java.lang.Object obj2 = list4.get(i35);
                            g9.getClass();
                            com.google.android.gms.internal.play_billing.C1866p0 c1866p7 = (com.google.android.gms.internal.play_billing.C1866p0) g9.f19215a;
                            c1866p7.P(i34, i10);
                            t0B3.b((com.google.android.gms.internal.play_billing.AbstractC1841g0) obj2, g9);
                            c1866p7.P(i34, 4);
                        }
                    }
                    i10 = i10;
                    i13 += 3;
                    z10 = z10;
                    i10 = i10;
                    i11 = 1048575;
                    break;
                case 50:
                    z10 = z10 ? 1 : 0;
                    if (unsafe.getObject(obj, j9) != null) {
                        int i36 = i13 / i10;
                        throw p121o0.p.i(this.f19262b[i36 + i36]);
                    }
                    i10 = i10;
                    i13 += 3;
                    z10 = z10;
                    i10 = i10;
                    i11 = 1048575;
                    break;
                case 51:
                    z10 = z10 ? 1 : 0;
                    if (s(i15, i13, obj)) {
                        ((com.google.android.gms.internal.play_billing.C1866p0) g9.f19215a).L(i15, java.lang.Double.doubleToRawLongBits(((java.lang.Double) com.google.android.gms.internal.play_billing.AbstractC1830c1.g(j9, obj)).doubleValue()));
                    }
                    i10 = i10;
                    i13 += 3;
                    z10 = z10;
                    i10 = i10;
                    i11 = 1048575;
                    break;
                case 52:
                    z10 = z10 ? 1 : 0;
                    if (s(i15, i13, obj)) {
                        ((com.google.android.gms.internal.play_billing.C1866p0) g9.f19215a).J(i15, java.lang.Float.floatToRawIntBits(((java.lang.Float) com.google.android.gms.internal.play_billing.AbstractC1830c1.g(j9, obj)).floatValue()));
                    }
                    i10 = i10;
                    i13 += 3;
                    z10 = z10;
                    i10 = i10;
                    i11 = 1048575;
                    break;
                case 53:
                    z10 = z10 ? 1 : 0;
                    if (s(i15, i13, obj)) {
                        ((com.google.android.gms.internal.play_billing.C1866p0) g9.f19215a).S(i15, z(j9, obj));
                    }
                    i10 = i10;
                    i13 += 3;
                    z10 = z10;
                    i10 = i10;
                    i11 = 1048575;
                    break;
                case 54:
                    z10 = z10 ? 1 : 0;
                    if (s(i15, i13, obj)) {
                        ((com.google.android.gms.internal.play_billing.C1866p0) g9.f19215a).S(i15, z(j9, obj));
                    }
                    i10 = i10;
                    i13 += 3;
                    z10 = z10;
                    i10 = i10;
                    i11 = 1048575;
                    break;
                case 55:
                    z10 = z10 ? 1 : 0;
                    if (s(i15, i13, obj)) {
                        ((com.google.android.gms.internal.play_billing.C1866p0) g9.f19215a).N(i15, v(j9, obj));
                    }
                    i10 = i10;
                    i13 += 3;
                    z10 = z10;
                    i10 = i10;
                    i11 = 1048575;
                    break;
                case 56:
                    z10 = z10 ? 1 : 0;
                    if (s(i15, i13, obj)) {
                        ((com.google.android.gms.internal.play_billing.C1866p0) g9.f19215a).L(i15, z(j9, obj));
                    }
                    i10 = i10;
                    i13 += 3;
                    z10 = z10;
                    i10 = i10;
                    i11 = 1048575;
                    break;
                case 57:
                    z10 = z10 ? 1 : 0;
                    if (s(i15, i13, obj)) {
                        ((com.google.android.gms.internal.play_billing.C1866p0) g9.f19215a).J(i15, v(j9, obj));
                    }
                    i10 = i10;
                    i13 += 3;
                    z10 = z10;
                    i10 = i10;
                    i11 = 1048575;
                    break;
                case 58:
                    z10 = z10 ? 1 : 0;
                    if (s(i15, i13, obj)) {
                        boolean zBooleanValue = ((java.lang.Boolean) com.google.android.gms.internal.play_billing.AbstractC1830c1.g(j9, obj)).booleanValue();
                        com.google.android.gms.internal.play_billing.C1866p0 c1866p8 = (com.google.android.gms.internal.play_billing.C1866p0) g9.f19215a;
                        c1866p8.R(i15 << 3);
                        c1866p8.H(zBooleanValue ? (byte) 1 : (byte) 0);
                    }
                    i10 = i10;
                    i13 += 3;
                    z10 = z10;
                    i10 = i10;
                    i11 = 1048575;
                    break;
                case 59:
                    if (s(i15, i13, obj)) {
                        java.lang.Object object3 = unsafe.getObject(obj, j9);
                        if (object3 instanceof java.lang.String) {
                            java.lang.String str3 = (java.lang.String) object3;
                            com.google.android.gms.internal.play_billing.C1866p0 c1866p9 = (com.google.android.gms.internal.play_billing.C1866p0) g9.f19215a;
                            c1866p9.R((i15 << 3) | 2);
                            int i37 = c1866p9.f19375o;
                            try {
                                int iU5 = com.google.android.gms.internal.play_billing.C1866p0.U(str3.length() * i10);
                                int iU6 = com.google.android.gms.internal.play_billing.C1866p0.U(str3.length());
                                byte[] bArr3 = c1866p9.f19373m;
                                z10 = z10 ? 1 : 0;
                                int i38 = c1866p9.f19374n;
                                if (iU6 == iU5) {
                                    int i39 = i37 + iU6;
                                    c1866p9.f19375o = i39;
                                    int iA3 = com.google.android.gms.internal.play_billing.AbstractC1839f1.a(str3, bArr3, i39, i38 - i39);
                                    c1866p9.f19375o = i37;
                                    c1866p9.R((iA3 - i37) - iU6);
                                    c1866p9.f19375o = iA3;
                                } else {
                                    c1866p9.R(com.google.android.gms.internal.play_billing.AbstractC1839f1.b(str3));
                                    int i40 = c1866p9.f19375o;
                                    c1866p9.f19375o = com.google.android.gms.internal.play_billing.AbstractC1839f1.a(str3, bArr3, i40, i38 - i40);
                                }
                            } catch (java.lang.IndexOutOfBoundsException e10) {
                                throw new androidx.datastore.preferences.protobuf.C1504k("CodedOutputStream was writing to a flat byte array and ran out of space.", e10);
                            }
                        } else {
                            z10 = z10 ? 1 : 0;
                            com.google.android.gms.internal.play_billing.AbstractC1859m0 abstractC1859m3 = (com.google.android.gms.internal.play_billing.AbstractC1859m0) object3;
                            com.google.android.gms.internal.play_billing.C1866p0 c1866p10 = (com.google.android.gms.internal.play_billing.C1866p0) g9.f19215a;
                            c1866p10.R((i15 << 3) | 2);
                            c1866p10.R(abstractC1859m3.n());
                            abstractC1859m3.p(c1866p10);
                        }
                    } else {
                        z10 = z10 ? 1 : 0;
                    }
                    i10 = i10;
                    i13 += 3;
                    z10 = z10;
                    i10 = i10;
                    i11 = 1048575;
                    break;
                case dev.jdtech.mpv.MPVLib.MPV_LOG_LEVEL_DEBUG /* 60 */:
                    if (s(i15, i13, obj)) {
                        g9.c(i15, unsafe.getObject(obj, j9), B(i13));
                    }
                    z10 = z10 ? 1 : 0;
                    i10 = i10;
                    i13 += 3;
                    z10 = z10;
                    i10 = i10;
                    i11 = 1048575;
                    break;
                case 61:
                    if (s(i15, i13, obj)) {
                        com.google.android.gms.internal.play_billing.AbstractC1859m0 abstractC1859m4 = (com.google.android.gms.internal.play_billing.AbstractC1859m0) unsafe.getObject(obj, j9);
                        com.google.android.gms.internal.play_billing.C1866p0 c1866p11 = (com.google.android.gms.internal.play_billing.C1866p0) g9.f19215a;
                        c1866p11.R((i15 << 3) | 2);
                        c1866p11.R(abstractC1859m4.n());
                        abstractC1859m4.p(c1866p11);
                    }
                    z10 = z10 ? 1 : 0;
                    i10 = i10;
                    i13 += 3;
                    z10 = z10;
                    i10 = i10;
                    i11 = 1048575;
                    break;
                case 62:
                    if (s(i15, i13, obj)) {
                        ((com.google.android.gms.internal.play_billing.C1866p0) g9.f19215a).Q(i15, v(j9, obj));
                    }
                    z10 = z10 ? 1 : 0;
                    i10 = i10;
                    i13 += 3;
                    z10 = z10;
                    i10 = i10;
                    i11 = 1048575;
                    break;
                case 63:
                    if (s(i15, i13, obj)) {
                        ((com.google.android.gms.internal.play_billing.C1866p0) g9.f19215a).N(i15, v(j9, obj));
                    }
                    z10 = z10 ? 1 : 0;
                    i10 = i10;
                    i13 += 3;
                    z10 = z10;
                    i10 = i10;
                    i11 = 1048575;
                    break;
                case 64:
                    if (s(i15, i13, obj)) {
                        ((com.google.android.gms.internal.play_billing.C1866p0) g9.f19215a).J(i15, v(j9, obj));
                    }
                    z10 = z10 ? 1 : 0;
                    i10 = i10;
                    i13 += 3;
                    z10 = z10;
                    i10 = i10;
                    i11 = 1048575;
                    break;
                case 65:
                    if (s(i15, i13, obj)) {
                        ((com.google.android.gms.internal.play_billing.C1866p0) g9.f19215a).L(i15, z(j9, obj));
                    }
                    z10 = z10 ? 1 : 0;
                    i10 = i10;
                    i13 += 3;
                    z10 = z10;
                    i10 = i10;
                    i11 = 1048575;
                    break;
                case 66:
                    if (s(i15, i13, obj)) {
                        int iV = v(j9, obj);
                        ((com.google.android.gms.internal.play_billing.C1866p0) g9.f19215a).Q(i15, (iV >> 31) ^ (iV + iV));
                    }
                    z10 = z10 ? 1 : 0;
                    i10 = i10;
                    i13 += 3;
                    z10 = z10;
                    i10 = i10;
                    i11 = 1048575;
                    break;
                case androidx.media3.container.MdtaMetadataEntry.TYPE_INDICATOR_INT32 /* 67 */:
                    if (s(i15, i13, obj)) {
                        long jZ = z(j9, obj);
                        ((com.google.android.gms.internal.play_billing.C1866p0) g9.f19215a).S(i15, (jZ >> 63) ^ (jZ + jZ));
                    }
                    z10 = z10 ? 1 : 0;
                    i10 = i10;
                    i13 += 3;
                    z10 = z10;
                    i10 = i10;
                    i11 = 1048575;
                    break;
                case 68:
                    if (s(i15, i13, obj)) {
                        java.lang.Object object4 = unsafe.getObject(obj, j9);
                        com.google.android.gms.internal.play_billing.T0 t0B4 = B(i13);
                        g9.getClass();
                        com.google.android.gms.internal.play_billing.C1866p0 c1866p12 = (com.google.android.gms.internal.play_billing.C1866p0) g9.f19215a;
                        c1866p12.P(i15, i10);
                        t0B4.b((com.google.android.gms.internal.play_billing.AbstractC1841g0) object4, g9);
                        c1866p12.P(i15, 4);
                    }
                    z10 = z10 ? 1 : 0;
                    i10 = i10;
                    i13 += 3;
                    z10 = z10;
                    i10 = i10;
                    i11 = 1048575;
                    break;
                default:
                    z10 = z10 ? 1 : 0;
                    i10 = i10;
                    i13 += 3;
                    z10 = z10;
                    i10 = i10;
                    i11 = 1048575;
                    break;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:143:0x03c8  */
    /* JADX WARN: Code duplicated, block: B:187:0x04e5  */
    @Override // com.google.android.gms.internal.play_billing.T0
    public final int c(com.google.android.gms.internal.play_billing.AbstractC1877v0 abstractC1877v0) {
        int i3;
        int iU;
        int iV;
        int i9;
        int i10;
        int iC;
        int iU2;
        int size;
        int iO;
        int iU3;
        int iU4;
        int iU5;
        int iC2;
        int iU6;
        int iV2;
        com.google.android.gms.internal.play_billing.AbstractC1877v0 abstractC1877v1 = abstractC1877v0;
        sun.misc.Unsafe unsafe = f19260k;
        int i11 = 1048575;
        int i12 = 0;
        int i13 = 0;
        int iX = 0;
        while (true) {
            int[] iArr = this.f19261a;
            if (i12 >= iArr.length) {
                return abstractC1877v1.zzc.a() + iX;
            }
            int iY = y(i12);
            int iX2 = x(iY);
            int i14 = iArr[i12];
            int i15 = iArr[i12 + 2];
            int i16 = i15 & 1048575;
            if (iX2 <= 17) {
                if (i16 != i11) {
                    i13 = i16 == 1048575 ? 0 : unsafe.getInt(abstractC1877v1, i16);
                    i11 = i16;
                }
                i3 = 1 << (i15 >>> 20);
            } else {
                i3 = 0;
            }
            int i17 = iY & 1048575;
            if (iX2 >= com.google.android.gms.internal.play_billing.EnumC1871s0.f19384i.f19387h) {
                com.google.android.gms.internal.play_billing.EnumC1871s0.j.getClass();
            }
            long j9 = i17;
            switch (iX2) {
                case 0:
                    if (q(abstractC1877v1, i12, i11, i13, i3)) {
                        iX = Y6.f.x(i14 << 3, 8, iX);
                    }
                    i12 += 3;
                    break;
                case 1:
                    if (q(abstractC1877v1, i12, i11, i13, i3)) {
                        iX = Y6.f.x(i14 << 3, 4, iX);
                    }
                    abstractC1877v1 = abstractC1877v0;
                    i12 += 3;
                    break;
                case 2:
                    if (q(abstractC1877v1, i12, i11, i13, i3)) {
                        long j10 = unsafe.getLong(abstractC1877v1, j9);
                        iU = com.google.android.gms.internal.play_billing.C1866p0.U(i14 << 3);
                        iV = com.google.android.gms.internal.play_billing.C1866p0.V(j10);
                        i9 = iV + iU;
                        iX += i9;
                    }
                    i12 += 3;
                    break;
                case 3:
                    if (q(abstractC1877v1, i12, i11, i13, i3)) {
                        long j11 = unsafe.getLong(abstractC1877v1, j9);
                        iU = com.google.android.gms.internal.play_billing.C1866p0.U(i14 << 3);
                        iV = com.google.android.gms.internal.play_billing.C1866p0.V(j11);
                        i9 = iV + iU;
                        iX += i9;
                    }
                    i12 += 3;
                    break;
                case 4:
                    if (q(abstractC1877v1, i12, i11, i13, i3)) {
                        long j12 = unsafe.getInt(abstractC1877v1, j9);
                        iU = com.google.android.gms.internal.play_billing.C1866p0.U(i14 << 3);
                        iV = com.google.android.gms.internal.play_billing.C1866p0.V(j12);
                        i9 = iV + iU;
                        iX += i9;
                    }
                    i12 += 3;
                    break;
                case 5:
                    if (q(abstractC1877v1, i12, i11, i13, i3)) {
                        iX = Y6.f.x(i14 << 3, 8, iX);
                    }
                    abstractC1877v1 = abstractC1877v0;
                    i12 += 3;
                    break;
                case 6:
                    if (q(abstractC1877v1, i12, i11, i13, i3)) {
                        iX = Y6.f.x(i14 << 3, 4, iX);
                    }
                    abstractC1877v1 = abstractC1877v0;
                    i12 += 3;
                    break;
                case 7:
                    if (q(abstractC1877v1, i12, i11, i13, i3)) {
                        iX = Y6.f.x(i14 << 3, 1, iX);
                    }
                    abstractC1877v1 = abstractC1877v0;
                    i12 += 3;
                    break;
                case 8:
                    if (q(abstractC1877v1, i12, i11, i13, i3)) {
                        int i18 = i14 << 3;
                        java.lang.Object object = unsafe.getObject(abstractC1877v1, j9);
                        if (object instanceof com.google.android.gms.internal.play_billing.AbstractC1859m0) {
                            int iU7 = com.google.android.gms.internal.play_billing.C1866p0.U(i18);
                            int iN = ((com.google.android.gms.internal.play_billing.AbstractC1859m0) object).n();
                            iX = com.google.android.gms.internal.play_billing.M0.d(iN, iN, iU7, iX);
                        } else {
                            int iU8 = com.google.android.gms.internal.play_billing.C1866p0.U(i18);
                            int iB = com.google.android.gms.internal.play_billing.AbstractC1839f1.b((java.lang.String) object);
                            iX = com.google.android.gms.internal.play_billing.M0.d(iB, iB, iU8, iX);
                        }
                    }
                    i12 += 3;
                    break;
                case 9:
                    if (q(abstractC1877v1, i12, i11, i13, i3)) {
                        java.lang.Object object2 = unsafe.getObject(abstractC1877v1, j9);
                        com.google.android.gms.internal.play_billing.T0 t0B = B(i12);
                        com.google.android.gms.internal.play_billing.C1873t0 c1873t0 = com.google.android.gms.internal.play_billing.U0.f19291a;
                        int iU9 = com.google.android.gms.internal.play_billing.C1866p0.U(i14 << 3);
                        int iC3 = ((com.google.android.gms.internal.play_billing.AbstractC1841g0) object2).c(t0B);
                        iX = com.google.android.gms.internal.play_billing.M0.d(iC3, iC3, iU9, iX);
                    }
                    i12 += 3;
                    break;
                case 10:
                    if (q(abstractC1877v1, i12, i11, i13, i3)) {
                        com.google.android.gms.internal.play_billing.AbstractC1859m0 abstractC1859m0 = (com.google.android.gms.internal.play_billing.AbstractC1859m0) unsafe.getObject(abstractC1877v1, j9);
                        int iU10 = com.google.android.gms.internal.play_billing.C1866p0.U(i14 << 3);
                        int iN2 = abstractC1859m0.n();
                        iX = com.google.android.gms.internal.play_billing.M0.d(iN2, iN2, iU10, iX);
                    }
                    i12 += 3;
                    break;
                case 11:
                    if (q(abstractC1877v1, i12, i11, i13, i3)) {
                        iX = Y6.f.x(unsafe.getInt(abstractC1877v1, j9), com.google.android.gms.internal.play_billing.C1866p0.U(i14 << 3), iX);
                    }
                    i12 += 3;
                    break;
                case 12:
                    if (q(abstractC1877v1, i12, i11, i13, i3)) {
                        long j13 = unsafe.getInt(abstractC1877v1, j9);
                        iU = com.google.android.gms.internal.play_billing.C1866p0.U(i14 << 3);
                        iV = com.google.android.gms.internal.play_billing.C1866p0.V(j13);
                        i9 = iV + iU;
                        iX += i9;
                    }
                    i12 += 3;
                    break;
                case 13:
                    if (q(abstractC1877v1, i12, i11, i13, i3)) {
                        iX = Y6.f.x(i14 << 3, 4, iX);
                    }
                    abstractC1877v1 = abstractC1877v0;
                    i12 += 3;
                    break;
                case 14:
                    if (q(abstractC1877v1, i12, i11, i13, i3)) {
                        iX = Y6.f.x(i14 << 3, 8, iX);
                    }
                    abstractC1877v1 = abstractC1877v0;
                    i12 += 3;
                    break;
                case 15:
                    if (q(abstractC1877v1, i12, i11, i13, i3)) {
                        int i19 = unsafe.getInt(abstractC1877v1, j9);
                        iX = Y6.f.x((i19 >> 31) ^ (i19 + i19), com.google.android.gms.internal.play_billing.C1866p0.U(i14 << 3), iX);
                    }
                    i12 += 3;
                    break;
                case 16:
                    if (q(abstractC1877v1, i12, i11, i13, i3)) {
                        long j14 = unsafe.getLong(abstractC1877v1, j9);
                        iU = com.google.android.gms.internal.play_billing.C1866p0.U(i14 << 3);
                        iV = com.google.android.gms.internal.play_billing.C1866p0.V((j14 >> 63) ^ (j14 + j14));
                        i9 = iV + iU;
                        iX += i9;
                    }
                    i12 += 3;
                    break;
                case 17:
                    if (q(abstractC1877v1, i12, i11, i13, i3)) {
                        com.google.android.gms.internal.play_billing.AbstractC1841g0 abstractC1841g0 = (com.google.android.gms.internal.play_billing.AbstractC1841g0) unsafe.getObject(abstractC1877v1, j9);
                        com.google.android.gms.internal.play_billing.T0 t0B2 = B(i12);
                        com.google.android.gms.internal.play_billing.C1873t0 c1873t1 = com.google.android.gms.internal.play_billing.U0.f19291a;
                        int iU11 = com.google.android.gms.internal.play_billing.C1866p0.U(i14 << 3);
                        i10 = iU11 + iU11;
                        iC = abstractC1841g0.c(t0B2);
                        i9 = iC + i10;
                        iX += i9;
                    }
                    i12 += 3;
                    break;
                case 18:
                    i9 = com.google.android.gms.internal.play_billing.U0.i(i14, (java.util.List) unsafe.getObject(abstractC1877v1, j9));
                    iX += i9;
                    i12 += 3;
                    break;
                case 19:
                    i9 = com.google.android.gms.internal.play_billing.U0.h(i14, (java.util.List) unsafe.getObject(abstractC1877v1, j9));
                    iX += i9;
                    i12 += 3;
                    break;
                case 20:
                    java.util.List list = (java.util.List) unsafe.getObject(abstractC1877v1, j9);
                    com.google.android.gms.internal.play_billing.C1873t0 c1873t2 = com.google.android.gms.internal.play_billing.U0.f19291a;
                    if (list.size() == 0) {
                        iU2 = 0;
                    } else {
                        iU2 = (com.google.android.gms.internal.play_billing.C1866p0.U(i14 << 3) * list.size()) + com.google.android.gms.internal.play_billing.U0.k(list);
                    }
                    iX += iU2;
                    i12 += 3;
                    break;
                case 21:
                    java.util.List list2 = (java.util.List) unsafe.getObject(abstractC1877v1, j9);
                    com.google.android.gms.internal.play_billing.C1873t0 c1873t3 = com.google.android.gms.internal.play_billing.U0.f19291a;
                    size = list2.size();
                    if (size == 0) {
                        iU4 = 0;
                    } else {
                        iO = com.google.android.gms.internal.play_billing.U0.o(list2);
                        iU3 = com.google.android.gms.internal.play_billing.C1866p0.U(i14 << 3);
                        iU4 = (iU3 * size) + iO;
                    }
                    iX += iU4;
                    i12 += 3;
                    break;
                case 22:
                    java.util.List list3 = (java.util.List) unsafe.getObject(abstractC1877v1, j9);
                    com.google.android.gms.internal.play_billing.C1873t0 c1873t4 = com.google.android.gms.internal.play_billing.U0.f19291a;
                    size = list3.size();
                    if (size == 0) {
                        iU4 = 0;
                    } else {
                        iO = com.google.android.gms.internal.play_billing.U0.j(list3);
                        iU3 = com.google.android.gms.internal.play_billing.C1866p0.U(i14 << 3);
                        iU4 = (iU3 * size) + iO;
                    }
                    iX += iU4;
                    i12 += 3;
                    break;
                case 23:
                    i9 = com.google.android.gms.internal.play_billing.U0.i(i14, (java.util.List) unsafe.getObject(abstractC1877v1, j9));
                    iX += i9;
                    i12 += 3;
                    break;
                case 24:
                    i9 = com.google.android.gms.internal.play_billing.U0.h(i14, (java.util.List) unsafe.getObject(abstractC1877v1, j9));
                    iX += i9;
                    i12 += 3;
                    break;
                case 25:
                    java.util.List list4 = (java.util.List) unsafe.getObject(abstractC1877v1, j9);
                    com.google.android.gms.internal.play_billing.C1873t0 c1873t5 = com.google.android.gms.internal.play_billing.U0.f19291a;
                    int size2 = list4.size();
                    if (size2 == 0) {
                        iU2 = 0;
                    } else {
                        iU2 = (com.google.android.gms.internal.play_billing.C1866p0.U(i14 << 3) + 1) * size2;
                    }
                    iX += iU2;
                    i12 += 3;
                    break;
                case 26:
                    java.util.List list5 = (java.util.List) unsafe.getObject(abstractC1877v1, j9);
                    com.google.android.gms.internal.play_billing.C1873t0 c1873t6 = com.google.android.gms.internal.play_billing.U0.f19291a;
                    int size3 = list5.size();
                    if (size3 == 0) {
                        iU4 = 0;
                    } else {
                        iU4 = com.google.android.gms.internal.play_billing.C1866p0.U(i14 << 3) * size3;
                        for (int i20 = 0; i20 < size3; i20++) {
                            java.lang.Object obj = list5.get(i20);
                            if (obj instanceof com.google.android.gms.internal.play_billing.AbstractC1859m0) {
                                int iN3 = ((com.google.android.gms.internal.play_billing.AbstractC1859m0) obj).n();
                                iU4 = Y6.f.x(iN3, iN3, iU4);
                            } else {
                                int iB2 = com.google.android.gms.internal.play_billing.AbstractC1839f1.b((java.lang.String) obj);
                                iU4 = Y6.f.x(iB2, iB2, iU4);
                            }
                        }
                    }
                    iX += iU4;
                    i12 += 3;
                    break;
                case 27:
                    java.util.List list6 = (java.util.List) unsafe.getObject(abstractC1877v1, j9);
                    com.google.android.gms.internal.play_billing.T0 t0B3 = B(i12);
                    com.google.android.gms.internal.play_billing.C1873t0 c1873t7 = com.google.android.gms.internal.play_billing.U0.f19291a;
                    int size4 = list6.size();
                    if (size4 == 0) {
                        iU5 = 0;
                    } else {
                        iU5 = com.google.android.gms.internal.play_billing.C1866p0.U(i14 << 3) * size4;
                        for (int i21 = 0; i21 < size4; i21++) {
                            int iC4 = ((com.google.android.gms.internal.play_billing.AbstractC1841g0) list6.get(i21)).c(t0B3);
                            iU5 = Y6.f.x(iC4, iC4, iU5);
                        }
                    }
                    iX += iU5;
                    i12 += 3;
                    break;
                case 28:
                    java.util.List list7 = (java.util.List) unsafe.getObject(abstractC1877v1, j9);
                    com.google.android.gms.internal.play_billing.C1873t0 c1873t8 = com.google.android.gms.internal.play_billing.U0.f19291a;
                    int size5 = list7.size();
                    if (size5 == 0) {
                        iU4 = 0;
                    } else {
                        iU4 = com.google.android.gms.internal.play_billing.C1866p0.U(i14 << 3) * size5;
                        for (int i22 = 0; i22 < list7.size(); i22++) {
                            int iN4 = ((com.google.android.gms.internal.play_billing.AbstractC1859m0) list7.get(i22)).n();
                            iU4 = Y6.f.x(iN4, iN4, iU4);
                        }
                    }
                    iX += iU4;
                    i12 += 3;
                    break;
                case 29:
                    java.util.List list8 = (java.util.List) unsafe.getObject(abstractC1877v1, j9);
                    com.google.android.gms.internal.play_billing.C1873t0 c1873t9 = com.google.android.gms.internal.play_billing.U0.f19291a;
                    size = list8.size();
                    if (size == 0) {
                        iU4 = 0;
                    } else {
                        iO = com.google.android.gms.internal.play_billing.U0.n(list8);
                        iU3 = com.google.android.gms.internal.play_billing.C1866p0.U(i14 << 3);
                        iU4 = (iU3 * size) + iO;
                    }
                    iX += iU4;
                    i12 += 3;
                    break;
                case 30:
                    java.util.List list9 = (java.util.List) unsafe.getObject(abstractC1877v1, j9);
                    com.google.android.gms.internal.play_billing.C1873t0 c1873t10 = com.google.android.gms.internal.play_billing.U0.f19291a;
                    size = list9.size();
                    if (size == 0) {
                        iU4 = 0;
                    } else {
                        iO = com.google.android.gms.internal.play_billing.U0.g(list9);
                        iU3 = com.google.android.gms.internal.play_billing.C1866p0.U(i14 << 3);
                        iU4 = (iU3 * size) + iO;
                    }
                    iX += iU4;
                    i12 += 3;
                    break;
                case 31:
                    i9 = com.google.android.gms.internal.play_billing.U0.h(i14, (java.util.List) unsafe.getObject(abstractC1877v1, j9));
                    iX += i9;
                    i12 += 3;
                    break;
                case 32:
                    i9 = com.google.android.gms.internal.play_billing.U0.i(i14, (java.util.List) unsafe.getObject(abstractC1877v1, j9));
                    iX += i9;
                    i12 += 3;
                    break;
                case 33:
                    java.util.List list10 = (java.util.List) unsafe.getObject(abstractC1877v1, j9);
                    com.google.android.gms.internal.play_billing.C1873t0 c1873t11 = com.google.android.gms.internal.play_billing.U0.f19291a;
                    size = list10.size();
                    if (size == 0) {
                        iU4 = 0;
                    } else {
                        iO = com.google.android.gms.internal.play_billing.U0.l(list10);
                        iU3 = com.google.android.gms.internal.play_billing.C1866p0.U(i14 << 3);
                        iU4 = (iU3 * size) + iO;
                    }
                    iX += iU4;
                    i12 += 3;
                    break;
                case 34:
                    java.util.List list11 = (java.util.List) unsafe.getObject(abstractC1877v1, j9);
                    com.google.android.gms.internal.play_billing.C1873t0 c1873t12 = com.google.android.gms.internal.play_billing.U0.f19291a;
                    size = list11.size();
                    if (size == 0) {
                        iU4 = 0;
                    } else {
                        iO = com.google.android.gms.internal.play_billing.U0.m(list11);
                        iU3 = com.google.android.gms.internal.play_billing.C1866p0.U(i14 << 3);
                        iU4 = (iU3 * size) + iO;
                    }
                    iX += iU4;
                    i12 += 3;
                    break;
                case 35:
                    java.util.List list12 = (java.util.List) unsafe.getObject(abstractC1877v1, j9);
                    com.google.android.gms.internal.play_billing.C1873t0 c1873t13 = com.google.android.gms.internal.play_billing.U0.f19291a;
                    int size6 = list12.size() * 8;
                    if (size6 > 0) {
                        iX = com.google.android.gms.internal.play_billing.M0.d(size6, com.google.android.gms.internal.play_billing.C1866p0.U(i14 << 3), size6, iX);
                    }
                    i12 += 3;
                    break;
                case androidx.media3.extractor.ts.TsExtractor.TS_STREAM_TYPE_H265 /* 36 */:
                    java.util.List list13 = (java.util.List) unsafe.getObject(abstractC1877v1, j9);
                    com.google.android.gms.internal.play_billing.C1873t0 c1873t14 = com.google.android.gms.internal.play_billing.U0.f19291a;
                    int size7 = list13.size() * 4;
                    if (size7 > 0) {
                        iX = com.google.android.gms.internal.play_billing.M0.d(size7, com.google.android.gms.internal.play_billing.C1866p0.U(i14 << 3), size7, iX);
                    }
                    i12 += 3;
                    break;
                case 37:
                    int iK = com.google.android.gms.internal.play_billing.U0.k((java.util.List) unsafe.getObject(abstractC1877v1, j9));
                    if (iK > 0) {
                        iX = com.google.android.gms.internal.play_billing.M0.d(iK, com.google.android.gms.internal.play_billing.C1866p0.U(i14 << 3), iK, iX);
                    }
                    i12 += 3;
                    break;
                case androidx.media3.extractor.flac.FlacConstants.STREAM_INFO_BLOCK_SIZE /* 38 */:
                    int iO2 = com.google.android.gms.internal.play_billing.U0.o((java.util.List) unsafe.getObject(abstractC1877v1, j9));
                    if (iO2 > 0) {
                        iX = com.google.android.gms.internal.play_billing.M0.d(iO2, com.google.android.gms.internal.play_billing.C1866p0.U(i14 << 3), iO2, iX);
                    }
                    i12 += 3;
                    break;
                case androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_PREFIX_SEI /* 39 */:
                    int iJ = com.google.android.gms.internal.play_billing.U0.j((java.util.List) unsafe.getObject(abstractC1877v1, j9));
                    if (iJ > 0) {
                        iX = com.google.android.gms.internal.play_billing.M0.d(iJ, com.google.android.gms.internal.play_billing.C1866p0.U(i14 << 3), iJ, iX);
                    }
                    i12 += 3;
                    break;
                case 40:
                    java.util.List list14 = (java.util.List) unsafe.getObject(abstractC1877v1, j9);
                    com.google.android.gms.internal.play_billing.C1873t0 c1873t15 = com.google.android.gms.internal.play_billing.U0.f19291a;
                    int size8 = list14.size() * 8;
                    if (size8 > 0) {
                        iX = com.google.android.gms.internal.play_billing.M0.d(size8, com.google.android.gms.internal.play_billing.C1866p0.U(i14 << 3), size8, iX);
                    }
                    i12 += 3;
                    break;
                case 41:
                    java.util.List list15 = (java.util.List) unsafe.getObject(abstractC1877v1, j9);
                    com.google.android.gms.internal.play_billing.C1873t0 c1873t16 = com.google.android.gms.internal.play_billing.U0.f19291a;
                    int size9 = list15.size() * 4;
                    if (size9 > 0) {
                        iX = com.google.android.gms.internal.play_billing.M0.d(size9, com.google.android.gms.internal.play_billing.C1866p0.U(i14 << 3), size9, iX);
                    }
                    i12 += 3;
                    break;
                case androidx.media3.extractor.AacUtil.AUDIO_OBJECT_TYPE_AAC_XHE /* 42 */:
                    java.util.List list16 = (java.util.List) unsafe.getObject(abstractC1877v1, j9);
                    com.google.android.gms.internal.play_billing.C1873t0 c1873t17 = com.google.android.gms.internal.play_billing.U0.f19291a;
                    int size10 = list16.size();
                    if (size10 > 0) {
                        iX = com.google.android.gms.internal.play_billing.M0.d(size10, com.google.android.gms.internal.play_billing.C1866p0.U(i14 << 3), size10, iX);
                    }
                    i12 += 3;
                    break;
                case 43:
                    int iN5 = com.google.android.gms.internal.play_billing.U0.n((java.util.List) unsafe.getObject(abstractC1877v1, j9));
                    if (iN5 > 0) {
                        iX = com.google.android.gms.internal.play_billing.M0.d(iN5, com.google.android.gms.internal.play_billing.C1866p0.U(i14 << 3), iN5, iX);
                    }
                    i12 += 3;
                    break;
                case 44:
                    int iG = com.google.android.gms.internal.play_billing.U0.g((java.util.List) unsafe.getObject(abstractC1877v1, j9));
                    if (iG > 0) {
                        iX = com.google.android.gms.internal.play_billing.M0.d(iG, com.google.android.gms.internal.play_billing.C1866p0.U(i14 << 3), iG, iX);
                    }
                    i12 += 3;
                    break;
                case androidx.media3.extractor.ts.TsExtractor.TS_STREAM_TYPE_MHAS /* 45 */:
                    java.util.List list17 = (java.util.List) unsafe.getObject(abstractC1877v1, j9);
                    com.google.android.gms.internal.play_billing.C1873t0 c1873t18 = com.google.android.gms.internal.play_billing.U0.f19291a;
                    int size11 = list17.size() * 4;
                    if (size11 > 0) {
                        iX = com.google.android.gms.internal.play_billing.M0.d(size11, com.google.android.gms.internal.play_billing.C1866p0.U(i14 << 3), size11, iX);
                    }
                    i12 += 3;
                    break;
                case 46:
                    java.util.List list18 = (java.util.List) unsafe.getObject(abstractC1877v1, j9);
                    com.google.android.gms.internal.play_billing.C1873t0 c1873t19 = com.google.android.gms.internal.play_billing.U0.f19291a;
                    int size12 = list18.size() * 8;
                    if (size12 > 0) {
                        iX = com.google.android.gms.internal.play_billing.M0.d(size12, com.google.android.gms.internal.play_billing.C1866p0.U(i14 << 3), size12, iX);
                    }
                    i12 += 3;
                    break;
                case 47:
                    int iL = com.google.android.gms.internal.play_billing.U0.l((java.util.List) unsafe.getObject(abstractC1877v1, j9));
                    if (iL > 0) {
                        iX = com.google.android.gms.internal.play_billing.M0.d(iL, com.google.android.gms.internal.play_billing.C1866p0.U(i14 << 3), iL, iX);
                    }
                    i12 += 3;
                    break;
                case androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED /* 48 */:
                    int iM = com.google.android.gms.internal.play_billing.U0.m((java.util.List) unsafe.getObject(abstractC1877v1, j9));
                    if (iM > 0) {
                        iX = com.google.android.gms.internal.play_billing.M0.d(iM, com.google.android.gms.internal.play_billing.C1866p0.U(i14 << 3), iM, iX);
                    }
                    i12 += 3;
                    break;
                case com.revenuecat.purchases.utils.PurchaseParamsValidator.MAX_NUMBER_OF_ADD_ON_PRODUCTS /* 49 */:
                    java.util.List list19 = (java.util.List) unsafe.getObject(abstractC1877v1, j9);
                    com.google.android.gms.internal.play_billing.T0 t0B4 = B(i12);
                    com.google.android.gms.internal.play_billing.C1873t0 c1873t20 = com.google.android.gms.internal.play_billing.U0.f19291a;
                    int size13 = list19.size();
                    if (size13 == 0) {
                        iC2 = 0;
                    } else {
                        iC2 = 0;
                        for (int i23 = 0; i23 < size13; i23++) {
                            com.google.android.gms.internal.play_billing.AbstractC1841g0 abstractC1841g1 = (com.google.android.gms.internal.play_billing.AbstractC1841g0) list19.get(i23);
                            int iU12 = com.google.android.gms.internal.play_billing.C1866p0.U(i14 << 3);
                            iC2 += abstractC1841g1.c(t0B4) + iU12 + iU12;
                        }
                    }
                    iX += iC2;
                    i12 += 3;
                    break;
                case 50:
                    int i24 = i12 / 3;
                    com.google.android.gms.internal.play_billing.H0 h9 = (com.google.android.gms.internal.play_billing.H0) unsafe.getObject(abstractC1877v1, j9);
                    if (this.f19262b[i24 + i24] != null) {
                        throw new java.lang.ClassCastException();
                    }
                    if (h9.isEmpty()) {
                        continue;
                    } else {
                        java.util.Iterator it = h9.entrySet().iterator();
                        if (it.hasNext()) {
                            java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
                            entry.getKey();
                            entry.getValue();
                            throw null;
                        }
                    }
                    i12 += 3;
                    break;
                case 51:
                    if (s(i14, i12, abstractC1877v1)) {
                        iX = Y6.f.x(i14 << 3, 8, iX);
                    }
                    i12 += 3;
                    break;
                case 52:
                    if (s(i14, i12, abstractC1877v1)) {
                        iX = Y6.f.x(i14 << 3, 4, iX);
                    }
                    i12 += 3;
                    break;
                case 53:
                    if (s(i14, i12, abstractC1877v1)) {
                        long jZ = z(j9, abstractC1877v1);
                        iU6 = com.google.android.gms.internal.play_billing.C1866p0.U(i14 << 3);
                        iV2 = com.google.android.gms.internal.play_billing.C1866p0.V(jZ);
                        iX += iV2 + iU6;
                    }
                    i12 += 3;
                    break;
                case 54:
                    if (s(i14, i12, abstractC1877v1)) {
                        long jZ2 = z(j9, abstractC1877v1);
                        iU6 = com.google.android.gms.internal.play_billing.C1866p0.U(i14 << 3);
                        iV2 = com.google.android.gms.internal.play_billing.C1866p0.V(jZ2);
                        iX += iV2 + iU6;
                    }
                    i12 += 3;
                    break;
                case 55:
                    if (s(i14, i12, abstractC1877v1)) {
                        long jV = v(j9, abstractC1877v1);
                        iU6 = com.google.android.gms.internal.play_billing.C1866p0.U(i14 << 3);
                        iV2 = com.google.android.gms.internal.play_billing.C1866p0.V(jV);
                        iX += iV2 + iU6;
                    }
                    i12 += 3;
                    break;
                case 56:
                    if (s(i14, i12, abstractC1877v1)) {
                        iX = Y6.f.x(i14 << 3, 8, iX);
                    }
                    i12 += 3;
                    break;
                case 57:
                    if (s(i14, i12, abstractC1877v1)) {
                        iX = Y6.f.x(i14 << 3, 4, iX);
                    }
                    i12 += 3;
                    break;
                case 58:
                    if (s(i14, i12, abstractC1877v1)) {
                        iX = Y6.f.x(i14 << 3, 1, iX);
                    }
                    i12 += 3;
                    break;
                case 59:
                    if (s(i14, i12, abstractC1877v1)) {
                        int i25 = i14 << 3;
                        java.lang.Object object3 = unsafe.getObject(abstractC1877v1, j9);
                        if (object3 instanceof com.google.android.gms.internal.play_billing.AbstractC1859m0) {
                            int iU13 = com.google.android.gms.internal.play_billing.C1866p0.U(i25);
                            int iN6 = ((com.google.android.gms.internal.play_billing.AbstractC1859m0) object3).n();
                            iX = com.google.android.gms.internal.play_billing.M0.d(iN6, iN6, iU13, iX);
                        } else {
                            int iU14 = com.google.android.gms.internal.play_billing.C1866p0.U(i25);
                            int iB3 = com.google.android.gms.internal.play_billing.AbstractC1839f1.b((java.lang.String) object3);
                            iX = com.google.android.gms.internal.play_billing.M0.d(iB3, iB3, iU14, iX);
                        }
                    }
                    i12 += 3;
                    break;
                case dev.jdtech.mpv.MPVLib.MPV_LOG_LEVEL_DEBUG /* 60 */:
                    if (s(i14, i12, abstractC1877v1)) {
                        java.lang.Object object4 = unsafe.getObject(abstractC1877v1, j9);
                        com.google.android.gms.internal.play_billing.T0 t0B5 = B(i12);
                        com.google.android.gms.internal.play_billing.C1873t0 c1873t21 = com.google.android.gms.internal.play_billing.U0.f19291a;
                        int iU15 = com.google.android.gms.internal.play_billing.C1866p0.U(i14 << 3);
                        int iC5 = ((com.google.android.gms.internal.play_billing.AbstractC1841g0) object4).c(t0B5);
                        iX = com.google.android.gms.internal.play_billing.M0.d(iC5, iC5, iU15, iX);
                    }
                    i12 += 3;
                    break;
                case 61:
                    if (s(i14, i12, abstractC1877v1)) {
                        com.google.android.gms.internal.play_billing.AbstractC1859m0 abstractC1859m1 = (com.google.android.gms.internal.play_billing.AbstractC1859m0) unsafe.getObject(abstractC1877v1, j9);
                        int iU16 = com.google.android.gms.internal.play_billing.C1866p0.U(i14 << 3);
                        int iN7 = abstractC1859m1.n();
                        iX = com.google.android.gms.internal.play_billing.M0.d(iN7, iN7, iU16, iX);
                    }
                    i12 += 3;
                    break;
                case 62:
                    if (s(i14, i12, abstractC1877v1)) {
                        iX = Y6.f.x(v(j9, abstractC1877v1), com.google.android.gms.internal.play_billing.C1866p0.U(i14 << 3), iX);
                    }
                    i12 += 3;
                    break;
                case 63:
                    if (s(i14, i12, abstractC1877v1)) {
                        long jV2 = v(j9, abstractC1877v1);
                        iU6 = com.google.android.gms.internal.play_billing.C1866p0.U(i14 << 3);
                        iV2 = com.google.android.gms.internal.play_billing.C1866p0.V(jV2);
                        iX += iV2 + iU6;
                    }
                    i12 += 3;
                    break;
                case 64:
                    if (s(i14, i12, abstractC1877v1)) {
                        iX = Y6.f.x(i14 << 3, 4, iX);
                    }
                    i12 += 3;
                    break;
                case 65:
                    if (s(i14, i12, abstractC1877v1)) {
                        iX = Y6.f.x(i14 << 3, 8, iX);
                    }
                    i12 += 3;
                    break;
                case 66:
                    if (s(i14, i12, abstractC1877v1)) {
                        int iV3 = v(j9, abstractC1877v1);
                        iX = Y6.f.x((iV3 >> 31) ^ (iV3 + iV3), com.google.android.gms.internal.play_billing.C1866p0.U(i14 << 3), iX);
                    }
                    i12 += 3;
                    break;
                case androidx.media3.container.MdtaMetadataEntry.TYPE_INDICATOR_INT32 /* 67 */:
                    if (s(i14, i12, abstractC1877v1)) {
                        long jZ3 = z(j9, abstractC1877v1);
                        iU6 = com.google.android.gms.internal.play_billing.C1866p0.U(i14 << 3);
                        iV2 = com.google.android.gms.internal.play_billing.C1866p0.V((jZ3 >> 63) ^ (jZ3 + jZ3));
                        iX += iV2 + iU6;
                    }
                    i12 += 3;
                    break;
                case 68:
                    if (s(i14, i12, abstractC1877v1)) {
                        com.google.android.gms.internal.play_billing.AbstractC1841g0 abstractC1841g2 = (com.google.android.gms.internal.play_billing.AbstractC1841g0) unsafe.getObject(abstractC1877v1, j9);
                        com.google.android.gms.internal.play_billing.T0 t0B6 = B(i12);
                        com.google.android.gms.internal.play_billing.C1873t0 c1873t22 = com.google.android.gms.internal.play_billing.U0.f19291a;
                        int iU17 = com.google.android.gms.internal.play_billing.C1866p0.U(i14 << 3);
                        i10 = iU17 + iU17;
                        iC = abstractC1841g2.c(t0B6);
                        i9 = iC + i10;
                        iX += i9;
                    }
                    i12 += 3;
                    break;
                default:
                    i12 += 3;
                    break;
            }
        }
    }

    @Override // com.google.android.gms.internal.play_billing.T0
    public final boolean d(java.lang.Object obj) {
        int i3;
        int i9;
        int i10 = 0;
        int i11 = 0;
        int i12 = 1048575;
        while (i11 < this.g) {
            int i13 = this.f19266f[i11];
            int[] iArr = this.f19261a;
            int i14 = iArr[i13];
            int iY = y(i13);
            int i15 = iArr[i13 + 2];
            int i16 = i15 & 1048575;
            int i17 = 1 << (i15 >>> 20);
            if (i16 != i12) {
                if (i16 != 1048575) {
                    i10 = f19260k.getInt(obj, i16);
                }
                i9 = i10;
                i3 = i16;
            } else {
                int i18 = i10;
                i3 = i12;
                i9 = i18;
            }
            if ((268435456 & iY) == 0 || q(obj, i13, i3, i9, i17)) {
                int iX = x(iY);
                if (iX != 9 && iX != 17) {
                    if (iX != 27) {
                        if (iX == 60 || iX == 68) {
                            if (!s(i14, i13, obj) || B(i13).d(com.google.android.gms.internal.play_billing.AbstractC1830c1.g(iY & 1048575, obj))) {
                            }
                        } else if (iX != 49) {
                            if (iX == 50 && !((com.google.android.gms.internal.play_billing.H0) com.google.android.gms.internal.play_billing.AbstractC1830c1.g(iY & 1048575, obj)).isEmpty()) {
                                int i19 = i13 / 3;
                                throw p121o0.p.i(this.f19262b[i19 + i19]);
                            }
                        }
                        i11++;
                        i12 = i3;
                        i10 = i9;
                    }
                    java.util.List list = (java.util.List) com.google.android.gms.internal.play_billing.AbstractC1830c1.g(iY & 1048575, obj);
                    if (list.isEmpty()) {
                        continue;
                    } else {
                        com.google.android.gms.internal.play_billing.T0 t0B = B(i13);
                        for (int i20 = 0; i20 < list.size(); i20++) {
                            if (t0B.d(list.get(i20))) {
                            }
                        }
                    }
                    i11++;
                    i12 = i3;
                    i10 = i9;
                } else if (!q(obj, i13, i3, i9, i17) || B(i13).d(com.google.android.gms.internal.play_billing.AbstractC1830c1.g(iY & 1048575, obj))) {
                    i11++;
                    i12 = i3;
                    i10 = i9;
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:44:0x00db A[PHI: r1
  0x00db: PHI (r1v34 int) = (r1v10 int), (r1v35 int) binds: [B:85:0x01ea, B:43:0x00d9] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.google.android.gms.internal.play_billing.T0
    public final int e(com.google.android.gms.internal.play_billing.AbstractC1877v0 abstractC1877v0) {
        int i3;
        long jDoubleToLongBits;
        int i9;
        int iFloatToIntBits;
        int i10;
        int i11;
        int i12 = 0;
        int i13 = 0;
        while (true) {
            int[] iArr = this.f19261a;
            if (i12 >= iArr.length) {
                return abstractC1877v0.zzc.hashCode() + (i13 * 53);
            }
            int iY = y(i12);
            int i14 = 1048575 & iY;
            int iX = x(iY);
            int i15 = iArr[i12];
            long j9 = i14;
            int i16 = 1237;
            int iHashCode = 37;
            switch (iX) {
                case 0:
                    i3 = i13 * 53;
                    jDoubleToLongBits = java.lang.Double.doubleToLongBits(com.google.android.gms.internal.play_billing.AbstractC1830c1.f19310c.a(j9, abstractC1877v0));
                    java.nio.charset.Charset charset = com.google.android.gms.internal.play_billing.B0.f19193a;
                    i13 = i3 + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                    break;
                case 1:
                    i9 = i13 * 53;
                    iFloatToIntBits = java.lang.Float.floatToIntBits(com.google.android.gms.internal.play_billing.AbstractC1830c1.f19310c.b(j9, abstractC1877v0));
                    i13 = iFloatToIntBits + i9;
                    break;
                case 2:
                    i3 = i13 * 53;
                    jDoubleToLongBits = com.google.android.gms.internal.play_billing.AbstractC1830c1.e(j9, abstractC1877v0);
                    java.nio.charset.Charset charset2 = com.google.android.gms.internal.play_billing.B0.f19193a;
                    i13 = i3 + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                    break;
                case 3:
                    i3 = i13 * 53;
                    jDoubleToLongBits = com.google.android.gms.internal.play_billing.AbstractC1830c1.e(j9, abstractC1877v0);
                    java.nio.charset.Charset charset3 = com.google.android.gms.internal.play_billing.B0.f19193a;
                    i13 = i3 + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                    break;
                case 4:
                    i9 = i13 * 53;
                    iFloatToIntBits = com.google.android.gms.internal.play_billing.AbstractC1830c1.d(j9, abstractC1877v0);
                    i13 = iFloatToIntBits + i9;
                    break;
                case 5:
                    i3 = i13 * 53;
                    jDoubleToLongBits = com.google.android.gms.internal.play_billing.AbstractC1830c1.e(j9, abstractC1877v0);
                    java.nio.charset.Charset charset4 = com.google.android.gms.internal.play_billing.B0.f19193a;
                    i13 = i3 + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                    break;
                case 6:
                    i9 = i13 * 53;
                    iFloatToIntBits = com.google.android.gms.internal.play_billing.AbstractC1830c1.d(j9, abstractC1877v0);
                    i13 = iFloatToIntBits + i9;
                    break;
                case 7:
                    i10 = i13 * 53;
                    boolean zG = com.google.android.gms.internal.play_billing.AbstractC1830c1.f19310c.g(j9, abstractC1877v0);
                    java.nio.charset.Charset charset5 = com.google.android.gms.internal.play_billing.B0.f19193a;
                    if (zG) {
                        i16 = 1231;
                    }
                    i13 = i16 + i10;
                    break;
                case 8:
                    i9 = i13 * 53;
                    iFloatToIntBits = ((java.lang.String) com.google.android.gms.internal.play_billing.AbstractC1830c1.g(j9, abstractC1877v0)).hashCode();
                    i13 = iFloatToIntBits + i9;
                    break;
                case 9:
                    i11 = i13 * 53;
                    java.lang.Object objG = com.google.android.gms.internal.play_billing.AbstractC1830c1.g(j9, abstractC1877v0);
                    if (objG != null) {
                        iHashCode = objG.hashCode();
                    }
                    i13 = i11 + iHashCode;
                    break;
                case 10:
                    i9 = i13 * 53;
                    iFloatToIntBits = com.google.android.gms.internal.play_billing.AbstractC1830c1.g(j9, abstractC1877v0).hashCode();
                    i13 = iFloatToIntBits + i9;
                    break;
                case 11:
                    i9 = i13 * 53;
                    iFloatToIntBits = com.google.android.gms.internal.play_billing.AbstractC1830c1.d(j9, abstractC1877v0);
                    i13 = iFloatToIntBits + i9;
                    break;
                case 12:
                    i9 = i13 * 53;
                    iFloatToIntBits = com.google.android.gms.internal.play_billing.AbstractC1830c1.d(j9, abstractC1877v0);
                    i13 = iFloatToIntBits + i9;
                    break;
                case 13:
                    i9 = i13 * 53;
                    iFloatToIntBits = com.google.android.gms.internal.play_billing.AbstractC1830c1.d(j9, abstractC1877v0);
                    i13 = iFloatToIntBits + i9;
                    break;
                case 14:
                    i3 = i13 * 53;
                    jDoubleToLongBits = com.google.android.gms.internal.play_billing.AbstractC1830c1.e(j9, abstractC1877v0);
                    java.nio.charset.Charset charset6 = com.google.android.gms.internal.play_billing.B0.f19193a;
                    i13 = i3 + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                    break;
                case 15:
                    i9 = i13 * 53;
                    iFloatToIntBits = com.google.android.gms.internal.play_billing.AbstractC1830c1.d(j9, abstractC1877v0);
                    i13 = iFloatToIntBits + i9;
                    break;
                case 16:
                    i3 = i13 * 53;
                    jDoubleToLongBits = com.google.android.gms.internal.play_billing.AbstractC1830c1.e(j9, abstractC1877v0);
                    java.nio.charset.Charset charset7 = com.google.android.gms.internal.play_billing.B0.f19193a;
                    i13 = i3 + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                    break;
                case 17:
                    i11 = i13 * 53;
                    java.lang.Object objG2 = com.google.android.gms.internal.play_billing.AbstractC1830c1.g(j9, abstractC1877v0);
                    if (objG2 != null) {
                        iHashCode = objG2.hashCode();
                    }
                    i13 = i11 + iHashCode;
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case androidx.media3.extractor.ts.TsExtractor.TS_STREAM_TYPE_H265 /* 36 */:
                case 37:
                case androidx.media3.extractor.flac.FlacConstants.STREAM_INFO_BLOCK_SIZE /* 38 */:
                case androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_PREFIX_SEI /* 39 */:
                case 40:
                case 41:
                case androidx.media3.extractor.AacUtil.AUDIO_OBJECT_TYPE_AAC_XHE /* 42 */:
                case 43:
                case 44:
                case androidx.media3.extractor.ts.TsExtractor.TS_STREAM_TYPE_MHAS /* 45 */:
                case 46:
                case 47:
                case androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED /* 48 */:
                case com.revenuecat.purchases.utils.PurchaseParamsValidator.MAX_NUMBER_OF_ADD_ON_PRODUCTS /* 49 */:
                    i9 = i13 * 53;
                    iFloatToIntBits = com.google.android.gms.internal.play_billing.AbstractC1830c1.g(j9, abstractC1877v0).hashCode();
                    i13 = iFloatToIntBits + i9;
                    break;
                case 50:
                    i9 = i13 * 53;
                    iFloatToIntBits = com.google.android.gms.internal.play_billing.AbstractC1830c1.g(j9, abstractC1877v0).hashCode();
                    i13 = iFloatToIntBits + i9;
                    break;
                case 51:
                    if (s(i15, i12, abstractC1877v0)) {
                        i3 = i13 * 53;
                        jDoubleToLongBits = java.lang.Double.doubleToLongBits(((java.lang.Double) com.google.android.gms.internal.play_billing.AbstractC1830c1.g(j9, abstractC1877v0)).doubleValue());
                        java.nio.charset.Charset charset8 = com.google.android.gms.internal.play_billing.B0.f19193a;
                        i13 = i3 + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                    }
                    break;
                case 52:
                    if (s(i15, i12, abstractC1877v0)) {
                        i9 = i13 * 53;
                        iFloatToIntBits = java.lang.Float.floatToIntBits(((java.lang.Float) com.google.android.gms.internal.play_billing.AbstractC1830c1.g(j9, abstractC1877v0)).floatValue());
                        i13 = iFloatToIntBits + i9;
                    }
                    break;
                case 53:
                    if (s(i15, i12, abstractC1877v0)) {
                        i3 = i13 * 53;
                        jDoubleToLongBits = z(j9, abstractC1877v0);
                        java.nio.charset.Charset charset9 = com.google.android.gms.internal.play_billing.B0.f19193a;
                        i13 = i3 + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                    }
                    break;
                case 54:
                    if (s(i15, i12, abstractC1877v0)) {
                        i3 = i13 * 53;
                        jDoubleToLongBits = z(j9, abstractC1877v0);
                        java.nio.charset.Charset charset10 = com.google.android.gms.internal.play_billing.B0.f19193a;
                        i13 = i3 + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                    }
                    break;
                case 55:
                    if (s(i15, i12, abstractC1877v0)) {
                        i9 = i13 * 53;
                        iFloatToIntBits = v(j9, abstractC1877v0);
                        i13 = iFloatToIntBits + i9;
                    }
                    break;
                case 56:
                    if (s(i15, i12, abstractC1877v0)) {
                        i3 = i13 * 53;
                        jDoubleToLongBits = z(j9, abstractC1877v0);
                        java.nio.charset.Charset charset11 = com.google.android.gms.internal.play_billing.B0.f19193a;
                        i13 = i3 + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                    }
                    break;
                case 57:
                    if (s(i15, i12, abstractC1877v0)) {
                        i9 = i13 * 53;
                        iFloatToIntBits = v(j9, abstractC1877v0);
                        i13 = iFloatToIntBits + i9;
                    }
                    break;
                case 58:
                    if (s(i15, i12, abstractC1877v0)) {
                        i10 = i13 * 53;
                        boolean zBooleanValue = ((java.lang.Boolean) com.google.android.gms.internal.play_billing.AbstractC1830c1.g(j9, abstractC1877v0)).booleanValue();
                        java.nio.charset.Charset charset12 = com.google.android.gms.internal.play_billing.B0.f19193a;
                        if (zBooleanValue) {
                            i16 = 1231;
                        }
                        i13 = i16 + i10;
                    }
                    break;
                case 59:
                    if (s(i15, i12, abstractC1877v0)) {
                        i9 = i13 * 53;
                        iFloatToIntBits = ((java.lang.String) com.google.android.gms.internal.play_billing.AbstractC1830c1.g(j9, abstractC1877v0)).hashCode();
                        i13 = iFloatToIntBits + i9;
                    }
                    break;
                case dev.jdtech.mpv.MPVLib.MPV_LOG_LEVEL_DEBUG /* 60 */:
                    if (s(i15, i12, abstractC1877v0)) {
                        i9 = i13 * 53;
                        iFloatToIntBits = com.google.android.gms.internal.play_billing.AbstractC1830c1.g(j9, abstractC1877v0).hashCode();
                        i13 = iFloatToIntBits + i9;
                    }
                    break;
                case 61:
                    if (s(i15, i12, abstractC1877v0)) {
                        i9 = i13 * 53;
                        iFloatToIntBits = com.google.android.gms.internal.play_billing.AbstractC1830c1.g(j9, abstractC1877v0).hashCode();
                        i13 = iFloatToIntBits + i9;
                    }
                    break;
                case 62:
                    if (s(i15, i12, abstractC1877v0)) {
                        i9 = i13 * 53;
                        iFloatToIntBits = v(j9, abstractC1877v0);
                        i13 = iFloatToIntBits + i9;
                    }
                    break;
                case 63:
                    if (s(i15, i12, abstractC1877v0)) {
                        i9 = i13 * 53;
                        iFloatToIntBits = v(j9, abstractC1877v0);
                        i13 = iFloatToIntBits + i9;
                    }
                    break;
                case 64:
                    if (s(i15, i12, abstractC1877v0)) {
                        i9 = i13 * 53;
                        iFloatToIntBits = v(j9, abstractC1877v0);
                        i13 = iFloatToIntBits + i9;
                    }
                    break;
                case 65:
                    if (s(i15, i12, abstractC1877v0)) {
                        i3 = i13 * 53;
                        jDoubleToLongBits = z(j9, abstractC1877v0);
                        java.nio.charset.Charset charset13 = com.google.android.gms.internal.play_billing.B0.f19193a;
                        i13 = i3 + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                    }
                    break;
                case 66:
                    if (s(i15, i12, abstractC1877v0)) {
                        i9 = i13 * 53;
                        iFloatToIntBits = v(j9, abstractC1877v0);
                        i13 = iFloatToIntBits + i9;
                    }
                    break;
                case androidx.media3.container.MdtaMetadataEntry.TYPE_INDICATOR_INT32 /* 67 */:
                    if (s(i15, i12, abstractC1877v0)) {
                        i3 = i13 * 53;
                        jDoubleToLongBits = z(j9, abstractC1877v0);
                        java.nio.charset.Charset charset14 = com.google.android.gms.internal.play_billing.B0.f19193a;
                        i13 = i3 + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                    }
                    break;
                case 68:
                    if (s(i15, i12, abstractC1877v0)) {
                        i9 = i13 * 53;
                        iFloatToIntBits = com.google.android.gms.internal.play_billing.AbstractC1830c1.g(j9, abstractC1877v0).hashCode();
                        i13 = iFloatToIntBits + i9;
                    }
                    break;
            }
            i12 += 3;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.T0
    public final void f(java.lang.Object obj, byte[] bArr, int i3, int i9, com.google.android.gms.internal.play_billing.C1850j0 c1850j0) {
        t(obj, bArr, i3, i9, 0, c1850j0);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:9:0x0022  */
    @Override // com.google.android.gms.internal.play_billing.T0
    public final void g(java.lang.Object obj, java.lang.Object obj2) {
        java.lang.Object obj3;
        if (!r(obj)) {
            throw new java.lang.IllegalArgumentException("Mutating immutable message: ".concat(java.lang.String.valueOf(obj)));
        }
        obj2.getClass();
        int i3 = 0;
        while (true) {
            int[] iArr = this.f19261a;
            if (i3 >= iArr.length) {
                com.google.android.gms.internal.play_billing.U0.p(obj, obj2);
                return;
            }
            int iY = y(i3);
            int i9 = iY & 1048575;
            int iX = x(iY);
            int i10 = iArr[i3];
            long j9 = i9;
            switch (iX) {
                case 0:
                    if (!p(i3, obj2)) {
                        obj3 = obj;
                    } else {
                        com.google.android.gms.internal.play_billing.AbstractC1827b1 abstractC1827b1 = com.google.android.gms.internal.play_billing.AbstractC1830c1.f19310c;
                        obj3 = obj;
                        abstractC1827b1.e(obj3, j9, abstractC1827b1.a(j9, obj2));
                        l(i3, obj3);
                    }
                    break;
                case 1:
                    if (p(i3, obj2)) {
                        com.google.android.gms.internal.play_billing.AbstractC1827b1 abstractC1827b2 = com.google.android.gms.internal.play_billing.AbstractC1830c1.f19310c;
                        abstractC1827b2.f(obj, j9, abstractC1827b2.b(j9, obj2));
                        l(i3, obj);
                    }
                    obj3 = obj;
                    break;
                case 2:
                    if (p(i3, obj2)) {
                        com.google.android.gms.internal.play_billing.AbstractC1830c1.j(obj, j9, com.google.android.gms.internal.play_billing.AbstractC1830c1.e(j9, obj2));
                        l(i3, obj);
                    }
                    obj3 = obj;
                    break;
                case 3:
                    if (p(i3, obj2)) {
                        com.google.android.gms.internal.play_billing.AbstractC1830c1.j(obj, j9, com.google.android.gms.internal.play_billing.AbstractC1830c1.e(j9, obj2));
                        l(i3, obj);
                    }
                    obj3 = obj;
                    break;
                case 4:
                    if (p(i3, obj2)) {
                        com.google.android.gms.internal.play_billing.AbstractC1830c1.i(com.google.android.gms.internal.play_billing.AbstractC1830c1.d(j9, obj2), j9, obj);
                        l(i3, obj);
                    }
                    obj3 = obj;
                    break;
                case 5:
                    if (p(i3, obj2)) {
                        com.google.android.gms.internal.play_billing.AbstractC1830c1.j(obj, j9, com.google.android.gms.internal.play_billing.AbstractC1830c1.e(j9, obj2));
                        l(i3, obj);
                    }
                    obj3 = obj;
                    break;
                case 6:
                    if (p(i3, obj2)) {
                        com.google.android.gms.internal.play_billing.AbstractC1830c1.i(com.google.android.gms.internal.play_billing.AbstractC1830c1.d(j9, obj2), j9, obj);
                        l(i3, obj);
                    }
                    obj3 = obj;
                    break;
                case 7:
                    if (p(i3, obj2)) {
                        com.google.android.gms.internal.play_billing.AbstractC1827b1 abstractC1827b3 = com.google.android.gms.internal.play_billing.AbstractC1830c1.f19310c;
                        abstractC1827b3.c(obj, j9, abstractC1827b3.g(j9, obj2));
                        l(i3, obj);
                    }
                    obj3 = obj;
                    break;
                case 8:
                    if (p(i3, obj2)) {
                        com.google.android.gms.internal.play_billing.AbstractC1830c1.k(j9, obj, com.google.android.gms.internal.play_billing.AbstractC1830c1.g(j9, obj2));
                        l(i3, obj);
                    }
                    obj3 = obj;
                    break;
                case 9:
                    j(obj, i3, obj2);
                    obj3 = obj;
                    break;
                case 10:
                    if (p(i3, obj2)) {
                        com.google.android.gms.internal.play_billing.AbstractC1830c1.k(j9, obj, com.google.android.gms.internal.play_billing.AbstractC1830c1.g(j9, obj2));
                        l(i3, obj);
                    }
                    obj3 = obj;
                    break;
                case 11:
                    if (p(i3, obj2)) {
                        com.google.android.gms.internal.play_billing.AbstractC1830c1.i(com.google.android.gms.internal.play_billing.AbstractC1830c1.d(j9, obj2), j9, obj);
                        l(i3, obj);
                    }
                    obj3 = obj;
                    break;
                case 12:
                    if (p(i3, obj2)) {
                        com.google.android.gms.internal.play_billing.AbstractC1830c1.i(com.google.android.gms.internal.play_billing.AbstractC1830c1.d(j9, obj2), j9, obj);
                        l(i3, obj);
                    }
                    obj3 = obj;
                    break;
                case 13:
                    if (p(i3, obj2)) {
                        com.google.android.gms.internal.play_billing.AbstractC1830c1.i(com.google.android.gms.internal.play_billing.AbstractC1830c1.d(j9, obj2), j9, obj);
                        l(i3, obj);
                    }
                    obj3 = obj;
                    break;
                case 14:
                    if (p(i3, obj2)) {
                        com.google.android.gms.internal.play_billing.AbstractC1830c1.j(obj, j9, com.google.android.gms.internal.play_billing.AbstractC1830c1.e(j9, obj2));
                        l(i3, obj);
                    }
                    obj3 = obj;
                    break;
                case 15:
                    if (p(i3, obj2)) {
                        com.google.android.gms.internal.play_billing.AbstractC1830c1.i(com.google.android.gms.internal.play_billing.AbstractC1830c1.d(j9, obj2), j9, obj);
                        l(i3, obj);
                    }
                    obj3 = obj;
                    break;
                case 16:
                    if (p(i3, obj2)) {
                        com.google.android.gms.internal.play_billing.AbstractC1830c1.j(obj, j9, com.google.android.gms.internal.play_billing.AbstractC1830c1.e(j9, obj2));
                        l(i3, obj);
                    }
                    obj3 = obj;
                    break;
                case 17:
                    j(obj, i3, obj2);
                    obj3 = obj;
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case androidx.media3.extractor.ts.TsExtractor.TS_STREAM_TYPE_H265 /* 36 */:
                case 37:
                case androidx.media3.extractor.flac.FlacConstants.STREAM_INFO_BLOCK_SIZE /* 38 */:
                case androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_PREFIX_SEI /* 39 */:
                case 40:
                case 41:
                case androidx.media3.extractor.AacUtil.AUDIO_OBJECT_TYPE_AAC_XHE /* 42 */:
                case 43:
                case 44:
                case androidx.media3.extractor.ts.TsExtractor.TS_STREAM_TYPE_MHAS /* 45 */:
                case 46:
                case 47:
                case androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED /* 48 */:
                case com.revenuecat.purchases.utils.PurchaseParamsValidator.MAX_NUMBER_OF_ADD_ON_PRODUCTS /* 49 */:
                    com.google.android.gms.internal.play_billing.InterfaceC1885z0 interfaceC1885z0A = (com.google.android.gms.internal.play_billing.InterfaceC1885z0) com.google.android.gms.internal.play_billing.AbstractC1830c1.g(j9, obj);
                    com.google.android.gms.internal.play_billing.InterfaceC1885z0 interfaceC1885z0 = (com.google.android.gms.internal.play_billing.InterfaceC1885z0) com.google.android.gms.internal.play_billing.AbstractC1830c1.g(j9, obj2);
                    int size = interfaceC1885z0A.size();
                    int size2 = interfaceC1885z0.size();
                    if (size > 0 && size2 > 0) {
                        if (!((com.google.android.gms.internal.play_billing.AbstractC1844h0) interfaceC1885z0A).f19335h) {
                            interfaceC1885z0A = interfaceC1885z0A.a(size2 + size);
                        }
                        interfaceC1885z0A.addAll(interfaceC1885z0);
                    }
                    if (size > 0) {
                        interfaceC1885z0 = interfaceC1885z0A;
                    }
                    com.google.android.gms.internal.play_billing.AbstractC1830c1.k(j9, obj, interfaceC1885z0);
                    obj3 = obj;
                    break;
                case 50:
                    com.google.android.gms.internal.play_billing.C1873t0 c1873t0 = com.google.android.gms.internal.play_billing.U0.f19291a;
                    com.google.android.gms.internal.play_billing.AbstractC1830c1.k(j9, obj, com.google.android.gms.internal.play_billing.C1873t0.c(com.google.android.gms.internal.play_billing.AbstractC1830c1.g(j9, obj), com.google.android.gms.internal.play_billing.AbstractC1830c1.g(j9, obj2)));
                    obj3 = obj;
                    break;
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                case 58:
                case 59:
                    if (s(i10, i3, obj2)) {
                        com.google.android.gms.internal.play_billing.AbstractC1830c1.k(j9, obj, com.google.android.gms.internal.play_billing.AbstractC1830c1.g(j9, obj2));
                        com.google.android.gms.internal.play_billing.AbstractC1830c1.i(i10, iArr[i3 + 2] & 1048575, obj);
                    }
                    obj3 = obj;
                    break;
                case dev.jdtech.mpv.MPVLib.MPV_LOG_LEVEL_DEBUG /* 60 */:
                    k(obj, i3, obj2);
                    obj3 = obj;
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case androidx.media3.container.MdtaMetadataEntry.TYPE_INDICATOR_INT32 /* 67 */:
                    if (s(i10, i3, obj2)) {
                        com.google.android.gms.internal.play_billing.AbstractC1830c1.k(j9, obj, com.google.android.gms.internal.play_billing.AbstractC1830c1.g(j9, obj2));
                        com.google.android.gms.internal.play_billing.AbstractC1830c1.i(i10, iArr[i3 + 2] & 1048575, obj);
                    }
                    obj3 = obj;
                    break;
                case 68:
                    k(obj, i3, obj2);
                    obj3 = obj;
                    break;
                default:
                    obj3 = obj;
                    break;
            }
            i3 += 3;
            obj = obj3;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.T0
    public final com.google.android.gms.internal.play_billing.AbstractC1877v0 h() {
        return ((com.google.android.gms.internal.play_billing.AbstractC1877v0) this.f19265e).n();
    }

    @Override // com.google.android.gms.internal.play_billing.T0
    public final boolean i(com.google.android.gms.internal.play_billing.AbstractC1877v0 abstractC1877v0, com.google.android.gms.internal.play_billing.AbstractC1877v0 abstractC1877v1) {
        boolean zF;
        int i3 = 0;
        while (true) {
            int[] iArr = this.f19261a;
            if (i3 < iArr.length) {
                int iY = y(i3);
                long j9 = iY & 1048575;
                switch (x(iY)) {
                    case 0:
                        if (o(abstractC1877v0, abstractC1877v1, i3)) {
                            com.google.android.gms.internal.play_billing.AbstractC1827b1 abstractC1827b1 = com.google.android.gms.internal.play_billing.AbstractC1830c1.f19310c;
                            if (java.lang.Double.doubleToLongBits(abstractC1827b1.a(j9, abstractC1877v0)) == java.lang.Double.doubleToLongBits(abstractC1827b1.a(j9, abstractC1877v1))) {
                                continue;
                                i3 += 3;
                            }
                        }
                        break;
                    case 1:
                        if (o(abstractC1877v0, abstractC1877v1, i3)) {
                            com.google.android.gms.internal.play_billing.AbstractC1827b1 abstractC1827b2 = com.google.android.gms.internal.play_billing.AbstractC1830c1.f19310c;
                            if (java.lang.Float.floatToIntBits(abstractC1827b2.b(j9, abstractC1877v0)) == java.lang.Float.floatToIntBits(abstractC1827b2.b(j9, abstractC1877v1))) {
                                continue;
                                i3 += 3;
                            }
                        }
                        break;
                    case 2:
                        if (o(abstractC1877v0, abstractC1877v1, i3) && com.google.android.gms.internal.play_billing.AbstractC1830c1.e(j9, abstractC1877v0) == com.google.android.gms.internal.play_billing.AbstractC1830c1.e(j9, abstractC1877v1)) {
                            continue;
                            i3 += 3;
                        }
                        break;
                    case 3:
                        if (o(abstractC1877v0, abstractC1877v1, i3) && com.google.android.gms.internal.play_billing.AbstractC1830c1.e(j9, abstractC1877v0) == com.google.android.gms.internal.play_billing.AbstractC1830c1.e(j9, abstractC1877v1)) {
                            continue;
                            i3 += 3;
                        }
                        break;
                    case 4:
                        if (o(abstractC1877v0, abstractC1877v1, i3) && com.google.android.gms.internal.play_billing.AbstractC1830c1.d(j9, abstractC1877v0) == com.google.android.gms.internal.play_billing.AbstractC1830c1.d(j9, abstractC1877v1)) {
                            continue;
                            i3 += 3;
                        }
                        break;
                    case 5:
                        if (o(abstractC1877v0, abstractC1877v1, i3) && com.google.android.gms.internal.play_billing.AbstractC1830c1.e(j9, abstractC1877v0) == com.google.android.gms.internal.play_billing.AbstractC1830c1.e(j9, abstractC1877v1)) {
                            continue;
                            i3 += 3;
                        }
                        break;
                    case 6:
                        if (o(abstractC1877v0, abstractC1877v1, i3) && com.google.android.gms.internal.play_billing.AbstractC1830c1.d(j9, abstractC1877v0) == com.google.android.gms.internal.play_billing.AbstractC1830c1.d(j9, abstractC1877v1)) {
                            continue;
                            i3 += 3;
                        }
                        break;
                    case 7:
                        if (o(abstractC1877v0, abstractC1877v1, i3)) {
                            com.google.android.gms.internal.play_billing.AbstractC1827b1 abstractC1827b3 = com.google.android.gms.internal.play_billing.AbstractC1830c1.f19310c;
                            if (abstractC1827b3.g(j9, abstractC1877v0) == abstractC1827b3.g(j9, abstractC1877v1)) {
                                continue;
                                i3 += 3;
                            }
                        }
                        break;
                    case 8:
                        if (o(abstractC1877v0, abstractC1877v1, i3) && com.google.android.gms.internal.play_billing.U0.f(com.google.android.gms.internal.play_billing.AbstractC1830c1.g(j9, abstractC1877v0), com.google.android.gms.internal.play_billing.AbstractC1830c1.g(j9, abstractC1877v1))) {
                            continue;
                            i3 += 3;
                        }
                        break;
                    case 9:
                        if (o(abstractC1877v0, abstractC1877v1, i3) && com.google.android.gms.internal.play_billing.U0.f(com.google.android.gms.internal.play_billing.AbstractC1830c1.g(j9, abstractC1877v0), com.google.android.gms.internal.play_billing.AbstractC1830c1.g(j9, abstractC1877v1))) {
                            continue;
                            i3 += 3;
                        }
                        break;
                    case 10:
                        if (o(abstractC1877v0, abstractC1877v1, i3) && com.google.android.gms.internal.play_billing.U0.f(com.google.android.gms.internal.play_billing.AbstractC1830c1.g(j9, abstractC1877v0), com.google.android.gms.internal.play_billing.AbstractC1830c1.g(j9, abstractC1877v1))) {
                            continue;
                            i3 += 3;
                        }
                        break;
                    case 11:
                        if (o(abstractC1877v0, abstractC1877v1, i3) && com.google.android.gms.internal.play_billing.AbstractC1830c1.d(j9, abstractC1877v0) == com.google.android.gms.internal.play_billing.AbstractC1830c1.d(j9, abstractC1877v1)) {
                            continue;
                            i3 += 3;
                        }
                        break;
                    case 12:
                        if (o(abstractC1877v0, abstractC1877v1, i3) && com.google.android.gms.internal.play_billing.AbstractC1830c1.d(j9, abstractC1877v0) == com.google.android.gms.internal.play_billing.AbstractC1830c1.d(j9, abstractC1877v1)) {
                            continue;
                            i3 += 3;
                        }
                        break;
                    case 13:
                        if (o(abstractC1877v0, abstractC1877v1, i3) && com.google.android.gms.internal.play_billing.AbstractC1830c1.d(j9, abstractC1877v0) == com.google.android.gms.internal.play_billing.AbstractC1830c1.d(j9, abstractC1877v1)) {
                            continue;
                            i3 += 3;
                        }
                        break;
                    case 14:
                        if (o(abstractC1877v0, abstractC1877v1, i3) && com.google.android.gms.internal.play_billing.AbstractC1830c1.e(j9, abstractC1877v0) == com.google.android.gms.internal.play_billing.AbstractC1830c1.e(j9, abstractC1877v1)) {
                            continue;
                            i3 += 3;
                        }
                        break;
                    case 15:
                        if (o(abstractC1877v0, abstractC1877v1, i3) && com.google.android.gms.internal.play_billing.AbstractC1830c1.d(j9, abstractC1877v0) == com.google.android.gms.internal.play_billing.AbstractC1830c1.d(j9, abstractC1877v1)) {
                            continue;
                            i3 += 3;
                        }
                        break;
                    case 16:
                        if (o(abstractC1877v0, abstractC1877v1, i3) && com.google.android.gms.internal.play_billing.AbstractC1830c1.e(j9, abstractC1877v0) == com.google.android.gms.internal.play_billing.AbstractC1830c1.e(j9, abstractC1877v1)) {
                            continue;
                            i3 += 3;
                        }
                        break;
                    case 17:
                        if (o(abstractC1877v0, abstractC1877v1, i3) && com.google.android.gms.internal.play_billing.U0.f(com.google.android.gms.internal.play_billing.AbstractC1830c1.g(j9, abstractC1877v0), com.google.android.gms.internal.play_billing.AbstractC1830c1.g(j9, abstractC1877v1))) {
                            continue;
                            i3 += 3;
                        }
                        break;
                    case 18:
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                    case 29:
                    case 30:
                    case 31:
                    case 32:
                    case 33:
                    case 34:
                    case 35:
                    case androidx.media3.extractor.ts.TsExtractor.TS_STREAM_TYPE_H265 /* 36 */:
                    case 37:
                    case androidx.media3.extractor.flac.FlacConstants.STREAM_INFO_BLOCK_SIZE /* 38 */:
                    case androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_PREFIX_SEI /* 39 */:
                    case 40:
                    case 41:
                    case androidx.media3.extractor.AacUtil.AUDIO_OBJECT_TYPE_AAC_XHE /* 42 */:
                    case 43:
                    case 44:
                    case androidx.media3.extractor.ts.TsExtractor.TS_STREAM_TYPE_MHAS /* 45 */:
                    case 46:
                    case 47:
                    case androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED /* 48 */:
                    case com.revenuecat.purchases.utils.PurchaseParamsValidator.MAX_NUMBER_OF_ADD_ON_PRODUCTS /* 49 */:
                        zF = com.google.android.gms.internal.play_billing.U0.f(com.google.android.gms.internal.play_billing.AbstractC1830c1.g(j9, abstractC1877v0), com.google.android.gms.internal.play_billing.AbstractC1830c1.g(j9, abstractC1877v1));
                        break;
                    case 50:
                        zF = com.google.android.gms.internal.play_billing.U0.f(com.google.android.gms.internal.play_billing.AbstractC1830c1.g(j9, abstractC1877v0), com.google.android.gms.internal.play_billing.AbstractC1830c1.g(j9, abstractC1877v1));
                        break;
                    case 51:
                    case 52:
                    case 53:
                    case 54:
                    case 55:
                    case 56:
                    case 57:
                    case 58:
                    case 59:
                    case dev.jdtech.mpv.MPVLib.MPV_LOG_LEVEL_DEBUG /* 60 */:
                    case 61:
                    case 62:
                    case 63:
                    case 64:
                    case 65:
                    case 66:
                    case androidx.media3.container.MdtaMetadataEntry.TYPE_INDICATOR_INT32 /* 67 */:
                    case 68:
                        long j10 = iArr[i3 + 2] & 1048575;
                        if (com.google.android.gms.internal.play_billing.AbstractC1830c1.d(j10, abstractC1877v0) == com.google.android.gms.internal.play_billing.AbstractC1830c1.d(j10, abstractC1877v1) && com.google.android.gms.internal.play_billing.U0.f(com.google.android.gms.internal.play_billing.AbstractC1830c1.g(j9, abstractC1877v0), com.google.android.gms.internal.play_billing.AbstractC1830c1.g(j9, abstractC1877v1))) {
                            continue;
                            i3 += 3;
                        }
                        break;
                    default:
                        continue;
                        i3 += 3;
                        break;
                }
                if (zF) {
                    i3 += 3;
                }
            } else if (abstractC1877v0.zzc.equals(abstractC1877v1.zzc)) {
                return true;
            }
        }
        return false;
    }

    public final void j(java.lang.Object obj, int i3, java.lang.Object obj2) {
        if (p(i3, obj2)) {
            int iY = y(i3) & 1048575;
            sun.misc.Unsafe unsafe = f19260k;
            long j9 = iY;
            java.lang.Object object = unsafe.getObject(obj2, j9);
            if (object == null) {
                throw new java.lang.IllegalStateException("Source subfield " + this.f19261a[i3] + " is present but null: " + obj2.toString());
            }
            com.google.android.gms.internal.play_billing.T0 t0B = B(i3);
            if (!p(i3, obj)) {
                if (r(object)) {
                    com.google.android.gms.internal.play_billing.AbstractC1877v0 abstractC1877v0H = t0B.h();
                    t0B.g(abstractC1877v0H, object);
                    unsafe.putObject(obj, j9, abstractC1877v0H);
                } else {
                    unsafe.putObject(obj, j9, object);
                }
                l(i3, obj);
                return;
            }
            java.lang.Object object2 = unsafe.getObject(obj, j9);
            if (!r(object2)) {
                com.google.android.gms.internal.play_billing.AbstractC1877v0 abstractC1877v0H2 = t0B.h();
                t0B.g(abstractC1877v0H2, object2);
                unsafe.putObject(obj, j9, abstractC1877v0H2);
                object2 = abstractC1877v0H2;
            }
            t0B.g(object2, object);
        }
    }

    public final void k(java.lang.Object obj, int i3, java.lang.Object obj2) {
        int[] iArr = this.f19261a;
        int i9 = iArr[i3];
        if (s(i9, i3, obj2)) {
            int iY = y(i3) & 1048575;
            sun.misc.Unsafe unsafe = f19260k;
            long j9 = iY;
            java.lang.Object object = unsafe.getObject(obj2, j9);
            if (object == null) {
                throw new java.lang.IllegalStateException("Source subfield " + iArr[i3] + " is present but null: " + obj2.toString());
            }
            com.google.android.gms.internal.play_billing.T0 t0B = B(i3);
            if (!s(i9, i3, obj)) {
                if (r(object)) {
                    com.google.android.gms.internal.play_billing.AbstractC1877v0 abstractC1877v0H = t0B.h();
                    t0B.g(abstractC1877v0H, object);
                    unsafe.putObject(obj, j9, abstractC1877v0H);
                } else {
                    unsafe.putObject(obj, j9, object);
                }
                com.google.android.gms.internal.play_billing.AbstractC1830c1.i(i9, iArr[i3 + 2] & 1048575, obj);
                return;
            }
            java.lang.Object object2 = unsafe.getObject(obj, j9);
            if (!r(object2)) {
                com.google.android.gms.internal.play_billing.AbstractC1877v0 abstractC1877v0H2 = t0B.h();
                t0B.g(abstractC1877v0H2, object2);
                unsafe.putObject(obj, j9, abstractC1877v0H2);
                object2 = abstractC1877v0H2;
            }
            t0B.g(object2, object);
        }
    }

    public final void l(int i3, java.lang.Object obj) {
        int i9 = this.f19261a[i3 + 2];
        long j9 = 1048575 & i9;
        if (j9 == 1048575) {
            return;
        }
        com.google.android.gms.internal.play_billing.AbstractC1830c1.i((1 << (i9 >>> 20)) | com.google.android.gms.internal.play_billing.AbstractC1830c1.d(j9, obj), j9, obj);
    }

    public final void m(java.lang.Object obj, int i3, java.lang.Object obj2) {
        f19260k.putObject(obj, y(i3) & 1048575, obj2);
        l(i3, obj);
    }

    public final void n(java.lang.Object obj, int i3, java.lang.Object obj2, int i9) {
        f19260k.putObject(obj, y(i9) & 1048575, obj2);
        com.google.android.gms.internal.play_billing.AbstractC1830c1.i(i3, this.f19261a[i9 + 2] & 1048575, obj);
    }

    public final boolean o(com.google.android.gms.internal.play_billing.AbstractC1877v0 abstractC1877v0, com.google.android.gms.internal.play_billing.AbstractC1877v0 abstractC1877v1, int i3) {
        return p(i3, abstractC1877v0) == p(i3, abstractC1877v1);
    }

    public final boolean p(int i3, java.lang.Object obj) {
        int i9 = this.f19261a[i3 + 2];
        long j9 = i9 & 1048575;
        if (j9 == 1048575) {
            int iY = y(i3);
            long j10 = iY & 1048575;
            switch (x(iY)) {
                case 0:
                    if (java.lang.Double.doubleToRawLongBits(com.google.android.gms.internal.play_billing.AbstractC1830c1.f19310c.a(j10, obj)) == 0) {
                        return false;
                    }
                    break;
                case 1:
                    if (java.lang.Float.floatToRawIntBits(com.google.android.gms.internal.play_billing.AbstractC1830c1.f19310c.b(j10, obj)) == 0) {
                        return false;
                    }
                    break;
                case 2:
                    if (com.google.android.gms.internal.play_billing.AbstractC1830c1.e(j10, obj) == 0) {
                        return false;
                    }
                    break;
                case 3:
                    if (com.google.android.gms.internal.play_billing.AbstractC1830c1.e(j10, obj) == 0) {
                        return false;
                    }
                    break;
                case 4:
                    if (com.google.android.gms.internal.play_billing.AbstractC1830c1.d(j10, obj) == 0) {
                        return false;
                    }
                    break;
                case 5:
                    if (com.google.android.gms.internal.play_billing.AbstractC1830c1.e(j10, obj) == 0) {
                        return false;
                    }
                    break;
                case 6:
                    if (com.google.android.gms.internal.play_billing.AbstractC1830c1.d(j10, obj) == 0) {
                        return false;
                    }
                    break;
                case 7:
                    return com.google.android.gms.internal.play_billing.AbstractC1830c1.f19310c.g(j10, obj);
                case 8:
                    java.lang.Object objG = com.google.android.gms.internal.play_billing.AbstractC1830c1.g(j10, obj);
                    if (objG instanceof java.lang.String) {
                        if (((java.lang.String) objG).isEmpty()) {
                            return false;
                        }
                    } else {
                        if (!(objG instanceof com.google.android.gms.internal.play_billing.AbstractC1859m0)) {
                            throw new java.lang.IllegalArgumentException();
                        }
                        if (com.google.android.gms.internal.play_billing.AbstractC1859m0.f19359i.equals(objG)) {
                            return false;
                        }
                    }
                case 9:
                    if (com.google.android.gms.internal.play_billing.AbstractC1830c1.g(j10, obj) == null) {
                        return false;
                    }
                    break;
                case 10:
                    if (com.google.android.gms.internal.play_billing.AbstractC1859m0.f19359i.equals(com.google.android.gms.internal.play_billing.AbstractC1830c1.g(j10, obj))) {
                        return false;
                    }
                    break;
                case 11:
                    if (com.google.android.gms.internal.play_billing.AbstractC1830c1.d(j10, obj) == 0) {
                        return false;
                    }
                    break;
                case 12:
                    if (com.google.android.gms.internal.play_billing.AbstractC1830c1.d(j10, obj) == 0) {
                        return false;
                    }
                    break;
                case 13:
                    if (com.google.android.gms.internal.play_billing.AbstractC1830c1.d(j10, obj) == 0) {
                        return false;
                    }
                    break;
                case 14:
                    if (com.google.android.gms.internal.play_billing.AbstractC1830c1.e(j10, obj) == 0) {
                        return false;
                    }
                    break;
                case 15:
                    if (com.google.android.gms.internal.play_billing.AbstractC1830c1.d(j10, obj) == 0) {
                        return false;
                    }
                    break;
                case 16:
                    if (com.google.android.gms.internal.play_billing.AbstractC1830c1.e(j10, obj) == 0) {
                        return false;
                    }
                    break;
                case 17:
                    if (com.google.android.gms.internal.play_billing.AbstractC1830c1.g(j10, obj) == null) {
                        return false;
                    }
                    break;
                default:
                    throw new java.lang.IllegalArgumentException();
            }
        } else if (((1 << (i9 >>> 20)) & com.google.android.gms.internal.play_billing.AbstractC1830c1.d(j9, obj)) == 0) {
            return false;
        }
        return true;
    }

    public final boolean q(java.lang.Object obj, int i3, int i9, int i10, int i11) {
        if (i9 == 1048575) {
            return p(i3, obj);
        }
        return (i10 & i11) != 0;
    }

    public final boolean s(int i3, int i9, java.lang.Object obj) {
        return com.google.android.gms.internal.play_billing.AbstractC1830c1.d((long) (this.f19261a[i9 + 2] & 1048575), obj) == i3;
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 42381. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    public final int t(java.lang.Object r39, byte[] r40, int r41, int r42, int r43, com.google.android.gms.internal.play_billing.C1850j0 r44) {
        /*
            Method dump skipped, instruction units count: 4238
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.play_billing.N0.t(java.lang.Object, byte[], int, int, int, com.google.android.gms.internal.play_billing.j0):int");
    }

    public final int w(int i3, int i9) {
        int[] iArr = this.f19261a;
        int length = (iArr.length / 3) - 1;
        while (i9 <= length) {
            int i10 = (length + i9) >>> 1;
            int i11 = i10 * 3;
            int i12 = iArr[i11];
            if (i3 == i12) {
                return i11;
            }
            if (i3 < i12) {
                length = i10 - 1;
            } else {
                i9 = i10 + 1;
            }
        }
        return -1;
    }

    public final int y(int i3) {
        return this.f19261a[i3 + 1];
    }
}
