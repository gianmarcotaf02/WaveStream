package p110m7;

/* JADX INFO: renamed from: m7.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2636i {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final p110m7.C2636i f25489c = new p110m7.C2636i(0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p110m7.A f25490a = new p110m7.A(16);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f25491b;

    public C2636i() {
    }

    public static int c(p110m7.M m8, java.lang.Object obj) {
        switch (m8.ordinal()) {
            case 0:
                ((java.lang.Double) obj).getClass();
                return 8;
            case 1:
                ((java.lang.Float) obj).getClass();
                return 4;
            case 2:
                return Z2.M.r(((java.lang.Long) obj).longValue());
            case 3:
                return Z2.M.r(((java.lang.Long) obj).longValue());
            case 4:
                return Z2.M.n(((java.lang.Integer) obj).intValue());
            case 5:
                ((java.lang.Long) obj).getClass();
                return 8;
            case 6:
                ((java.lang.Integer) obj).getClass();
                return 4;
            case 7:
                ((java.lang.Boolean) obj).getClass();
                return 1;
            case 8:
                try {
                    byte[] bytes = ((java.lang.String) obj).getBytes("UTF-8");
                    return Z2.M.q(bytes.length) + bytes.length;
                } catch (java.io.UnsupportedEncodingException e6) {
                    throw new java.lang.RuntimeException("UTF-8 not supported.", e6);
                }
            case 9:
                return ((p110m7.AbstractC2629b) obj).b();
            case 10:
                return Z2.M.p((p110m7.AbstractC2629b) obj);
            case 11:
                if (obj instanceof p110m7.AbstractC2632e) {
                    p110m7.AbstractC2632e abstractC2632e = (p110m7.AbstractC2632e) obj;
                    return abstractC2632e.size() + Z2.M.q(abstractC2632e.size());
                }
                byte[] bArr = (byte[]) obj;
                return Z2.M.q(bArr.length) + bArr.length;
            case 12:
                return Z2.M.q(((java.lang.Integer) obj).intValue());
            case 13:
                return obj instanceof p110m7.p ? Z2.M.n(((p110m7.p) obj).a()) : Z2.M.n(((java.lang.Integer) obj).intValue());
            case 14:
                ((java.lang.Integer) obj).getClass();
                return 4;
            case 15:
                ((java.lang.Long) obj).getClass();
                return 8;
            case 16:
                int iIntValue = ((java.lang.Integer) obj).intValue();
                return Z2.M.q((iIntValue >> 31) ^ (iIntValue << 1));
            case 17:
                long jLongValue = ((java.lang.Long) obj).longValue();
                return Z2.M.r((jLongValue >> 63) ^ (jLongValue << 1));
            default:
                throw new java.lang.RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    public static int d(p110m7.C2640m c2640m, java.lang.Object obj) {
        p110m7.M m8 = c2640m.f25496i;
        boolean z6 = c2640m.j;
        int i3 = c2640m.f25495h;
        if (!z6) {
            int iS = Z2.M.s(i3);
            if (m8 == p110m7.M.f25454l) {
                iS *= 2;
            }
            return c(m8, obj) + iS;
        }
        int iC = 0;
        for (java.lang.Object obj2 : (java.util.List) obj) {
            int iS2 = Z2.M.s(i3);
            if (m8 == p110m7.M.f25454l) {
                iS2 *= 2;
            }
            iC += c(m8, obj2) + iS2;
        }
        return iC;
    }

    public static boolean e(java.util.Map.Entry entry) {
        p110m7.C2640m c2640m = (p110m7.C2640m) entry.getKey();
        if (c2640m.f25496i.f25458h != p110m7.N.MESSAGE) {
            return true;
        }
        if (!c2640m.j) {
            java.lang.Object value = entry.getValue();
            if (value instanceof p110m7.AbstractC2629b) {
                return ((p110m7.AbstractC2629b) value).isInitialized();
            }
            throw new java.lang.IllegalArgumentException("Wrong object type used with protocol message reflection.");
        }
        java.util.Iterator it = ((java.util.List) entry.getValue()).iterator();
        while (it.hasNext()) {
            if (!((p110m7.AbstractC2629b) it.next()).isInitialized()) {
                return false;
            }
        }
        return true;
    }

    public static java.lang.Object h(p110m7.C2633f c2633f, p110m7.M m8) {
        switch (m8.ordinal()) {
            case 0:
                return java.lang.Double.valueOf(java.lang.Double.longBitsToDouble(c2633f.j()));
            case 1:
                return java.lang.Float.valueOf(java.lang.Float.intBitsToFloat(c2633f.i()));
            case 2:
                return java.lang.Long.valueOf(c2633f.l());
            case 3:
                return java.lang.Long.valueOf(c2633f.l());
            case 4:
                return java.lang.Integer.valueOf(c2633f.k());
            case 5:
                return java.lang.Long.valueOf(c2633f.j());
            case 6:
                return java.lang.Integer.valueOf(c2633f.i());
            case 7:
                return java.lang.Boolean.valueOf(c2633f.l() != 0);
            case 8:
                int iK = c2633f.k();
                int i3 = c2633f.f25478b;
                int i9 = c2633f.f25480d;
                if (iK > i3 - i9 || iK <= 0) {
                    return iK == 0 ? "" : new java.lang.String(c2633f.h(iK), "UTF-8");
                }
                java.lang.String str = new java.lang.String(c2633f.f25477a, i9, iK, "UTF-8");
                c2633f.f25480d += iK;
                return str;
            case 9:
                throw new java.lang.IllegalArgumentException("readPrimitiveField() cannot handle nested groups.");
            case 10:
                throw new java.lang.IllegalArgumentException("readPrimitiveField() cannot handle embedded messages.");
            case 11:
                return c2633f.e();
            case 12:
                return java.lang.Integer.valueOf(c2633f.k());
            case 13:
                throw new java.lang.IllegalArgumentException("readPrimitiveField() cannot handle enums.");
            case 14:
                return java.lang.Integer.valueOf(c2633f.i());
            case 15:
                return java.lang.Long.valueOf(c2633f.j());
            case 16:
                int iK2 = c2633f.k();
                return java.lang.Integer.valueOf((-(iK2 & 1)) ^ (iK2 >>> 1));
            case 17:
                long jL = c2633f.l();
                return java.lang.Long.valueOf((-(jL & 1)) ^ (jL >>> 1));
            default:
                throw new java.lang.RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x001b  */
    public static void j(p110m7.M m8, java.lang.Object obj) {
        obj.getClass();
        boolean z6 = true;
        boolean z9 = false;
        switch (m8.f25458h) {
            case INT:
                z9 = obj instanceof java.lang.Integer;
                break;
            case LONG:
                z9 = obj instanceof java.lang.Long;
                break;
            case FLOAT:
                z9 = obj instanceof java.lang.Float;
                break;
            case DOUBLE:
                z9 = obj instanceof java.lang.Double;
                break;
            case BOOLEAN:
                z9 = obj instanceof java.lang.Boolean;
                break;
            case STRING:
                z9 = obj instanceof java.lang.String;
                break;
            case BYTE_STRING:
                if (!(obj instanceof p110m7.AbstractC2632e) && !(obj instanceof byte[])) {
                    z6 = false;
                }
                z9 = z6;
                break;
            case ENUM:
                if (!(obj instanceof java.lang.Integer) && !(obj instanceof p110m7.p)) {
                    z6 = false;
                }
                z9 = z6;
                break;
            case MESSAGE:
                z9 = obj instanceof p110m7.AbstractC2629b;
                break;
        }
        if (!z9) {
            throw new java.lang.IllegalArgumentException("Wrong object type used with protocol message reflection.");
        }
    }

    public static void k(Z2.M m8, p110m7.M m9, java.lang.Object obj) {
        switch (m9.ordinal()) {
            case 0:
                double dDoubleValue = ((java.lang.Double) obj).doubleValue();
                m8.getClass();
                m8.h0(java.lang.Double.doubleToRawLongBits(dDoubleValue));
                break;
            case 1:
                float fFloatValue = ((java.lang.Float) obj).floatValue();
                m8.getClass();
                m8.g0(java.lang.Float.floatToRawIntBits(fFloatValue));
                break;
            case 2:
                m8.j0(((java.lang.Long) obj).longValue());
                break;
            case 3:
                m8.j0(((java.lang.Long) obj).longValue());
                break;
            case 4:
                m8.a0(((java.lang.Integer) obj).intValue());
                break;
            case 5:
                m8.h0(((java.lang.Long) obj).longValue());
                break;
            case 6:
                m8.g0(((java.lang.Integer) obj).intValue());
                break;
            case 7:
                m8.d0(((java.lang.Boolean) obj).booleanValue() ? 1 : 0);
                break;
            case 8:
                m8.getClass();
                byte[] bytes = ((java.lang.String) obj).getBytes("UTF-8");
                m8.i0(bytes.length);
                m8.f0(bytes);
                break;
            case 9:
                m8.getClass();
                ((p110m7.AbstractC2629b) obj).e(m8);
                break;
            case 10:
                m8.c0((p110m7.AbstractC2629b) obj);
                break;
            case 11:
                if (!(obj instanceof p110m7.AbstractC2632e)) {
                    byte[] bArr = (byte[]) obj;
                    m8.getClass();
                    m8.i0(bArr.length);
                    m8.f0(bArr);
                } else {
                    p110m7.AbstractC2632e abstractC2632e = (p110m7.AbstractC2632e) obj;
                    m8.getClass();
                    m8.i0(abstractC2632e.size());
                    m8.e0(abstractC2632e);
                }
                break;
            case 12:
                m8.i0(((java.lang.Integer) obj).intValue());
                break;
            case 13:
                if (!(obj instanceof p110m7.p)) {
                    m8.a0(((java.lang.Integer) obj).intValue());
                } else {
                    m8.a0(((p110m7.p) obj).a());
                }
                break;
            case 14:
                m8.g0(((java.lang.Integer) obj).intValue());
                break;
            case 15:
                m8.h0(((java.lang.Long) obj).longValue());
                break;
            case 16:
                int iIntValue = ((java.lang.Integer) obj).intValue();
                m8.i0((iIntValue >> 31) ^ (iIntValue << 1));
                break;
            case 17:
                long jLongValue = ((java.lang.Long) obj).longValue();
                m8.j0((jLongValue >> 63) ^ (jLongValue << 1));
                break;
        }
    }

    public final void a(p110m7.C2640m c2640m, java.lang.Object obj) {
        java.util.List arrayList;
        if (!c2640m.j) {
            throw new java.lang.IllegalArgumentException("addRepeatedField() can only be called on repeated fields.");
        }
        j(c2640m.f25496i, obj);
        p110m7.A a2 = this.f25490a;
        java.lang.Object obj2 = a2.get(c2640m);
        if (obj2 == null) {
            arrayList = new java.util.ArrayList();
            a2.put(c2640m, arrayList);
        } else {
            arrayList = (java.util.List) obj2;
        }
        arrayList.add(obj);
    }

    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final p110m7.C2636i clone() {
        p110m7.A a2;
        p110m7.C2636i c2636i = new p110m7.C2636i();
        int i3 = 0;
        while (true) {
            a2 = this.f25490a;
            if (i3 >= a2.f25443i.size()) {
                break;
            }
            java.util.Map.Entry entry = (java.util.Map.Entry) a2.f25443i.get(i3);
            c2636i.i((p110m7.C2640m) entry.getKey(), entry.getValue());
            i3++;
        }
        for (java.util.Map.Entry entry2 : a2.c()) {
            c2636i.i((p110m7.C2640m) entry2.getKey(), entry2.getValue());
        }
        return c2636i;
    }

    public final void f() {
        if (this.f25491b) {
            return;
        }
        p110m7.A a2 = this.f25490a;
        if (!a2.f25444k) {
            for (int i3 = 0; i3 < a2.f25443i.size(); i3++) {
                java.util.Map.Entry entry = (java.util.Map.Entry) a2.f25443i.get(i3);
                if (((p110m7.C2640m) entry.getKey()).j) {
                    entry.setValue(java.util.Collections.unmodifiableList((java.util.List) entry.getValue()));
                }
            }
            for (java.util.Map.Entry entry2 : a2.c()) {
                if (((p110m7.C2640m) entry2.getKey()).j) {
                    entry2.setValue(java.util.Collections.unmodifiableList((java.util.List) entry2.getValue()));
                }
            }
        }
        if (!a2.f25444k) {
            a2.j = a2.j.isEmpty() ? java.util.Collections.EMPTY_MAP : java.util.Collections.unmodifiableMap(a2.j);
            a2.f25444k = true;
        }
        this.f25491b = true;
    }

    public final void g(java.util.Map.Entry entry) {
        p110m7.C2640m c2640m = (p110m7.C2640m) entry.getKey();
        java.lang.Object value = entry.getValue();
        boolean z6 = c2640m.j;
        p110m7.A a2 = this.f25490a;
        if (z6) {
            java.lang.Object arrayList = a2.get(c2640m);
            if (arrayList == null) {
                arrayList = new java.util.ArrayList();
            }
            for (java.lang.Object obj : (java.util.List) value) {
                java.util.List list = (java.util.List) arrayList;
                if (obj instanceof byte[]) {
                    byte[] bArr = (byte[]) obj;
                    byte[] bArr2 = new byte[bArr.length];
                    java.lang.System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
                    obj = bArr2;
                }
                list.add(obj);
            }
            a2.put(c2640m, arrayList);
            return;
        }
        if (c2640m.f25496i.f25458h != p110m7.N.MESSAGE) {
            if (value instanceof byte[]) {
                byte[] bArr3 = (byte[]) value;
                byte[] bArr4 = new byte[bArr3.length];
                java.lang.System.arraycopy(bArr3, 0, bArr4, 0, bArr3.length);
                value = bArr4;
            }
            a2.put(c2640m, value);
            return;
        }
        java.lang.Object obj2 = a2.get(c2640m);
        if (obj2 != null) {
            a2.put(c2640m, ((p110m7.AbstractC2629b) obj2).d().d((p110m7.o) ((p110m7.AbstractC2629b) value)).b());
            return;
        }
        if (value instanceof byte[]) {
            byte[] bArr5 = (byte[]) value;
            byte[] bArr6 = new byte[bArr5.length];
            java.lang.System.arraycopy(bArr5, 0, bArr6, 0, bArr5.length);
            value = bArr6;
        }
        a2.put(c2640m, value);
    }

    public final void i(p110m7.C2640m c2640m, java.lang.Object obj) {
        boolean z6 = c2640m.j;
        p110m7.M m8 = c2640m.f25496i;
        if (!z6) {
            j(m8, obj);
        } else {
            if (!(obj instanceof java.util.List)) {
                throw new java.lang.IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.addAll((java.util.List) obj);
            java.util.Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                j(m8, it.next());
            }
            obj = arrayList;
        }
        this.f25490a.put(c2640m, obj);
    }

    public C2636i(int i3) {
        f();
    }
}
