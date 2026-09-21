package p039e1;

/* JADX INFO: loaded from: classes.dex */
public final class c implements android.text.style.LeadingMarginSpan {
    @Override // android.text.style.LeadingMarginSpan
    public final void drawLeadingMargin(android.graphics.Canvas canvas, android.graphics.Paint paint, int i3, int i9, int i10, int i11, int i12, java.lang.CharSequence charSequence, int i13, int i14, boolean z6, android.text.Layout layout) {
        int lineForOffset;
        if (layout == null || paint == null || (lineForOffset = layout.getLineForOffset(i13)) != layout.getLineCount() - 1) {
            return;
        }
        java.lang.ThreadLocal threadLocal = p021c1.j.f18483a;
        if (layout.getEllipsisCount(lineForOffset) > 0) {
            float fW = com.google.android.gms.internal.play_billing.AbstractC1833d1.w(layout, lineForOffset, paint) + com.google.android.gms.internal.play_billing.AbstractC1833d1.v(layout, lineForOffset, paint);
            if (fW == 0.0f) {
                return;
            }
            kotlin.jvm.internal.m.b(canvas);
            canvas.translate(fW, 0.0f);
        }
    }

    @Override // android.text.style.LeadingMarginSpan
    public final int getLeadingMargin(boolean z6) {
        return 0;
    }
}
