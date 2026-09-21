package p076i4;

import Y6.f;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Comparator;

public final class K extends O0 implements Serializable {

    public final Comparator[] f22807h;

    public K(C2228x c2228x, C2228x c2228x2) {
        this.f22807h = new Comparator[]{c2228x, c2228x2};
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        int i3 = 0;
        while (true) {
            Comparator[] comparatorArr = this.f22807h;
            if (i3 >= comparatorArr.length) {
                return 0;
            }
            int iCompare = comparatorArr[i3].compare(obj, obj2);
            if (iCompare != 0) {
                return iCompare;
            }
            i3++;
        }
    }

    @Override
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof K) {
            return Arrays.equals(this.f22807h, ((K) obj).f22807h);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f22807h);
    }

    public final String toString() {
        return f.m(new StringBuilder("Ordering.compound("), Arrays.toString(this.f22807h), ")");
    }
}
