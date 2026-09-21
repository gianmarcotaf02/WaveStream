package io.sentry;

/* JADX INFO: loaded from: classes4.dex */
public final class RequestDetails {
    private final java.util.Map<java.lang.String, java.lang.String> headers;
    private final java.net.URL url;

    public RequestDetails(java.lang.String str, java.util.Map<java.lang.String, java.lang.String> map) {
        io.sentry.util.Objects.requireNonNull(str, "url is required");
        io.sentry.util.Objects.requireNonNull(map, "headers is required");
        try {
            this.url = java.net.URI.create(str).toURL();
            this.headers = map;
        } catch (java.net.MalformedURLException e6) {
            throw new java.lang.IllegalArgumentException("Failed to compose the Sentry's server URL.", e6);
        }
    }

    public java.util.Map<java.lang.String, java.lang.String> getHeaders() {
        return this.headers;
    }

    public java.net.URL getUrl() {
        return this.url;
    }
}
