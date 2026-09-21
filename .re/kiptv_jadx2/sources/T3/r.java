package T3;

import android.os.Parcel;
import android.os.Parcelable;

public final class r implements Parcelable {

    r EF5;

    public static final r[] f9800h = {new r("PUBLIC_KEY", 0)};
    public static final Parcelable.Creator<r> CREATOR = new G(2);

    public static r a(String str) throws q {
        for (r rVar : values()) {
            rVar.getClass();
            if (str.equals("public-key")) {
                return rVar;
            }
        }
        throw new q(Y6.f.h("PublicKeyCredentialType ", str, " not supported"));
    }

    public static r valueOf(String str) {
        return (r) Enum.valueOf(r.class, str);
    }

    public static r[] values() {
        return (r[]) f9800h.clone();
    }

    @Override
    public final int describeContents() {
        return 0;
    }

    @Override
    public final String toString() {
        return "public-key";
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i3) {
        parcel.writeString("public-key");
    }
}
