package p020c0;

import android.os.Parcel;
import android.os.Parcelable;

public final class C1671b0 implements Parcelable.Creator {

    public final int f18221a;

    @Override
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f18221a) {
            case 0:
                return new C1673c0(parcel.readFloat());
            case 1:
                return new C1675d0(parcel.readInt());
            default:
                return new C1677e0(parcel.readLong());
        }
    }

    @Override
    public final Object[] newArray(int i3) {
        switch (this.f18221a) {
            case 0:
                return new C1673c0[i3];
            case 1:
                return new C1675d0[i3];
            default:
                return new C1677e0[i3];
        }
    }
}
