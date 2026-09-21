package android.support.v4.os;

/* JADX INFO: loaded from: classes.dex */
public class e implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.support.v4.os.e> CREATOR = new T3.G(27);
    final android.os.Handler mHandler;
    final boolean mLocal;
    android.support.v4.os.b mReceiver;

    public e(android.os.Handler handler) {
        this.mLocal = true;
        this.mHandler = handler;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public void onReceiveResult(int i3, android.os.Bundle bundle) {
    }

    public void send(int i3, android.os.Bundle bundle) {
        if (this.mLocal) {
            android.os.Handler handler = this.mHandler;
            if (handler != null) {
                handler.post(new android.support.v4.os.d(this, i3, bundle));
                return;
            } else {
                onReceiveResult(i3, bundle);
                return;
            }
        }
        android.support.v4.os.b bVar = this.mReceiver;
        if (bVar != null) {
            try {
                bVar.W(i3, bundle);
            } catch (android.os.RemoteException unused) {
            }
        }
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i3) {
        synchronized (this) {
            try {
                if (this.mReceiver == null) {
                    this.mReceiver = new android.support.v4.os.c(this);
                }
                parcel.writeStrongBinder(this.mReceiver.asBinder());
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }

    public e(android.os.Parcel parcel) {
        this.mLocal = false;
        android.support.v4.os.b bVar = null;
        this.mHandler = null;
        android.os.IBinder strongBinder = parcel.readStrongBinder();
        int i3 = android.support.v4.os.c.f15627d;
        if (strongBinder != null) {
            android.os.IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface(android.support.v4.os.b.f15626a);
            if (iInterfaceQueryLocalInterface != null && (iInterfaceQueryLocalInterface instanceof android.support.v4.os.b)) {
                bVar = (android.support.v4.os.b) iInterfaceQueryLocalInterface;
            } else {
                android.support.v4.os.a aVar = new android.support.v4.os.a();
                aVar.f15625c = strongBinder;
                bVar = aVar;
            }
        }
        this.mReceiver = bVar;
    }
}
