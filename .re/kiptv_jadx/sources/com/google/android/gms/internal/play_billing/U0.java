package com.google.android.gms.internal.play_billing;

/* JADX INFO: loaded from: classes.dex */
public abstract class U0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final com.google.android.gms.internal.play_billing.C1873t0 f19291a;

    static {
        int i3 = com.google.android.gms.internal.play_billing.AbstractC1847i0.f19337a;
        f19291a = new com.google.android.gms.internal.play_billing.C1873t0(6);
    }

    public static void a(int i3, java.util.List list, com.google.android.gms.internal.play_billing.G0 g9, boolean z6) throws androidx.datastore.preferences.protobuf.C1504k {
        if (list == null || list.isEmpty()) {
            return;
        }
        com.google.android.gms.internal.play_billing.C1866p0 c1866p0 = (com.google.android.gms.internal.play_billing.C1866p0) g9.f19215a;
        int i9 = 0;
        if (!z6) {
            while (i9 < list.size()) {
                c1866p0.L(i3, ((java.lang.Long) list.get(i9)).longValue());
                i9++;
            }
            return;
        }
        c1866p0.P(i3, 2);
        int i10 = 0;
        for (int i11 = 0; i11 < list.size(); i11++) {
            ((java.lang.Long) list.get(i11)).getClass();
            i10 += 8;
        }
        c1866p0.R(i10);
        while (i9 < list.size()) {
            c1866p0.M(((java.lang.Long) list.get(i9)).longValue());
            i9++;
        }
    }

    public static void b(int i3, java.util.List list, com.google.android.gms.internal.play_billing.G0 g9, boolean z6) throws androidx.datastore.preferences.protobuf.C1504k {
        if (list == null || list.isEmpty()) {
            return;
        }
        g9.getClass();
        boolean z9 = list instanceof com.google.android.gms.internal.play_billing.C1879w0;
        com.google.android.gms.internal.play_billing.C1866p0 c1866p0 = (com.google.android.gms.internal.play_billing.C1866p0) g9.f19215a;
        int i9 = 0;
        if (!z9) {
            if (!z6) {
                while (i9 < list.size()) {
                    int iIntValue = ((java.lang.Integer) list.get(i9)).intValue();
                    c1866p0.Q(i3, (iIntValue >> 31) ^ (iIntValue + iIntValue));
                    i9++;
                }
                return;
            }
            c1866p0.P(i3, 2);
            int iU = 0;
            for (int i10 = 0; i10 < list.size(); i10++) {
                int iIntValue2 = ((java.lang.Integer) list.get(i10)).intValue();
                iU += com.google.android.gms.internal.play_billing.C1866p0.U((iIntValue2 >> 31) ^ (iIntValue2 + iIntValue2));
            }
            c1866p0.R(iU);
            while (i9 < list.size()) {
                int iIntValue3 = ((java.lang.Integer) list.get(i9)).intValue();
                c1866p0.R((iIntValue3 >> 31) ^ (iIntValue3 + iIntValue3));
                i9++;
            }
            return;
        }
        com.google.android.gms.internal.play_billing.C1879w0 c1879w0 = (com.google.android.gms.internal.play_billing.C1879w0) list;
        if (!z6) {
            while (i9 < c1879w0.j) {
                int iE = c1879w0.e(i9);
                c1866p0.Q(i3, (iE >> 31) ^ (iE + iE));
                i9++;
            }
            return;
        }
        c1866p0.P(i3, 2);
        int iU2 = 0;
        for (int i11 = 0; i11 < c1879w0.j; i11++) {
            int iE2 = c1879w0.e(i11);
            iU2 += com.google.android.gms.internal.play_billing.C1866p0.U((iE2 >> 31) ^ (iE2 + iE2));
        }
        c1866p0.R(iU2);
        while (i9 < c1879w0.j) {
            int iE3 = c1879w0.e(i9);
            c1866p0.R((iE3 >> 31) ^ (iE3 + iE3));
            i9++;
        }
    }

    public static void c(int i3, java.util.List list, com.google.android.gms.internal.play_billing.G0 g9, boolean z6) throws androidx.datastore.preferences.protobuf.C1504k {
        if (list == null || list.isEmpty()) {
            return;
        }
        com.google.android.gms.internal.play_billing.C1866p0 c1866p0 = (com.google.android.gms.internal.play_billing.C1866p0) g9.f19215a;
        int i9 = 0;
        if (!z6) {
            while (i9 < list.size()) {
                long jLongValue = ((java.lang.Long) list.get(i9)).longValue();
                c1866p0.S(i3, (jLongValue >> 63) ^ (jLongValue + jLongValue));
                i9++;
            }
            return;
        }
        c1866p0.P(i3, 2);
        int iV = 0;
        for (int i10 = 0; i10 < list.size(); i10++) {
            long jLongValue2 = ((java.lang.Long) list.get(i10)).longValue();
            iV += com.google.android.gms.internal.play_billing.C1866p0.V((jLongValue2 >> 63) ^ (jLongValue2 + jLongValue2));
        }
        c1866p0.R(iV);
        while (i9 < list.size()) {
            long jLongValue3 = ((java.lang.Long) list.get(i9)).longValue();
            c1866p0.T((jLongValue3 >> 63) ^ (jLongValue3 + jLongValue3));
            i9++;
        }
    }

    public static void d(int i3, java.util.List list, com.google.android.gms.internal.play_billing.G0 g9, boolean z6) throws androidx.datastore.preferences.protobuf.C1504k {
        if (list == null || list.isEmpty()) {
            return;
        }
        g9.getClass();
        boolean z9 = list instanceof com.google.android.gms.internal.play_billing.C1879w0;
        com.google.android.gms.internal.play_billing.C1866p0 c1866p0 = (com.google.android.gms.internal.play_billing.C1866p0) g9.f19215a;
        int i9 = 0;
        if (!z9) {
            if (!z6) {
                while (i9 < list.size()) {
                    c1866p0.Q(i3, ((java.lang.Integer) list.get(i9)).intValue());
                    i9++;
                }
                return;
            }
            c1866p0.P(i3, 2);
            int iU = 0;
            for (int i10 = 0; i10 < list.size(); i10++) {
                iU += com.google.android.gms.internal.play_billing.C1866p0.U(((java.lang.Integer) list.get(i10)).intValue());
            }
            c1866p0.R(iU);
            while (i9 < list.size()) {
                c1866p0.R(((java.lang.Integer) list.get(i9)).intValue());
                i9++;
            }
            return;
        }
        com.google.android.gms.internal.play_billing.C1879w0 c1879w0 = (com.google.android.gms.internal.play_billing.C1879w0) list;
        if (!z6) {
            while (i9 < c1879w0.j) {
                c1866p0.Q(i3, c1879w0.e(i9));
                i9++;
            }
            return;
        }
        c1866p0.P(i3, 2);
        int iU2 = 0;
        for (int i11 = 0; i11 < c1879w0.j; i11++) {
            iU2 += com.google.android.gms.internal.play_billing.C1866p0.U(c1879w0.e(i11));
        }
        c1866p0.R(iU2);
        while (i9 < c1879w0.j) {
            c1866p0.R(c1879w0.e(i9));
            i9++;
        }
    }

    public static void e(int i3, java.util.List list, com.google.android.gms.internal.play_billing.G0 g9, boolean z6) throws androidx.datastore.preferences.protobuf.C1504k {
        if (list == null || list.isEmpty()) {
            return;
        }
        com.google.android.gms.internal.play_billing.C1866p0 c1866p0 = (com.google.android.gms.internal.play_billing.C1866p0) g9.f19215a;
        int i9 = 0;
        if (!z6) {
            while (i9 < list.size()) {
                c1866p0.S(i3, ((java.lang.Long) list.get(i9)).longValue());
                i9++;
            }
            return;
        }
        c1866p0.P(i3, 2);
        int iV = 0;
        for (int i10 = 0; i10 < list.size(); i10++) {
            iV += com.google.android.gms.internal.play_billing.C1866p0.V(((java.lang.Long) list.get(i10)).longValue());
        }
        c1866p0.R(iV);
        while (i9 < list.size()) {
            c1866p0.T(((java.lang.Long) list.get(i9)).longValue());
            i9++;
        }
    }

    public static boolean f(java.lang.Object obj, java.lang.Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static int g(java.util.List list) {
        int size = list.size();
        int i3 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof com.google.android.gms.internal.play_billing.C1879w0)) {
            int iV = 0;
            while (i3 < size) {
                iV += com.google.android.gms.internal.play_billing.C1866p0.V(((java.lang.Integer) list.get(i3)).intValue());
                i3++;
            }
            return iV;
        }
        com.google.android.gms.internal.play_billing.C1879w0 c1879w0 = (com.google.android.gms.internal.play_billing.C1879w0) list;
        int iV2 = 0;
        while (i3 < size) {
            iV2 += com.google.android.gms.internal.play_billing.C1866p0.V(c1879w0.e(i3));
            i3++;
        }
        return iV2;
    }

    public static int h(int i3, java.util.List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (com.google.android.gms.internal.play_billing.C1866p0.U(i3 << 3) + 4) * size;
    }

    public static int i(int i3, java.util.List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (com.google.android.gms.internal.play_billing.C1866p0.U(i3 << 3) + 8) * size;
    }

    public static int j(java.util.List list) {
        int size = list.size();
        int i3 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof com.google.android.gms.internal.play_billing.C1879w0)) {
            int iV = 0;
            while (i3 < size) {
                iV += com.google.android.gms.internal.play_billing.C1866p0.V(((java.lang.Integer) list.get(i3)).intValue());
                i3++;
            }
            return iV;
        }
        com.google.android.gms.internal.play_billing.C1879w0 c1879w0 = (com.google.android.gms.internal.play_billing.C1879w0) list;
        int iV2 = 0;
        while (i3 < size) {
            iV2 += com.google.android.gms.internal.play_billing.C1866p0.V(c1879w0.e(i3));
            i3++;
        }
        return iV2;
    }

    public static int k(java.util.List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iV = 0;
        for (int i3 = 0; i3 < size; i3++) {
            iV += com.google.android.gms.internal.play_billing.C1866p0.V(((java.lang.Long) list.get(i3)).longValue());
        }
        return iV;
    }

    public static int l(java.util.List list) {
        int size = list.size();
        int i3 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof com.google.android.gms.internal.play_billing.C1879w0)) {
            int iU = 0;
            while (i3 < size) {
                int iIntValue = ((java.lang.Integer) list.get(i3)).intValue();
                iU += com.google.android.gms.internal.play_billing.C1866p0.U((iIntValue >> 31) ^ (iIntValue + iIntValue));
                i3++;
            }
            return iU;
        }
        com.google.android.gms.internal.play_billing.C1879w0 c1879w0 = (com.google.android.gms.internal.play_billing.C1879w0) list;
        int iU2 = 0;
        while (i3 < size) {
            int iE = c1879w0.e(i3);
            iU2 += com.google.android.gms.internal.play_billing.C1866p0.U((iE >> 31) ^ (iE + iE));
            i3++;
        }
        return iU2;
    }

    public static int m(java.util.List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iV = 0;
        for (int i3 = 0; i3 < size; i3++) {
            long jLongValue = ((java.lang.Long) list.get(i3)).longValue();
            iV += com.google.android.gms.internal.play_billing.C1866p0.V((jLongValue >> 63) ^ (jLongValue + jLongValue));
        }
        return iV;
    }

    public static int n(java.util.List list) {
        int size = list.size();
        int i3 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof com.google.android.gms.internal.play_billing.C1879w0)) {
            int iU = 0;
            while (i3 < size) {
                iU += com.google.android.gms.internal.play_billing.C1866p0.U(((java.lang.Integer) list.get(i3)).intValue());
                i3++;
            }
            return iU;
        }
        com.google.android.gms.internal.play_billing.C1879w0 c1879w0 = (com.google.android.gms.internal.play_billing.C1879w0) list;
        int iU2 = 0;
        while (i3 < size) {
            iU2 += com.google.android.gms.internal.play_billing.C1866p0.U(c1879w0.e(i3));
            i3++;
        }
        return iU2;
    }

    public static int o(java.util.List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iV = 0;
        for (int i3 = 0; i3 < size; i3++) {
            iV += com.google.android.gms.internal.play_billing.C1866p0.V(((java.lang.Long) list.get(i3)).longValue());
        }
        return iV;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static void p(java.lang.Object obj, java.lang.Object obj2) {
        com.google.android.gms.internal.play_billing.AbstractC1877v0 abstractC1877v0 = (com.google.android.gms.internal.play_billing.AbstractC1877v0) obj;
        com.google.android.gms.internal.play_billing.X0 x9 = abstractC1877v0.zzc;
        com.google.android.gms.internal.play_billing.X0 x10 = ((com.google.android.gms.internal.play_billing.AbstractC1877v0) obj2).zzc;
        com.google.android.gms.internal.play_billing.X0 x11 = com.google.android.gms.internal.play_billing.X0.f19300f;
        if (!x11.equals(x10)) {
            if (x11.equals(x9)) {
                int i3 = x9.f19301a + x10.f19301a;
                int[] iArrCopyOf = java.util.Arrays.copyOf(x9.f19302b, i3);
                java.lang.System.arraycopy(x10.f19302b, 0, iArrCopyOf, x9.f19301a, x10.f19301a);
                java.lang.Object[] objArrCopyOf = java.util.Arrays.copyOf(x9.f19303c, i3);
                java.lang.System.arraycopy(x10.f19303c, 0, objArrCopyOf, x9.f19301a, x10.f19301a);
                x9 = new com.google.android.gms.internal.play_billing.X0(i3, iArrCopyOf, objArrCopyOf, true);
            } else {
                x9.getClass();
                if (!x10.equals(x11)) {
                    if (!x9.f19305e) {
                        throw new java.lang.UnsupportedOperationException();
                    }
                    int i9 = x9.f19301a + x10.f19301a;
                    x9.e(i9);
                    java.lang.System.arraycopy(x10.f19302b, 0, x9.f19302b, x9.f19301a, x10.f19301a);
                    java.lang.System.arraycopy(x10.f19303c, 0, x9.f19303c, x9.f19301a, x10.f19301a);
                    x9.f19301a = i9;
                }
            }
        }
        abstractC1877v0.zzc = x9;
    }

    public static void q(int i3, java.util.List list, com.google.android.gms.internal.play_billing.G0 g9, boolean z6) throws androidx.datastore.preferences.protobuf.C1504k {
        if (list == null || list.isEmpty()) {
            return;
        }
        com.google.android.gms.internal.play_billing.C1866p0 c1866p0 = (com.google.android.gms.internal.play_billing.C1866p0) g9.f19215a;
        int i9 = 0;
        if (!z6) {
            while (i9 < list.size()) {
                boolean zBooleanValue = ((java.lang.Boolean) list.get(i9)).booleanValue();
                c1866p0.R(i3 << 3);
                c1866p0.H(zBooleanValue ? (byte) 1 : (byte) 0);
                i9++;
            }
            return;
        }
        c1866p0.P(i3, 2);
        int i10 = 0;
        for (int i11 = 0; i11 < list.size(); i11++) {
            ((java.lang.Boolean) list.get(i11)).getClass();
            i10++;
        }
        c1866p0.R(i10);
        while (i9 < list.size()) {
            c1866p0.H(((java.lang.Boolean) list.get(i9)).booleanValue() ? (byte) 1 : (byte) 0);
            i9++;
        }
    }

    public static void r(int i3, java.util.List list, com.google.android.gms.internal.play_billing.G0 g9, boolean z6) throws androidx.datastore.preferences.protobuf.C1504k {
        if (list == null || list.isEmpty()) {
            return;
        }
        com.google.android.gms.internal.play_billing.C1866p0 c1866p0 = (com.google.android.gms.internal.play_billing.C1866p0) g9.f19215a;
        int i9 = 0;
        if (!z6) {
            while (i9 < list.size()) {
                c1866p0.L(i3, java.lang.Double.doubleToRawLongBits(((java.lang.Double) list.get(i9)).doubleValue()));
                i9++;
            }
            return;
        }
        c1866p0.P(i3, 2);
        int i10 = 0;
        for (int i11 = 0; i11 < list.size(); i11++) {
            ((java.lang.Double) list.get(i11)).getClass();
            i10 += 8;
        }
        c1866p0.R(i10);
        while (i9 < list.size()) {
            c1866p0.M(java.lang.Double.doubleToRawLongBits(((java.lang.Double) list.get(i9)).doubleValue()));
            i9++;
        }
    }

    public static void s(int i3, java.util.List list, com.google.android.gms.internal.play_billing.G0 g9, boolean z6) throws androidx.datastore.preferences.protobuf.C1504k {
        if (list == null || list.isEmpty()) {
            return;
        }
        g9.getClass();
        boolean z9 = list instanceof com.google.android.gms.internal.play_billing.C1879w0;
        com.google.android.gms.internal.play_billing.C1866p0 c1866p0 = (com.google.android.gms.internal.play_billing.C1866p0) g9.f19215a;
        int i9 = 0;
        if (!z9) {
            if (!z6) {
                while (i9 < list.size()) {
                    c1866p0.N(i3, ((java.lang.Integer) list.get(i9)).intValue());
                    i9++;
                }
                return;
            }
            c1866p0.P(i3, 2);
            int iV = 0;
            for (int i10 = 0; i10 < list.size(); i10++) {
                iV += com.google.android.gms.internal.play_billing.C1866p0.V(((java.lang.Integer) list.get(i10)).intValue());
            }
            c1866p0.R(iV);
            while (i9 < list.size()) {
                c1866p0.O(((java.lang.Integer) list.get(i9)).intValue());
                i9++;
            }
            return;
        }
        com.google.android.gms.internal.play_billing.C1879w0 c1879w0 = (com.google.android.gms.internal.play_billing.C1879w0) list;
        if (!z6) {
            while (i9 < c1879w0.j) {
                c1866p0.N(i3, c1879w0.e(i9));
                i9++;
            }
            return;
        }
        c1866p0.P(i3, 2);
        int iV2 = 0;
        for (int i11 = 0; i11 < c1879w0.j; i11++) {
            iV2 += com.google.android.gms.internal.play_billing.C1866p0.V(c1879w0.e(i11));
        }
        c1866p0.R(iV2);
        while (i9 < c1879w0.j) {
            c1866p0.O(c1879w0.e(i9));
            i9++;
        }
    }

    public static void t(int i3, java.util.List list, com.google.android.gms.internal.play_billing.G0 g9, boolean z6) throws androidx.datastore.preferences.protobuf.C1504k {
        if (list == null || list.isEmpty()) {
            return;
        }
        g9.getClass();
        boolean z9 = list instanceof com.google.android.gms.internal.play_billing.C1879w0;
        com.google.android.gms.internal.play_billing.C1866p0 c1866p0 = (com.google.android.gms.internal.play_billing.C1866p0) g9.f19215a;
        int i9 = 0;
        if (!z9) {
            if (!z6) {
                while (i9 < list.size()) {
                    c1866p0.J(i3, ((java.lang.Integer) list.get(i9)).intValue());
                    i9++;
                }
                return;
            }
            c1866p0.P(i3, 2);
            int i10 = 0;
            for (int i11 = 0; i11 < list.size(); i11++) {
                ((java.lang.Integer) list.get(i11)).getClass();
                i10 += 4;
            }
            c1866p0.R(i10);
            while (i9 < list.size()) {
                c1866p0.K(((java.lang.Integer) list.get(i9)).intValue());
                i9++;
            }
            return;
        }
        com.google.android.gms.internal.play_billing.C1879w0 c1879w0 = (com.google.android.gms.internal.play_billing.C1879w0) list;
        if (!z6) {
            while (i9 < c1879w0.j) {
                c1866p0.J(i3, c1879w0.e(i9));
                i9++;
            }
            return;
        }
        c1866p0.P(i3, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < c1879w0.j; i13++) {
            c1879w0.e(i13);
            i12 += 4;
        }
        c1866p0.R(i12);
        while (i9 < c1879w0.j) {
            c1866p0.K(c1879w0.e(i9));
            i9++;
        }
    }

    public static void u(int i3, java.util.List list, com.google.android.gms.internal.play_billing.G0 g9, boolean z6) throws androidx.datastore.preferences.protobuf.C1504k {
        if (list == null || list.isEmpty()) {
            return;
        }
        com.google.android.gms.internal.play_billing.C1866p0 c1866p0 = (com.google.android.gms.internal.play_billing.C1866p0) g9.f19215a;
        int i9 = 0;
        if (!z6) {
            while (i9 < list.size()) {
                c1866p0.L(i3, ((java.lang.Long) list.get(i9)).longValue());
                i9++;
            }
            return;
        }
        c1866p0.P(i3, 2);
        int i10 = 0;
        for (int i11 = 0; i11 < list.size(); i11++) {
            ((java.lang.Long) list.get(i11)).getClass();
            i10 += 8;
        }
        c1866p0.R(i10);
        while (i9 < list.size()) {
            c1866p0.M(((java.lang.Long) list.get(i9)).longValue());
            i9++;
        }
    }

    public static void v(int i3, java.util.List list, com.google.android.gms.internal.play_billing.G0 g9, boolean z6) throws androidx.datastore.preferences.protobuf.C1504k {
        if (list == null || list.isEmpty()) {
            return;
        }
        com.google.android.gms.internal.play_billing.C1866p0 c1866p0 = (com.google.android.gms.internal.play_billing.C1866p0) g9.f19215a;
        int i9 = 0;
        if (!z6) {
            while (i9 < list.size()) {
                c1866p0.J(i3, java.lang.Float.floatToRawIntBits(((java.lang.Float) list.get(i9)).floatValue()));
                i9++;
            }
            return;
        }
        c1866p0.P(i3, 2);
        int i10 = 0;
        for (int i11 = 0; i11 < list.size(); i11++) {
            ((java.lang.Float) list.get(i11)).getClass();
            i10 += 4;
        }
        c1866p0.R(i10);
        while (i9 < list.size()) {
            c1866p0.K(java.lang.Float.floatToRawIntBits(((java.lang.Float) list.get(i9)).floatValue()));
            i9++;
        }
    }

    public static void w(int i3, java.util.List list, com.google.android.gms.internal.play_billing.G0 g9, boolean z6) throws androidx.datastore.preferences.protobuf.C1504k {
        if (list == null || list.isEmpty()) {
            return;
        }
        g9.getClass();
        boolean z9 = list instanceof com.google.android.gms.internal.play_billing.C1879w0;
        com.google.android.gms.internal.play_billing.C1866p0 c1866p0 = (com.google.android.gms.internal.play_billing.C1866p0) g9.f19215a;
        int i9 = 0;
        if (!z9) {
            if (!z6) {
                while (i9 < list.size()) {
                    c1866p0.N(i3, ((java.lang.Integer) list.get(i9)).intValue());
                    i9++;
                }
                return;
            }
            c1866p0.P(i3, 2);
            int iV = 0;
            for (int i10 = 0; i10 < list.size(); i10++) {
                iV += com.google.android.gms.internal.play_billing.C1866p0.V(((java.lang.Integer) list.get(i10)).intValue());
            }
            c1866p0.R(iV);
            while (i9 < list.size()) {
                c1866p0.O(((java.lang.Integer) list.get(i9)).intValue());
                i9++;
            }
            return;
        }
        com.google.android.gms.internal.play_billing.C1879w0 c1879w0 = (com.google.android.gms.internal.play_billing.C1879w0) list;
        if (!z6) {
            while (i9 < c1879w0.j) {
                c1866p0.N(i3, c1879w0.e(i9));
                i9++;
            }
            return;
        }
        c1866p0.P(i3, 2);
        int iV2 = 0;
        for (int i11 = 0; i11 < c1879w0.j; i11++) {
            iV2 += com.google.android.gms.internal.play_billing.C1866p0.V(c1879w0.e(i11));
        }
        c1866p0.R(iV2);
        while (i9 < c1879w0.j) {
            c1866p0.O(c1879w0.e(i9));
            i9++;
        }
    }

    public static void x(int i3, java.util.List list, com.google.android.gms.internal.play_billing.G0 g9, boolean z6) throws androidx.datastore.preferences.protobuf.C1504k {
        if (list == null || list.isEmpty()) {
            return;
        }
        com.google.android.gms.internal.play_billing.C1866p0 c1866p0 = (com.google.android.gms.internal.play_billing.C1866p0) g9.f19215a;
        int i9 = 0;
        if (!z6) {
            while (i9 < list.size()) {
                c1866p0.S(i3, ((java.lang.Long) list.get(i9)).longValue());
                i9++;
            }
            return;
        }
        c1866p0.P(i3, 2);
        int iV = 0;
        for (int i10 = 0; i10 < list.size(); i10++) {
            iV += com.google.android.gms.internal.play_billing.C1866p0.V(((java.lang.Long) list.get(i10)).longValue());
        }
        c1866p0.R(iV);
        while (i9 < list.size()) {
            c1866p0.T(((java.lang.Long) list.get(i9)).longValue());
            i9++;
        }
    }

    public static void y(int i3, java.util.List list, com.google.android.gms.internal.play_billing.G0 g9, boolean z6) throws androidx.datastore.preferences.protobuf.C1504k {
        if (list == null || list.isEmpty()) {
            return;
        }
        g9.getClass();
        boolean z9 = list instanceof com.google.android.gms.internal.play_billing.C1879w0;
        com.google.android.gms.internal.play_billing.C1866p0 c1866p0 = (com.google.android.gms.internal.play_billing.C1866p0) g9.f19215a;
        int i9 = 0;
        if (!z9) {
            if (!z6) {
                while (i9 < list.size()) {
                    c1866p0.J(i3, ((java.lang.Integer) list.get(i9)).intValue());
                    i9++;
                }
                return;
            }
            c1866p0.P(i3, 2);
            int i10 = 0;
            for (int i11 = 0; i11 < list.size(); i11++) {
                ((java.lang.Integer) list.get(i11)).getClass();
                i10 += 4;
            }
            c1866p0.R(i10);
            while (i9 < list.size()) {
                c1866p0.K(((java.lang.Integer) list.get(i9)).intValue());
                i9++;
            }
            return;
        }
        com.google.android.gms.internal.play_billing.C1879w0 c1879w0 = (com.google.android.gms.internal.play_billing.C1879w0) list;
        if (!z6) {
            while (i9 < c1879w0.j) {
                c1866p0.J(i3, c1879w0.e(i9));
                i9++;
            }
            return;
        }
        c1866p0.P(i3, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < c1879w0.j; i13++) {
            c1879w0.e(i13);
            i12 += 4;
        }
        c1866p0.R(i12);
        while (i9 < c1879w0.j) {
            c1866p0.K(c1879w0.e(i9));
            i9++;
        }
    }
}
