package B3;

/* JADX INFO: loaded from: classes.dex */
public final class f extends I3.a {
    public static final android.os.Parcelable.Creator<B3.f> CREATOR = new B3.e(1);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public double f630h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f631i;
    public int j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public p184w3.C2969d f632k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f633l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public p184w3.w f634m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public double f635n;

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof B3.f)) {
            return false;
        }
        B3.f fVar = (B3.f) obj;
        if (this.f630h == fVar.f630h && this.f631i == fVar.f631i && this.j == fVar.j && B3.AbstractC0088a.e(this.f632k, fVar.f632k) && this.f633l == fVar.f633l) {
            p184w3.w wVar = this.f634m;
            if (B3.AbstractC0088a.e(wVar, wVar) && this.f635n == fVar.f635n) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return java.util.Arrays.hashCode(new java.lang.Object[]{java.lang.Double.valueOf(this.f630h), java.lang.Boolean.valueOf(this.f631i), java.lang.Integer.valueOf(this.j), this.f632k, java.lang.Integer.valueOf(this.f633l), this.f634m, java.lang.Double.valueOf(this.f635n)});
    }

    public final java.lang.String toString() {
        return java.lang.String.format(java.util.Locale.ROOT, "volume=%f", java.lang.Double.valueOf(this.f630h));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i3) {
        int iF0 = E6.G.f0(parcel, 20293);
        E6.G.e0(parcel, 2, 8);
        parcel.writeDouble(this.f630h);
        E6.G.e0(parcel, 3, 4);
        parcel.writeInt(this.f631i ? 1 : 0);
        E6.G.e0(parcel, 4, 4);
        parcel.writeInt(this.j);
        E6.G.Y(parcel, 5, this.f632k, i3);
        E6.G.e0(parcel, 6, 4);
        parcel.writeInt(this.f633l);
        E6.G.Y(parcel, 7, this.f634m, i3);
        E6.G.e0(parcel, 8, 8);
        parcel.writeDouble(this.f635n);
        E6.G.g0(parcel, iF0);
    }
}
