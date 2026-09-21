package android.support.v4.media.session;

import android.os.Parcel;
import android.os.Parcelable;

public final class MediaSessionCompat$Token implements Parcelable {
    public static final Parcelable.Creator<MediaSessionCompat$Token> CREATOR = new p(2);

    public final Object f15567i;
    public d j;

    public final Object f15566h = new Object();

    public C2.d f15568k = null;

    public MediaSessionCompat$Token(Object obj, l lVar) {
        this.f15567i = obj;
        this.j = lVar;
    }

    @Override
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MediaSessionCompat$Token)) {
            return false;
        }
        MediaSessionCompat$Token mediaSessionCompat$Token = (MediaSessionCompat$Token) obj;
        Object obj2 = this.f15567i;
        if (obj2 == null) {
            return mediaSessionCompat$Token.f15567i == null;
        }
        Object obj3 = mediaSessionCompat$Token.f15567i;
        if (obj3 == null) {
            return false;
        }
        return obj2.equals(obj3);
    }

    public final int hashCode() {
        Object obj = this.f15567i;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i3) {
        parcel.writeParcelable((Parcelable) this.f15567i, i3);
    }
}
