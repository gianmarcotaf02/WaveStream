package N6;

import android.text.TextUtils;
import java.util.Iterator;

public final class A implements T1.o, p068h4.t, p080i8.f {

    public final int f7358h;

    public String f7359i;

    @Override
    public String a() {
        return Y6.f.l(new StringBuilder("expected '"), this.f7359i, '\'');
    }

    @Override
    public boolean c(CharSequence charSequence, int i3, int i9, T1.w wVar) {
        if (!TextUtils.equals(charSequence.subSequence(i3, i9), this.f7359i)) {
            return true;
        }
        wVar.f9723c = (wVar.f9723c & 3) | 4;
        return false;
    }

    @Override
    public Iterator l(p068h4.u uVar, CharSequence charSequence) {
        return new p068h4.s(this, uVar, charSequence, 1);
    }

    public String toString() {
        switch (this.f7358h) {
            case 0:
                return this.f7359i;
            case 1:
            default:
                return super.toString();
            case 2:
                return Y6.f.l(new StringBuilder("<"), this.f7359i, '>');
        }
    }

    public A(String str, int i3) {
        this.f7358h = i3;
        this.f7359i = str;
    }

    public A(String expected) {
        this.f7358h = 5;
        kotlin.jvm.internal.m.e(expected, "expected");
        this.f7359i = expected;
    }

    @Override
    public Object e() {
        return this;
    }
}
