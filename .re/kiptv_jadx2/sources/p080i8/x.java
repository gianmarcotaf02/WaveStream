package p080i8;

import B3.z;
import D6.g;
import U0.a;
import kotlin.jvm.internal.m;

public final class x extends d {

    public final Integer f23291c;

    public final Integer f23292d;

    public final a f23293e;

    public final boolean f23294f;

    public x(Integer num, Integer num2, a setter, String name, boolean z6) {
        m.e(setter, "setter");
        m.e(name, "name");
        Integer num3 = num.equals(num2) ? num : null;
        super(name, num3);
        this.f23291c = num;
        this.f23292d = num2;
        this.f23293e = setter;
        this.f23294f = z6;
        if (num3 == null || new g(1, 9, 1).d(num3.intValue())) {
            return;
        }
        throw new IllegalArgumentException(("Invalid length for field " + name + ": " + num3).toString());
    }

    @Override
    public final f a(c cVar, String str, int i3, int i9) {
        Integer numValueOf;
        Integer num = this.f23292d;
        if (num != null && i9 - i3 > num.intValue()) {
            return new z(num.intValue(), 6);
        }
        Integer num2 = this.f23291c;
        if (num2 != null && i9 - i3 < num2.intValue()) {
            return new z(num2.intValue(), 5);
        }
        int iCharAt = 0;
        while (true) {
            if (i3 >= i9) {
                numValueOf = Integer.valueOf(iCharAt);
                break;
            }
            iCharAt = (iCharAt * 10) + (str.charAt(i3) - '0');
            if (iCharAt < 0) {
                numValueOf = null;
                break;
            }
            i3++;
        }
        if (numValueOf == null) {
            return e.f23259h;
        }
        boolean z6 = this.f23294f;
        int iIntValue = numValueOf.intValue();
        if (z6) {
            iIntValue = -iIntValue;
        }
        Object objR = this.f23293e.r(cVar, Integer.valueOf(iIntValue));
        if (objR == null) {
            return null;
        }
        return new a(objR);
    }
}
