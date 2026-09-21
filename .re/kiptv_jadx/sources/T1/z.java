package T1;

/* JADX INFO: loaded from: classes.dex */
public final class z implements android.text.Spannable {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f9729h = false;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public android.text.Spannable f9730i;

    public z(android.text.Spannable spannable) {
        this.f9730i = spannable;
    }

    public final void a() {
        android.text.Spannable spannable = this.f9730i;
        if (!this.f9729h) {
            if ((android.os.Build.VERSION.SDK_INT < 28 ? new B3.o(28) : new T1.y(28)).p(spannable)) {
                this.f9730i = new android.text.SpannableString(spannable);
            }
        }
        this.f9729h = true;
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i3) {
        return this.f9730i.charAt(i3);
    }

    @Override // java.lang.CharSequence
    public final java.util.stream.IntStream chars() {
        return this.f9730i.chars();
    }

    @Override // java.lang.CharSequence
    public final java.util.stream.IntStream codePoints() {
        return this.f9730i.codePoints();
    }

    @Override // android.text.Spanned
    public final int getSpanEnd(java.lang.Object obj) {
        return this.f9730i.getSpanEnd(obj);
    }

    @Override // android.text.Spanned
    public final int getSpanFlags(java.lang.Object obj) {
        return this.f9730i.getSpanFlags(obj);
    }

    @Override // android.text.Spanned
    public final int getSpanStart(java.lang.Object obj) {
        return this.f9730i.getSpanStart(obj);
    }

    @Override // android.text.Spanned
    public final java.lang.Object[] getSpans(int i3, int i9, java.lang.Class cls) {
        return this.f9730i.getSpans(i3, i9, cls);
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.f9730i.length();
    }

    @Override // android.text.Spanned
    public final int nextSpanTransition(int i3, int i9, java.lang.Class cls) {
        return this.f9730i.nextSpanTransition(i3, i9, cls);
    }

    @Override // android.text.Spannable
    public final void removeSpan(java.lang.Object obj) {
        a();
        this.f9730i.removeSpan(obj);
    }

    @Override // android.text.Spannable
    public final void setSpan(java.lang.Object obj, int i3, int i9, int i10) {
        a();
        this.f9730i.setSpan(obj, i3, i9, i10);
    }

    @Override // java.lang.CharSequence
    public final java.lang.CharSequence subSequence(int i3, int i9) {
        return this.f9730i.subSequence(i3, i9);
    }

    @Override // java.lang.CharSequence
    public final java.lang.String toString() {
        return this.f9730i.toString();
    }
}
