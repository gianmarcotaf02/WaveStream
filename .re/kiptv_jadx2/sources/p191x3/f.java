package p191x3;

import B3.C0089b;
import H3.q;
import O3.a;
import O3.b;
import android.content.Context;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.cast.AbstractC1731d;
import com.google.android.gms.internal.cast.C1739f;

public abstract class f {

    public static final C0089b f31193b = new C0089b("Session", null);

    public final v f31194a;

    public f(Context context, String str, String str2) {
        v vVarH0;
        try {
            vVarH0 = AbstractC1731d.b(context).h0(str, str2, new x(this));
        } catch (RemoteException | C3103d e6) {
            AbstractC1731d.f18886a.a(e6, "Unable to call %s on %s.", "newSessionImpl", C1739f.class.getSimpleName());
            vVarH0 = null;
        }
        this.f31194a = vVarH0;
    }

    public final void a(int i3) {
        v vVar = this.f31194a;
        if (vVar == null) {
            return;
        }
        try {
            t tVar = (t) vVar;
            Parcel parcelY = tVar.Y();
            parcelY.writeInt(i3);
            tVar.a0(parcelY, 13);
        } catch (RemoteException e6) {
            f31193b.a(e6, "Unable to call %s on %s.", "notifySessionEnded", v.class.getSimpleName());
        }
    }

    public final int b() {
        q.d();
        v vVar = this.f31194a;
        if (vVar == null) {
            return 0;
        }
        try {
            t tVar = (t) vVar;
            Parcel parcelZ = tVar.Z(tVar.Y(), 17);
            int i3 = parcelZ.readInt();
            parcelZ.recycle();
            if (i3 < 211100000) {
                return 0;
            }
            t tVar2 = (t) vVar;
            Parcel parcelZ2 = tVar2.Z(tVar2.Y(), 18);
            int i9 = parcelZ2.readInt();
            parcelZ2.recycle();
            return i9;
        } catch (RemoteException e6) {
            f31193b.a(e6, "Unable to call %s on %s.", "getSessionStartType", v.class.getSimpleName());
            return 0;
        }
    }

    public final a c() {
        v vVar = this.f31194a;
        if (vVar != null) {
            try {
                t tVar = (t) vVar;
                Parcel parcelZ = tVar.Z(tVar.Y(), 1);
                a aVarD0 = b.d0(parcelZ.readStrongBinder());
                parcelZ.recycle();
                return aVarD0;
            } catch (RemoteException e6) {
                f31193b.a(e6, "Unable to call %s on %s.", "getWrappedObject", v.class.getSimpleName());
            }
        }
        return null;
    }
}
