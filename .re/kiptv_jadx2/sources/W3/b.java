package W3;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public final class b implements d, IInterface {

    public final IBinder f10595c;

    public b(IBinder iBinder) {
        this.f10595c = iBinder;
    }

    @Override
    public final IBinder asBinder() {
        return this.f10595c;
    }

    public final Parcel m(Parcel parcel, int i3) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            try {
                this.f10595c.transact(i3, parcel, parcelObtain, 0);
                parcelObtain.readException();
                parcel.recycle();
                return parcelObtain;
            } catch (RuntimeException e6) {
                parcelObtain.recycle();
                throw e6;
            }
        } catch (Throwable th) {
            parcel.recycle();
            throw th;
        }
    }
}
