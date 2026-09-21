package com.google.android.gms.internal.cast;

import androidx.media3.common.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public abstract class E2 extends AbstractC1801u2 {
    private static final Map zzb = new ConcurrentHashMap();
    protected Z2 zzc;
    private int zzd;

    public E2() {
        this.zza = 0;
        this.zzd = -1;
        this.zzc = Z2.f18855e;
    }

    public static I2 c(I2 i3) {
        int size = i3.size();
        return i3.a(size == 0 ? 10 : size + size);
    }

    public static Object d(Method method, AbstractC1801u2 abstractC1801u2, Object... objArr) {
        try {
            return method.invoke(abstractC1801u2, objArr);
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

    public static void f(Class cls, E2 e6) {
        e6.e();
        zzb.put(cls, e6);
    }

    public static final boolean h(E2 e6, boolean z6) {
        byte bByteValue = ((Byte) e6.j(1, null)).byteValue();
        if (bByteValue == 1) {
            return true;
        }
        if (bByteValue == 0) {
            return false;
        }
        boolean zG = U2.f18826c.a(e6.getClass()).g(e6);
        if (z6) {
            e6.j(2, true == zG ? e6 : null);
        }
        return zG;
    }

    public static E2 m(Class cls) {
        Map map = zzb;
        E2 e6 = (E2) map.get(cls);
        if (e6 == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                e6 = (E2) map.get(cls);
            } catch (ClassNotFoundException e9) {
                throw new IllegalStateException("Class initialization cannot fail.", e9);
            }
        }
        if (e6 != null) {
            return e6;
        }
        E2 e10 = (E2) ((E2) e3.f(cls)).j(6, null);
        if (e10 == null) {
            throw new IllegalStateException();
        }
        map.put(cls, e10);
        return e10;
    }

    @Override
    public final int a(X2 x9) {
        if (i()) {
            int iB = x9.b(this);
            if (iB >= 0) {
                return iB;
            }
            throw new IllegalStateException(com.google.android.gms.internal.play_billing.M0.l(iB, "serialized size must be non-negative, was "));
        }
        int i3 = this.zzd & Log.LOG_LEVEL_OFF;
        if (i3 != Integer.MAX_VALUE) {
            return i3;
        }
        int iB2 = x9.b(this);
        if (iB2 < 0) {
            throw new IllegalStateException(com.google.android.gms.internal.play_billing.M0.l(iB2, "serialized size must be non-negative, was "));
        }
        this.zzd = (this.zzd & Integer.MIN_VALUE) | iB2;
        return iB2;
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
        return U2.f18826c.a(getClass()).e(this, (E2) obj);
    }

    public final void g() {
        this.zzd = (this.zzd & Integer.MIN_VALUE) | Log.LOG_LEVEL_OFF;
    }

    public final int hashCode() {
        if (i()) {
            return U2.f18826c.a(getClass()).f(this);
        }
        int i3 = this.zza;
        if (i3 != 0) {
            return i3;
        }
        int iF = U2.f18826c.a(getClass()).f(this);
        this.zza = iF;
        return iF;
    }

    public final boolean i() {
        return (this.zzd & Integer.MIN_VALUE) != 0;
    }

    public abstract Object j(int i3, E2 e6);

    public final int k() {
        if (i()) {
            int iB = U2.f18826c.a(getClass()).b(this);
            if (iB >= 0) {
                return iB;
            }
            throw new IllegalStateException(com.google.android.gms.internal.play_billing.M0.l(iB, "serialized size must be non-negative, was "));
        }
        int i3 = this.zzd & Log.LOG_LEVEL_OFF;
        if (i3 != Integer.MAX_VALUE) {
            return i3;
        }
        int iB2 = U2.f18826c.a(getClass()).b(this);
        if (iB2 < 0) {
            throw new IllegalStateException(com.google.android.gms.internal.play_billing.M0.l(iB2, "serialized size must be non-negative, was "));
        }
        this.zzd = (this.zzd & Integer.MIN_VALUE) | iB2;
        return iB2;
    }

    public final D2 l() {
        return (D2) j(5, null);
    }

    public final String toString() {
        String string = super.toString();
        char[] cArr = Q2.f18810a;
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(string);
        Q2.c(this, sb, 0);
        return sb.toString();
    }
}
