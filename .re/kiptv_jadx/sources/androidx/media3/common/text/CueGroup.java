package androidx.media3.common.text;

/* JADX INFO: loaded from: classes.dex */
public final class CueGroup {
    private static final p076i4.O0 CUES_PRIORITY_COMPARATOR = new p076i4.C2228x(new androidx.media3.common.b(13), p076i4.L0.f22810i);
    public static final androidx.media3.common.text.CueGroup EMPTY_TIME_ZERO;
    private static final java.lang.String FIELD_CUES;
    private static final java.lang.String FIELD_PRESENTATION_TIME_US;
    public final p076i4.AbstractC2186b0 cues;
    public final long presentationTimeUs;

    static {
        p076i4.Z z6 = p076i4.AbstractC2186b0.f22868i;
        EMPTY_TIME_ZERO = new androidx.media3.common.text.CueGroup(p076i4.S0.f22832l, 0L);
        FIELD_CUES = androidx.media3.common.util.Util.intToStringMaxRadix(0);
        FIELD_PRESENTATION_TIME_US = androidx.media3.common.util.Util.intToStringMaxRadix(1);
    }

    public CueGroup(java.util.List<androidx.media3.common.text.Cue> list, long j) {
        this.cues = p076i4.AbstractC2186b0.A(CUES_PRIORITY_COMPARATOR, list);
        this.presentationTimeUs = j;
    }

    private static p076i4.AbstractC2186b0 filterOutBitmapCues(java.util.List<androidx.media3.common.text.Cue> list) {
        p076i4.Y yS = p076i4.AbstractC2186b0.s();
        for (int i3 = 0; i3 < list.size(); i3++) {
            if (list.get(i3).bitmap == null) {
                yS.c(list.get(i3));
            }
        }
        return yS.f();
    }

    public static androidx.media3.common.text.CueGroup fromBundle(android.os.Bundle bundle) {
        java.util.ArrayList parcelableArrayList = bundle.getParcelableArrayList(FIELD_CUES);
        return new androidx.media3.common.text.CueGroup(parcelableArrayList == null ? p076i4.S0.f22832l : androidx.media3.common.util.BundleCollectionUtil.fromBundleList(new androidx.media3.common.b(14), parcelableArrayList), bundle.getLong(FIELD_PRESENTATION_TIME_US));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ java.lang.Integer lambda$static$0(androidx.media3.common.text.Cue cue) {
        return java.lang.Integer.valueOf(cue.zIndex);
    }

    public android.os.Bundle toBundle() {
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putParcelableArrayList(FIELD_CUES, androidx.media3.common.util.BundleCollectionUtil.toBundleArrayList(filterOutBitmapCues(this.cues), new androidx.media3.common.b(15)));
        bundle.putLong(FIELD_PRESENTATION_TIME_US, this.presentationTimeUs);
        return bundle;
    }
}
