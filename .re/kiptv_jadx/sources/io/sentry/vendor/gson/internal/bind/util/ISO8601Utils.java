package io.sentry.vendor.gson.internal.bind.util;

/* JADX INFO: loaded from: classes4.dex */
public class ISO8601Utils {
    private static final java.lang.String UTC_ID = "UTC";
    public static final java.util.TimeZone TIMEZONE_UTC = j$.util.DesugarTimeZone.getTimeZone(UTC_ID);

    private static boolean checkOffset(java.lang.String str, int i3, char c9) {
        return i3 < str.length() && str.charAt(i3) == c9;
    }

    public static java.lang.String format(java.util.Date date) {
        return format(date, false, TIMEZONE_UTC);
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

    /* JADX WARN: Code duplicated, block: B:56:0x00e7 A[Catch: IllegalArgumentException -> 0x0052, NumberFormatException -> 0x0055, IndexOutOfBoundsException -> 0x0058, TryCatch #2 {IndexOutOfBoundsException -> 0x0058, NumberFormatException -> 0x0055, IllegalArgumentException -> 0x0052, blocks: (B:3:0x000c, B:5:0x001f, B:6:0x0021, B:8:0x002d, B:9:0x002f, B:11:0x003e, B:13:0x0044, B:23:0x0061, B:25:0x0071, B:26:0x0073, B:28:0x007f, B:29:0x0082, B:31:0x0088, B:35:0x0092, B:40:0x00a2, B:42:0x00aa, B:54:0x00e1, B:56:0x00e7, B:58:0x00ed, B:84:0x017e, B:64:0x00fe, B:65:0x0114, B:66:0x0115, B:70:0x0125, B:72:0x0132, B:75:0x013b, B:77:0x014d, B:80:0x015c, B:81:0x0179, B:83:0x017c, B:69:0x0121, B:86:0x01b0, B:87:0x01b7, B:47:0x00c4, B:48:0x00c7), top: B:98:0x000c }] */
    /* JADX WARN: Code duplicated, block: B:58:0x00ed A[Catch: IllegalArgumentException -> 0x0052, NumberFormatException -> 0x0055, IndexOutOfBoundsException -> 0x0058, TryCatch #2 {IndexOutOfBoundsException -> 0x0058, NumberFormatException -> 0x0055, IllegalArgumentException -> 0x0052, blocks: (B:3:0x000c, B:5:0x001f, B:6:0x0021, B:8:0x002d, B:9:0x002f, B:11:0x003e, B:13:0x0044, B:23:0x0061, B:25:0x0071, B:26:0x0073, B:28:0x007f, B:29:0x0082, B:31:0x0088, B:35:0x0092, B:40:0x00a2, B:42:0x00aa, B:54:0x00e1, B:56:0x00e7, B:58:0x00ed, B:84:0x017e, B:64:0x00fe, B:65:0x0114, B:66:0x0115, B:70:0x0125, B:72:0x0132, B:75:0x013b, B:77:0x014d, B:80:0x015c, B:81:0x0179, B:83:0x017c, B:69:0x0121, B:86:0x01b0, B:87:0x01b7, B:47:0x00c4, B:48:0x00c7), top: B:98:0x000c }] */
    /* JADX WARN: Code duplicated, block: B:59:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:68:0x0120  */
    /* JADX WARN: Code duplicated, block: B:69:0x0121 A[Catch: IllegalArgumentException -> 0x0052, NumberFormatException -> 0x0055, IndexOutOfBoundsException -> 0x0058, TryCatch #2 {IndexOutOfBoundsException -> 0x0058, NumberFormatException -> 0x0055, IllegalArgumentException -> 0x0052, blocks: (B:3:0x000c, B:5:0x001f, B:6:0x0021, B:8:0x002d, B:9:0x002f, B:11:0x003e, B:13:0x0044, B:23:0x0061, B:25:0x0071, B:26:0x0073, B:28:0x007f, B:29:0x0082, B:31:0x0088, B:35:0x0092, B:40:0x00a2, B:42:0x00aa, B:54:0x00e1, B:56:0x00e7, B:58:0x00ed, B:84:0x017e, B:64:0x00fe, B:65:0x0114, B:66:0x0115, B:70:0x0125, B:72:0x0132, B:75:0x013b, B:77:0x014d, B:80:0x015c, B:81:0x0179, B:83:0x017c, B:69:0x0121, B:86:0x01b0, B:87:0x01b7, B:47:0x00c4, B:48:0x00c7), top: B:98:0x000c }] */
    /* JADX WARN: Code duplicated, block: B:83:0x017c A[Catch: IllegalArgumentException -> 0x0052, NumberFormatException -> 0x0055, IndexOutOfBoundsException -> 0x0058, TryCatch #2 {IndexOutOfBoundsException -> 0x0058, NumberFormatException -> 0x0055, IllegalArgumentException -> 0x0052, blocks: (B:3:0x000c, B:5:0x001f, B:6:0x0021, B:8:0x002d, B:9:0x002f, B:11:0x003e, B:13:0x0044, B:23:0x0061, B:25:0x0071, B:26:0x0073, B:28:0x007f, B:29:0x0082, B:31:0x0088, B:35:0x0092, B:40:0x00a2, B:42:0x00aa, B:54:0x00e1, B:56:0x00e7, B:58:0x00ed, B:84:0x017e, B:64:0x00fe, B:65:0x0114, B:66:0x0115, B:70:0x0125, B:72:0x0132, B:75:0x013b, B:77:0x014d, B:80:0x015c, B:81:0x0179, B:83:0x017c, B:69:0x0121, B:86:0x01b0, B:87:0x01b7, B:47:0x00c4, B:48:0x00c7), top: B:98:0x000c }] */
    /* JADX WARN: Code duplicated, block: B:86:0x01b0 A[Catch: IllegalArgumentException -> 0x0052, NumberFormatException -> 0x0055, IndexOutOfBoundsException -> 0x0058, TryCatch #2 {IndexOutOfBoundsException -> 0x0058, NumberFormatException -> 0x0055, IllegalArgumentException -> 0x0052, blocks: (B:3:0x000c, B:5:0x001f, B:6:0x0021, B:8:0x002d, B:9:0x002f, B:11:0x003e, B:13:0x0044, B:23:0x0061, B:25:0x0071, B:26:0x0073, B:28:0x007f, B:29:0x0082, B:31:0x0088, B:35:0x0092, B:40:0x00a2, B:42:0x00aa, B:54:0x00e1, B:56:0x00e7, B:58:0x00ed, B:84:0x017e, B:64:0x00fe, B:65:0x0114, B:66:0x0115, B:70:0x0125, B:72:0x0132, B:75:0x013b, B:77:0x014d, B:80:0x015c, B:81:0x0179, B:83:0x017c, B:69:0x0121, B:86:0x01b0, B:87:0x01b7, B:47:0x00c4, B:48:0x00c7), top: B:98:0x000c }] */
    /* JADX WARN: Code duplicated, block: B:89:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:90:0x01bc  */
    /* JADX WARN: Code duplicated, block: B:93:0x01ca  */
    /* JADX WARN: Code duplicated, block: B:95:0x01d0  */
    /* JADX WARN: Instruction removed from duplicated block: B:95:0x01d0, please report this as an issue */
    public static java.util.Date parse(java.lang.String str, java.text.ParsePosition parsePosition) throws java.text.ParseException {
        java.lang.String strI;
        java.lang.String message;
        int i3;
        int i9;
        int i10;
        int i11;
        char cCharAt;
        java.lang.String strSubstring;
        int length;
        java.util.TimeZone timeZone;
        char cCharAt2;
        try {
            int index = parsePosition.getIndex();
            int i12 = index + 4;
            int i13 = parseInt(str, index, i12);
            if (checkOffset(str, i12, '-')) {
                i12 = index + 5;
            }
            int i14 = i12 + 2;
            int i15 = parseInt(str, i12, i14);
            if (checkOffset(str, i14, '-')) {
                i14 = i12 + 3;
            }
            int i16 = i14 + 2;
            int i17 = parseInt(str, i14, i16);
            boolean zCheckOffset = checkOffset(str, i16, 'T');
            if (!zCheckOffset && str.length() <= i16) {
                java.util.GregorianCalendar gregorianCalendar = new java.util.GregorianCalendar(i13, i15 - 1, i17);
                parsePosition.setIndex(i16);
                return gregorianCalendar.getTime();
            }
            if (zCheckOffset) {
                int i18 = i14 + 5;
                int i19 = parseInt(str, i14 + 3, i18);
                if (checkOffset(str, i18, ':')) {
                    i18 = i14 + 6;
                }
                int i20 = i18 + 2;
                int i21 = parseInt(str, i18, i20);
                if (checkOffset(str, i20, ':')) {
                    i20 = i18 + 3;
                }
                if (str.length() <= i20 || (cCharAt2 = str.charAt(i20)) == 'Z' || cCharAt2 == '+' || cCharAt2 == '-') {
                    i16 = i20;
                    i3 = i19;
                    i9 = i21;
                } else {
                    int i22 = i20 + 2;
                    i11 = parseInt(str, i20, i22);
                    if (i11 > 59 && i11 < 63) {
                        i11 = 59;
                    }
                    if (checkOffset(str, i22, '.')) {
                        int i23 = i20 + 3;
                        int iIndexOfNonDigit = indexOfNonDigit(str, i20 + 4);
                        int iMin = java.lang.Math.min(iIndexOfNonDigit, i20 + 6);
                        int i24 = parseInt(str, i23, iMin);
                        int i25 = iMin - i23;
                        if (i25 == 1) {
                            i24 *= 100;
                        } else if (i25 == 2) {
                            i24 *= 10;
                        }
                        i3 = i19;
                        i16 = iIndexOfNonDigit;
                        i9 = i21;
                        i10 = i24;
                    } else {
                        i3 = i19;
                        i16 = i22;
                        i9 = i21;
                        i10 = 0;
                    }
                }
                if (str.length() > i16) {
                    throw new java.lang.IllegalArgumentException("No time zone indicator");
                }
                cCharAt = str.charAt(i16);
                if (cCharAt == 'Z') {
                    timeZone = TIMEZONE_UTC;
                    length = i16 + 1;
                } else {
                    if (cCharAt != '+' && cCharAt != '-') {
                        throw new java.lang.IndexOutOfBoundsException("Invalid time zone indicator '" + cCharAt + "'");
                    }
                    strSubstring = str.substring(i16);
                    if (strSubstring.length() >= 5) {
                        strSubstring = strSubstring.concat("00");
                    }
                    length = i16 + strSubstring.length();
                    if (!"+0000".equals(strSubstring) || "+00:00".equals(strSubstring)) {
                        timeZone = TIMEZONE_UTC;
                    } else {
                        java.lang.String strConcat = "GMT".concat(strSubstring);
                        java.util.TimeZone timeZone2 = j$.util.DesugarTimeZone.getTimeZone(strConcat);
                        java.lang.String id = timeZone2.getID();
                        if (!id.equals(strConcat) && !id.replace(":", "").equals(strConcat)) {
                            throw new java.lang.IndexOutOfBoundsException("Mismatching time zone indicator: " + strConcat + " given, resolves to " + timeZone2.getID());
                        }
                        timeZone = timeZone2;
                    }
                }
                java.util.GregorianCalendar gregorianCalendar2 = new java.util.GregorianCalendar(timeZone);
                gregorianCalendar2.setLenient(false);
                gregorianCalendar2.set(1, i13);
                gregorianCalendar2.set(2, i15 - 1);
                gregorianCalendar2.set(5, i17);
                gregorianCalendar2.set(11, i3);
                gregorianCalendar2.set(12, i9);
                gregorianCalendar2.set(13, i11);
                gregorianCalendar2.set(14, i10);
                parsePosition.setIndex(length);
                return gregorianCalendar2.getTime();
            }
            i3 = 0;
            i9 = 0;
            i10 = 0;
            i11 = 0;
            if (str.length() > i16) {
                throw new java.lang.IllegalArgumentException("No time zone indicator");
            }
            cCharAt = str.charAt(i16);
            if (cCharAt == 'Z') {
                timeZone = TIMEZONE_UTC;
                length = i16 + 1;
            } else {
                if (cCharAt != '+') {
                    throw new java.lang.IndexOutOfBoundsException("Invalid time zone indicator '" + cCharAt + "'");
                }
                strSubstring = str.substring(i16);
                if (strSubstring.length() >= 5) {
                    strSubstring = strSubstring.concat("00");
                }
                length = i16 + strSubstring.length();
                if ("+0000".equals(strSubstring)) {
                    timeZone = TIMEZONE_UTC;
                } else {
                    timeZone = TIMEZONE_UTC;
                }
            }
            java.util.GregorianCalendar gregorianCalendar3 = new java.util.GregorianCalendar(timeZone);
            gregorianCalendar3.setLenient(false);
            gregorianCalendar3.set(1, i13);
            gregorianCalendar3.set(2, i15 - 1);
            gregorianCalendar3.set(5, i17);
            gregorianCalendar3.set(11, i3);
            gregorianCalendar3.set(12, i9);
            gregorianCalendar3.set(13, i11);
            gregorianCalendar3.set(14, i10);
            parsePosition.setIndex(length);
            return gregorianCalendar3.getTime();
        } catch (java.lang.IndexOutOfBoundsException e6) {
            e = e6;
            if (str == null) {
                strI = null;
            } else {
                strI = B2.a.i('\"', "\"", str);
            }
            message = e.getMessage();
            if (message != null || message.isEmpty()) {
                message = "(" + e.getClass().getName() + ")";
            }
            java.text.ParseException parseException = new java.text.ParseException(B2.a.m("Failed to parse date [", strI, "]: ", message), parsePosition.getIndex());
            parseException.initCause(e);
            throw parseException;
        } catch (java.lang.NumberFormatException e9) {
            e = e9;
            if (str == null) {
                strI = null;
            } else {
                strI = B2.a.i('\"', "\"", str);
            }
            message = e.getMessage();
            if (message != null) {
                message = "(" + e.getClass().getName() + ")";
            } else {
                message = "(" + e.getClass().getName() + ")";
            }
            java.text.ParseException parseException2 = new java.text.ParseException(B2.a.m("Failed to parse date [", strI, "]: ", message), parsePosition.getIndex());
            parseException2.initCause(e);
            throw parseException2;
        } catch (java.lang.IllegalArgumentException e10) {
            e = e10;
            if (str == null) {
                strI = null;
            } else {
                strI = B2.a.i('\"', "\"", str);
            }
            message = e.getMessage();
            if (message != null) {
                message = "(" + e.getClass().getName() + ")";
            } else {
                message = "(" + e.getClass().getName() + ")";
            }
            java.text.ParseException parseException3 = new java.text.ParseException(B2.a.m("Failed to parse date [", strI, "]: ", message), parsePosition.getIndex());
            parseException3.initCause(e);
            throw parseException3;
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

    public static java.lang.String format(java.util.Date date, boolean z6) {
        return format(date, z6, TIMEZONE_UTC);
    }

    public static java.lang.String format(java.util.Date date, boolean z6, java.util.TimeZone timeZone) {
        java.util.GregorianCalendar gregorianCalendar = new java.util.GregorianCalendar(timeZone, java.util.Locale.US);
        gregorianCalendar.setTime(date);
        java.lang.StringBuilder sb = new java.lang.StringBuilder(19 + (z6 ? 4 : 0) + (timeZone.getRawOffset() == 0 ? 1 : 6));
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
        if (z6) {
            sb.append('.');
            padInt(sb, gregorianCalendar.get(14), 3);
        }
        int offset = timeZone.getOffset(gregorianCalendar.getTimeInMillis());
        if (offset != 0) {
            int i3 = offset / 60000;
            int iAbs = java.lang.Math.abs(i3 / 60);
            int iAbs2 = java.lang.Math.abs(i3 % 60);
            sb.append(offset >= 0 ? '+' : '-');
            padInt(sb, iAbs, 2);
            sb.append(':');
            padInt(sb, iAbs2, 2);
        } else {
            sb.append('Z');
        }
        return sb.toString();
    }
}
