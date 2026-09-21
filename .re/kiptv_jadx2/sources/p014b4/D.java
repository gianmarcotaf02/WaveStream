package p014b4;

import D3.d;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.common.internal.a;

public final class D extends a {
    @Override
    public final int h() {
        return 13000000;
    }

    @Override
    public final IInterface l(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.fido.fido2.internal.regular.IFido2AppService");
        return iInterfaceQueryLocalInterface instanceof E ? (E) iInterfaceQueryLocalInterface : new E(iBinder, "com.google.android.gms.fido.fido2.internal.regular.IFido2AppService");
    }

    @Override
    public final d[] m() {
        return new d[]{Q3.a.f8531b, Q3.a.f8530a};
    }

    @Override
    public final Bundle o() {
        Bundle bundle = new Bundle();
        bundle.putString("FIDO2_ACTION_START_SERVICE", "com.google.android.gms.fido.fido2.regular.START");
        return bundle;
    }

    @Override
    public final String q() {
        return "com.google.android.gms.fido.fido2.internal.regular.IFido2AppService";
    }

    @Override
    public final String r() {
        return "com.google.android.gms.fido.fido2.regular.START";
    }

    @Override
    public final boolean v() {
        return true;
    }
}
