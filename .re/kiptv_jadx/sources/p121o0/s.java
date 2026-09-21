package p121o0;

/* JADX INFO: loaded from: classes.dex */
public final class s extends p121o0.v {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public p056g0.c f26022c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f26023d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f26024e;

    public s(long j, p056g0.c cVar) {
        super(j);
        this.f26022c = cVar;
    }

    @Override // p121o0.v
    public final void a(p121o0.v vVar) {
        synchronized (p121o0.o.f26002a) {
            kotlin.jvm.internal.m.c(vVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.StateListStateRecord>");
            this.f26022c = ((p121o0.s) vVar).f26022c;
            this.f26023d = ((p121o0.s) vVar).f26023d;
            this.f26024e = ((p121o0.s) vVar).f26024e;
        }
    }

    @Override // p121o0.v
    public final p121o0.v b(long j) {
        return new p121o0.s(j, this.f26022c);
    }
}
