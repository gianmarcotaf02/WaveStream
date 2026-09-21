package p031d1;

/* JADX INFO: loaded from: classes.dex */
public final class c extends com.google.android.gms.internal.play_billing.AbstractC1853k0 {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final java.text.BreakIterator f21160l;

    public c(java.lang.CharSequence charSequence) {
        java.text.BreakIterator characterInstance = java.text.BreakIterator.getCharacterInstance();
        characterInstance.setText(charSequence.toString());
        this.f21160l = characterInstance;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC1853k0
    public final int B(int i3) {
        return this.f21160l.following(i3);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC1853k0
    public final int C(int i3) {
        return this.f21160l.preceding(i3);
    }
}
