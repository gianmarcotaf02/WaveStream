package com.google.common.util.concurrent;

import androidx.media3.exoplayer.upstream.CmcdData;
import java.security.AccessController;
import java.security.PrivilegedActionException;
import sun.misc.Unsafe;

public final class C1900o extends AbstractC1887b {

    public static final Unsafe f19442a;

    public static final long f19443b;

    public static final long f19444c;

    public static final long f19445d;

    public static final long f19446e;

    public static final long f19447f;

    static {
        Unsafe unsafe;
        try {
            try {
                unsafe = Unsafe.getUnsafe();
            } catch (PrivilegedActionException e6) {
                throw new RuntimeException("Could not initialize intrinsics", e6.getCause());
            }
        } catch (SecurityException unused) {
            unsafe = (Unsafe) AccessController.doPrivileged(new C1899n());
        }
        try {
            f19444c = unsafe.objectFieldOffset(AbstractC1902q.class.getDeclaredField("waiters"));
            f19443b = unsafe.objectFieldOffset(AbstractC1902q.class.getDeclaredField("listeners"));
            f19445d = unsafe.objectFieldOffset(AbstractC1902q.class.getDeclaredField("value"));
            f19446e = unsafe.objectFieldOffset(C1901p.class.getDeclaredField(CmcdData.OBJECT_TYPE_AUDIO_ONLY));
            f19447f = unsafe.objectFieldOffset(C1901p.class.getDeclaredField("b"));
            f19442a = unsafe;
        } catch (NoSuchFieldException e9) {
            throw new RuntimeException(e9);
        }
    }

    @Override
    public final boolean a(AbstractC1902q abstractC1902q, C1890e c1890e, C1890e c1890e2) {
        return AbstractC1897l.a(f19442a, abstractC1902q, f19443b, c1890e, c1890e2);
    }

    @Override
    public final boolean b(AbstractC1902q abstractC1902q, Object obj, Object obj2) {
        return AbstractC1898m.a(f19442a, abstractC1902q, f19445d, obj, obj2);
    }

    @Override
    public final boolean c(AbstractC1902q abstractC1902q, C1901p c1901p, C1901p c1901p2) {
        return AbstractC1896k.a(f19442a, abstractC1902q, f19444c, c1901p, c1901p2);
    }

    @Override
    public final C1890e d(AbstractC1902q abstractC1902q) {
        C1890e c1890e;
        C1890e c1890e2 = C1890e.f19431d;
        do {
            c1890e = abstractC1902q.listeners;
            if (c1890e2 == c1890e) {
                break;
            }
        } while (!a(abstractC1902q, c1890e, c1890e2));
        return c1890e;
    }

    @Override
    public final C1901p e(AbstractC1902q abstractC1902q) {
        C1901p c1901p;
        C1901p c1901p2 = C1901p.f19448c;
        do {
            c1901p = abstractC1902q.waiters;
            if (c1901p2 == c1901p) {
                break;
            }
        } while (!c(abstractC1902q, c1901p, c1901p2));
        return c1901p;
    }

    @Override
    public final void f(C1901p c1901p, C1901p c1901p2) {
        f19442a.putObject(c1901p, f19447f, c1901p2);
    }

    @Override
    public final void g(C1901p c1901p, Thread thread) {
        f19442a.putObject(c1901p, f19446e, thread);
    }
}
