package android.support.v4.os;

/* JADX INFO: loaded from: classes.dex */
public final class c extends android.os.Binder implements android.support.v4.os.b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f15627d = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ android.support.v4.os.e f15628c;

    public c(android.support.v4.os.e eVar) {
        this.f15628c = eVar;
        attachInterface(this, android.support.v4.os.b.f15626a);
    }

    @Override // android.support.v4.os.b
    public final void W(int i3, android.os.Bundle bundle) {
        android.support.v4.os.e eVar = this.f15628c;
        android.os.Handler handler = eVar.mHandler;
        if (handler != null) {
            handler.post(new android.support.v4.os.d(eVar, i3, bundle));
        } else {
            eVar.onReceiveResult(i3, bundle);
        }
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i3, android.os.Parcel parcel, android.os.Parcel parcel2, int i9) {
        java.lang.String str = android.support.v4.os.b.f15626a;
        if (i3 >= 1 && i3 <= 16777215) {
            parcel.enforceInterface(str);
        }
        if (i3 == 1598968902) {
            parcel2.writeString(str);
            return true;
        }
        if (i3 != 1) {
            return super.onTransact(i3, parcel, parcel2, i9);
        }
        W(parcel.readInt(), (android.os.Bundle) (parcel.readInt() != 0 ? android.os.Bundle.CREATOR.createFromParcel(parcel) : null));
        return true;
    }

    @Override // android.os.IInterface
    public final android.os.IBinder asBinder() {
        return this;
    }
}
