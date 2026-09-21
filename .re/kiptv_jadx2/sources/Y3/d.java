package Y3;

import android.os.IBinder;
import android.os.IInterface;

public final class d extends com.google.android.gms.common.internal.a {
    @Override
    public final int h() {
        return 17895000;
    }

    @Override
    public final IInterface l(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.blockstore.internal.IBlockstoreService");
        return iInterfaceQueryLocalInterface instanceof e ? (e) iInterfaceQueryLocalInterface : new e(iBinder, "com.google.android.gms.auth.blockstore.internal.IBlockstoreService");
    }

    @Override
    public final D3.d[] m() {
        return b.f11524e;
    }

    @Override
    public final String q() {
        return "com.google.android.gms.auth.blockstore.internal.IBlockstoreService";
    }

    @Override
    public final String r() {
        return "com.google.android.gms.auth.blockstore.service.START";
    }

    @Override
    public final boolean s() {
        return true;
    }

    @Override
    public final boolean v() {
        return true;
    }
}
