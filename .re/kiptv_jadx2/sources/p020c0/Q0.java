package p020c0;

import kotlin.jvm.internal.m;
import p121o0.v;

public final class Q0 extends v {

    public long f18186c;

    public Q0(long j, long j9) {
        super(j);
        this.f18186c = j9;
    }

    @Override
    public final void a(v vVar) {
        m.c(vVar, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableLongStateImpl.LongStateStateRecord");
        this.f18186c = ((Q0) vVar).f18186c;
    }

    @Override
    public final v b(long j) {
        return new Q0(j, this.f18186c);
    }
}
