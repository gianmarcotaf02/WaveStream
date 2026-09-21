package androidx.datastore.preferences.protobuf;

import java.util.Arrays;
import java.util.List;
import java.util.logging.Logger;

public abstract class Y {

    public static final Class f16171a;

    public static final f0 f16172b;

    public static final f0 f16173c;

    static {
        Class<?> cls;
        Class<?> cls2;
        U u6 = U.f16162c;
        f0 f0Var = null;
        try {
            cls = Class.forName("androidx.datastore.preferences.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            cls = null;
        }
        f16171a = cls;
        try {
            U u7 = U.f16162c;
            try {
                cls2 = Class.forName("androidx.datastore.preferences.protobuf.UnknownFieldSetSchema");
            } catch (Throwable unused2) {
                cls2 = null;
            }
            if (cls2 != null) {
                f0Var = (f0) cls2.getConstructor(null).newInstance(null);
            }
        } catch (Throwable unused3) {
        }
        f16172b = f0Var;
        f16173c = new f0();
    }

    public static int a(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iP0 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            iP0 += C1505l.p0(((Integer) list.get(i3)).intValue());
        }
        return iP0;
    }

    public static int b(int i3, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (C1505l.n0(i3) + 4) * size;
    }

    public static int c(int i3, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (C1505l.n0(i3) + 8) * size;
    }

