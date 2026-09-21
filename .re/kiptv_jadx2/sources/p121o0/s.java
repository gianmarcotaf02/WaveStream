package p121o0;

import kotlin.jvm.internal.m;
import p056g0.c;

public final class s extends v {

    public c f26022c;

    public int f26023d;

    public int f26024e;

    public s(long j, c cVar) {
        super(j);
        this.f26022c = cVar;
    }

    @Override
    public final void a(v vVar) {
        synchronized (o.f26002a) {
            m.c(vVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.StateListStateRecord>");
            this.f26022c = ((s) vVar).f26022c;
            this.f26023d = ((s) vVar).f26023d;
            this.f26024e = ((s) vVar).f26024e;
        }
    }

    @Override
    public final v b(long j) {
        return new s(j, this.f26022c);
    }
}
