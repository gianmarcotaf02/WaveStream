package androidx.profileinstaller;

/* JADX INFO: loaded from: classes.dex */
public class ProfileInstallerInitializer implements p190x2.b {
    @Override // p190x2.b
    public final java.lang.Object create(android.content.Context context) {
        final android.content.Context applicationContext = context.getApplicationContext();
        android.view.Choreographer.getInstance().postFrameCallback(new android.view.Choreographer.FrameCallback() { // from class: r2.d
            @Override // android.view.Choreographer.FrameCallback
            public final void doFrame(long j) {
                this.f26814h.getClass();
                (android.os.Build.VERSION.SDK_INT >= 28 ? android.os.Handler.createAsync(android.os.Looper.getMainLooper()) : new android.os.Handler(android.os.Looper.getMainLooper())).postDelayed(new p147r2.e(applicationContext, 0), new java.util.Random().nextInt(java.lang.Math.max(1000, 1)) + 5000);
            }
        });
        return new q2.i(4);
    }

    @Override // p190x2.b
    public final java.util.List dependencies() {
        return java.util.Collections.EMPTY_LIST;
    }
}
