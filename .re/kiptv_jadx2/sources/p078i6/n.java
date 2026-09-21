package p078i6;

import java.util.RandomAccess;
import kotlin.jvm.internal.m;

public final class n extends AbstractC2254e implements RandomAccess {

    public final int[] f23203h;

    public n(int[] iArr) {
        this.f23203h = iArr;
    }

    @Override
    public final boolean contains(Object obj) {
        if (!(obj instanceof Integer)) {
            return false;
        }
        return m.V(this.f23203h, ((Number) obj).intValue());
    }

    @Override
    public final int d() {
        return this.f23203h.length;
    }

    @Override
    public final Object get(int i3) {
        return Integer.valueOf(this.f23203h[i3]);
    }

    @Override
    public final int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int iIntValue = ((Number) obj).intValue();
        int[] iArr = this.f23203h;
        m.e(iArr, "<this>");
        int length = iArr.length;
        for (int i3 = 0; i3 < length; i3++) {
            if (iIntValue == iArr[i3]) {
                return i3;
            }
        }
        return -1;
    }

    @Override
    public final boolean isEmpty() {
        return this.f23203h.length == 0;
    }

    @Override
    public final int lastIndexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int iIntValue = ((Number) obj).intValue();
        int[] iArr = this.f23203h;
        m.e(iArr, "<this>");
        int length = iArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i3 = length - 1;
                if (iIntValue == iArr[length]) {
                    return length;
                }
                if (i3 >= 0) {
                    length = i3;
                }
            }
        }
        return -1;
    }
}
