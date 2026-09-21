package p078i6;

import com.google.android.gms.internal.play_billing.M0;
import java.util.Arrays;
import java.util.Iterator;
import java.util.RandomAccess;
import kotlin.jvm.internal.m;
import p121o0.p;

public final class H extends AbstractC2254e implements RandomAccess {

    public final Object[] f23181h;

    public final int f23182i;
    public int j;

    public int f23183k;

    public H(Object[] objArr, int i3) {
        this.f23181h = objArr;
        if (i3 < 0) {
            throw new IllegalArgumentException(M0.l(i3, "ring buffer filled size should not be negative but it is ").toString());
        }
        if (i3 <= objArr.length) {
            this.f23182i = objArr.length;
            this.f23183k = i3;
        } else {
            StringBuilder sbT = p.t(i3, "ring buffer filled size: ", " cannot be larger than the buffer size: ");
            sbT.append(objArr.length);
            throw new IllegalArgumentException(sbT.toString().toString());
        }
    }

    @Override
    public final int d() {
        return this.f23183k;
    }

    public final void e(int i3) {
        if (i3 < 0) {
            throw new IllegalArgumentException(M0.l(i3, "n shouldn't be negative but it is ").toString());
        }
        if (i3 > this.f23183k) {
            StringBuilder sbT = p.t(i3, "n shouldn't be greater than the buffer size: n = ", ", size = ");
            sbT.append(this.f23183k);
            throw new IllegalArgumentException(sbT.toString().toString());
        }
        if (i3 > 0) {
            int i9 = this.j;
            int i10 = this.f23182i;
            int i11 = (i9 + i3) % i10;
            Object[] objArr = this.f23181h;
            if (i9 > i11) {
                Arrays.fill(objArr, i9, i10, (Object) null);
                Arrays.fill(objArr, 0, i11, (Object) null);
            } else {
                Arrays.fill(objArr, i9, i11, (Object) null);
            }
            this.j = i11;
            this.f23183k -= i3;
        }
    }

    @Override
    public final Object get(int i3) {
        int iD = d();
        if (i3 < 0 || i3 >= iD) {
            throw new IndexOutOfBoundsException(M0.k(i3, iD, "index: ", ", size: "));
        }
        return this.f23181h[(this.j + i3) % this.f23182i];
    }

    @Override
    public final Iterator iterator() {
        return new G(this);
    }

    @Override
    public final Object[] toArray() {
        return toArray(new Object[d()]);
    }

    @Override
    public final Object[] toArray(Object[] array) {
        Object[] objArr;
        m.e(array, "array");
        int length = array.length;
        int i3 = this.f23183k;
        if (length < i3) {
            array = Arrays.copyOf(array, i3);
            m.d(array, "copyOf(...)");
        }
        int i9 = this.f23183k;
        int i10 = this.j;
        int i11 = 0;
        int i12 = 0;
        while (true) {
            objArr = this.f23181h;
            if (i12 >= i9 || i10 >= this.f23182i) {
                break;
            }
            array[i12] = objArr[i10];
            i12++;
            i10++;
        }
        while (i12 < i9) {
            array[i12] = objArr[i11];
            i12++;
            i11++;
        }
        if (i9 < array.length) {
            array[i9] = null;
        }
        return array;
    }
}
