package io.sentry.android.replay.util;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u0007\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u0006H\u0016J\u0010\u0010\u000e\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u0006H\u0016J\u0010\u0010\u000f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u0006H\u0016J\u0010\u0010\u0010\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u0006H\u0016J\u0010\u0010\u0011\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u0006H\u0016J\u0018\u0010\u0012\u001a\u00020\u00132\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u0006H\u0016R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lio/sentry/android/replay/util/AndroidTextLayout;", "Lio/sentry/android/replay/util/TextLayout;", androidx.media3.extractor.text.ttml.TtmlNode.TAG_LAYOUT, "Landroid/text/Layout;", "(Landroid/text/Layout;)V", "dominantTextColor", "", "getDominantTextColor", "()Ljava/lang/Integer;", "lineCount", "getLineCount", "()I", "getEllipsisCount", "line", "getLineBottom", "getLineStart", "getLineTop", "getLineVisibleEnd", "getPrimaryHorizontal", "", "offset", "sentry-android-replay_release"}, k = 1, mv = {1, 6, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class AndroidTextLayout implements io.sentry.android.replay.util.TextLayout {
    public static final int $stable = 8;
    private final android.text.Layout layout;

    public AndroidTextLayout(android.text.Layout layout) {
        kotlin.jvm.internal.m.e(layout, "layout");
        this.layout = layout;
    }

    @Override // io.sentry.android.replay.util.TextLayout
    public java.lang.Integer getDominantTextColor() {
        int i3;
        if (!(this.layout.getText() instanceof android.text.Spanned)) {
            return null;
        }
        java.lang.CharSequence text = this.layout.getText();
        kotlin.jvm.internal.m.c(text, "null cannot be cast to non-null type android.text.Spanned");
        android.text.style.ForegroundColorSpan[] spans = (android.text.style.ForegroundColorSpan[]) ((android.text.Spanned) text).getSpans(0, this.layout.getText().length(), android.text.style.ForegroundColorSpan.class);
        kotlin.jvm.internal.m.d(spans, "spans");
        int i9 = Integer.MIN_VALUE;
        java.lang.Integer numValueOf = null;
        for (android.text.style.ForegroundColorSpan foregroundColorSpan : spans) {
            java.lang.CharSequence text2 = this.layout.getText();
            kotlin.jvm.internal.m.c(text2, "null cannot be cast to non-null type android.text.Spanned");
            int spanStart = ((android.text.Spanned) text2).getSpanStart(foregroundColorSpan);
            java.lang.CharSequence text3 = this.layout.getText();
            kotlin.jvm.internal.m.c(text3, "null cannot be cast to non-null type android.text.Spanned");
            int spanEnd = ((android.text.Spanned) text3).getSpanEnd(foregroundColorSpan);
            if (spanStart != -1 && spanEnd != -1 && (i3 = spanEnd - spanStart) > i9) {
                numValueOf = java.lang.Integer.valueOf(foregroundColorSpan.getForegroundColor());
                i9 = i3;
            }
        }
        if (numValueOf != null) {
            return java.lang.Integer.valueOf(io.sentry.android.replay.util.ViewsKt.toOpaque(numValueOf.intValue()));
        }
        return null;
    }

    @Override // io.sentry.android.replay.util.TextLayout
    public int getEllipsisCount(int line) {
        return this.layout.getEllipsisCount(line);
    }

    @Override // io.sentry.android.replay.util.TextLayout
    public int getLineBottom(int line) {
        return this.layout.getLineBottom(line);
    }

    @Override // io.sentry.android.replay.util.TextLayout
    public int getLineCount() {
        return this.layout.getLineCount();
    }

    @Override // io.sentry.android.replay.util.TextLayout
    public int getLineStart(int line) {
        return this.layout.getLineStart(line);
    }

    @Override // io.sentry.android.replay.util.TextLayout
    public int getLineTop(int line) {
        return this.layout.getLineTop(line);
    }

    @Override // io.sentry.android.replay.util.TextLayout
    public int getLineVisibleEnd(int line) {
        return this.layout.getLineVisibleEnd(line);
    }

    @Override // io.sentry.android.replay.util.TextLayout
    public float getPrimaryHorizontal(int line, int offset) {
        return this.layout.getPrimaryHorizontal(offset);
    }
}
