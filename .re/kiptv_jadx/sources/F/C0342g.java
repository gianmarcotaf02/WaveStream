package F;

/* JADX INFO: renamed from: F.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0342g implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<F.C0342g> CREATOR = new F.C0341f();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f3437h;

    public C0342g(int i3) {
        this.f3437h = i3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof F.C0342g) && this.f3437h == ((F.C0342g) obj).f3437h;
    }

    public final int hashCode() {
        return java.lang.Integer.hashCode(this.f3437h);
    }

    public final java.lang.String toString() {
        return Y6.f.j(new java.lang.StringBuilder("DefaultLazyKey(index="), this.f3437h, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i3) {
        parcel.writeInt(this.f3437h);
    }
}
