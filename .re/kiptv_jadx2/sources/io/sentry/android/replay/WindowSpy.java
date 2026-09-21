package io.sentry.android.replay;

import android.view.View;
import android.view.Window;
import androidx.media3.container.NalUnitUtil;
import com.google.common.util.concurrent.D;
import java.lang.reflect.Field;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import p070h6.h;
import p070h6.i;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR!\u0010\u000e\u001a\b\u0012\u0002\b\u0003\u0018\u00010\t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001d\u0010\u0013\u001a\u0004\u0018\u00010\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u000b\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"Lio/sentry/android/replay/WindowSpy;", "", "<init>", "()V", "Landroid/view/View;", "maybeDecorView", "Landroid/view/Window;", "pullWindow", "(Landroid/view/View;)Landroid/view/Window;", "Ljava/lang/Class;", "decorViewClass$delegate", "Lh6/h;", "getDecorViewClass", "()Ljava/lang/Class;", "decorViewClass", "Ljava/lang/reflect/Field;", "windowField$delegate", "getWindowField", "()Ljava/lang/reflect/Field;", "windowField", "sentry-android-replay_release"}, k = 1, mv = {1, 6, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class WindowSpy {
    public static final int $stable;
    public static final WindowSpy INSTANCE = new WindowSpy();

    private static final h decorViewClass;

    private static final h windowField;

    static {
        i iVar = i.j;
        decorViewClass = D.A(iVar, WindowSpy$decorViewClass$2.INSTANCE);
        windowField = D.A(iVar, WindowSpy$windowField$2.INSTANCE);
        $stable = 8;
    }

    private WindowSpy() {
    }

    public final Class<?> getDecorViewClass() {
        return (Class) decorViewClass.getValue();
    }

    private final Field getWindowField() {
        return (Field) windowField.getValue();
    }

    public final Window pullWindow(View maybeDecorView) throws IllegalAccessException {
        Field windowField2;
        m.e(maybeDecorView, "maybeDecorView");
        Class<?> decorViewClass2 = getDecorViewClass();
        if (decorViewClass2 == null || !decorViewClass2.isInstance(maybeDecorView) || (windowField2 = INSTANCE.getWindowField()) == null) {
            return null;
        }
        Object obj = windowField2.get(maybeDecorView);
        m.c(obj, "null cannot be cast to non-null type android.view.Window");
        return (Window) obj;
    }
}
