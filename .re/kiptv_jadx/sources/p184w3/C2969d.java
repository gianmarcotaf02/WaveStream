package p184w3;

/* JADX INFO: renamed from: w3.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2969d extends I3.a {
    public static final android.os.Parcelable.Creator<p184w3.C2969d> CREATOR = new p184w3.D(11);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final java.lang.String f29839h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final java.lang.String f29840i;
    public final java.util.ArrayList j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final java.lang.String f29841k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final android.net.Uri f29842l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final java.lang.String f29843m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final java.lang.String f29844n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final java.lang.Boolean f29845o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final java.lang.Boolean f29846p;

    public C2969d(java.lang.String str, java.lang.String str2, java.util.ArrayList arrayList, java.lang.String str3, android.net.Uri uri, java.lang.String str4, java.lang.String str5, java.lang.Boolean bool, java.lang.Boolean bool2) {
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

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof p184w3.C2969d)) {
            return false;
        }
        p184w3.C2969d c2969d = (p184w3.C2969d) obj;
        return B3.AbstractC0088a.e(this.f29839h, c2969d.f29839h) && B3.AbstractC0088a.e(this.f29840i, c2969d.f29840i) && B3.AbstractC0088a.e(this.j, c2969d.j) && B3.AbstractC0088a.e(this.f29841k, c2969d.f29841k) && B3.AbstractC0088a.e(this.f29842l, c2969d.f29842l) && B3.AbstractC0088a.e(this.f29843m, c2969d.f29843m) && B3.AbstractC0088a.e(this.f29844n, c2969d.f29844n);
    }

    public final int hashCode() {
        return java.util.Arrays.hashCode(new java.lang.Object[]{this.f29839h, this.f29840i, this.j, this.f29841k, this.f29842l, this.f29843m});
    }

    public final java.lang.String toString() {
        java.util.ArrayList arrayList = this.j;
        int size = arrayList == null ? 0 : arrayList.size();
        java.lang.String strValueOf = java.lang.String.valueOf(this.f29842l);
        java.lang.StringBuilder sb = new java.lang.StringBuilder("applicationId: ");
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

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i3) {
        int iF0 = E6.G.f0(parcel, 20293);
        E6.G.Z(parcel, 2, this.f29839h);
        E6.G.Z(parcel, 3, this.f29840i);
        E6.G.a0(parcel, java.util.Collections.unmodifiableList(this.j), 5);
        E6.G.Z(parcel, 6, this.f29841k);
        E6.G.Y(parcel, 7, this.f29842l, i3);
        E6.G.Z(parcel, 8, this.f29843m);
        E6.G.Z(parcel, 9, this.f29844n);
        E6.G.R(parcel, 10, this.f29845o);
        E6.G.R(parcel, 11, this.f29846p);
        E6.G.g0(parcel, iF0);
    }
}
