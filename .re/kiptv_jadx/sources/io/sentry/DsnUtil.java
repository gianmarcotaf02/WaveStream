package io.sentry;

/* JADX INFO: loaded from: classes4.dex */
public final class DsnUtil {
    public static boolean urlContainsDsnHost(io.sentry.SentryOptions sentryOptions, java.lang.String str) {
        java.net.URI sentryUri;
        java.lang.String host;
        if (sentryOptions == null || str == null || sentryOptions.getDsn() == null || (host = (sentryUri = sentryOptions.retrieveParsedDsn().getSentryUri()).getHost()) == null) {
            return false;
        }
        java.util.Locale locale = java.util.Locale.ROOT;
        java.lang.String lowerCase = host.toLowerCase(locale);
        int port = sentryUri.getPort();
        if (port <= 0) {
            return str.toLowerCase(locale).contains(lowerCase);
        }
        return str.toLowerCase(locale).contains(lowerCase + ":" + port);
    }
}
