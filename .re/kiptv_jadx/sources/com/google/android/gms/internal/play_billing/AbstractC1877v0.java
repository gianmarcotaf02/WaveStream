package com.google.android.gms.internal.play_billing;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.v0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1877v0 extends com.google.android.gms.internal.play_billing.AbstractC1841g0 {
    private static final java.util.Map zzb = new java.util.concurrent.ConcurrentHashMap();
    protected com.google.android.gms.internal.play_billing.X0 zzc;
    private int zzd;

    public AbstractC1877v0() {
        this.zza = 0;
        this.zzd = -1;
        this.zzc = com.google.android.gms.internal.play_billing.X0.f19300f;
    }

    public static void f(java.lang.Class cls, com.google.android.gms.internal.play_billing.AbstractC1877v0 abstractC1877v0) {
        abstractC1877v0.e();
        zzb.put(cls, abstractC1877v0);
    }

    public static final boolean i(com.google.android.gms.internal.play_billing.AbstractC1877v0 abstractC1877v0, boolean z6) {
        byte bByteValue = ((java.lang.Byte) abstractC1877v0.j(1)).byteValue();
        if (bByteValue == 1) {
            return true;
        }
        if (bByteValue == 0) {
            return false;
        }
        boolean zD = com.google.android.gms.internal.play_billing.Q0.f19276c.a(abstractC1877v0.getClass()).d(abstractC1877v0);
        if (z6) {
            abstractC1877v0.j(2);
        }
        return zD;
    }

    public static com.google.android.gms.internal.play_billing.AbstractC1877v0 m(java.lang.Class cls) {
        java.util.Map map = zzb;
        com.google.android.gms.internal.play_billing.AbstractC1877v0 abstractC1877v0 = (com.google.android.gms.internal.play_billing.AbstractC1877v0) map.get(cls);
        if (abstractC1877v0 == null) {
            try {
                java.lang.Class.forName(cls.getName(), true, cls.getClassLoader());
                abstractC1877v0 = (com.google.android.gms.internal.play_billing.AbstractC1877v0) map.get(cls);
            } catch (java.lang.ClassNotFoundException e6) {
                throw new java.lang.IllegalStateException("Class initialization cannot fail.", e6);
            }
        }
        if (abstractC1877v0 != null) {
            return abstractC1877v0;
        }
        com.google.android.gms.internal.play_billing.AbstractC1877v0 abstractC1877v1 = (com.google.android.gms.internal.play_billing.AbstractC1877v0) ((com.google.android.gms.internal.play_billing.AbstractC1877v0) com.google.android.gms.internal.play_billing.AbstractC1830c1.f(cls)).j(6);
        if (abstractC1877v1 == null) {
            throw new java.lang.IllegalStateException();
        }
        map.put(cls, abstractC1877v1);
        return abstractC1877v1;
    }

    public static java.lang.Object o(java.lang.reflect.Method method, com.google.android.gms.internal.play_billing.AbstractC1841g0 abstractC1841g0, java.lang.Object... objArr) {
        try {
            return method.invoke(abstractC1841g0, objArr);
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

    @Override // com.google.android.gms.internal.play_billing.AbstractC1841g0
    public final void a(com.google.android.gms.internal.play_billing.C1866p0 c1866p0) {
        com.google.android.gms.internal.play_billing.T0 t0A = com.google.android.gms.internal.play_billing.Q0.f19276c.a(getClass());
        com.google.android.gms.internal.play_billing.G0 g9 = c1866p0.f19372l;
        if (g9 == null) {
            g9 = new com.google.android.gms.internal.play_billing.G0(c1866p0);
        }
        t0A.b(this, g9);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC1841g0
    public final int c(com.google.android.gms.internal.play_billing.T0 t9) {
        if (h()) {
            int iC = t9.c(this);
            if (iC >= 0) {
                return iC;
            }
            throw new java.lang.IllegalStateException(com.google.android.gms.internal.play_billing.M0.l(iC, "serialized size must be non-negative, was "));
        }
        int i3 = this.zzd & androidx.media3.common.util.Log.LOG_LEVEL_OFF;
        if (i3 != Integer.MAX_VALUE) {
            return i3;
        }
        int iC2 = t9.c(this);
        if (iC2 < 0) {
            throw new java.lang.IllegalStateException(com.google.android.gms.internal.play_billing.M0.l(iC2, "serialized size must be non-negative, was "));
        }
        this.zzd = (this.zzd & Integer.MIN_VALUE) | iC2;
        return iC2;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC1841g0
    public final int d() {
        if (h()) {
            int iC = com.google.android.gms.internal.play_billing.Q0.f19276c.a(getClass()).c(this);
            if (iC >= 0) {
                return iC;
            }
            throw new java.lang.IllegalStateException(com.google.android.gms.internal.play_billing.M0.l(iC, "serialized size must be non-negative, was "));
        }
        int i3 = this.zzd & androidx.media3.common.util.Log.LOG_LEVEL_OFF;
        if (i3 != Integer.MAX_VALUE) {
            return i3;
        }
        int iC2 = com.google.android.gms.internal.play_billing.Q0.f19276c.a(getClass()).c(this);
        if (iC2 < 0) {
            throw new java.lang.IllegalStateException(com.google.android.gms.internal.play_billing.M0.l(iC2, "serialized size must be non-negative, was "));
        }
        this.zzd = (this.zzd & Integer.MIN_VALUE) | iC2;
        return iC2;
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
        return com.google.android.gms.internal.play_billing.Q0.f19276c.a(getClass()).i(this, (com.google.android.gms.internal.play_billing.AbstractC1877v0) obj);
    }

    public final void g() {
        this.zzd = (this.zzd & Integer.MIN_VALUE) | androidx.media3.common.util.Log.LOG_LEVEL_OFF;
    }

    public final boolean h() {
        return (this.zzd & Integer.MIN_VALUE) != 0;
    }

    public final int hashCode() {
        if (h()) {
            return com.google.android.gms.internal.play_billing.Q0.f19276c.a(getClass()).e(this);
        }
        int i3 = this.zza;
        if (i3 != 0) {
            return i3;
        }
        int iE = com.google.android.gms.internal.play_billing.Q0.f19276c.a(getClass()).e(this);
        this.zza = iE;
        return iE;
    }

    public abstract java.lang.Object j(int i3);

    public final com.google.android.gms.internal.play_billing.AbstractC1875u0 k() {
        return (com.google.android.gms.internal.play_billing.AbstractC1875u0) j(5);
    }

    public final com.google.android.gms.internal.play_billing.AbstractC1875u0 l() {
        com.google.android.gms.internal.play_billing.AbstractC1875u0 abstractC1875u0 = (com.google.android.gms.internal.play_billing.AbstractC1875u0) j(5);
        if (!abstractC1875u0.f19392h.equals(this)) {
            if (!abstractC1875u0.f19393i.h()) {
                com.google.android.gms.internal.play_billing.AbstractC1877v0 abstractC1877v0N = abstractC1875u0.f19392h.n();
                com.google.android.gms.internal.play_billing.Q0.f19276c.a(abstractC1877v0N.getClass()).g(abstractC1877v0N, abstractC1875u0.f19393i);
                abstractC1875u0.f19393i = abstractC1877v0N;
            }
            com.google.android.gms.internal.play_billing.AbstractC1877v0 abstractC1877v0 = abstractC1875u0.f19393i;
            com.google.android.gms.internal.play_billing.Q0.f19276c.a(abstractC1877v0.getClass()).g(abstractC1877v0, this);
        }
        return abstractC1875u0;
    }

    public final com.google.android.gms.internal.play_billing.AbstractC1877v0 n() {
        return (com.google.android.gms.internal.play_billing.AbstractC1877v0) j(4);
    }

    public final java.lang.String toString() {
        java.lang.String string = super.toString();
        char[] cArr = com.google.android.gms.internal.play_billing.L0.f19257a;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("# ");
        sb.append(string);
        com.google.android.gms.internal.play_billing.L0.c(this, sb, 0);
        return sb.toString();
    }
}
