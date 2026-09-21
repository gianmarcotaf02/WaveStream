package androidx.media3.ui;

import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.RelativeSizeSpan;
import androidx.media3.common.text.Cue;
import androidx.media3.common.text.LanguageFeatureSpan;

final class SubtitleViewUtils {
    private SubtitleViewUtils() {
    }

    public static boolean lambda$removeAllEmbeddedStyling$0(Object obj) {
        return !(obj instanceof LanguageFeatureSpan);
    }

    public static boolean lambda$removeEmbeddedFontSizes$1(Object obj) {
        return (obj instanceof AbsoluteSizeSpan) || (obj instanceof RelativeSizeSpan);
    }

    public static void removeAllEmbeddedStyling(Cue.Builder builder) {
        builder.clearWindowColor();
        if (builder.getText() instanceof Spanned) {
            if (!(builder.getText() instanceof Spannable)) {
                builder.setText(SpannableString.valueOf(builder.getText()));
            }
            CharSequence text = builder.getText();
            text.getClass();
            removeSpansIf((Spannable) text, new n(0));
        }
        removeEmbeddedFontSizes(builder);
    }

    public static void removeEmbeddedFontSizes(Cue.Builder builder) {
        builder.setTextSize(-3.4028235E38f, Integer.MIN_VALUE);
        if (builder.getText() instanceof Spanned) {
            if (!(builder.getText() instanceof Spannable)) {
                builder.setText(SpannableString.valueOf(builder.getText()));
            }
            CharSequence text = builder.getText();
            text.getClass();
            removeSpansIf((Spannable) text, new n(1));
        }
    }

    private static void removeSpansIf(Spannable spannable, p068h4.l lVar) {
        for (Object obj : spannable.getSpans(0, spannable.length(), Object.class)) {
            if (lVar.apply(obj)) {
                spannable.removeSpan(obj);
            }
        }
    }

    public static float resolveTextSize(int i3, float f9, int i9, int i10) {
        float f10;
        if (f9 == -3.4028235E38f) {
            return -3.4028235E38f;
        }
        if (i3 == 0) {
            f10 = i10;
        } else {
            if (i3 != 1) {
                if (i3 != 2) {
                    return -3.4028235E38f;
                }
                return f9;
            }
            f10 = i9;
        }
        return f9 * f10;
    }
}
