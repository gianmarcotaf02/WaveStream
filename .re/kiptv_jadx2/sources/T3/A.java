package T3;

import android.os.Parcel;
import android.os.Parcelable;

public enum A implements Parcelable {
    USER_VERIFICATION_REQUIRED("required"),
    USER_VERIFICATION_PREFERRED("preferred"),
    USER_VERIFICATION_DISCOURAGED("discouraged");

    public static final Parcelable.Creator<A> CREATOR = new G(10);

    public final String f9743h;

    A(String str) {
        this.f9743h = str;
    }

    public static A a(String str) throws I {
        for (A a2 : values()) {
            if (str.equals(a2.f9743h)) {
                return a2;
            }
        }
        throw new I(Y6.f.h("User verification requirement ", str, " not supported"));
    }

    @Override
    public final int describeContents() {
        return 0;
    }

    @Override
    public final String toString() {
        return this.f9743h;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i3) {
        parcel.writeString(this.f9743h);
    }
}
