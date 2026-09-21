package android.support.v4.os;

/* JADX INFO: loaded from: classes.dex */
public final class a implements android.support.v4.os.b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public android.os.IBinder f15625c;

    @Override // android.support.v4.os.b
    public final void W(int i3, android.os.Bundle bundle) {
        android.os.Parcel parcelObtain = android.os.Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(android.support.v4.os.b.f15626a);
            parcelObtain.writeInt(i3);
            if (bundle != null) {
                parcelObtain.writeInt(1);
                bundle.writeToParcel(parcelObtain, 0);
            } else {
                parcelObtain.writeInt(0);
            }
            this.f15625c.transact(1, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // android.os.IInterface
    public final android.os.IBinder asBinder() {
        return this.f15625c;
    }
}
