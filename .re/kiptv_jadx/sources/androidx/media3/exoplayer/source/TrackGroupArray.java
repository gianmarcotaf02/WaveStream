package androidx.media3.exoplayer.source;

/* JADX INFO: loaded from: classes.dex */
public final class TrackGroupArray {
    public static final androidx.media3.exoplayer.source.TrackGroupArray EMPTY = new androidx.media3.exoplayer.source.TrackGroupArray(new androidx.media3.common.TrackGroup[0]);
    private static final java.lang.String FIELD_TRACK_GROUPS = androidx.media3.common.util.Util.intToStringMaxRadix(0);
    private static final java.lang.String TAG = "TrackGroupArray";
    private int hashCode;
    public final int length;
    private final p076i4.AbstractC2186b0 trackGroups;

    public TrackGroupArray(androidx.media3.common.TrackGroup... trackGroupArr) {
        this.trackGroups = p076i4.AbstractC2186b0.v(trackGroupArr);
        this.length = trackGroupArr.length;
        verifyCorrectness();
    }

    public static androidx.media3.exoplayer.source.TrackGroupArray fromBundle(android.os.Bundle bundle) {
        java.util.ArrayList parcelableArrayList = bundle.getParcelableArrayList(FIELD_TRACK_GROUPS);
        return parcelableArrayList == null ? new androidx.media3.exoplayer.source.TrackGroupArray(new androidx.media3.common.TrackGroup[0]) : new androidx.media3.exoplayer.source.TrackGroupArray((androidx.media3.common.TrackGroup[]) androidx.media3.common.util.BundleCollectionUtil.fromBundleList(new androidx.media3.exoplayer.source.i(4), parcelableArrayList).toArray(new androidx.media3.common.TrackGroup[0]));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ java.lang.Integer lambda$getTrackTypes$0(androidx.media3.common.TrackGroup trackGroup) {
        return java.lang.Integer.valueOf(trackGroup.type);
    }

    private void verifyCorrectness() {
        int i3 = 0;
        while (i3 < this.trackGroups.size()) {
            int i9 = i3 + 1;
            for (int i10 = i9; i10 < this.trackGroups.size(); i10++) {
                if (((androidx.media3.common.TrackGroup) this.trackGroups.get(i3)).equals(this.trackGroups.get(i10))) {
                    androidx.media3.common.util.Log.e(TAG, "", new java.lang.IllegalArgumentException("Multiple identical TrackGroups added to one TrackGroupArray."));
                }
            }
            i3 = i9;
        }
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && androidx.media3.exoplayer.source.TrackGroupArray.class == obj.getClass()) {
            androidx.media3.exoplayer.source.TrackGroupArray trackGroupArray = (androidx.media3.exoplayer.source.TrackGroupArray) obj;
            if (this.length == trackGroupArray.length && this.trackGroups.equals(trackGroupArray.trackGroups)) {
                return true;
            }
        }
        return false;
    }

    public androidx.media3.common.TrackGroup get(int i3) {
        return (androidx.media3.common.TrackGroup) this.trackGroups.get(i3);
    }

    public p076i4.AbstractC2186b0 getTrackTypes() {
        return p076i4.AbstractC2186b0.u(p076i4.AbstractC2230y.A(this.trackGroups, new androidx.media3.exoplayer.source.i(2)));
    }

    public int hashCode() {
        if (this.hashCode == 0) {
            this.hashCode = this.trackGroups.hashCode();
        }
        return this.hashCode;
    }

    public int indexOf(androidx.media3.common.TrackGroup trackGroup) {
        int iIndexOf = this.trackGroups.indexOf(trackGroup);
        if (iIndexOf >= 0) {
            return iIndexOf;
        }
        return -1;
    }

    public boolean isEmpty() {
        return this.length == 0;
    }

    public android.os.Bundle toBundle() {
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putParcelableArrayList(FIELD_TRACK_GROUPS, androidx.media3.common.util.BundleCollectionUtil.toBundleArrayList(this.trackGroups, new androidx.media3.exoplayer.source.i(3)));
        return bundle;
    }

    public java.lang.String toString() {
        return this.trackGroups.toString();
    }
}
