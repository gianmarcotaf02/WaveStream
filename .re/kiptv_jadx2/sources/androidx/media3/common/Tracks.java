package androidx.media3.common;

import android.os.Bundle;
import androidx.media3.common.util.BundleCollectionUtil;
import androidx.media3.common.util.Util;
import com.google.android.gms.internal.play_billing.AbstractC1864o0;
import com.google.crypto.tink.shaded.protobuf.AbstractC1911f;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import p076i4.AbstractC2186b0;
import p076i4.S0;
import p076i4.Z;

public final class Tracks {
    public static final Tracks EMPTY;
    private static final String FIELD_TRACK_GROUPS;
    private final AbstractC2186b0 groups;

    public static final class Group {
        private final boolean adaptiveSupported;
        public final int length;
        private final TrackGroup mediaTrackGroup;
        private final boolean[] trackSelected;
        private final int[] trackSupport;
        private static final String FIELD_TRACK_GROUP = Util.intToStringMaxRadix(0);
        private static final String FIELD_TRACK_SUPPORT = Util.intToStringMaxRadix(1);
        private static final String FIELD_TRACK_SELECTED = Util.intToStringMaxRadix(3);
        private static final String FIELD_ADAPTIVE_SUPPORTED = Util.intToStringMaxRadix(4);

        public Group(TrackGroup trackGroup, boolean z6, int[] iArr, boolean[] zArr) {
            int i3 = trackGroup.length;
            this.length = i3;
            boolean z9 = false;
            AbstractC1864o0.L(i3 == iArr.length && i3 == zArr.length);
            this.mediaTrackGroup = trackGroup;
            if (z6 && i3 > 1) {
                z9 = true;
            }
            this.adaptiveSupported = z9;
            this.trackSupport = (int[]) iArr.clone();
            this.trackSelected = (boolean[]) zArr.clone();
        }

        public static Group fromBundle(Bundle bundle) {
            Bundle bundle2 = bundle.getBundle(FIELD_TRACK_GROUP);
            bundle2.getClass();
            TrackGroup trackGroupFromBundle = TrackGroup.fromBundle(bundle2);
            return new Group(trackGroupFromBundle, bundle.getBoolean(FIELD_ADAPTIVE_SUPPORTED, false), (int[]) AbstractC1911f.t(bundle.getIntArray(FIELD_TRACK_SUPPORT), new int[trackGroupFromBundle.length]), (boolean[]) AbstractC1911f.t(bundle.getBooleanArray(FIELD_TRACK_SELECTED), new boolean[trackGroupFromBundle.length]));
        }

        public Group copyWithId(String str) {
            return new Group(this.mediaTrackGroup.copyWithId(str), this.adaptiveSupported, this.trackSupport, this.trackSelected);
        }

        public Group copyWithMediaTrackGroup(TrackGroup trackGroup) {
            return new Group(trackGroup, this.adaptiveSupported, this.trackSupport, this.trackSelected);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && Group.class == obj.getClass()) {
                Group group = (Group) obj;
                if (this.adaptiveSupported == group.adaptiveSupported && this.mediaTrackGroup.equals(group.mediaTrackGroup) && Arrays.equals(this.trackSupport, group.trackSupport) && Arrays.equals(this.trackSelected, group.trackSelected)) {
                    return true;
                }
            }
            return false;
        }

        public TrackGroup getMediaTrackGroup() {
            return this.mediaTrackGroup;
        }

        public Format getTrackFormat(int i3) {
            return this.mediaTrackGroup.getFormat(i3);
        }

        public int getTrackSupport(int i3) {
            return this.trackSupport[i3];
        }

        public int getType() {
            return this.mediaTrackGroup.type;
        }

        public int hashCode() {
            return Arrays.hashCode(this.trackSelected) + ((Arrays.hashCode(this.trackSupport) + (((this.mediaTrackGroup.hashCode() * 31) + (this.adaptiveSupported ? 1 : 0)) * 31)) * 31);
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

        public Bundle toBundle() {
            Bundle bundle = new Bundle();
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
        Z z6 = AbstractC2186b0.f22868i;
        EMPTY = new Tracks(S0.f22832l);
        FIELD_TRACK_GROUPS = Util.intToStringMaxRadix(0);
    }

    public Tracks(List<Group> list) {
        this.groups = AbstractC2186b0.u(list);
    }

    public static Tracks fromBundle(Bundle bundle) {
        ArrayList parcelableArrayList = bundle.getParcelableArrayList(FIELD_TRACK_GROUPS);
        return new Tracks(parcelableArrayList == null ? S0.f22832l : BundleCollectionUtil.fromBundleList(new b(11), parcelableArrayList));
    }

    public boolean containsType(int i3) {
        for (int i9 = 0; i9 < this.groups.size(); i9++) {
            if (((Group) this.groups.get(i9)).getType() == i3) {
                return true;
            }
        }
        return false;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || Tracks.class != obj.getClass()) {
            return false;
        }
        return this.groups.equals(((Tracks) obj).groups);
    }

    public AbstractC2186b0 getGroups() {
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
            Group group = (Group) this.groups.get(i9);
            if (group.isSelected() && group.getType() == i3) {
                return true;
            }
        }
        return false;
    }

    public boolean isTypeSupported(int i3) {
        return isTypeSupported(i3, false);
    }

    @Deprecated
    public boolean isTypeSupportedOrEmpty(int i3) {
        return isTypeSupportedOrEmpty(i3, false);
    }

    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList(FIELD_TRACK_GROUPS, BundleCollectionUtil.toBundleArrayList(this.groups, new b(10)));
        return bundle;
    }

    public boolean isTypeSupported(int i3, boolean z6) {
        for (int i9 = 0; i9 < this.groups.size(); i9++) {
            if (((Group) this.groups.get(i9)).getType() == i3 && ((Group) this.groups.get(i9)).isSupported(z6)) {
                return true;
            }
        }
        return false;
    }

    @Deprecated
    public boolean isTypeSupportedOrEmpty(int i3, boolean z6) {
        return !containsType(i3) || isTypeSupported(i3, z6);
    }
}
