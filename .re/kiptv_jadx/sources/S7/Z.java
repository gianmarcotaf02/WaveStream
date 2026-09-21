package S7;

/* JADX INFO: loaded from: classes4.dex */
public final class Z extends S7.Y implements S7.H {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final java.util.concurrent.ExecutorService f9565i;

    public Z(java.util.concurrent.ExecutorService executorService) {
        this.f9565i = executorService;
        if (executorService instanceof java.util.concurrent.ScheduledThreadPoolExecutor) {
            ((java.util.concurrent.ScheduledThreadPoolExecutor) executorService).setRemoveOnCancelPolicy(true);
        }
    }

    @Override // S7.H
    public final void G(long j, S7.C0895k c0895k) {
        java.util.concurrent.ExecutorService executorService = this.f9565i;
        java.util.concurrent.ScheduledFuture<?> scheduledFutureSchedule = null;
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService = executorService instanceof java.util.concurrent.ScheduledExecutorService ? (java.util.concurrent.ScheduledExecutorService) executorService : null;
        if (scheduledExecutorService != null) {
            try {
                scheduledFutureSchedule = scheduledExecutorService.schedule(new com.google.common.util.concurrent.C(this, c0895k, 9), j, java.util.concurrent.TimeUnit.MILLISECONDS);
            } catch (java.util.concurrent.RejectedExecutionException e6) {
                S7.C.k(c0895k.f9592l, S7.C.a("The task was rejected", e6));
            }
        }
        if (scheduledFutureSchedule != null) {
            c0895k.u(new S7.C0890h(0, scheduledFutureSchedule));
        } else {
            S7.D.f9535p.G(j, c0895k);
        }
    }

    @Override // S7.H
    public final S7.O T(long j, java.lang.Runnable runnable, p100l6.h hVar) {
        java.util.concurrent.ExecutorService executorService = this.f9565i;
        java.util.concurrent.ScheduledFuture<?> scheduledFutureSchedule = null;
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService = executorService instanceof java.util.concurrent.ScheduledExecutorService ? (java.util.concurrent.ScheduledExecutorService) executorService : null;
        if (scheduledExecutorService != null) {
            try {
                scheduledFutureSchedule = scheduledExecutorService.schedule(runnable, j, java.util.concurrent.TimeUnit.MILLISECONDS);
            } catch (java.util.concurrent.RejectedExecutionException e6) {
                S7.C.k(hVar, S7.C.a("The task was rejected", e6));
            }
        }
        return scheduledFutureSchedule != null ? new S7.N(scheduledFutureSchedule) : S7.D.f9535p.T(j, runnable, hVar);
    }

    @Override // S7.AbstractC0906w
    public final void V(p100l6.h hVar, java.lang.Runnable runnable) {
        try {
            this.f9565i.execute(runnable);
        } catch (java.util.concurrent.RejectedExecutionException e6) {
            S7.C.k(hVar, S7.C.a("The task was rejected", e6));
            Z7.e eVar = S7.M.f9549a;
            Z7.d.f13044i.V(hVar, runnable);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        java.util.concurrent.ExecutorService executorService = this.f9565i;
        if (executorService == null) {
            executorService = null;
        }
        if (executorService != null) {
            executorService.shutdown();
        }
    }

    public final boolean equals(java.lang.Object obj) {
        return (obj instanceof S7.Z) && ((S7.Z) obj).f9565i == this.f9565i;
    }

    public final int hashCode() {
        return java.lang.System.identityHashCode(this.f9565i);
    }

    @Override // S7.AbstractC0906w
    public final java.lang.String toString() {
        return this.f9565i.toString();
    }
}
