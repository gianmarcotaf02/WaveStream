package T1;

import android.os.Build;
import android.text.Spannable;
import android.text.SpannableString;
import java.util.stream.IntStream;

public final class z implements Spannable {

    public boolean f9729h = false;

    public Spannable f9730i;

    public z(Spannable spannable) {
        this.f9730i = spannable;
    }

    public final void a() {
        Spannable spannable = this.f9730i;
        if (!this.f9729h) {
            if ((Build.VERSION.SDK_INT < 28 ? new B3.o(28) : new y(28)).p(spannable)) {
                this.f9730i = new SpannableString(spannable);
            }
        }
        this.f9729h = true;
    }

    @Override
    public final char charAt(int i3) {
        return this.f9730i.charAt(i3);
    }

    @Override
    public final IntStream chars() {
        return this.f9730i.chars();
    }

    @Override
    public final IntStream codePoints() {
        return this.f9730i.codePoints();
    }

    @Override
    public final int getSpanEnd(Object obj) {
        return this.f9730i.getSpanEnd(obj);
    }

    @Override
    public final int getSpanFlags(Object obj) {
        return this.f9730i.getSpanFlags(obj);
    }

    @Override
    public final int getSpanStart(Object obj) {
        return this.f9730i.getSpanStart(obj);
    }

    @Override
    public final Object[] getSpans(int i3, int i9, Class cls) {
        return this.f9730i.getSpans(i3, i9, cls);
    }

    @Override
    public final int length() {
        return this.f9730i.length();
    }

    @Override
    public final int nextSpanTransition(int i3, int i9, Class cls) {
        return this.f9730i.nextSpanTransition(i3, i9, cls);
    }

    @Override
    public final void removeSpan(Object obj) {
        a();
        this.f9730i.removeSpan(obj);
    }

    @Override
    public final void setSpan(Object obj, int i3, int i9, int i10) {
        a();
        this.f9730i.setSpan(obj, i3, i9, i10);
    }

    @Override
    public final CharSequence subSequence(int i3, int i9) {
        return this.f9730i.subSequence(i3, i9);
    }

    @Override
    public final String toString() {
        return this.f9730i.toString();
    }
}
