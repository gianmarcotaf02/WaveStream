package Y1;

import android.os.Parcel;
import android.os.Parcelable;

public final class A implements Parcelable {
    public static final Parcelable.Creator<A> CREATOR = new T3.G(20);

    public String f11150h;

    public int f11151i;

    @Override
    public final int describeContents() {
        return 0;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i3) {
        parcel.writeString(this.f11150h);
        parcel.writeInt(this.f11151i);
    }
}
