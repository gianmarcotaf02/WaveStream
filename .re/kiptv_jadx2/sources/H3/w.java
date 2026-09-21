package H3;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import java.util.Objects;

public final class w extends o {
    public final IBinder g;

    public final com.google.android.gms.common.internal.a f4010h;

    public w(com.google.android.gms.common.internal.a aVar, int i3, IBinder iBinder, Bundle bundle) {
        super(aVar, i3, bundle);
        Objects.requireNonNull(aVar);
        this.f4010h = aVar;
        this.g = iBinder;
    }

    @Override
    public final boolean a() {
        IBinder iBinder = this.g;
        try {
            q.g(iBinder);
            String interfaceDescriptor = iBinder.getInterfaceDescriptor();
            com.google.android.gms.common.internal.a aVar = this.f4010h;
            if (!aVar.q().equals(interfaceDescriptor)) {
                String strQ = aVar.q();
                StringBuilder sb = new StringBuilder(strQ.length() + 34 + String.valueOf(interfaceDescriptor).length());
                sb.append("service descriptor mismatch: ");
                sb.append(strQ);
                sb.append(" vs. ");
                sb.append(interfaceDescriptor);
                Log.w("GmsClient", sb.toString());
                return false;
            }
            IInterface iInterfaceL = aVar.l(iBinder);
            if (iInterfaceL == null || !(aVar.w(2, 4, iInterfaceL) || aVar.w(3, 4, iInterfaceL))) {
                return false;
            }
            aVar.f18708A = null;
            aVar.n();
            g gVar = aVar.f18726v;
            if (gVar == null) {
                return true;
            }
            ((E3.g) gVar.f3974a).onConnected();
            return true;
        } catch (RemoteException unused) {
            Log.w("GmsClient", "service probably died");
            return false;
        }
    }

    @Override
    public final void b(D3.b bVar) {
        com.google.android.gms.common.internal.a aVar = this.f4010h;
        g gVar = aVar.f18727w;
        if (gVar != null) {
            ((E3.h) gVar.f3974a).m(bVar);
        }
        aVar.t(bVar);
    }
}
