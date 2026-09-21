package androidx.lifecycle;

/* JADX INFO: loaded from: classes.dex */
public final class K extends androidx.lifecycle.AbstractC1526h {
    final /* synthetic */ androidx.lifecycle.ProcessLifecycleOwner this$0;

    public static final class a extends androidx.lifecycle.AbstractC1526h {
        final /* synthetic */ androidx.lifecycle.ProcessLifecycleOwner this$0;

        public a(androidx.lifecycle.ProcessLifecycleOwner processLifecycleOwner) {
            this.this$0 = processLifecycleOwner;
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostResumed(android.app.Activity activity) {
            kotlin.jvm.internal.m.e(activity, "activity");
            this.this$0.b();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostStarted(android.app.Activity activity) {
            kotlin.jvm.internal.m.e(activity, "activity");
            androidx.lifecycle.ProcessLifecycleOwner processLifecycleOwner = this.this$0;
            int i3 = processLifecycleOwner.f16309h + 1;
            processLifecycleOwner.f16309h = i3;
            if (i3 == 1 && processLifecycleOwner.f16311k) {
                processLifecycleOwner.f16313m.e(androidx.lifecycle.EnumC1532n.ON_START);
                processLifecycleOwner.f16311k = false;
            }
        }
    }

    public K(androidx.lifecycle.ProcessLifecycleOwner processLifecycleOwner) {
        this.this$0 = processLifecycleOwner;
    }

    @Override // androidx.lifecycle.AbstractC1526h, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(android.app.Activity activity, android.os.Bundle bundle) {
        kotlin.jvm.internal.m.e(activity, "activity");
        if (android.os.Build.VERSION.SDK_INT < 29) {
            int i3 = androidx.lifecycle.T.f16316i;
            android.app.Fragment fragmentFindFragmentByTag = activity.getFragmentManager().findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag");
            kotlin.jvm.internal.m.c(fragmentFindFragmentByTag, "null cannot be cast to non-null type androidx.lifecycle.ReportFragment");
            ((androidx.lifecycle.T) fragmentFindFragmentByTag).f16317h = this.this$0.f16315o;
        }
    }

    @Override // androidx.lifecycle.AbstractC1526h, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(android.app.Activity activity) {
        kotlin.jvm.internal.m.e(activity, "activity");
        androidx.lifecycle.ProcessLifecycleOwner processLifecycleOwner = this.this$0;
        int i3 = processLifecycleOwner.f16310i - 1;
        processLifecycleOwner.f16310i = i3;
        if (i3 == 0) {
            android.os.Handler handler = processLifecycleOwner.f16312l;
            kotlin.jvm.internal.m.b(handler);
            handler.postDelayed(processLifecycleOwner.f16314n, 700L);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPreCreated(android.app.Activity activity, android.os.Bundle bundle) {
        kotlin.jvm.internal.m.e(activity, "activity");
        androidx.lifecycle.J.a(activity, new androidx.lifecycle.K.a(this.this$0));
    }

    @Override // androidx.lifecycle.AbstractC1526h, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(android.app.Activity activity) {
        kotlin.jvm.internal.m.e(activity, "activity");
        androidx.lifecycle.ProcessLifecycleOwner processLifecycleOwner = this.this$0;
        int i3 = processLifecycleOwner.f16309h - 1;
        processLifecycleOwner.f16309h = i3;
        if (i3 == 0 && processLifecycleOwner.j) {
            processLifecycleOwner.f16313m.e(androidx.lifecycle.EnumC1532n.ON_STOP);
            processLifecycleOwner.f16311k = true;
        }
    }
}
