package io.sentry.android.replay;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Ljava/lang/reflect/Field;", "invoke"}, k = 3, mv = {1, 6, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class WindowSpy$windowField$2 extends kotlin.jvm.internal.o implements kotlin.jvm.functions.Function0 {
    public static final io.sentry.android.replay.WindowSpy$windowField$2 INSTANCE = new io.sentry.android.replay.WindowSpy$windowField$2();

    public WindowSpy$windowField$2() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final java.lang.reflect.Field invoke() {
        java.lang.Class decorViewClass = io.sentry.android.replay.WindowSpy.INSTANCE.getDecorViewClass();
        if (decorViewClass == null) {
            return null;
        }
        try {
            java.lang.reflect.Field declaredField = decorViewClass.getDeclaredField("mWindow");
            declaredField.setAccessible(true);
            return declaredField;
        } catch (java.lang.NoSuchFieldException e6) {
            android.util.Log.d("WindowSpy", "Unexpected exception retrieving " + decorViewClass + "#mWindow on API " + android.os.Build.VERSION.SDK_INT, e6);
            return null;
        }
    }
}
