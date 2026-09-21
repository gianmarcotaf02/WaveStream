package androidx.media3.common;

/* JADX INFO: loaded from: classes.dex */
public final class Tracks {
    public static final androidx.media3.common.Tracks EMPTY;
    private static final java.lang.String FIELD_TRACK_GROUPS;
    private final p076i4.AbstractC2186b0 groups;

    public static final class Group {
        private final boolean adaptiveSupported;
        public final int length;
        private final androidx.media3.common.TrackGroup mediaTrackGroup;
        private final boolean[] trackSelected;
        private final int[] trackSupport;
        private static final java.lang.String FIELD_TRACK_GROUP = androidx.media3.common.util.Util.intToStringMaxRadix(0);
        private static final java.lang.String FIELD_TRACK_SUPPORT = androidx.media3.common.util.Util.intToStringMaxRadix(1);
        private static final java.lang.String FIELD_TRACK_SELECTED = androidx.media3.common.util.Util.intToStringMaxRadix(3);
        private static final java.lang.String FIELD_ADAPTIVE_SUPPORTED = androidx.media3.common.util.Util.intToStringMaxRadix(4);

        public Group(androidx.media3.common.TrackGroup trackGroup, boolean z6, int[] iArr, boolean[] zArr) {
            int i3 = trackGroup.length;
            this.length = i3;
            boolean z9 = false;
            com.google.android.gms.internal.play_billing.AbstractC1864o0.L(i3 == iArr.length && i3 == zArr.length);
            this.mediaTrackGroup = trackGroup;
            if (z6 && i3 > 1) {
                z9 = true;
            }
            this.adaptiveSupported = z9;
            this.trackSupport = (int[]) iArr.clone();
            this.trackSelected = (boolean[]) zArr.clone();
        }

        public static androidx.media3.common.Tracks.Group fromBundle(android.os.Bundle bundle) {
            android.os.Bundle bundle2 = bundle.getBundle(FIELD_TRACK_GROUP);
            bundle2.getClass();
            androidx.media3.common.TrackGroup trackGroupFromBundle = androidx.media3.common.TrackGroup.fromBundle(bundle2);
            return new androidx.media3.common.Tracks.Group(trackGroupFromBundle, bundle.getBoolean(FIELD_ADAPTIVE_SUPPORTED, false), (int[]) com.google.crypto.tink.shaded.protobuf.AbstractC1911f.t(bundle.getIntArray(FIELD_TRACK_SUPPORT), new int[trackGroupFromBundle.length]), (boolean[]) com.google.crypto.tink.shaded.protobuf.AbstractC1911f.t(bundle.getBooleanArray(FIELD_TRACK_SELECTED), new boolean[trackGroupFromBundle.length]));
        }

        public androidx.media3.common.Tracks.Group copyWithId(java.lang.String str) {
            return new androidx.media3.common.Tracks.Group(this.mediaTrackGroup.copyWithId(str), this.adaptiveSupported, this.trackSupport, this.trackSelected);
        }

