package p020c0;

/* JADX INFO: loaded from: classes.dex */
public final class R0 extends p121o0.v {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public java.lang.Object f18187c;

    public R0(long j, java.lang.Object obj) {
        super(j);
        this.f18187c = obj;
    }

    @Override // p121o0.v
    public final void a(p121o0.v vVar) {
        kotlin.jvm.internal.m.c(vVar, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableStateImpl.StateStateRecord<T of androidx.compose.runtime.SnapshotMutableStateImpl.StateStateRecord>");
        this.f18187c = ((p020c0.R0) vVar).f18187c;
    }

    @Override // p121o0.v
    public final p121o0.v b(long j) {
        return new p020c0.R0(p121o0.k.j().g(), this.f18187c);
    }
}
