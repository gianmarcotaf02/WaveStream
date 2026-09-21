package com.google.common.util.concurrent;

import sun.misc.Unsafe;

public abstract class AbstractC1898m {
    public static boolean a(Unsafe unsafe, AbstractC1902q abstractC1902q, long j, Object obj, Object obj2) {
        while (!unsafe.compareAndSwapObject(abstractC1902q, j, obj, obj2)) {
            if (unsafe.getObject(abstractC1902q, j) != obj) {
                return false;
            }
        }
        return true;
    }
}
