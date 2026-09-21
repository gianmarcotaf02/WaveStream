package io.sentry.android.core;

import io.sentry.IScope;
import io.sentry.ScopeCallback;
import io.sentry.util.LazyEvaluator;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

public final class i implements LazyEvaluator.Evaluator, ScopeCallback {

    public final int f23432h;

    public final Object f23433i;

    public i(int i3, Object obj) {
        this.f23432h = i3;
        this.f23433i = obj;
    }

    @Override
    public Object evaluate() {
        return AndroidOptionsInitializer.lambda$installDefaultIntegrations$0((SentryAndroidOptions) this.f23433i);
    }

    @Override
    public void run(IScope iScope) {
        switch (this.f23432h) {
            case 1:
                ((LifecycleWatcher) this.f23433i).lambda$startSession$0(iScope);
                break;
            case 2:
                iScope.setScreen((String) this.f23433i);
                break;
            case 3:
                InternalSentrySdk.lambda$getCurrentScope$0((AtomicReference) this.f23433i, iScope);
                break;
            default:
                SentryAndroid.lambda$init$2((AtomicBoolean) this.f23433i, iScope);
                break;
        }
    }
}
