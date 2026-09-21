package p076i4;

import com.google.android.gms.internal.play_billing.AbstractC1864o0;
import java.util.Arrays;
import java.util.Objects;

public final class X0 extends AbstractC2194f0 {

    public static final X0 f22848n = new X0(0, null, new Object[0]);

    public final transient Object f22849k;

    public final transient Object[] f22850l;

    public final transient int f22851m;

    public X0(int i3, Object obj, Object[] objArr) {
        this.f22849k = obj;
        this.f22850l = objArr;
        this.f22851m = i3;
    }

    public static X0 i(int i3, Object[] objArr, C2192e0 c2192e0) {
        if (i3 == 0) {
            return f22848n;
        }
        if (i3 == 1) {
            Objects.requireNonNull(objArr[0]);
            Objects.requireNonNull(objArr[1]);
            return new X0(1, null, objArr);
        }
        AbstractC1864o0.V(i3, objArr.length >> 1);
        Object objJ = j(objArr, i3, AbstractC2214p0.r(i3), 0);
        if (objJ instanceof Object[]) {
            Object[] objArr2 = (Object[]) objJ;
            C2190d0 c2190d0 = (C2190d0) objArr2[2];
            if (c2192e0 == null) {
                throw c2190d0.a();
            }
            c2192e0.f22890c = c2190d0;
            Object obj = objArr2[0];
            int iIntValue = ((Integer) objArr2[1]).intValue();
            objArr = Arrays.copyOf(objArr, iIntValue * 2);
            objJ = obj;
            i3 = iIntValue;
        }
        return new X0(i3, objJ, objArr);
    }

    public static Object j(Object[] objArr, int i3, int i9, int i10) {
        C2190d0 c2190d0 = null;
        if (i3 == 1) {
            Objects.requireNonNull(objArr[i10]);
            Objects.requireNonNull(objArr[i10 ^ 1]);
            return null;
        }
        int i11 = i9 - 1;
        int i12 = 0;
        if (i9 <= 128) {
            byte[] bArr = new byte[i9];
            Arrays.fill(bArr, (byte) -1);
            int i13 = 0;
            while (i12 < i3) {
                int i14 = (i12 * 2) + i10;
                int i15 = (i13 * 2) + i10;
                Object obj = objArr[i14];
                Objects.requireNonNull(obj);
                Object obj2 = objArr[i14 ^ 1];
                Objects.requireNonNull(obj2);
                int iV = AbstractC2230y.v(obj.hashCode());
                while (true) {
                    int i16 = iV & i11;
                    int i17 = bArr[i16] & 255;
                    if (i17 == 255) {
                        bArr[i16] = (byte) i15;
                        if (i13 < i12) {
                            objArr[i15] = obj;
                            objArr[i15 ^ 1] = obj2;
                        }
                        i13++;
                        break;
                    }
                    if (obj.equals(objArr[i17])) {
                        int i18 = i17 ^ 1;
                        Object obj3 = objArr[i18];
                        Objects.requireNonNull(obj3);
                        c2190d0 = new C2190d0(obj, obj2, obj3);
                        objArr[i18] = obj2;
                        break;
                    }
                    iV = i16 + 1;
                }
                i12++;
            }
            return i13 == i3 ? bArr : new Object[]{bArr, Integer.valueOf(i13), c2190d0};
        }
        if (i9 <= 32768) {
            short[] sArr = new short[i9];
            Arrays.fill(sArr, (short) -1);
            int i19 = 0;
            while (i12 < i3) {
                int i20 = (i12 * 2) + i10;
                int i21 = (i19 * 2) + i10;
                Object obj4 = objArr[i20];
                Objects.requireNonNull(obj4);
                Object obj5 = objArr[i20 ^ 1];
                Objects.requireNonNull(obj5);
                int iV2 = AbstractC2230y.v(obj4.hashCode());
                while (true) {
                    int i22 = iV2 & i11;
                    int i23 = sArr[i22] & 65535;
                    if (i23 == 65535) {
                        sArr[i22] = (short) i21;
                        if (i19 < i12) {
                            objArr[i21] = obj4;
                            objArr[i21 ^ 1] = obj5;
                        }
                        i19++;
                        break;
                    }
                    if (obj4.equals(objArr[i23])) {
                        int i24 = i23 ^ 1;
                        Object obj6 = objArr[i24];
                        Objects.requireNonNull(obj6);
                        c2190d0 = new C2190d0(obj4, obj5, obj6);
                        objArr[i24] = obj5;
                        break;
                    }
                    iV2 = i22 + 1;
                }
                i12++;
            }
            return i19 == i3 ? sArr : new Object[]{sArr, Integer.valueOf(i19), c2190d0};
        }
        int[] iArr = new int[i9];
        Arrays.fill(iArr, -1);
        int i25 = 0;
        while (i12 < i3) {
            int i26 = (i12 * 2) + i10;
            int i27 = (i25 * 2) + i10;
            Object obj7 = objArr[i26];
            Objects.requireNonNull(obj7);
            Object obj8 = objArr[i26 ^ 1];
            Objects.requireNonNull(obj8);
            int iV3 = AbstractC2230y.v(obj7.hashCode());
            while (true) {
                int i28 = iV3 & i11;
                int i29 = iArr[i28];
                if (i29 == -1) {
                    iArr[i28] = i27;
                    if (i25 < i12) {
                        objArr[i27] = obj7;
                        objArr[i27 ^ 1] = obj8;
                    }
                    i25++;
                    break;
                }
                if (obj7.equals(objArr[i29])) {
                    int i30 = i29 ^ 1;
                    Object obj9 = objArr[i30];
                    Objects.requireNonNull(obj9);
                    c2190d0 = new C2190d0(obj7, obj8, obj9);
                    objArr[i30] = obj8;
                    break;
                }
                iV3 = i28 + 1;
            }
            i12++;
        }
        return i25 == i3 ? iArr : new Object[]{iArr, Integer.valueOf(i25), c2190d0};
    }

