package androidx.media3.common;

/* JADX INFO: loaded from: classes.dex */
public final class TrackSelectionOverride {
    public final androidx.media3.common.TrackGroup mediaTrackGroup;
    public final p076i4.AbstractC2186b0 trackIndices;
    private static final java.lang.String FIELD_TRACK_GROUP = androidx.media3.common.util.Util.intToStringMaxRadix(0);
    private static final java.lang.String FIELD_TRACKS = androidx.media3.common.util.Util.intToStringMaxRadix(1);

    public TrackSelectionOverride(androidx.media3.common.TrackGroup trackGroup, int i3) {
        this(trackGroup, p076i4.AbstractC2186b0.y(java.lang.Integer.valueOf(i3)));
    }

    public static androidx.media3.common.TrackSelectionOverride fromBundle(android.os.Bundle bundle) {
        android.os.Bundle bundle2 = bundle.getBundle(FIELD_TRACK_GROUP);
        bundle2.getClass();
        androidx.media3.common.TrackGroup trackGroupFromBundle = androidx.media3.common.TrackGroup.fromBundle(bundle2);
        int[] intArray = bundle.getIntArray(FIELD_TRACKS);
        intArray.getClass();
        return new androidx.media3.common.TrackSelectionOverride(trackGroupFromBundle, (java.util.List<java.lang.Integer>) com.google.crypto.tink.shaded.protobuf.q0.f(intArray));
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && androidx.media3.common.TrackSelectionOverride.class == obj.getClass()) {
            androidx.media3.common.TrackSelectionOverride trackSelectionOverride = (androidx.media3.common.TrackSelectionOverride) obj;
            if (this.mediaTrackGroup.equals(trackSelectionOverride.mediaTrackGroup) && this.trackIndices.equals(trackSelectionOverride.trackIndices)) {
                return true;
            }
        }
        return false;
    }

    public int getType() {
        return this.mediaTrackGroup.type;
    }

    public int hashCode() {
        return (this.trackIndices.hashCode() * 31) + this.mediaTrackGroup.hashCode();
    }

    public android.os.Bundle toBundle() {
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putBundle(FIELD_TRACK_GROUP, this.mediaTrackGroup.toBundle());
        bundle.putIntArray(FIELD_TRACKS, com.google.crypto.tink.shaded.protobuf.q0.H(this.trackIndices));
        return bundle;
    }

    public TrackSelectionOverride(androidx.media3.common.TrackGroup trackGroup, java.util.List<java.lang.Integer> list) {
        if (!list.isEmpty() && (((java.lang.Integer) java.util.Collections.min(list)).intValue() < 0 || ((java.lang.Integer) java.util.Collections.max(list)).intValue() >= trackGroup.length)) {
            throw new java.lang.IndexOutOfBoundsException();
        }
        this.mediaTrackGroup = trackGroup;
        this.trackIndices = p076i4.AbstractC2186b0.u(list);
    }
}
