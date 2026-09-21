package p146r1;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.o;
import p070h6.A;
import p113n1.l;

public final class z extends o implements Function0 {

    public final kotlin.jvm.internal.z f26794h;

    public final A f26795i;
    public final l j;

    public final long f26796k;

    public final long f26797l;

    public z(kotlin.jvm.internal.z zVar, A a2, l lVar, long j, long j9) {
        super(0);
        this.f26794h = zVar;
        this.f26795i = a2;
        this.j = lVar;
        this.f26796k = j;
        this.f26797l = j9;
    }

    @Override
    public final Object invoke() {
        A a2 = this.f26795i;
        this.f26794h.f24556h = a2.getPositionProvider().b(this.j, this.f26796k, a2.getParentLayoutDirection(), this.f26797l);
        return A.f22523a;
    }
}
