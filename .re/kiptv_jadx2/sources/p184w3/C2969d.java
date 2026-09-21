package p184w3;

import B3.AbstractC0088a;
import E6.G;
import I3.a;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public final class C2969d extends a {
    public static final Parcelable.Creator<C2969d> CREATOR = new D(11);

    public final String f29839h;

    public final String f29840i;
    public final ArrayList j;

    public final String f29841k;

    public final Uri f29842l;

    public final String f29843m;

    public final String f29844n;

    public final Boolean f29845o;

    public final Boolean f29846p;

    public C2969d(String str, String str2, ArrayList arrayList, String str3, Uri uri, String str4, String str5, Boolean bool, Boolean bool2) {
        this.f29839h = str;
        this.f29840i = str2;
        this.j = arrayList;
        this.f29841k = str3;
        this.f29842l = uri;
        this.f29843m = str4;
        this.f29844n = str5;
        this.f29845o = bool;
        this.f29846p = bool2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2969d)) {
            return false;
        }
        C2969d c2969d = (C2969d) obj;
        return AbstractC0088a.e(this.f29839h, c2969d.f29839h) && AbstractC0088a.e(this.f29840i, c2969d.f29840i) && AbstractC0088a.e(this.j, c2969d.j) && AbstractC0088a.e(this.f29841k, c2969d.f29841k) && AbstractC0088a.e(this.f29842l, c2969d.f29842l) && AbstractC0088a.e(this.f29843m, c2969d.f29843m) && AbstractC0088a.e(this.f29844n, c2969d.f29844n);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f29839h, this.f29840i, this.j, this.f29841k, this.f29842l, this.f29843m});
    }

    public final String toString() {
        ArrayList arrayList = this.j;
        int size = arrayList == null ? 0 : arrayList.size();
        String strValueOf = String.valueOf(this.f29842l);
        StringBuilder sb = new StringBuilder("applicationId: ");
        sb.append(this.f29839h);
        sb.append(", name: ");
        sb.append(this.f29840i);
        sb.append(", namespaces.count: ");
        sb.append(size);
        sb.append(", senderAppIdentifier: ");
        B2.a.x(sb, this.f29841k, ", senderAppLaunchUrl: ", strValueOf, ", iconUrl: ");
        sb.append(this.f29843m);
        sb.append(", type: ");
        sb.append(this.f29844n);
        return sb.toString();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i3) {
        int iF0 = G.f0(parcel, 20293);
        G.Z(parcel, 2, this.f29839h);
        G.Z(parcel, 3, this.f29840i);
        G.a0(parcel, Collections.unmodifiableList(this.j), 5);
        G.Z(parcel, 6, this.f29841k);
        G.Y(parcel, 7, this.f29842l, i3);
        G.Z(parcel, 8, this.f29843m);
        G.Z(parcel, 9, this.f29844n);
        G.R(parcel, 10, this.f29845o);
        G.R(parcel, 11, this.f29846p);
        G.g0(parcel, iF0);
    }
}
