package io.sentry.android.core;

import io.sentry.IScope;
import io.sentry.ITransaction;
import io.sentry.Scope;
import io.sentry.ScopeCallback;

public final class g implements ScopeCallback, Scope.IWithTransaction {

    public final int f23428h;

    public final Object f23429i;
    public final ITransaction j;

    public g(ITransaction iTransaction, IScope iScope) {
        this.f23428h = 2;
        this.j = iTransaction;
        this.f23429i = iScope;
    }

    @Override
    public void accept(ITransaction iTransaction) {
        ActivityLifecycleIntegration.lambda$clearScope$4(this.j, (IScope) this.f23429i, iTransaction);
    }

    @Override
    public void run(IScope iScope) {
        switch (this.f23428h) {
            case 0:
                ((ActivityLifecycleIntegration) this.f23429i).lambda$startTracing$2(this.j, iScope);
                break;
            default:
                ((ActivityLifecycleIntegration) this.f23429i).lambda$finishTransaction$5(this.j, iScope);
                break;
        }
    }

    public g(ActivityLifecycleIntegration activityLifecycleIntegration, ITransaction iTransaction, int i3) {
        this.f23428h = i3;
        this.f23429i = activityLifecycleIntegration;
        this.j = iTransaction;
    }
}
