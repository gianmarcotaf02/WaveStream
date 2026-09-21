package p020c0;

import kotlin.jvm.internal.m;
import p121o0.v;

public final class P0 extends v {

    public int f18183c;

    public P0(long j, int i3) {
        super(j);
        this.f18183c = i3;
    }

    @Override
    public final void a(v vVar) {
        m.c(vVar, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableIntStateImpl.IntStateStateRecord");
        this.f18183c = ((P0) vVar).f18183c;
    }

    @Override
    public final v b(long j) {
        return new P0(j, this.f18183c);
    }
}
