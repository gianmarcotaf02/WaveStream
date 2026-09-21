package p080i8;

import Y6.f;
import kotlin.jvm.internal.m;
import p055f8.b;

public final class r implements o {

    public final String f23280a;

    public r(String string) {
        m.e(string, "string");
        this.f23280a = string;
        if (string.length() <= 0) {
            throw new IllegalArgumentException("Empty string is not allowed");
        }
        if (b.a(string.charAt(0))) {
            throw new IllegalArgumentException(f.h("String '", string, "' starts with a digit").toString());
        }
        if (b.a(string.charAt(string.length() - 1))) {
            throw new IllegalArgumentException(f.h("String '", string, "' ends with a digit").toString());
        }
    }

    @Override
    public final Object a(c cVar, String str, int i3) {
        String str2 = this.f23280a;
        if (str2.length() + i3 > str.length()) {
            return new i(i3, new A8.m(20, this));
        }
        int length = str2.length();
        for (int i9 = 0; i9 < length; i9++) {
            if (str.charAt(i3 + i9) != str2.charAt(i9)) {
                return new i(i3, new q(this, str, i3, i9));
            }
        }
        return Integer.valueOf(str2.length() + i3);
    }

    public final String toString() {
        return f.l(new StringBuilder("'"), this.f23280a, '\'');
    }
}
