package p103m;

/* JADX INFO: loaded from: classes.dex */
public abstract class Z {
    public static android.text.StaticLayout a(java.lang.CharSequence charSequence, android.text.Layout.Alignment alignment, int i3, int i9, android.widget.TextView textView, android.text.TextPaint textPaint, p103m.AbstractC2557c0 abstractC2557c0) {
        android.text.StaticLayout.Builder builderObtain = android.text.StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), textPaint, i3);
        android.text.StaticLayout.Builder hyphenationFrequency = builderObtain.setAlignment(alignment).setLineSpacing(textView.getLineSpacingExtra(), textView.getLineSpacingMultiplier()).setIncludePad(textView.getIncludeFontPadding()).setBreakStrategy(textView.getBreakStrategy()).setHyphenationFrequency(textView.getHyphenationFrequency());
        if (i9 == -1) {
            i9 = androidx.media3.common.util.Log.LOG_LEVEL_OFF;
        }
        hyphenationFrequency.setMaxLines(i9);
        try {
            abstractC2557c0.a(builderObtain, textView);
        } catch (java.lang.ClassCastException unused) {
            android.util.Log.w("ACTVAutoSizeHelper", "Failed to obtain TextDirectionHeuristic, auto size may be incorrect");
        }
        return builderObtain.build();
    }
}
