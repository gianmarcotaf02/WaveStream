package android.support.v4.media.session;

import android.media.session.PlaybackState;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;

public final class PlaybackStateCompat implements Parcelable {
    public static final Parcelable.Creator<PlaybackStateCompat> CREATOR = new p(4);

    public final int f15573h;

    public final long f15574i;
    public final long j;

    public final float f15575k;

    public final long f15576l;

    public final int f15577m;

    public final CharSequence f15578n;

    public final long f15579o;

    public final ArrayList f15580p;

    public final long f15581q;

    public final Bundle f15582r;

    public PlaybackState f15583s;

    public PlaybackStateCompat(int i3, long j, long j9, float f9, long j10, int i9, CharSequence charSequence, long j11, ArrayList arrayList, long j12, Bundle bundle) {
        this.f15573h = i3;
        this.f15574i = j;
        this.j = j9;
        this.f15575k = f9;
        this.f15576l = j10;
        this.f15577m = i9;
        this.f15578n = charSequence;
        this.f15579o = j11;
        this.f15580p = new ArrayList(arrayList);
        this.f15581q = j12;
        this.f15582r = bundle;
    }

    @Override
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PlaybackState {state=");
        sb.append(this.f15573h);
        sb.append(", position=");
        sb.append(this.f15574i);
        sb.append(", buffered position=");
        sb.append(this.j);
        sb.append(", speed=");
        sb.append(this.f15575k);
        sb.append(", updated=");
        sb.append(this.f15579o);
        sb.append(", actions=");
        sb.append(this.f15576l);
        sb.append(", error code=");
        sb.append(this.f15577m);
        sb.append(", error message=");
        sb.append(this.f15578n);
        sb.append(", custom actions=");
        sb.append(this.f15580p);
        sb.append(", active item id=");
        return Y6.f.g(this.f15581q, "}", sb);
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i3) {
        parcel.writeInt(this.f15573h);
        parcel.writeLong(this.f15574i);
        parcel.writeFloat(this.f15575k);
        parcel.writeLong(this.f15579o);
        parcel.writeLong(this.j);
        parcel.writeLong(this.f15576l);
        TextUtils.writeToParcel(this.f15578n, parcel, i3);
        parcel.writeTypedList(this.f15580p);
        parcel.writeLong(this.f15581q);
        parcel.writeBundle(this.f15582r);
        parcel.writeInt(this.f15577m);
    }

    public static final class CustomAction implements Parcelable {
        public static final Parcelable.Creator<CustomAction> CREATOR = new u();

        public final String f15584h;

        public final CharSequence f15585i;
        public final int j;

        public final Bundle f15586k;

        public CustomAction(String str, CharSequence charSequence, int i3) {
            this.f15584h = str;
            this.f15585i = charSequence;
            this.j = i3;
            this.f15586k = null;
        }

        @Override
        public final int describeContents() {
            return 0;
        }

        public final String toString() {
            return "Action:mName='" + ((Object) this.f15585i) + ", mIcon=" + this.j + ", mExtras=" + this.f15586k;
        }

        @Override
        public final void writeToParcel(Parcel parcel, int i3) {
            parcel.writeString(this.f15584h);
            TextUtils.writeToParcel(this.f15585i, parcel, i3);
            parcel.writeInt(this.j);
            parcel.writeBundle(this.f15586k);
        }

        public CustomAction(Parcel parcel) {
            this.f15584h = parcel.readString();
            this.f15585i = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.j = parcel.readInt();
            this.f15586k = parcel.readBundle(q.class.getClassLoader());
        }
    }

    public PlaybackStateCompat(Parcel parcel) {
        this.f15573h = parcel.readInt();
        this.f15574i = parcel.readLong();
        this.f15575k = parcel.readFloat();
        this.f15579o = parcel.readLong();
        this.j = parcel.readLong();
        this.f15576l = parcel.readLong();
        this.f15578n = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f15580p = parcel.createTypedArrayList(CustomAction.CREATOR);
        this.f15581q = parcel.readLong();
        this.f15582r = parcel.readBundle(q.class.getClassLoader());
        this.f15577m = parcel.readInt();
    }
}
