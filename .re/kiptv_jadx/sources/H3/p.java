package H3;

/* JADX INFO: loaded from: classes.dex */
public final class p implements android.os.IInterface {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final android.os.IBinder f3999c;

    public p(android.os.IBinder iBinder) {
        this.f3999c = iBinder;
    }

    @Override // android.os.IInterface
    public final android.os.IBinder asBinder() {
        return this.f3999c;
    }

    public final void m(H3.u uVar, H3.C0375d c0375d) {
        android.os.Parcel parcelObtain = android.os.Parcel.obtain();
        android.os.Parcel parcelObtain2 = android.os.Parcel.obtain();
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
