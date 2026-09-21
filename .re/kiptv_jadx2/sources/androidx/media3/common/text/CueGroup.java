package androidx.media3.common.text;

import android.os.Bundle;
import androidx.media3.common.b;
import androidx.media3.common.util.BundleCollectionUtil;
import androidx.media3.common.util.Util;
import java.util.ArrayList;
import java.util.List;
import p076i4.AbstractC2186b0;
import p076i4.C2228x;
import p076i4.L0;
import p076i4.O0;
import p076i4.S0;
import p076i4.Y;
import p076i4.Z;

public final class CueGroup {
    private static final O0 CUES_PRIORITY_COMPARATOR = new C2228x(new b(13), L0.f22810i);
    public static final CueGroup EMPTY_TIME_ZERO;
    private static final String FIELD_CUES;
    private static final String FIELD_PRESENTATION_TIME_US;
    public final AbstractC2186b0 cues;
    public final long presentationTimeUs;

    static {
        Z z6 = AbstractC2186b0.f22868i;
        EMPTY_TIME_ZERO = new CueGroup(S0.f22832l, 0L);
        FIELD_CUES = Util.intToStringMaxRadix(0);
        FIELD_PRESENTATION_TIME_US = Util.intToStringMaxRadix(1);
    }

    public CueGroup(List<Cue> list, long j) {
        this.cues = AbstractC2186b0.A(CUES_PRIORITY_COMPARATOR, list);
        this.presentationTimeUs = j;
    }

    private static AbstractC2186b0 filterOutBitmapCues(List<Cue> list) {
        Y yS = AbstractC2186b0.s();
        for (int i3 = 0; i3 < list.size(); i3++) {
            if (list.get(i3).bitmap == null) {
                yS.c(list.get(i3));
            }
        }
        return yS.f();
    }

    public static CueGroup fromBundle(Bundle bundle) {
        ArrayList parcelableArrayList = bundle.getParcelableArrayList(FIELD_CUES);
        return new CueGroup(parcelableArrayList == null ? S0.f22832l : BundleCollectionUtil.fromBundleList(new b(14), parcelableArrayList), bundle.getLong(FIELD_PRESENTATION_TIME_US));
    }

    public static Integer lambda$static$0(Cue cue) {
        return Integer.valueOf(cue.zIndex);
    }

    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList(FIELD_CUES, BundleCollectionUtil.toBundleArrayList(filterOutBitmapCues(this.cues), new b(15)));
        bundle.putLong(FIELD_PRESENTATION_TIME_US, this.presentationTimeUs);
        return bundle;
    }
}
