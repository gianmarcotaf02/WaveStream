package androidx.datastore.preferences.protobuf;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

public final class V extends AbstractC1495b implements RandomAccess {

    public static final V f16165k = new V(new Object[0], 0, false);

    public Object[] f16166i;
    public int j;

    public V(Object[] objArr, int i3, boolean z6) {
        this.f16181h = z6;
        this.f16166i = objArr;
        this.j = i3;
    }

    @Override
    public final boolean add(Object obj) {
        d();
        int i3 = this.j;
        Object[] objArr = this.f16166i;
        if (i3 == objArr.length) {
            this.f16166i = Arrays.copyOf(objArr, ((i3 * 3) / 2) + 1);
        }
        Object[] objArr2 = this.f16166i;
        int i9 = this.j;
        this.j = i9 + 1;
        objArr2[i9] = obj;
        ((AbstractList) this).modCount++;
        return true;
    }

    public final void e(int i3) {
        if (i3 < 0 || i3 >= this.j) {
            StringBuilder sbT = p121o0.p.t(i3, "Index:", ", Size:");
            sbT.append(this.j);
            throw new IndexOutOfBoundsException(sbT.toString());
        }
    }

    public final V f(int i3) {
        if (i3 >= this.j) {
            return new V(Arrays.copyOf(this.f16166i, i3), this.j, true);
        }
        throw new IllegalArgumentException();
    }

    @Override
    public final Object get(int i3) {
        e(i3);
        return this.f16166i[i3];
    }

    @Override
    public final Object remove(int i3) {
        d();
        e(i3);
        Object[] objArr = this.f16166i;
        Object obj = objArr[i3];
        int i9 = this.j;
        if (i3 < i9 - 1) {
            System.arraycopy(objArr, i3 + 1, objArr, i3, (i9 - i3) - 1);
        }
        this.j--;
        ((AbstractList) this).modCount++;
        return obj;
    }

    @Override
    public final Object set(int i3, Object obj) {
        d();
        e(i3);
        Object[] objArr = this.f16166i;
        Object obj2 = objArr[i3];
        objArr[i3] = obj;
        ((AbstractList) this).modCount++;
        return obj2;
    }

    @Override
    public final int size() {
        return this.j;
    }

    @Override
    public final void add(int i3, Object obj) {
        int i9;
        d();
        if (i3 >= 0 && i3 <= (i9 = this.j)) {
            Object[] objArr = this.f16166i;
            if (i9 < objArr.length) {
                System.arraycopy(objArr, i3, objArr, i3 + 1, i9 - i3);
            } else {
                Object[] objArr2 = new Object[Y6.f.c(i9, 3, 2, 1)];
                System.arraycopy(objArr, 0, objArr2, 0, i3);
                System.arraycopy(this.f16166i, i3, objArr2, i3 + 1, this.j - i3);
                this.f16166i = objArr2;
            }
            this.f16166i[i3] = obj;
            this.j++;
            ((AbstractList) this).modCount++;
            return;
        }
        StringBuilder sbT = p121o0.p.t(i3, "Index:", ", Size:");
        sbT.append(this.j);
        throw new IndexOutOfBoundsException(sbT.toString());
    }
}
