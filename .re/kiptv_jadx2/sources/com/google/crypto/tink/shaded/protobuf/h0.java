package com.google.crypto.tink.shaded.protobuf;

import U.C0948v;
import androidx.datastore.preferences.protobuf.AbstractC1503j;
import androidx.datastore.preferences.protobuf.C1517y;

public final class h0 {
    public static g0 a(Object obj) {
        AbstractC1928x abstractC1928x = (AbstractC1928x) obj;
        g0 g0Var = abstractC1928x.unknownFields;
        if (g0Var != g0.f19531f) {
            return g0Var;
        }
        g0 g0VarC = g0.c();
        abstractC1928x.unknownFields = g0VarC;
        return g0VarC;
    }

    public static boolean b(Object obj, C0948v c0948v) throws C1517y, D {
        int i3 = c0948v.f10086b;
        int i9 = i3 >>> 3;
        int i10 = i3 & 7;
        AbstractC1503j abstractC1503j = (AbstractC1503j) c0948v.f10089e;
        if (i10 == 0) {
            c0948v.V(0);
            ((g0) obj).d(i9 << 3, Long.valueOf(abstractC1503j.v()));
            return true;
        }
        if (i10 == 1) {
            c0948v.V(1);
            ((g0) obj).d((i9 << 3) | 1, Long.valueOf(abstractC1503j.s()));
            return true;
        }
        if (i10 == 2) {
            ((g0) obj).d((i9 << 3) | 2, c0948v.o());
            return true;
        }
        if (i10 != 3) {
            if (i10 == 4) {
                return false;
            }
            if (i10 != 5) {
                throw D.c();
            }
            c0948v.V(5);
            ((g0) obj).d((i9 << 3) | 5, Integer.valueOf(abstractC1503j.r()));
            return true;
        }
        g0 g0VarC = g0.c();
        int i11 = i9 << 3;
        int i12 = i11 | 4;
        while (c0948v.e() != Integer.MAX_VALUE && b(g0VarC, c0948v)) {
        }
        if (i12 != c0948v.f10086b) {
            throw new D("Protocol message end-group tag did not match expected tag.");
        }
        g0VarC.f19536e = false;
        ((g0) obj).d(i11 | 3, g0VarC);
        return true;
    }
}
