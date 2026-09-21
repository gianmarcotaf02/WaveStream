package D3;

/* JADX INFO: loaded from: classes.dex */
public final class l extends Z3.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final android.content.Context f2119b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ D3.e f2120c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(D3.e eVar, android.content.Context context) {
        super(android.os.Looper.myLooper() == null ? android.os.Looper.getMainLooper() : android.os.Looper.myLooper(), 0);
        this.f2120c = eVar;
        this.f2119b = context.getApplicationContext();
    }

    @Override // Z3.d, android.os.Handler
    public final void handleMessage(android.os.Message message) {
        int i3 = message.what;
        if (i3 != 1) {
            android.util.Log.w("GoogleApiAvailability", "Don't know how to handle this message: " + i3);
            return;
        }
        int i9 = D3.f.f2107a;
        D3.e eVar = this.f2120c;
        android.content.Context context = this.f2119b;
        int iB = eVar.b(context, i9);
        java.util.concurrent.atomic.AtomicBoolean atomicBoolean = D3.i.f2109a;
        if (iB == 1 || iB == 2 || iB == 3 || iB == 9) {
            android.content.Intent intentA = eVar.a(context, iB, "n");
            eVar.f(context, iB, intentA == null ? null : android.app.PendingIntent.getActivity(context, 0, intentA, 201326592));
        }
    }
}
