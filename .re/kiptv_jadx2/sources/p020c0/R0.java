package p020c0;

import kotlin.jvm.internal.m;
import p121o0.k;
import p121o0.v;

public final class R0 extends v {

    public Object f18187c;

    public R0(long j, Object obj) {
        super(j);
        this.f18187c = obj;
    }

    @Override
    public final void a(v vVar) {
        m.c(vVar, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableStateImpl.StateStateRecord<T of androidx.compose.runtime.SnapshotMutableStateImpl.StateStateRecord>");
        this.f18187c = ((R0) vVar).f18187c;
    }

    @Override
    public final v b(long j) {
        return new R0(k.j().g(), this.f18187c);
    }
}
