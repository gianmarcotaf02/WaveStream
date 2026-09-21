package B3;

/* JADX INFO: renamed from: B3.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0090c extends I3.a {
    public static final android.os.Parcelable.Creator<B3.C0090c> CREATOR = new B3.e(2);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final java.lang.String f620h;

    public C0090c(java.lang.String str) {
        this.f620h = str;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof B3.C0090c) {
            return B3.AbstractC0088a.e(this.f620h, ((B3.C0090c) obj).f620h);
        }
        return false;
    }

    public final int hashCode() {
        return java.util.Arrays.hashCode(new java.lang.Object[]{this.f620h});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i3) {
        int iF0 = E6.G.f0(parcel, 20293);
        E6.G.Z(parcel, 2, this.f620h);
        E6.G.g0(parcel, iF0);
    }
}
