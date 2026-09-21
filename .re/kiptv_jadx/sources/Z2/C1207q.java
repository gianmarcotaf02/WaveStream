package Z2;

/* JADX INFO: renamed from: Z2.q, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1207q {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final float[] f12913b = {1.0f, 10.0f, 100.0f, 1000.0f, 10000.0f, 100000.0f, 1000000.0f, 1.0E7f, 1.0E8f, 1.0E9f, 1.0E10f, 1.0E11f, 1.0E12f, 1.0E13f, 1.0E14f, 1.0E15f, 1.0E16f, 1.0E17f, 1.0E18f, 1.0E19f, 1.0E20f, 1.0E21f, 1.0E22f, 1.0E23f, 1.0E24f, 1.0E25f, 1.0E26f, 1.0E27f, 1.0E28f, 1.0E29f, 1.0E30f, 1.0E31f, 1.0E32f, 1.0E33f, 1.0E34f, 1.0E35f, 1.0E36f, 1.0E37f, 1.0E38f};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final float[] f12914c = {1.0f, 0.1f, 0.01f, 0.001f, 1.0E-4f, 1.0E-5f, 1.0E-6f, 1.0E-7f, 1.0E-8f, 1.0E-9f, 1.0E-10f, 1.0E-11f, 1.0E-12f, 1.0E-13f, 1.0E-14f, 1.0E-15f, 1.0E-16f, 1.0E-17f, 1.0E-18f, 1.0E-19f, 1.0E-20f, 1.0E-21f, 1.0E-22f, 1.0E-23f, 1.0E-24f, 1.0E-25f, 1.0E-26f, 1.0E-27f, 1.0E-28f, 1.0E-29f, 1.0E-30f, 1.0E-31f, 1.0E-32f, 1.0E-33f, 1.0E-34f, 1.0E-35f, 1.0E-36f, 1.0E-37f, 1.0E-38f};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f12915a;

    /* JADX WARN: Code duplicated, block: B:108:0x008a A[EDGE_INSN: B:108:0x008a->B:42:0x008a BREAK  A[LOOP:0: B:13:0x0034->B:41:0x0083], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:119:0x0101 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:15:0x0043  */
    /* JADX WARN: Code duplicated, block: B:17:0x0049 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:18:0x004b  */
    /* JADX WARN: Code duplicated, block: B:19:0x004e  */
    /* JADX WARN: Code duplicated, block: B:20:0x0051  */
    /* JADX WARN: Code duplicated, block: B:47:0x0095 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:48:0x0097 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:49:0x0098  */
    /* JADX WARN: Code duplicated, block: B:51:0x009c  */
    /* JADX WARN: Code duplicated, block: B:60:0x00b8 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:61:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:63:0x00bf A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:64:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:65:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:66:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:68:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:69:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:72:0x00de  */
    /* JADX WARN: Code duplicated, block: B:75:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:84:0x0105 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:85:0x0106 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:86:0x0108  */
    /* JADX WARN: Code duplicated, block: B:87:0x010a  */
    public final float a(int i3, int i9, java.lang.String str) {
        boolean z6;
        int i10;
        int i11;
        int i12;
        boolean z9;
        int i13;
        int i14;
        int i15;
        int i16;
        float f9;
        char cCharAt;
        int i17;
        char cCharAt2;
        boolean z10;
        boolean z11;
        int i18;
        int i19;
        int i20;
        char cCharAt3;
        char cCharAt4;
        this.f12915a = i3;
        if (i3 >= i9) {
            return Float.NaN;
        }
        char cCharAt5 = str.charAt(i3);
        if (cCharAt5 != '+') {
            if (cCharAt5 != '-') {
                z6 = false;
            } else {
                z6 = true;
            }
            int i21 = this.f12915a;
            long j = 0;
            i10 = 0;
            i11 = 0;
            i12 = 0;
            z9 = false;
            i13 = 0;
            while (true) {
                i14 = this.f12915a;
                if (i14 >= i9) {
                    break;
                }
                cCharAt4 = str.charAt(i14);
                if (cCharAt4 != '0') {
                    if (i10 == 0) {
                        i12++;
                    } else {
                        i11++;
                    }
                } else if (cCharAt4 < '1' && cCharAt4 <= '9') {
                    int i22 = i10 + i11;
                    while (i11 > 0) {
                        if (j > 922337203685477580L) {
                            return Float.NaN;
                        }
                        j *= 10;
                        i11--;
                    }
                    if (j > 922337203685477580L) {
                        return Float.NaN;
                    }
                    j = (j * 10) + ((long) (cCharAt4 - '0'));
                    i10 = i22 + 1;
                    if (j < 0) {
                        return Float.NaN;
                    }
                } else {
                    if (cCharAt4 != '.' || z9) {
                        break;
                    }
                    i13 = this.f12915a - i21;
                    z9 = true;
                }
                this.f12915a++;
            }
            if (!z9 && this.f12915a == i13 + 1) {
                return Float.NaN;
            }
            if (i10 == 0) {
                if (i12 == 0) {
                    return Float.NaN;
                }
                i10 = 1;
            }
            if (z9) {
                i11 = (i13 - i12) - i10;
            }
            i15 = this.f12915a;
            if (i15 < i9 && ((cCharAt = str.charAt(i15)) == 'E' || cCharAt == 'e')) {
                i17 = this.f12915a + 1;
                this.f12915a = i17;
                if (i17 == i9) {
                    return Float.NaN;
                }
                cCharAt2 = str.charAt(i17);
                if (cCharAt2 != '+') {
                    if (cCharAt2 != '-') {
                        switch (cCharAt2) {
                            case androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED /* 48 */:
                            case com.revenuecat.purchases.utils.PurchaseParamsValidator.MAX_NUMBER_OF_ADD_ON_PRODUCTS /* 49 */:
                            case '2':
                            case '3':
                            case '4':
                            case '5':
                            case '6':
                            case '7':
                            case '8':
                            case '9':
                                z10 = false;
                                z11 = false;
                                break;
                            default:
                                this.f12915a--;
                                z11 = true;
                                z10 = false;
                                break;
                        }
                    } else {
                        z10 = true;
                    }
                    if (!z11) {
                        i18 = this.f12915a;
                        i19 = 0;
                        while (true) {
                            i20 = this.f12915a;
                            if (i20 >= i9 && (cCharAt3 = str.charAt(i20)) >= '0' && cCharAt3 <= '9') {
                                if (i19 > 922337203685477580L) {
                                    return Float.NaN;
                                }
                                i19 = (i19 * 10) + (cCharAt3 - '0');
                                this.f12915a++;
                            }
                        }
                        if (this.f12915a == i18) {
                            return Float.NaN;
                        }
                        if (z10) {
                            i11 -= i19;
                        } else {
                            i11 += i19;
                        }
                    }
                } else {
                    z10 = false;
                }
                this.f12915a++;
                z11 = false;
                if (!z11) {
                    i18 = this.f12915a;
                    i19 = 0;
                    while (true) {
                        i20 = this.f12915a;
                        if (i20 >= i9) {
                        }
                        i19 = (i19 * 10) + (cCharAt3 - '0');
                        this.f12915a++;
                    }
                    if (this.f12915a == i18) {
                        return Float.NaN;
                    }
                    if (z10) {
                        i11 -= i19;
                    } else {
                        i11 += i19;
                    }
                }
            }
            i16 = i10 + i11;
            if (i16 <= 39 || i16 < -44) {
                return Float.NaN;
            }
            float f10 = j;
            if (j != 0) {
                if (i11 > 0) {
                    f9 = f12913b[i11];
                } else if (i11 < 0) {
                    if (i11 < -38) {
                        f10 = (float) (((double) f10) * 1.0E-20d);
                        i11 += 20;
                    }
                    f9 = f12914c[-i11];
                }
                f10 *= f9;
            }
            return z6 ? -f10 : f10;
        }
        z6 = false;
        this.f12915a++;
        int i23 = this.f12915a;
        long j9 = 0;
        i10 = 0;
        i11 = 0;
        i12 = 0;
        z9 = false;
        i13 = 0;
        while (true) {
            i14 = this.f12915a;
            if (i14 >= i9) {
                break;
                break;
            }
            cCharAt4 = str.charAt(i14);
            if (cCharAt4 != '0') {
                if (cCharAt4 < '1') {
                }
                if (cCharAt4 != '.') {
                    break;
                }
                break;
                break;
            }
            if (i10 == 0) {
                i12++;
            } else {
                i11++;
            }
            this.f12915a++;
        }
        if (!z9) {
        }
        if (i10 == 0) {
            if (i12 == 0) {
                return Float.NaN;
            }
            i10 = 1;
        }
        if (z9) {
            i11 = (i13 - i12) - i10;
        }
        i15 = this.f12915a;
        if (i15 < i9) {
            i17 = this.f12915a + 1;
            this.f12915a = i17;
            if (i17 == i9) {
                return Float.NaN;
            }
            cCharAt2 = str.charAt(i17);
            if (cCharAt2 != '+') {
                if (cCharAt2 != '-') {
                    switch (cCharAt2) {
                        case androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED /* 48 */:
                        case com.revenuecat.purchases.utils.PurchaseParamsValidator.MAX_NUMBER_OF_ADD_ON_PRODUCTS /* 49 */:
                        case '2':
                        case '3':
                        case '4':
                        case '5':
                        case '6':
                        case '7':
                        case '8':
                        case '9':
                            z10 = false;
                            z11 = false;
                            break;
                        default:
                            this.f12915a--;
                            z11 = true;
                            z10 = false;
                            break;
                    }
                } else {
                    z10 = true;
                }
                if (!z11) {
                    i18 = this.f12915a;
                    i19 = 0;
                    while (true) {
                        i20 = this.f12915a;
                        if (i20 >= i9) {
                        }
                        i19 = (i19 * 10) + (cCharAt3 - '0');
                        this.f12915a++;
                    }
                    if (this.f12915a == i18) {
                        return Float.NaN;
                    }
                    if (z10) {
                        i11 -= i19;
                    } else {
                        i11 += i19;
                    }
                }
            } else {
                z10 = false;
            }
            this.f12915a++;
            z11 = false;
            if (!z11) {
                i18 = this.f12915a;
                i19 = 0;
                while (true) {
                    i20 = this.f12915a;
                    if (i20 >= i9) {
                    }
                    i19 = (i19 * 10) + (cCharAt3 - '0');
                    this.f12915a++;
                }
                if (this.f12915a == i18) {
                    return Float.NaN;
                }
                if (z10) {
                    i11 -= i19;
                } else {
                    i11 += i19;
                }
            }
        }
        i16 = i10 + i11;
        if (i16 <= 39) {
        }
        return Float.NaN;
    }
}
