package B3;

/* JADX INFO: loaded from: classes.dex */
public final class y extends com.google.android.gms.common.internal.a {
    @Override // E3.c
    public final int h() {
        return 12451000;
    }

    @Override // com.google.android.gms.common.internal.a
    public final android.os.IInterface l(android.os.IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        android.os.IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.cast.internal.ICastService");
        return iInterfaceQueryLocalInterface instanceof B3.k ? (B3.k) iInterfaceQueryLocalInterface : new B3.k(iBinder, "com.google.android.gms.cast.internal.ICastService", 3);
    }

    @Override // com.google.android.gms.common.internal.a
    public final D3.d[] m() {
        return p184w3.x.f29948e;
    }

    @Override // com.google.android.gms.common.internal.a
    public final java.lang.String q() {
        return "com.google.android.gms.cast.internal.ICastService";
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
