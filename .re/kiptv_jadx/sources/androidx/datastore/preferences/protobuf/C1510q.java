package androidx.datastore.preferences.protobuf;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.q, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1510q {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f16241c = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final androidx.datastore.preferences.protobuf.Z f16242a = androidx.datastore.preferences.protobuf.Z.g();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f16243b;

    static {
        new androidx.datastore.preferences.protobuf.C1510q(0);
    }

    public C1510q() {
    }

    public static void b(androidx.datastore.preferences.protobuf.C1505l c1505l, androidx.datastore.preferences.protobuf.s0 s0Var, int i3, java.lang.Object obj) {
        if (s0Var == androidx.datastore.preferences.protobuf.s0.f16250k) {
            c1505l.G0(i3, 3);
            ((androidx.datastore.preferences.protobuf.AbstractC1494a) obj).b(c1505l);
            c1505l.G0(i3, 4);
        }
        c1505l.G0(i3, s0Var.f16254i);
        switch (s0Var.ordinal()) {
            case 0:
                c1505l.A0(java.lang.Double.doubleToRawLongBits(((java.lang.Double) obj).doubleValue()));
                break;
            case 1:
                c1505l.y0(java.lang.Float.floatToRawIntBits(((java.lang.Float) obj).floatValue()));
                break;
            case 2:
                c1505l.K0(((java.lang.Long) obj).longValue());
                break;
            case 3:
                c1505l.K0(((java.lang.Long) obj).longValue());
                break;
            case 4:
                c1505l.C0(((java.lang.Integer) obj).intValue());
                break;
            case 5:
                c1505l.A0(((java.lang.Long) obj).longValue());
                break;
            case 6:
                c1505l.y0(((java.lang.Integer) obj).intValue());
                break;
            case 7:
                c1505l.s0(((java.lang.Boolean) obj).booleanValue() ? (byte) 1 : (byte) 0);
                break;
            case 8:
                if (!(obj instanceof androidx.datastore.preferences.protobuf.C1500g)) {
                    c1505l.F0((java.lang.String) obj);
                } else {
                    c1505l.w0((androidx.datastore.preferences.protobuf.C1500g) obj);
                }
                break;
            case 9:
                ((androidx.datastore.preferences.protobuf.AbstractC1494a) obj).b(c1505l);
                break;
            case 10:
                androidx.datastore.preferences.protobuf.AbstractC1494a abstractC1494a = (androidx.datastore.preferences.protobuf.AbstractC1494a) obj;
                c1505l.getClass();
                c1505l.I0(((androidx.datastore.preferences.protobuf.AbstractC1514v) abstractC1494a).a(null));
                abstractC1494a.b(c1505l);
                break;
            case 11:
                if (!(obj instanceof androidx.datastore.preferences.protobuf.C1500g)) {
                    byte[] bArr = (byte[]) obj;
                    int length = bArr.length;
                    c1505l.I0(length);
                    c1505l.t0(bArr, 0, length);
                } else {
                    c1505l.w0((androidx.datastore.preferences.protobuf.C1500g) obj);
                }
                break;
            case 12:
                c1505l.I0(((java.lang.Integer) obj).intValue());
                break;
            case 13:
                c1505l.C0(((java.lang.Integer) obj).intValue());
                break;
            case 14:
                c1505l.y0(((java.lang.Integer) obj).intValue());
                break;
            case 15:
                c1505l.A0(((java.lang.Long) obj).longValue());
                break;
            case 16:
                int iIntValue = ((java.lang.Integer) obj).intValue();
                c1505l.I0((iIntValue >> 31) ^ (iIntValue << 1));
                break;
            case 17:
                long jLongValue = ((java.lang.Long) obj).longValue();
                c1505l.K0((jLongValue >> 63) ^ (jLongValue << 1));
                break;
        }
    }

    public final void a() {
        if (this.f16243b) {
            return;
        }
        androidx.datastore.preferences.protobuf.Z z6 = this.f16242a;
        int size = z6.f16175h.size();
        for (int i3 = 0; i3 < size; i3++) {
            java.util.Map.Entry entryC = z6.c(i3);
            if (entryC.getValue() instanceof androidx.datastore.preferences.protobuf.AbstractC1514v) {
                androidx.datastore.preferences.protobuf.AbstractC1514v abstractC1514v = (androidx.datastore.preferences.protobuf.AbstractC1514v) entryC.getValue();
                abstractC1514v.getClass();
                androidx.datastore.preferences.protobuf.U u6 = androidx.datastore.preferences.protobuf.U.f16162c;
                u6.getClass();
                u6.a(abstractC1514v.getClass()).b(abstractC1514v);
                abstractC1514v.h();
            }
        }
        if (!z6.j) {
            if (z6.f16175h.size() > 0) {
                z6.c(0).getKey().getClass();
                throw new java.lang.ClassCastException();
            }
            java.util.Iterator it = z6.d().iterator();
            if (it.hasNext()) {
                ((java.util.Map.Entry) it.next()).getKey().getClass();
                throw new java.lang.ClassCastException();
            }
        }
        if (!z6.j) {
            z6.f16176i = z6.f16176i.isEmpty() ? java.util.Collections.EMPTY_MAP : java.util.Collections.unmodifiableMap(z6.f16176i);
            z6.f16178l = z6.f16178l.isEmpty() ? java.util.Collections.EMPTY_MAP : java.util.Collections.unmodifiableMap(z6.f16178l);
            z6.j = true;
        }
        this.f16243b = true;
    }

    public final java.lang.Object clone() {
        androidx.datastore.preferences.protobuf.C1510q c1510q = new androidx.datastore.preferences.protobuf.C1510q();
        androidx.datastore.preferences.protobuf.Z z6 = this.f16242a;
        if (z6.f16175h.size() > 0) {
            java.util.Map.Entry entryC = z6.c(0);
            if (entryC.getKey() != null) {
                throw new java.lang.ClassCastException();
            }
            entryC.getValue();
            throw null;
        }
        java.util.Iterator it = z6.d().iterator();
        if (!it.hasNext()) {
            return c1510q;
        }
        java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
        if (entry.getKey() != null) {
            throw new java.lang.ClassCastException();
        }
        entry.getValue();
        throw null;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof androidx.datastore.preferences.protobuf.C1510q) {
            return this.f16242a.equals(((androidx.datastore.preferences.protobuf.C1510q) obj).f16242a);
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
