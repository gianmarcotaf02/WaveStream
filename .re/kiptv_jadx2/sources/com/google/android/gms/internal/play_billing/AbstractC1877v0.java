package com.google.android.gms.internal.play_billing;

import androidx.media3.common.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public abstract class AbstractC1877v0 extends AbstractC1841g0 {
    private static final Map zzb = new ConcurrentHashMap();
    protected X0 zzc;
    private int zzd;

    public AbstractC1877v0() {
        this.zza = 0;
        this.zzd = -1;
        this.zzc = X0.f19300f;
    }

    public static void f(Class cls, AbstractC1877v0 abstractC1877v0) {
        abstractC1877v0.e();
        zzb.put(cls, abstractC1877v0);
    }

    public static final boolean i(AbstractC1877v0 abstractC1877v0, boolean z6) {
        byte bByteValue = ((Byte) abstractC1877v0.j(1)).byteValue();
        if (bByteValue == 1) {
            return true;
        }
        if (bByteValue == 0) {
            return false;
        }
        boolean zD = Q0.f19276c.a(abstractC1877v0.getClass()).d(abstractC1877v0);
        if (z6) {
            abstractC1877v0.j(2);
        }
        return zD;
    }

    public static AbstractC1877v0 m(Class cls) {
        Map map = zzb;
        AbstractC1877v0 abstractC1877v0 = (AbstractC1877v0) map.get(cls);
        if (abstractC1877v0 == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                abstractC1877v0 = (AbstractC1877v0) map.get(cls);
            } catch (ClassNotFoundException e6) {
                throw new IllegalStateException("Class initialization cannot fail.", e6);
            }
        }
        if (abstractC1877v0 != null) {
            return abstractC1877v0;
        }
        AbstractC1877v0 abstractC1877v1 = (AbstractC1877v0) ((AbstractC1877v0) AbstractC1830c1.f(cls)).j(6);
        if (abstractC1877v1 == null) {
            throw new IllegalStateException();
        }
        map.put(cls, abstractC1877v1);
        return abstractC1877v1;
    }

    public static Object o(Method method, AbstractC1841g0 abstractC1841g0, Object... objArr) {
        try {
            return method.invoke(abstractC1841g0, objArr);
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

    @Override
    public final void a(C1866p0 c1866p0) {
        T0 t0A = Q0.f19276c.a(getClass());
        G0 g9 = c1866p0.f19372l;
        if (g9 == null) {
            g9 = new G0(c1866p0);
        }
        t0A.b(this, g9);
    }

    @Override
    public final int c(T0 t9) {
        if (h()) {
            int iC = t9.c(this);
            if (iC >= 0) {
                return iC;
            }
            throw new IllegalStateException(M0.l(iC, "serialized size must be non-negative, was "));
        }
        int i3 = this.zzd & Log.LOG_LEVEL_OFF;
        if (i3 != Integer.MAX_VALUE) {
            return i3;
        }
        int iC2 = t9.c(this);
        if (iC2 < 0) {
            throw new IllegalStateException(M0.l(iC2, "serialized size must be non-negative, was "));
        }
        this.zzd = (this.zzd & Integer.MIN_VALUE) | iC2;
        return iC2;
    }

    @Override
    public final int d() {
        if (h()) {
            int iC = Q0.f19276c.a(getClass()).c(this);
            if (iC >= 0) {
                return iC;
            }
            throw new IllegalStateException(M0.l(iC, "serialized size must be non-negative, was "));
        }
        int i3 = this.zzd & Log.LOG_LEVEL_OFF;
        if (i3 != Integer.MAX_VALUE) {
            return i3;
        }
        int iC2 = Q0.f19276c.a(getClass()).c(this);
        if (iC2 < 0) {
            throw new IllegalStateException(M0.l(iC2, "serialized size must be non-negative, was "));
        }
        this.zzd = (this.zzd & Integer.MIN_VALUE) | iC2;
        return iC2;
    }

    public final void e() {
        this.zzd &= Log.LOG_LEVEL_OFF;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return Q0.f19276c.a(getClass()).i(this, (AbstractC1877v0) obj);
    }

    public final void g() {
        this.zzd = (this.zzd & Integer.MIN_VALUE) | Log.LOG_LEVEL_OFF;
    }

    public final boolean h() {
        return (this.zzd & Integer.MIN_VALUE) != 0;
    }

    public final int hashCode() {
        if (h()) {
            return Q0.f19276c.a(getClass()).e(this);
        }
        int i3 = this.zza;
        if (i3 != 0) {
            return i3;
        }
        int iE = Q0.f19276c.a(getClass()).e(this);
        this.zza = iE;
        return iE;
    }

    public abstract Object j(int i3);

    public final AbstractC1875u0 k() {
        return (AbstractC1875u0) j(5);
    }

    public final AbstractC1875u0 l() {
        AbstractC1875u0 abstractC1875u0 = (AbstractC1875u0) j(5);
        if (!abstractC1875u0.f19392h.equals(this)) {
            if (!abstractC1875u0.f19393i.h()) {
                AbstractC1877v0 abstractC1877v0N = abstractC1875u0.f19392h.n();
                Q0.f19276c.a(abstractC1877v0N.getClass()).g(abstractC1877v0N, abstractC1875u0.f19393i);
                abstractC1875u0.f19393i = abstractC1877v0N;
            }
            AbstractC1877v0 abstractC1877v0 = abstractC1875u0.f19393i;
            Q0.f19276c.a(abstractC1877v0.getClass()).g(abstractC1877v0, this);
        }
        return abstractC1875u0;
    }

    public final AbstractC1877v0 n() {
        return (AbstractC1877v0) j(4);
    }

    public final String toString() {
        String string = super.toString();
        char[] cArr = L0.f19257a;
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(string);
        L0.c(this, sb, 0);
        return sb.toString();
    }
}
