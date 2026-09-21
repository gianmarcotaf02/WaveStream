package androidx.media3.common;

/* JADX INFO: loaded from: classes.dex */
public final class TrackGroup {
    private static final java.lang.String FIELD_FORMATS = androidx.media3.common.util.Util.intToStringMaxRadix(0);
    private static final java.lang.String FIELD_ID = androidx.media3.common.util.Util.intToStringMaxRadix(1);
    private static final java.lang.String TAG = "TrackGroup";
    private final androidx.media3.common.Format[] formats;
    private int hashCode;
    public final java.lang.String id;
    public final int length;
    public final int type;

    public TrackGroup(androidx.media3.common.Format... formatArr) {
        this("", formatArr);
    }

    public static androidx.media3.common.TrackGroup fromBundle(android.os.Bundle bundle) {
        java.util.Collection collectionFromBundleList;
        java.util.ArrayList parcelableArrayList = bundle.getParcelableArrayList(FIELD_FORMATS);
        if (parcelableArrayList == null) {
            p076i4.Z z6 = p076i4.AbstractC2186b0.f22868i;
            collectionFromBundleList = p076i4.S0.f22832l;
        } else {
            collectionFromBundleList = androidx.media3.common.util.BundleCollectionUtil.fromBundleList(new androidx.media3.common.b(7), parcelableArrayList);
        }
        return new androidx.media3.common.TrackGroup(bundle.getString(FIELD_ID, ""), (androidx.media3.common.Format[]) collectionFromBundleList.toArray(new androidx.media3.common.Format[0]));
    }

    private static void logErrorMessage(java.lang.String str, java.lang.String str2, java.lang.String str3, int i3) {
        java.lang.StringBuilder sbO = Y6.f.o("Different ", str, " combined in one TrackGroup: '", str2, "' (track 0) and '");
        sbO.append(str3);
        sbO.append("' (track ");
        sbO.append(i3);
        sbO.append(")");
        androidx.media3.common.util.Log.e(TAG, "", new java.lang.IllegalStateException(sbO.toString()));
    }

    private static java.lang.String normalizeLanguage(java.lang.String str) {
        return (str == null || str.equals(androidx.media3.common.C.LANGUAGE_UNDETERMINED)) ? "" : str;
    }

    private static int normalizeRoleFlags(int i3) {
        return i3 | 16384;
    }

    private void verifyCorrectness() {
        java.lang.String strNormalizeLanguage = normalizeLanguage(this.formats[0].language);
        int iNormalizeRoleFlags = normalizeRoleFlags(this.formats[0].roleFlags);
        int i3 = 1;
        while (true) {
            androidx.media3.common.Format[] formatArr = this.formats;
            if (i3 >= formatArr.length) {
                return;
            }
            if (!strNormalizeLanguage.equals(normalizeLanguage(formatArr[i3].language))) {
                androidx.media3.common.Format[] formatArr2 = this.formats;
                logErrorMessage("languages", formatArr2[0].language, formatArr2[i3].language, i3);
                return;
            } else {
                if (iNormalizeRoleFlags != normalizeRoleFlags(this.formats[i3].roleFlags)) {
                    logErrorMessage("role flags", java.lang.Integer.toBinaryString(this.formats[0].roleFlags), java.lang.Integer.toBinaryString(this.formats[i3].roleFlags), i3);
                    return;
                }
                i3++;
            }
        }
    }

    public androidx.media3.common.TrackGroup copyWithId(java.lang.String str) {
        return new androidx.media3.common.TrackGroup(str, this.formats);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && androidx.media3.common.TrackGroup.class == obj.getClass()) {
            androidx.media3.common.TrackGroup trackGroup = (androidx.media3.common.TrackGroup) obj;
            if (this.id.equals(trackGroup.id) && java.util.Arrays.equals(this.formats, trackGroup.formats)) {
                return true;
            }
        }
        return false;
    }

    public androidx.media3.common.Format getFormat(int i3) {
        return this.formats[i3];
    }

    public int hashCode() {
        if (this.hashCode == 0) {
            this.hashCode = java.util.Arrays.hashCode(this.formats) + B2.a.a(527, 31, this.id);
        }
        return this.hashCode;
    }

    public int indexOf(androidx.media3.common.Format format) {
        int i3 = 0;
        while (true) {
            androidx.media3.common.Format[] formatArr = this.formats;
            if (i3 >= formatArr.length) {
                return -1;
            }
            if (format == formatArr[i3]) {
                return i3;
            }
            i3++;
        }
    }

    public android.os.Bundle toBundle() {
        android.os.Bundle bundle = new android.os.Bundle();
        java.util.ArrayList<? extends android.os.Parcelable> arrayList = new java.util.ArrayList<>(this.formats.length);
        for (androidx.media3.common.Format format : this.formats) {
            arrayList.add(format.toBundle());
        }
        bundle.putParcelableArrayList(FIELD_FORMATS, arrayList);
        bundle.putString(FIELD_ID, this.id);
        return bundle;
    }

    public java.lang.String toString() {
        return this.id + ": " + java.util.Arrays.toString(this.formats);
    }

    public TrackGroup(java.lang.String str, androidx.media3.common.Format... formatArr) {
        com.google.android.gms.internal.play_billing.AbstractC1864o0.L(formatArr.length > 0);
        this.id = str;
        this.formats = formatArr;
        this.length = formatArr.length;
        java.lang.String str2 = formatArr[0].sampleMimeType;
        this.type = android.text.TextUtils.isEmpty(str2) ? androidx.media3.common.MimeTypes.getTrackType(formatArr[0].containerMimeType) : androidx.media3.common.MimeTypes.getTrackType(str2);
        verifyCorrectness();
    }
}
