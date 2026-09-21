package T3;

import android.os.Parcel;
import android.os.Parcelable;

public enum EnumC0914e implements Parcelable {
    NONE("none"),
    INDIRECT("indirect"),
    DIRECT("direct");

    public static final Parcelable.Creator<EnumC0914e> CREATOR = new G(8);

    public final String f9762h;

    EnumC0914e(String str) {
        this.f9762h = str;
    }

    public static EnumC0914e a(String str) throws C0913d {
        for (EnumC0914e enumC0914e : values()) {
            if (str.equals(enumC0914e.f9762h)) {
                return enumC0914e;
            }
        }
        throw new C0913d(Y6.f.h("Attestation conveyance preference ", str, " not supported"));
    }

    @Override
    public final int describeContents() {
        return 0;
    }

    @Override
    public final String toString() {
        return this.f9762h;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i3) {
        parcel.writeString(this.f9762h);
    }
}
