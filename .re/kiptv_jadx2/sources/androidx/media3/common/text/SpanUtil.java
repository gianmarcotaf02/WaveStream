package androidx.media3.common.text;

import android.text.Spannable;
import android.text.style.RelativeSizeSpan;

public final class SpanUtil {
    private SpanUtil() {
    }

    public static void addInheritedRelativeSizeSpan(Spannable spannable, float f9, int i3, int i9, int i10) {
        for (RelativeSizeSpan relativeSizeSpan : (RelativeSizeSpan[]) spannable.getSpans(i3, i9, RelativeSizeSpan.class)) {
            if (spannable.getSpanStart(relativeSizeSpan) <= i3 && spannable.getSpanEnd(relativeSizeSpan) >= i9) {
                f9 = relativeSizeSpan.getSizeChange() * f9;
            }
            removeIfStartEndAndFlagsMatch(spannable, relativeSizeSpan, i3, i9, i10);
        }
        spannable.setSpan(new RelativeSizeSpan(f9), i3, i9, i10);
    }

    public static void addOrReplaceSpan(Spannable spannable, Object obj, int i3, int i9, int i10) {
        for (Object obj2 : spannable.getSpans(i3, i9, obj.getClass())) {
            removeIfStartEndAndFlagsMatch(spannable, obj2, i3, i9, i10);
        }
        spannable.setSpan(obj, i3, i9, i10);
    }

    private static void removeIfStartEndAndFlagsMatch(Spannable spannable, Object obj, int i3, int i9, int i10) {
        if (spannable.getSpanStart(obj) == i3 && spannable.getSpanEnd(obj) == i9 && spannable.getSpanFlags(obj) == i10) {
            spannable.removeSpan(obj);
        }
    }
}
