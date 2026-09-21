package F3;

/* JADX INFO: loaded from: classes.dex */
public abstract class H {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f3566a;

    public H(int i3) {
        this.f3566a = i3;
    }

    public static com.google.android.gms.common.api.Status e(android.os.RemoteException remoteException) {
        return new com.google.android.gms.common.api.Status(19, remoteException.getClass().getSimpleName() + ": " + remoteException.getLocalizedMessage(), null, null);
    }

    public abstract void a(com.google.android.gms.common.api.Status status);

    public abstract void b(java.lang.RuntimeException runtimeException);

    public abstract void c(F3.s sVar);

    public abstract void d(S.p pVar, boolean z6);
}
