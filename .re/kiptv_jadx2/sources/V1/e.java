package V1;

import android.text.InputFilter;
import android.text.Spanned;
import android.widget.TextView;

public final class e implements InputFilter {

    public final TextView f10238a;

    public d f10239b;

    public e(TextView textView) {
        this.f10238a = textView;
    }

    @Override
    public final CharSequence filter(CharSequence charSequence, int i3, int i9, Spanned spanned, int i10, int i11) {
        TextView textView = this.f10238a;
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
            this.f10239b = new d(textView, this);
        }
        jVarA.h(this.f10239b);
        return charSequence;
    }
}
