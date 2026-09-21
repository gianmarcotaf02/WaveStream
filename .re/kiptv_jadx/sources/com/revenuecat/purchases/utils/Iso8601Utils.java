package com.revenuecat.purchases.utils;

/* JADX INFO: loaded from: classes4.dex */
public final class Iso8601Utils {
    private static final java.lang.String GMT_ID = "GMT";
    private static final java.util.TimeZone TIMEZONE_Z = j$.util.DesugarTimeZone.getTimeZone(GMT_ID);

    private static boolean checkOffset(java.lang.String str, int i3, char c9) {
        return i3 < str.length() && str.charAt(i3) == c9;
    }

    public static java.lang.String format(java.util.Date date) {
        java.util.GregorianCalendar gregorianCalendar = new java.util.GregorianCalendar(TIMEZONE_Z, java.util.Locale.US);
        gregorianCalendar.setTime(date);
        java.lang.StringBuilder sb = new java.lang.StringBuilder(24);
        padInt(sb, gregorianCalendar.get(1), 4);
        sb.append('-');
        padInt(sb, gregorianCalendar.get(2) + 1, 2);
        sb.append('-');
        padInt(sb, gregorianCalendar.get(5), 2);
        sb.append('T');
        padInt(sb, gregorianCalendar.get(11), 2);
        sb.append(':');
        padInt(sb, gregorianCalendar.get(12), 2);
        sb.append(':');
        padInt(sb, gregorianCalendar.get(13), 2);
        sb.append('.');
        padInt(sb, gregorianCalendar.get(14), 3);
        sb.append('Z');
        return sb.toString();
    }

    private static int indexOfNonDigit(java.lang.String str, int i3) {
        while (i3 < str.length()) {
            char cCharAt = str.charAt(i3);
            if (cCharAt < '0' || cCharAt > '9') {
                return i3;
            }
            i3++;
        }
        return str.length();
    }

    private static void padInt(java.lang.StringBuilder sb, int i3, int i9) {
        java.lang.String string = java.lang.Integer.toString(i3);
        for (int length = i9 - string.length(); length > 0; length--) {
            sb.append('0');
        }
        sb.append(string);
    }

