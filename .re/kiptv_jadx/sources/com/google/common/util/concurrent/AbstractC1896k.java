package com.google.common.util.concurrent;

/* JADX INFO: renamed from: com.google.common.util.concurrent.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC1896k {
    public static /* synthetic */ boolean a(sun.misc.Unsafe unsafe, com.google.common.util.concurrent.AbstractC1902q abstractC1902q, long j, com.google.common.util.concurrent.C1901p c1901p, com.google.common.util.concurrent.C1901p c1901p2) {
        while (!unsafe.compareAndSwapObject(abstractC1902q, j, c1901p, c1901p2)) {
            if (unsafe.getObject(abstractC1902q, j) != c1901p) {
                return false;
            }
        }
        return true;
    }
}
