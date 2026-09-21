package M8;

/* JADX INFO: loaded from: classes4.dex */
public final class J extends M8.C0678f {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final java.net.Socket f7230m;

    public J(java.net.Socket socket) {
        this.f7230m = socket;
    }

    @Override // M8.C0678f
    public final void k() {
        java.net.Socket socket = this.f7230m;
        try {
            socket.close();
        } catch (java.lang.AssertionError e6) {
            if (!M8.AbstractC0674b.f(e6)) {
                throw e6;
            }
            M8.y.f7290a.log(java.util.logging.Level.WARNING, "Failed to close timed out socket " + socket, (java.lang.Throwable) e6);
        } catch (java.lang.Exception e9) {
            M8.y.f7290a.log(java.util.logging.Level.WARNING, "Failed to close timed out socket " + socket, (java.lang.Throwable) e9);
        }
    }

    public final java.io.IOException l(java.io.IOException iOException) {
        java.net.SocketTimeoutException socketTimeoutException = new java.net.SocketTimeoutException(io.sentry.ProfilingTraceData.TRUNCATION_REASON_TIMEOUT);
        if (iOException != null) {
            socketTimeoutException.initCause(iOException);
        }
        return socketTimeoutException;
    }
}
