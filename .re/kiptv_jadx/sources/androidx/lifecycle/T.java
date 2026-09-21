package androidx.lifecycle;

/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0017\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0007"}, d2 = {"Landroidx/lifecycle/T;", "Landroid/app/Fragment;", "<init>", "()V", "androidx/lifecycle/i0", androidx.media3.exoplayer.upstream.CmcdData.OBJECT_TYPE_AUDIO_ONLY, "androidx/lifecycle/Q", "lifecycle-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public class T extends android.app.Fragment {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ int f16316i = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public androidx.lifecycle.i0 f16317h;

    public static final class a implements android.app.Application.ActivityLifecycleCallbacks {
        public static final androidx.lifecycle.S Companion = new androidx.lifecycle.S();

        public static final void registerIn(android.app.Activity activity) {
            Companion.getClass();
            kotlin.jvm.internal.m.e(activity, "activity");
            activity.registerActivityLifecycleCallbacks(new androidx.lifecycle.T.a());
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(android.app.Activity activity, android.os.Bundle bundle) {
            kotlin.jvm.internal.m.e(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(android.app.Activity activity) {
            kotlin.jvm.internal.m.e(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(android.app.Activity activity) {
            kotlin.jvm.internal.m.e(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostCreated(android.app.Activity activity, android.os.Bundle bundle) {
            kotlin.jvm.internal.m.e(activity, "activity");
            int i3 = androidx.lifecycle.T.f16316i;
            androidx.lifecycle.Q.a(activity, androidx.lifecycle.EnumC1532n.ON_CREATE);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostResumed(android.app.Activity activity) {
            kotlin.jvm.internal.m.e(activity, "activity");
            int i3 = androidx.lifecycle.T.f16316i;
            androidx.lifecycle.Q.a(activity, androidx.lifecycle.EnumC1532n.ON_RESUME);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostStarted(android.app.Activity activity) {
            kotlin.jvm.internal.m.e(activity, "activity");
            int i3 = androidx.lifecycle.T.f16316i;
            androidx.lifecycle.Q.a(activity, androidx.lifecycle.EnumC1532n.ON_START);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPreDestroyed(android.app.Activity activity) {
            kotlin.jvm.internal.m.e(activity, "activity");
            int i3 = androidx.lifecycle.T.f16316i;
            androidx.lifecycle.Q.a(activity, androidx.lifecycle.EnumC1532n.ON_DESTROY);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPrePaused(android.app.Activity activity) {
            kotlin.jvm.internal.m.e(activity, "activity");
            int i3 = androidx.lifecycle.T.f16316i;
            androidx.lifecycle.Q.a(activity, androidx.lifecycle.EnumC1532n.ON_PAUSE);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPreStopped(android.app.Activity activity) {
            kotlin.jvm.internal.m.e(activity, "activity");
            int i3 = androidx.lifecycle.T.f16316i;
            androidx.lifecycle.Q.a(activity, androidx.lifecycle.EnumC1532n.ON_STOP);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(android.app.Activity activity) {
            kotlin.jvm.internal.m.e(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(android.app.Activity activity, android.os.Bundle bundle) {
            kotlin.jvm.internal.m.e(activity, "activity");
            kotlin.jvm.internal.m.e(bundle, "bundle");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(android.app.Activity activity) {
            kotlin.jvm.internal.m.e(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(android.app.Activity activity) {
            kotlin.jvm.internal.m.e(activity, "activity");
        }
    }

    public final void a(androidx.lifecycle.EnumC1532n enumC1532n) {
        if (android.os.Build.VERSION.SDK_INT < 29) {
            android.app.Activity activity = getActivity();
            kotlin.jvm.internal.m.d(activity, "getActivity(...)");
            androidx.lifecycle.Q.a(activity, enumC1532n);
        }
    }

    @Override // android.app.Fragment
    public final void onActivityCreated(android.os.Bundle bundle) {
        super.onActivityCreated(bundle);
        a(androidx.lifecycle.EnumC1532n.ON_CREATE);
    }

    @Override // android.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        a(androidx.lifecycle.EnumC1532n.ON_DESTROY);
        this.f16317h = null;
    }

    @Override // android.app.Fragment
    public final void onPause() {
        super.onPause();
        a(androidx.lifecycle.EnumC1532n.ON_PAUSE);
    }

    @Override // android.app.Fragment
    public final void onResume() {
        super.onResume();
        androidx.lifecycle.i0 i0Var = this.f16317h;
        if (i0Var != null) {
            ((androidx.lifecycle.ProcessLifecycleOwner) i0Var.f16361a).b();
        }
        a(androidx.lifecycle.EnumC1532n.ON_RESUME);
    }

    @Override // android.app.Fragment
    public final void onStart() {
        super.onStart();
        androidx.lifecycle.i0 i0Var = this.f16317h;
        if (i0Var != null) {
            androidx.lifecycle.ProcessLifecycleOwner processLifecycleOwner = (androidx.lifecycle.ProcessLifecycleOwner) i0Var.f16361a;
            int i3 = processLifecycleOwner.f16309h + 1;
            processLifecycleOwner.f16309h = i3;
            if (i3 == 1 && processLifecycleOwner.f16311k) {
                processLifecycleOwner.f16313m.e(androidx.lifecycle.EnumC1532n.ON_START);
                processLifecycleOwner.f16311k = false;
            }
        }
        a(androidx.lifecycle.EnumC1532n.ON_START);
    }

    @Override // android.app.Fragment
    public final void onStop() {
        super.onStop();
        a(androidx.lifecycle.EnumC1532n.ON_STOP);
    }
}
