package p080i8;

import R0.C0811a;
import kotlin.jvm.internal.m;

public final class t implements o {

    public final C0811a f23283a;

    public final String f23284b;

    public t(C0811a c0811a, String whatThisExpects) {
        m.e(whatThisExpects, "whatThisExpects");
        this.f23283a = c0811a;
        this.f23284b = whatThisExpects;
    }

    @Override
    public final Object a(c cVar, String str, int i3) {
        if (i3 >= str.length()) {
            return Integer.valueOf(i3);
        }
        char cCharAt = str.charAt(i3);
        C0811a c0811a = this.f23283a;
        if (cCharAt == '-') {
            c0811a.invoke(cVar, Boolean.TRUE);
            return Integer.valueOf(i3 + 1);
        }
        if (cCharAt != '+') {
            return new i(i3, new s(this, cCharAt));
        }
        c0811a.invoke(cVar, Boolean.FALSE);
        return Integer.valueOf(i3 + 1);
    }

    public final String toString() {
        return this.f23284b;
    }
}
