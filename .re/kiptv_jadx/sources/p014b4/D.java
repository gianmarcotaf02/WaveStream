package p014b4;

/* JADX INFO: loaded from: classes.dex */
public final class D extends com.google.android.gms.common.internal.a {
    @Override // E3.c
    public final int h() {
        return 13000000;
    }

    @Override // com.google.android.gms.common.internal.a
    public final android.os.IInterface l(android.os.IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        android.os.IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.fido.fido2.internal.regular.IFido2AppService");
        return iInterfaceQueryLocalInterface instanceof p014b4.E ? (p014b4.E) iInterfaceQueryLocalInterface : new p014b4.E(iBinder, "com.google.android.gms.fido.fido2.internal.regular.IFido2AppService");
    }

    @Override // com.google.android.gms.common.internal.a
    public final D3.d[] m() {
        return new D3.d[]{Q3.a.f8531b, Q3.a.f8530a};
    }

    @Override // com.google.android.gms.common.internal.a
    public final android.os.Bundle o() {
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString("FIDO2_ACTION_START_SERVICE", "com.google.android.gms.fido.fido2.regular.START");
        return bundle;
    }

    @Override // com.google.android.gms.common.internal.a
    public final java.lang.String q() {
        return "com.google.android.gms.fido.fido2.internal.regular.IFido2AppService";
    }

    @Override // com.google.android.gms.common.internal.a
    public final java.lang.String r() {
        return "com.google.android.gms.fido.fido2.regular.START";
    }

    @Override // com.google.android.gms.common.internal.a
    public final boolean v() {
        return true;
    }
}
