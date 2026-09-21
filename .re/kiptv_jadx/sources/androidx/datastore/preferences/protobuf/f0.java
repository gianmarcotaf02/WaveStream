package androidx.datastore.preferences.protobuf;

/* JADX INFO: loaded from: classes.dex */
public final class f0 {
    public static androidx.datastore.preferences.protobuf.e0 a(java.lang.Object obj) {
        androidx.datastore.preferences.protobuf.AbstractC1514v abstractC1514v = (androidx.datastore.preferences.protobuf.AbstractC1514v) obj;
        androidx.datastore.preferences.protobuf.e0 e0Var = abstractC1514v.unknownFields;
        if (e0Var != androidx.datastore.preferences.protobuf.e0.f16194f) {
            return e0Var;
        }
        androidx.datastore.preferences.protobuf.e0 e0Var2 = new androidx.datastore.preferences.protobuf.e0(0, new int[8], new java.lang.Object[8], true);
        abstractC1514v.unknownFields = e0Var2;
        return e0Var2;
    }

    public static boolean b(int i3, U.C0948v c0948v, java.lang.Object obj) throws androidx.datastore.preferences.protobuf.C1518z, com.google.crypto.tink.shaded.protobuf.C {
        int i9 = c0948v.f10086b;
        int i10 = i9 >>> 3;
        int i11 = i9 & 7;
        androidx.datastore.preferences.protobuf.AbstractC1503j abstractC1503j = (androidx.datastore.preferences.protobuf.AbstractC1503j) c0948v.f10089e;
        if (i11 == 0) {
            c0948v.V(0);
            ((androidx.datastore.preferences.protobuf.e0) obj).c(i10 << 3, java.lang.Long.valueOf(abstractC1503j.v()));
            return true;
        }
        if (i11 == 1) {
            c0948v.V(1);
            ((androidx.datastore.preferences.protobuf.e0) obj).c((i10 << 3) | 1, java.lang.Long.valueOf(abstractC1503j.s()));
            return true;
        }
        if (i11 == 2) {
            ((androidx.datastore.preferences.protobuf.e0) obj).c((i10 << 3) | 2, c0948v.n());
            return true;
        }
        if (i11 != 3) {
            if (i11 == 4) {
                return false;
            }
            if (i11 != 5) {
                throw androidx.datastore.preferences.protobuf.C1518z.b();
            }
            c0948v.V(5);
            ((androidx.datastore.preferences.protobuf.e0) obj).c(5 | (i10 << 3), java.lang.Integer.valueOf(abstractC1503j.r()));
            return true;
        }
        androidx.datastore.preferences.protobuf.e0 e0Var = new androidx.datastore.preferences.protobuf.e0(0, new int[8], new java.lang.Object[8], true);
        int i12 = i10 << 3;
        int i13 = i12 | 4;
        int i14 = i3 + 1;
        if (i14 >= 100) {
            throw new androidx.datastore.preferences.protobuf.C1518z("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        while (c0948v.e() != Integer.MAX_VALUE && b(i14, c0948v, e0Var)) {
        }
        if (i13 != c0948v.f10086b) {
            throw new androidx.datastore.preferences.protobuf.C1518z("Protocol message end-group tag did not match expected tag.");
        }
        if (e0Var.f16199e) {
            e0Var.f16199e = false;
        }
        ((androidx.datastore.preferences.protobuf.e0) obj).c(i12 | 3, e0Var);
        return true;
    }
}
