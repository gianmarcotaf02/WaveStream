package T3;

import android.os.Parcel;
import android.os.Parcelable;

public enum v implements Parcelable {
    RESIDENT_KEY_DISCOURAGED("discouraged"),
    RESIDENT_KEY_PREFERRED("preferred"),
    RESIDENT_KEY_REQUIRED("required");

    public static final Parcelable.Creator<v> CREATOR = new G(4);

    public final String f9807h;

    v(String str) {
        this.f9807h = str;
    }

    public static v a(String str) {
        for (v vVar : values()) {
            if (str.equals(vVar.f9807h)) {
                return vVar;
            }
        }
        throw new u(Y6.f.h("Resident key requirement ", str, " not supported"));
    }

    @Override
    public final int describeContents() {
        return 0;
    }

    @Override
    public final String toString() {
        return this.f9807h;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i3) {
        parcel.writeString(this.f9807h);
    }
}
