package androidx.recyclerview.widget;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

public final class e0 implements Parcelable {
    public static final Parcelable.Creator<e0> CREATOR = new d0(0);

    public int f17399h;

    public int f17400i;
    public int j;

    public int[] f17401k;

    public int f17402l;

    public int[] f17403m;

    public ArrayList f17404n;

    public boolean f17405o;

    public boolean f17406p;

    public boolean f17407q;

    @Override
    public final int describeContents() {
        return 0;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i3) {
        parcel.writeInt(this.f17399h);
        parcel.writeInt(this.f17400i);
        parcel.writeInt(this.j);
        if (this.j > 0) {
            parcel.writeIntArray(this.f17401k);
        }
        parcel.writeInt(this.f17402l);
        if (this.f17402l > 0) {
            parcel.writeIntArray(this.f17403m);
        }
        parcel.writeInt(this.f17405o ? 1 : 0);
        parcel.writeInt(this.f17406p ? 1 : 0);
        parcel.writeInt(this.f17407q ? 1 : 0);
        parcel.writeList(this.f17404n);
    }
}
