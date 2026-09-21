package X3;

import F3.D;
import android.os.BadParcelableException;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.play_billing.AbstractC1831d;
import com.google.android.gms.internal.play_billing.M0;
import com.google.common.util.concurrent.C;

public abstract class g extends Binder implements IInterface {

    public final int f10851c;

    public static void Z(Parcel parcel) {
        int i3 = Y3.c.f11525a;
        int iDataAvail = parcel.dataAvail();
        if (iDataAvail > 0) {
            throw new BadParcelableException(M0.l(iDataAvail, "Parcel data not fully consumed, unread size: "));
        }
    }

    public static void a0(Parcel parcel) {
        int i3 = AbstractC1831d.f19314a;
        int iDataAvail = parcel.dataAvail();
        if (iDataAvail > 0) {
            throw new BadParcelableException(M0.l(iDataAvail, "Parcel data not fully consumed, unread size: "));
        }
    }

    public abstract boolean X(int i3, Parcel parcel, Parcel parcel2);

    public abstract boolean Y(Parcel parcel, int i3);

    @Override
    public final IBinder asBinder() {
        int i3 = this.f10851c;
        return this;
    }

    public abstract boolean b0(int i3, Parcel parcel, Parcel parcel2);

    public boolean c0(int i3, Parcel parcel, Parcel parcel2) {
        return false;
    }

    @Override
    public final boolean onTransact(int i3, Parcel parcel, Parcel parcel2, int i9) throws RemoteException {
        boolean zOnTransact;
        boolean zOnTransact2;
        switch (this.f10851c) {
            case 0:
                if (i3 <= 16777215) {
                    parcel.enforceInterface(getInterfaceDescriptor());
                } else if (super.onTransact(i3, parcel, parcel2, i9)) {
                    return true;
                }
                return b0(i3, parcel, parcel2);
            case 1:
                if (i3 > 16777215) {
                    zOnTransact = super.onTransact(i3, parcel, parcel2, i9);
                } else {
                    parcel.enforceInterface(getInterfaceDescriptor());
                    zOnTransact = false;
                }
                if (zOnTransact) {
                    return true;
                }
                return Y(parcel, i3);
            case 2:
                if (i3 <= 16777215) {
                    parcel.enforceInterface(getInterfaceDescriptor());
                } else if (super.onTransact(i3, parcel, parcel2, i9)) {
                    return true;
                }
                return c0(i3, parcel, parcel2);
            case 3:
                if (i3 <= 16777215) {
                    parcel.enforceInterface(getInterfaceDescriptor());
                } else if (super.onTransact(i3, parcel, parcel2, i9)) {
                    return true;
                }
                return c0(i3, parcel, parcel2);
            case 4:
                if (i3 > 16777215) {
                    zOnTransact2 = super.onTransact(i3, parcel, parcel2, i9);
                } else {
                    parcel.enforceInterface(getInterfaceDescriptor());
                    zOnTransact2 = false;
                }
                if (zOnTransact2) {
                    return true;
                }
                return X(i3, parcel, parcel2);
            default:
                if (i3 > 16777215) {
                    if (!super.onTransact(i3, parcel, parcel2, i9)) {
                    }
                    return true;
                }
                parcel.enforceInterface(getInterfaceDescriptor());
                switch (i3) {
                    case 3:
                        Z3.a.b(parcel);
                        break;
                    case 4:
                        Z3.a.b(parcel);
                        break;
                    case 5:
                    default:
                        return false;
                    case 6:
                        Z3.a.b(parcel);
                        break;
                    case 7:
                        Z3.a.b(parcel);
                        break;
                    case 8:
                        p051f4.e eVar = (p051f4.e) Z3.a.a(parcel, p051f4.e.CREATOR);
                        Z3.a.b(parcel);
                        D d4 = (D) this;
                        d4.f3555e.post(new C(6, d4, eVar, false));
                        break;
                    case 9:
                        Z3.a.b(parcel);
                        break;
                }
                parcel2.writeNoException();
                return true;
        }
    }

    public g(String str, int i3) {
        this.f10851c = i3;
        switch (i3) {
            case 1:
                attachInterface(this, str);
                break;
            case 2:
                attachInterface(this, str);
                break;
            case 3:
                attachInterface(this, str);
                break;
            case 4:
                attachInterface(this, str);
                break;
            default:
                attachInterface(this, str);
                break;
        }
    }
}
