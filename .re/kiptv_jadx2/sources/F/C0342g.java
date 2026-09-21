package F;

import android.os.Parcel;
import android.os.Parcelable;

public final class C0342g implements Parcelable {
    public static final Parcelable.Creator<C0342g> CREATOR = new C0341f();

    public final int f3437h;

    public C0342g(int i3) {
        this.f3437h = i3;
    }

    @Override
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0342g) && this.f3437h == ((C0342g) obj).f3437h;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f3437h);
    }

    public final String toString() {
        return Y6.f.j(new StringBuilder("DefaultLazyKey(index="), this.f3437h, ')');
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i3) {
        parcel.writeInt(this.f3437h);
    }
}
