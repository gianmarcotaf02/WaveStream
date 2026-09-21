package X3;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public abstract class a implements IInterface {

    public final int f10838c;

    public final IBinder f10839d;

    public final String f10840e;

    public a(IBinder iBinder, String str, int i3) {
        this.f10838c = i3;
        this.f10839d = iBinder;
        this.f10840e = str;
    }

    public void J(Parcel parcel, int i3) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            this.f10839d.transact(i3, parcel, parcelObtain, 0);
            parcelObtain.readException();
        } finally {
            parcel.recycle();
            parcelObtain.recycle();
        }
    }

    public Parcel X(Parcel parcel, int i3) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            try {
                this.f10839d.transact(i3, parcel, parcelObtain, 0);
                parcelObtain.readException();
                parcel.recycle();
                return parcelObtain;
            } catch (RuntimeException e6) {
                parcelObtain.recycle();
                throw e6;
            }
        } catch (Throwable th) {
            parcel.recycle();
            throw th;
        }
    }

    public Parcel Y() {
        switch (this.f10838c) {
            case 2:
                Parcel parcelObtain = Parcel.obtain();
                parcelObtain.writeInterfaceToken(this.f10840e);
                return parcelObtain;
            default:
                Parcel parcelObtain2 = Parcel.obtain();
                parcelObtain2.writeInterfaceToken(this.f10840e);
                return parcelObtain2;
        }
    }

    public Parcel Z(Parcel parcel, int i3) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            try {
                this.f10839d.transact(i3, parcel, parcelObtain, 0);
                parcelObtain.readException();
                parcel.recycle();
                return parcelObtain;
            } catch (RuntimeException e6) {
                parcelObtain.recycle();
                throw e6;
            }
        } catch (Throwable th) {
            parcel.recycle();
            throw th;
        }
    }

    public void a0(Parcel parcel, int i3) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            this.f10839d.transact(i3, parcel, parcelObtain, 0);
            parcelObtain.readException();
        } finally {
            parcel.recycle();
            parcelObtain.recycle();
        }
    }

    @Override
    public final IBinder asBinder() {
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

    public void b0(Parcel parcel, int i3) {
        try {
            this.f10839d.transact(i3, parcel, null, 1);
        } finally {
            parcel.recycle();
        }
    }

    public Parcel c0() {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken(this.f10840e);
        return parcelObtain;
    }

    public Parcel d0(Parcel parcel, int i3) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            try {
                this.f10839d.transact(i3, parcel, parcelObtain, 0);
                parcelObtain.readException();
                parcel.recycle();
                return parcelObtain;
            } catch (RuntimeException e6) {
                parcelObtain.recycle();
                throw e6;
            }
        } catch (Throwable th) {
            parcel.recycle();
            throw th;
        }
    }

    public void e0(Parcel parcel, int i3) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            this.f10839d.transact(i3, parcel, parcelObtain, 0);
            parcelObtain.readException();
        } finally {
            parcel.recycle();
            parcelObtain.recycle();
        }
    }

    public Parcel m() {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken(this.f10840e);
        return parcelObtain;
    }
}
