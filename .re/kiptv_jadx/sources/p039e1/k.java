package p039e1;

/* JADX INFO: loaded from: classes.dex */
public final class k extends android.text.style.CharacterStyle {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f21362a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f21363b;

    public k(boolean z6, boolean z9) {
        this.f21362a = z6;
        this.f21363b = z9;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(android.text.TextPaint textPaint) {
        textPaint.setUnderlineText(this.f21362a);
        textPaint.setStrikeThruText(this.f21363b);
    }
}
