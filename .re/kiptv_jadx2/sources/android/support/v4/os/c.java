package android.support.v4.os;

import android.os.Binder;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Parcel;

public final class c extends Binder implements b {

    public static final int f15627d = 0;

    public final e f15628c;

    public c(e eVar) {
        this.f15628c = eVar;
        attachInterface(this, b.f15626a);
    }

    @Override
    public final void W(int i3, Bundle bundle) {
        e eVar = this.f15628c;
        Handler handler = eVar.mHandler;
        if (handler != null) {
            handler.post(new d(eVar, i3, bundle));
        } else {
            eVar.onReceiveResult(i3, bundle);
        }
    }

    @Override
    public final boolean onTransact(int i3, Parcel parcel, Parcel parcel2, int i9) {
        String str = b.f15626a;
        if (i3 >= 1 && i3 <= 16777215) {
            parcel.enforceInterface(str);
        }
        if (i3 == 1598968902) {
            parcel2.writeString(str);
            return true;
        }
        if (i3 != 1) {
            return super.onTransact(i3, parcel, parcel2, i9);
        }
        W(parcel.readInt(), (Bundle) (parcel.readInt() != 0 ? Bundle.CREATOR.createFromParcel(parcel) : null));
        return true;
    }

    @Override
    public final IBinder asBinder() {
        return this;
    }
}
