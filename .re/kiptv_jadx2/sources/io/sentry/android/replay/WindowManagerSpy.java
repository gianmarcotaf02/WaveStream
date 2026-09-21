package io.sentry.android.replay;

import android.util.Log;
import androidx.media3.container.NalUnitUtil;
import com.google.common.util.concurrent.D;
import java.lang.reflect.Field;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import p070h6.h;
import p070h6.i;
import p194x6.j;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JC\u0010\n\u001a\u00020\t22\u0010\b\u001a.\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u0007\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u00070\u0004H\u0007¢\u0006\u0004\b\n\u0010\u000bR!\u0010\u0011\u001a\b\u0012\u0002\b\u0003\u0018\u00010\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0015\u001a\u0004\u0018\u00010\u00018BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u000e\u001a\u0004\b\u0013\u0010\u0014R\u001d\u0010\u001a\u001a\u0004\u0018\u00010\u00168BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u000e\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001b"}, d2 = {"Lio/sentry/android/replay/WindowManagerSpy;", "", "<init>", "()V", "Lkotlin/Function1;", "Ljava/util/ArrayList;", "Landroid/view/View;", "Lkotlin/collections/ArrayList;", "swap", "Lh6/A;", "swapWindowManagerGlobalMViews", "(Lx6/j;)V", "Ljava/lang/Class;", "windowManagerClass$delegate", "Lh6/h;", "getWindowManagerClass", "()Ljava/lang/Class;", "windowManagerClass", "windowManagerInstance$delegate", "getWindowManagerInstance", "()Ljava/lang/Object;", "windowManagerInstance", "Ljava/lang/reflect/Field;", "mViewsField$delegate", "getMViewsField", "()Ljava/lang/reflect/Field;", "mViewsField", "sentry-android-replay_release"}, k = 1, mv = {1, 6, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class WindowManagerSpy {
    public static final int $stable;
    public static final WindowManagerSpy INSTANCE = new WindowManagerSpy();

    private static final h mViewsField;

    private static final h windowManagerClass;

    private static final h windowManagerInstance;

    static {
        i iVar = i.j;
        windowManagerClass = D.A(iVar, WindowManagerSpy$windowManagerClass$2.INSTANCE);
        windowManagerInstance = D.A(iVar, WindowManagerSpy$windowManagerInstance$2.INSTANCE);
        mViewsField = D.A(iVar, WindowManagerSpy$mViewsField$2.INSTANCE);
        $stable = 8;
    }

    private WindowManagerSpy() {
    }

    private final Field getMViewsField() {
        return (Field) mViewsField.getValue();
    }

    public final Class<?> getWindowManagerClass() {
        return (Class) windowManagerClass.getValue();
    }

    private final Object getWindowManagerInstance() {
        return windowManagerInstance.getValue();
    }

    public final void swapWindowManagerGlobalMViews(j swap) {
        Field mViewsField2;
        m.e(swap, "swap");
        try {
            Object windowManagerInstance2 = getWindowManagerInstance();
            if (windowManagerInstance2 == null || (mViewsField2 = INSTANCE.getMViewsField()) == null) {
                return;
            }
            Object obj = mViewsField2.get(windowManagerInstance2);
            m.c(obj, "null cannot be cast to non-null type java.util.ArrayList<android.view.View>{ kotlin.collections.TypeAliasesKt.ArrayList<android.view.View> }");
            mViewsField2.set(windowManagerInstance2, swap.invoke((ArrayList) obj));
        } catch (Throwable th) {
            Log.w("WindowManagerSpy", th);
        }
    }
}
