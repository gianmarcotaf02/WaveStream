package p039e1;

/* JADX INFO: loaded from: classes.dex */
public final class j extends android.text.style.CharacterStyle {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f21358a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f21359b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f21360c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f21361d;

    public j(int i3, float f9, float f10, float f11) {
        this.f21358a = i3;
        this.f21359b = f9;
        this.f21360c = f10;
        this.f21361d = f11;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(android.text.TextPaint textPaint) {
        textPaint.setShadowLayer(this.f21361d, this.f21359b, this.f21360c, this.f21358a);
    }
}
