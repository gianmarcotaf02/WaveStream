package androidx.media3.extractor.text;

import android.os.Bundle;
import android.os.Parcel;
import androidx.media3.common.util.BundleCollectionUtil;
import java.util.ArrayList;

public final class CueDecoder {
    static final String BUNDLE_FIELD_CUES = "c";
    static final String BUNDLE_FIELD_DURATION_US = "d";

    public CuesWithTiming decode(long j, byte[] bArr, int i3, int i9) {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.unmarshall(bArr, i3, i9);
        parcelObtain.setDataPosition(0);
        Bundle bundle = parcelObtain.readBundle(Bundle.class.getClassLoader());
        parcelObtain.recycle();
        ArrayList parcelableArrayList = bundle.getParcelableArrayList(BUNDLE_FIELD_CUES);
        parcelableArrayList.getClass();
        return new CuesWithTiming(BundleCollectionUtil.fromBundleList(new androidx.media3.common.b(14), parcelableArrayList), j, bundle.getLong("d"));
    }
}
