package androidx.datastore.preferences.protobuf;

import U.C0948v;

public final class f0 {
    public static e0 a(Object obj) {
        AbstractC1514v abstractC1514v = (AbstractC1514v) obj;
        e0 e0Var = abstractC1514v.unknownFields;
        if (e0Var != e0.f16194f) {
            return e0Var;
        }
        e0 e0Var2 = new e0(0, new int[8], new Object[8], true);
        abstractC1514v.unknownFields = e0Var2;
        return e0Var2;
    }

    public static boolean b(int i3, C0948v c0948v, Object obj) throws C1518z, com.google.crypto.tink.shaded.protobuf.C {
        int i9 = c0948v.f10086b;
        int i10 = i9 >>> 3;
        int i11 = i9 & 7;
        AbstractC1503j abstractC1503j = (AbstractC1503j) c0948v.f10089e;
        if (i11 == 0) {
            c0948v.V(0);
            ((e0) obj).c(i10 << 3, Long.valueOf(abstractC1503j.v()));
            return true;
        }
        if (i11 == 1) {
            c0948v.V(1);
            ((e0) obj).c((i10 << 3) | 1, Long.valueOf(abstractC1503j.s()));
            return true;
        }
        if (i11 == 2) {
            ((e0) obj).c((i10 << 3) | 2, c0948v.n());
            return true;
        }
        if (i11 != 3) {
            if (i11 == 4) {
                return false;
            }
            if (i11 != 5) {
                throw C1518z.b();
            }
            c0948v.V(5);
            ((e0) obj).c(5 | (i10 << 3), Integer.valueOf(abstractC1503j.r()));
            return true;
        }
        e0 e0Var = new e0(0, new int[8], new Object[8], true);
        int i12 = i10 << 3;
        int i13 = i12 | 4;
        int i14 = i3 + 1;
        if (i14 >= 100) {
            throw new C1518z("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        while (c0948v.e() != Integer.MAX_VALUE && b(i14, c0948v, e0Var)) {
        }
        if (i13 != c0948v.f10086b) {
            throw new C1518z("Protocol message end-group tag did not match expected tag.");
        }
        if (e0Var.f16199e) {
            e0Var.f16199e = false;
        }
        ((e0) obj).c(i12 | 3, e0Var);
        return true;
    }
}
