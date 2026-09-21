package R6;

import N6.Z;
import N6.c0;
import N6.d0;
import N6.e0;
import N6.h0;
import N6.i0;
import kotlin.jvm.internal.m;
import p086j6.e;

public final class b extends i0 {

    public static final b f9073k = new b("protected_and_package", true);

    @Override
    public final Integer a(i0 visibility) {
        m.e(visibility, "visibility");
        if (equals(visibility)) {
            return 0;
        }
        if (visibility == Z.f7381k) {
            return null;
        }
        e eVar = h0.f7397a;
        return visibility == c0.f7384k || visibility == d0.f7387k ? 1 : -1;
    }

    @Override
    public final String d() {
        return "protected/*protected and package*/";
    }

    @Override
    public final i0 k() {
        return e0.f7388k;
    }
}
