package com.google.android.gms.internal.cast;

/* JADX INFO: loaded from: classes.dex */
public abstract class Y2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final com.google.android.gms.internal.cast.C1799u0 f18851a;

    static {
        com.google.android.gms.internal.cast.U2 u6 = com.google.android.gms.internal.cast.U2.f18826c;
        f18851a = new com.google.android.gms.internal.cast.C1799u0(16);
    }

    public static void a(int i3, java.util.List list, com.google.android.gms.internal.cast.N2 n3, boolean z6) {
        if (list == null || list.isEmpty()) {
            return;
        }
        n3.getClass();
        boolean z9 = list instanceof com.google.android.gms.internal.cast.M2;
        int i9 = 0;
        com.google.android.gms.internal.cast.A2 a2 = (com.google.android.gms.internal.cast.A2) n3.f18803h;
        if (!z9) {
            if (!z6) {
                while (i9 < list.size()) {
                    long jLongValue = ((java.lang.Long) list.get(i9)).longValue();
                    a2.H(i3, (jLongValue >> 63) ^ (jLongValue + jLongValue));
                    i9++;
                }
                return;
            }
            a2.E(i3, 2);
            int iT = 0;
            for (int i10 = 0; i10 < list.size(); i10++) {
                long jLongValue2 = ((java.lang.Long) list.get(i10)).longValue();
                iT += com.google.android.gms.internal.cast.A2.t((jLongValue2 >> 63) ^ (jLongValue2 + jLongValue2));
            }
            a2.G(iT);
            while (i9 < list.size()) {
                long jLongValue3 = ((java.lang.Long) list.get(i9)).longValue();
                a2.I((jLongValue3 >> 63) ^ (jLongValue3 + jLongValue3));
                i9++;
            }
            return;
        }
        com.google.android.gms.internal.cast.M2 m8 = (com.google.android.gms.internal.cast.M2) list;
        if (!z6) {
            while (i9 < m8.j) {
                long jE = m8.e(i9);
                a2.H(i3, (jE >> 63) ^ (jE + jE));
                i9++;
            }
            return;
        }
        a2.E(i3, 2);
        int iT2 = 0;
        for (int i11 = 0; i11 < m8.j; i11++) {
            long jE2 = m8.e(i11);
            iT2 += com.google.android.gms.internal.cast.A2.t((jE2 >> 63) ^ (jE2 + jE2));
        }
        a2.G(iT2);
        while (i9 < m8.j) {
            long jE3 = m8.e(i9);
            a2.I((jE3 >> 63) ^ (jE3 + jE3));
            i9++;
        }
    }

    public static void b(int i3, java.util.List list, com.google.android.gms.internal.cast.N2 n3, boolean z6) {
        if (list == null || list.isEmpty()) {
            return;
        }
        n3.getClass();
        boolean z9 = list instanceof com.google.android.gms.internal.cast.F2;
        int i9 = 0;
        com.google.android.gms.internal.cast.A2 a2 = (com.google.android.gms.internal.cast.A2) n3.f18803h;
        if (!z9) {
            if (!z6) {
                while (i9 < list.size()) {
                    a2.F(i3, ((java.lang.Integer) list.get(i9)).intValue());
                    i9++;
                }
                return;
            }
            a2.E(i3, 2);
            int iK = 0;
            for (int i10 = 0; i10 < list.size(); i10++) {
                iK += com.google.android.gms.internal.cast.A2.K(((java.lang.Integer) list.get(i10)).intValue());
            }
            a2.G(iK);
            while (i9 < list.size()) {
                a2.G(((java.lang.Integer) list.get(i9)).intValue());
                i9++;
            }
            return;
        }
        com.google.android.gms.internal.cast.F2 f9 = (com.google.android.gms.internal.cast.F2) list;
        if (!z6) {
            while (i9 < f9.j) {
                a2.F(i3, f9.e(i9));
                i9++;
            }
            return;
        }
        a2.E(i3, 2);
        int iK2 = 0;
        for (int i11 = 0; i11 < f9.j; i11++) {
            iK2 += com.google.android.gms.internal.cast.A2.K(f9.e(i11));
        }
        a2.G(iK2);
        while (i9 < f9.j) {
            a2.G(f9.e(i9));
            i9++;
        }
    }

    public static void c(int i3, java.util.List list, com.google.android.gms.internal.cast.N2 n3, boolean z6) {
        if (list == null || list.isEmpty()) {
            return;
        }
        n3.getClass();
        boolean z9 = list instanceof com.google.android.gms.internal.cast.M2;
        int i9 = 0;
        com.google.android.gms.internal.cast.A2 a2 = (com.google.android.gms.internal.cast.A2) n3.f18803h;
        if (!z9) {
            if (!z6) {
                while (i9 < list.size()) {
                    a2.H(i3, ((java.lang.Long) list.get(i9)).longValue());
                    i9++;
                }
                return;
            }
            a2.E(i3, 2);
            int iT = 0;
            for (int i10 = 0; i10 < list.size(); i10++) {
                iT += com.google.android.gms.internal.cast.A2.t(((java.lang.Long) list.get(i10)).longValue());
            }
            a2.G(iT);
            while (i9 < list.size()) {
                a2.I(((java.lang.Long) list.get(i9)).longValue());
                i9++;
            }
            return;
        }
        com.google.android.gms.internal.cast.M2 m8 = (com.google.android.gms.internal.cast.M2) list;
        if (!z6) {
            while (i9 < m8.j) {
                a2.H(i3, m8.e(i9));
                i9++;
            }
            return;
        }
        a2.E(i3, 2);
        int iT2 = 0;
        for (int i11 = 0; i11 < m8.j; i11++) {
            iT2 += com.google.android.gms.internal.cast.A2.t(m8.e(i11));
        }
        a2.G(iT2);
        while (i9 < m8.j) {
            a2.I(m8.e(i9));
            i9++;
        }
    }

    public static boolean d(java.lang.Object obj, java.lang.Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static int e(java.util.List list) {
        int size = list.size();
        int i3 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof com.google.android.gms.internal.cast.F2)) {
            int iT = 0;
            while (i3 < size) {
                iT += com.google.android.gms.internal.cast.A2.t(((java.lang.Integer) list.get(i3)).intValue());
                i3++;
            }
            return iT;
        }
        com.google.android.gms.internal.cast.F2 f9 = (com.google.android.gms.internal.cast.F2) list;
        int iT2 = 0;
        while (i3 < size) {
            iT2 += com.google.android.gms.internal.cast.A2.t(f9.e(i3));
            i3++;
        }
        return iT2;
    }

    public static int f(int i3, java.util.List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (com.google.android.gms.internal.cast.A2.K(i3 << 3) + 4) * size;
    }

    public static int g(int i3, java.util.List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (com.google.android.gms.internal.cast.A2.K(i3 << 3) + 8) * size;
    }

    public static int h(java.util.List list) {
        int size = list.size();
        int i3 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof com.google.android.gms.internal.cast.F2)) {
            int iT = 0;
            while (i3 < size) {
                iT += com.google.android.gms.internal.cast.A2.t(((java.lang.Integer) list.get(i3)).intValue());
                i3++;
            }
            return iT;
        }
        com.google.android.gms.internal.cast.F2 f9 = (com.google.android.gms.internal.cast.F2) list;
        int iT2 = 0;
        while (i3 < size) {
            iT2 += com.google.android.gms.internal.cast.A2.t(f9.e(i3));
            i3++;
        }
        return iT2;
    }

    public static int i(java.util.List list) {
        int size = list.size();
        int i3 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof com.google.android.gms.internal.cast.M2)) {
            int iT = 0;
            while (i3 < size) {
                iT += com.google.android.gms.internal.cast.A2.t(((java.lang.Long) list.get(i3)).longValue());
                i3++;
            }
            return iT;
        }
        com.google.android.gms.internal.cast.M2 m8 = (com.google.android.gms.internal.cast.M2) list;
        int iT2 = 0;
        while (i3 < size) {
            iT2 += com.google.android.gms.internal.cast.A2.t(m8.e(i3));
            i3++;
        }
        return iT2;
    }

    public static int j(java.util.List list) {
        int size = list.size();
        int i3 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof com.google.android.gms.internal.cast.F2)) {
            int iK = 0;
            while (i3 < size) {
                int iIntValue = ((java.lang.Integer) list.get(i3)).intValue();
                iK += com.google.android.gms.internal.cast.A2.K((iIntValue >> 31) ^ (iIntValue + iIntValue));
                i3++;
            }
            return iK;
        }
        com.google.android.gms.internal.cast.F2 f9 = (com.google.android.gms.internal.cast.F2) list;
        int iK2 = 0;
        while (i3 < size) {
            int iE = f9.e(i3);
            iK2 += com.google.android.gms.internal.cast.A2.K((iE >> 31) ^ (iE + iE));
            i3++;
        }
        return iK2;
    }

    public static int k(java.util.List list) {
        int size = list.size();
        int i3 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof com.google.android.gms.internal.cast.M2)) {
            int iT = 0;
            while (i3 < size) {
                long jLongValue = ((java.lang.Long) list.get(i3)).longValue();
                iT += com.google.android.gms.internal.cast.A2.t((jLongValue >> 63) ^ (jLongValue + jLongValue));
                i3++;
            }
            return iT;
        }
        com.google.android.gms.internal.cast.M2 m8 = (com.google.android.gms.internal.cast.M2) list;
        int iT2 = 0;
        while (i3 < size) {
            long jE = m8.e(i3);
            iT2 += com.google.android.gms.internal.cast.A2.t((jE >> 63) ^ (jE + jE));
            i3++;
        }
        return iT2;
    }

    public static int l(java.util.List list) {
        int size = list.size();
        int i3 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof com.google.android.gms.internal.cast.F2)) {
            int iK = 0;
            while (i3 < size) {
                iK += com.google.android.gms.internal.cast.A2.K(((java.lang.Integer) list.get(i3)).intValue());
                i3++;
            }
            return iK;
        }
        com.google.android.gms.internal.cast.F2 f9 = (com.google.android.gms.internal.cast.F2) list;
        int iK2 = 0;
        while (i3 < size) {
            iK2 += com.google.android.gms.internal.cast.A2.K(f9.e(i3));
            i3++;
        }
        return iK2;
    }

    public static int m(java.util.List list) {
        int size = list.size();
        int i3 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof com.google.android.gms.internal.cast.M2)) {
            int iT = 0;
            while (i3 < size) {
                iT += com.google.android.gms.internal.cast.A2.t(((java.lang.Long) list.get(i3)).longValue());
                i3++;
            }
            return iT;
        }
        com.google.android.gms.internal.cast.M2 m8 = (com.google.android.gms.internal.cast.M2) list;
        int iT2 = 0;
        while (i3 < size) {
            iT2 += com.google.android.gms.internal.cast.A2.t(m8.e(i3));
            i3++;
        }
        return iT2;
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
    public static void n(java.lang.Object obj, java.lang.Object obj2) {
        com.google.android.gms.internal.cast.E2 e6 = (com.google.android.gms.internal.cast.E2) obj;
        com.google.android.gms.internal.cast.Z2 z6 = e6.zzc;
        com.google.android.gms.internal.cast.Z2 z9 = ((com.google.android.gms.internal.cast.E2) obj2).zzc;
        com.google.android.gms.internal.cast.Z2 z10 = com.google.android.gms.internal.cast.Z2.f18855e;
        if (!z10.equals(z9)) {
            if (z10.equals(z6)) {
                z6.getClass();
                z9.getClass();
                int[] iArrCopyOf = java.util.Arrays.copyOf(z6.f18856a, 0);
                java.lang.System.arraycopy(z9.f18856a, 0, iArrCopyOf, 0, 0);
                java.lang.Object[] objArrCopyOf = java.util.Arrays.copyOf(z6.f18857b, 0);
                java.lang.System.arraycopy(z9.f18857b, 0, objArrCopyOf, 0, 0);
                z6 = new com.google.android.gms.internal.cast.Z2(iArrCopyOf, objArrCopyOf, true);
            } else {
                z6.getClass();
                if (!z9.equals(z10)) {
                    if (!z6.f18859d) {
                        throw new java.lang.UnsupportedOperationException();
                    }
                    int[] iArr = z6.f18856a;
                    int length = iArr.length;
                    java.lang.System.arraycopy(z9.f18856a, 0, iArr, 0, 0);
                    java.lang.System.arraycopy(z9.f18857b, 0, z6.f18857b, 0, 0);
                }
            }
        }
        e6.zzc = z6;
    }

    public static void o(int i3, java.util.List list, com.google.android.gms.internal.cast.N2 n3, boolean z6) {
        if (list == null || list.isEmpty()) {
            return;
        }
        com.google.android.gms.internal.cast.A2 a2 = (com.google.android.gms.internal.cast.A2) n3.f18803h;
        int i9 = 0;
        if (!z6) {
            while (i9 < list.size()) {
                boolean zBooleanValue = ((java.lang.Boolean) list.get(i9)).booleanValue();
                a2.G(i3 << 3);
                a2.u(zBooleanValue ? (byte) 1 : (byte) 0);
                i9++;
            }
            return;
        }
        a2.E(i3, 2);
        int i10 = 0;
        for (int i11 = 0; i11 < list.size(); i11++) {
            ((java.lang.Boolean) list.get(i11)).getClass();
            i10++;
        }
        a2.G(i10);
        while (i9 < list.size()) {
            a2.u(((java.lang.Boolean) list.get(i9)).booleanValue() ? (byte) 1 : (byte) 0);
            i9++;
        }
    }

    public static void p(int i3, java.util.List list, com.google.android.gms.internal.cast.N2 n3, boolean z6) {
        if (list == null || list.isEmpty()) {
            return;
        }
        com.google.android.gms.internal.cast.A2 a2 = (com.google.android.gms.internal.cast.A2) n3.f18803h;
        int i9 = 0;
        if (!z6) {
            while (i9 < list.size()) {
                a2.z(i3, java.lang.Double.doubleToRawLongBits(((java.lang.Double) list.get(i9)).doubleValue()));
                i9++;
            }
            return;
        }
        a2.E(i3, 2);
        int i10 = 0;
        for (int i11 = 0; i11 < list.size(); i11++) {
            ((java.lang.Double) list.get(i11)).getClass();
            i10 += 8;
        }
        a2.G(i10);
        while (i9 < list.size()) {
            a2.A(java.lang.Double.doubleToRawLongBits(((java.lang.Double) list.get(i9)).doubleValue()));
            i9++;
        }
    }

    public static void q(int i3, java.util.List list, com.google.android.gms.internal.cast.N2 n3, boolean z6) {
        if (list == null || list.isEmpty()) {
            return;
        }
        n3.getClass();
        boolean z9 = list instanceof com.google.android.gms.internal.cast.F2;
        int i9 = 0;
        com.google.android.gms.internal.cast.A2 a2 = (com.google.android.gms.internal.cast.A2) n3.f18803h;
        if (!z9) {
            if (!z6) {
                while (i9 < list.size()) {
                    a2.B(i3, ((java.lang.Integer) list.get(i9)).intValue());
                    i9++;
                }
                return;
            }
            a2.E(i3, 2);
            int iT = 0;
            for (int i10 = 0; i10 < list.size(); i10++) {
                iT += com.google.android.gms.internal.cast.A2.t(((java.lang.Integer) list.get(i10)).intValue());
            }
            a2.G(iT);
            while (i9 < list.size()) {
                a2.C(((java.lang.Integer) list.get(i9)).intValue());
                i9++;
            }
            return;
        }
        com.google.android.gms.internal.cast.F2 f9 = (com.google.android.gms.internal.cast.F2) list;
        if (!z6) {
            while (i9 < f9.j) {
                a2.B(i3, f9.e(i9));
                i9++;
            }
            return;
        }
        a2.E(i3, 2);
        int iT2 = 0;
        for (int i11 = 0; i11 < f9.j; i11++) {
            iT2 += com.google.android.gms.internal.cast.A2.t(f9.e(i11));
        }
        a2.G(iT2);
        while (i9 < f9.j) {
            a2.C(f9.e(i9));
            i9++;
        }
    }

    public static void r(int i3, java.util.List list, com.google.android.gms.internal.cast.N2 n3, boolean z6) {
        if (list == null || list.isEmpty()) {
            return;
        }
        n3.getClass();
        boolean z9 = list instanceof com.google.android.gms.internal.cast.F2;
        int i9 = 0;
        com.google.android.gms.internal.cast.A2 a2 = (com.google.android.gms.internal.cast.A2) n3.f18803h;
        if (!z9) {
            if (!z6) {
                while (i9 < list.size()) {
                    a2.x(i3, ((java.lang.Integer) list.get(i9)).intValue());
                    i9++;
                }
                return;
            }
            a2.E(i3, 2);
            int i10 = 0;
            for (int i11 = 0; i11 < list.size(); i11++) {
                ((java.lang.Integer) list.get(i11)).getClass();
                i10 += 4;
            }
            a2.G(i10);
            while (i9 < list.size()) {
                a2.y(((java.lang.Integer) list.get(i9)).intValue());
                i9++;
            }
            return;
        }
        com.google.android.gms.internal.cast.F2 f9 = (com.google.android.gms.internal.cast.F2) list;
        if (!z6) {
            while (i9 < f9.j) {
                a2.x(i3, f9.e(i9));
                i9++;
            }
            return;
        }
        a2.E(i3, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < f9.j; i13++) {
            f9.e(i13);
            i12 += 4;
        }
        a2.G(i12);
        while (i9 < f9.j) {
            a2.y(f9.e(i9));
            i9++;
        }
    }

    public static void s(int i3, java.util.List list, com.google.android.gms.internal.cast.N2 n3, boolean z6) {
        if (list == null || list.isEmpty()) {
            return;
        }
        n3.getClass();
        boolean z9 = list instanceof com.google.android.gms.internal.cast.M2;
        int i9 = 0;
        com.google.android.gms.internal.cast.A2 a2 = (com.google.android.gms.internal.cast.A2) n3.f18803h;
        if (!z9) {
            if (!z6) {
                while (i9 < list.size()) {
                    a2.z(i3, ((java.lang.Long) list.get(i9)).longValue());
                    i9++;
                }
                return;
            }
            a2.E(i3, 2);
            int i10 = 0;
            for (int i11 = 0; i11 < list.size(); i11++) {
                ((java.lang.Long) list.get(i11)).getClass();
                i10 += 8;
            }
            a2.G(i10);
            while (i9 < list.size()) {
                a2.A(((java.lang.Long) list.get(i9)).longValue());
                i9++;
            }
            return;
        }
        com.google.android.gms.internal.cast.M2 m8 = (com.google.android.gms.internal.cast.M2) list;
        if (!z6) {
            while (i9 < m8.j) {
                a2.z(i3, m8.e(i9));
                i9++;
            }
            return;
        }
        a2.E(i3, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < m8.j; i13++) {
            m8.e(i13);
            i12 += 8;
        }
        a2.G(i12);
        while (i9 < m8.j) {
            a2.A(m8.e(i9));
            i9++;
        }
    }

    public static void t(int i3, java.util.List list, com.google.android.gms.internal.cast.N2 n3, boolean z6) {
        if (list == null || list.isEmpty()) {
            return;
        }
        com.google.android.gms.internal.cast.A2 a2 = (com.google.android.gms.internal.cast.A2) n3.f18803h;
        int i9 = 0;
        if (!z6) {
            while (i9 < list.size()) {
                a2.x(i3, java.lang.Float.floatToRawIntBits(((java.lang.Float) list.get(i9)).floatValue()));
                i9++;
            }
            return;
        }
        a2.E(i3, 2);
        int i10 = 0;
        for (int i11 = 0; i11 < list.size(); i11++) {
            ((java.lang.Float) list.get(i11)).getClass();
            i10 += 4;
        }
        a2.G(i10);
        while (i9 < list.size()) {
            a2.y(java.lang.Float.floatToRawIntBits(((java.lang.Float) list.get(i9)).floatValue()));
            i9++;
        }
    }

    public static void u(int i3, java.util.List list, com.google.android.gms.internal.cast.N2 n3, boolean z6) {
        if (list == null || list.isEmpty()) {
            return;
        }
        n3.getClass();
        boolean z9 = list instanceof com.google.android.gms.internal.cast.F2;
        int i9 = 0;
        com.google.android.gms.internal.cast.A2 a2 = (com.google.android.gms.internal.cast.A2) n3.f18803h;
        if (!z9) {
            if (!z6) {
                while (i9 < list.size()) {
                    a2.B(i3, ((java.lang.Integer) list.get(i9)).intValue());
                    i9++;
                }
                return;
            }
            a2.E(i3, 2);
            int iT = 0;
            for (int i10 = 0; i10 < list.size(); i10++) {
                iT += com.google.android.gms.internal.cast.A2.t(((java.lang.Integer) list.get(i10)).intValue());
            }
            a2.G(iT);
            while (i9 < list.size()) {
                a2.C(((java.lang.Integer) list.get(i9)).intValue());
                i9++;
            }
            return;
        }
        com.google.android.gms.internal.cast.F2 f9 = (com.google.android.gms.internal.cast.F2) list;
        if (!z6) {
            while (i9 < f9.j) {
                a2.B(i3, f9.e(i9));
                i9++;
            }
            return;
        }
        a2.E(i3, 2);
        int iT2 = 0;
        for (int i11 = 0; i11 < f9.j; i11++) {
            iT2 += com.google.android.gms.internal.cast.A2.t(f9.e(i11));
        }
        a2.G(iT2);
        while (i9 < f9.j) {
            a2.C(f9.e(i9));
            i9++;
        }
    }

    public static void v(int i3, java.util.List list, com.google.android.gms.internal.cast.N2 n3, boolean z6) {
        if (list == null || list.isEmpty()) {
            return;
        }
        n3.getClass();
        boolean z9 = list instanceof com.google.android.gms.internal.cast.M2;
        int i9 = 0;
        com.google.android.gms.internal.cast.A2 a2 = (com.google.android.gms.internal.cast.A2) n3.f18803h;
        if (!z9) {
            if (!z6) {
                while (i9 < list.size()) {
                    a2.H(i3, ((java.lang.Long) list.get(i9)).longValue());
                    i9++;
                }
                return;
            }
            a2.E(i3, 2);
            int iT = 0;
            for (int i10 = 0; i10 < list.size(); i10++) {
                iT += com.google.android.gms.internal.cast.A2.t(((java.lang.Long) list.get(i10)).longValue());
            }
            a2.G(iT);
            while (i9 < list.size()) {
                a2.I(((java.lang.Long) list.get(i9)).longValue());
                i9++;
            }
            return;
        }
        com.google.android.gms.internal.cast.M2 m8 = (com.google.android.gms.internal.cast.M2) list;
        if (!z6) {
            while (i9 < m8.j) {
                a2.H(i3, m8.e(i9));
                i9++;
            }
            return;
        }
        a2.E(i3, 2);
        int iT2 = 0;
        for (int i11 = 0; i11 < m8.j; i11++) {
            iT2 += com.google.android.gms.internal.cast.A2.t(m8.e(i11));
        }
        a2.G(iT2);
        while (i9 < m8.j) {
            a2.I(m8.e(i9));
            i9++;
        }
    }

    public static void w(int i3, java.util.List list, com.google.android.gms.internal.cast.N2 n3, boolean z6) {
        if (list == null || list.isEmpty()) {
            return;
        }
        n3.getClass();
        boolean z9 = list instanceof com.google.android.gms.internal.cast.F2;
        int i9 = 0;
        com.google.android.gms.internal.cast.A2 a2 = (com.google.android.gms.internal.cast.A2) n3.f18803h;
        if (!z9) {
            if (!z6) {
                while (i9 < list.size()) {
                    a2.x(i3, ((java.lang.Integer) list.get(i9)).intValue());
                    i9++;
                }
                return;
            }
            a2.E(i3, 2);
            int i10 = 0;
            for (int i11 = 0; i11 < list.size(); i11++) {
                ((java.lang.Integer) list.get(i11)).getClass();
                i10 += 4;
            }
            a2.G(i10);
            while (i9 < list.size()) {
                a2.y(((java.lang.Integer) list.get(i9)).intValue());
                i9++;
            }
            return;
        }
        com.google.android.gms.internal.cast.F2 f9 = (com.google.android.gms.internal.cast.F2) list;
        if (!z6) {
            while (i9 < f9.j) {
                a2.x(i3, f9.e(i9));
                i9++;
            }
            return;
        }
        a2.E(i3, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < f9.j; i13++) {
            f9.e(i13);
            i12 += 4;
        }
        a2.G(i12);
        while (i9 < f9.j) {
            a2.y(f9.e(i9));
            i9++;
        }
    }

    public static void x(int i3, java.util.List list, com.google.android.gms.internal.cast.N2 n3, boolean z6) {
        if (list == null || list.isEmpty()) {
            return;
        }
        n3.getClass();
        boolean z9 = list instanceof com.google.android.gms.internal.cast.M2;
        int i9 = 0;
        com.google.android.gms.internal.cast.A2 a2 = (com.google.android.gms.internal.cast.A2) n3.f18803h;
        if (!z9) {
            if (!z6) {
                while (i9 < list.size()) {
                    a2.z(i3, ((java.lang.Long) list.get(i9)).longValue());
                    i9++;
                }
                return;
            }
            a2.E(i3, 2);
            int i10 = 0;
            for (int i11 = 0; i11 < list.size(); i11++) {
                ((java.lang.Long) list.get(i11)).getClass();
                i10 += 8;
            }
            a2.G(i10);
            while (i9 < list.size()) {
                a2.A(((java.lang.Long) list.get(i9)).longValue());
                i9++;
            }
            return;
        }
        com.google.android.gms.internal.cast.M2 m8 = (com.google.android.gms.internal.cast.M2) list;
        if (!z6) {
            while (i9 < m8.j) {
                a2.z(i3, m8.e(i9));
                i9++;
            }
            return;
        }
        a2.E(i3, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < m8.j; i13++) {
            m8.e(i13);
            i12 += 8;
        }
        a2.G(i12);
        while (i9 < m8.j) {
            a2.A(m8.e(i9));
            i9++;
        }
    }

    public static void y(int i3, java.util.List list, com.google.android.gms.internal.cast.N2 n3, boolean z6) {
        if (list == null || list.isEmpty()) {
            return;
        }
        n3.getClass();
        boolean z9 = list instanceof com.google.android.gms.internal.cast.F2;
        int i9 = 0;
        com.google.android.gms.internal.cast.A2 a2 = (com.google.android.gms.internal.cast.A2) n3.f18803h;
        if (!z9) {
            if (!z6) {
                while (i9 < list.size()) {
                    int iIntValue = ((java.lang.Integer) list.get(i9)).intValue();
                    a2.F(i3, (iIntValue >> 31) ^ (iIntValue + iIntValue));
                    i9++;
                }
                return;
            }
            a2.E(i3, 2);
            int iK = 0;
            for (int i10 = 0; i10 < list.size(); i10++) {
                int iIntValue2 = ((java.lang.Integer) list.get(i10)).intValue();
                iK += com.google.android.gms.internal.cast.A2.K((iIntValue2 >> 31) ^ (iIntValue2 + iIntValue2));
            }
            a2.G(iK);
            while (i9 < list.size()) {
                int iIntValue3 = ((java.lang.Integer) list.get(i9)).intValue();
                a2.G((iIntValue3 >> 31) ^ (iIntValue3 + iIntValue3));
                i9++;
            }
            return;
        }
        com.google.android.gms.internal.cast.F2 f9 = (com.google.android.gms.internal.cast.F2) list;
        if (!z6) {
            while (i9 < f9.j) {
                int iE = f9.e(i9);
                a2.F(i3, (iE >> 31) ^ (iE + iE));
                i9++;
            }
            return;
        }
        a2.E(i3, 2);
        int iK2 = 0;
        for (int i11 = 0; i11 < f9.j; i11++) {
            int iE2 = f9.e(i11);
            iK2 += com.google.android.gms.internal.cast.A2.K((iE2 >> 31) ^ (iE2 + iE2));
        }
        a2.G(iK2);
        while (i9 < f9.j) {
            int iE3 = f9.e(i9);
            a2.G((iE3 >> 31) ^ (iE3 + iE3));
            i9++;
        }
    }
}
