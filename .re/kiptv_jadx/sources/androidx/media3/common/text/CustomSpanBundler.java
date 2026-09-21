package androidx.media3.common.text;

/* JADX INFO: loaded from: classes.dex */
final class CustomSpanBundler {
    private static final int HORIZONTAL_TEXT_IN_VERTICAL_CONTEXT = 3;
    private static final int RUBY = 1;
    private static final int TEXT_EMPHASIS = 2;
    private static final int UNKNOWN = -1;
    private static final int VOICE = 4;
    private static final java.lang.String FIELD_START_INDEX = androidx.media3.common.util.Util.intToStringMaxRadix(0);
    private static final java.lang.String FIELD_END_INDEX = androidx.media3.common.util.Util.intToStringMaxRadix(1);
    private static final java.lang.String FIELD_FLAGS = androidx.media3.common.util.Util.intToStringMaxRadix(2);
    private static final java.lang.String FIELD_TYPE = androidx.media3.common.util.Util.intToStringMaxRadix(3);
    private static final java.lang.String FIELD_PARAMS = androidx.media3.common.util.Util.intToStringMaxRadix(4);

    private CustomSpanBundler() {
    }

    public static java.util.ArrayList<android.os.Bundle> bundleCustomSpans(android.text.Spanned spanned) {
        java.util.ArrayList<android.os.Bundle> arrayList = new java.util.ArrayList<>();
        for (androidx.media3.common.text.RubySpan rubySpan : (androidx.media3.common.text.RubySpan[]) spanned.getSpans(0, spanned.length(), androidx.media3.common.text.RubySpan.class)) {
            arrayList.add(spanToBundle(spanned, rubySpan, 1, rubySpan.toBundle()));
        }
        for (androidx.media3.common.text.TextEmphasisSpan textEmphasisSpan : (androidx.media3.common.text.TextEmphasisSpan[]) spanned.getSpans(0, spanned.length(), androidx.media3.common.text.TextEmphasisSpan.class)) {
            arrayList.add(spanToBundle(spanned, textEmphasisSpan, 2, textEmphasisSpan.toBundle()));
        }
        for (androidx.media3.common.text.HorizontalTextInVerticalContextSpan horizontalTextInVerticalContextSpan : (androidx.media3.common.text.HorizontalTextInVerticalContextSpan[]) spanned.getSpans(0, spanned.length(), androidx.media3.common.text.HorizontalTextInVerticalContextSpan.class)) {
            arrayList.add(spanToBundle(spanned, horizontalTextInVerticalContextSpan, 3, null));
        }
        for (androidx.media3.common.text.VoiceSpan voiceSpan : (androidx.media3.common.text.VoiceSpan[]) spanned.getSpans(0, spanned.length(), androidx.media3.common.text.VoiceSpan.class)) {
            arrayList.add(spanToBundle(spanned, voiceSpan, 4, voiceSpan.toBundle()));
        }
        return arrayList;
    }

    private static android.os.Bundle spanToBundle(android.text.Spanned spanned, java.lang.Object obj, int i3, android.os.Bundle bundle) {
        android.os.Bundle bundle2 = new android.os.Bundle();
        bundle2.putInt(FIELD_START_INDEX, spanned.getSpanStart(obj));
        bundle2.putInt(FIELD_END_INDEX, spanned.getSpanEnd(obj));
        bundle2.putInt(FIELD_FLAGS, spanned.getSpanFlags(obj));
        bundle2.putInt(FIELD_TYPE, i3);
        if (bundle != null) {
            bundle2.putBundle(FIELD_PARAMS, bundle);
        }
        return bundle2;
    }

    public static void unbundleAndApplyCustomSpan(android.os.Bundle bundle, android.text.Spannable spannable) {
        int i3 = bundle.getInt(FIELD_START_INDEX);
        int i9 = bundle.getInt(FIELD_END_INDEX);
        int i10 = bundle.getInt(FIELD_FLAGS);
        int i11 = bundle.getInt(FIELD_TYPE, -1);
        android.os.Bundle bundle2 = bundle.getBundle(FIELD_PARAMS);
        if (i11 == 1) {
            bundle2.getClass();
            spannable.setSpan(androidx.media3.common.text.RubySpan.fromBundle(bundle2), i3, i9, i10);
            return;
        }
        if (i11 == 2) {
            bundle2.getClass();
            spannable.setSpan(androidx.media3.common.text.TextEmphasisSpan.fromBundle(bundle2), i3, i9, i10);
        } else if (i11 == 3) {
            spannable.setSpan(new androidx.media3.common.text.HorizontalTextInVerticalContextSpan(), i3, i9, i10);
        } else {
            if (i11 != 4) {
                return;
            }
            bundle2.getClass();
            spannable.setSpan(androidx.media3.common.text.VoiceSpan.fromBundle(bundle2), i3, i9, i10);
        }
    }
}
