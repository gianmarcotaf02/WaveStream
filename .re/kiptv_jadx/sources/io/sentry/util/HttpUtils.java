package io.sentry.util;

/* JADX INFO: loaded from: classes4.dex */
public final class HttpUtils {
    public static final java.lang.String COOKIE_HEADER_NAME = "Cookie";
    private static final java.util.List<java.lang.String> SENSITIVE_HEADERS = java.util.Arrays.asList("X-FORWARDED-FOR", "AUTHORIZATION", "COOKIE", "SET-COOKIE", "X-API-KEY", "X-REAL-IP", "REMOTE-ADDR", "FORWARDED", "PROXY-AUTHORIZATION", "X-CSRF-TOKEN", "X-CSRFTOKEN", "X-XSRF-TOKEN");
    private static final java.util.List<java.lang.String> SECURITY_COOKIES = java.util.Arrays.asList("JSESSIONID", "JSESSIONIDSSO", "JSSOSESSIONID", "SESSIONID", "SID", "CSRFTOKEN", "XSRF-TOKEN");
    private static final io.sentry.HttpStatusCodeRange CLIENT_ERROR_STATUS_CODES = new io.sentry.HttpStatusCodeRange(com.revenuecat.purchases.common.networking.RCHTTPStatusCodes.BAD_REQUEST, 499);
    private static final io.sentry.HttpStatusCodeRange SEVER_ERROR_STATUS_CODES = new io.sentry.HttpStatusCodeRange(500, io.sentry.HttpStatusCodeRange.DEFAULT_MAX);

    public static boolean containsSensitiveHeader(java.lang.String str) {
        return SENSITIVE_HEADERS.contains(str.toUpperCase(java.util.Locale.ROOT));
    }

    public static java.lang.String filterOutSecurityCookies(java.lang.String str, java.util.List<java.lang.String> list) {
        if (str == null) {
            return null;
        }
        try {
            java.lang.String[] strArrSplit = str.split(";", -1);
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            int length = strArrSplit.length;
            boolean z6 = true;
            int i3 = 0;
            while (i3 < length) {
                java.lang.String str2 = strArrSplit[i3];
                if (!z6) {
                    sb.append(";");
                }
                java.lang.String str3 = str2.split("=", -1)[0];
                if (isSecurityCookie(str3.trim(), list)) {
                    sb.append(str3 + "=" + io.sentry.util.UrlUtils.SENSITIVE_DATA_SUBSTITUTE);
                } else {
                    sb.append(str2);
                }
                i3++;
                z6 = false;
            }
            return sb.toString();
        } catch (java.lang.Throwable unused) {
            return null;
        }
    }

    public static java.util.List<java.lang.String> filterOutSecurityCookiesFromHeader(java.util.Enumeration<java.lang.String> enumeration, java.lang.String str, java.util.List<java.lang.String> list) {
        if (enumeration == null) {
            return null;
        }
        return filterOutSecurityCookiesFromHeader(java.util.Collections.list(enumeration), str, list);
    }

    public static boolean isHttpClientError(int i3) {
        return CLIENT_ERROR_STATUS_CODES.isInRange(i3);
    }

    public static boolean isHttpServerError(int i3) {
        return SEVER_ERROR_STATUS_CODES.isInRange(i3);
    }

    public static boolean isSecurityCookie(java.lang.String str, java.util.List<java.lang.String> list) {
        java.lang.String upperCase = str.toUpperCase(java.util.Locale.ROOT);
        if (SECURITY_COOKIES.contains(upperCase)) {
            return true;
        }
        if (list == null) {
            return false;
        }
        java.util.Iterator<java.lang.String> it = list.iterator();
        while (it.hasNext()) {
            if (it.next().toUpperCase(java.util.Locale.ROOT).equals(upperCase)) {
                return true;
            }
        }
        return false;
    }

    public static java.util.List<java.lang.String> filterOutSecurityCookiesFromHeader(java.util.List<java.lang.String> list, java.lang.String str, java.util.List<java.lang.String> list2) {
        if (list == null) {
            return null;
        }
        if (str != null && !COOKIE_HEADER_NAME.equalsIgnoreCase(str)) {
            return list;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator<java.lang.String> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(filterOutSecurityCookies(it.next(), list2));
        }
        return arrayList;
    }
}
