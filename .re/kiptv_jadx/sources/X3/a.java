package X3;

/* JADX INFO: loaded from: classes.dex */
public abstract class a implements android.os.IInterface {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f10838c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final android.os.IBinder f10839d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final java.lang.String f10840e;

    public /* synthetic */ a(android.os.IBinder iBinder, java.lang.String str, int i3) {
        this.f10838c = i3;
        this.f10839d = iBinder;
        this.f10840e = str;
    }

    public void J(android.os.Parcel parcel, int i3) {
        android.os.Parcel parcelObtain = android.os.Parcel.obtain();
        try {
            this.f10839d.transact(i3, parcel, parcelObtain, 0);
            parcelObtain.readException();
        } finally {
            parcel.recycle();
            parcelObtain.recycle();
        }
    }

    public android.os.Parcel X(android.os.Parcel parcel, int i3) {
        android.os.Parcel parcelObtain = android.os.Parcel.obtain();
        try {
            try {
                this.f10839d.transact(i3, parcel, parcelObtain, 0);
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

    public android.os.Parcel Y() {
        switch (this.f10838c) {
            case 2:
                android.os.Parcel parcelObtain = android.os.Parcel.obtain();
                parcelObtain.writeInterfaceToken(this.f10840e);
                return parcelObtain;
            default:
                android.os.Parcel parcelObtain2 = android.os.Parcel.obtain();
                parcelObtain2.writeInterfaceToken(this.f10840e);
                return parcelObtain2;
        }
    }

    public android.os.Parcel Z(android.os.Parcel parcel, int i3) {
        android.os.Parcel parcelObtain = android.os.Parcel.obtain();
        try {
            try {
                this.f10839d.transact(i3, parcel, parcelObtain, 0);
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

    public void a0(android.os.Parcel parcel, int i3) {
        android.os.Parcel parcelObtain = android.os.Parcel.obtain();
        try {
            this.f10839d.transact(i3, parcel, parcelObtain, 0);
            parcelObtain.readException();
        } finally {
            parcel.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // android.os.IInterface
    public final android.os.IBinder asBinder() {
        switch (this.f10838c) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
        }
        return this.f10839d;
    }

    public void b0(android.os.Parcel parcel, int i3) {
        try {
            this.f10839d.transact(i3, parcel, null, 1);
        } finally {
            parcel.recycle();
        }
    }

    public android.os.Parcel c0() {
        android.os.Parcel parcelObtain = android.os.Parcel.obtain();
        parcelObtain.writeInterfaceToken(this.f10840e);
        return parcelObtain;
    }

    public android.os.Parcel d0(android.os.Parcel parcel, int i3) {
        android.os.Parcel parcelObtain = android.os.Parcel.obtain();
        try {
            try {
                this.f10839d.transact(i3, parcel, parcelObtain, 0);
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

    public void e0(android.os.Parcel parcel, int i3) {
        android.os.Parcel parcelObtain = android.os.Parcel.obtain();
        try {
            this.f10839d.transact(i3, parcel, parcelObtain, 0);
            parcelObtain.readException();
        } finally {
            parcel.recycle();
            parcelObtain.recycle();
        }
    }

    public android.os.Parcel m() {
        android.os.Parcel parcelObtain = android.os.Parcel.obtain();
        parcelObtain.writeInterfaceToken(this.f10840e);
        return parcelObtain;
    }
}
