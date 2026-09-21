package D3;

/* JADX INFO: loaded from: classes.dex */
public final class a implements android.content.ServiceConnection {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f2093h = false;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final java.util.concurrent.LinkedBlockingQueue f2094i = new java.util.concurrent.LinkedBlockingQueue();

    public final android.os.IBinder a() throws java.util.concurrent.TimeoutException {
        java.util.concurrent.TimeUnit timeUnit = java.util.concurrent.TimeUnit.MILLISECONDS;
        if (android.os.Looper.getMainLooper() == android.os.Looper.myLooper()) {
            throw new java.lang.IllegalStateException("BlockingServiceConnection.getServiceWithTimeout() called on main thread");
        }
        if (this.f2093h) {
            throw new java.lang.IllegalStateException("Cannot call get on this connection more than once");
        }
        this.f2093h = true;
        android.os.IBinder iBinder = (android.os.IBinder) this.f2094i.poll(androidx.media3.exoplayer.Renderer.DEFAULT_DURATION_TO_PROGRESS_US, timeUnit);
        if (iBinder != null) {
            return iBinder;
        }
        throw new java.util.concurrent.TimeoutException("Timed out waiting for the service connection");
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(android.content.ComponentName componentName, android.os.IBinder iBinder) {
        this.f2094i.add(iBinder);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(android.content.ComponentName componentName) {
    }
}
