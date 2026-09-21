package android.support.v4.media;

/* JADX INFO: loaded from: classes.dex */
public final class RatingCompat implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.support.v4.media.RatingCompat> CREATOR = new T3.G(26);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f15560h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final float f15561i;

    public RatingCompat(int i3, float f9) {
        this.f15560h = i3;
        this.f15561i = f9;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return this.f15560h;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Rating:style=");
        sb.append(this.f15560h);
        sb.append(" rating=");
        float f9 = this.f15561i;
        sb.append(f9 < 0.0f ? "unrated" : java.lang.String.valueOf(f9));
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i3) {
        parcel.writeInt(this.f15560h);
        parcel.writeFloat(this.f15561i);
    }
}
