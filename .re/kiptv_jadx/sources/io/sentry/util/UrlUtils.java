package io.sentry.util;

/* JADX INFO: loaded from: classes4.dex */
public final class UrlUtils {
    public static final java.lang.String SENSITIVE_DATA_SUBSTITUTE = "[Filtered]";

    public static final class UrlDetails {
        private final java.lang.String fragment;
        private final java.lang.String query;
        private final java.lang.String url;

        public UrlDetails(java.lang.String str, java.lang.String str2, java.lang.String str3) {
            this.url = str;
            this.query = str2;
            this.fragment = str3;
        }

        public void applyToRequest(io.sentry.protocol.Request request) {
            if (request == null) {
                return;
            }
            request.setUrl(this.url);
            request.setQueryString(this.query);
            request.setFragment(this.fragment);
        }

        public void applyToSpan(io.sentry.ISpan iSpan) {
            if (iSpan == null) {
                return;
            }
            java.lang.String str = this.query;
            if (str != null) {
                iSpan.setData(io.sentry.SpanDataConvention.HTTP_QUERY_KEY, str);
            }
            java.lang.String str2 = this.fragment;
            if (str2 != null) {
                iSpan.setData(io.sentry.SpanDataConvention.HTTP_FRAGMENT_KEY, str2);
            }
        }

        public java.lang.String getFragment() {
            return this.fragment;
        }

        public java.lang.String getQuery() {
            return this.query;
        }

        public java.lang.String getUrl() {
            return this.url;
        }

        public java.lang.String getUrlOrFallback() {
            java.lang.String str = this.url;
            return str == null ? "unknown" : str;
        }
    }

    private static java.lang.String filterUserInfo(java.lang.String str) {
        if (!str.contains("@")) {
            return str;
        }
        boolean zStartsWith = str.startsWith("@");
        java.lang.String str2 = SENSITIVE_DATA_SUBSTITUTE;
        if (zStartsWith) {
            return SENSITIVE_DATA_SUBSTITUTE.concat(str);
        }
        if (str.substring(0, str.indexOf(64)).contains(":")) {
            str2 = "[Filtered]:[Filtered]";
        }
        java.lang.StringBuilder sbV = p121o0.p.v(str2);
        sbV.append(str.substring(str.indexOf(64)));
        return sbV.toString();
    }

    private static boolean isValidAbsoluteUrl(java.net.URI uri) {
        try {
            uri.toURL();
            return true;
        } catch (java.lang.Exception unused) {
            return false;
        }
    }

    public static io.sentry.util.UrlUtils.UrlDetails parse(java.lang.String str) {
        java.lang.String str2;
        try {
            java.net.URI uri = new java.net.URI(str);
            if (uri.isAbsolute() && !isValidAbsoluteUrl(uri)) {
                return new io.sentry.util.UrlUtils.UrlDetails(null, null, null);
            }
            java.lang.String rawPath = "";
            if (uri.getScheme() == null) {
                str2 = "";
            } else {
                str2 = uri.getScheme() + "://";
            }
            java.lang.String rawAuthority = uri.getRawAuthority() == null ? "" : uri.getRawAuthority();
            if (uri.getRawPath() != null) {
                rawPath = uri.getRawPath();
            }
            return new io.sentry.util.UrlUtils.UrlDetails(str2 + filterUserInfo(rawAuthority) + rawPath, uri.getRawQuery(), uri.getRawFragment());
        } catch (java.lang.Exception unused) {
            return new io.sentry.util.UrlUtils.UrlDetails(null, null, null);
        }
    }

    public static io.sentry.util.UrlUtils.UrlDetails parseNullable(java.lang.String str) {
        if (str == null) {
            return null;
        }
        return parse(str);
    }
}
