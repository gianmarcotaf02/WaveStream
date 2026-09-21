package p020c0;

/* JADX INFO: loaded from: classes.dex */
public final class O0 extends p121o0.v {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f18178c;

    public O0(long j, float f9) {
        super(j);
        this.f18178c = f9;
    }

    @Override // p121o0.v
    public final void a(p121o0.v vVar) {
        kotlin.jvm.internal.m.c(vVar, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableFloatStateImpl.FloatStateStateRecord");
        this.f18178c = ((p020c0.O0) vVar).f18178c;
    }

    @Override // p121o0.v
    public final p121o0.v b(long j) {
        return new p020c0.O0(j, this.f18178c);
    }
}
