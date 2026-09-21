package io.sentry.util;

/* JADX INFO: loaded from: classes4.dex */
public final class StringUtils {
    private static final java.lang.String CORRUPTED_NIL_UUID = "0000-0000";
    public static final java.lang.String PROPER_NIL_UUID = "00000000-0000-0000-0000-000000000000";
    private static final java.nio.charset.Charset UTF_8 = java.nio.charset.Charset.forName("UTF-8");
    private static final java.util.regex.Pattern PATTERN_WORD_SNAKE_CASE = java.util.regex.Pattern.compile("[\\W_]+");

    private StringUtils() {
    }

    public static java.lang.String byteCountToString(long j) {
        if (-1000 < j && j < 1000) {
            return j + " B";
        }
        java.text.StringCharacterIterator stringCharacterIterator = new java.text.StringCharacterIterator("kMGTPE");
        while (true) {
            if (j > -999950 && j < 999950) {
                return java.lang.String.format(java.util.Locale.ROOT, "%.1f %cB", java.lang.Double.valueOf(j / 1000.0d), java.lang.Character.valueOf(stringCharacterIterator.current()));
            }
            j /= 1000;
            stringCharacterIterator.next();
        }
    }

    public static java.lang.String calculateStringHash(java.lang.String str, io.sentry.ILogger iLogger) {
        if (str != null && !str.isEmpty()) {
            try {
                return new java.lang.StringBuilder(new java.math.BigInteger(1, java.security.MessageDigest.getInstance("SHA-1").digest(str.getBytes(UTF_8))).toString(16)).toString();
            } catch (java.security.NoSuchAlgorithmException e6) {
                iLogger.log(io.sentry.SentryLevel.INFO, "SHA-1 isn't available to calculate the hash.", e6);
            } catch (java.lang.Throwable th) {
                iLogger.log(io.sentry.SentryLevel.INFO, "string: %s could not calculate its hash", th, str);
            }
        }
        return null;
    }

    public static java.lang.String camelCase(java.lang.String str) {
        if (str == null || str.isEmpty()) {
            return str;
        }
        java.lang.String[] strArrSplit = PATTERN_WORD_SNAKE_CASE.split(str, -1);
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        for (java.lang.String str2 : strArrSplit) {
            sb.append(capitalize(str2));
        }
        return sb.toString();
    }

    public static java.lang.String capitalize(java.lang.String str) {
        if (str == null || str.isEmpty()) {
            return str;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        java.lang.String strSubstring = str.substring(0, 1);
        java.util.Locale locale = java.util.Locale.ROOT;
        sb.append(strSubstring.toUpperCase(locale));
        sb.append(str.substring(1).toLowerCase(locale));
        return sb.toString();
    }

    public static int countOf(java.lang.String str, char c9) {
        int i3 = 0;
        for (int i9 = 0; i9 < str.length(); i9++) {
            if (str.charAt(i9) == c9) {
                i3++;
            }
        }
        return i3;
    }

    public static java.lang.String getStringAfterDot(java.lang.String str) {
        int i3;
        if (str == null) {
            return null;
        }
        int iLastIndexOf = str.lastIndexOf(".");
        return (iLastIndexOf < 0 || str.length() <= (i3 = iLastIndexOf + 1)) ? str : str.substring(i3);
    }

    public static java.lang.String join(java.lang.CharSequence charSequence, java.lang.Iterable<? extends java.lang.CharSequence> iterable) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        java.util.Iterator<? extends java.lang.CharSequence> it = iterable.iterator();
        if (it.hasNext()) {
            sb.append(it.next());
            while (it.hasNext()) {
                sb.append(charSequence);
                sb.append(it.next());
            }
        }
        return sb.toString();
    }

    public static java.lang.String normalizeUUID(java.lang.String str) {
        return str.equals(CORRUPTED_NIL_UUID) ? PROPER_NIL_UUID : str;
    }

    public static java.lang.String removePrefix(java.lang.String str, java.lang.String str2) {
        if (str == null) {
            return "";
        }
        return str.indexOf(str2) == 0 ? str.substring(str2.length()) : str;
    }

    public static java.lang.String removeSurrounding(java.lang.String str, java.lang.String str2) {
        return (str == null || str2 == null || !str.startsWith(str2) || !str.endsWith(str2)) ? str : str.substring(str2.length(), str.length() - str2.length());
    }

    public static java.lang.String substringBefore(java.lang.String str, java.lang.String str2) {
        if (str == null) {
            return "";
        }
        int iIndexOf = str.indexOf(str2);
        return iIndexOf >= 0 ? str.substring(0, iIndexOf) : str;
    }

    public static java.lang.String toString(java.lang.Object obj) {
        if (obj == null) {
            return null;
        }
        return obj.toString();
    }
}