    public static Object k(Object obj, Object[] objArr, int i3, int i9, Object obj2) {
        if (obj2 == null) {
            return null;
        }
        if (i3 == 1) {
            Object obj3 = objArr[i9];
            Objects.requireNonNull(obj3);
            if (!obj3.equals(obj2)) {
                return null;
            }
            Object obj4 = objArr[i9 ^ 1];
            Objects.requireNonNull(obj4);
            return obj4;
        }
        if (obj == null) {
            return null;
        }
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            int length = bArr.length - 1;
            int iV = AbstractC2230y.v(obj2.hashCode());
            while (true) {
                int i10 = iV & length;
                int i11 = bArr[i10] & 255;
                if (i11 == 255) {
                    return null;
                }
                if (obj2.equals(objArr[i11])) {
                    return objArr[i11 ^ 1];
                }
                iV = i10 + 1;
            }
        } else if (obj instanceof short[]) {
            short[] sArr = (short[]) obj;
            int length2 = sArr.length - 1;
            int iV2 = AbstractC2230y.v(obj2.hashCode());
            while (true) {
                int i12 = iV2 & length2;
                int i13 = sArr[i12] & 65535;
                if (i13 == 65535) {
                    return null;
                }
                if (obj2.equals(objArr[i13])) {
                    return objArr[i13 ^ 1];
                }
                iV2 = i12 + 1;
            }
        } else {
            int[] iArr = (int[]) obj;
            int length3 = iArr.length - 1;
            int iV3 = AbstractC2230y.v(obj2.hashCode());
            while (true) {
                int i14 = iV3 & length3;
                int i15 = iArr[i14];
                if (i15 == -1) {
                    return null;
                }
                if (obj2.equals(objArr[i15])) {
                    return objArr[i15 ^ 1];
                }
                iV3 = i14 + 1;
            }
        }
    }

    @Override
    public final U0 b() {
        return new U0(this, this.f22850l, 0, this.f22851m);
    }

    @Override
    public final V0 c() {
        return new V0(this, new W0(this.f22850l, 0, this.f22851m));
    }

    @Override
    public final W d() {
        return new W0(this.f22850l, 1, this.f22851m);
    }

    @Override
    public final Object get(Object obj) {
        Object objK = k(this.f22849k, this.f22850l, this.f22851m, 0, obj);
        if (objK == null) {
            return null;
        }
        return objK;
    }

    @Override
    public final int size() {
        return this.f22851m;
    }
}
