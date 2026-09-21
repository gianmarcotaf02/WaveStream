package androidx.media3.common;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.common.util.Util;

public final class StreamKey implements Comparable<StreamKey>, Parcelable {
    public final int groupIndex;
    public final int periodIndex;
    public final int streamIndex;
    public static final Parcelable.Creator<StreamKey> CREATOR = new Parcelable.Creator<StreamKey>() {
        @Override
        public StreamKey createFromParcel(Parcel parcel) {
            return new StreamKey(parcel);
        }

        @Override
        public StreamKey[] newArray(int i3) {
            return new StreamKey[i3];
        }
    };
    private static final String FIELD_PERIOD_INDEX = Util.intToStringMaxRadix(0);
    private static final String FIELD_GROUP_INDEX = Util.intToStringMaxRadix(1);
    private static final String FIELD_STREAM_INDEX = Util.intToStringMaxRadix(2);

    public StreamKey(int i3, int i9) {
        this(0, i3, i9);
    }

    public static StreamKey fromBundle(Bundle bundle) {
        return new StreamKey(bundle.getInt(FIELD_PERIOD_INDEX, 0), bundle.getInt(FIELD_GROUP_INDEX, 0), bundle.getInt(FIELD_STREAM_INDEX, 0));
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && StreamKey.class == obj.getClass()) {
            StreamKey streamKey = (StreamKey) obj;
            if (this.periodIndex == streamKey.periodIndex && this.groupIndex == streamKey.groupIndex && this.streamIndex == streamKey.streamIndex) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return (((this.periodIndex * 31) + this.groupIndex) * 31) + this.streamIndex;
    }

    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        int i3 = this.periodIndex;
        if (i3 != 0) {
            bundle.putInt(FIELD_PERIOD_INDEX, i3);
        }
        int i9 = this.groupIndex;
        if (i9 != 0) {
            bundle.putInt(FIELD_GROUP_INDEX, i9);
        }
        int i10 = this.streamIndex;
        if (i10 != 0) {
            bundle.putInt(FIELD_STREAM_INDEX, i10);
        }
        return bundle;
    }

    public String toString() {
        return this.periodIndex + "." + this.groupIndex + "." + this.streamIndex;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i3) {
        parcel.writeInt(this.periodIndex);
        parcel.writeInt(this.groupIndex);
        parcel.writeInt(this.streamIndex);
    }

    public StreamKey(int i3, int i9, int i10) {
        this.periodIndex = i3;
        this.groupIndex = i9;
        this.streamIndex = i10;
    }

    @Override
    public int compareTo(StreamKey streamKey) {
        int i3 = this.periodIndex - streamKey.periodIndex;
        if (i3 != 0) {
            return i3;
        }
        int i9 = this.groupIndex - streamKey.groupIndex;
        return i9 == 0 ? this.streamIndex - streamKey.streamIndex : i9;
    }

    public StreamKey(Parcel parcel) {
        this.periodIndex = parcel.readInt();
        this.groupIndex = parcel.readInt();
        this.streamIndex = parcel.readInt();
    }
}
