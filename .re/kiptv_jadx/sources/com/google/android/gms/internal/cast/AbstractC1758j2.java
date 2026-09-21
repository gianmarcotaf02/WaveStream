package com.google.android.gms.internal.cast;

/* JADX INFO: renamed from: com.google.android.gms.internal.cast.j2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC1758j2 {
    public static /* synthetic */ boolean a(sun.misc.Unsafe unsafe, com.google.android.gms.internal.cast.AbstractC1750h2 abstractC1750h2, long j, java.lang.Object obj, java.lang.Object obj2) {
        while (!com.google.android.gms.internal.cast.AbstractC1754i2.a(unsafe, abstractC1750h2, j, obj, obj2)) {
            if (unsafe.getObject(abstractC1750h2, j) != obj) {
                return false;
            }
        }
        return true;
    }
}
