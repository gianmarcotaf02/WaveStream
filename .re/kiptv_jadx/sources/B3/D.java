package B3;

/* JADX INFO: loaded from: classes.dex */
public final class D extends com.google.android.gms.common.internal.a {

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public static final B3.C0089b f611K = new B3.C0089b("CastClientImplCxless", null);

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public final com.google.android.gms.cast.CastDevice f612G;
    public final long H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public final android.os.Bundle f613I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public final java.lang.String f614J;

    public D(android.content.Context context, android.os.Looper looper, p179v4.o oVar, com.google.android.gms.cast.CastDevice castDevice, long j, android.os.Bundle bundle, java.lang.String str, F3.s sVar, F3.s sVar2) {
        super(context, looper, 10, oVar, sVar, sVar2);
        this.f612G = castDevice;
        this.H = j;
        this.f613I = bundle;
        this.f614J = str;
    }

    @Override // com.google.android.gms.common.internal.a, E3.c
    public final void disconnect() {
        try {
            try {
                ((B3.h) p()).f0();
            } finally {
                super.disconnect();
            }
        } catch (android.os.RemoteException | java.lang.IllegalStateException e6) {
            f611K.a(e6, "Error while disconnecting the controller interface", new java.lang.Object[0]);
        }
    }

    @Override // E3.c
    public final int h() {
        return 19390000;
    }

    @Override // com.google.android.gms.common.internal.a
    public final /* synthetic */ android.os.IInterface l(android.os.IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        android.os.IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.cast.internal.ICastDeviceController");
        return iInterfaceQueryLocalInterface instanceof B3.h ? (B3.h) iInterfaceQueryLocalInterface : new B3.h(iBinder);
    }

    @Override // com.google.android.gms.common.internal.a
    public final D3.d[] m() {
        return p184w3.x.f29948e;
    }

    @Override // com.google.android.gms.common.internal.a
    public final android.os.Bundle o() {
        android.os.Bundle bundle = new android.os.Bundle();
        f611K.b("getRemoteService()", new java.lang.Object[0]);
        com.google.android.gms.cast.CastDevice castDevice = this.f612G;
        castDevice.getClass();
        bundle.putParcelable("com.google.android.gms.cast.EXTRA_CAST_DEVICE", castDevice);
        bundle.putLong("com.google.android.gms.cast.EXTRA_CAST_FLAGS", this.H);
        bundle.putString("connectionless_client_record_id", this.f614J);
        android.os.Bundle bundle2 = this.f613I;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        return bundle;
    }

    @Override // com.google.android.gms.common.internal.a
    public final java.lang.String q() {
        return "com.google.android.gms.cast.internal.ICastDeviceController";
    }

    @Override // com.google.android.gms.common.internal.a
    public final java.lang.String r() {
        return "com.google.android.gms.cast.service.BIND_CAST_DEVICE_CONTROLLER_SERVICE";
    }

    @Override // com.google.android.gms.common.internal.a
    public final boolean v() {
        return true;
    }
}
