package androidx.media3.datasource;

/* JADX INFO: loaded from: classes.dex */
public final class HttpUtil {
    private static final java.lang.String TAG = "HttpUtil";
    private static final java.util.regex.Pattern CONTENT_RANGE_WITH_START_AND_END = java.util.regex.Pattern.compile("bytes (\\d+)-(\\d+)/(?:\\d+|\\*)");
    private static final java.util.regex.Pattern CONTENT_RANGE_WITH_SIZE = java.util.regex.Pattern.compile("bytes (?:(?:\\d+-\\d+)|\\*)/(\\d+)");

    private HttpUtil() {
    }

    public static java.lang.String buildRangeRequestHeader(long j, long j9) {
        if (j == 0 && j9 == -1) {
            return null;
        }
        java.lang.StringBuilder sbU = p121o0.p.u(j, "bytes=", "-");
        if (j9 != -1) {
            sbU.append((j + j9) - 1);
        }
        return sbU.toString();
    }

    public static long getContentLength(java.lang.String str, java.lang.String str2) {
        long j;
        if (android.text.TextUtils.isEmpty(str)) {
            j = -1;
        } else {
            try {
                j = java.lang.Long.parseLong(str);
            } catch (java.lang.NumberFormatException unused) {
                androidx.media3.common.util.Log.e(TAG, "Unexpected Content-Length [" + str + "]");
                j = -1;
            }
        }
        if (android.text.TextUtils.isEmpty(str2)) {
            return j;
        }
        java.util.regex.Matcher matcher = CONTENT_RANGE_WITH_START_AND_END.matcher(str2);
        if (!matcher.matches()) {
            return j;
        }
        try {
            java.lang.String strGroup = matcher.group(2);
            strGroup.getClass();
            long j9 = java.lang.Long.parseLong(strGroup);
            java.lang.String strGroup2 = matcher.group(1);
            strGroup2.getClass();
            long j10 = (j9 - java.lang.Long.parseLong(strGroup2)) + 1;
            if (j < 0) {
                return j10;
            }
            if (j == j10) {
                return j;
            }
            androidx.media3.common.util.Log.w(TAG, "Inconsistent headers [" + str + "] [" + str2 + "]");
            return java.lang.Math.max(j, j10);
        } catch (java.lang.NumberFormatException unused2) {
            androidx.media3.common.util.Log.e(TAG, "Unexpected Content-Range [" + str2 + "]");
            return j;
        }
    }

    public static java.lang.String getCookieHeader(java.lang.String str, java.util.Map<java.lang.String, java.util.List<java.lang.String>> map, java.net.CookieHandler cookieHandler) {
        java.util.List<java.lang.String> list;
        if (cookieHandler == null) {
            return "";
        }
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> map2 = p076i4.X0.f22848n;
        try {
            map2 = cookieHandler.get(new java.net.URI(str), map);
        } catch (java.lang.Exception e6) {
            androidx.media3.common.util.Log.w(TAG, "Failed to read cookies from CookieHandler", e6);
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        if (map2.containsKey(io.sentry.util.HttpUtils.COOKIE_HEADER_NAME) && (list = map2.get(io.sentry.util.HttpUtils.COOKIE_HEADER_NAME)) != null) {
            java.util.Iterator<java.lang.String> it = list.iterator();
            while (it.hasNext()) {
                sb.append(it.next());
                sb.append("; ");
            }
        }
        java.lang.String string = sb.toString();
        int length = string.length();
        while (length > 0) {
            int iCodePointBefore = java.lang.Character.codePointBefore(string, length);
            if (!java.lang.Character.isWhitespace(iCodePointBefore)) {
                break;
            }
            length -= java.lang.Character.charCount(iCodePointBefore);
        }
        return string.substring(0, length);
    }

    public static long getDocumentSize(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            return -1L;
        }
        java.util.regex.Matcher matcher = CONTENT_RANGE_WITH_SIZE.matcher(str);
        if (!matcher.matches()) {
            return -1L;
        }
        java.lang.String strGroup = matcher.group(1);
        strGroup.getClass();
        return java.lang.Long.parseLong(strGroup);
    }

    public static void storeCookiesFromHeaders(java.lang.String str, java.util.Map<java.lang.String, java.util.List<java.lang.String>> map, java.net.CookieHandler cookieHandler) {
        if (cookieHandler == null) {
            return;
        }
        try {
            cookieHandler.put(new java.net.URI(str), map);
        } catch (java.lang.Exception e6) {
            androidx.media3.common.util.Log.w(TAG, "Failed to store cookies in CookieHandler", e6);
        }
    }
}
