package V1;

/* JADX INFO: loaded from: classes.dex */
public final class e implements android.text.InputFilter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final android.widget.TextView f10238a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public V1.d f10239b;

    public e(android.widget.TextView textView) {
        this.f10238a = textView;
    }

    @Override // android.text.InputFilter
    public final java.lang.CharSequence filter(java.lang.CharSequence charSequence, int i3, int i9, android.text.Spanned spanned, int i10, int i11) {
        android.widget.TextView textView = this.f10238a;
        if (textView.isInEditMode()) {
            return charSequence;
        }
        int iC = T1.j.a().c();
        if (iC != 0) {
            if (iC == 1) {
                if ((i11 == 0 && i10 == 0 && spanned.length() == 0 && charSequence == textView.getText()) || charSequence == null) {
                    return charSequence;
                }
                if (i3 != 0 || i9 != charSequence.length()) {
                    charSequence = charSequence.subSequence(i3, i9);
                }
                return T1.j.a().g(0, charSequence.length(), 0, charSequence);
            }
            if (iC != 3) {
                return charSequence;
            }
        }
        T1.j jVarA = T1.j.a();
        if (this.f10239b == null) {
            this.f10239b = new V1.d(textView, this);
        }
        jVarA.h(this.f10239b);
        return charSequence;
    }
}
