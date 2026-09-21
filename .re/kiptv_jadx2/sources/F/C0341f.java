package F;

import android.os.Parcel;
import android.os.Parcelable;

public final class C0341f implements Parcelable.Creator {
    @Override
    public final Object createFromParcel(Parcel parcel) {
        return new C0342g(parcel.readInt());
    }

    @Override
    public final Object[] newArray(int i3) {
        return new C0342g[i3];
    }
}
