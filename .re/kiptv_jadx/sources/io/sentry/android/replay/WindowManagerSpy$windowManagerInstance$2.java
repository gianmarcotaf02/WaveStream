package io.sentry.android.replay;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 6, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class WindowManagerSpy$windowManagerInstance$2 extends kotlin.jvm.internal.o implements kotlin.jvm.functions.Function0 {
    public static final io.sentry.android.replay.WindowManagerSpy$windowManagerInstance$2 INSTANCE = new io.sentry.android.replay.WindowManagerSpy$windowManagerInstance$2();

    public WindowManagerSpy$windowManagerInstance$2() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final java.lang.Object invoke() {
        java.lang.reflect.Method method;
        java.lang.Class windowManagerClass = io.sentry.android.replay.WindowManagerSpy.INSTANCE.getWindowManagerClass();
        if (windowManagerClass == null || (method = windowManagerClass.getMethod("getInstance", null)) == null) {
            return null;
        }
        return method.invoke(null, null);
    }
}
