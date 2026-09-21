package B3;

import E6.G;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

public final class C0090c extends I3.a {
    public static final Parcelable.Creator<C0090c> CREATOR = new e(2);

    public final String f620h;

    public C0090c(String str) {
        this.f620h = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C0090c) {
            return AbstractC0088a.e(this.f620h, ((C0090c) obj).f620h);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f620h});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i3) {
        int iF0 = G.f0(parcel, 20293);
        G.Z(parcel, 2, this.f620h);
        G.g0(parcel, iF0);
    }
}
