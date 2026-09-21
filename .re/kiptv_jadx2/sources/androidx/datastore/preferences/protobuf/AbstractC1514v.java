package androidx.datastore.preferences.protobuf;

import androidx.media3.common.util.Log;
import com.google.android.gms.internal.play_billing.M0;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public abstract class AbstractC1514v extends AbstractC1494a {
    private static final int MEMOIZED_SERIALIZED_SIZE_MASK = Integer.MAX_VALUE;
    private static final int MUTABLE_FLAG_MASK = Integer.MIN_VALUE;
    static final int UNINITIALIZED_HASH_CODE = 0;
    static final int UNINITIALIZED_SERIALIZED_SIZE = Integer.MAX_VALUE;
    private static Map<Object, AbstractC1514v> defaultInstanceMap = new ConcurrentHashMap();
    private int memoizedSerializedSize;
    protected e0 unknownFields;

    public AbstractC1514v() {
        this.memoizedHashCode = 0;
        this.memoizedSerializedSize = -1;
        this.unknownFields = e0.f16194f;
    }

    public static AbstractC1514v d(Class cls) {
        AbstractC1514v abstractC1514v = defaultInstanceMap.get(cls);
        if (abstractC1514v == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                abstractC1514v = defaultInstanceMap.get(cls);
            } catch (ClassNotFoundException e6) {
                throw new IllegalStateException("Class initialization cannot fail.", e6);
            }
        }
        if (abstractC1514v != null) {
            return abstractC1514v;
        }
        AbstractC1514v abstractC1514v2 = (AbstractC1514v) ((AbstractC1514v) k0.d(cls)).c(6);
        if (abstractC1514v2 == null) {
            throw new IllegalStateException();
        }
        defaultInstanceMap.put(cls, abstractC1514v2);
        return abstractC1514v2;
    }

    public static Object e(Method method, AbstractC1494a abstractC1494a, Object... objArr) {
        try {
            return method.invoke(abstractC1494a, objArr);
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

    public static final boolean f(AbstractC1514v abstractC1514v, boolean z6) {
        byte bByteValue = ((Byte) abstractC1514v.c(1)).byteValue();
        if (bByteValue == 1) {
            return true;
        }
        if (bByteValue == 0) {
            return false;
        }
        U u6 = U.f16162c;
        u6.getClass();
        boolean zC = u6.a(abstractC1514v.getClass()).c(abstractC1514v);
        if (z6) {
            abstractC1514v.c(2);
        }
        return zC;
    }

    public static void j(Class cls, AbstractC1514v abstractC1514v) {
        abstractC1514v.h();
        defaultInstanceMap.put(cls, abstractC1514v);
    }

    @Override
    public final int a(X x9) {
        int iF;
        int iF2;
        if (g()) {
            if (x9 == null) {
                U u6 = U.f16162c;
                u6.getClass();
                iF2 = u6.a(getClass()).f(this);
            } else {
                iF2 = x9.f(this);
            }
            if (iF2 >= 0) {
                return iF2;
            }
            throw new IllegalStateException(M0.l(iF2, "serialized size must be non-negative, was "));
        }
        int i3 = this.memoizedSerializedSize;
        if ((i3 & Log.LOG_LEVEL_OFF) != Integer.MAX_VALUE) {
            return i3 & Log.LOG_LEVEL_OFF;
        }
        if (x9 == null) {
            U u7 = U.f16162c;
            u7.getClass();
            iF = u7.a(getClass()).f(this);
        } else {
            iF = x9.f(this);
        }
        k(iF);
        return iF;
    }

    @Override
    public final void b(C1505l c1505l) {
        U u6 = U.f16162c;
        u6.getClass();
        X xA = u6.a(getClass());
        F f9 = c1505l.f16229m;
        if (f9 == null) {
            f9 = new F(c1505l);
        }
        xA.e(this, f9);
    }

    public abstract Object c(int i3);

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        U u6 = U.f16162c;
        u6.getClass();
        return u6.a(getClass()).i(this, (AbstractC1514v) obj);
    }

    public final boolean g() {
        return (this.memoizedSerializedSize & Integer.MIN_VALUE) != 0;
    }

    public final void h() {
        this.memoizedSerializedSize &= Log.LOG_LEVEL_OFF;
    }

    public final int hashCode() {
        if (g()) {
            U u6 = U.f16162c;
            u6.getClass();
            return u6.a(getClass()).h(this);
        }
        if (this.memoizedHashCode == 0) {
            U u7 = U.f16162c;
            u7.getClass();
            this.memoizedHashCode = u7.a(getClass()).h(this);
        }
        return this.memoizedHashCode;
    }

    public final AbstractC1514v i() {
        return (AbstractC1514v) c(4);
    }

    public final void k(int i3) {
        if (i3 < 0) {
            throw new IllegalStateException(M0.l(i3, "serialized size must be non-negative, was "));
        }
        this.memoizedSerializedSize = (i3 & Log.LOG_LEVEL_OFF) | (this.memoizedSerializedSize & Integer.MIN_VALUE);
    }

    public final String toString() {
        String string = super.toString();
        char[] cArr = M.f16143a;
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(string);
        M.c(this, sb, 0);
        return sb.toString();
    }
}
