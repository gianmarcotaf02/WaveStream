package com.google.android.gms.internal.play_billing;

import androidx.media3.exoplayer.upstream.CmcdData;
import java.security.AccessController;
import java.security.PrivilegedActionException;
import sun.misc.Unsafe;

public final class J extends R8.i {

    public static final Unsafe f19233n;

    public static final long f19234o;

    public static final long f19235p;

    public static final long f19236q;

    public static final long f19237r;

    public static final long f19238s;

    static {
        Unsafe unsafe;
        try {
            try {
                unsafe = Unsafe.getUnsafe();
            } catch (PrivilegedActionException e6) {
                throw new RuntimeException("Could not initialize intrinsics", e6.getCause());
            }
        } catch (SecurityException unused) {
            unsafe = (Unsafe) AccessController.doPrivileged(new O());
        }
        try {
            f19235p = unsafe.objectFieldOffset(L.class.getDeclaredField("j"));
            f19234o = unsafe.objectFieldOffset(L.class.getDeclaredField(CmcdData.OBJECT_TYPE_INIT_SEGMENT));
            f19236q = unsafe.objectFieldOffset(L.class.getDeclaredField(CmcdData.STREAMING_FORMAT_HLS));
            f19237r = unsafe.objectFieldOffset(K.class.getDeclaredField(CmcdData.OBJECT_TYPE_AUDIO_ONLY));
            f19238s = unsafe.objectFieldOffset(K.class.getDeclaredField("b"));
            f19233n = unsafe;
        } catch (NoSuchFieldException e9) {
            throw new RuntimeException(e9);
        }
    }

    @Override
    public final F H(X x9) {
        F f9;
        F f10 = F.f19209d;
        do {
            f9 = x9.f19256i;
            if (f10 == f9) {
                break;
            }
        } while (!L(x9, f9, f10));
        return f9;
    }

    @Override
    public final K I(X x9) {
        K k9;
        K k10 = K.f19243c;
        do {
            k9 = x9.j;
            if (k10 == k9) {
                break;
            }
        } while (!N(x9, k9, k10));
        return k9;
    }

    @Override
    public final void J(K k9, K k10) {
        f19233n.putObject(k9, f19238s, k10);
    }

    @Override
    public final void K(K k9, Thread thread) {
        f19233n.putObject(k9, f19237r, thread);
    }

    @Override
    public final boolean L(X x9, F f9, F f10) {
        return N.a(f19233n, x9, f19234o, f9, f10);
    }

    @Override
    public final boolean M(L l2, Object obj, Object obj2) {
        return N.a(f19233n, l2, f19236q, obj, obj2);
    }

    @Override
    public final boolean N(L l2, K k9, K k10) {
        return N.a(f19233n, l2, f19235p, k9, k10);
    }
}
