package io.sentry.android.core;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class g implements io.sentry.ScopeCallback, io.sentry.Scope.IWithTransaction {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f23428h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f23429i;
    public final /* synthetic */ io.sentry.ITransaction j;

    public /* synthetic */ g(io.sentry.ITransaction iTransaction, io.sentry.IScope iScope) {
        this.f23428h = 2;
        this.j = iTransaction;
        this.f23429i = iScope;
    }

    @Override // io.sentry.Scope.IWithTransaction
    public void accept(io.sentry.ITransaction iTransaction) {
        io.sentry.android.core.ActivityLifecycleIntegration.lambda$clearScope$4(this.j, (io.sentry.IScope) this.f23429i, iTransaction);
    }

    @Override // io.sentry.ScopeCallback
    public void run(io.sentry.IScope iScope) {
        switch (this.f23428h) {
            case 0:
                ((io.sentry.android.core.ActivityLifecycleIntegration) this.f23429i).lambda$startTracing$2(this.j, iScope);
                break;
            default:
                ((io.sentry.android.core.ActivityLifecycleIntegration) this.f23429i).lambda$finishTransaction$5(this.j, iScope);
                break;
        }
    }

    public /* synthetic */ g(io.sentry.android.core.ActivityLifecycleIntegration activityLifecycleIntegration, io.sentry.ITransaction iTransaction, int i3) {
        this.f23428h = i3;
        this.f23429i = activityLifecycleIntegration;
        this.j = iTransaction;
    }
}
