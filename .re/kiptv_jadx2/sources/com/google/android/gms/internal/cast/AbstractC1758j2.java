package com.google.android.gms.internal.cast;

import sun.misc.Unsafe;

public abstract class AbstractC1758j2 {
    public static boolean a(Unsafe unsafe, AbstractC1750h2 abstractC1750h2, long j, Object obj, Object obj2) {
        while (!AbstractC1754i2.a(unsafe, abstractC1750h2, j, obj, obj2)) {
            if (unsafe.getObject(abstractC1750h2, j) != obj) {
                return false;
            }
        }
        return true;
    }
}
