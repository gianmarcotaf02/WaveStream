package com.google.android.gms.internal.cast;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;

public abstract class AbstractC1728c0 extends X implements Set {
    public static final int j = 0;

    public transient AbstractC1720a0 f18880i;

    public static int o(int i3) {
        int iMax = Math.max(i3, 2);
        if (iMax >= 751619276) {
            if (iMax < 1073741824) {
                return 1073741824;
            }
            throw new IllegalArgumentException("collection too large");
        }
        int iHighestOneBit = Integer.highestOneBit(iMax - 1);
        do {
            iHighestOneBit += iHighestOneBit;
        } while (((double) iHighestOneBit) * 0.7d < iMax);
        return iHighestOneBit;
    }

    public static AbstractC1728c0 p(Object[] objArr, int i3) {
        if (i3 == 0) {
            return C1760k0.f18940q;
        }
        if (i3 == 1) {
            Object obj = objArr[0];
            Objects.requireNonNull(obj);
            return new C1764l0(obj);
        }
        int iO = o(i3);
        Object[] objArr2 = new Object[iO];
        int i9 = iO - 1;
        int i10 = 0;
        int i11 = 0;
        for (int i12 = 0; i12 < i3; i12++) {
            Object obj2 = objArr[i12];
            if (obj2 == null) {
                throw new NullPointerException(com.google.android.gms.internal.play_billing.M0.l(i12, "at index "));
            }
            int iHashCode = obj2.hashCode();
            int iB = H.b(iHashCode);
            while (true) {
                int i13 = iB & i9;
                Object obj3 = objArr2[i13];
                if (obj3 == null) {
                    objArr[i11] = obj2;
                    objArr2[i13] = obj2;
                    i10 += iHashCode;
                    i11++;
                    break;
                }
                if (obj3.equals(obj2)) {
                    break;
                }
                iB++;
            }
        }
        Arrays.fill(objArr, i11, i3, (Object) null);
        if (i11 == 1) {
            Object obj4 = objArr[0];
            Objects.requireNonNull(obj4);
            return new C1764l0(obj4);
        }
        if (o(i11) < iO / 2) {
            return p(objArr, i11);
        }
        int length = objArr.length;
        if (i11 < (length >> 1) + (length >> 2)) {
            objArr = Arrays.copyOf(objArr, i11);
        }
        return new C1760k0(i10, i9, i11, objArr, objArr2);
    }

    @Override
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof AbstractC1728c0) && (this instanceof C1760k0)) {
            AbstractC1728c0 abstractC1728c0 = (AbstractC1728c0) obj;
            abstractC1728c0.getClass();
            if ((abstractC1728c0 instanceof C1760k0) && hashCode() != obj.hashCode()) {
                return false;
            }
        }
        if (obj == this) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            try {
                return size() == set.size() && containsAll(set);
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    @Override
    public int hashCode() {
        Iterator it = iterator();
        int iHashCode = 0;
        while (it.hasNext()) {
            Object next = it.next();
            iHashCode += next != null ? next.hashCode() : 0;
        }
        return iHashCode;
    }
}
