package io.sentry;

/* JADX INFO: loaded from: classes4.dex */
public final class FilterString {
    private final java.lang.String filterString;
    private final java.util.regex.Pattern pattern;

    public FilterString(java.lang.String str) {
        java.util.regex.Pattern patternCompile;
        this.filterString = str;
        try {
            patternCompile = java.util.regex.Pattern.compile(str);
        } catch (java.lang.Throwable unused) {
            io.sentry.Sentry.getCurrentScopes().getOptions().getLogger().log(io.sentry.SentryLevel.DEBUG, "Only using filter string for String comparison as it could not be parsed as regex: %s", str);
            patternCompile = null;
        }
        this.pattern = patternCompile;
    }

    public boolean equals(java.lang.Object obj) {
        if (obj == null || io.sentry.FilterString.class != obj.getClass()) {
            return false;
        }
        return java.util.Objects.equals(this.filterString, ((io.sentry.FilterString) obj).filterString);
    }

    public java.lang.String getFilterString() {
        return this.filterString;
    }

    public int hashCode() {
        return java.util.Objects.hash(this.filterString);
    }

    public boolean matches(java.lang.String str) {
        java.util.regex.Pattern pattern = this.pattern;
        if (pattern == null) {
            return false;
        }
        return pattern.matcher(str).matches();
    }
}
