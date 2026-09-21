package H3;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import java.util.Objects;

public final class v implements ServiceConnection {

    public final int f4008h;

    public final com.google.android.gms.common.internal.a f4009i;

    public v(com.google.android.gms.common.internal.a aVar, int i3) {
        Objects.requireNonNull(aVar);
        this.f4009i = aVar;
        this.f4008h = i3;
    }

    @Override
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
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
            t tVar = aVar.f18717m;
            tVar.sendMessage(tVar.obtainMessage(i9, aVar.f18711D.get(), 16));
            return;
        }
        synchronized (aVar.f18719o) {
            try {
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                aVar.f18720p = (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof p)) ? new p(iBinder) : (p) iInterfaceQueryLocalInterface;
            } catch (Throwable th) {
                throw th;
            }
        }
        com.google.android.gms.common.internal.a aVar2 = this.f4009i;
        int i10 = this.f4008h;
        aVar2.getClass();
        x xVar = new x(aVar2, 0, null);
        t tVar2 = aVar2.f18717m;
        tVar2.sendMessage(tVar2.obtainMessage(7, i10, -1, xVar));
    }

    @Override
    public final void onServiceDisconnected(ComponentName componentName) {
        com.google.android.gms.common.internal.a aVar = this.f4009i;
        synchronized (aVar.f18719o) {
            aVar.f18720p = null;
        }
        com.google.android.gms.common.internal.a aVar2 = this.f4009i;
        int i3 = this.f4008h;
        t tVar = aVar2.f18717m;
        tVar.sendMessage(tVar.obtainMessage(6, i3, 1));
    }
}
