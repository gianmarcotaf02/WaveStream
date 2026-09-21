package com.google.android.gms.internal.play_billing;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class M {
    public static /* synthetic */ boolean a(sun.misc.Unsafe unsafe, com.google.android.gms.internal.play_billing.L l2, long j, java.lang.Object obj, java.lang.Object obj2) {
        while (!unsafe.compareAndSwapObject(l2, j, obj, obj2)) {
            if (unsafe.getObject(l2, j) != obj) {
                return false;
            }
        }
        return true;
    }
}
