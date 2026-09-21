package Y3;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public final class e implements IInterface {

    public final IBinder f11526c;

    public final String f11527d;

    public e(IBinder iBinder, String str) {
        this.f11526c = iBinder;
        this.f11527d = str;
    }

    public final void J(Parcel parcel, int i3) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            this.f11526c.transact(i3, parcel, parcelObtain, 0);
            parcelObtain.readException();
        } finally {
            parcel.recycle();
            parcelObtain.recycle();
        }
    }

    @Override
    public final IBinder asBinder() {
        return this.f11526c;
    }

    public final Parcel m() {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken(this.f11527d);
        return parcelObtain;
    }
}
