package H3;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public final class p implements IInterface {

    public final IBinder f3999c;

    public p(IBinder iBinder) {
        this.f3999c = iBinder;
    }

    @Override
    public final IBinder asBinder() {
        return this.f3999c;
    }

    public final void m(u uVar, C0375d c0375d) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
            parcelObtain.writeStrongBinder(uVar);
            parcelObtain.writeInt(1);
            B3.e.a(c0375d, parcelObtain, 0);
            this.f3999c.transact(46, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }
}
