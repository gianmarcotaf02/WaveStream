package io.sentry;

/* JADX INFO: loaded from: classes4.dex */
final class RequestDetailsResolver {
    private static final java.lang.String SENTRY_AUTH = "X-Sentry-Auth";
    private static final java.lang.String USER_AGENT = "User-Agent";
    private final io.sentry.SentryOptions options;

    public RequestDetailsResolver(io.sentry.SentryOptions sentryOptions) {
        this.options = (io.sentry.SentryOptions) io.sentry.util.Objects.requireNonNull(sentryOptions, "options is required");
    }

    public io.sentry.RequestDetails resolve() {
        io.sentry.Dsn dsnRetrieveParsedDsn = this.options.retrieveParsedDsn();
        java.net.URI sentryUri = dsnRetrieveParsedDsn.getSentryUri();
        java.lang.String string = sentryUri.resolve(sentryUri.getPath() + "/envelope/").toString();
        java.lang.String publicKey = dsnRetrieveParsedDsn.getPublicKey();
        java.lang.String secretKey = dsnRetrieveParsedDsn.getSecretKey();
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Sentry sentry_version=7,sentry_client=");
        sb.append(this.options.getSentryClientName());
        sb.append(",sentry_key=");
        sb.append(publicKey);
        sb.append((secretKey == null || secretKey.length() <= 0) ? "" : ",sentry_secret=".concat(secretKey));
        java.lang.String string2 = sb.toString();
        java.lang.String sentryClientName = this.options.getSentryClientName();
        java.util.HashMap map = new java.util.HashMap();
        map.put(USER_AGENT, sentryClientName);
        map.put(SENTRY_AUTH, string2);
        return new io.sentry.RequestDetails(string, map);
    }
}
