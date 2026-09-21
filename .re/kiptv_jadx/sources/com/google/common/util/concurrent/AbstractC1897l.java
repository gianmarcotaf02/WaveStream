package com.google.common.util.concurrent;

/* JADX INFO: renamed from: com.google.common.util.concurrent.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC1897l {
    public static /* synthetic */ boolean a(sun.misc.Unsafe unsafe, com.google.common.util.concurrent.AbstractC1902q abstractC1902q, long j, com.google.common.util.concurrent.C1890e c1890e, com.google.common.util.concurrent.C1890e c1890e2) {
        while (!unsafe.compareAndSwapObject(abstractC1902q, j, c1890e, c1890e2)) {
            if (unsafe.getObject(abstractC1902q, j) != c1890e) {
                return false;
            }
        }
        return true;
    }
}
