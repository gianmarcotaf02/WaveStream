package H3;

/* JADX INFO: loaded from: classes.dex */
public final class v implements android.content.ServiceConnection {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f4008h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.google.android.gms.common.internal.a f4009i;

    public v(com.google.android.gms.common.internal.a aVar, int i3) {
        java.util.Objects.requireNonNull(aVar);
        this.f4009i = aVar;
        this.f4008h = i3;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(android.content.ComponentName componentName, android.os.IBinder iBinder) {
        int i3;
        int i9;
        com.google.android.gms.common.internal.a aVar = this.f4009i;
        if (iBinder == null) {
            synchronized (aVar.f18718n) {
                i3 = aVar.f18725u;
            }
            if (i3 == 3) {
                aVar.f18709B = true;
                i9 = 5;
            } else {
                i9 = 4;
            }
            H3.t tVar = aVar.f18717m;
            tVar.sendMessage(tVar.obtainMessage(i9, aVar.f18711D.get(), 16));
            return;
        }
        synchronized (aVar.f18719o) {
            try {
                android.os.IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                aVar.f18720p = (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof H3.p)) ? new H3.p(iBinder) : (H3.p) iInterfaceQueryLocalInterface;
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
        com.google.android.gms.common.internal.a aVar2 = this.f4009i;
        int i10 = this.f4008h;
        aVar2.getClass();
        H3.x xVar = new H3.x(aVar2, 0, null);
        H3.t tVar2 = aVar2.f18717m;
        tVar2.sendMessage(tVar2.obtainMessage(7, i10, -1, xVar));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(android.content.ComponentName componentName) {
        com.google.android.gms.common.internal.a aVar = this.f4009i;
        synchronized (aVar.f18719o) {
            aVar.f18720p = null;
        }
        com.google.android.gms.common.internal.a aVar2 = this.f4009i;
        int i3 = this.f4008h;
        H3.t tVar = aVar2.f18717m;
        tVar.sendMessage(tVar.obtainMessage(6, i3, 1));
    }
}
