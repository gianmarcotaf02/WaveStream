package T3;

import android.os.Parcel;
import android.os.Parcelable;

public enum EnumC0912c implements Parcelable {
    PLATFORM("platform"),
    CROSS_PLATFORM("cross-platform");

    public static final Parcelable.Creator<EnumC0912c> CREATOR = new B3.e(20);

    public final String f9760h;

    EnumC0912c(String str) {
        this.f9760h = str;
    }

    public static EnumC0912c a(String str) {
        for (EnumC0912c enumC0912c : values()) {
            if (str.equals(enumC0912c.f9760h)) {
                return enumC0912c;
            }
        }
        throw new C0911b(Y6.f.h("Attachment ", str, " not supported"));
    }

    @Override
    public final int describeContents() {
        return 0;
    }

    @Override
    public final String toString() {
        return this.f9760h;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i3) {
        parcel.writeString(this.f9760h);
    }
}
