package com.google.common.util.concurrent;

import sun.misc.Unsafe;

public abstract class AbstractC1897l {
    public static boolean a(Unsafe unsafe, AbstractC1902q abstractC1902q, long j, C1890e c1890e, C1890e c1890e2) {
        while (!unsafe.compareAndSwapObject(abstractC1902q, j, c1890e, c1890e2)) {
            if (unsafe.getObject(abstractC1902q, j) != c1890e) {
                return false;
            }
        }
        return true;
    }
}
