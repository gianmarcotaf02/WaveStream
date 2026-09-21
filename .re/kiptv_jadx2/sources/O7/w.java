package O7;

import io.ktor.network.sockets.DatagramKt;

public abstract class w extends v {
    public static final boolean k0(String str) {
        char c9;
        boolean z6;
        boolean z9;
        int i3;
        boolean z10;
        String str2;
        boolean z11;
        boolean z12 = true;
        int length = str.length() - 1;
        int i9 = 0;
        while (true) {
            c9 = ' ';
            if (i9 > length || str.charAt(i9) > ' ') {
                break;
            }
            i9++;
        }
        if (i9 > length) {
            return false;
        }
        while (length > i9 && str.charAt(length) <= ' ') {
            length--;
        }
        if (str.charAt(i9) == '+' || str.charAt(i9) == '-') {
            i9++;
        }
        if (i9 > length) {
            return false;
        }
        if (str.charAt(i9) != '0') {
            z6 = true;
            z9 = false;
        } else {
            int i10 = i9 + 1;
            if (i10 > length) {
                return true;
            }
            if ((str.charAt(i10) | ' ') == 120) {
                int i11 = i9 + 2;
                int i12 = i11;
                while (true) {
                    if (i12 > length) {
                        z6 = z12;
                        break;
                    }
                    char cCharAt = str.charAt(i12);
                    z6 = z12;
                    if (((cCharAt - '0') & DatagramKt.MAX_DATAGRAM_SIZE) >= 10 && (((cCharAt | ' ') - 97) & DatagramKt.MAX_DATAGRAM_SIZE) >= 6) {
                        break;
                    }
                    i12++;
                    z12 = z6;
                }
                boolean z13 = i11 != i12 ? z6 : false;
                if (i12 <= length) {
                    if (str.charAt(i12) == '.') {
                        int i13 = i12 + 1;
                        int i14 = i13;
                        while (i14 <= length) {
                            char cCharAt2 = str.charAt(i14);
                            char c10 = c9;
                            if (((cCharAt2 - '0') & DatagramKt.MAX_DATAGRAM_SIZE) >= 10 && (((cCharAt2 | ' ') - 97) & DatagramKt.MAX_DATAGRAM_SIZE) >= 6) {
                                break;
                            }
                            i14++;
                            c9 = c10;
                        }
                        z11 = i13 != i14 ? z6 : false;
                        i12 = i14;
                    } else {
                        z11 = false;
                    }
                    if (z13 || z11) {
                        i9 = i12;
                    }
                    if (i9 != -1 || i9 > length) {
                        return false;
                    }
                    z9 = z6;
                }
                i9 = -1;
                if (i9 != -1) {
                }
                return false;
            }
            z6 = true;
            z9 = false;
        }
        if (!z9) {
            int i15 = i9;
            while (i15 <= length && ((str.charAt(i15) - '0') & DatagramKt.MAX_DATAGRAM_SIZE) < 10) {
                i15++;
            }
            boolean z14 = i9 != i15 ? z6 : false;
            if (i15 > length) {
                i9 = i15;
            } else {
                if (str.charAt(i15) == '.') {
                    int i16 = i15 + 1;
                    i3 = i16;
                    while (i3 <= length && ((str.charAt(i3) - '0') & DatagramKt.MAX_DATAGRAM_SIZE) < 10) {
                        i3++;
                    }
                    if (i16 != i3) {
                        z10 = z6;
                    }
                    if (!z14 || z10) {
                        i9 = i3;
                    } else {
                        if (length == i3 + 2) {
                            str2 = "NaN";
                        } else {
                            str2 = length == i3 + 7 ? "Infinity" : null;
                        }
                        i9 = (str2 != null && q.I0(str, str2, i3, false) == i3) ? length + 1 : -1;
                    }
                } else {
                    i3 = i15;
                }
                z10 = false;
                if (z14) {
                    i9 = i3;
                } else {
                    i9 = i3;
                }
            }
            if (i9 == -1) {
                return false;
            }
            if (i9 > length) {
                return z6;
            }
        }
        int i17 = i9 + 1;
        int iCharAt = str.charAt(i9) | ' ';
        if (iCharAt != (z9 ? 112 : 101)) {
            if (z9 || (!(iCharAt == 102 || iCharAt == 100) || i17 <= length)) {
                return false;
            }
            return z6;
        }
        if (i17 > length) {
            return false;
        }
        if ((str.charAt(i17) == '+' || str.charAt(i17) == '-') && (i17 = i9 + 2) > length) {
            return false;
        }
        while (i17 <= length && ((str.charAt(i17) - '0') & DatagramKt.MAX_DATAGRAM_SIZE) < 10) {
            i17++;
        }
        if (i17 > length) {
            return z6;
        }
        if (i17 != length) {
            return false;
        }
        int iCharAt2 = str.charAt(i17) | ' ';
        if (iCharAt2 == 102 || iCharAt2 == 100) {
            return z6;
        }
        return false;
    }

    public static Double l0(String str) {
        kotlin.jvm.internal.m.e(str, "<this>");
        try {
            if (k0(str)) {
                return Double.valueOf(Double.parseDouble(str));
            }
        } catch (NumberFormatException unused) {
        }
        return null;
    }
}
