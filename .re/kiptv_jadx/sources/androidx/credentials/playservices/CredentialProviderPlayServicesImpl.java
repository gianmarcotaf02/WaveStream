package androidx.credentials.playservices;

/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u0000 +2\u00020\u0001:\u0001,B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\b\u0010\tJE\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00010\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014JE\u0010\u0016\u001a\u00020\u00122\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u00152\b\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00010\u0010H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0015\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0019\u0010\u001bJ?\u0010\u001f\u001a\u00020\u00122\u0006\u0010\u000b\u001a\u00020\u001c2\b\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0014\u0010\u0011\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u001d\u0012\u0004\u0012\u00020\u001e0\u0010H\u0016¢\u0006\u0004\b\u001f\u0010 R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010!R(\u0010#\u001a\u00020\"8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b#\u0010$\u0012\u0004\b)\u0010*\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(¨\u0006-"}, d2 = {"Landroidx/credentials/playservices/CredentialProviderPlayServicesImpl;", "", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", "minApkVersion", "isGooglePlayServicesAvailable", "(Landroid/content/Context;I)I", "LI1/e;", io.sentry.SentryBaseEvent.JsonKeys.REQUEST, "Landroid/os/CancellationSignal;", "cancellationSignal", "Ljava/util/concurrent/Executor;", "executor", "LI1/c;", "callback", "Lh6/A;", "onGetCredential", "(Landroid/content/Context;LI1/e;Landroid/os/CancellationSignal;Ljava/util/concurrent/Executor;LI1/c;)V", "LI1/b;", "onCreateCredential", "(Landroid/content/Context;LI1/b;Landroid/os/CancellationSignal;Ljava/util/concurrent/Executor;LI1/c;)V", "", "isAvailableOnDevice", "()Z", "(I)Z", "LI1/a;", "Ljava/lang/Void;", "LF6/a;", "onClearCredential", "(LI1/a;Landroid/os/CancellationSignal;Ljava/util/concurrent/Executor;LI1/c;)V", "Landroid/content/Context;", "LD3/e;", "googleApiAvailability", "LD3/e;", "getGoogleApiAvailability", "()LD3/e;", "setGoogleApiAvailability", "(LD3/e;)V", "getGoogleApiAvailability$annotations", "()V", "Companion", "K1/b", "credentials-play-services-auth_release"}, k = 1, mv = {1, 9, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class CredentialProviderPlayServicesImpl {
    public static final K1.b Companion = new K1.b();
    public static final int MIN_GMS_APK_VERSION = 230815045;
    public static final int MIN_GMS_APK_VERSION_DIGITAL_CRED = 243100000;
    public static final int MIN_GMS_APK_VERSION_RESTORE_CRED = 242200000;
    private static final java.lang.String TAG = "PlayServicesImpl";
    private final android.content.Context context;
    private D3.e googleApiAvailability;

    public CredentialProviderPlayServicesImpl(android.content.Context context) {
        kotlin.jvm.internal.m.e(context, "context");
        this.context = context;
        this.googleApiAvailability = D3.e.f2106d;
    }

    public static /* synthetic */ void getGoogleApiAvailability$annotations() {
    }

    private final int isGooglePlayServicesAvailable(android.content.Context context, int minApkVersion) {
        return this.googleApiAvailability.b(context, minApkVersion);
    }

    private static final void onClearCredential$lambda$1(android.os.CancellationSignal cancellationSignal, java.util.concurrent.Executor executor, I1.c cVar, java.lang.Exception e6) {
        kotlin.jvm.internal.m.e(e6, "e");
        android.util.Log.w(TAG, "Clearing restore credential failed", e6);
        kotlin.jvm.internal.A a2 = new kotlin.jvm.internal.A();
        a2.f24539h = new F6.a("Clear restore credential failed for unknown reason.");
        if ((e6 instanceof E3.d) && ((E3.d) e6).f2825h.f18690h == 40201) {
            a2.f24539h = new F6.a("The restore credential internal service had a failure.");
        }
        K1.b bVar = Companion;
        K0.C0656d c0656d = new K0.C0656d(executor, a2, 1);
        bVar.getClass();
        K1.b.a(cancellationSignal, c0656d);
    }

    private static final void onClearCredential$lambda$4(androidx.credentials.playservices.CredentialProviderPlayServicesImpl credentialProviderPlayServicesImpl, android.os.CancellationSignal cancellationSignal, java.util.concurrent.Executor executor, I1.c cVar, java.lang.Exception e6) {
        kotlin.jvm.internal.m.e(e6, "e");
        K1.b bVar = Companion;
        K0.C0656d c0656d = new K0.C0656d(e6, executor, 2);
        bVar.getClass();
        K1.b.a(cancellationSignal, c0656d);
    }

    public final D3.e getGoogleApiAvailability() {
        return this.googleApiAvailability;
    }

    public boolean isAvailableOnDevice() {
        return isAvailableOnDevice(MIN_GMS_APK_VERSION);
    }

    public void onClearCredential(I1.a request, android.os.CancellationSignal cancellationSignal, java.util.concurrent.Executor executor, I1.c callback) {
        kotlin.jvm.internal.m.e(request, "request");
        throw null;
    }

    public void onCreateCredential(android.content.Context context, I1.b request, android.os.CancellationSignal cancellationSignal, java.util.concurrent.Executor executor, I1.c callback) {
        kotlin.jvm.internal.m.e(context, "context");
        kotlin.jvm.internal.m.e(request, "request");
        throw null;
    }

    public void onGetCredential(android.content.Context context, I1.e request, android.os.CancellationSignal cancellationSignal, java.util.concurrent.Executor executor, I1.c callback) {
        kotlin.jvm.internal.m.e(context, "context");
        kotlin.jvm.internal.m.e(request, "request");
        throw null;
    }

    public void onPrepareCredential(I1.e request, android.os.CancellationSignal cancellationSignal, java.util.concurrent.Executor executor, I1.c callback) {
        kotlin.jvm.internal.m.e(request, "request");
        kotlin.jvm.internal.m.e(executor, "executor");
        kotlin.jvm.internal.m.e(callback, "callback");
    }

    public final void setGoogleApiAvailability(D3.e eVar) {
        kotlin.jvm.internal.m.e(eVar, "<set-?>");
        this.googleApiAvailability = eVar;
    }

    public final boolean isAvailableOnDevice(int minApkVersion) {
        int iIsGooglePlayServicesAvailable = isGooglePlayServicesAvailable(this.context, minApkVersion);
        boolean z6 = iIsGooglePlayServicesAvailable == 0;
        if (!z6) {
            android.util.Log.w(TAG, "Connection with Google Play Services was not successful. Connection result is: " + new D3.b(iIsGooglePlayServicesAvailable, null, null));
        }
        return z6;
    }

    public void onGetCredential(android.content.Context context, I1.f pendingGetCredentialHandle, android.os.CancellationSignal cancellationSignal, java.util.concurrent.Executor executor, I1.c callback) {
        kotlin.jvm.internal.m.e(context, "context");
        kotlin.jvm.internal.m.e(pendingGetCredentialHandle, "pendingGetCredentialHandle");
        kotlin.jvm.internal.m.e(executor, "executor");
        kotlin.jvm.internal.m.e(callback, "callback");
    }
}
