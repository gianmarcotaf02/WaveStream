package io.sentry.android.replay;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u001a\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u00028@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"phoneWindow", "Landroid/view/Window;", "Landroid/view/View;", "getPhoneWindow", "(Landroid/view/View;)Landroid/view/Window;", "sentry-android-replay_release"}, k = 2, mv = {1, 6, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class WindowsKt {
    public static final android.view.Window getPhoneWindow(android.view.View view) {
        kotlin.jvm.internal.m.e(view, "<this>");
        io.sentry.android.replay.WindowSpy windowSpy = io.sentry.android.replay.WindowSpy.INSTANCE;
        android.view.View rootView = view.getRootView();
        kotlin.jvm.internal.m.d(rootView, "rootView");
        return windowSpy.pullWindow(rootView);
    }
}
