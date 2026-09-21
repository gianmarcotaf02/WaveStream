package android.support.v4.os;

import T3.G;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;

public class e implements Parcelable {
    public static final Parcelable.Creator<e> CREATOR = new G(27);
    final Handler mHandler;
    final boolean mLocal;
    b mReceiver;

    public e(Handler handler) {
        this.mLocal = true;
        this.mHandler = handler;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public void onReceiveResult(int i3, Bundle bundle) {
    }

    public void send(int i3, Bundle bundle) {
        if (this.mLocal) {
            Handler handler = this.mHandler;
            if (handler != null) {
                handler.post(new d(this, i3, bundle));
                return;
            } else {
                onReceiveResult(i3, bundle);
                return;
            }
        }
        b bVar = this.mReceiver;
        if (bVar != null) {
            try {
                bVar.W(i3, bundle);
            } catch (RemoteException unused) {
            }
        }
    }

    @Override
    public void writeToParcel(Parcel parcel, int i3) {
        synchronized (this) {
            try {
                if (this.mReceiver == null) {
                    this.mReceiver = new c(this);
                }
                parcel.writeStrongBinder(this.mReceiver.asBinder());
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public e(Parcel parcel) {
        this.mLocal = false;
        b bVar = null;
        this.mHandler = null;
        IBinder strongBinder = parcel.readStrongBinder();
        int i3 = c.f15627d;
        if (strongBinder != null) {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface(b.f15626a);
            if (iInterfaceQueryLocalInterface != null && (iInterfaceQueryLocalInterface instanceof b)) {
                bVar = (b) iInterfaceQueryLocalInterface;
            } else {
                a aVar = new a();
                aVar.f15625c = strongBinder;
                bVar = aVar;
            }
        }
        this.mReceiver = bVar;
    }
}
