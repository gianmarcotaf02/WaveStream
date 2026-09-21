package androidx.media3.common;

import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.media3.common.util.BundleCollectionUtil;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.Util;
import com.google.android.gms.internal.play_billing.AbstractC1864o0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import p076i4.AbstractC2186b0;
import p076i4.S0;
import p076i4.Z;

public final class TrackGroup {
    private static final String FIELD_FORMATS = Util.intToStringMaxRadix(0);
    private static final String FIELD_ID = Util.intToStringMaxRadix(1);
    private static final String TAG = "TrackGroup";
    private final Format[] formats;
    private int hashCode;
    public final String id;
    public final int length;
    public final int type;

    public TrackGroup(Format... formatArr) {
        this("", formatArr);
    }

    public static TrackGroup fromBundle(Bundle bundle) {
        Collection collectionFromBundleList;
        ArrayList parcelableArrayList = bundle.getParcelableArrayList(FIELD_FORMATS);
        if (parcelableArrayList == null) {
            Z z6 = AbstractC2186b0.f22868i;
            collectionFromBundleList = S0.f22832l;
        } else {
            collectionFromBundleList = BundleCollectionUtil.fromBundleList(new b(7), parcelableArrayList);
        }
        return new TrackGroup(bundle.getString(FIELD_ID, ""), (Format[]) collectionFromBundleList.toArray(new Format[0]));
    }

    private static void logErrorMessage(String str, String str2, String str3, int i3) {
        StringBuilder sbO = Y6.f.o("Different ", str, " combined in one TrackGroup: '", str2, "' (track 0) and '");
        sbO.append(str3);
        sbO.append("' (track ");
        sbO.append(i3);
        sbO.append(")");
        Log.e(TAG, "", new IllegalStateException(sbO.toString()));
    }

    private static String normalizeLanguage(String str) {
        return (str == null || str.equals(C.LANGUAGE_UNDETERMINED)) ? "" : str;
    }

    private static int normalizeRoleFlags(int i3) {
        return i3 | 16384;
    }

    private void verifyCorrectness() {
        String strNormalizeLanguage = normalizeLanguage(this.formats[0].language);
        int iNormalizeRoleFlags = normalizeRoleFlags(this.formats[0].roleFlags);
        int i3 = 1;
        while (true) {
            Format[] formatArr = this.formats;
            if (i3 >= formatArr.length) {
                return;
            }
            if (!strNormalizeLanguage.equals(normalizeLanguage(formatArr[i3].language))) {
                Format[] formatArr2 = this.formats;
                logErrorMessage("languages", formatArr2[0].language, formatArr2[i3].language, i3);
                return;
            } else {
                if (iNormalizeRoleFlags != normalizeRoleFlags(this.formats[i3].roleFlags)) {
                    logErrorMessage("role flags", Integer.toBinaryString(this.formats[0].roleFlags), Integer.toBinaryString(this.formats[i3].roleFlags), i3);
                    return;
                }
                i3++;
            }
        }
    }

    public TrackGroup copyWithId(String str) {
        return new TrackGroup(str, this.formats);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && TrackGroup.class == obj.getClass()) {
            TrackGroup trackGroup = (TrackGroup) obj;
            if (this.id.equals(trackGroup.id) && Arrays.equals(this.formats, trackGroup.formats)) {
                return true;
            }
        }
        return false;
    }

    public Format getFormat(int i3) {
        return this.formats[i3];
    }

    public int hashCode() {
        if (this.hashCode == 0) {
            this.hashCode = Arrays.hashCode(this.formats) + B2.a.a(527, 31, this.id);
        }
        return this.hashCode;
    }

    public int indexOf(Format format) {
        int i3 = 0;
        while (true) {
            Format[] formatArr = this.formats;
            if (i3 >= formatArr.length) {
                return -1;
            }
            if (format == formatArr[i3]) {
                return i3;
            }
            i3++;
        }
    }

    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>(this.formats.length);
        for (Format format : this.formats) {
            arrayList.add(format.toBundle());
        }
        bundle.putParcelableArrayList(FIELD_FORMATS, arrayList);
        bundle.putString(FIELD_ID, this.id);
        return bundle;
    }

    public String toString() {
        return this.id + ": " + Arrays.toString(this.formats);
    }

    public TrackGroup(String str, Format... formatArr) {
        AbstractC1864o0.L(formatArr.length > 0);
        this.id = str;
        this.formats = formatArr;
        this.length = formatArr.length;
        String str2 = formatArr[0].sampleMimeType;
        this.type = TextUtils.isEmpty(str2) ? MimeTypes.getTrackType(formatArr[0].containerMimeType) : MimeTypes.getTrackType(str2);
        verifyCorrectness();
    }
}
