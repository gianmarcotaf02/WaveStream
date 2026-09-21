package E7;

import C7.AbstractC0191x;
import C7.B;
import C7.I;
import C7.M;
import C7.a0;
import java.util.Arrays;
import java.util.List;
import p180v7.o;

public final class i extends B {

    public final M f3241i;
    public final g j;

    public final k f3242k;

    public final List f3243l;

    public final boolean f3244m;

    public final String[] f3245n;

    public final String f3246o;

    public i(M m8, g gVar, k kind, List arguments, boolean z6, String... formatParams) {
        kotlin.jvm.internal.m.e(kind, "kind");
        kotlin.jvm.internal.m.e(arguments, "arguments");
        kotlin.jvm.internal.m.e(formatParams, "formatParams");
        this.f3241i = m8;
        this.j = gVar;
        this.f3242k = kind;
        this.f3243l = arguments;
        this.f3244m = z6;
        this.f3245n = formatParams;
        Object[] objArrCopyOf = Arrays.copyOf(formatParams, formatParams.length);
        this.f3246o = String.format(kind.f3277h, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
    }

    @Override
    public final a0 A0(I newAttributes) {
        kotlin.jvm.internal.m.e(newAttributes, "newAttributes");
        return this;
    }

    @Override
    public final B y0(boolean z6) {
        String[] strArr = this.f3245n;
        return new i(this.f3241i, this.j, this.f3242k, this.f3243l, z6, (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    @Override
    public final B A0(I newAttributes) {
        kotlin.jvm.internal.m.e(newAttributes, "newAttributes");
        return this;
    }

    @Override
    public final o N() {
        return this.j;
    }

    @Override
    public final List s0() {
        return this.f3243l;
    }

    @Override
    public final I t0() {
        I.f1547i.getClass();
        return I.j;
    }

    @Override
    public final M u0() {
        return this.f3241i;
    }

    @Override
    public final boolean v0() {
        return this.f3244m;
    }

    @Override
    public final AbstractC0191x z0(D7.f kotlinTypeRefiner) {
        kotlin.jvm.internal.m.e(kotlinTypeRefiner, "kotlinTypeRefiner");
        return this;
    }

    @Override
    public final a0 z0(D7.f kotlinTypeRefiner) {
        kotlin.jvm.internal.m.e(kotlinTypeRefiner, "kotlinTypeRefiner");
        return this;
    }
}
