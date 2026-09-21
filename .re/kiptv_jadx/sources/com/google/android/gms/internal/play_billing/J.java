package com.google.android.gms.internal.play_billing;

/* JADX INFO: loaded from: classes.dex */
public final class J extends R8.i {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final sun.misc.Unsafe f19233n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final long f19234o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final long f19235p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final long f19236q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final long f19237r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final long f19238s;

    static {
        sun.misc.Unsafe unsafe;
        try {
            try {
                unsafe = sun.misc.Unsafe.getUnsafe();
            } catch (java.security.PrivilegedActionException e6) {
                throw new java.lang.RuntimeException("Could not initialize intrinsics", e6.getCause());
            }
        } catch (java.lang.SecurityException unused) {
            unsafe = (sun.misc.Unsafe) java.security.AccessController.doPrivileged(new com.google.android.gms.internal.play_billing.O());
        }
        try {
            f19235p = unsafe.objectFieldOffset(com.google.android.gms.internal.play_billing.L.class.getDeclaredField("j"));
            f19234o = unsafe.objectFieldOffset(com.google.android.gms.internal.play_billing.L.class.getDeclaredField(androidx.media3.exoplayer.upstream.CmcdData.OBJECT_TYPE_INIT_SEGMENT));
            f19236q = unsafe.objectFieldOffset(com.google.android.gms.internal.play_billing.L.class.getDeclaredField(androidx.media3.exoplayer.upstream.CmcdData.STREAMING_FORMAT_HLS));
            f19237r = unsafe.objectFieldOffset(com.google.android.gms.internal.play_billing.K.class.getDeclaredField(androidx.media3.exoplayer.upstream.CmcdData.OBJECT_TYPE_AUDIO_ONLY));
            f19238s = unsafe.objectFieldOffset(com.google.android.gms.internal.play_billing.K.class.getDeclaredField("b"));
            f19233n = unsafe;
        } catch (java.lang.NoSuchFieldException e9) {
            throw new java.lang.RuntimeException(e9);
        }
    }

    @Override // R8.i
    public final com.google.android.gms.internal.play_billing.F H(com.google.android.gms.internal.play_billing.X x9) {
        com.google.android.gms.internal.play_billing.F f9;
        com.google.android.gms.internal.play_billing.F f10 = com.google.android.gms.internal.play_billing.F.f19209d;
        do {
            f9 = x9.f19256i;
            if (f10 == f9) {
                break;
            }
        } while (!L(x9, f9, f10));
        return f9;
    }

    @Override // R8.i
    public final com.google.android.gms.internal.play_billing.K I(com.google.android.gms.internal.play_billing.X x9) {
        com.google.android.gms.internal.play_billing.K k9;
        com.google.android.gms.internal.play_billing.K k10 = com.google.android.gms.internal.play_billing.K.f19243c;
        do {
            k9 = x9.j;
            if (k10 == k9) {
                break;
            }
        } while (!N(x9, k9, k10));
        return k9;
    }

    @Override // R8.i
    public final void J(com.google.android.gms.internal.play_billing.K k9, com.google.android.gms.internal.play_billing.K k10) {
        f19233n.putObject(k9, f19238s, k10);
    }

    @Override // R8.i
    public final void K(com.google.android.gms.internal.play_billing.K k9, java.lang.Thread thread) {
        f19233n.putObject(k9, f19237r, thread);
    }

    @Override // R8.i
    public final boolean L(com.google.android.gms.internal.play_billing.X x9, com.google.android.gms.internal.play_billing.F f9, com.google.android.gms.internal.play_billing.F f10) {
        return com.google.android.gms.internal.play_billing.N.a(f19233n, x9, f19234o, f9, f10);
    }

    @Override // R8.i
    public final boolean M(com.google.android.gms.internal.play_billing.L l2, java.lang.Object obj, java.lang.Object obj2) {
        return com.google.android.gms.internal.play_billing.N.a(f19233n, l2, f19236q, obj, obj2);
    }

    @Override // R8.i
    public final boolean N(com.google.android.gms.internal.play_billing.L l2, com.google.android.gms.internal.play_billing.K k9, com.google.android.gms.internal.play_billing.K k10) {
        return com.google.android.gms.internal.play_billing.N.a(f19233n, l2, f19235p, k9, k10);
    }
}
