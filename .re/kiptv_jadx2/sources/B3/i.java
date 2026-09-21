package B3;

import android.os.Parcel;
import com.google.android.gms.internal.cast.AbstractC1818z;
import p184w3.C2969d;

public abstract class i extends X3.g implements j {
    public i() {
        super("com.google.android.gms.cast.internal.ICastDeviceControllerListener", 3);
    }

    @Override
    public final boolean c0(int i3, Parcel parcel, Parcel parcel2) {
        switch (i3) {
            case 1:
                int i9 = parcel.readInt();
                AbstractC1818z.b(parcel);
                t(i9);
                return true;
            case 2:
                C2969d c2969d = (C2969d) AbstractC1818z.a(parcel, C2969d.CREATOR);
                String string = parcel.readString();
                String string2 = parcel.readString();
                boolean z6 = parcel.readInt() != 0;
                AbstractC1818z.b(parcel);
                B(c2969d, string, string2, z6);
                return true;
            case 3:
                int i10 = parcel.readInt();
                AbstractC1818z.b(parcel);
                y(i10);
                return true;
            case 4:
                parcel.readString();
                parcel.readDouble();
                int i11 = AbstractC1818z.f19179a;
                parcel.readInt();
                AbstractC1818z.b(parcel);
                o();
                return true;
            case 5:
                String string3 = parcel.readString();
                String string4 = parcel.readString();
                AbstractC1818z.b(parcel);
                v(string3, string4);
                return true;
            case 6:
                String string5 = parcel.readString();
                byte[] bArrCreateByteArray = parcel.createByteArray();
                AbstractC1818z.b(parcel);
                U(string5, bArrCreateByteArray);
                return true;
            case 7:
                int i12 = parcel.readInt();
                AbstractC1818z.b(parcel);
                g(i12);
                return true;
            case 8:
                int i13 = parcel.readInt();
                AbstractC1818z.b(parcel);
                S(i13);
                return true;
            case 9:
                int i14 = parcel.readInt();
                AbstractC1818z.b(parcel);
                a(i14);
                return true;
            case 10:
                parcel.readString();
                long j = parcel.readLong();
                int i15 = parcel.readInt();
                AbstractC1818z.b(parcel);
                T(i15, j);
                return true;
            case 11:
                parcel.readString();
                long j9 = parcel.readLong();
                AbstractC1818z.b(parcel);
                z(j9);
                return true;
            case 12:
                C0090c c0090c = (C0090c) AbstractC1818z.a(parcel, C0090c.CREATOR);
                AbstractC1818z.b(parcel);
                h(c0090c);
                return true;
            case 13:
                f fVar = (f) AbstractC1818z.a(parcel, f.CREATOR);
                AbstractC1818z.b(parcel);
                N(fVar);
                return true;
            case 14:
                int i16 = parcel.readInt();
                AbstractC1818z.b(parcel);
                I(i16);
                return true;
            case 15:
                int i17 = parcel.readInt();
                AbstractC1818z.b(parcel);
                P(i17);
                return true;
            default:
                return false;
        }
    }
}
