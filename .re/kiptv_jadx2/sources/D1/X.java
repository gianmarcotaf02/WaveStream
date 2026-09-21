package D1;

import android.view.View;
import android.view.ViewGroup;
import java.util.Iterator;
import java.util.NoSuchElementException;
import p078i6.AbstractC2254e;
import p153r8.C2713y;

public class X implements Iterator, p201y6.a {

    public final int f1987h;

    public int f1988i;
    public final Object j;

    public X(int i3, Object obj) {
        this.f1987h = i3;
        this.j = obj;
    }

    @Override
    public final boolean hasNext() {
        switch (this.f1987h) {
            case 0:
                return this.f1988i < ((ViewGroup) this.j).getChildCount();
            case 1:
                return this.f1988i < ((byte[]) this.j).length;
            case 2:
                return this.f1988i < ((int[]) this.j).length;
            case 3:
                return this.f1988i < ((long[]) this.j).length;
            case 4:
                return this.f1988i < ((short[]) this.j).length;
            case 5:
                return this.f1988i < ((AbstractC2254e) this.j).d();
            case 6:
                return this.f1988i < ((Object[]) this.j).length;
            case 7:
                return this.f1988i > 0;
            default:
                return this.f1988i < ((p136q.T) this.j).g();
        }
    }

    @Override
    public final Object next() {
        switch (this.f1987h) {
            case 0:
                int i3 = this.f1988i;
                this.f1988i = i3 + 1;
                View childAt = ((ViewGroup) this.j).getChildAt(i3);
                if (childAt != null) {
                    return childAt;
                }
                throw new IndexOutOfBoundsException();
            case 1:
                int i9 = this.f1988i;
                byte[] bArr = (byte[]) this.j;
                if (i9 >= bArr.length) {
                    throw new NoSuchElementException(String.valueOf(this.f1988i));
                }
                this.f1988i = i9 + 1;
                return new p070h6.r(bArr[i9]);
            case 2:
                int i10 = this.f1988i;
                int[] iArr = (int[]) this.j;
                if (i10 >= iArr.length) {
                    throw new NoSuchElementException(String.valueOf(this.f1988i));
                }
                this.f1988i = i10 + 1;
                return new p070h6.t(iArr[i10]);
            case 3:
                int i11 = this.f1988i;
                long[] jArr = (long[]) this.j;
                if (i11 >= jArr.length) {
                    throw new NoSuchElementException(String.valueOf(this.f1988i));
                }
                this.f1988i = i11 + 1;
                return new p070h6.v(jArr[i11]);
            case 4:
                int i12 = this.f1988i;
                short[] sArr = (short[]) this.j;
                if (i12 >= sArr.length) {
                    throw new NoSuchElementException(String.valueOf(this.f1988i));
                }
                this.f1988i = i12 + 1;
                return new p070h6.y(sArr[i12]);
            case 5:
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                int i13 = this.f1988i;
                this.f1988i = i13 + 1;
                return ((AbstractC2254e) this.j).get(i13);
            case 6:
                try {
                    Object[] objArr = (Object[]) this.j;
                    int i14 = this.f1988i;
                    this.f1988i = i14 + 1;
                    return objArr[i14];
                } catch (ArrayIndexOutOfBoundsException e6) {
                    this.f1988i--;
                    throw new NoSuchElementException(e6.getMessage());
                }
            case 7:
                C2713y c2713y = (C2713y) this.j;
                int i15 = this.f1988i;
                this.f1988i = i15 - 1;
                return c2713y.f26949e[c2713y.f26947c - i15];
            default:
                int i16 = this.f1988i;
                this.f1988i = i16 + 1;
                return ((p136q.T) this.j).h(i16);
        }
    }

    @Override
    public final void remove() {
        switch (this.f1987h) {
            case 0:
                int i3 = this.f1988i - 1;
                this.f1988i = i3;
                ((ViewGroup) this.j).removeViewAt(i3);
                return;
            case 1:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 2:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 3:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 4:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 5:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 6:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 7:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public X(Object[] array) {
        this.f1987h = 6;
        kotlin.jvm.internal.m.e(array, "array");
        this.j = array;
    }

    public X(C2713y c2713y) {
        this.f1987h = 7;
        this.j = c2713y;
        this.f1988i = c2713y.f26947c;
    }
}
