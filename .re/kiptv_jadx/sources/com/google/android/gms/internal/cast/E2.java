package com.google.android.gms.internal.cast;

/* JADX INFO: loaded from: classes.dex */
public abstract class E2 extends com.google.android.gms.internal.cast.AbstractC1801u2 {
    private static final java.util.Map zzb = new java.util.concurrent.ConcurrentHashMap();
    protected com.google.android.gms.internal.cast.Z2 zzc;
    private int zzd;

    public E2() {
        this.zza = 0;
        this.zzd = -1;
        this.zzc = com.google.android.gms.internal.cast.Z2.f18855e;
    }

    public static com.google.android.gms.internal.cast.I2 c(com.google.android.gms.internal.cast.I2 i3) {
        int size = i3.size();
        return i3.a(size == 0 ? 10 : size + size);
    }

    public static java.lang.Object d(java.lang.reflect.Method method, com.google.android.gms.internal.cast.AbstractC1801u2 abstractC1801u2, java.lang.Object... objArr) {
        try {
            return method.invoke(abstractC1801u2, objArr);
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

    public static void f(java.lang.Class cls, com.google.android.gms.internal.cast.E2 e6) {
        e6.e();
        zzb.put(cls, e6);
    }

    public static final boolean h(com.google.android.gms.internal.cast.E2 e6, boolean z6) {
        byte bByteValue = ((java.lang.Byte) e6.j(1, null)).byteValue();
        if (bByteValue == 1) {
            return true;
        }
        if (bByteValue == 0) {
            return false;
        }
        boolean zG = com.google.android.gms.internal.cast.U2.f18826c.a(e6.getClass()).g(e6);
        if (z6) {
            e6.j(2, true == zG ? e6 : null);
        }
        return zG;
    }

    public static com.google.android.gms.internal.cast.E2 m(java.lang.Class cls) {
        java.util.Map map = zzb;
        com.google.android.gms.internal.cast.E2 e6 = (com.google.android.gms.internal.cast.E2) map.get(cls);
        if (e6 == null) {
            try {
                java.lang.Class.forName(cls.getName(), true, cls.getClassLoader());
                e6 = (com.google.android.gms.internal.cast.E2) map.get(cls);
            } catch (java.lang.ClassNotFoundException e9) {
                throw new java.lang.IllegalStateException("Class initialization cannot fail.", e9);
            }
        }
        if (e6 != null) {
            return e6;
        }
        com.google.android.gms.internal.cast.E2 e10 = (com.google.android.gms.internal.cast.E2) ((com.google.android.gms.internal.cast.E2) com.google.android.gms.internal.cast.e3.f(cls)).j(6, null);
        if (e10 == null) {
            throw new java.lang.IllegalStateException();
        }
        map.put(cls, e10);
        return e10;
    }

    @Override // com.google.android.gms.internal.cast.AbstractC1801u2
    public final int a(com.google.android.gms.internal.cast.X2 x9) {
        if (i()) {
            int iB = x9.b(this);
            if (iB >= 0) {
                return iB;
            }
            throw new java.lang.IllegalStateException(com.google.android.gms.internal.play_billing.M0.l(iB, "serialized size must be non-negative, was "));
        }
        int i3 = this.zzd & androidx.media3.common.util.Log.LOG_LEVEL_OFF;
        if (i3 != Integer.MAX_VALUE) {
            return i3;
        }
        int iB2 = x9.b(this);
        if (iB2 < 0) {
            throw new java.lang.IllegalStateException(com.google.android.gms.internal.play_billing.M0.l(iB2, "serialized size must be non-negative, was "));
        }
        this.zzd = (this.zzd & Integer.MIN_VALUE) | iB2;
        return iB2;
    }

    public final void e() {
        this.zzd &= androidx.media3.common.util.Log.LOG_LEVEL_OFF;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return com.google.android.gms.internal.cast.U2.f18826c.a(getClass()).e(this, (com.google.android.gms.internal.cast.E2) obj);
    }

    public final void g() {
        this.zzd = (this.zzd & Integer.MIN_VALUE) | androidx.media3.common.util.Log.LOG_LEVEL_OFF;
    }

    public final int hashCode() {
        if (i()) {
            return com.google.android.gms.internal.cast.U2.f18826c.a(getClass()).f(this);
        }
        int i3 = this.zza;
        if (i3 != 0) {
            return i3;
        }
        int iF = com.google.android.gms.internal.cast.U2.f18826c.a(getClass()).f(this);
        this.zza = iF;
        return iF;
    }

    public final boolean i() {
        return (this.zzd & Integer.MIN_VALUE) != 0;
    }

    public abstract java.lang.Object j(int i3, com.google.android.gms.internal.cast.E2 e6);

    public final int k() {
        if (i()) {
            int iB = com.google.android.gms.internal.cast.U2.f18826c.a(getClass()).b(this);
            if (iB >= 0) {
                return iB;
            }
            throw new java.lang.IllegalStateException(com.google.android.gms.internal.play_billing.M0.l(iB, "serialized size must be non-negative, was "));
        }
        int i3 = this.zzd & androidx.media3.common.util.Log.LOG_LEVEL_OFF;
        if (i3 != Integer.MAX_VALUE) {
            return i3;
        }
        int iB2 = com.google.android.gms.internal.cast.U2.f18826c.a(getClass()).b(this);
        if (iB2 < 0) {
            throw new java.lang.IllegalStateException(com.google.android.gms.internal.play_billing.M0.l(iB2, "serialized size must be non-negative, was "));
        }
        this.zzd = (this.zzd & Integer.MIN_VALUE) | iB2;
        return iB2;
    }

    public final com.google.android.gms.internal.cast.D2 l() {
        return (com.google.android.gms.internal.cast.D2) j(5, null);
    }

    public final java.lang.String toString() {
        java.lang.String string = super.toString();
        char[] cArr = com.google.android.gms.internal.cast.Q2.f18810a;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("# ");
        sb.append(string);
        com.google.android.gms.internal.cast.Q2.c(this, sb, 0);
        return sb.toString();
    }
}
