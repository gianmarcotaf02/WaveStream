package W3;

/* JADX INFO: loaded from: classes.dex */
public final class b implements W3.d, android.os.IInterface {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final android.os.IBinder f10595c;

    public b(android.os.IBinder iBinder) {
        this.f10595c = iBinder;
    }

    @Override // android.os.IInterface
    public final android.os.IBinder asBinder() {
        return this.f10595c;
    }

    public final android.os.Parcel m(android.os.Parcel parcel, int i3) {
        android.os.Parcel parcelObtain = android.os.Parcel.obtain();
        try {
            try {
                this.f10595c.transact(i3, parcel, parcelObtain, 0);
                parcelObtain.readException();
                parcel.recycle();
                return parcelObtain;
            } catch (java.lang.RuntimeException e6) {
                parcelObtain.recycle();
                throw e6;
            }
        } catch (java.lang.Throwable th) {
            parcel.recycle();
            throw th;
        }
    }
}
