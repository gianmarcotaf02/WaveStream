package io.sentry.android.core;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class i implements io.sentry.util.LazyEvaluator.Evaluator, io.sentry.ScopeCallback {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f23432h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f23433i;

    public /* synthetic */ i(int i3, java.lang.Object obj) {
        this.f23432h = i3;
        this.f23433i = obj;
    }

    @Override // io.sentry.util.LazyEvaluator.Evaluator
    public java.lang.Object evaluate() {
        return io.sentry.android.core.AndroidOptionsInitializer.lambda$installDefaultIntegrations$0((io.sentry.android.core.SentryAndroidOptions) this.f23433i);
    }

    @Override // io.sentry.ScopeCallback
    public void run(io.sentry.IScope iScope) {
        switch (this.f23432h) {
            case 1:
                ((io.sentry.android.core.LifecycleWatcher) this.f23433i).lambda$startSession$0(iScope);
                break;
            case 2:
                iScope.setScreen((java.lang.String) this.f23433i);
                break;
            case 3:
                io.sentry.android.core.InternalSentrySdk.lambda$getCurrentScope$0((java.util.concurrent.atomic.AtomicReference) this.f23433i, iScope);
                break;
            default:
                io.sentry.android.core.SentryAndroid.lambda$init$2((java.util.concurrent.atomic.AtomicBoolean) this.f23433i, iScope);
                break;
        }
    }
}