        public androidx.media3.common.Tracks.Group copyWithMediaTrackGroup(androidx.media3.common.TrackGroup trackGroup) {
            return new androidx.media3.common.Tracks.Group(trackGroup, this.adaptiveSupported, this.trackSupport, this.trackSelected);
        }

        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && androidx.media3.common.Tracks.Group.class == obj.getClass()) {
                androidx.media3.common.Tracks.Group group = (androidx.media3.common.Tracks.Group) obj;
                if (this.adaptiveSupported == group.adaptiveSupported && this.mediaTrackGroup.equals(group.mediaTrackGroup) && java.util.Arrays.equals(this.trackSupport, group.trackSupport) && java.util.Arrays.equals(this.trackSelected, group.trackSelected)) {
                    return true;
                }
            }
            return false;
        }

        public androidx.media3.common.TrackGroup getMediaTrackGroup() {
            return this.mediaTrackGroup;
        }

        public androidx.media3.common.Format getTrackFormat(int i3) {
            return this.mediaTrackGroup.getFormat(i3);
        }

        public int getTrackSupport(int i3) {
            return this.trackSupport[i3];
        }

        public int getType() {
            return this.mediaTrackGroup.type;
        }

        public int hashCode() {
            return java.util.Arrays.hashCode(this.trackSelected) + ((java.util.Arrays.hashCode(this.trackSupport) + (((this.mediaTrackGroup.hashCode() * 31) + (this.adaptiveSupported ? 1 : 0)) * 31)) * 31);
        }

        public boolean isAdaptiveSupported() {
            return this.adaptiveSupported;
        }

        public boolean isSelected() {
            for (boolean z6 : this.trackSelected) {
                if (z6) {
                    return true;
                }
            }
            return false;
        }

        public boolean isSupported() {
            return isSupported(false);
        }

        public boolean isTrackSelected(int i3) {
            return this.trackSelected[i3];
        }

        public boolean isTrackSupported(int i3) {
            return isTrackSupported(i3, false);
        }

        public android.os.Bundle toBundle() {
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putBundle(FIELD_TRACK_GROUP, this.mediaTrackGroup.toBundle());
            bundle.putIntArray(FIELD_TRACK_SUPPORT, this.trackSupport);
            bundle.putBooleanArray(FIELD_TRACK_SELECTED, this.trackSelected);
            bundle.putBoolean(FIELD_ADAPTIVE_SUPPORTED, this.adaptiveSupported);
            return bundle;
        }

        public boolean isSupported(boolean z6) {
            for (int i3 = 0; i3 < this.trackSupport.length; i3++) {
                if (isTrackSupported(i3, z6)) {
                    return true;
                }
            }
            return false;
        }

        public boolean isTrackSupported(int i3, boolean z6) {
            int i9 = this.trackSupport[i3];
            if (i9 != 4) {
                return z6 && i9 == 3;
            }
            return true;
        }
    }

    static {
        p076i4.Z z6 = p076i4.AbstractC2186b0.f22868i;
        EMPTY = new androidx.media3.common.Tracks(p076i4.S0.f22832l);
        FIELD_TRACK_GROUPS = androidx.media3.common.util.Util.intToStringMaxRadix(0);
    }

    public Tracks(java.util.List<androidx.media3.common.Tracks.Group> list) {
        this.groups = p076i4.AbstractC2186b0.u(list);
    }

    public static androidx.media3.common.Tracks fromBundle(android.os.Bundle bundle) {
        java.util.ArrayList parcelableArrayList = bundle.getParcelableArrayList(FIELD_TRACK_GROUPS);
        return new androidx.media3.common.Tracks(parcelableArrayList == null ? p076i4.S0.f22832l : androidx.media3.common.util.BundleCollectionUtil.fromBundleList(new androidx.media3.common.b(11), parcelableArrayList));
    }

    public boolean containsType(int i3) {
        for (int i9 = 0; i9 < this.groups.size(); i9++) {
            if (((androidx.media3.common.Tracks.Group) this.groups.get(i9)).getType() == i3) {
                return true;
            }
        }
        return false;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || androidx.media3.common.Tracks.class != obj.getClass()) {
            return false;
        }
        return this.groups.equals(((androidx.media3.common.Tracks) obj).groups);
    }

    public p076i4.AbstractC2186b0 getGroups() {
        return this.groups;
    }

    public int hashCode() {
        return this.groups.hashCode();
    }

    public boolean isEmpty() {
        return this.groups.isEmpty();
    }

    public boolean isTypeSelected(int i3) {
        for (int i9 = 0; i9 < this.groups.size(); i9++) {
            androidx.media3.common.Tracks.Group group = (androidx.media3.common.Tracks.Group) this.groups.get(i9);
            if (group.isSelected() && group.getType() == i3) {
                return true;
            }
        }
        return false;
    }

    public boolean isTypeSupported(int i3) {
        return isTypeSupported(i3, false);
    }

    @java.lang.Deprecated
    public boolean isTypeSupportedOrEmpty(int i3) {
        return isTypeSupportedOrEmpty(i3, false);
    }

    public android.os.Bundle toBundle() {
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putParcelableArrayList(FIELD_TRACK_GROUPS, androidx.media3.common.util.BundleCollectionUtil.toBundleArrayList(this.groups, new androidx.media3.common.b(10)));
        return bundle;
    }

    public boolean isTypeSupported(int i3, boolean z6) {
        for (int i9 = 0; i9 < this.groups.size(); i9++) {
            if (((androidx.media3.common.Tracks.Group) this.groups.get(i9)).getType() == i3 && ((androidx.media3.common.Tracks.Group) this.groups.get(i9)).isSupported(z6)) {
                return true;
            }
        }
        return false;
    }

    @java.lang.Deprecated
    public boolean isTypeSupportedOrEmpty(int i3, boolean z6) {
        return !containsType(i3) || isTypeSupported(i3, z6);
    }
}
