package E1;

/* JADX INFO: loaded from: classes.dex */
public abstract class e {
    public static android.window.OnBackInvokedDispatcher a(android.app.Activity activity) {
        android.window.OnBackInvokedDispatcher onBackInvokedDispatcher = activity.getOnBackInvokedDispatcher();
        kotlin.jvm.internal.m.d(onBackInvokedDispatcher, "activity.getOnBackInvokedDispatcher()");
        return onBackInvokedDispatcher;
    }

    public static java.lang.Object b(java.lang.String str, android.os.Bundle bundle) {
        return bundle.getParcelable(str, p046f.a.class);
    }

    public static java.util.ArrayList c(android.os.Bundle bundle, java.lang.String str, java.lang.Class cls) {
        return bundle.getParcelableArrayList(str, cls);
    }

    public static java.lang.String d(android.view.accessibility.AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.getUniqueId();
    }

    public static boolean e(android.view.accessibility.AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.isTextSelectable();
    }

    public static final void f(p146r1.A a2, p019c.q qVar) {
        android.window.OnBackInvokedDispatcher onBackInvokedDispatcherFindOnBackInvokedDispatcher;
        if (qVar == null || (onBackInvokedDispatcherFindOnBackInvokedDispatcher = a2.findOnBackInvokedDispatcher()) == null) {
            return;
        }
        onBackInvokedDispatcherFindOnBackInvokedDispatcher.registerOnBackInvokedCallback(1000000, qVar);
    }

    public static final void g(p146r1.A a2, p019c.q qVar) {
        android.window.OnBackInvokedDispatcher onBackInvokedDispatcherFindOnBackInvokedDispatcher;
        if (qVar == null || (onBackInvokedDispatcherFindOnBackInvokedDispatcher = a2.findOnBackInvokedDispatcher()) == null) {
            return;
        }
        onBackInvokedDispatcherFindOnBackInvokedDispatcher.unregisterOnBackInvokedCallback(qVar);
    }

    public static void h(java.lang.Object dispatcher, java.lang.Object callback) {
        kotlin.jvm.internal.m.e(dispatcher, "dispatcher");
        kotlin.jvm.internal.m.e(callback, "callback");
        ((android.window.OnBackInvokedDispatcher) dispatcher).registerOnBackInvokedCallback(0, (android.window.OnBackInvokedCallback) callback);
    }

    public static void i(java.lang.Object dispatcher, java.lang.Object callback) {
        kotlin.jvm.internal.m.e(dispatcher, "dispatcher");
        kotlin.jvm.internal.m.e(callback, "callback");
        ((android.window.OnBackInvokedDispatcher) dispatcher).unregisterOnBackInvokedCallback((android.window.OnBackInvokedCallback) callback);
    }
}
