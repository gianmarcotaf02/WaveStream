package p080i8;

import B3.z;
import N6.A;
import kotlin.jvm.internal.m;
import p055f8.a;
import p063g8.r;

public final class b extends d {

    public final int f23255c = 1;

    public final Object f23256d;

    public b(String str) {
        super("the predefined string ".concat(str), Integer.valueOf(str.length()));
        this.f23256d = str;
    }

    @Override
    public final f a(c cVar, String str, int i3, int i9) {
        switch (this.f23255c) {
            case 0:
                String string = str.subSequence(i3, i9).toString();
                String str2 = (String) this.f23256d;
                if (m.a(string, str2)) {
                    return null;
                }
                return new A(str2);
            default:
                int i10 = i9 - i3;
                if (i10 < 1) {
                    return new z(1, 5);
                }
                if (i10 > 9) {
                    return new z(9, 6);
                }
                int iCharAt = 0;
                while (i3 < i9) {
                    iCharAt = (iCharAt * 10) + (str.charAt(i3) - '0');
                    i3++;
                }
                Object objR = ((r) this.f23256d).r(cVar, new a(iCharAt, i10));
                if (objR == null) {
                    return null;
                }
                return new U0.a(objR);
        }
    }

    public b(r setter, String name) {
        super(name, null);
        m.e(setter, "setter");
        m.e(name, "name");
        this.f23256d = setter;
    }
}
