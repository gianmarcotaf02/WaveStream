package Y2;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.internal.play_billing.AbstractBinderC1837f;
import com.google.android.gms.internal.play_billing.AbstractC1872t;
import com.google.android.gms.internal.play_billing.C1834e;
import com.google.android.gms.internal.play_billing.InterfaceC1840g;
import java.util.Objects;

public final class N implements ServiceConnection {

    public final O f11391h;

    public N(O o8) {
        Objects.requireNonNull(o8);
        this.f11391h = o8;
    }

    @Override
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        InterfaceC1840g c1834e;
        AbstractC1872t.g("BillingClientTesting", "Billing Override Service connected.");
        O o8 = this.f11391h;
        int i3 = AbstractBinderC1837f.f19322d;
        if (iBinder == null) {
            c1834e = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.apps.play.billingtestcompanion.aidl.IBillingOverrideService");
            c1834e = iInterfaceQueryLocalInterface instanceof InterfaceC1840g ? (InterfaceC1840g) iInterfaceQueryLocalInterface : new C1834e(iBinder, "com.google.android.apps.play.billingtestcompanion.aidl.IBillingOverrideService", 4);
        }
        o8.f11393J = c1834e;
        o8.f11392I = 2;
        o8.S(26);
    }

    @Override
    public final void onServiceDisconnected(ComponentName componentName) {
        AbstractC1872t.h("BillingClientTesting", "Billing Override Service disconnected.");
        O o8 = this.f11391h;
        o8.f11393J = null;
        o8.f11392I = 0;
    }
}
