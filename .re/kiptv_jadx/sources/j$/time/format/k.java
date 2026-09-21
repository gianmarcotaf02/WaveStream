package j$.time.format;

/* JADX INFO: loaded from: classes3.dex */
public final class k implements j$.time.format.InterfaceC2508e {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final java.lang.String[] f23703d = {"+HH", "+HHmm", "+HH:mm", "+HHMM", "+HH:MM", "+HHMMss", "+HH:MM:ss", "+HHMMSS", "+HH:MM:SS", "+HHmmss", "+HH:mm:ss", "+H", "+Hmm", "+H:mm", "+HMM", "+H:MM", "+HMMss", "+H:MM:ss", "+HMMSS", "+H:MM:SS", "+Hmmss", "+H:mm:ss"};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final j$.time.format.k f23704e = new j$.time.format.k("+HH:MM:ss", "Z");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final j$.time.format.k f23705f = new j$.time.format.k("+HH:MM:ss", "0");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.String f23706a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f23707b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f23708c;

    public k(java.lang.String str, java.lang.String str2) {
        java.util.Objects.requireNonNull(str, "pattern");
        java.util.Objects.requireNonNull(str2, "noOffsetText");
        int i3 = 0;
        while (true) {
            java.lang.String[] strArr = f23703d;
            if (i3 < strArr.length) {
                if (strArr[i3].equals(str)) {
                    this.f23707b = i3;
                    this.f23708c = i3 % 11;
                    this.f23706a = str2;
                    return;
                }
                i3++;
            } else {
                throw new java.lang.IllegalArgumentException("Invalid zone offset pattern: ".concat(str));
            }
        }
    }

    @Override // j$.time.format.InterfaceC2508e
    public final boolean p(j$.time.format.x xVar, java.lang.StringBuilder sb) {
        java.lang.Long lA = xVar.a(j$.time.temporal.a.OFFSET_SECONDS);
        boolean z6 = false;
        if (lA == null) {
            return false;
        }
        int intExact = java.lang.Math.toIntExact(lA.longValue());
        java.lang.String str = this.f23706a;
        if (intExact == 0) {
            sb.append(str);
            return true;
        }
        int iAbs = java.lang.Math.abs((intExact / 3600) % 100);
        int iAbs2 = java.lang.Math.abs((intExact / 60) % 60);
        int iAbs3 = java.lang.Math.abs(intExact % 60);
        int length = sb.length();
        sb.append(intExact < 0 ? "-" : "+");
        if (this.f23707b < 11 || iAbs >= 10) {
            a(false, iAbs, sb);
        } else {
            sb.append((char) (iAbs + 48));
        }
        int i3 = this.f23708c;
        if ((i3 >= 3 && i3 <= 8) || ((i3 >= 9 && iAbs3 > 0) || (i3 >= 1 && iAbs2 > 0))) {
            a(i3 > 0 && i3 % 2 == 0, iAbs2, sb);
            iAbs += iAbs2;
            if (i3 == 7 || i3 == 8 || (i3 >= 5 && iAbs3 > 0)) {
                if (i3 > 0 && i3 % 2 == 0) {
                    z6 = true;
                }
                a(z6, iAbs3, sb);
                iAbs += iAbs3;
            }
        }
        if (iAbs == 0) {
            sb.setLength(length);
            sb.append(str);
        }
        return true;
    }

    public static void a(boolean z6, int i3, java.lang.StringBuilder sb) {
        sb.append(z6 ? ":" : "");
        sb.append((char) ((i3 / 10) + 48));
        sb.append((char) ((i3 % 10) + 48));
    }

