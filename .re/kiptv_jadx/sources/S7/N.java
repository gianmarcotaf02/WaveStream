package S7;

/* JADX INFO: loaded from: classes4.dex */
public final class N implements S7.O {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final java.util.concurrent.ScheduledFuture f9551h;

    public N(java.util.concurrent.ScheduledFuture scheduledFuture) {
        this.f9551h = scheduledFuture;
    }

    @Override // S7.O
    public final void dispose() {
        this.f9551h.cancel(false);
    }

    public final java.lang.String toString() {
        return "DisposableFutureHandle[" + this.f9551h + ']';
    }
}
