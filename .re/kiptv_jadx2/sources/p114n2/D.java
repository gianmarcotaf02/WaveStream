package p114n2;

import O7.x;
import com.google.android.gms.internal.play_billing.M0;
import kotlin.jvm.internal.m;

public final class D extends H {

    public final Class f25593m;

    public D(Class cls) {
        super(cls, 0);
        if (cls.isEnum()) {
            this.f25593m = cls;
            return;
        }
        throw new IllegalArgumentException((cls + " is not an Enum type.").toString());
    }

    @Override
    public final String b() {
        return this.f25593m.getName();
    }

    @Override
    public final Enum d(String str) {
        Object obj;
        Class cls = this.f25593m;
        Object[] enumConstants = cls.getEnumConstants();
        m.d(enumConstants, "getEnumConstants(...)");
        int length = enumConstants.length;
        int i3 = 0;
        while (true) {
            if (i3 >= length) {
                obj = null;
                break;
            }
            obj = enumConstants[i3];
            if (x.r0(((Enum) obj).name(), str, true)) {
                break;
            }
            i3++;
        }
        Enum r9 = (Enum) obj;
        if (r9 != null) {
            return r9;
        }
        StringBuilder sbQ = M0.q("Enum value ", str, " not found for type ");
        sbQ.append(cls.getName());
        sbQ.append('.');
        throw new IllegalArgumentException(sbQ.toString());
    }
}
