package androidx.datastore.preferences.protobuf;

/* JADX INFO: loaded from: classes.dex */
public abstract class Y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final java.lang.Class f16171a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final androidx.datastore.preferences.protobuf.f0 f16172b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final androidx.datastore.preferences.protobuf.f0 f16173c;

    static {
        java.lang.Class<?> cls;
        java.lang.Class<?> cls2;
        androidx.datastore.preferences.protobuf.U u6 = androidx.datastore.preferences.protobuf.U.f16162c;
        androidx.datastore.preferences.protobuf.f0 f0Var = null;
        try {
            cls = java.lang.Class.forName("androidx.datastore.preferences.protobuf.GeneratedMessage");
        } catch (java.lang.Throwable unused) {
            cls = null;
        }
        f16171a = cls;
        try {
            androidx.datastore.preferences.protobuf.U u7 = androidx.datastore.preferences.protobuf.U.f16162c;
            try {
                cls2 = java.lang.Class.forName("androidx.datastore.preferences.protobuf.UnknownFieldSetSchema");
            } catch (java.lang.Throwable unused2) {
                cls2 = null;
            }
            if (cls2 != null) {
                f0Var = (androidx.datastore.preferences.protobuf.f0) cls2.getConstructor(null).newInstance(null);
            }
        } catch (java.lang.Throwable unused3) {
        }
        f16172b = f0Var;
        f16173c = new androidx.datastore.preferences.protobuf.f0();
    }

    public static int a(java.util.List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iP0 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            iP0 += androidx.datastore.preferences.protobuf.C1505l.p0(((java.lang.Integer) list.get(i3)).intValue());
        }
        return iP0;
    }

    public static int b(int i3, java.util.List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (androidx.datastore.preferences.protobuf.C1505l.n0(i3) + 4) * size;
    }

    public static int c(int i3, java.util.List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (androidx.datastore.preferences.protobuf.C1505l.n0(i3) + 8) * size;
    }

    public static int d(java.util.List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iP0 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            iP0 += androidx.datastore.preferences.protobuf.C1505l.p0(((java.lang.Integer) list.get(i3)).intValue());
        }
        return iP0;
    }

    public static int e(java.util.List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iP0 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            iP0 += androidx.datastore.preferences.protobuf.C1505l.p0(((java.lang.Long) list.get(i3)).longValue());
        }
        return iP0;
    }

    public static int f(java.util.List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iO0 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            int iIntValue = ((java.lang.Integer) list.get(i3)).intValue();
            iO0 += androidx.datastore.preferences.protobuf.C1505l.o0((iIntValue >> 31) ^ (iIntValue << 1));
        }
        return iO0;
    }

    public static int g(java.util.List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iP0 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            long jLongValue = ((java.lang.Long) list.get(i3)).longValue();
            iP0 += androidx.datastore.preferences.protobuf.C1505l.p0((jLongValue >> 63) ^ (jLongValue << 1));
        }
        return iP0;
    }

    public static int h(java.util.List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iO0 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            iO0 += androidx.datastore.preferences.protobuf.C1505l.o0(((java.lang.Integer) list.get(i3)).intValue());
        }
        return iO0;
    }

    public static int i(java.util.List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iP0 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            iP0 += androidx.datastore.preferences.protobuf.C1505l.p0(((java.lang.Long) list.get(i3)).longValue());
        }
        return iP0;
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
    public static void k(androidx.datastore.preferences.protobuf.f0 f0Var, java.lang.Object obj, java.lang.Object obj2) {
        f0Var.getClass();
        androidx.datastore.preferences.protobuf.AbstractC1514v abstractC1514v = (androidx.datastore.preferences.protobuf.AbstractC1514v) obj;
        androidx.datastore.preferences.protobuf.e0 e0Var = abstractC1514v.unknownFields;
        androidx.datastore.preferences.protobuf.e0 e0Var2 = ((androidx.datastore.preferences.protobuf.AbstractC1514v) obj2).unknownFields;
        androidx.datastore.preferences.protobuf.e0 e0Var3 = androidx.datastore.preferences.protobuf.e0.f16194f;
        if (!e0Var3.equals(e0Var2)) {
            if (e0Var3.equals(e0Var)) {
                int i3 = e0Var.f16195a + e0Var2.f16195a;
                int[] iArrCopyOf = java.util.Arrays.copyOf(e0Var.f16196b, i3);
                java.lang.System.arraycopy(e0Var2.f16196b, 0, iArrCopyOf, e0Var.f16195a, e0Var2.f16195a);
                java.lang.Object[] objArrCopyOf = java.util.Arrays.copyOf(e0Var.f16197c, i3);
                java.lang.System.arraycopy(e0Var2.f16197c, 0, objArrCopyOf, e0Var.f16195a, e0Var2.f16195a);
                e0Var = new androidx.datastore.preferences.protobuf.e0(i3, iArrCopyOf, objArrCopyOf, true);
            } else {
                e0Var.getClass();
                if (!e0Var2.equals(e0Var3)) {
                    if (!e0Var.f16199e) {
                        throw new java.lang.UnsupportedOperationException();
                    }
                    int i9 = e0Var.f16195a + e0Var2.f16195a;
                    e0Var.a(i9);
                    java.lang.System.arraycopy(e0Var2.f16196b, 0, e0Var.f16196b, e0Var.f16195a, e0Var2.f16195a);
                    java.lang.System.arraycopy(e0Var2.f16197c, 0, e0Var.f16197c, e0Var.f16195a, e0Var2.f16195a);
                    e0Var.f16195a = i9;
                }
            }
        }
        abstractC1514v.unknownFields = e0Var;
    }

    public static boolean l(java.lang.Object obj, java.lang.Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static void m(int i3, java.util.List list, androidx.datastore.preferences.protobuf.F f9, boolean z6) {
        if (list == null || list.isEmpty()) {
            return;
        }
        androidx.datastore.preferences.protobuf.C1505l c1505l = (androidx.datastore.preferences.protobuf.C1505l) f9.f16134a;
        int i9 = 0;
        if (!z6) {
            while (i9 < list.size()) {
                c1505l.u0(i3, ((java.lang.Boolean) list.get(i9)).booleanValue());
                i9++;
            }
            return;
        }
        c1505l.G0(i3, 2);
        int i10 = 0;
        for (int i11 = 0; i11 < list.size(); i11++) {
            ((java.lang.Boolean) list.get(i11)).getClass();
            java.util.logging.Logger logger = androidx.datastore.preferences.protobuf.C1505l.f16227r;
            i10++;
        }
        c1505l.I0(i10);
        while (i9 < list.size()) {
            c1505l.s0(((java.lang.Boolean) list.get(i9)).booleanValue() ? (byte) 1 : (byte) 0);
            i9++;
        }
    }

    public static void n(int i3, java.util.List list, androidx.datastore.preferences.protobuf.F f9, boolean z6) {
        if (list == null || list.isEmpty()) {
            return;
        }
        androidx.datastore.preferences.protobuf.C1505l c1505l = (androidx.datastore.preferences.protobuf.C1505l) f9.f16134a;
        int i9 = 0;
        if (!z6) {
            while (i9 < list.size()) {
                double dDoubleValue = ((java.lang.Double) list.get(i9)).doubleValue();
                c1505l.getClass();
                c1505l.z0(i3, java.lang.Double.doubleToRawLongBits(dDoubleValue));
                i9++;
            }
            return;
        }
        c1505l.G0(i3, 2);
        int i10 = 0;
        for (int i11 = 0; i11 < list.size(); i11++) {
            ((java.lang.Double) list.get(i11)).getClass();
            java.util.logging.Logger logger = androidx.datastore.preferences.protobuf.C1505l.f16227r;
            i10 += 8;
        }
        c1505l.I0(i10);
        while (i9 < list.size()) {
            c1505l.A0(java.lang.Double.doubleToRawLongBits(((java.lang.Double) list.get(i9)).doubleValue()));
            i9++;
        }
    }

    public static void o(int i3, java.util.List list, androidx.datastore.preferences.protobuf.F f9, boolean z6) {
        if (list == null || list.isEmpty()) {
            return;
        }
        androidx.datastore.preferences.protobuf.C1505l c1505l = (androidx.datastore.preferences.protobuf.C1505l) f9.f16134a;
        int i9 = 0;
        if (!z6) {
            while (i9 < list.size()) {
                c1505l.B0(i3, ((java.lang.Integer) list.get(i9)).intValue());
                i9++;
            }
            return;
        }
        c1505l.G0(i3, 2);
        int iP0 = 0;
        for (int i10 = 0; i10 < list.size(); i10++) {
            iP0 += androidx.datastore.preferences.protobuf.C1505l.p0(((java.lang.Integer) list.get(i10)).intValue());
        }
        c1505l.I0(iP0);
        while (i9 < list.size()) {
            c1505l.C0(((java.lang.Integer) list.get(i9)).intValue());
            i9++;
        }
    }

    public static void p(int i3, java.util.List list, androidx.datastore.preferences.protobuf.F f9, boolean z6) {
        if (list == null || list.isEmpty()) {
            return;
        }
        androidx.datastore.preferences.protobuf.C1505l c1505l = (androidx.datastore.preferences.protobuf.C1505l) f9.f16134a;
        int i9 = 0;
        if (!z6) {
            while (i9 < list.size()) {
                c1505l.x0(i3, ((java.lang.Integer) list.get(i9)).intValue());
                i9++;
            }
            return;
        }
        c1505l.G0(i3, 2);
        int i10 = 0;
        for (int i11 = 0; i11 < list.size(); i11++) {
            ((java.lang.Integer) list.get(i11)).getClass();
            java.util.logging.Logger logger = androidx.datastore.preferences.protobuf.C1505l.f16227r;
            i10 += 4;
        }
        c1505l.I0(i10);
        while (i9 < list.size()) {
            c1505l.y0(((java.lang.Integer) list.get(i9)).intValue());
            i9++;
        }
    }

    public static void q(int i3, java.util.List list, androidx.datastore.preferences.protobuf.F f9, boolean z6) {
        if (list == null || list.isEmpty()) {
            return;
        }
        androidx.datastore.preferences.protobuf.C1505l c1505l = (androidx.datastore.preferences.protobuf.C1505l) f9.f16134a;
        int i9 = 0;
        if (!z6) {
            while (i9 < list.size()) {
                c1505l.z0(i3, ((java.lang.Long) list.get(i9)).longValue());
                i9++;
            }
            return;
        }
        c1505l.G0(i3, 2);
        int i10 = 0;
        for (int i11 = 0; i11 < list.size(); i11++) {
            ((java.lang.Long) list.get(i11)).getClass();
            java.util.logging.Logger logger = androidx.datastore.preferences.protobuf.C1505l.f16227r;
            i10 += 8;
        }
        c1505l.I0(i10);
        while (i9 < list.size()) {
            c1505l.A0(((java.lang.Long) list.get(i9)).longValue());
            i9++;
        }
    }

    public static void r(int i3, java.util.List list, androidx.datastore.preferences.protobuf.F f9, boolean z6) {
        if (list == null || list.isEmpty()) {
            return;
        }
        androidx.datastore.preferences.protobuf.C1505l c1505l = (androidx.datastore.preferences.protobuf.C1505l) f9.f16134a;
        int i9 = 0;
        if (!z6) {
            while (i9 < list.size()) {
                float fFloatValue = ((java.lang.Float) list.get(i9)).floatValue();
                c1505l.getClass();
                c1505l.x0(i3, java.lang.Float.floatToRawIntBits(fFloatValue));
                i9++;
            }
            return;
        }
        c1505l.G0(i3, 2);
        int i10 = 0;
        for (int i11 = 0; i11 < list.size(); i11++) {
            ((java.lang.Float) list.get(i11)).getClass();
            java.util.logging.Logger logger = androidx.datastore.preferences.protobuf.C1505l.f16227r;
            i10 += 4;
        }
        c1505l.I0(i10);
        while (i9 < list.size()) {
            c1505l.y0(java.lang.Float.floatToRawIntBits(((java.lang.Float) list.get(i9)).floatValue()));
            i9++;
        }
    }

    public static void s(int i3, java.util.List list, androidx.datastore.preferences.protobuf.F f9, boolean z6) {
        if (list == null || list.isEmpty()) {
            return;
        }
        androidx.datastore.preferences.protobuf.C1505l c1505l = (androidx.datastore.preferences.protobuf.C1505l) f9.f16134a;
        int i9 = 0;
        if (!z6) {
            while (i9 < list.size()) {
                c1505l.B0(i3, ((java.lang.Integer) list.get(i9)).intValue());
                i9++;
            }
            return;
        }
        c1505l.G0(i3, 2);
        int iP0 = 0;
        for (int i10 = 0; i10 < list.size(); i10++) {
            iP0 += androidx.datastore.preferences.protobuf.C1505l.p0(((java.lang.Integer) list.get(i10)).intValue());
        }
        c1505l.I0(iP0);
        while (i9 < list.size()) {
            c1505l.C0(((java.lang.Integer) list.get(i9)).intValue());
            i9++;
        }
    }

    public static void t(int i3, java.util.List list, androidx.datastore.preferences.protobuf.F f9, boolean z6) {
        if (list == null || list.isEmpty()) {
            return;
        }
        androidx.datastore.preferences.protobuf.C1505l c1505l = (androidx.datastore.preferences.protobuf.C1505l) f9.f16134a;
        int i9 = 0;
        if (!z6) {
            while (i9 < list.size()) {
                c1505l.J0(i3, ((java.lang.Long) list.get(i9)).longValue());
                i9++;
            }
            return;
        }
        c1505l.G0(i3, 2);
        int iP0 = 0;
        for (int i10 = 0; i10 < list.size(); i10++) {
            iP0 += androidx.datastore.preferences.protobuf.C1505l.p0(((java.lang.Long) list.get(i10)).longValue());
        }
        c1505l.I0(iP0);
        while (i9 < list.size()) {
            c1505l.K0(((java.lang.Long) list.get(i9)).longValue());
            i9++;
        }
    }

    public static void u(int i3, java.util.List list, androidx.datastore.preferences.protobuf.F f9, boolean z6) {
        if (list == null || list.isEmpty()) {
            return;
        }
        androidx.datastore.preferences.protobuf.C1505l c1505l = (androidx.datastore.preferences.protobuf.C1505l) f9.f16134a;
        int i9 = 0;
        if (!z6) {
            while (i9 < list.size()) {
                c1505l.x0(i3, ((java.lang.Integer) list.get(i9)).intValue());
                i9++;
            }
            return;
        }
        c1505l.G0(i3, 2);
        int i10 = 0;
        for (int i11 = 0; i11 < list.size(); i11++) {
            ((java.lang.Integer) list.get(i11)).getClass();
            java.util.logging.Logger logger = androidx.datastore.preferences.protobuf.C1505l.f16227r;
            i10 += 4;
        }
        c1505l.I0(i10);
        while (i9 < list.size()) {
            c1505l.y0(((java.lang.Integer) list.get(i9)).intValue());
            i9++;
        }
    }

    public static void v(int i3, java.util.List list, androidx.datastore.preferences.protobuf.F f9, boolean z6) {
        if (list == null || list.isEmpty()) {
            return;
        }
        androidx.datastore.preferences.protobuf.C1505l c1505l = (androidx.datastore.preferences.protobuf.C1505l) f9.f16134a;
        int i9 = 0;
        if (!z6) {
            while (i9 < list.size()) {
                c1505l.z0(i3, ((java.lang.Long) list.get(i9)).longValue());
                i9++;
            }
            return;
        }
        c1505l.G0(i3, 2);
        int i10 = 0;
        for (int i11 = 0; i11 < list.size(); i11++) {
            ((java.lang.Long) list.get(i11)).getClass();
            java.util.logging.Logger logger = androidx.datastore.preferences.protobuf.C1505l.f16227r;
            i10 += 8;
        }
        c1505l.I0(i10);
        while (i9 < list.size()) {
            c1505l.A0(((java.lang.Long) list.get(i9)).longValue());
            i9++;
        }
    }

    public static void w(int i3, java.util.List list, androidx.datastore.preferences.protobuf.F f9, boolean z6) {
        if (list == null || list.isEmpty()) {
            return;
        }
        androidx.datastore.preferences.protobuf.C1505l c1505l = (androidx.datastore.preferences.protobuf.C1505l) f9.f16134a;
        int i9 = 0;
        if (!z6) {
            while (i9 < list.size()) {
                int iIntValue = ((java.lang.Integer) list.get(i9)).intValue();
                c1505l.H0(i3, (iIntValue >> 31) ^ (iIntValue << 1));
                i9++;
            }
            return;
        }
        c1505l.G0(i3, 2);
        int iO0 = 0;
        for (int i10 = 0; i10 < list.size(); i10++) {
            int iIntValue2 = ((java.lang.Integer) list.get(i10)).intValue();
            iO0 += androidx.datastore.preferences.protobuf.C1505l.o0((iIntValue2 >> 31) ^ (iIntValue2 << 1));
        }
        c1505l.I0(iO0);
        while (i9 < list.size()) {
            int iIntValue3 = ((java.lang.Integer) list.get(i9)).intValue();
            c1505l.I0((iIntValue3 >> 31) ^ (iIntValue3 << 1));
            i9++;
        }
    }

    public static void x(int i3, java.util.List list, androidx.datastore.preferences.protobuf.F f9, boolean z6) {
        if (list == null || list.isEmpty()) {
            return;
        }
        androidx.datastore.preferences.protobuf.C1505l c1505l = (androidx.datastore.preferences.protobuf.C1505l) f9.f16134a;
        int i9 = 0;
        if (!z6) {
            while (i9 < list.size()) {
                long jLongValue = ((java.lang.Long) list.get(i9)).longValue();
                c1505l.J0(i3, (jLongValue >> 63) ^ (jLongValue << 1));
                i9++;
            }
            return;
        }
        c1505l.G0(i3, 2);
        int iP0 = 0;
        for (int i10 = 0; i10 < list.size(); i10++) {
            long jLongValue2 = ((java.lang.Long) list.get(i10)).longValue();
            iP0 += androidx.datastore.preferences.protobuf.C1505l.p0((jLongValue2 >> 63) ^ (jLongValue2 << 1));
        }
        c1505l.I0(iP0);
        while (i9 < list.size()) {
            long jLongValue3 = ((java.lang.Long) list.get(i9)).longValue();
            c1505l.K0((jLongValue3 >> 63) ^ (jLongValue3 << 1));
            i9++;
        }
    }

    public static void y(int i3, java.util.List list, androidx.datastore.preferences.protobuf.F f9, boolean z6) {
        if (list == null || list.isEmpty()) {
            return;
        }
        androidx.datastore.preferences.protobuf.C1505l c1505l = (androidx.datastore.preferences.protobuf.C1505l) f9.f16134a;
        int i9 = 0;
        if (!z6) {
            while (i9 < list.size()) {
                c1505l.H0(i3, ((java.lang.Integer) list.get(i9)).intValue());
                i9++;
            }
            return;
        }
        c1505l.G0(i3, 2);
        int iO0 = 0;
        for (int i10 = 0; i10 < list.size(); i10++) {
            iO0 += androidx.datastore.preferences.protobuf.C1505l.o0(((java.lang.Integer) list.get(i10)).intValue());
        }
        c1505l.I0(iO0);
        while (i9 < list.size()) {
            c1505l.I0(((java.lang.Integer) list.get(i9)).intValue());
            i9++;
        }
    }

    public static void z(int i3, java.util.List list, androidx.datastore.preferences.protobuf.F f9, boolean z6) {
        if (list == null || list.isEmpty()) {
            return;
        }
        androidx.datastore.preferences.protobuf.C1505l c1505l = (androidx.datastore.preferences.protobuf.C1505l) f9.f16134a;
        int i9 = 0;
        if (!z6) {
            while (i9 < list.size()) {
                c1505l.J0(i3, ((java.lang.Long) list.get(i9)).longValue());
                i9++;
            }
            return;
        }
        c1505l.G0(i3, 2);
        int iP0 = 0;
        for (int i10 = 0; i10 < list.size(); i10++) {
            iP0 += androidx.datastore.preferences.protobuf.C1505l.p0(((java.lang.Long) list.get(i10)).longValue());
        }
        c1505l.I0(iP0);
        while (i9 < list.size()) {
            c1505l.K0(((java.lang.Long) list.get(i9)).longValue());
            i9++;
        }
    }

    public static java.lang.Object j(java.lang.Object obj, int i3, androidx.datastore.preferences.protobuf.InterfaceC1515w interfaceC1515w, java.lang.Object obj2, androidx.datastore.preferences.protobuf.f0 f0Var) {
        return obj2;
    }
}
