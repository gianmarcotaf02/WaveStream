package T3;

import android.os.Parcel;
import android.os.Parcelable;

public enum w implements Parcelable {
    PRESENT("present"),
    SUPPORTED("supported"),
    NOT_SUPPORTED("not-supported");

    public static final Parcelable.Creator<w> CREATOR = new G(6);

    public final String f9809h;

    w(String str) {
        this.f9809h = str;
    }

    public static w a(String str) throws x {
        for (w wVar : values()) {
            if (str.equals(wVar.f9809h)) {
                return wVar;
            }
        }
        throw new x(Y6.f.h("TokenBindingStatus ", str, " not supported"));
    }

    @Override
    public final int describeContents() {
        return 0;
    }

    @Override
    public final String toString() {
        return this.f9809h;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i3) {
        parcel.writeString(this.f9809h);
    }
}
