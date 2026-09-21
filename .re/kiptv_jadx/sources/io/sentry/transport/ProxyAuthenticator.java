package io.sentry.transport;

/* JADX INFO: loaded from: classes4.dex */
final class ProxyAuthenticator extends java.net.Authenticator {
    private final java.lang.String password;
    private final java.lang.String user;

    public ProxyAuthenticator(java.lang.String str, java.lang.String str2) {
        this.user = (java.lang.String) io.sentry.util.Objects.requireNonNull(str, "user is required");
        this.password = (java.lang.String) io.sentry.util.Objects.requireNonNull(str2, "password is required");
    }

    public java.lang.String getPassword() {
        return this.password;
    }

    @Override // java.net.Authenticator
    public java.net.PasswordAuthentication getPasswordAuthentication() {
        if (getRequestorType() == java.net.Authenticator.RequestorType.PROXY) {
            return new java.net.PasswordAuthentication(this.user, this.password.toCharArray());
        }
        return null;
    }

    public java.lang.String getUser() {
        return this.user;
    }
}
