package T3;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

public final class o extends I3.a {
    public static final Parcelable.Creator<o> CREATOR = new G(0);

    public final r f9796h;

    public final C0918i f9797i;

    public o(String str, int i3) {
        H3.q.g(str);
        try {
            this.f9796h = r.a(str);
            try {
                this.f9797i = C0918i.a(i3);
            } catch (C0917h e6) {
                throw new IllegalArgumentException(e6);
            }
        } catch (q e9) {
            throw new IllegalArgumentException(e9);
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return this.f9796h.equals(oVar.f9796h) && this.f9797i.equals(oVar.f9797i);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f9796h, this.f9797i});
    }

    public final String toString() {
        return Y6.f.i("PublicKeyCredentialParameters{\n type=", String.valueOf(this.f9796h), ", \n algorithm=", String.valueOf(this.f9797i), "\n }");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i3) {
        int iF0 = E6.G.f0(parcel, 20293);
        this.f9796h.getClass();
        E6.G.Z(parcel, 2, "public-key");
        E6.G.W(parcel, 3, Integer.valueOf(this.f9797i.f9777h.a()));
        E6.G.g0(parcel, iF0);
    }
}
