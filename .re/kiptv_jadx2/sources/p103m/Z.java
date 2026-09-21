package p103m;

import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.widget.TextView;
import androidx.media3.common.util.Log;

public abstract class Z {
    public static StaticLayout a(CharSequence charSequence, Layout.Alignment alignment, int i3, int i9, TextView textView, TextPaint textPaint, AbstractC2557c0 abstractC2557c0) {
        StaticLayout.Builder builderObtain = StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), textPaint, i3);
        StaticLayout.Builder hyphenationFrequency = builderObtain.setAlignment(alignment).setLineSpacing(textView.getLineSpacingExtra(), textView.getLineSpacingMultiplier()).setIncludePad(textView.getIncludeFontPadding()).setBreakStrategy(textView.getBreakStrategy()).setHyphenationFrequency(textView.getHyphenationFrequency());
        if (i9 == -1) {
            i9 = Log.LOG_LEVEL_OFF;
        }
        hyphenationFrequency.setMaxLines(i9);
        try {
            abstractC2557c0.a(builderObtain, textView);
        } catch (ClassCastException unused) {
            android.util.Log.w("ACTVAutoSizeHelper", "Failed to obtain TextDirectionHeuristic, auto size may be incorrect");
        }
        return builderObtain.build();
    }
}
