package androidx.lifecycle;

/* JADX INFO: loaded from: classes.dex */
public abstract class Q {
    /* JADX WARN: Multi-variable type inference failed */
    public static void a(android.app.Activity activity, androidx.lifecycle.EnumC1532n event) {
        kotlin.jvm.internal.m.e(event, "event");
        if (activity instanceof androidx.lifecycle.InterfaceC1540w) {
            androidx.lifecycle.AbstractC1534p lifecycle = ((androidx.lifecycle.InterfaceC1540w) activity).getLifecycle();
            if (lifecycle instanceof androidx.lifecycle.C1542y) {
                ((androidx.lifecycle.C1542y) lifecycle).e(event);
            }
        }
    }

    public static void b(android.app.Activity activity) {
        if (android.os.Build.VERSION.SDK_INT >= 29) {
            androidx.lifecycle.T.a.Companion.getClass();
            activity.registerActivityLifecycleCallbacks(new androidx.lifecycle.T.a());
        }
        android.app.FragmentManager fragmentManager = activity.getFragmentManager();
        if (fragmentManager.findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag") == null) {
            fragmentManager.beginTransaction().add(new androidx.lifecycle.T(), "androidx.lifecycle.LifecycleDispatcher.report_fragment_tag").commit();
            fragmentManager.executePendingTransactions();
        }
    }
}
