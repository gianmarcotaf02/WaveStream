package p103m;

import N1.b;
import android.os.Parcel;
import android.os.Parcelable;
import p121o0.m;

public final class W0 extends b {
    public static final Parcelable.Creator<W0> CREATOR = new m(3);
    public int j;

    public boolean f24979k;

    public W0(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.j = parcel.readInt();
        this.f24979k = parcel.readInt() != 0;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i3) {
        super.writeToParcel(parcel, i3);
        parcel.writeInt(this.j);
        parcel.writeInt(this.f24979k ? 1 : 0);
    }
}
