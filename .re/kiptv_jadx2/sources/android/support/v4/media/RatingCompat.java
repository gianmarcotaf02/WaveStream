package android.support.v4.media;

import T3.G;
import android.os.Parcel;
import android.os.Parcelable;

public final class RatingCompat implements Parcelable {
    public static final Parcelable.Creator<RatingCompat> CREATOR = new G(26);

    public final int f15560h;

    public final float f15561i;

    public RatingCompat(int i3, float f9) {
        this.f15560h = i3;
        this.f15561i = f9;
    }

    @Override
    public final int describeContents() {
        return this.f15560h;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Rating:style=");
        sb.append(this.f15560h);
        sb.append(" rating=");
        float f9 = this.f15561i;
        sb.append(f9 < 0.0f ? "unrated" : String.valueOf(f9));
        return sb.toString();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i3) {
        parcel.writeInt(this.f15560h);
        parcel.writeFloat(this.f15561i);
    }
}