    @Override // j$.time.format.InterfaceC2508e
    public final int r(j$.time.format.v vVar, java.lang.CharSequence charSequence, int i3) {
        java.lang.CharSequence charSequence2;
        int i9;
        int i10;
        int i11;
        int i12;
        int length = charSequence.length();
        int length2 = this.f23706a.length();
        if (length2 == 0) {
            if (i3 == length) {
                return vVar.g(j$.time.temporal.a.OFFSET_SECONDS, 0L, i3, i3);
            }
            charSequence2 = charSequence;
        } else {
            if (i3 == length) {
                return ~i3;
            }
            charSequence2 = charSequence;
            if (vVar.h(charSequence2, i3, this.f23706a, 0, length2)) {
                return vVar.g(j$.time.temporal.a.OFFSET_SECONDS, 0L, i3, i3 + length2);
            }
        }
        char cCharAt = charSequence.charAt(i3);
        if (cCharAt == '+' || cCharAt == '-') {
            int i13 = cCharAt == '-' ? -1 : 1;
            int i14 = this.f23708c;
            boolean z6 = i14 > 0 && i14 % 2 == 0;
            int i15 = this.f23707b;
            boolean z9 = i15 < 11;
            int[] iArr = new int[4];
            iArr[0] = i3 + 1;
            if (!vVar.f23739c) {
                if (z9) {
                    if (z6 || (i15 == 0 && length > (i12 = i3 + 3) && charSequence2.charAt(i12) == ':')) {
                        i15 = 10;
                        z6 = true;
                    } else {
                        i15 = 9;
                    }
                } else if (z6 || (i15 == 11 && length > (i11 = i3 + 3) && (charSequence2.charAt(i3 + 2) == ':' || charSequence2.charAt(i11) == ':'))) {
                    i15 = 21;
                    z6 = true;
                } else {
                    i15 = 20;
                }
            }
            switch (i15) {
                case 0:
                case 11:
                    c(charSequence2, z9, iArr);
                    break;
                case 1:
                case 2:
                case 13:
                    c(charSequence2, z9, iArr);
                    d(charSequence2, z6, false, iArr);
                    break;
                case 3:
                case 4:
                case 15:
                    c(charSequence2, z9, iArr);
                    d(charSequence2, z6, true, iArr);
                    break;
                case 5:
                case 6:
                case 17:
                    c(charSequence2, z9, iArr);
                    d(charSequence2, z6, true, iArr);
                    b(charSequence2, z6, 3, iArr);
                    break;
                case 7:
                case 8:
                case 19:
                    c(charSequence2, z9, iArr);
                    d(charSequence2, z6, true, iArr);
                    if (!b(charSequence2, z6, 3, iArr)) {
                        iArr[0] = ~iArr[0];
                    }
                    break;
                case 9:
                case 10:
                case 21:
                    c(charSequence2, z9, iArr);
                    if (b(charSequence2, z6, 2, iArr)) {
                        b(charSequence2, z6, 3, iArr);
                    }
                    break;
                case 12:
                    e(charSequence2, 1, 4, iArr);
                    break;
                case 14:
                    e(charSequence2, 3, 4, iArr);
                    break;
                case 16:
                    e(charSequence2, 3, 6, iArr);
                    break;
                case 18:
                    e(charSequence2, 5, 6, iArr);
                    break;
                case 20:
                    e(charSequence2, 1, 6, iArr);
                    break;
            }
            int i16 = iArr[0];
            if (i16 > 0) {
                int i17 = iArr[1];
                if (i17 > 23 || (i9 = iArr[2]) > 59 || (i10 = iArr[3]) > 59) {
                    throw new j$.time.DateTimeException("Value out of range: Hour[0-23], Minute[0-59], Second[0-59]");
                }
                return vVar.g(j$.time.temporal.a.OFFSET_SECONDS, ((((long) i9) * 60) + (((long) i17) * 3600) + ((long) i10)) * ((long) i13), i3, i16);
            }
        }
        return length2 == 0 ? vVar.g(j$.time.temporal.a.OFFSET_SECONDS, 0L, i3, i3) : ~i3;
    }

    public static void c(java.lang.CharSequence charSequence, boolean z6, int[] iArr) {
        if (z6) {
            if (b(charSequence, false, 1, iArr)) {
                return;
            }
            iArr[0] = ~iArr[0];
            return;
        }
        e(charSequence, 1, 2, iArr);
    }

