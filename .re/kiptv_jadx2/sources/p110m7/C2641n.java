package p110m7;

import B2.a;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public final class C2641n {

    public final AbstractC2639l f25497a;

    public final Object f25498b;

    public final o f25499c;

    public final C2640m f25500d;

    public final Method f25501e;

    public C2641n(AbstractC2639l abstractC2639l, Object obj, o oVar, C2640m c2640m, Class cls) {
        if (abstractC2639l == null) {
            throw new IllegalArgumentException("Null containingTypeDefaultInstance");
        }
        if (c2640m.f25496i == M.f25455m && oVar == null) {
            throw new IllegalArgumentException("Null messageDefaultInstance");
        }
        this.f25497a = abstractC2639l;
        this.f25498b = obj;
        this.f25499c = oVar;
        this.f25500d = c2640m;
        if (!p.class.isAssignableFrom(cls)) {
            this.f25501e = null;
            return;
        }
        try {
            this.f25501e = cls.getMethod("valueOf", Integer.TYPE);
        } catch (NoSuchMethodException e6) {
            String name = cls.getName();
            throw new RuntimeException(a.o(new StringBuilder(name.length() + 52), "Generated message class \"", name, "\" missing method \"valueOf\"."), e6);
        }
    }

    public final Object a(Object obj) {
        if (this.f25500d.f25496i.f25458h != N.ENUM) {
            return obj;
        }
        try {
            return this.f25501e.invoke(null, (Integer) obj);
        } catch (IllegalAccessException e6) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e6);
        } catch (InvocationTargetException e9) {
            Throwable cause = e9.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
        }
    }

    public final Object b(Object obj) {
        return this.f25500d.f25496i.f25458h == N.ENUM ? Integer.valueOf(((p) obj).a()) : obj;
    }
}
