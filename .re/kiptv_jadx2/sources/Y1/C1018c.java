package Y1;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

public final class C1018c implements Parcelable {
    public static final Parcelable.Creator<C1018c> CREATOR = new T3.G(19);

    public final ArrayList f11259h;

    public final ArrayList f11260i;

    public C1018c(Parcel parcel) {
        this.f11259h = parcel.createStringArrayList();
        this.f11260i = parcel.createTypedArrayList(C1017b.CREATOR);
    }

    @Override
    public final int describeContents() {
        return 0;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i3) {
        parcel.writeStringList(this.f11259h);
        parcel.writeTypedList(this.f11260i);
    }
}
