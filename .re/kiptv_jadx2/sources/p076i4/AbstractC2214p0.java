package p076i4;

import com.google.android.gms.internal.play_billing.AbstractC1864o0;
import com.google.android.gms.internal.play_billing.M0;
import java.util.Arrays;
import java.util.Collection;
import java.util.Objects;
import java.util.Set;
import java.util.SortedSet;

public abstract class AbstractC2214p0 extends W implements Set {
    public static final int j = 0;

    public transient AbstractC2186b0 f22928i;

    public static int r(int i3) {
        int iMax = Math.max(i3, 2);
        if (iMax >= 751619276) {
            AbstractC1864o0.M(iMax < 1073741824, "collection too large");
            return 1073741824;
        }
        int iHighestOneBit = Integer.highestOneBit(iMax - 1) << 1;
        while (((double) iHighestOneBit) * 0.7d < iMax) {
            iHighestOneBit <<= 1;
        }
        return iHighestOneBit;
    }

    public static AbstractC2214p0 s(Object[] objArr, int i3) {
        if (i3 == 0) {
            return Z0.f22857q;
        }
        if (i3 == 1) {
            Object obj = objArr[0];
            Objects.requireNonNull(obj);
            return new f1(obj);
        }
        int iR = r(i3);
        Object[] objArr2 = new Object[iR];
        int i9 = iR - 1;
        int i10 = 0;
        int i11 = 0;
        for (int i12 = 0; i12 < i3; i12++) {
            Object obj2 = objArr[i12];
            if (obj2 == null) {
                throw new NullPointerException(M0.l(i12, "at index "));
            }
            int iHashCode = obj2.hashCode();
            int iV = AbstractC2230y.v(iHashCode);
            while (true) {
                int i13 = iV & i9;
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
                iV++;
            }
        }
        Arrays.fill(objArr, i11, i3, (Object) null);
        if (i11 == 1) {
            Object obj4 = objArr[0];
            Objects.requireNonNull(obj4);
            return new f1(obj4);
        }
        if (r(i11) < iR / 2) {
            return s(objArr, i11);
        }
        int length = objArr.length;
        if (i11 < (length >> 1) + (length >> 2)) {
            objArr = Arrays.copyOf(objArr, i11);
        }
        return new Z0(i10, i9, i11, objArr, objArr2);
    }

    public static AbstractC2214p0 t(Collection collection) {
        if ((collection instanceof AbstractC2214p0) && !(collection instanceof SortedSet)) {
            AbstractC2214p0 abstractC2214p0 = (AbstractC2214p0) collection;
            if (!abstractC2214p0.p()) {
                return abstractC2214p0;
            }
        }
        Object[] array = collection.toArray();
        return s(array, array.length);
    }

    public static AbstractC2214p0 v(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object... objArr) {
        AbstractC1864o0.M(objArr.length <= 2147483641, "the total number of elements must fit in an int");
        int length = objArr.length + 6;
        Object[] objArr2 = new Object[length];
        objArr2[0] = obj;
        objArr2[1] = obj2;
        objArr2[2] = obj3;
        objArr2[3] = obj4;
        objArr2[4] = obj5;
        objArr2[5] = obj6;
        System.arraycopy(objArr, 0, objArr2, 6, objArr.length);
        return s(objArr2, length);
    }

    @Override
    public AbstractC2186b0 d() {
        AbstractC2186b0 abstractC2186b0 = this.f22928i;
        if (abstractC2186b0 != null) {
            return abstractC2186b0;
        }
        AbstractC2186b0 abstractC2186b0U = u();
        this.f22928i = abstractC2186b0U;
        return abstractC2186b0U;
    }

    @Override
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof AbstractC2214p0) && (this instanceof Z0)) {
            AbstractC2214p0 abstractC2214p0 = (AbstractC2214p0) obj;
            abstractC2214p0.getClass();
            if ((abstractC2214p0 instanceof Z0) && hashCode() != obj.hashCode()) {
                return false;
            }
        }
        return AbstractC2230y.i(this, obj);
    }

    @Override
    public int hashCode() {
        return AbstractC2230y.n(this);
    }

    public AbstractC2186b0 u() {
        Object[] array = toArray(W.f22843h);
        Z z6 = AbstractC2186b0.f22868i;
        return AbstractC2186b0.r(array, array.length);
    }
}
