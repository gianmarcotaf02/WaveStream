package T7;

import S7.C0907x;
import S7.InterfaceC0908y;
import android.os.Build;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import p100l6.h;

public final class b extends p100l6.a implements InterfaceC0908y {
    private volatile Object _preHandler;

    public b() {
        super(C0907x.f9625h);
        this._preHandler = this;
    }

    @Override
    public final void handleException(h hVar, Throwable th) {
        Method declaredMethod;
        int i3 = Build.VERSION.SDK_INT;
        if (26 > i3 || i3 >= 28) {
            return;
        }
        Object obj = this._preHandler;
        if (obj != this) {
            declaredMethod = (Method) obj;
        } else {
            try {
                declaredMethod = Thread.class.getDeclaredMethod("getUncaughtExceptionPreHandler", null);
                if (!Modifier.isPublic(declaredMethod.getModifiers()) || !Modifier.isStatic(declaredMethod.getModifiers())) {
                    declaredMethod = null;
                }
            } catch (Throwable unused) {
            }
            this._preHandler = declaredMethod;
        }
        Object objInvoke = declaredMethod != null ? declaredMethod.invoke(null, null) : null;
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = objInvoke instanceof Thread.UncaughtExceptionHandler ? (Thread.UncaughtExceptionHandler) objInvoke : null;
        if (uncaughtExceptionHandler != null) {
            uncaughtExceptionHandler.uncaughtException(Thread.currentThread(), th);
        }
    }
}
