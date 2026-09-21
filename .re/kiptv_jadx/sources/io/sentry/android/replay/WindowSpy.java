package io.sentry.android.replay;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR!\u0010\u000e\u001a\b\u0012\u0002\b\u0003\u0018\u00010\t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001d\u0010\u0013\u001a\u0004\u0018\u00010\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u000b\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"Lio/sentry/android/replay/WindowSpy;", "", "<init>", "()V", "Landroid/view/View;", "maybeDecorView", "Landroid/view/Window;", "pullWindow", "(Landroid/view/View;)Landroid/view/Window;", "Ljava/lang/Class;", "decorViewClass$delegate", "Lh6/h;", "getDecorViewClass", "()Ljava/lang/Class;", "decorViewClass", "Ljava/lang/reflect/Field;", "windowField$delegate", "getWindowField", "()Ljava/lang/reflect/Field;", "windowField", "sentry-android-replay_release"}, k = 1, mv = {1, 6, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class WindowSpy {
    public static final int $stable;
    public static final io.sentry.android.replay.WindowSpy INSTANCE = new io.sentry.android.replay.WindowSpy();

    /* JADX INFO: renamed from: decorViewClass$delegate, reason: from kotlin metadata */
    private static final p070h6.h decorViewClass;

    /* JADX INFO: renamed from: windowField$delegate, reason: from kotlin metadata */
    private static final p070h6.h windowField;

    static {
        p070h6.i iVar = p070h6.i.j;
        decorViewClass = com.google.common.util.concurrent.D.A(iVar, io.sentry.android.replay.WindowSpy$decorViewClass$2.INSTANCE);
        windowField = com.google.common.util.concurrent.D.A(iVar, io.sentry.android.replay.WindowSpy$windowField$2.INSTANCE);
        $stable = 8;
    }

    private WindowSpy() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final java.lang.Class<?> getDecorViewClass() {
        return (java.lang.Class) decorViewClass.getValue();
    }

    private final java.lang.reflect.Field getWindowField() {
        return (java.lang.reflect.Field) windowField.getValue();
    }

    public final android.view.Window pullWindow(android.view.View maybeDecorView) throws java.lang.IllegalAccessException {
        java.lang.reflect.Field windowField2;
        kotlin.jvm.internal.m.e(maybeDecorView, "maybeDecorView");
        java.lang.Class<?> decorViewClass2 = getDecorViewClass();
        if (decorViewClass2 == null || !decorViewClass2.isInstance(maybeDecorView) || (windowField2 = INSTANCE.getWindowField()) == null) {
            return null;
        }
        java.lang.Object obj = windowField2.get(maybeDecorView);
        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type android.view.Window");
        return (android.view.Window) obj;
    }
}
