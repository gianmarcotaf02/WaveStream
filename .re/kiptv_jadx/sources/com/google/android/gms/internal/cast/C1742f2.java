package com.google.android.gms.internal.cast;

/* JADX INFO: renamed from: com.google.android.gms.internal.cast.f2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1742f2 extends com.google.android.gms.internal.cast.H {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final sun.misc.Unsafe f18903k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final long f18904l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final long f18905m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final long f18906n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final long f18907o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final long f18908p;

    static {
        sun.misc.Unsafe unsafe;
        try {
            try {
                unsafe = sun.misc.Unsafe.getUnsafe();
            } catch (java.security.PrivilegedActionException e6) {
                throw new java.lang.RuntimeException("Could not initialize intrinsics", e6.getCause());
            }
        } catch (java.lang.SecurityException unused) {
            unsafe = (sun.misc.Unsafe) java.security.AccessController.doPrivileged(new com.google.android.gms.internal.cast.C1738e2());
        }
        try {
            f18905m = unsafe.objectFieldOffset(com.google.android.gms.internal.cast.AbstractC1750h2.class.getDeclaredField(androidx.media3.exoplayer.upstream.CmcdData.OBJECT_TYPE_MANIFEST));
            f18904l = unsafe.objectFieldOffset(com.google.android.gms.internal.cast.AbstractC1750h2.class.getDeclaredField(androidx.media3.exoplayer.upstream.CmcdData.STREAM_TYPE_LIVE));
            f18906n = unsafe.objectFieldOffset(com.google.android.gms.internal.cast.AbstractC1750h2.class.getDeclaredField("k"));
            f18907o = unsafe.objectFieldOffset(com.google.android.gms.internal.cast.C1746g2.class.getDeclaredField(androidx.media3.exoplayer.upstream.CmcdData.OBJECT_TYPE_AUDIO_ONLY));
            f18908p = unsafe.objectFieldOffset(com.google.android.gms.internal.cast.C1746g2.class.getDeclaredField("b"));
            f18903k = unsafe;
        } catch (java.lang.NoSuchFieldException e9) {
            throw new java.lang.RuntimeException(e9);
        }
    }

    @Override // com.google.android.gms.internal.cast.H
    public final com.google.android.gms.internal.cast.C1726b2 d(com.google.android.gms.internal.cast.AbstractC1750h2 abstractC1750h2) {
        com.google.android.gms.internal.cast.C1726b2 c1726b2;
        com.google.android.gms.internal.cast.C1726b2 c1726b3 = com.google.android.gms.internal.cast.C1726b2.f18873d;
        do {
            c1726b2 = abstractC1750h2.f18923l;
            if (c1726b3 == c1726b2) {
                break;
            }
        } while (!q(abstractC1750h2, c1726b2, c1726b3));
        return c1726b2;
    }

    @Override // com.google.android.gms.internal.cast.H
    public final com.google.android.gms.internal.cast.C1746g2 k(com.google.android.gms.internal.cast.AbstractC1750h2 abstractC1750h2) {
        com.google.android.gms.internal.cast.C1746g2 c1746g2;
        com.google.android.gms.internal.cast.C1746g2 c1746g3 = com.google.android.gms.internal.cast.C1746g2.f18913c;
        do {
            c1746g2 = abstractC1750h2.f18924m;
            if (c1746g3 == c1746g2) {
                break;
            }
        } while (!s(abstractC1750h2, c1746g2, c1746g3));
        return c1746g2;
    }

    @Override // com.google.android.gms.internal.cast.H
    public final void m(com.google.android.gms.internal.cast.C1746g2 c1746g2, com.google.android.gms.internal.cast.C1746g2 c1746g3) {
        f18903k.putObject(c1746g2, f18908p, c1746g3);
    }

    @Override // com.google.android.gms.internal.cast.H
    public final void o(com.google.android.gms.internal.cast.C1746g2 c1746g2, java.lang.Thread thread) {
        f18903k.putObject(c1746g2, f18907o, thread);
    }

    @Override // com.google.android.gms.internal.cast.H
    public final boolean q(com.google.android.gms.internal.cast.AbstractC1750h2 abstractC1750h2, com.google.android.gms.internal.cast.C1726b2 c1726b2, com.google.android.gms.internal.cast.C1726b2 c1726b3) {
        return com.google.android.gms.internal.cast.AbstractC1758j2.a(f18903k, abstractC1750h2, f18904l, c1726b2, c1726b3);
    }

    @Override // com.google.android.gms.internal.cast.H
    public final boolean r(com.google.android.gms.internal.cast.AbstractC1750h2 abstractC1750h2, java.lang.Object obj, java.lang.Object obj2) {
        return com.google.android.gms.internal.cast.AbstractC1758j2.a(f18903k, abstractC1750h2, f18906n, obj, obj2);
    }

    @Override // com.google.android.gms.internal.cast.H
    public final boolean s(com.google.android.gms.internal.cast.AbstractC1750h2 abstractC1750h2, com.google.android.gms.internal.cast.C1746g2 c1746g2, com.google.android.gms.internal.cast.C1746g2 c1746g3) {
        return com.google.android.gms.internal.cast.AbstractC1758j2.a(f18903k, abstractC1750h2, f18905m, c1746g2, c1746g3);
    }
}
