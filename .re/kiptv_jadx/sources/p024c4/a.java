package p024c4;

/* JADX INFO: loaded from: classes.dex */
public abstract class a extends android.os.Binder implements android.os.IInterface {
    @Override // android.os.Binder
    public boolean onTransact(int i3, android.os.Parcel parcel, android.os.Parcel parcel2, int i9) {
        if (i3 <= 16777215) {
            parcel.enforceInterface(getInterfaceDescriptor());
        } else if (super.onTransact(i3, parcel, parcel2, i9)) {
            return true;
        }
        U3.b bVar = (U3.b) this;
        if (i3 == 1) {
            bVar.init(O3.b.d0(parcel.readStrongBinder()));
            parcel2.writeNoException();
            return true;
        }
        if (i3 == 2) {
            java.lang.String string = parcel.readString();
            int i10 = p024c4.b.f18507a;
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
        java.lang.String stringFlagValue = bVar.getStringFlagValue(parcel.readString(), parcel.readString(), parcel.readInt());
        parcel2.writeNoException();
        parcel2.writeString(stringFlagValue);
        return true;
    }

    @Override // android.os.IInterface
    public android.os.IBinder asBinder() {
        return this;
    }
}
