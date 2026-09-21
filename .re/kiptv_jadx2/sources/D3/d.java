package D3;

import E6.G;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

public final class d extends I3.a {
    public static final Parcelable.Creator<d> CREATOR = new B3.e(5);

    public final String f2102h;

    public final int f2103i;
    public final long j;

    public final boolean f2104k;

    public d(String str, int i3, long j, boolean z6) {
        this.f2102h = str;
        this.f2103i = i3;
        this.j = j;
        this.f2104k = z6;
    }

    public final long a() {
        long j = this.j;
        return j == -1 ? this.f2103i : j;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof d) {
            d dVar = (d) obj;
            if (H3.q.j(this.f2102h, dVar.f2102h) && a() == dVar.a() && this.f2104k == dVar.f2104k) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f2102h, Long.valueOf(a()), Boolean.valueOf(this.f2104k)});
    }

    public final String toString() {
        S.p pVar = new S.p(16, this);
        pVar.f(this.f2102h, "name");
        pVar.f(Long.valueOf(a()), "version");
        pVar.f(Boolean.valueOf(this.f2104k), "is_fully_rolled_out");
        return pVar.toString();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i3) {
        int iF0 = G.f0(parcel, 20293);
        G.Z(parcel, 1, this.f2102h);
        G.e0(parcel, 2, 4);
        parcel.writeInt(this.f2103i);
        long jA = a();
        G.e0(parcel, 3, 8);
        parcel.writeLong(jA);
        G.e0(parcel, 4, 4);
        parcel.writeInt(this.f2104k ? 1 : 0);
        G.g0(parcel, iF0);
    }

    public d(String str, long j) {
        this(str, -1, j, false);
    }
}
