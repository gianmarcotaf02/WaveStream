package androidx.versionedparcelable;

import B3.e;
import C2.c;
import C2.d;
import android.os.Parcel;
import android.os.Parcelable;

public class ParcelImpl implements Parcelable {
    public static final Parcelable.Creator<ParcelImpl> CREATOR = new e(3);

    public final d f17525h;

    public ParcelImpl(d dVar) {
        this.f17525h = dVar;
    }

    @Override
    public final int describeContents() {
        return 0;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i3) {
        new c(parcel).l(this.f17525h);
    }

    public ParcelImpl(Parcel parcel) {
        this.f17525h = new c(parcel).h();
    }
}
