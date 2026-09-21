package Y3;

/* JADX INFO: loaded from: classes.dex */
public final class e implements android.os.IInterface {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final android.os.IBinder f11526c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final java.lang.String f11527d;

    public e(android.os.IBinder iBinder, java.lang.String str) {
        this.f11526c = iBinder;
        this.f11527d = str;
    }

    public final void J(android.os.Parcel parcel, int i3) {
        android.os.Parcel parcelObtain = android.os.Parcel.obtain();
        try {
            this.f11526c.transact(i3, parcel, parcelObtain, 0);
            parcelObtain.readException();
        } finally {
            parcel.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // android.os.IInterface
    public final android.os.IBinder asBinder() {
        return this.f11526c;
    }

    public final android.os.Parcel m() {
        android.os.Parcel parcelObtain = android.os.Parcel.obtain();
        parcelObtain.writeInterfaceToken(this.f11527d);
        return parcelObtain;
    }
}
