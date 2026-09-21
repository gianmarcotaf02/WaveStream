package androidx.recyclerview.widget;

import android.os.Parcel;
import android.os.Parcelable;

public final class C1638u implements Parcelable {
    public static final Parcelable.Creator<C1638u> CREATOR = new T3.G(28);

    public int f17517h;

    public int f17518i;
    public boolean j;

    @Override
    public final int describeContents() {
        return 0;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i3) {
        parcel.writeInt(this.f17517h);
        parcel.writeInt(this.f17518i);
        parcel.writeInt(this.j ? 1 : 0);
    }
}