    public static void d(java.lang.CharSequence charSequence, boolean z6, boolean z9, int[] iArr) {
        if (b(charSequence, z6, 2, iArr) || !z9) {
            return;
        }
        iArr[0] = ~iArr[0];
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0026  */
    public static boolean b(java.lang.CharSequence charSequence, boolean z6, int i3, int[] iArr) {
        int i9;
        char cCharAt;
        char cCharAt2;
        int i10;
        int i11 = iArr[0];
        if (i11 < 0) {
            return true;
        }
        if (z6 && i3 != 1) {
            int i12 = i11 + 1;
            if (i12 <= charSequence.length() && charSequence.charAt(i11) == ':') {
                i11 = i12;
                i9 = i11 + 2;
                if (i9 <= charSequence.length()) {
                    int i13 = i11 + 1;
                    cCharAt = charSequence.charAt(i11);
                    cCharAt2 = charSequence.charAt(i13);
                    if (cCharAt >= '0') {
                        i10 = (cCharAt2 - '0') + ((cCharAt - '0') * 10);
                        if (i10 >= 0) {
                            iArr[i3] = i10;
                            iArr[0] = i9;
                            return true;
                        }
                    }
                }
            }
        } else {
            i9 = i11 + 2;
            if (i9 <= charSequence.length()) {
                int i14 = i11 + 1;
                cCharAt = charSequence.charAt(i11);
                cCharAt2 = charSequence.charAt(i14);
                if (cCharAt >= '0' && cCharAt <= '9' && cCharAt2 >= '0' && cCharAt2 <= '9') {
                    i10 = (cCharAt2 - '0') + ((cCharAt - '0') * 10);
                    if (i10 >= 0 && i10 <= 59) {
                        iArr[i3] = i10;
                        iArr[0] = i9;
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static void e(java.lang.CharSequence charSequence, int i3, int i9, int[] iArr) {
        int i10;
        char cCharAt;
        int i11 = iArr[0];
        char[] cArr = new char[i9];
        int i12 = 0;
        int i13 = 0;
        while (i12 < i9 && (i10 = i11 + 1) <= charSequence.length() && (cCharAt = charSequence.charAt(i11)) >= '0' && cCharAt <= '9') {
            cArr[i12] = cCharAt;
            i13++;
            i12++;
            i11 = i10;
        }
        if (i13 < i3) {
            iArr[0] = ~iArr[0];
            return;
        }
        switch (i13) {
            case 1:
                iArr[1] = cArr[0] - '0';
                break;
            case 2:
                iArr[1] = (cArr[1] - '0') + ((cArr[0] - '0') * 10);
                break;
            case 3:
                iArr[1] = cArr[0] - '0';
                iArr[2] = (cArr[2] - '0') + ((cArr[1] - '0') * 10);
                break;
            case 4:
                iArr[1] = (cArr[1] - '0') + ((cArr[0] - '0') * 10);
                iArr[2] = (cArr[3] - '0') + ((cArr[2] - '0') * 10);
                break;
            case 5:
                iArr[1] = cArr[0] - '0';
                iArr[2] = (cArr[2] - '0') + ((cArr[1] - '0') * 10);
                iArr[3] = (cArr[4] - '0') + ((cArr[3] - '0') * 10);
                break;
            case 6:
                iArr[1] = (cArr[1] - '0') + ((cArr[0] - '0') * 10);
                iArr[2] = (cArr[3] - '0') + ((cArr[2] - '0') * 10);
                iArr[3] = (cArr[5] - '0') + ((cArr[4] - '0') * 10);
                break;
        }
        iArr[0] = i11;
    }

    public final java.lang.String toString() {
        java.lang.String strReplace = this.f23706a.replace("'", "''");
        return "Offset(" + f23703d[this.f23707b] + ",'" + strReplace + "')";
    }
}
