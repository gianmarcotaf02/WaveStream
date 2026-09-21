package androidx.media3.common;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.List;
import p076i4.AbstractC2186b0;
import p076i4.Y;

public final class BundleListRetriever extends Binder {
    private static final int REPLY_BREAK = 2;
    private static final int REPLY_CONTINUE = 1;
    private static final int REPLY_END_OF_LIST = 0;
    private final AbstractC2186b0 list;

    public BundleListRetriever(List<Bundle> list) {
        this.list = AbstractC2186b0.u(list);
    }

    public static AbstractC2186b0 getList(IBinder iBinder) {
        return iBinder instanceof BundleListRetriever ? ((BundleListRetriever) iBinder).list : getListFromRemoteBinder(iBinder);
    }

    public static AbstractC2186b0 getListFromRemoteBinder(IBinder iBinder) {
        int i3;
        Y yS = AbstractC2186b0.s();
        int i9 = 0;
        int i10 = 1;
        while (i10 != 0) {
            Parcel parcelObtain = Parcel.obtain();
            Parcel parcelObtain2 = Parcel.obtain();
            try {
                parcelObtain.writeInt(i9);
                try {
                    iBinder.transact(1, parcelObtain, parcelObtain2, 0);
                    while (true) {
                        i3 = parcelObtain2.readInt();
                        if (i3 == 1) {
                            Bundle bundle = parcelObtain2.readBundle();
                            bundle.getClass();
                            yS.c(bundle);
                            i9++;
                        }
                    }
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                    i10 = i3;
                } catch (RemoteException e6) {
                    throw new RuntimeException(e6);
                }
            } catch (Throwable th) {
                parcelObtain2.recycle();
                parcelObtain.recycle();
                throw th;
            }
        }
        return yS.f();
    }

    @Override
    public boolean onTransact(int i3, Parcel parcel, Parcel parcel2, int i9) {
        if (i3 != 1) {
            return super.onTransact(i3, parcel, parcel2, i9);
        }
        if (parcel2 == null) {
            return false;
        }
        int size = this.list.size();
        int i10 = parcel.readInt();
        while (i10 < size && parcel2.dataSize() < C.SUGGESTED_MAX_IPC_SIZE) {
            parcel2.writeInt(1);
            parcel2.writeBundle((Bundle) this.list.get(i10));
            i10++;
        }
        parcel2.writeInt(i10 < size ? 2 : 0);
        return true;
    }
}
