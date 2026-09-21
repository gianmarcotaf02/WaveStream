package com.google.android.gms.internal.play_billing;

import sun.misc.Unsafe;

public abstract class N {
    public static boolean a(Unsafe unsafe, L l2, long j, Object obj, Object obj2) {
        while (!M.a(unsafe, l2, j, obj, obj2)) {
            if (unsafe.getObject(l2, j) != obj) {
                return false;
            }
        }
        return true;
    }
}
