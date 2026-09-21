package androidx.datastore.preferences.protobuf;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.v, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1514v extends androidx.datastore.preferences.protobuf.AbstractC1494a {
    private static final int MEMOIZED_SERIALIZED_SIZE_MASK = Integer.MAX_VALUE;
    private static final int MUTABLE_FLAG_MASK = Integer.MIN_VALUE;
    static final int UNINITIALIZED_HASH_CODE = 0;
    static final int UNINITIALIZED_SERIALIZED_SIZE = Integer.MAX_VALUE;
    private static java.util.Map<java.lang.Object, androidx.datastore.preferences.protobuf.AbstractC1514v> defaultInstanceMap = new java.util.concurrent.ConcurrentHashMap();
    private int memoizedSerializedSize;
    protected androidx.datastore.preferences.protobuf.e0 unknownFields;

    public AbstractC1514v() {
        this.memoizedHashCode = 0;
        this.memoizedSerializedSize = -1;
        this.unknownFields = androidx.datastore.preferences.protobuf.e0.f16194f;
    }

    public static androidx.datastore.preferences.protobuf.AbstractC1514v d(java.lang.Class cls) {
        androidx.datastore.preferences.protobuf.AbstractC1514v abstractC1514v = defaultInstanceMap.get(cls);
        if (abstractC1514v == null) {
            try {
                java.lang.Class.forName(cls.getName(), true, cls.getClassLoader());
                abstractC1514v = defaultInstanceMap.get(cls);
            } catch (java.lang.ClassNotFoundException e6) {
                throw new java.lang.IllegalStateException("Class initialization cannot fail.", e6);
            }
        }
        if (abstractC1514v != null) {
            return abstractC1514v;
        }
        androidx.datastore.preferences.protobuf.AbstractC1514v abstractC1514v2 = (androidx.datastore.preferences.protobuf.AbstractC1514v) ((androidx.datastore.preferences.protobuf.AbstractC1514v) androidx.datastore.preferences.protobuf.k0.d(cls)).c(6);
        if (abstractC1514v2 == null) {
            throw new java.lang.IllegalStateException();
        }
        defaultInstanceMap.put(cls, abstractC1514v2);
        return abstractC1514v2;
    }

    public static java.lang.Object e(java.lang.reflect.Method method, androidx.datastore.preferences.protobuf.AbstractC1494a abstractC1494a, java.lang.Object... objArr) {
        try {
            return method.invoke(abstractC1494a, objArr);
        } catch (java.lang.IllegalAccessException e6) {
            throw new java.lang.RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e6);
        } catch (java.lang.reflect.InvocationTargetException e9) {
            java.lang.Throwable cause = e9.getCause();
            if (cause instanceof java.lang.RuntimeException) {
                throw ((java.lang.RuntimeException) cause);
            }
            if (cause instanceof java.lang.Error) {
                throw ((java.lang.Error) cause);
            }
            throw new java.lang.RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
        }
    }

    public static final boolean f(androidx.datastore.preferences.protobuf.AbstractC1514v abstractC1514v, boolean z6) {
        byte bByteValue = ((java.lang.Byte) abstractC1514v.c(1)).byteValue();
        if (bByteValue == 1) {
            return true;
        }
        if (bByteValue == 0) {
            return false;
        }
        androidx.datastore.preferences.protobuf.U u6 = androidx.datastore.preferences.protobuf.U.f16162c;
        u6.getClass();
        boolean zC = u6.a(abstractC1514v.getClass()).c(abstractC1514v);
        if (z6) {
            abstractC1514v.c(2);
        }
        return zC;
    }

    public static void j(java.lang.Class cls, androidx.datastore.preferences.protobuf.AbstractC1514v abstractC1514v) {
        abstractC1514v.h();
        defaultInstanceMap.put(cls, abstractC1514v);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1494a
    public final int a(androidx.datastore.preferences.protobuf.X x9) {
        int iF;
        int iF2;
        if (g()) {
            if (x9 == null) {
                androidx.datastore.preferences.protobuf.U u6 = androidx.datastore.preferences.protobuf.U.f16162c;
                u6.getClass();
                iF2 = u6.a(getClass()).f(this);
            } else {
                iF2 = x9.f(this);
            }
            if (iF2 >= 0) {
                return iF2;
            }
            throw new java.lang.IllegalStateException(com.google.android.gms.internal.play_billing.M0.l(iF2, "serialized size must be non-negative, was "));
        }
        int i3 = this.memoizedSerializedSize;
        if ((i3 & androidx.media3.common.util.Log.LOG_LEVEL_OFF) != Integer.MAX_VALUE) {
            return i3 & androidx.media3.common.util.Log.LOG_LEVEL_OFF;
        }
        if (x9 == null) {
            androidx.datastore.preferences.protobuf.U u7 = androidx.datastore.preferences.protobuf.U.f16162c;
            u7.getClass();
            iF = u7.a(getClass()).f(this);
        } else {
            iF = x9.f(this);
        }
        k(iF);
        return iF;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1494a
    public final void b(androidx.datastore.preferences.protobuf.C1505l c1505l) {
        androidx.datastore.preferences.protobuf.U u6 = androidx.datastore.preferences.protobuf.U.f16162c;
        u6.getClass();
        androidx.datastore.preferences.protobuf.X xA = u6.a(getClass());
        androidx.datastore.preferences.protobuf.F f9 = c1505l.f16229m;
        if (f9 == null) {
            f9 = new androidx.datastore.preferences.protobuf.F(c1505l);
        }
        xA.e(this, f9);
    }

    public abstract java.lang.Object c(int i3);

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        androidx.datastore.preferences.protobuf.U u6 = androidx.datastore.preferences.protobuf.U.f16162c;
        u6.getClass();
        return u6.a(getClass()).i(this, (androidx.datastore.preferences.protobuf.AbstractC1514v) obj);
    }

    public final boolean g() {
        return (this.memoizedSerializedSize & Integer.MIN_VALUE) != 0;
    }

    public final void h() {
        this.memoizedSerializedSize &= androidx.media3.common.util.Log.LOG_LEVEL_OFF;
    }

    public final int hashCode() {
        if (g()) {
            androidx.datastore.preferences.protobuf.U u6 = androidx.datastore.preferences.protobuf.U.f16162c;
            u6.getClass();
            return u6.a(getClass()).h(this);
        }
        if (this.memoizedHashCode == 0) {
            androidx.datastore.preferences.protobuf.U u7 = androidx.datastore.preferences.protobuf.U.f16162c;
            u7.getClass();
            this.memoizedHashCode = u7.a(getClass()).h(this);
        }
        return this.memoizedHashCode;
    }

    public final androidx.datastore.preferences.protobuf.AbstractC1514v i() {
        return (androidx.datastore.preferences.protobuf.AbstractC1514v) c(4);
    }

    public final void k(int i3) {
        if (i3 < 0) {
            throw new java.lang.IllegalStateException(com.google.android.gms.internal.play_billing.M0.l(i3, "serialized size must be non-negative, was "));
        }
        this.memoizedSerializedSize = (i3 & androidx.media3.common.util.Log.LOG_LEVEL_OFF) | (this.memoizedSerializedSize & Integer.MIN_VALUE);
    }

    public final java.lang.String toString() {
        java.lang.String string = super.toString();
        char[] cArr = androidx.datastore.preferences.protobuf.M.f16143a;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("# ");
        sb.append(string);
        androidx.datastore.preferences.protobuf.M.c(this, sb, 0);
        return sb.toString();
    }
}