    /* JADX WARN: Code duplicated, block: B:47:0x00d6 A[Catch: IllegalArgumentException -> 0x0045, IndexOutOfBoundsException -> 0x0048, TryCatch #2 {IllegalArgumentException -> 0x0045, IndexOutOfBoundsException -> 0x0048, blocks: (B:3:0x000a, B:6:0x0017, B:8:0x0023, B:9:0x0025, B:11:0x0034, B:13:0x003a, B:21:0x0051, B:23:0x0061, B:24:0x0063, B:26:0x006f, B:27:0x0072, B:29:0x0078, B:33:0x0082, B:38:0x0092, B:40:0x009a, B:45:0x00d0, B:47:0x00d6, B:49:0x00de, B:70:0x0160, B:54:0x00e9, B:55:0x00ff, B:56:0x0100, B:58:0x010c, B:61:0x0115, B:63:0x012f, B:66:0x013e, B:67:0x015b, B:69:0x015e, B:72:0x018f, B:73:0x0196), top: B:76:0x000a }] */
    /* JADX WARN: Code duplicated, block: B:49:0x00de A[Catch: IllegalArgumentException -> 0x0045, IndexOutOfBoundsException -> 0x0048, TryCatch #2 {IllegalArgumentException -> 0x0045, IndexOutOfBoundsException -> 0x0048, blocks: (B:3:0x000a, B:6:0x0017, B:8:0x0023, B:9:0x0025, B:11:0x0034, B:13:0x003a, B:21:0x0051, B:23:0x0061, B:24:0x0063, B:26:0x006f, B:27:0x0072, B:29:0x0078, B:33:0x0082, B:38:0x0092, B:40:0x009a, B:45:0x00d0, B:47:0x00d6, B:49:0x00de, B:70:0x0160, B:54:0x00e9, B:55:0x00ff, B:56:0x0100, B:58:0x010c, B:61:0x0115, B:63:0x012f, B:66:0x013e, B:67:0x015b, B:69:0x015e, B:72:0x018f, B:73:0x0196), top: B:76:0x000a }] */
    /* JADX WARN: Code duplicated, block: B:50:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:69:0x015e A[Catch: IllegalArgumentException -> 0x0045, IndexOutOfBoundsException -> 0x0048, TryCatch #2 {IllegalArgumentException -> 0x0045, IndexOutOfBoundsException -> 0x0048, blocks: (B:3:0x000a, B:6:0x0017, B:8:0x0023, B:9:0x0025, B:11:0x0034, B:13:0x003a, B:21:0x0051, B:23:0x0061, B:24:0x0063, B:26:0x006f, B:27:0x0072, B:29:0x0078, B:33:0x0082, B:38:0x0092, B:40:0x009a, B:45:0x00d0, B:47:0x00d6, B:49:0x00de, B:70:0x0160, B:54:0x00e9, B:55:0x00ff, B:56:0x0100, B:58:0x010c, B:61:0x0115, B:63:0x012f, B:66:0x013e, B:67:0x015b, B:69:0x015e, B:72:0x018f, B:73:0x0196), top: B:76:0x000a }] */
    /* JADX WARN: Code duplicated, block: B:72:0x018f A[Catch: IllegalArgumentException -> 0x0045, IndexOutOfBoundsException -> 0x0048, TryCatch #2 {IllegalArgumentException -> 0x0045, IndexOutOfBoundsException -> 0x0048, blocks: (B:3:0x000a, B:6:0x0017, B:8:0x0023, B:9:0x0025, B:11:0x0034, B:13:0x003a, B:21:0x0051, B:23:0x0061, B:24:0x0063, B:26:0x006f, B:27:0x0072, B:29:0x0078, B:33:0x0082, B:38:0x0092, B:40:0x009a, B:45:0x00d0, B:47:0x00d6, B:49:0x00de, B:70:0x0160, B:54:0x00e9, B:55:0x00ff, B:56:0x0100, B:58:0x010c, B:61:0x0115, B:63:0x012f, B:66:0x013e, B:67:0x015b, B:69:0x015e, B:72:0x018f, B:73:0x0196), top: B:76:0x000a }] */
    public static java.util.Date parse(java.lang.String str) {
        int i3;
        int iPow;
        int i9;
        int i10;
        char cCharAt;
        java.lang.String strSubstring;
        java.util.TimeZone timeZone;
        char cCharAt2;
        try {
            int i11 = parseInt(str, 0, 4);
            int i12 = checkOffset(str, 4, '-') ? 5 : 4;
            int i13 = i12 + 2;
            int i14 = parseInt(str, i12, i13);
            if (checkOffset(str, i13, '-')) {
                i13 = i12 + 3;
            }
            int i15 = i13 + 2;
            int i16 = parseInt(str, i13, i15);
            boolean zCheckOffset = checkOffset(str, i15, 'T');
            if (!zCheckOffset && str.length() <= i15) {
                return new java.util.GregorianCalendar(i11, i14 - 1, i16).getTime();
            }
            if (zCheckOffset) {
                int i17 = i13 + 5;
                int i18 = parseInt(str, i13 + 3, i17);
                if (checkOffset(str, i17, ':')) {
                    i17 = i13 + 6;
                }
                int i19 = i17 + 2;
                int i20 = parseInt(str, i17, i19);
                if (checkOffset(str, i19, ':')) {
                    i19 = i17 + 3;
                }
                if (str.length() <= i19 || (cCharAt2 = str.charAt(i19)) == 'Z' || cCharAt2 == '+' || cCharAt2 == '-') {
                    i3 = i18;
                    i15 = i19;
                    i9 = i20;
                    iPow = 0;
                } else {
                    int i21 = i19 + 2;
                    i10 = parseInt(str, i19, i21);
                    if (i10 > 59 && i10 < 63) {
                        i10 = 59;
                    }
                    if (checkOffset(str, i21, '.')) {
                        int i22 = i19 + 3;
                        int iIndexOfNonDigit = indexOfNonDigit(str, i19 + 4);
                        int iMin = java.lang.Math.min(iIndexOfNonDigit, i19 + 6);
                        iPow = (int) (java.lang.Math.pow(10.0d, 3 - (iMin - i22)) * ((double) parseInt(str, i22, iMin)));
                        i9 = i20;
                        i3 = i18;
                        i15 = iIndexOfNonDigit;
                    } else {
                        i3 = i18;
                        i15 = i21;
                        i9 = i20;
                        iPow = 0;
                    }
                }
                if (str.length() > i15) {
                    throw new java.lang.IllegalArgumentException("No time zone indicator");
                }
                cCharAt = str.charAt(i15);
                if (cCharAt == 'Z') {
                    timeZone = TIMEZONE_Z;
                } else {
                    if (cCharAt != '+' && cCharAt != '-') {
                        throw new java.lang.IndexOutOfBoundsException("Invalid time zone indicator '" + cCharAt + "'");
                    }
                    strSubstring = str.substring(i15);
                    if (!"+0000".equals(strSubstring) || "+00:00".equals(strSubstring)) {
                        timeZone = TIMEZONE_Z;
                    } else {
                        java.lang.String str2 = GMT_ID + strSubstring;
                        java.util.TimeZone timeZone2 = j$.util.DesugarTimeZone.getTimeZone(str2);
                        java.lang.String id = timeZone2.getID();
                        if (!id.equals(str2) && !id.replace(":", "").equals(str2)) {
                            throw new java.lang.IndexOutOfBoundsException("Mismatching time zone indicator: " + str2 + " given, resolves to " + timeZone2.getID());
                        }
                        timeZone = timeZone2;
                    }
                }
                java.util.GregorianCalendar gregorianCalendar = new java.util.GregorianCalendar(timeZone);
                gregorianCalendar.setLenient(false);
                gregorianCalendar.set(1, i11);
                gregorianCalendar.set(2, i14 - 1);
                gregorianCalendar.set(5, i16);
                gregorianCalendar.set(11, i3);
                gregorianCalendar.set(12, i9);
                gregorianCalendar.set(13, i10);
                gregorianCalendar.set(14, iPow);
                return gregorianCalendar.getTime();
            }
            i3 = 0;
            iPow = 0;
            i9 = 0;
            i10 = 0;
            if (str.length() > i15) {
                throw new java.lang.IllegalArgumentException("No time zone indicator");
            }
            cCharAt = str.charAt(i15);
            if (cCharAt == 'Z') {
                timeZone = TIMEZONE_Z;
            } else {
                if (cCharAt != '+') {
                    throw new java.lang.IndexOutOfBoundsException("Invalid time zone indicator '" + cCharAt + "'");
                }
                strSubstring = str.substring(i15);
                if ("+0000".equals(strSubstring)) {
                    timeZone = TIMEZONE_Z;
                } else {
                    timeZone = TIMEZONE_Z;
                }
            }
            java.util.GregorianCalendar gregorianCalendar2 = new java.util.GregorianCalendar(timeZone);
            gregorianCalendar2.setLenient(false);
            gregorianCalendar2.set(1, i11);
            gregorianCalendar2.set(2, i14 - 1);
            gregorianCalendar2.set(5, i16);
            gregorianCalendar2.set(11, i3);
            gregorianCalendar2.set(12, i9);
            gregorianCalendar2.set(13, i10);
            gregorianCalendar2.set(14, iPow);
            return gregorianCalendar2.getTime();
        } catch (java.lang.IllegalArgumentException e6) {
            e = e6;
            throw new com.revenuecat.purchases.utils.SerializationException(p121o0.p.C("Not an RFC 3339 date: ", str), e);
        } catch (java.lang.IndexOutOfBoundsException e9) {
            e = e9;
            throw new com.revenuecat.purchases.utils.SerializationException(p121o0.p.C("Not an RFC 3339 date: ", str), e);
        }
    }

    private static int parseInt(java.lang.String str, int i3, int i9) {
        int i10;
        int i11;
        if (i3 < 0 || i9 > str.length() || i3 > i9) {
            throw new java.lang.NumberFormatException(str);
        }
        if (i3 < i9) {
            i11 = i3 + 1;
            int iDigit = java.lang.Character.digit(str.charAt(i3), 10);
            if (iDigit < 0) {
                throw new java.lang.NumberFormatException("Invalid number: " + str.substring(i3, i9));
            }
            i10 = -iDigit;
        } else {
            i10 = 0;
            i11 = i3;
        }
        while (i11 < i9) {
            int i12 = i11 + 1;
            int iDigit2 = java.lang.Character.digit(str.charAt(i11), 10);
            if (iDigit2 < 0) {
                throw new java.lang.NumberFormatException("Invalid number: " + str.substring(i3, i9));
            }
            i10 = (i10 * 10) - iDigit2;
            i11 = i12;
        }
        return -i10;
    }
}
