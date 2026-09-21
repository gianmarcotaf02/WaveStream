package y7;

import C7.AbstractC0191x;
import N6.EnumC0711z;
import N6.InterfaceC0689c;
import N6.InterfaceC0691e;
import java.util.ArrayList;
import p062g7.Q;

public final class k implements n, p, o {

    public static final k f32064c = new k(0);

    public static final k f32065d = new k(1);

    public static final k f32066e = new k(2);

    public static final k f32067f = new k(3);
    public static final k g = new k(4);

    public final int f32068b;

    public k(int i3) {
        this.f32068b = i3;
    }

    public static void e(int i3) {
        Object[] objArr = new Object[3];
        if (i3 != 1) {
            objArr[0] = "descriptor";
        } else {
            objArr[0] = "unresolvedSuperClasses";
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/serialization/deserialization/ErrorReporter$1";
        if (i3 != 2) {
            objArr[2] = "reportIncompleteHierarchy";
        } else {
            objArr[2] = "reportCannotInferVisibility";
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    public static EnumC0711z f(p062g7.A a2) {
        int i3 = a2 == null ? -1 : y.f32105a[a2.ordinal()];
        if (i3 == 1) {
            return EnumC0711z.f7427i;
        }
        if (i3 == 2) {
            return EnumC0711z.f7428k;
        }
        if (i3 != 3) {
            return i3 != 4 ? EnumC0711z.f7427i : EnumC0711z.j;
        }
        return EnumC0711z.f7429l;
    }

    @Override
    public void a(InterfaceC0691e interfaceC0691e, ArrayList arrayList) {
        if (interfaceC0691e != null) {
            return;
        }
        e(0);
        throw null;
    }

    @Override
    public void b(InterfaceC0689c interfaceC0689c) {
        if (interfaceC0689c != null) {
            return;
        }
        e(2);
        throw null;
    }

    @Override
    public AbstractC0191x c(Q proto, String flexibleId, C7.B lowerBound, C7.B upperBound) {
        kotlin.jvm.internal.m.e(proto, "proto");
        kotlin.jvm.internal.m.e(flexibleId, "flexibleId");
        kotlin.jvm.internal.m.e(lowerBound, "lowerBound");
        kotlin.jvm.internal.m.e(upperBound, "upperBound");
        throw new IllegalArgumentException("This method should not be used.");
    }

    @Override
    public Boolean d() {
        switch (this.f32068b) {
            case 1:
                return null;
            default:
                return Boolean.TRUE;
        }
    }
}
