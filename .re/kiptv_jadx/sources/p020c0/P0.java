package p020c0;

/* JADX INFO: loaded from: classes.dex */
public final class P0 extends p121o0.v {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f18183c;

    public P0(long j, int i3) {
        super(j);
        this.f18183c = i3;
    }

    @Override // p121o0.v
    public final void a(p121o0.v vVar) {
        kotlin.jvm.internal.m.c(vVar, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableIntStateImpl.IntStateStateRecord");
        this.f18183c = ((p020c0.P0) vVar).f18183c;
    }

    @Override // p121o0.v
    public final p121o0.v b(long j) {
        return new p020c0.P0(j, this.f18183c);
    }
}
