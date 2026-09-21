package com.google.crypto.tink.shaded.protobuf;

import U.C0948v;
import androidx.datastore.preferences.protobuf.AbstractC1503j;
import androidx.media3.common.util.Log;
import com.google.android.gms.internal.play_billing.M0;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public abstract class AbstractC1928x extends AbstractC1906a {
    private static final int MEMOIZED_SERIALIZED_SIZE_MASK = Integer.MAX_VALUE;
    private static final int MUTABLE_FLAG_MASK = Integer.MIN_VALUE;
    static final int UNINITIALIZED_HASH_CODE = 0;
    static final int UNINITIALIZED_SERIALIZED_SIZE = Integer.MAX_VALUE;
    private static Map<Object, AbstractC1928x> defaultInstanceMap = new ConcurrentHashMap();
    private int memoizedSerializedSize;
    protected g0 unknownFields;

    public AbstractC1928x() {
        this.memoizedHashCode = 0;
        this.memoizedSerializedSize = -1;
        this.unknownFields = g0.f19531f;
    }

    public static void g(AbstractC1928x abstractC1928x) throws D {
        if (!m(abstractC1928x, true)) {
            throw new D(new f0().getMessage());
        }
    }

    public static AbstractC1928x j(Class cls) {
        AbstractC1928x abstractC1928x = defaultInstanceMap.get(cls);
        if (abstractC1928x == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                abstractC1928x = defaultInstanceMap.get(cls);
            } catch (ClassNotFoundException e6) {
                throw new IllegalStateException("Class initialization cannot fail.", e6);
            }
        }
        if (abstractC1928x != null) {
            return abstractC1928x;
        }
        AbstractC1928x abstractC1928xA = ((AbstractC1928x) p0.b(cls)).a();
        if (abstractC1928xA == null) {
            throw new IllegalStateException();
        }
        defaultInstanceMap.put(cls, abstractC1928xA);
        return abstractC1928xA;
    }

    public static Object l(Method method, AbstractC1906a abstractC1906a, Object... objArr) {
        try {
            return method.invoke(abstractC1906a, objArr);
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

    public static final boolean m(AbstractC1928x abstractC1928x, boolean z6) {
        byte bByteValue = ((Byte) abstractC1928x.i(1)).byteValue();
        if (bByteValue == 1) {
            return true;
        }
        if (bByteValue == 0) {
            return false;
        }
        a0 a0Var = a0.f19511c;
        a0Var.getClass();
        boolean zC = a0Var.a(abstractC1928x.getClass()).c(abstractC1928x);
        if (z6) {
            abstractC1928x.i(2);
        }
        return zC;
    }

    public static AbstractC1928x r(AbstractC1928x abstractC1928x, AbstractC1915j abstractC1915j, C1921p c1921p) throws D {
        C1914i c1914i = (C1914i) abstractC1915j;
        C1916k c1916kH = AbstractC1503j.h(c1914i.f19539k, c1914i.p(), c1914i.size(), true);
        AbstractC1928x abstractC1928xS = s(abstractC1928x, c1916kH, c1921p);
        c1916kH.b(0);
        g(abstractC1928xS);
        return abstractC1928xS;
    }

    public static AbstractC1928x s(AbstractC1928x abstractC1928x, AbstractC1503j abstractC1503j, C1921p c1921p) throws D {
        AbstractC1928x abstractC1928xQ = abstractC1928x.q();
        try {
            a0 a0Var = a0.f19511c;
            a0Var.getClass();
            d0 d0VarA = a0Var.a(abstractC1928xQ.getClass());
            C0948v c0948v = (C0948v) abstractC1503j.f16219b;
            if (c0948v == null) {
                c0948v = new C0948v(abstractC1503j, (byte) 0);
            }
            d0VarA.e(abstractC1928xQ, c0948v, c1921p);
            d0VarA.b(abstractC1928xQ);
            return abstractC1928xQ;
        } catch (D e6) {
            if (e6.f19468h) {
                throw new D(e6.getMessage(), e6);
            }
            throw e6;
        } catch (f0 e9) {
            throw new D(e9.getMessage());
        } catch (IOException e10) {
            if (e10.getCause() instanceof D) {
                throw ((D) e10.getCause());
            }
            throw new D(e10.getMessage(), e10);
        } catch (RuntimeException e11) {
            if (e11.getCause() instanceof D) {
                throw ((D) e11.getCause());
            }
            throw e11;
        }
    }

    public static void t(Class cls, AbstractC1928x abstractC1928x) {
        abstractC1928x.o();
        defaultInstanceMap.put(cls, abstractC1928x);
    }

    @Override
    public final int b(d0 d0Var) {
        int iH;
        int iH2;
        if (n()) {
            if (d0Var == null) {
                a0 a0Var = a0.f19511c;
                a0Var.getClass();
                iH2 = a0Var.a(getClass()).h(this);
            } else {
                iH2 = d0Var.h(this);
            }
            if (iH2 >= 0) {
                return iH2;
            }
            throw new IllegalStateException(M0.l(iH2, "serialized size must be non-negative, was "));
        }
        int i3 = this.memoizedSerializedSize;
        if ((i3 & Log.LOG_LEVEL_OFF) != Integer.MAX_VALUE) {
            return i3 & Log.LOG_LEVEL_OFF;
        }
        if (d0Var == null) {
            a0 a0Var2 = a0.f19511c;
            a0Var2.getClass();
            iH = a0Var2.a(getClass()).h(this);
        } else {
            iH = d0Var.h(this);
        }
        u(iH);
        return iH;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        a0 a0Var = a0.f19511c;
        a0Var.getClass();
        return a0Var.a(getClass()).f(this, (AbstractC1928x) obj);
    }

    @Override
    public final void f(C1918m c1918m) {
        a0 a0Var = a0.f19511c;
        a0Var.getClass();
        d0 d0VarA = a0Var.a(getClass());
        M m8 = c1918m.f19559d;
        if (m8 == null) {
            m8 = new M(c1918m);
        }
        d0VarA.j(this, m8);
    }

    public final AbstractC1926v h() {
        return (AbstractC1926v) i(5);
    }

    public final int hashCode() {
        if (n()) {
            a0 a0Var = a0.f19511c;
            a0Var.getClass();
            return a0Var.a(getClass()).g(this);
        }
        if (this.memoizedHashCode == 0) {
            a0 a0Var2 = a0.f19511c;
            a0Var2.getClass();
            this.memoizedHashCode = a0Var2.a(getClass()).g(this);
        }
        return this.memoizedHashCode;
    }

    public abstract Object i(int i3);

    @Override
    public final AbstractC1928x a() {
        return (AbstractC1928x) i(6);
    }

    public final boolean n() {
        return (this.memoizedSerializedSize & Integer.MIN_VALUE) != 0;
    }

    public final void o() {
        this.memoizedSerializedSize &= Log.LOG_LEVEL_OFF;
    }

    @Override
    public final AbstractC1926v d() {
        return (AbstractC1926v) i(5);
    }

    public final AbstractC1928x q() {
        return (AbstractC1928x) i(4);
    }

    public final String toString() {
        String string = super.toString();
        char[] cArr = T.f19491a;
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(string);
        T.c(this, sb, 0);
        return sb.toString();
    }

    public final void u(int i3) {
        if (i3 < 0) {
            throw new IllegalStateException(M0.l(i3, "serialized size must be non-negative, was "));
        }
        this.memoizedSerializedSize = (i3 & Log.LOG_LEVEL_OFF) | (this.memoizedSerializedSize & Integer.MIN_VALUE);
    }

    public final AbstractC1926v v() {
        AbstractC1926v abstractC1926v = (AbstractC1926v) i(5);
        if (!abstractC1926v.f19593h.equals(this)) {
            abstractC1926v.e();
            AbstractC1926v.f(abstractC1926v.f19594i, this);
        }
        return abstractC1926v;
    }
}