    public static int d(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iP0 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            iP0 += C1505l.p0(((Integer) list.get(i3)).intValue());
        }
        return iP0;
    }

    public static int e(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iP0 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            iP0 += C1505l.p0(((Long) list.get(i3)).longValue());
        }
        return iP0;
    }

    public static int f(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iO0 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            int iIntValue = ((Integer) list.get(i3)).intValue();
            iO0 += C1505l.o0((iIntValue >> 31) ^ (iIntValue << 1));
        }
        return iO0;
    }

    public static int g(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iP0 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            long jLongValue = ((Long) list.get(i3)).longValue();
            iP0 += C1505l.p0((jLongValue >> 63) ^ (jLongValue << 1));
        }
        return iP0;
    }

    public static int h(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iO0 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            iO0 += C1505l.o0(((Integer) list.get(i3)).intValue());
        }
        return iO0;
    }

    public static int i(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iP0 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            iP0 += C1505l.p0(((Long) list.get(i3)).longValue());
        }
        return iP0;
    }

    public static void k(f0 f0Var, Object obj, Object obj2) {
        f0Var.getClass();
        AbstractC1514v abstractC1514v = (AbstractC1514v) obj;
        e0 e0Var = abstractC1514v.unknownFields;
        e0 e0Var2 = ((AbstractC1514v) obj2).unknownFields;
        e0 e0Var3 = e0.f16194f;
        if (!e0Var3.equals(e0Var2)) {
            if (e0Var3.equals(e0Var)) {
                int i3 = e0Var.f16195a + e0Var2.f16195a;
                int[] iArrCopyOf = Arrays.copyOf(e0Var.f16196b, i3);
                System.arraycopy(e0Var2.f16196b, 0, iArrCopyOf, e0Var.f16195a, e0Var2.f16195a);
                Object[] objArrCopyOf = Arrays.copyOf(e0Var.f16197c, i3);
                System.arraycopy(e0Var2.f16197c, 0, objArrCopyOf, e0Var.f16195a, e0Var2.f16195a);
                e0Var = new e0(i3, iArrCopyOf, objArrCopyOf, true);
            } else {
                e0Var.getClass();
                if (!e0Var2.equals(e0Var3)) {
                    if (!e0Var.f16199e) {
                        throw new UnsupportedOperationException();
                    }
                    int i9 = e0Var.f16195a + e0Var2.f16195a;
                    e0Var.a(i9);
                    System.arraycopy(e0Var2.f16196b, 0, e0Var.f16196b, e0Var.f16195a, e0Var2.f16195a);
                    System.arraycopy(e0Var2.f16197c, 0, e0Var.f16197c, e0Var.f16195a, e0Var2.f16195a);
                    e0Var.f16195a = i9;
                }
            }
        }
        abstractC1514v.unknownFields = e0Var;
    }

    public static boolean l(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static void m(int i3, List list, F f9, boolean z6) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C1505l c1505l = (C1505l) f9.f16134a;
        int i9 = 0;
        if (!z6) {
            while (i9 < list.size()) {
                c1505l.u0(i3, ((Boolean) list.get(i9)).booleanValue());
                i9++;
            }
            return;
        }
        c1505l.G0(i3, 2);
        int i10 = 0;
        for (int i11 = 0; i11 < list.size(); i11++) {
            ((Boolean) list.get(i11)).getClass();
            Logger logger = C1505l.f16227r;
            i10++;
        }
        c1505l.I0(i10);
        while (i9 < list.size()) {
            c1505l.s0(((Boolean) list.get(i9)).booleanValue() ? (byte) 1 : (byte) 0);
            i9++;
        }
    }

    public static void n(int i3, List list, F f9, boolean z6) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C1505l c1505l = (C1505l) f9.f16134a;
        int i9 = 0;
        if (!z6) {
            while (i9 < list.size()) {
                double dDoubleValue = ((Double) list.get(i9)).doubleValue();
                c1505l.getClass();
                c1505l.z0(i3, Double.doubleToRawLongBits(dDoubleValue));
                i9++;
            }
            return;
        }
        c1505l.G0(i3, 2);
        int i10 = 0;
        for (int i11 = 0; i11 < list.size(); i11++) {
            ((Double) list.get(i11)).getClass();
            Logger logger = C1505l.f16227r;
            i10 += 8;
        }
        c1505l.I0(i10);
        while (i9 < list.size()) {
            c1505l.A0(Double.doubleToRawLongBits(((Double) list.get(i9)).doubleValue()));
            i9++;
        }
    }

    public static void o(int i3, List list, F f9, boolean z6) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C1505l c1505l = (C1505l) f9.f16134a;
        int i9 = 0;
        if (!z6) {
            while (i9 < list.size()) {
                c1505l.B0(i3, ((Integer) list.get(i9)).intValue());
                i9++;
            }
            return;
        }
        c1505l.G0(i3, 2);
        int iP0 = 0;
        for (int i10 = 0; i10 < list.size(); i10++) {
            iP0 += C1505l.p0(((Integer) list.get(i10)).intValue());
        }
        c1505l.I0(iP0);
        while (i9 < list.size()) {
            c1505l.C0(((Integer) list.get(i9)).intValue());
            i9++;
        }
    }

    public static void p(int i3, List list, F f9, boolean z6) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C1505l c1505l = (C1505l) f9.f16134a;
        int i9 = 0;
        if (!z6) {
            while (i9 < list.size()) {
                c1505l.x0(i3, ((Integer) list.get(i9)).intValue());
                i9++;
            }
            return;
        }
        c1505l.G0(i3, 2);
        int i10 = 0;
        for (int i11 = 0; i11 < list.size(); i11++) {
            ((Integer) list.get(i11)).getClass();
            Logger logger = C1505l.f16227r;
            i10 += 4;
        }
        c1505l.I0(i10);
        while (i9 < list.size()) {
            c1505l.y0(((Integer) list.get(i9)).intValue());
            i9++;
        }
    }

    public static void q(int i3, List list, F f9, boolean z6) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C1505l c1505l = (C1505l) f9.f16134a;
        int i9 = 0;
        if (!z6) {
            while (i9 < list.size()) {
                c1505l.z0(i3, ((Long) list.get(i9)).longValue());
                i9++;
            }
            return;
        }
        c1505l.G0(i3, 2);
        int i10 = 0;
        for (int i11 = 0; i11 < list.size(); i11++) {
            ((Long) list.get(i11)).getClass();
            Logger logger = C1505l.f16227r;
            i10 += 8;
        }
        c1505l.I0(i10);
        while (i9 < list.size()) {
            c1505l.A0(((Long) list.get(i9)).longValue());
            i9++;
        }
    }

    public static void r(int i3, List list, F f9, boolean z6) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C1505l c1505l = (C1505l) f9.f16134a;
        int i9 = 0;
        if (!z6) {
            while (i9 < list.size()) {
                float fFloatValue = ((Float) list.get(i9)).floatValue();
                c1505l.getClass();
                c1505l.x0(i3, Float.floatToRawIntBits(fFloatValue));
                i9++;
            }
            return;
        }
        c1505l.G0(i3, 2);
        int i10 = 0;
        for (int i11 = 0; i11 < list.size(); i11++) {
            ((Float) list.get(i11)).getClass();
            Logger logger = C1505l.f16227r;
            i10 += 4;
        }
        c1505l.I0(i10);
        while (i9 < list.size()) {
            c1505l.y0(Float.floatToRawIntBits(((Float) list.get(i9)).floatValue()));
            i9++;
        }
    }

    public static void s(int i3, List list, F f9, boolean z6) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C1505l c1505l = (C1505l) f9.f16134a;
        int i9 = 0;
        if (!z6) {
            while (i9 < list.size()) {
                c1505l.B0(i3, ((Integer) list.get(i9)).intValue());
                i9++;
            }
            return;
        }
        c1505l.G0(i3, 2);
        int iP0 = 0;
        for (int i10 = 0; i10 < list.size(); i10++) {
            iP0 += C1505l.p0(((Integer) list.get(i10)).intValue());
        }
        c1505l.I0(iP0);
        while (i9 < list.size()) {
            c1505l.C0(((Integer) list.get(i9)).intValue());
            i9++;
        }
    }

    public static void t(int i3, List list, F f9, boolean z6) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C1505l c1505l = (C1505l) f9.f16134a;
        int i9 = 0;
        if (!z6) {
            while (i9 < list.size()) {
                c1505l.J0(i3, ((Long) list.get(i9)).longValue());
                i9++;
            }
            return;
        }
        c1505l.G0(i3, 2);
        int iP0 = 0;
        for (int i10 = 0; i10 < list.size(); i10++) {
            iP0 += C1505l.p0(((Long) list.get(i10)).longValue());
        }
        c1505l.I0(iP0);
        while (i9 < list.size()) {
            c1505l.K0(((Long) list.get(i9)).longValue());
            i9++;
        }
    }

    public static void u(int i3, List list, F f9, boolean z6) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C1505l c1505l = (C1505l) f9.f16134a;
        int i9 = 0;
        if (!z6) {
            while (i9 < list.size()) {
                c1505l.x0(i3, ((Integer) list.get(i9)).intValue());
                i9++;
            }
            return;
        }
        c1505l.G0(i3, 2);
        int i10 = 0;
        for (int i11 = 0; i11 < list.size(); i11++) {
            ((Integer) list.get(i11)).getClass();
            Logger logger = C1505l.f16227r;
            i10 += 4;
        }
        c1505l.I0(i10);
        while (i9 < list.size()) {
            c1505l.y0(((Integer) list.get(i9)).intValue());
            i9++;
        }
    }

    public static void v(int i3, List list, F f9, boolean z6) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C1505l c1505l = (C1505l) f9.f16134a;
        int i9 = 0;
        if (!z6) {
            while (i9 < list.size()) {
                c1505l.z0(i3, ((Long) list.get(i9)).longValue());
                i9++;
            }
            return;
        }
        c1505l.G0(i3, 2);
        int i10 = 0;
        for (int i11 = 0; i11 < list.size(); i11++) {
            ((Long) list.get(i11)).getClass();
            Logger logger = C1505l.f16227r;
            i10 += 8;
        }
        c1505l.I0(i10);
        while (i9 < list.size()) {
            c1505l.A0(((Long) list.get(i9)).longValue());
            i9++;
        }
    }

    public static void w(int i3, List list, F f9, boolean z6) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C1505l c1505l = (C1505l) f9.f16134a;
        int i9 = 0;
        if (!z6) {
            while (i9 < list.size()) {
                int iIntValue = ((Integer) list.get(i9)).intValue();
                c1505l.H0(i3, (iIntValue >> 31) ^ (iIntValue << 1));
                i9++;
            }
            return;
        }
        c1505l.G0(i3, 2);
        int iO0 = 0;
        for (int i10 = 0; i10 < list.size(); i10++) {
            int iIntValue2 = ((Integer) list.get(i10)).intValue();
            iO0 += C1505l.o0((iIntValue2 >> 31) ^ (iIntValue2 << 1));
        }
        c1505l.I0(iO0);
        while (i9 < list.size()) {
            int iIntValue3 = ((Integer) list.get(i9)).intValue();
            c1505l.I0((iIntValue3 >> 31) ^ (iIntValue3 << 1));
            i9++;
        }
    }

    public static void x(int i3, List list, F f9, boolean z6) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C1505l c1505l = (C1505l) f9.f16134a;
        int i9 = 0;
        if (!z6) {
            while (i9 < list.size()) {
                long jLongValue = ((Long) list.get(i9)).longValue();
                c1505l.J0(i3, (jLongValue >> 63) ^ (jLongValue << 1));
                i9++;
            }
            return;
        }
        c1505l.G0(i3, 2);
        int iP0 = 0;
        for (int i10 = 0; i10 < list.size(); i10++) {
            long jLongValue2 = ((Long) list.get(i10)).longValue();
            iP0 += C1505l.p0((jLongValue2 >> 63) ^ (jLongValue2 << 1));
        }
        c1505l.I0(iP0);
        while (i9 < list.size()) {
            long jLongValue3 = ((Long) list.get(i9)).longValue();
            c1505l.K0((jLongValue3 >> 63) ^ (jLongValue3 << 1));
            i9++;
        }
    }

    public static void y(int i3, List list, F f9, boolean z6) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C1505l c1505l = (C1505l) f9.f16134a;
        int i9 = 0;
        if (!z6) {
            while (i9 < list.size()) {
                c1505l.H0(i3, ((Integer) list.get(i9)).intValue());
                i9++;
            }
            return;
        }
        c1505l.G0(i3, 2);
        int iO0 = 0;
        for (int i10 = 0; i10 < list.size(); i10++) {
            iO0 += C1505l.o0(((Integer) list.get(i10)).intValue());
        }
        c1505l.I0(iO0);
        while (i9 < list.size()) {
            c1505l.I0(((Integer) list.get(i9)).intValue());
            i9++;
        }
    }

    public static void z(int i3, List list, F f9, boolean z6) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C1505l c1505l = (C1505l) f9.f16134a;
        int i9 = 0;
        if (!z6) {
            while (i9 < list.size()) {
                c1505l.J0(i3, ((Long) list.get(i9)).longValue());
                i9++;
            }
            return;
        }
        c1505l.G0(i3, 2);
        int iP0 = 0;
        for (int i10 = 0; i10 < list.size(); i10++) {
            iP0 += C1505l.p0(((Long) list.get(i10)).longValue());
        }
        c1505l.I0(iP0);
        while (i9 < list.size()) {
            c1505l.K0(((Long) list.get(i9)).longValue());
            i9++;
        }
    }

    public static Object j(Object obj, int i3, InterfaceC1515w interfaceC1515w, Object obj2, f0 f0Var) {
        return obj2;
    }
}
