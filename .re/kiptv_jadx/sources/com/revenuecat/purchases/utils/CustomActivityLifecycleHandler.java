package com.revenuecat.purchases.utils;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b`\u0018\u00002\u00020\u0001J!\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\nJ\u0017\u0010\f\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\f\u0010\nJ\u0017\u0010\r\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\nJ\u001f\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000f\u0010\bJ\u0017\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\n¨\u0006\u0011À\u0006\u0003"}, d2 = {"Lcom/revenuecat/purchases/utils/CustomActivityLifecycleHandler;", "Landroid/app/Application$ActivityLifecycleCallbacks;", "Landroid/app/Activity;", "activity", "Landroid/os/Bundle;", "savedInstanceState", "Lh6/A;", "onActivityCreated", "(Landroid/app/Activity;Landroid/os/Bundle;)V", "onActivityStarted", "(Landroid/app/Activity;)V", "onActivityResumed", "onActivityPaused", "onActivityStopped", "outState", "onActivitySaveInstanceState", "onActivityDestroyed", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public interface CustomActivityLifecycleHandler extends android.app.Application.ActivityLifecycleCallbacks {

    @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class DefaultImpls {
        @java.lang.Deprecated
        public static void onActivityCreated(com.revenuecat.purchases.utils.CustomActivityLifecycleHandler customActivityLifecycleHandler, android.app.Activity activity, android.os.Bundle bundle) {
            kotlin.jvm.internal.m.e(activity, "activity");
            com.revenuecat.purchases.utils.CustomActivityLifecycleHandler.super.onActivityCreated(activity, bundle);
        }

        @java.lang.Deprecated
        public static void onActivityDestroyed(com.revenuecat.purchases.utils.CustomActivityLifecycleHandler customActivityLifecycleHandler, android.app.Activity activity) {
            kotlin.jvm.internal.m.e(activity, "activity");
            com.revenuecat.purchases.utils.CustomActivityLifecycleHandler.super.onActivityDestroyed(activity);
        }

        @java.lang.Deprecated
        public static void onActivityPaused(com.revenuecat.purchases.utils.CustomActivityLifecycleHandler customActivityLifecycleHandler, android.app.Activity activity) {
            kotlin.jvm.internal.m.e(activity, "activity");
            com.revenuecat.purchases.utils.CustomActivityLifecycleHandler.super.onActivityPaused(activity);
        }

        @java.lang.Deprecated
        public static void onActivityResumed(com.revenuecat.purchases.utils.CustomActivityLifecycleHandler customActivityLifecycleHandler, android.app.Activity activity) {
            kotlin.jvm.internal.m.e(activity, "activity");
            com.revenuecat.purchases.utils.CustomActivityLifecycleHandler.super.onActivityResumed(activity);
        }

        @java.lang.Deprecated
        public static void onActivitySaveInstanceState(com.revenuecat.purchases.utils.CustomActivityLifecycleHandler customActivityLifecycleHandler, android.app.Activity activity, android.os.Bundle outState) {
            kotlin.jvm.internal.m.e(activity, "activity");
            kotlin.jvm.internal.m.e(outState, "outState");
            com.revenuecat.purchases.utils.CustomActivityLifecycleHandler.super.onActivitySaveInstanceState(activity, outState);
        }

        @java.lang.Deprecated
        public static void onActivityStarted(com.revenuecat.purchases.utils.CustomActivityLifecycleHandler customActivityLifecycleHandler, android.app.Activity activity) {
            kotlin.jvm.internal.m.e(activity, "activity");
            com.revenuecat.purchases.utils.CustomActivityLifecycleHandler.super.onActivityStarted(activity);
        }

        @java.lang.Deprecated
        public static void onActivityStopped(com.revenuecat.purchases.utils.CustomActivityLifecycleHandler customActivityLifecycleHandler, android.app.Activity activity) {
            kotlin.jvm.internal.m.e(activity, "activity");
            com.revenuecat.purchases.utils.CustomActivityLifecycleHandler.super.onActivityStopped(activity);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    default void onActivityCreated(android.app.Activity activity, android.os.Bundle savedInstanceState) {
        kotlin.jvm.internal.m.e(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    default void onActivityDestroyed(android.app.Activity activity) {
        kotlin.jvm.internal.m.e(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    default void onActivityPaused(android.app.Activity activity) {
        kotlin.jvm.internal.m.e(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    default void onActivityResumed(android.app.Activity activity) {
        kotlin.jvm.internal.m.e(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    default void onActivitySaveInstanceState(android.app.Activity activity, android.os.Bundle outState) {
        kotlin.jvm.internal.m.e(activity, "activity");
        kotlin.jvm.internal.m.e(outState, "outState");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    default void onActivityStarted(android.app.Activity activity) {
        kotlin.jvm.internal.m.e(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    default void onActivityStopped(android.app.Activity activity) {
        kotlin.jvm.internal.m.e(activity, "activity");
    }
}
