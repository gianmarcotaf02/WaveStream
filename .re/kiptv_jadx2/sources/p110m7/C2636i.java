package p110m7;

import Z2.M;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public final class C2636i {

    public static final C2636i f25489c = new C2636i(0);

    public final A f25490a = new A(16);

    public boolean f25491b;

    public C2636i() {
    }

    public static int c(M m8, Object obj) {
        switch (m8.ordinal()) {
            case 0:
                ((Double) obj).getClass();
                return 8;
            case 1:
                ((Float) obj).getClass();
                return 4;
            case 2:
                return M.r(((Long) obj).longValue());
            case 3:
                return M.r(((Long) obj).longValue());
            case 4:
                return M.n(((Integer) obj).intValue());
            case 5:
                ((Long) obj).getClass();
                return 8;
            case 6:
                ((Integer) obj).getClass();
                return 4;
            case 7:
                ((Boolean) obj).getClass();
                return 1;
            case 8:
                try {
                    byte[] bytes = ((String) obj).getBytes("UTF-8");
                    return M.q(bytes.length) + bytes.length;
                } catch (UnsupportedEncodingException e6) {
                    throw new RuntimeException("UTF-8 not supported.", e6);
                }
            case 9:
                return ((AbstractC2629b) obj).b();
            case 10:
                return M.p((AbstractC2629b) obj);
            case 11:
                if (obj instanceof AbstractC2632e) {
                    AbstractC2632e abstractC2632e = (AbstractC2632e) obj;
                    return abstractC2632e.size() + M.q(abstractC2632e.size());
                }
                byte[] bArr = (byte[]) obj;
                return M.q(bArr.length) + bArr.length;
            case 12:
                return M.q(((Integer) obj).intValue());
            case 13:
                return obj instanceof p ? M.n(((p) obj).a()) : M.n(((Integer) obj).intValue());
            case 14:
                ((Integer) obj).getClass();
                return 4;
            case 15:
                ((Long) obj).getClass();
                return 8;
            case 16:
                int iIntValue = ((Integer) obj).intValue();
                return M.q((iIntValue >> 31) ^ (iIntValue << 1));
            case 17:
                long jLongValue = ((Long) obj).longValue();
                return M.r((jLongValue >> 63) ^ (jLongValue << 1));
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    public static int d(C2640m c2640m, Object obj) {
        M m8 = c2640m.f25496i;
        boolean z6 = c2640m.j;
        int i3 = c2640m.f25495h;
        if (!z6) {
            int iS = M.s(i3);
            if (m8 == M.f25454l) {
                iS *= 2;
            }
            return c(m8, obj) + iS;
        }
        int iC = 0;
        for (Object obj2 : (List) obj) {
            int iS2 = M.s(i3);
            if (m8 == M.f25454l) {
                iS2 *= 2;
            }
            iC += c(m8, obj2) + iS2;
        }
        return iC;
    }

    public static boolean e(Map.Entry entry) {
        C2640m c2640m = (C2640m) entry.getKey();
        if (c2640m.f25496i.f25458h != N.MESSAGE) {
            return true;
        }
        if (!c2640m.j) {
            Object value = entry.getValue();
            if (value instanceof AbstractC2629b) {
                return ((AbstractC2629b) value).isInitialized();
            }
            throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
        }
        Iterator it = ((List) entry.getValue()).iterator();
        while (it.hasNext()) {
            if (!((AbstractC2629b) it.next()).isInitialized()) {
                return false;
            }
        }
        return true;
    }

    public static Object h(C2633f c2633f, M m8) {
        switch (m8.ordinal()) {
            case 0:
                return Double.valueOf(Double.longBitsToDouble(c2633f.j()));
            case 1:
                return Float.valueOf(Float.intBitsToFloat(c2633f.i()));
            case 2:
                return Long.valueOf(c2633f.l());
            case 3:
                return Long.valueOf(c2633f.l());
            case 4:
                return Integer.valueOf(c2633f.k());
            case 5:
                return Long.valueOf(c2633f.j());
            case 6:
                return Integer.valueOf(c2633f.i());
            case 7:
                return Boolean.valueOf(c2633f.l() != 0);
            case 8:
                int iK = c2633f.k();
                int i3 = c2633f.f25478b;
                int i9 = c2633f.f25480d;
                if (iK > i3 - i9 || iK <= 0) {
                    return iK == 0 ? "" : new String(c2633f.h(iK), "UTF-8");
                }
                String str = new String(c2633f.f25477a, i9, iK, "UTF-8");
                c2633f.f25480d += iK;
                return str;
            case 9:
                throw new IllegalArgumentException("readPrimitiveField() cannot handle nested groups.");
            case 10:
                throw new IllegalArgumentException("readPrimitiveField() cannot handle embedded messages.");
            case 11:
                return c2633f.e();
            case 12:
                return Integer.valueOf(c2633f.k());
            case 13:
                throw new IllegalArgumentException("readPrimitiveField() cannot handle enums.");
            case 14:
                return Integer.valueOf(c2633f.i());
            case 15:
                return Long.valueOf(c2633f.j());
            case 16:
                int iK2 = c2633f.k();
                return Integer.valueOf((-(iK2 & 1)) ^ (iK2 >>> 1));
            case 17:
                long jL = c2633f.l();
                return Long.valueOf((-(jL & 1)) ^ (jL >>> 1));
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    public static void j(M m8, Object obj) {
        obj.getClass();
        boolean z6 = true;
        boolean z9 = false;
        switch (m8.f25458h) {
            case INT:
                z9 = obj instanceof Integer;
                break;
            case LONG:
                z9 = obj instanceof Long;
                break;
            case FLOAT:
                z9 = obj instanceof Float;
                break;
            case DOUBLE:
                z9 = obj instanceof Double;
                break;
            case BOOLEAN:
                z9 = obj instanceof Boolean;
                break;
            case STRING:
                z9 = obj instanceof String;
                break;
            case BYTE_STRING:
                if (!(obj instanceof AbstractC2632e) && !(obj instanceof byte[])) {
                    z6 = false;
                }
                z9 = z6;
                break;
            case ENUM:
                if (!(obj instanceof Integer) && !(obj instanceof p)) {
                    z6 = false;
                }
                z9 = z6;
                break;
            case MESSAGE:
                z9 = obj instanceof AbstractC2629b;
                break;
        }
        if (!z9) {
            throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
        }
    }

    public static void k(M m8, M m9, Object obj) {
        switch (m9.ordinal()) {
            case 0:
                double dDoubleValue = ((Double) obj).doubleValue();
                m8.getClass();
                m8.h0(Double.doubleToRawLongBits(dDoubleValue));
                break;
            case 1:
                float fFloatValue = ((Float) obj).floatValue();
                m8.getClass();
                m8.g0(Float.floatToRawIntBits(fFloatValue));
                break;
            case 2:
                m8.j0(((Long) obj).longValue());
                break;
            case 3:
                m8.j0(((Long) obj).longValue());
                break;
            case 4:
                m8.a0(((Integer) obj).intValue());
                break;
            case 5:
                m8.h0(((Long) obj).longValue());
                break;
            case 6:
                m8.g0(((Integer) obj).intValue());
                break;
            case 7:
                m8.d0(((Boolean) obj).booleanValue() ? 1 : 0);
                break;
            case 8:
                m8.getClass();
                byte[] bytes = ((String) obj).getBytes("UTF-8");
                m8.i0(bytes.length);
                m8.f0(bytes);
                break;
            case 9:
                m8.getClass();
                ((AbstractC2629b) obj).e(m8);
                break;
            case 10:
                m8.c0((AbstractC2629b) obj);
                break;
            case 11:
                if (!(obj instanceof AbstractC2632e)) {
                    byte[] bArr = (byte[]) obj;
                    m8.getClass();
                    m8.i0(bArr.length);
                    m8.f0(bArr);
                } else {
                    AbstractC2632e abstractC2632e = (AbstractC2632e) obj;
                    m8.getClass();
                    m8.i0(abstractC2632e.size());
                    m8.e0(abstractC2632e);
                }
                break;
            case 12:
                m8.i0(((Integer) obj).intValue());
                break;
            case 13:
                if (!(obj instanceof p)) {
                    m8.a0(((Integer) obj).intValue());
                } else {
                    m8.a0(((p) obj).a());
                }
                break;
            case 14:
                m8.g0(((Integer) obj).intValue());
                break;
            case 15:
                m8.h0(((Long) obj).longValue());
                break;
            case 16:
                int iIntValue = ((Integer) obj).intValue();
                m8.i0((iIntValue >> 31) ^ (iIntValue << 1));
                break;
            case 17:
                long jLongValue = ((Long) obj).longValue();
                m8.j0((jLongValue >> 63) ^ (jLongValue << 1));
                break;
        }
    }

    public final void a(C2640m c2640m, Object obj) {
        List arrayList;
        if (!c2640m.j) {
            throw new IllegalArgumentException("addRepeatedField() can only be called on repeated fields.");
        }
        j(c2640m.f25496i, obj);
        A a2 = this.f25490a;
        Object obj2 = a2.get(c2640m);
        if (obj2 == null) {
            arrayList = new ArrayList();
            a2.put(c2640m, arrayList);
        } else {
            arrayList = (List) obj2;
        }
        arrayList.add(obj);
    }

    public final C2636i clone() {
        A a2;
        C2636i c2636i = new C2636i();
        int i3 = 0;
        while (true) {
            a2 = this.f25490a;
            if (i3 >= a2.f25443i.size()) {
                break;
            }
            Map.Entry entry = (Map.Entry) a2.f25443i.get(i3);
            c2636i.i((C2640m) entry.getKey(), entry.getValue());
            i3++;
        }
        for (Map.Entry entry2 : a2.c()) {
            c2636i.i((C2640m) entry2.getKey(), entry2.getValue());
        }
        return c2636i;
    }

    public final void f() {
        if (this.f25491b) {
            return;
        }
        A a2 = this.f25490a;
        if (!a2.f25444k) {
            for (int i3 = 0; i3 < a2.f25443i.size(); i3++) {
                Map.Entry entry = (Map.Entry) a2.f25443i.get(i3);
                if (((C2640m) entry.getKey()).j) {
                    entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                }
            }
            for (Map.Entry entry2 : a2.c()) {
                if (((C2640m) entry2.getKey()).j) {
                    entry2.setValue(Collections.unmodifiableList((List) entry2.getValue()));
                }
            }
        }
        if (!a2.f25444k) {
            a2.j = a2.j.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(a2.j);
            a2.f25444k = true;
        }
        this.f25491b = true;
    }

    public final void g(Map.Entry entry) {
        C2640m c2640m = (C2640m) entry.getKey();
        Object value = entry.getValue();
        boolean z6 = c2640m.j;
        A a2 = this.f25490a;
        if (z6) {
            Object arrayList = a2.get(c2640m);
            if (arrayList == null) {
                arrayList = new ArrayList();
            }
            for (Object obj : (List) value) {
                List list = (List) arrayList;
                if (obj instanceof byte[]) {
                    byte[] bArr = (byte[]) obj;
                    byte[] bArr2 = new byte[bArr.length];
                    System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
                    obj = bArr2;
                }
                list.add(obj);
            }
            a2.put(c2640m, arrayList);
            return;
        }
        if (c2640m.f25496i.f25458h != N.MESSAGE) {
            if (value instanceof byte[]) {
                byte[] bArr3 = (byte[]) value;
                byte[] bArr4 = new byte[bArr3.length];
                System.arraycopy(bArr3, 0, bArr4, 0, bArr3.length);
                value = bArr4;
            }
            a2.put(c2640m, value);
            return;
        }
        Object obj2 = a2.get(c2640m);
        if (obj2 != null) {
            a2.put(c2640m, ((AbstractC2629b) obj2).d().d((o) ((AbstractC2629b) value)).b());
            return;
        }
        if (value instanceof byte[]) {
            byte[] bArr5 = (byte[]) value;
            byte[] bArr6 = new byte[bArr5.length];
            System.arraycopy(bArr5, 0, bArr6, 0, bArr5.length);
            value = bArr6;
        }
        a2.put(c2640m, value);
    }

    public final void i(C2640m c2640m, Object obj) {
        boolean z6 = c2640m.j;
        M m8 = c2640m.f25496i;
        if (!z6) {
            j(m8, obj);
        } else {
            if (!(obj instanceof List)) {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
            ArrayList arrayList = new ArrayList();
            arrayList.addAll((List) obj);
            Iterator it = arrayList.iterator();
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
