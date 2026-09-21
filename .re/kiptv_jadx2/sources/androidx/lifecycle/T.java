package androidx.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.app.Fragment;
import android.os.Build;
import android.os.Bundle;
import androidx.media3.container.NalUnitUtil;
import androidx.media3.exoplayer.upstream.CmcdData;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0017\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0007"}, d2 = {"Landroidx/lifecycle/T;", "Landroid/app/Fragment;", "<init>", "()V", "androidx/lifecycle/i0", CmcdData.OBJECT_TYPE_AUDIO_ONLY, "androidx/lifecycle/Q", "lifecycle-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public class T extends Fragment {

    public static final int f16316i = 0;

    public i0 f16317h;

    public static final class a implements Application.ActivityLifecycleCallbacks {
        public static final S Companion = new S();

        public static final void registerIn(Activity activity) {
            Companion.getClass();
            kotlin.jvm.internal.m.e(activity, "activity");
            activity.registerActivityLifecycleCallbacks(new a());
        }

        @Override
        public void onActivityCreated(Activity activity, Bundle bundle) {
            kotlin.jvm.internal.m.e(activity, "activity");
        }

        @Override
        public void onActivityDestroyed(Activity activity) {
            kotlin.jvm.internal.m.e(activity, "activity");
        }

        @Override
        public void onActivityPaused(Activity activity) {
            kotlin.jvm.internal.m.e(activity, "activity");
        }

        @Override
        public void onActivityPostCreated(Activity activity, Bundle bundle) {
            kotlin.jvm.internal.m.e(activity, "activity");
            int i3 = T.f16316i;
            Q.a(activity, EnumC1532n.ON_CREATE);
        }

        @Override
        public void onActivityPostResumed(Activity activity) {
            kotlin.jvm.internal.m.e(activity, "activity");
            int i3 = T.f16316i;
            Q.a(activity, EnumC1532n.ON_RESUME);
        }

        @Override
        public void onActivityPostStarted(Activity activity) {
            kotlin.jvm.internal.m.e(activity, "activity");
            int i3 = T.f16316i;
            Q.a(activity, EnumC1532n.ON_START);
        }

        @Override
        public void onActivityPreDestroyed(Activity activity) {
            kotlin.jvm.internal.m.e(activity, "activity");
            int i3 = T.f16316i;
            Q.a(activity, EnumC1532n.ON_DESTROY);
        }

        @Override
        public void onActivityPrePaused(Activity activity) {
            kotlin.jvm.internal.m.e(activity, "activity");
            int i3 = T.f16316i;
            Q.a(activity, EnumC1532n.ON_PAUSE);
        }

        @Override
        public void onActivityPreStopped(Activity activity) {
            kotlin.jvm.internal.m.e(activity, "activity");
            int i3 = T.f16316i;
            Q.a(activity, EnumC1532n.ON_STOP);
        }

        @Override
        public void onActivityResumed(Activity activity) {
            kotlin.jvm.internal.m.e(activity, "activity");
        }

        @Override
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
            kotlin.jvm.internal.m.e(activity, "activity");
            kotlin.jvm.internal.m.e(bundle, "bundle");
        }

        @Override
        public void onActivityStarted(Activity activity) {
            kotlin.jvm.internal.m.e(activity, "activity");
        }

        @Override
        public void onActivityStopped(Activity activity) {
            kotlin.jvm.internal.m.e(activity, "activity");
        }
    }

    public final void a(EnumC1532n enumC1532n) {
        if (Build.VERSION.SDK_INT < 29) {
            Activity activity = getActivity();
            kotlin.jvm.internal.m.d(activity, "getActivity(...)");
            Q.a(activity, enumC1532n);
        }
    }

    @Override
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        a(EnumC1532n.ON_CREATE);
    }

    @Override
    public final void onDestroy() {
        super.onDestroy();
        a(EnumC1532n.ON_DESTROY);
        this.f16317h = null;
    }

    @Override
    public final void onPause() {
        super.onPause();
        a(EnumC1532n.ON_PAUSE);
    }

    @Override
    public final void onResume() {
        super.onResume();
        i0 i0Var = this.f16317h;
        if (i0Var != null) {
            ((ProcessLifecycleOwner) i0Var.f16361a).b();
        }
        a(EnumC1532n.ON_RESUME);
    }

    @Override
    public final void onStart() {
        super.onStart();
        i0 i0Var = this.f16317h;
        if (i0Var != null) {
            ProcessLifecycleOwner processLifecycleOwner = (ProcessLifecycleOwner) i0Var.f16361a;
            int i3 = processLifecycleOwner.f16309h + 1;
            processLifecycleOwner.f16309h = i3;
            if (i3 == 1 && processLifecycleOwner.f16311k) {
                processLifecycleOwner.f16313m.e(EnumC1532n.ON_START);
                processLifecycleOwner.f16311k = false;
            }
        }
        a(EnumC1532n.ON_START);
    }

    @Override
    public final void onStop() {
        super.onStop();
        a(EnumC1532n.ON_STOP);
    }
}
