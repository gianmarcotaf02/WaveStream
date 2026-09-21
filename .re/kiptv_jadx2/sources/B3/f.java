package B3;

import E6.G;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Locale;
import p184w3.C2969d;

public final class f extends I3.a {
    public static final Parcelable.Creator<f> CREATOR = new e(1);

    public double f630h;

    public boolean f631i;
    public int j;

    public C2969d f632k;

    public int f633l;

    public p184w3.w f634m;

    public double f635n;

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        if (this.f630h == fVar.f630h && this.f631i == fVar.f631i && this.j == fVar.j && AbstractC0088a.e(this.f632k, fVar.f632k) && this.f633l == fVar.f633l) {
            p184w3.w wVar = this.f634m;
            if (AbstractC0088a.e(wVar, wVar) && this.f635n == fVar.f635n) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Double.valueOf(this.f630h), Boolean.valueOf(this.f631i), Integer.valueOf(this.j), this.f632k, Integer.valueOf(this.f633l), this.f634m, Double.valueOf(this.f635n)});
    }

    public final String toString() {
        return String.format(Locale.ROOT, "volume=%f", Double.valueOf(this.f630h));
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i3) {
        int iF0 = G.f0(parcel, 20293);
        G.e0(parcel, 2, 8);
        parcel.writeDouble(this.f630h);
        G.e0(parcel, 3, 4);
        parcel.writeInt(this.f631i ? 1 : 0);
        G.e0(parcel, 4, 4);
        parcel.writeInt(this.j);
        G.Y(parcel, 5, this.f632k, i3);
        G.e0(parcel, 6, 4);
        parcel.writeInt(this.f633l);
        G.Y(parcel, 7, this.f634m, i3);
        G.e0(parcel, 8, 8);
        parcel.writeDouble(this.f635n);
        G.g0(parcel, iF0);
    }
}
