package H3;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.util.Log;

public final class u extends X3.g {

    public com.google.android.gms.common.internal.a f4006d;

    public final int f4007e;

    public u(com.google.android.gms.common.internal.a aVar, int i3) {
        super("com.google.android.gms.common.internal.IGmsCallbacks", 2);
        this.f4006d = aVar;
        this.f4007e = i3;
    }

    @Override
    public final boolean c0(int i3, Parcel parcel, Parcel parcel2) {
        if (i3 == 1) {
            int i9 = parcel.readInt();
            IBinder strongBinder = parcel.readStrongBinder();
            Bundle bundle = (Bundle) p004a4.h.a(parcel, Bundle.CREATOR);
            p004a4.h.c(parcel);
            q.h(this.f4006d, "onPostInitComplete can be called only once per call to getRemoteService");
            this.f4006d.u(i9, strongBinder, bundle, this.f4007e);
            this.f4006d = null;
        } else if (i3 == 2) {
            parcel.readInt();
            p004a4.h.c(parcel);
            Log.wtf("GmsClient", "received deprecated onAccountValidationComplete callback, ignoring", new Exception());
        } else {
            if (i3 != 3) {
                return false;
            }
            int i10 = parcel.readInt();
            IBinder strongBinder2 = parcel.readStrongBinder();
            y yVar = (y) p004a4.h.a(parcel, y.CREATOR);
            p004a4.h.c(parcel);
            com.google.android.gms.common.internal.a aVar = this.f4006d;
            q.h(aVar, "onPostInitCompleteWithConnectionInfo can be called only once per call togetRemoteService");
            q.g(yVar);
            aVar.f18710C = yVar;
            if (aVar.v()) {
                C0374c c0374c = yVar.f4013k;
                g gVarB = g.b();
                h hVar = c0374c == null ? null : c0374c.f3944h;
                synchronized (gVarB) {
                    try {
                        if (hVar == null) {
                            hVar = g.f3973c;
                        } else {
                            h hVar2 = (h) gVarB.f3974a;
                            if (hVar2 == null || hVar2.f3975h < hVar.f3975h) {
                            }
                        }
                        gVarB.f3974a = hVar;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            Bundle bundle2 = yVar.f4011h;
            q.h(this.f4006d, "onPostInitComplete can be called only once per call to getRemoteService");
            this.f4006d.u(i10, strongBinder2, bundle2, this.f4007e);
            this.f4006d = null;
        }
        parcel2.writeNoException();
        return true;
    }
}
