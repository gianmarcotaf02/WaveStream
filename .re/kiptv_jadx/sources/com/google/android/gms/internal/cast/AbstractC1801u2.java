package com.google.android.gms.internal.cast;

/* JADX INFO: renamed from: com.google.android.gms.internal.cast.u2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1801u2 {
    protected int zza;

    public static void b(java.util.ArrayList arrayList, java.util.List list) {
        java.nio.charset.Charset charset = com.google.android.gms.internal.cast.J2.f18779a;
        int size = arrayList.size();
        if (list instanceof java.util.ArrayList) {
            ((java.util.ArrayList) list).ensureCapacity(list.size() + size);
        }
        if (list instanceof com.google.android.gms.internal.cast.V2) {
            com.google.android.gms.internal.cast.V2 v6 = (com.google.android.gms.internal.cast.V2) list;
            int i3 = ((com.google.android.gms.internal.cast.V2) list).j + size;
            int length = v6.f18830i.length;
            if (i3 > length) {
                while (length < i3) {
                    length = Y6.f.c(length, 3, 2, 1);
                }
                v6.f18830i = java.util.Arrays.copyOf(v6.f18830i, length);
            }
        }
        int size2 = list.size();
        int size3 = arrayList.size();
        for (int i9 = 0; i9 < size3; i9++) {
            java.lang.Object obj = arrayList.get(i9);
            if (obj == null) {
                java.lang.String strF = Y6.f.f(list.size() - size2, "Element at index ", " is null.");
                int size4 = list.size();
                while (true) {
                    size4--;
                    if (size4 < size2) {
                        throw new java.lang.NullPointerException(strF);
                    }
                    list.remove(size4);
                }
            } else {
                list.add(obj);
            }
        }
    }

    public abstract int a(com.google.android.gms.internal.cast.X2 x9);
}
