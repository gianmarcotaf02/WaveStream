package com.google.common.util.concurrent;

/* JADX INFO: renamed from: com.google.common.util.concurrent.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1900o extends com.google.common.util.concurrent.AbstractC1887b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final sun.misc.Unsafe f19442a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final long f19443b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final long f19444c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final long f19445d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final long f19446e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final long f19447f;

    static {
        sun.misc.Unsafe unsafe;
        try {
            try {
                unsafe = sun.misc.Unsafe.getUnsafe();
            } catch (java.security.PrivilegedActionException e6) {
                throw new java.lang.RuntimeException("Could not initialize intrinsics", e6.getCause());
            }
        } catch (java.lang.SecurityException unused) {
            unsafe = (sun.misc.Unsafe) java.security.AccessController.doPrivileged(new com.google.common.util.concurrent.C1899n());
        }
        try {
            f19444c = unsafe.objectFieldOffset(com.google.common.util.concurrent.AbstractC1902q.class.getDeclaredField("waiters"));
            f19443b = unsafe.objectFieldOffset(com.google.common.util.concurrent.AbstractC1902q.class.getDeclaredField("listeners"));
            f19445d = unsafe.objectFieldOffset(com.google.common.util.concurrent.AbstractC1902q.class.getDeclaredField("value"));
            f19446e = unsafe.objectFieldOffset(com.google.common.util.concurrent.C1901p.class.getDeclaredField(androidx.media3.exoplayer.upstream.CmcdData.OBJECT_TYPE_AUDIO_ONLY));
            f19447f = unsafe.objectFieldOffset(com.google.common.util.concurrent.C1901p.class.getDeclaredField("b"));
            f19442a = unsafe;
        } catch (java.lang.NoSuchFieldException e9) {
            throw new java.lang.RuntimeException(e9);
        }
    }

    @Override // com.google.common.util.concurrent.AbstractC1887b
    public final boolean a(com.google.common.util.concurrent.AbstractC1902q abstractC1902q, com.google.common.util.concurrent.C1890e c1890e, com.google.common.util.concurrent.C1890e c1890e2) {
        return com.google.common.util.concurrent.AbstractC1897l.a(f19442a, abstractC1902q, f19443b, c1890e, c1890e2);
    }

    @Override // com.google.common.util.concurrent.AbstractC1887b
    public final boolean b(com.google.common.util.concurrent.AbstractC1902q abstractC1902q, java.lang.Object obj, java.lang.Object obj2) {
        return com.google.common.util.concurrent.AbstractC1898m.a(f19442a, abstractC1902q, f19445d, obj, obj2);
    }

    @Override // com.google.common.util.concurrent.AbstractC1887b
    public final boolean c(com.google.common.util.concurrent.AbstractC1902q abstractC1902q, com.google.common.util.concurrent.C1901p c1901p, com.google.common.util.concurrent.C1901p c1901p2) {
        return com.google.common.util.concurrent.AbstractC1896k.a(f19442a, abstractC1902q, f19444c, c1901p, c1901p2);
    }

    @Override // com.google.common.util.concurrent.AbstractC1887b
    public final com.google.common.util.concurrent.C1890e d(com.google.common.util.concurrent.AbstractC1902q abstractC1902q) {
        com.google.common.util.concurrent.C1890e c1890e;
        com.google.common.util.concurrent.C1890e c1890e2 = com.google.common.util.concurrent.C1890e.f19431d;
        do {
            c1890e = abstractC1902q.listeners;
            if (c1890e2 == c1890e) {
                break;
            }
        } while (!a(abstractC1902q, c1890e, c1890e2));
        return c1890e;
    }

    @Override // com.google.common.util.concurrent.AbstractC1887b
    public final com.google.common.util.concurrent.C1901p e(com.google.common.util.concurrent.AbstractC1902q abstractC1902q) {
        com.google.common.util.concurrent.C1901p c1901p;
        com.google.common.util.concurrent.C1901p c1901p2 = com.google.common.util.concurrent.C1901p.f19448c;
        do {
            c1901p = abstractC1902q.waiters;
            if (c1901p2 == c1901p) {
                break;
            }
        } while (!c(abstractC1902q, c1901p, c1901p2));
        return c1901p;
    }

    @Override // com.google.common.util.concurrent.AbstractC1887b
    public final void f(com.google.common.util.concurrent.C1901p c1901p, com.google.common.util.concurrent.C1901p c1901p2) {
        f19442a.putObject(c1901p, f19447f, c1901p2);
    }

    @Override // com.google.common.util.concurrent.AbstractC1887b
    public final void g(com.google.common.util.concurrent.C1901p c1901p, java.lang.Thread thread) {
        f19442a.putObject(c1901p, f19446e, thread);
    }
}
