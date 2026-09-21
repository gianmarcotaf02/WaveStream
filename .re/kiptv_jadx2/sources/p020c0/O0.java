package p020c0;

import kotlin.jvm.internal.m;
import p121o0.v;

public final class O0 extends v {

    public float f18178c;

    public O0(long j, float f9) {
        super(j);
        this.f18178c = f9;
    }

    @Override
    public final void a(v vVar) {
        m.c(vVar, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableFloatStateImpl.FloatStateStateRecord");
        this.f18178c = ((O0) vVar).f18178c;
    }

    @Override
    public final v b(long j) {
        return new O0(j, this.f18178c);
    }
}
