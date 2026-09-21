package D3;

/* JADX INFO: loaded from: classes.dex */
public final class d extends I3.a {
    public static final android.os.Parcelable.Creator<D3.d> CREATOR = new B3.e(5);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final java.lang.String f2102h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f2103i;
    public final long j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final boolean f2104k;

    public d(java.lang.String str, int i3, long j, boolean z6) {
        this.f2102h = str;
        this.f2103i = i3;
        this.j = j;
        this.f2104k = z6;
    }

    public final long a() {
        long j = this.j;
        return j == -1 ? this.f2103i : j;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj instanceof D3.d) {
            D3.d dVar = (D3.d) obj;
            if (H3.q.j(this.f2102h, dVar.f2102h) && a() == dVar.a() && this.f2104k == dVar.f2104k) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return java.util.Arrays.hashCode(new java.lang.Object[]{this.f2102h, java.lang.Long.valueOf(a()), java.lang.Boolean.valueOf(this.f2104k)});
    }

    public final java.lang.String toString() {
        S.p pVar = new S.p(16, this);
        pVar.f(this.f2102h, "name");
        pVar.f(java.lang.Long.valueOf(a()), "version");
        pVar.f(java.lang.Boolean.valueOf(this.f2104k), "is_fully_rolled_out");
        return pVar.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i3) {
        int iF0 = E6.G.f0(parcel, 20293);
        E6.G.Z(parcel, 1, this.f2102h);
        E6.G.e0(parcel, 2, 4);
        parcel.writeInt(this.f2103i);
        long jA = a();
        E6.G.e0(parcel, 3, 8);
        parcel.writeLong(jA);
        E6.G.e0(parcel, 4, 4);
        parcel.writeInt(this.f2104k ? 1 : 0);
        E6.G.g0(parcel, iF0);
    }

    public d(java.lang.String str, long j) {
        this(str, -1, j, false);
    }
}
