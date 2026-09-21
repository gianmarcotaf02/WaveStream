package io.sentry;

import java.net.URI;
import java.util.Locale;

public final class DsnUtil {
    public static boolean urlContainsDsnHost(SentryOptions sentryOptions, String str) {
        URI sentryUri;
        String host;
        if (sentryOptions == null || str == null || sentryOptions.getDsn() == null || (host = (sentryUri = sentryOptions.retrieveParsedDsn().getSentryUri()).getHost()) == null) {
            return false;
        }
        Locale locale = Locale.ROOT;
        String lowerCase = host.toLowerCase(locale);
        int port = sentryUri.getPort();
        if (port <= 0) {
            return str.toLowerCase(locale).contains(lowerCase);
        }
        return str.toLowerCase(locale).contains(lowerCase + ":" + port);
    }
}
