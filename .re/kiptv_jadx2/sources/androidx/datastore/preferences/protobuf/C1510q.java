package androidx.datastore.preferences.protobuf;

import java.util.Collections;
import java.util.Iterator;
import java.util.Map;

public final class C1510q {

    public static final int f16241c = 0;

    public final Z f16242a = Z.g();

    public boolean f16243b;

    static {
        new C1510q(0);
    }

    public C1510q() {
    }

    public static void b(C1505l c1505l, s0 s0Var, int i3, Object obj) {
        if (s0Var == s0.f16250k) {
            c1505l.G0(i3, 3);
            ((AbstractC1494a) obj).b(c1505l);
            c1505l.G0(i3, 4);
        }
        c1505l.G0(i3, s0Var.f16254i);
        switch (s0Var.ordinal()) {
            case 0:
                c1505l.A0(Double.doubleToRawLongBits(((Double) obj).doubleValue()));
                break;
            case 1:
                c1505l.y0(Float.floatToRawIntBits(((Float) obj).floatValue()));
                break;
            case 2:
                c1505l.K0(((Long) obj).longValue());
                break;
            case 3:
                c1505l.K0(((Long) obj).longValue());
                break;
            case 4:
                c1505l.C0(((Integer) obj).intValue());
                break;
            case 5:
                c1505l.A0(((Long) obj).longValue());
                break;
            case 6:
                c1505l.y0(((Integer) obj).intValue());
                break;
            case 7:
                c1505l.s0(((Boolean) obj).booleanValue() ? (byte) 1 : (byte) 0);
                break;
            case 8:
                if (!(obj instanceof C1500g)) {
                    c1505l.F0((String) obj);
                } else {
                    c1505l.w0((C1500g) obj);
                }
                break;
            case 9:
                ((AbstractC1494a) obj).b(c1505l);
                break;
            case 10:
                AbstractC1494a abstractC1494a = (AbstractC1494a) obj;
                c1505l.getClass();
                c1505l.I0(((AbstractC1514v) abstractC1494a).a(null));
                abstractC1494a.b(c1505l);
                break;
            case 11:
                if (!(obj instanceof C1500g)) {
                    byte[] bArr = (byte[]) obj;
                    int length = bArr.length;
                    c1505l.I0(length);
                    c1505l.t0(bArr, 0, length);
                } else {
                    c1505l.w0((C1500g) obj);
                }
                break;
            case 12:
                c1505l.I0(((Integer) obj).intValue());
                break;
            case 13:
                c1505l.C0(((Integer) obj).intValue());
                break;
            case 14:
                c1505l.y0(((Integer) obj).intValue());
                break;
            case 15:
                c1505l.A0(((Long) obj).longValue());
                break;
            case 16:
                int iIntValue = ((Integer) obj).intValue();
                c1505l.I0((iIntValue >> 31) ^ (iIntValue << 1));
                break;
            case 17:
                long jLongValue = ((Long) obj).longValue();
                c1505l.K0((jLongValue >> 63) ^ (jLongValue << 1));
                break;
        }
    }

    public final void a() {
        if (this.f16243b) {
            return;
        }
        Z z6 = this.f16242a;
        int size = z6.f16175h.size();
        for (int i3 = 0; i3 < size; i3++) {
            Map.Entry entryC = z6.c(i3);
            if (entryC.getValue() instanceof AbstractC1514v) {
                AbstractC1514v abstractC1514v = (AbstractC1514v) entryC.getValue();
                abstractC1514v.getClass();
                U u6 = U.f16162c;
                u6.getClass();
                u6.a(abstractC1514v.getClass()).b(abstractC1514v);
                abstractC1514v.h();
            }
        }
        if (!z6.j) {
            if (z6.f16175h.size() > 0) {
                z6.c(0).getKey().getClass();
                throw new ClassCastException();
            }
            Iterator it = z6.d().iterator();
            if (it.hasNext()) {
                ((Map.Entry) it.next()).getKey().getClass();
                throw new ClassCastException();
            }
        }
        if (!z6.j) {
            z6.f16176i = z6.f16176i.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(z6.f16176i);
            z6.f16178l = z6.f16178l.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(z6.f16178l);
            z6.j = true;
        }
        this.f16243b = true;
    }

    public final Object clone() {
        C1510q c1510q = new C1510q();
        Z z6 = this.f16242a;
        if (z6.f16175h.size() > 0) {
            Map.Entry entryC = z6.c(0);
            if (entryC.getKey() != null) {
                throw new ClassCastException();
            }
            entryC.getValue();
            throw null;
        }
        Iterator it = z6.d().iterator();
        if (!it.hasNext()) {
            return c1510q;
        }
        Map.Entry entry = (Map.Entry) it.next();
        if (entry.getKey() != null) {
            throw new ClassCastException();
        }
        entry.getValue();
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C1510q) {
            return this.f16242a.equals(((C1510q) obj).f16242a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f16242a.hashCode();
    }

    public C1510q(int i3) {
        a();
        a();
    }
}
