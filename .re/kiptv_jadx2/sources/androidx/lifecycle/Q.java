package androidx.lifecycle;

import android.app.Activity;
import android.app.FragmentManager;
import android.os.Build;

public abstract class Q {
    public static void a(Activity activity, EnumC1532n event) {
        kotlin.jvm.internal.m.e(event, "event");
        if (activity instanceof InterfaceC1540w) {
            AbstractC1534p lifecycle = ((InterfaceC1540w) activity).getLifecycle();
            if (lifecycle instanceof C1542y) {
                ((C1542y) lifecycle).e(event);
            }
        }
    }

    public static void b(Activity activity) {
        if (Build.VERSION.SDK_INT >= 29) {
            T.a.Companion.getClass();
            activity.registerActivityLifecycleCallbacks(new T.a());
        }
        FragmentManager fragmentManager = activity.getFragmentManager();
        if (fragmentManager.findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag") == null) {
            fragmentManager.beginTransaction().add(new T(), "androidx.lifecycle.LifecycleDispatcher.report_fragment_tag").commit();
            fragmentManager.executePendingTransactions();
        }
    }
}
