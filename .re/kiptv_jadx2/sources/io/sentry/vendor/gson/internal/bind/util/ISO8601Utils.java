package io.sentry.vendor.gson.internal.bind.util;

import B2.a;
import j$.util.DesugarTimeZone;
import java.text.ParseException;
import java.text.ParsePosition;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.TimeZone;

public class ISO8601Utils {
    private static final String UTC_ID = "UTC";
    public static final TimeZone TIMEZONE_UTC = DesugarTimeZone.getTimeZone(UTC_ID);

    private static boolean checkOffset(String str, int i3, char c9) {
        return i3 < str.length() && str.charAt(i3) == c9;
    }

    public static String format(Date date) {
        return format(date, false, TIMEZONE_UTC);
    }

    private static int indexOfNonDigit(String str, int i3) {
        while (i3 < str.length()) {
            char cCharAt = str.charAt(i3);
            if (cCharAt < '0' || cCharAt > '9') {
                return i3;
            }
            i3++;
        }
        return str.length();
    }

    private static void padInt(StringBuilder sb, int i3, int i9) {
        String string = Integer.toString(i3);
        for (int length = i9 - string.length(); length > 0; length--) {
            sb.append('0');
        }
        sb.append(string);
    }

    public static Date parse(String str, ParsePosition parsePosition) throws ParseException {
        String strI;
        String message;
        int i3;
        int i9;
        int i10;
        int i11;
        char cCharAt;
        String strSubstring;
        int length;
        TimeZone timeZone;
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
                GregorianCalendar gregorianCalendar = new GregorianCalendar(i13, i15 - 1, i17);
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
                        int iMin = Math.min(iIndexOfNonDigit, i20 + 6);
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
                    throw new IllegalArgumentException("No time zone indicator");
                }
                cCharAt = str.charAt(i16);
                if (cCharAt == 'Z') {
                    timeZone = TIMEZONE_UTC;
                    length = i16 + 1;
                } else {
                    if (cCharAt != '+' && cCharAt != '-') {
                        throw new IndexOutOfBoundsException("Invalid time zone indicator '" + cCharAt + "'");
                    }
                    strSubstring = str.substring(i16);
                    if (strSubstring.length() >= 5) {
                        strSubstring = strSubstring.concat("00");
                    }
                    length = i16 + strSubstring.length();
                    if (!"+0000".equals(strSubstring) || "+00:00".equals(strSubstring)) {
                        timeZone = TIMEZONE_UTC;
                    } else {
                        String strConcat = "GMT".concat(strSubstring);
                        TimeZone timeZone2 = DesugarTimeZone.getTimeZone(strConcat);
                        String id = timeZone2.getID();
                        if (!id.equals(strConcat) && !id.replace(":", "").equals(strConcat)) {
                            throw new IndexOutOfBoundsException("Mismatching time zone indicator: " + strConcat + " given, resolves to " + timeZone2.getID());
                        }
                        timeZone = timeZone2;
                    }
                }
                GregorianCalendar gregorianCalendar2 = new GregorianCalendar(timeZone);
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
                throw new IllegalArgumentException("No time zone indicator");
            }
            cCharAt = str.charAt(i16);
            if (cCharAt == 'Z') {
                timeZone = TIMEZONE_UTC;
                length = i16 + 1;
            } else {
                if (cCharAt != '+') {
                    throw new IndexOutOfBoundsException("Invalid time zone indicator '" + cCharAt + "'");
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
            GregorianCalendar gregorianCalendar3 = new GregorianCalendar(timeZone);
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
        } catch (IndexOutOfBoundsException e6) {
            e = e6;
            if (str == null) {
                strI = null;
            } else {
                strI = a.i('\"', "\"", str);
            }
            message = e.getMessage();
            if (message != null || message.isEmpty()) {
                message = "(" + e.getClass().getName() + ")";
            }
            ParseException parseException = new ParseException(a.m("Failed to parse date [", strI, "]: ", message), parsePosition.getIndex());
            parseException.initCause(e);
            throw parseException;
        } catch (NumberFormatException e9) {
            e = e9;
            if (str == null) {
                strI = null;
            } else {
                strI = a.i('\"', "\"", str);
            }
            message = e.getMessage();
            if (message != null) {
                message = "(" + e.getClass().getName() + ")";
            } else {
                message = "(" + e.getClass().getName() + ")";
            }
            ParseException parseException2 = new ParseException(a.m("Failed to parse date [", strI, "]: ", message), parsePosition.getIndex());
            parseException2.initCause(e);
            throw parseException2;
        } catch (IllegalArgumentException e10) {
            e = e10;
            if (str == null) {
                strI = null;
            } else {
                strI = a.i('\"', "\"", str);
            }
            message = e.getMessage();
            if (message != null) {
                message = "(" + e.getClass().getName() + ")";
            } else {
                message = "(" + e.getClass().getName() + ")";
            }
            ParseException parseException3 = new ParseException(a.m("Failed to parse date [", strI, "]: ", message), parsePosition.getIndex());
            parseException3.initCause(e);
            throw parseException3;
        }
    }

    private static int parseInt(String str, int i3, int i9) {
        int i10;
        int i11;
        if (i3 < 0 || i9 > str.length() || i3 > i9) {
            throw new NumberFormatException(str);
        }
        if (i3 < i9) {
            i11 = i3 + 1;
            int iDigit = Character.digit(str.charAt(i3), 10);
            if (iDigit < 0) {
                throw new NumberFormatException("Invalid number: " + str.substring(i3, i9));
            }
            i10 = -iDigit;
        } else {
            i10 = 0;
            i11 = i3;
        }
        while (i11 < i9) {
            int i12 = i11 + 1;
            int iDigit2 = Character.digit(str.charAt(i11), 10);
            if (iDigit2 < 0) {
                throw new NumberFormatException("Invalid number: " + str.substring(i3, i9));
            }
            i10 = (i10 * 10) - iDigit2;
            i11 = i12;
        }
        return -i10;
    }

    public static String format(Date date, boolean z6) {
        return format(date, z6, TIMEZONE_UTC);
    }

    public static String format(Date date, boolean z6, TimeZone timeZone) {
        GregorianCalendar gregorianCalendar = new GregorianCalendar(timeZone, Locale.US);
        gregorianCalendar.setTime(date);
        StringBuilder sb = new StringBuilder(19 + (z6 ? 4 : 0) + (timeZone.getRawOffset() == 0 ? 1 : 6));
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
            int iAbs = Math.abs(i3 / 60);
            int iAbs2 = Math.abs(i3 % 60);
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
