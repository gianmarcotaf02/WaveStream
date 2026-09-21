package io.sentry.android.replay;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Ljava/lang/reflect/Field;", "invoke"}, k = 3, mv = {1, 6, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class WindowManagerSpy$mViewsField$2 extends kotlin.jvm.internal.o implements kotlin.jvm.functions.Function0 {
    public static final io.sentry.android.replay.WindowManagerSpy$mViewsField$2 INSTANCE = new io.sentry.android.replay.WindowManagerSpy$mViewsField$2();

    public WindowManagerSpy$mViewsField$2() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final java.lang.reflect.Field invoke() throws java.lang.NoSuchFieldException {
        java.lang.Class windowManagerClass = io.sentry.android.replay.WindowManagerSpy.INSTANCE.getWindowManagerClass();
        if (windowManagerClass == null) {
            return null;
        }
        java.lang.reflect.Field declaredField = windowManagerClass.getDeclaredField("mViews");
        declaredField.setAccessible(true);
        return declaredField;
    }
}
