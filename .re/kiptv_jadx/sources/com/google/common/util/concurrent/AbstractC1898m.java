package com.google.common.util.concurrent;

/* JADX INFO: renamed from: com.google.common.util.concurrent.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC1898m {
    public static /* synthetic */ boolean a(sun.misc.Unsafe unsafe, com.google.common.util.concurrent.AbstractC1902q abstractC1902q, long j, java.lang.Object obj, java.lang.Object obj2) {
        while (!unsafe.compareAndSwapObject(abstractC1902q, j, obj, obj2)) {
            if (unsafe.getObject(abstractC1902q, j) != obj) {
                return false;
            }
        }
        return true;
    }
}
