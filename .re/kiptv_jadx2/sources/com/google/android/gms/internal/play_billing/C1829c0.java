package com.google.android.gms.internal.play_billing;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public final class C1829c0 extends AbstractC1877v0 {
    private static final C1829c0 zzb;
    private InterfaceC1885z0 zzd = R0.f19280l;

    static {
        C1829c0 c1829c0 = new C1829c0();
        zzb = c1829c0;
        AbstractC1877v0.f(C1829c0.class, c1829c0);
    }

    public static C1826b0 p() {
        return (C1826b0) zzb.k();
    }

    public static void q(C1829c0 c1829c0, ArrayList arrayList) {
        InterfaceC1885z0 interfaceC1885z0 = c1829c0.zzd;
        if (!((AbstractC1844h0) interfaceC1885z0).f19335h) {
            int size = interfaceC1885z0.size();
            c1829c0.zzd = interfaceC1885z0.a(size + size);
        }
        List list = c1829c0.zzd;
        Charset charset = B0.f19193a;
        int size2 = arrayList.size();
        if (list instanceof ArrayList) {
            ((ArrayList) list).ensureCapacity(list.size() + size2);
        } else if (list instanceof R0) {
            R0 r9 = (R0) list;
            int i3 = ((R0) list).j + size2;
            int length = r9.f19281i.length;
            if (i3 > length) {
                if (length != 0) {
                    while (length < i3) {
                        length = Math.max(((length * 3) / 2) + 1, 10);
                    }
                    r9.f19281i = Arrays.copyOf(r9.f19281i, length);
                } else {
                    r9.f19281i = new Object[Math.max(i3, 10)];
                }
            }
        }
        int size3 = list.size();
        int size4 = arrayList.size();
        for (int i9 = 0; i9 < size4; i9++) {
            Object obj = arrayList.get(i9);
            if (obj == null) {
                String strF = Y6.f.f(list.size() - size3, "Element at index ", " is null.");
                int size5 = list.size();
                while (true) {
                    size5--;
                    if (size5 < size3) {
                        throw new NullPointerException(strF);
                    }
                    list.remove(size5);
                }
            } else {
                list.add(obj);
            }
        }
    }

    @Override
    public final Object j(int i3) {
        int i9 = i3 - 1;
        if (i9 == 0) {
            return (byte) 1;
        }
        if (i9 == 2) {
            return new S0(zzb, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzd", C1823a0.class});
        }
        if (i9 == 3) {
            return new C1829c0();
        }
        if (i9 == 4) {
            return new C1826b0(zzb);
        }
        if (i9 == 5) {
            return zzb;
        }
        throw null;
    }
}
