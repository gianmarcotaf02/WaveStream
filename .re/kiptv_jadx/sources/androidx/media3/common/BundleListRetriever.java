package androidx.media3.common;

/* JADX INFO: loaded from: classes.dex */
public final class BundleListRetriever extends android.os.Binder {
    private static final int REPLY_BREAK = 2;
    private static final int REPLY_CONTINUE = 1;
    private static final int REPLY_END_OF_LIST = 0;
    private final p076i4.AbstractC2186b0 list;

    public BundleListRetriever(java.util.List<android.os.Bundle> list) {
        this.list = p076i4.AbstractC2186b0.u(list);
    }

    public static p076i4.AbstractC2186b0 getList(android.os.IBinder iBinder) {
        return iBinder instanceof androidx.media3.common.BundleListRetriever ? ((androidx.media3.common.BundleListRetriever) iBinder).list : getListFromRemoteBinder(iBinder);
    }

    public static p076i4.AbstractC2186b0 getListFromRemoteBinder(android.os.IBinder iBinder) {
        int i3;
        p076i4.Y yS = p076i4.AbstractC2186b0.s();
        int i9 = 0;
        int i10 = 1;
        while (i10 != 0) {
            android.os.Parcel parcelObtain = android.os.Parcel.obtain();
            android.os.Parcel parcelObtain2 = android.os.Parcel.obtain();
            try {
                parcelObtain.writeInt(i9);
                try {
                    iBinder.transact(1, parcelObtain, parcelObtain2, 0);
                    while (true) {
                        i3 = parcelObtain2.readInt();
                        if (i3 == 1) {
                            android.os.Bundle bundle = parcelObtain2.readBundle();
                            bundle.getClass();
                            yS.c(bundle);
                            i9++;
                        }
                    }
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                    i10 = i3;
                } catch (android.os.RemoteException e6) {
                    throw new java.lang.RuntimeException(e6);
                }
            } catch (java.lang.Throwable th) {
                parcelObtain2.recycle();
                parcelObtain.recycle();
                throw th;
            }
        }
        return yS.f();
    }

    @Override // android.os.Binder
    public boolean onTransact(int i3, android.os.Parcel parcel, android.os.Parcel parcel2, int i9) {
        if (i3 != 1) {
            return super.onTransact(i3, parcel, parcel2, i9);
        }
        if (parcel2 == null) {
            return false;
        }
        int size = this.list.size();
        int i10 = parcel.readInt();
        while (i10 < size && parcel2.dataSize() < androidx.media3.common.C.SUGGESTED_MAX_IPC_SIZE) {
            parcel2.writeInt(1);
            parcel2.writeBundle((android.os.Bundle) this.list.get(i10));
            i10++;
        }
        parcel2.writeInt(i10 < size ? 2 : 0);
        return true;
    }
}
