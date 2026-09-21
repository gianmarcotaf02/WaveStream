package androidx.lifecycle;

import android.app.Activity;
import android.app.Fragment;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;

public final class K extends AbstractC1526h {
    final ProcessLifecycleOwner this$0;

    public static final class a extends AbstractC1526h {
        final ProcessLifecycleOwner this$0;

        public a(ProcessLifecycleOwner processLifecycleOwner) {
            this.this$0 = processLifecycleOwner;
        }

        @Override
        public void onActivityPostResumed(Activity activity) {
            kotlin.jvm.internal.m.e(activity, "activity");
            this.this$0.b();
        }

        @Override
        public void onActivityPostStarted(Activity activity) {
            kotlin.jvm.internal.m.e(activity, "activity");
            ProcessLifecycleOwner processLifecycleOwner = this.this$0;
            int i3 = processLifecycleOwner.f16309h + 1;
            processLifecycleOwner.f16309h = i3;
            if (i3 == 1 && processLifecycleOwner.f16311k) {
                processLifecycleOwner.f16313m.e(EnumC1532n.ON_START);
                processLifecycleOwner.f16311k = false;
            }
        }
    }

    public K(ProcessLifecycleOwner processLifecycleOwner) {
        this.this$0 = processLifecycleOwner;
    }

    @Override
    public void onActivityCreated(Activity activity, Bundle bundle) {
        kotlin.jvm.internal.m.e(activity, "activity");
        if (Build.VERSION.SDK_INT < 29) {
            int i3 = T.f16316i;
            Fragment fragmentFindFragmentByTag = activity.getFragmentManager().findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag");
            kotlin.jvm.internal.m.c(fragmentFindFragmentByTag, "null cannot be cast to non-null type androidx.lifecycle.ReportFragment");
            ((T) fragmentFindFragmentByTag).f16317h = this.this$0.f16315o;
        }
    }

    @Override
    public void onActivityPaused(Activity activity) {
        kotlin.jvm.internal.m.e(activity, "activity");
        ProcessLifecycleOwner processLifecycleOwner = this.this$0;
        int i3 = processLifecycleOwner.f16310i - 1;
        processLifecycleOwner.f16310i = i3;
        if (i3 == 0) {
            Handler handler = processLifecycleOwner.f16312l;
            kotlin.jvm.internal.m.b(handler);
            handler.postDelayed(processLifecycleOwner.f16314n, 700L);
        }
    }

    @Override
    public void onActivityPreCreated(Activity activity, Bundle bundle) {
        kotlin.jvm.internal.m.e(activity, "activity");
        J.a(activity, new a(this.this$0));
    }

    @Override
    public void onActivityStopped(Activity activity) {
        kotlin.jvm.internal.m.e(activity, "activity");
        ProcessLifecycleOwner processLifecycleOwner = this.this$0;
        int i3 = processLifecycleOwner.f16309h - 1;
        processLifecycleOwner.f16309h = i3;
        if (i3 == 0 && processLifecycleOwner.j) {
            processLifecycleOwner.f16313m.e(EnumC1532n.ON_STOP);
            processLifecycleOwner.f16311k = true;
        }
    }
}
