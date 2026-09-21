package androidx.recyclerview.widget;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

public final class c0 implements Parcelable {
    public static final Parcelable.Creator<c0> CREATOR = new T3.G(29);

    public int f17384h;

    public int f17385i;
    public int[] j;

    public boolean f17386k;

    @Override
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return "FullSpanItem{mPosition=" + this.f17384h + ", mGapDir=" + this.f17385i + ", mHasUnwantedGapAfter=" + this.f17386k + ", mGapPerSpan=" + Arrays.toString(this.j) + '}';
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i3) {
        parcel.writeInt(this.f17384h);
        parcel.writeInt(this.f17385i);
        parcel.writeInt(this.f17386k ? 1 : 0);
        int[] iArr = this.j;
        if (iArr == null || iArr.length <= 0) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(iArr.length);
            parcel.writeIntArray(this.j);
        }
    }
}
