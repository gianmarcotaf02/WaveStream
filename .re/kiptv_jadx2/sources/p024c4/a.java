package p024c4;

import U3.b;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public abstract class a extends Binder implements IInterface {
    @Override
    public boolean onTransact(int i3, Parcel parcel, Parcel parcel2, int i9) {
        if (i3 <= 16777215) {
            parcel.enforceInterface(getInterfaceDescriptor());
        } else if (super.onTransact(i3, parcel, parcel2, i9)) {
            return true;
        }
        b bVar = (b) this;
        if (i3 == 1) {
            bVar.init(O3.b.d0(parcel.readStrongBinder()));
            parcel2.writeNoException();
            return true;
        }
        if (i3 == 2) {
            String string = parcel.readString();
            int i10 = b.f18507a;
            boolean booleanFlagValue = bVar.getBooleanFlagValue(string, parcel.readInt() != 0, parcel.readInt());
            parcel2.writeNoException();
            parcel2.writeInt(booleanFlagValue ? 1 : 0);
            return true;
        }
        if (i3 == 3) {
            int intFlagValue = bVar.getIntFlagValue(parcel.readString(), parcel.readInt(), parcel.readInt());
            parcel2.writeNoException();
            parcel2.writeInt(intFlagValue);
            return true;
        }
        if (i3 == 4) {
            long longFlagValue = bVar.getLongFlagValue(parcel.readString(), parcel.readLong(), parcel.readInt());
            parcel2.writeNoException();
            parcel2.writeLong(longFlagValue);
            return true;
        }
        if (i3 != 5) {
            return false;
        }
        String stringFlagValue = bVar.getStringFlagValue(parcel.readString(), parcel.readString(), parcel.readInt());
        parcel2.writeNoException();
        parcel2.writeString(stringFlagValue);
        return true;
    }

    @Override
    public IBinder asBinder() {
        return this;
    }
}
