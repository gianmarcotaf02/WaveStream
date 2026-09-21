package p191x3;

import B3.C0089b;
import H3.q;
import O3.a;
import O3.b;
import android.content.Context;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.internal.cast.AbstractC1818z;

public final class g {

    public static final C0089b f31195c = new C0089b("SessionManager", null);

    public final w f31196a;

    public final Context f31197b;

    public g(w wVar, Context context) {
        this.f31196a = wVar;
        this.f31197b = context;
    }

    public final void a(h hVar) {
        q.d();
        try {
            w wVar = this.f31196a;
            y yVar = new y(hVar);
            Parcel parcelY = wVar.Y();
            AbstractC1818z.d(parcelY, yVar);
            wVar.a0(parcelY, 2);
        } catch (RemoteException e6) {
            f31195c.a(e6, "Unable to call %s on %s.", "addSessionManagerListener", w.class.getSimpleName());
        }
    }

    public final void b(boolean z6) {
        C0089b c0089b = f31195c;
        q.d();
        try {
            Log.i(c0089b.f617a, c0089b.d("End session for %s", this.f31197b.getPackageName()));
            w wVar = this.f31196a;
            Parcel parcelY = wVar.Y();
            int i3 = AbstractC1818z.f19179a;
            parcelY.writeInt(1);
            parcelY.writeInt(z6 ? 1 : 0);
            wVar.a0(parcelY, 6);
        } catch (RemoteException e6) {
            c0089b.a(e6, "Unable to call %s on %s.", "endCurrentSession", w.class.getSimpleName());
        }
    }

    public final f c() {
        q.d();
        try {
            w wVar = this.f31196a;
            Parcel parcelZ = wVar.Z(wVar.Y(), 1);
            a aVarD0 = b.d0(parcelZ.readStrongBinder());
            parcelZ.recycle();
            return (f) b.e0(aVarD0);
        } catch (RemoteException e6) {
            f31195c.a(e6, "Unable to call %s on %s.", "getWrappedCurrentSession", w.class.getSimpleName());
            return null;
        }
    }
}
