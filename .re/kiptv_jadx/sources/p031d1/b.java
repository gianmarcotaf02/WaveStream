package p031d1;

/* JADX INFO: loaded from: classes.dex */
public final class b extends com.google.android.gms.internal.play_billing.AbstractC1853k0 {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final java.lang.CharSequence f21158l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final android.text.TextPaint f21159m;

    public b(java.lang.CharSequence charSequence, android.text.TextPaint textPaint) {
        this.f21158l = charSequence;
        this.f21159m = textPaint;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC1853k0
    public final int B(int i3) {
        java.lang.CharSequence charSequence = this.f21158l;
        return this.f21159m.getTextRunCursor(charSequence, 0, charSequence.length(), false, i3, 0);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC1853k0
    public final int C(int i3) {
        java.lang.CharSequence charSequence = this.f21158l;
        return this.f21159m.getTextRunCursor(charSequence, 0, charSequence.length(), false, i3, 2);
    }
}
