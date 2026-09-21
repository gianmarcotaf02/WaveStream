package androidx.media3.common;

/* JADX INFO: loaded from: classes.dex */
public final class StreamKey implements java.lang.Comparable<androidx.media3.common.StreamKey>, android.os.Parcelable {
    public final int groupIndex;
    public final int periodIndex;
    public final int streamIndex;
    public static final android.os.Parcelable.Creator<androidx.media3.common.StreamKey> CREATOR = new android.os.Parcelable.Creator<androidx.media3.common.StreamKey>() { // from class: androidx.media3.common.StreamKey.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public androidx.media3.common.StreamKey createFromParcel(android.os.Parcel parcel) {
            return new androidx.media3.common.StreamKey(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public androidx.media3.common.StreamKey[] newArray(int i3) {
            return new androidx.media3.common.StreamKey[i3];
        }
    };
    private static final java.lang.String FIELD_PERIOD_INDEX = androidx.media3.common.util.Util.intToStringMaxRadix(0);
    private static final java.lang.String FIELD_GROUP_INDEX = androidx.media3.common.util.Util.intToStringMaxRadix(1);
    private static final java.lang.String FIELD_STREAM_INDEX = androidx.media3.common.util.Util.intToStringMaxRadix(2);

    public StreamKey(int i3, int i9) {
        this(0, i3, i9);
    }

    public static androidx.media3.common.StreamKey fromBundle(android.os.Bundle bundle) {
        return new androidx.media3.common.StreamKey(bundle.getInt(FIELD_PERIOD_INDEX, 0), bundle.getInt(FIELD_GROUP_INDEX, 0), bundle.getInt(FIELD_STREAM_INDEX, 0));
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && androidx.media3.common.StreamKey.class == obj.getClass()) {
            androidx.media3.common.StreamKey streamKey = (androidx.media3.common.StreamKey) obj;
            if (this.periodIndex == streamKey.periodIndex && this.groupIndex == streamKey.groupIndex && this.streamIndex == streamKey.streamIndex) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return (((this.periodIndex * 31) + this.groupIndex) * 31) + this.streamIndex;
    }

    public android.os.Bundle toBundle() {
        android.os.Bundle bundle = new android.os.Bundle();
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

    public java.lang.String toString() {
        return this.periodIndex + "." + this.groupIndex + "." + this.streamIndex;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i3) {
        parcel.writeInt(this.periodIndex);
        parcel.writeInt(this.groupIndex);
        parcel.writeInt(this.streamIndex);
    }

    public StreamKey(int i3, int i9, int i10) {
        this.periodIndex = i3;
        this.groupIndex = i9;
        this.streamIndex = i10;
    }

    @Override // java.lang.Comparable
    public int compareTo(androidx.media3.common.StreamKey streamKey) {
        int i3 = this.periodIndex - streamKey.periodIndex;
        if (i3 != 0) {
            return i3;
        }
        int i9 = this.groupIndex - streamKey.groupIndex;
        return i9 == 0 ? this.streamIndex - streamKey.streamIndex : i9;
    }

    public StreamKey(android.os.Parcel parcel) {
        this.periodIndex = parcel.readInt();
        this.groupIndex = parcel.readInt();
        this.streamIndex = parcel.readInt();
    }
}
