package j$.time.format;

public final class h implements InterfaceC2508e {

    public final int f23693a;

    public final Object f23694b;

    public h(Object obj, int i3) {
        this.f23693a = i3;
        this.f23694b = obj;
    }

    @Override
    public final boolean p(x xVar, StringBuilder sb) {
        switch (this.f23693a) {
            case 0:
                Long lA = xVar.a(j$.time.temporal.a.OFFSET_SECONDS);
                if (lA == null) {
                    return false;
                }
                sb.append("GMT");
                int intExact = Math.toIntExact(lA.longValue());
                if (intExact != 0) {
                    int iAbs = Math.abs((intExact / 3600) % 100);
                    int iAbs2 = Math.abs((intExact / 60) % 60);
                    int iAbs3 = Math.abs(intExact % 60);
                    sb.append(intExact < 0 ? "-" : "+");
                    if (((F) this.f23694b) == F.FULL) {
                        a(sb, iAbs);
                        sb.append(':');
                        a(sb, iAbs2);
                        if (iAbs3 != 0) {
                            sb.append(':');
                            a(sb, iAbs3);
                        }
                    } else {
                        if (iAbs >= 10) {
                            sb.append((char) ((iAbs / 10) + 48));
                        }
                        sb.append((char) ((iAbs % 10) + 48));
                        if (iAbs2 != 0 || iAbs3 != 0) {
                            sb.append(':');
                            a(sb, iAbs2);
                            if (iAbs3 != 0) {
                                sb.append(':');
                                a(sb, iAbs3);
                            }
                        }
                    }
                }
                return true;
            default:
                sb.append((String) this.f23694b);
                return true;
        }
    }

    @Override
    public final int r(v vVar, CharSequence charSequence, int i3) {
        int i9;
        int iB;
        int i10;
        int i11;
        int i12;
        int i13;
        switch (this.f23693a) {
            case 0:
                int length = charSequence.length();
                if (vVar.h(charSequence, i3, "GMT", 0, 3)) {
                    int i14 = i3 + 3;
                    if (i14 == length) {
                        return vVar.g(j$.time.temporal.a.OFFSET_SECONDS, 0L, i3, i14);
                    }
                    char cCharAt = charSequence.charAt(i14);
                    if (cCharAt == '+') {
                        i9 = 1;
                    } else {
                        if (cCharAt != '-') {
                            return vVar.g(j$.time.temporal.a.OFFSET_SECONDS, 0L, i3, i14);
                        }
                        i9 = -1;
                    }
                    int i15 = i3 + 4;
                    int i16 = 0;
                    if (((F) this.f23694b) == F.FULL) {
                        int i17 = i3 + 5;
                        int iB2 = b(charSequence, i15);
                        int i18 = i3 + 6;
                        int iB3 = b(charSequence, i17);
                        if (iB2 >= 0 && iB3 >= 0) {
                            int i19 = i3 + 7;
                            if (charSequence.charAt(i18) == ':') {
                                iB = (iB2 * 10) + iB3;
                                int iB4 = b(charSequence, i19);
                                i13 = i3 + 9;
                                int iB5 = b(charSequence, i3 + 8);
                                if (iB4 >= 0 && iB5 >= 0) {
                                    i12 = (iB4 * 10) + iB5;
                                    int i20 = i3 + 11;
                                    if (i20 < length && charSequence.charAt(i13) == ':') {
                                        int iB6 = b(charSequence, i3 + 10);
                                        int iB7 = b(charSequence, i20);
                                        if (iB6 >= 0 && iB7 >= 0) {
                                            i16 = (iB6 * 10) + iB7;
                                            i13 = i3 + 12;
                                        }
                                    }
                                    i10 = i16;
                                    i11 = i13;
                                }
                            }
                        }
                    } else {
                        int i21 = i3 + 5;
                        iB = b(charSequence, i15);
                        if (iB >= 0) {
                            if (i21 < length) {
                                int iB8 = b(charSequence, i21);
                                if (iB8 >= 0) {
                                    iB = (iB * 10) + iB8;
                                    i21 = i3 + 6;
                                }
                                int i22 = i21 + 2;
                                if (i22 < length && charSequence.charAt(i21) == ':' && i22 < length && charSequence.charAt(i21) == ':') {
                                    int iB9 = b(charSequence, i21 + 1);
                                    int iB10 = b(charSequence, i22);
                                    if (iB9 >= 0 && iB10 >= 0) {
                                        i12 = (iB9 * 10) + iB10;
                                        int i23 = i21 + 3;
                                        int i24 = i21 + 5;
                                        if (i24 < length && charSequence.charAt(i23) == ':') {
                                            int iB11 = b(charSequence, i21 + 4);
                                            int iB12 = b(charSequence, i24);
                                            if (iB11 >= 0 && iB12 >= 0) {
                                                i16 = (iB11 * 10) + iB12;
                                                i13 = i21 + 6;
                                                i10 = i16;
                                                i11 = i13;
                                            }
                                        }
                                        i11 = i23;
                                        i10 = 0;
                                    }
                                    return vVar.g(j$.time.temporal.a.OFFSET_SECONDS, ((((long) i16) * 60) + (((long) iB) * 3600) + ((long) i10)) * ((long) i9), i3, i11);
                                }
                            }
                            i10 = 0;
                            i11 = i21;
                            return vVar.g(j$.time.temporal.a.OFFSET_SECONDS, ((((long) i16) * 60) + (((long) iB) * 3600) + ((long) i10)) * ((long) i9), i3, i11);
                        }
                    }
                    i16 = i12;
                    return vVar.g(j$.time.temporal.a.OFFSET_SECONDS, ((((long) i16) * 60) + (((long) iB) * 3600) + ((long) i10)) * ((long) i9), i3, i11);
                }
                return ~i3;
            default:
                if (i3 > charSequence.length() || i3 < 0) {
                    throw new IndexOutOfBoundsException();
                }
                String str = (String) this.f23694b;
                return !vVar.h(charSequence, i3, str, 0, str.length()) ? ~i3 : str.length() + i3;
        }
    }

    public final String toString() {
        switch (this.f23693a) {
            case 0:
                return "LocalizedOffset(" + ((F) this.f23694b) + ")";
            default:
                return "'" + ((String) this.f23694b).replace("'", "''") + "'";
        }
    }

    public static void a(StringBuilder sb, int i3) {
        sb.append((char) ((i3 / 10) + 48));
        sb.append((char) ((i3 % 10) + 48));
    }

    public static int b(CharSequence charSequence, int i3) {
        char cCharAt = charSequence.charAt(i3);
        if (cCharAt < '0' || cCharAt > '9') {
            return -1;
        }
        return cCharAt - '0';
    }
}
