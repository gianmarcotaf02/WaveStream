package B3;

import android.os.IBinder;
import android.os.IInterface;

public final class y extends com.google.android.gms.common.internal.a {
    @Override
    public final int h() {
        return 12451000;
    }

    @Override
    public final IInterface l(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.cast.internal.ICastService");
        return iInterfaceQueryLocalInterface instanceof k ? (k) iInterfaceQueryLocalInterface : new k(iBinder, "com.google.android.gms.cast.internal.ICastService", 3);
    }

    @Override
    public final D3.d[] m() {
        return p184w3.x.f29948e;
    }

    @Override
    public final String q() {
        return "com.google.android.gms.cast.internal.ICastService";
    }

    @Override
    public final String r() {
        return "com.google.android.gms.cast.service.BIND_CAST_DEVICE_CONTROLLER_SERVICE";
    }

    @Override
    public final boolean v() {
        return true;
    }
}
