package io.sentry;

/* JADX INFO: loaded from: classes4.dex */
final class Dsn {
    private final java.lang.String path;
    private final java.lang.String projectId;
    private final java.lang.String publicKey;
    private final java.lang.String secretKey;
    private final java.net.URI sentryUri;

    public Dsn(java.lang.String str) {
        try {
            io.sentry.util.Objects.requireNonNull(str, "The DSN is required.");
            java.net.URI uriNormalize = new java.net.URI(str).normalize();
            java.lang.String scheme = uriNormalize.getScheme();
            if (!"http".equalsIgnoreCase(scheme) && !"https".equalsIgnoreCase(scheme)) {
                throw new java.lang.IllegalArgumentException("Invalid DSN scheme: " + scheme);
            }
            java.lang.String userInfo = uriNormalize.getUserInfo();
            if (userInfo == null || userInfo.isEmpty()) {
                throw new java.lang.IllegalArgumentException("Invalid DSN: No public key provided.");
            }
            java.lang.String[] strArrSplit = userInfo.split(":", -1);
            java.lang.String str2 = strArrSplit[0];
            this.publicKey = str2;
            if (str2 == null || str2.isEmpty()) {
                throw new java.lang.IllegalArgumentException("Invalid DSN: No public key provided.");
            }
            this.secretKey = strArrSplit.length > 1 ? strArrSplit[1] : null;
            java.lang.String path = uriNormalize.getPath();
            path = path.endsWith("/") ? path.substring(0, path.length() - 1) : path;
            int iLastIndexOf = path.lastIndexOf("/") + 1;
            java.lang.String strSubstring = path.substring(0, iLastIndexOf);
            strSubstring = strSubstring.endsWith("/") ? strSubstring : strSubstring.concat("/");
            this.path = strSubstring;
            java.lang.String strSubstring2 = path.substring(iLastIndexOf);
            this.projectId = strSubstring2;
            if (strSubstring2.isEmpty()) {
                throw new java.lang.IllegalArgumentException("Invalid DSN: A Project Id is required.");
            }
            this.sentryUri = new java.net.URI(scheme, null, uriNormalize.getHost(), uriNormalize.getPort(), strSubstring + "api/" + strSubstring2, null, null);
        } catch (java.lang.Throwable th) {
            throw new java.lang.IllegalArgumentException(th);
        }
    }

    public java.lang.String getPath() {
        return this.path;
    }

    public java.lang.String getProjectId() {
        return this.projectId;
    }

    public java.lang.String getPublicKey() {
        return this.publicKey;
    }

    public java.lang.String getSecretKey() {
        return this.secretKey;
    }

    public java.net.URI getSentryUri() {
        return this.sentryUri;
    }
}
