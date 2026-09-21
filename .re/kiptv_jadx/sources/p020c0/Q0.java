package p020c0;

/* JADX INFO: loaded from: classes.dex */
public final class Q0 extends p121o0.v {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f18186c;

    public Q0(long j, long j9) {
        super(j);
        this.f18186c = j9;
    }

    @Override // p121o0.v
    public final void a(p121o0.v vVar) {
        kotlin.jvm.internal.m.c(vVar, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableLongStateImpl.LongStateStateRecord");
        this.f18186c = ((p020c0.Q0) vVar).f18186c;
    }

    @Override // p121o0.v
    public final p121o0.v b(long j) {
        return new p020c0.Q0(j, this.f18186c);
    }
}
