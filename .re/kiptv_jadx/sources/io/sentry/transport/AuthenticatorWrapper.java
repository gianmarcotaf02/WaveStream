package io.sentry.transport;

/* JADX INFO: loaded from: classes4.dex */
final class AuthenticatorWrapper {
    private static final io.sentry.transport.AuthenticatorWrapper instance = new io.sentry.transport.AuthenticatorWrapper();

    private AuthenticatorWrapper() {
    }

    public static io.sentry.transport.AuthenticatorWrapper getInstance() {
        return instance;
    }

    public void setDefault(java.net.Authenticator authenticator) {
        java.net.Authenticator.setDefault(authenticator);
    }
}
