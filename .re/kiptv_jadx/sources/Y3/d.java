package Y3;

/* JADX INFO: loaded from: classes.dex */
public final class d extends com.google.android.gms.common.internal.a {
    @Override // E3.c
    public final int h() {
        return 17895000;
    }

    @Override // com.google.android.gms.common.internal.a
    public final android.os.IInterface l(android.os.IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        android.os.IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.blockstore.internal.IBlockstoreService");
        return iInterfaceQueryLocalInterface instanceof Y3.e ? (Y3.e) iInterfaceQueryLocalInterface : new Y3.e(iBinder, "com.google.android.gms.auth.blockstore.internal.IBlockstoreService");
    }

    @Override // com.google.android.gms.common.internal.a
    public final D3.d[] m() {
        return Y3.b.f11524e;
    }

    @Override // com.google.android.gms.common.internal.a
    public final java.lang.String q() {
        return "com.google.android.gms.auth.blockstore.internal.IBlockstoreService";
    }

    @Override // com.google.android.gms.common.internal.a
    public final java.lang.String r() {
        return "com.google.android.gms.auth.blockstore.service.START";
    }

    @Override // com.google.android.gms.common.internal.a
    public final boolean s() {
        return true;
    }

    @Override // com.google.android.gms.common.internal.a
    public final boolean v() {
        return true;
    }
}
