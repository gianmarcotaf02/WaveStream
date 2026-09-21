package N1;

import android.os.Parcel;
import android.os.Parcelable;
import p121o0.m;

public abstract class b implements Parcelable {

    public final Parcelable f7299h;

    public static final a f7298i = new a();
    public static final Parcelable.Creator<b> CREATOR = new m(1);

    public b() {
        this.f7299h = null;
    }

    @Override
    public final int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i3) {
        parcel.writeParcelable(this.f7299h, i3);
    }

    public b(Parcelable parcelable) {
        if (parcelable != null) {
            this.f7299h = parcelable == f7298i ? null : parcelable;
            return;
        }
        throw new IllegalArgumentException("superState must not be null");
    }

    public b(Parcel parcel, ClassLoader classLoader) {
        Parcelable parcelable = parcel.readParcelable(classLoader);
        this.f7299h = parcelable == null ? f7298i : parcelable;
    }
}
