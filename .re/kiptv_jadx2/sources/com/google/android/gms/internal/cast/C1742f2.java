package com.google.android.gms.internal.cast;

import androidx.media3.exoplayer.upstream.CmcdData;
import java.security.AccessController;
import java.security.PrivilegedActionException;
import sun.misc.Unsafe;

public final class C1742f2 extends H {

    public static final Unsafe f18903k;

    public static final long f18904l;

    public static final long f18905m;

    public static final long f18906n;

    public static final long f18907o;

    public static final long f18908p;

    static {
        Unsafe unsafe;
        try {
            try {
                unsafe = Unsafe.getUnsafe();
            } catch (PrivilegedActionException e6) {
                throw new RuntimeException("Could not initialize intrinsics", e6.getCause());
            }
        } catch (SecurityException unused) {
            unsafe = (Unsafe) AccessController.doPrivileged(new C1738e2());
        }
        try {
            f18905m = unsafe.objectFieldOffset(AbstractC1750h2.class.getDeclaredField(CmcdData.OBJECT_TYPE_MANIFEST));
            f18904l = unsafe.objectFieldOffset(AbstractC1750h2.class.getDeclaredField(CmcdData.STREAM_TYPE_LIVE));
            f18906n = unsafe.objectFieldOffset(AbstractC1750h2.class.getDeclaredField("k"));
            f18907o = unsafe.objectFieldOffset(C1746g2.class.getDeclaredField(CmcdData.OBJECT_TYPE_AUDIO_ONLY));
            f18908p = unsafe.objectFieldOffset(C1746g2.class.getDeclaredField("b"));
            f18903k = unsafe;
        } catch (NoSuchFieldException e9) {
            throw new RuntimeException(e9);
        }
    }

    @Override
    public final C1726b2 d(AbstractC1750h2 abstractC1750h2) {
        C1726b2 c1726b2;
        C1726b2 c1726b3 = C1726b2.f18873d;
        do {
            c1726b2 = abstractC1750h2.f18923l;
            if (c1726b3 == c1726b2) {
                break;
            }
        } while (!q(abstractC1750h2, c1726b2, c1726b3));
        return c1726b2;
    }

    @Override
    public final C1746g2 k(AbstractC1750h2 abstractC1750h2) {
        C1746g2 c1746g2;
        C1746g2 c1746g3 = C1746g2.f18913c;
        do {
            c1746g2 = abstractC1750h2.f18924m;
            if (c1746g3 == c1746g2) {
                break;
            }
        } while (!s(abstractC1750h2, c1746g2, c1746g3));
        return c1746g2;
    }

    @Override
    public final void m(C1746g2 c1746g2, C1746g2 c1746g3) {
        f18903k.putObject(c1746g2, f18908p, c1746g3);
    }

    @Override
    public final void o(C1746g2 c1746g2, Thread thread) {
        f18903k.putObject(c1746g2, f18907o, thread);
    }

    @Override
    public final boolean q(AbstractC1750h2 abstractC1750h2, C1726b2 c1726b2, C1726b2 c1726b3) {
        return AbstractC1758j2.a(f18903k, abstractC1750h2, f18904l, c1726b2, c1726b3);
    }

    @Override
    public final boolean r(AbstractC1750h2 abstractC1750h2, Object obj, Object obj2) {
        return AbstractC1758j2.a(f18903k, abstractC1750h2, f18906n, obj, obj2);
    }

    @Override
    public final boolean s(AbstractC1750h2 abstractC1750h2, C1746g2 c1746g2, C1746g2 c1746g3) {
        return AbstractC1758j2.a(f18903k, abstractC1750h2, f18905m, c1746g2, c1746g3);
    }
}
