package com.google.common.util.concurrent;

import sun.misc.Unsafe;

public abstract class AbstractC1896k {
    public static boolean a(Unsafe unsafe, AbstractC1902q abstractC1902q, long j, C1901p c1901p, C1901p c1901p2) {
        while (!unsafe.compareAndSwapObject(abstractC1902q, j, c1901p, c1901p2)) {
            if (unsafe.getObject(abstractC1902q, j) != c1901p) {
                return false;
            }
        }
        return true;
    }
}
