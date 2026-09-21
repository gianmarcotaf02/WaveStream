package androidx.media3.common.text;

/* JADX INFO: loaded from: classes.dex */
public final class SpanUtil {
    private SpanUtil() {
    }

    public static void addInheritedRelativeSizeSpan(android.text.Spannable spannable, float f9, int i3, int i9, int i10) {
        for (android.text.style.RelativeSizeSpan relativeSizeSpan : (android.text.style.RelativeSizeSpan[]) spannable.getSpans(i3, i9, android.text.style.RelativeSizeSpan.class)) {
            if (spannable.getSpanStart(relativeSizeSpan) <= i3 && spannable.getSpanEnd(relativeSizeSpan) >= i9) {
                f9 = relativeSizeSpan.getSizeChange() * f9;
            }
            removeIfStartEndAndFlagsMatch(spannable, relativeSizeSpan, i3, i9, i10);
        }
        spannable.setSpan(new android.text.style.RelativeSizeSpan(f9), i3, i9, i10);
    }

    public static void addOrReplaceSpan(android.text.Spannable spannable, java.lang.Object obj, int i3, int i9, int i10) {
        for (java.lang.Object obj2 : spannable.getSpans(i3, i9, obj.getClass())) {
            removeIfStartEndAndFlagsMatch(spannable, obj2, i3, i9, i10);
        }
        spannable.setSpan(obj, i3, i9, i10);
    }

    private static void removeIfStartEndAndFlagsMatch(android.text.Spannable spannable, java.lang.Object obj, int i3, int i9, int i10) {
        if (spannable.getSpanStart(obj) == i3 && spannable.getSpanEnd(obj) == i9 && spannable.getSpanFlags(obj) == i10) {
            spannable.removeSpan(obj);
        }
    }
}
