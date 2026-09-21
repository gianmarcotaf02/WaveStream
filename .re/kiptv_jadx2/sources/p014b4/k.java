package p014b4;

import com.google.android.gms.internal.play_billing.M0;
import java.util.Arrays;
import java.util.Objects;
import java.util.Set;

public abstract class k extends f implements Set {
    public static final int j = 0;

    public transient j f17890i;

    public static k o(Object[] objArr, int i3) {
        if (i3 == 0) {
            return n.f17896q;
        }
        if (i3 == 1) {
            Object obj = objArr[0];
            Objects.requireNonNull(obj);
            return new o(obj);
        }
        int iP = p(i3);
        Object[] objArr2 = new Object[iP];
        int i9 = iP - 1;
        int i10 = 0;
        int i11 = 0;
        for (int i12 = 0; i12 < i3; i12++) {
            Object obj2 = objArr[i12];
            if (obj2 == null) {
                throw new NullPointerException(M0.l(i12, "at index "));
            }
            int iHashCode = obj2.hashCode();
            int iRotateLeft = (int) (((long) Integer.rotateLeft((int) (((long) iHashCode) * (-862048943)), 15)) * 461845907);
            while (true) {
                int i13 = iRotateLeft & i9;
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
                iRotateLeft++;
            }
        }
        Arrays.fill(objArr, i11, i3, (Object) null);
        if (i11 == 1) {
            Object obj4 = objArr[0];
            Objects.requireNonNull(obj4);
            return new o(obj4);
        }
        if (p(i11) < iP / 2) {
            return o(objArr, i11);
        }
        if (i11 <= 0) {
            objArr = Arrays.copyOf(objArr, i11);
        }
        return new n(i10, i9, i11, objArr, objArr2);
    }

    public static int p(int i3) {
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

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof k) && (this instanceof n)) {
            k kVar = (k) obj;
            kVar.getClass();
            if (kVar instanceof n) {
                if (((n) this).f17898l != obj.hashCode()) {
                    return false;
                }
            }
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Set)) {
            return false;
        }
        Set set = (Set) obj;
        try {
            return size() == set.size() && containsAll(set);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    public j q() {
        j jVar = this.f17890i;
        if (jVar != null) {
            return jVar;
        }
        j jVarR = r();
        this.f17890i = jVarR;
        return jVarR;
    }

    public j r() {
        Object[] array = toArray(f.f17883h);
        g gVar = j.f17889i;
        return j.p(array, array.length);
    }
}
