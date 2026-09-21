package com.google.android.gms.internal.cast;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public abstract class AbstractC1801u2 {
    protected int zza;

    public static void b(ArrayList arrayList, List list) {
        Charset charset = J2.f18779a;
        int size = arrayList.size();
        if (list instanceof ArrayList) {
            ((ArrayList) list).ensureCapacity(list.size() + size);
        }
        if (list instanceof V2) {
            V2 v6 = (V2) list;
            int i3 = ((V2) list).j + size;
            int length = v6.f18830i.length;
            if (i3 > length) {
                while (length < i3) {
                    length = Y6.f.c(length, 3, 2, 1);
                }
                v6.f18830i = Arrays.copyOf(v6.f18830i, length);
            }
        }
        int size2 = list.size();
        int size3 = arrayList.size();
        for (int i9 = 0; i9 < size3; i9++) {
            Object obj = arrayList.get(i9);
            if (obj == null) {
                String strF = Y6.f.f(list.size() - size2, "Element at index ", " is null.");
                int size4 = list.size();
                while (true) {
                    size4--;
                    if (size4 < size2) {
                        throw new NullPointerException(strF);
                    }
                    list.remove(size4);
                }
            } else {
                list.add(obj);
            }
        }
    }

    public abstract int a(X2 x9);
}
