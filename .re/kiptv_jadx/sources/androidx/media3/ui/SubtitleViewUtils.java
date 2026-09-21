package androidx.media3.ui;

/* JADX INFO: loaded from: classes.dex */
final class SubtitleViewUtils {
    private SubtitleViewUtils() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$removeAllEmbeddedStyling$0(java.lang.Object obj) {
        return !(obj instanceof androidx.media3.common.text.LanguageFeatureSpan);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$removeEmbeddedFontSizes$1(java.lang.Object obj) {
        return (obj instanceof android.text.style.AbsoluteSizeSpan) || (obj instanceof android.text.style.RelativeSizeSpan);
    }

    public static void removeAllEmbeddedStyling(androidx.media3.common.text.Cue.Builder builder) {
        builder.clearWindowColor();
        if (builder.getText() instanceof android.text.Spanned) {
            if (!(builder.getText() instanceof android.text.Spannable)) {
                builder.setText(android.text.SpannableString.valueOf(builder.getText()));
            }
            java.lang.CharSequence text = builder.getText();
            text.getClass();
            removeSpansIf((android.text.Spannable) text, new androidx.media3.ui.n(0));
        }
        removeEmbeddedFontSizes(builder);
    }

    public static void removeEmbeddedFontSizes(androidx.media3.common.text.Cue.Builder builder) {
        builder.setTextSize(-3.4028235E38f, Integer.MIN_VALUE);
        if (builder.getText() instanceof android.text.Spanned) {
            if (!(builder.getText() instanceof android.text.Spannable)) {
                builder.setText(android.text.SpannableString.valueOf(builder.getText()));
            }
            java.lang.CharSequence text = builder.getText();
            text.getClass();
            removeSpansIf((android.text.Spannable) text, new androidx.media3.ui.n(1));
        }
    }

    private static void removeSpansIf(android.text.Spannable spannable, p068h4.l lVar) {
        for (java.lang.Object obj : spannable.getSpans(0, spannable.length(), java.lang.Object.class)) {
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
