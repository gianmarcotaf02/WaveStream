package p014b4;

import java.util.Iterator;

public final class n extends k {

    public static final Object[] f17895p;

    public static final n f17896q;

    public final transient Object[] f17897k;

    public final transient int f17898l;

    public final transient Object[] f17899m;

    public final transient int f17900n;

    public final transient int f17901o;

    static {
        Object[] objArr = new Object[0];
        f17895p = objArr;
        f17896q = new n(0, 0, 0, objArr, objArr);
    }

    public n(int i3, int i9, int i10, Object[] objArr, Object[] objArr2) {
        this.f17897k = objArr;
        this.f17898l = i3;
        this.f17899m = objArr2;
        this.f17900n = i9;
        this.f17901o = i10;
    }

    @Override
    public final boolean contains(Object obj) {
        if (obj == null) {
            return false;
        }
        Object[] objArr = this.f17899m;
        if (objArr.length == 0) {
            return false;
        }
        int iRotateLeft = (int) (((long) Integer.rotateLeft((int) (((long) obj.hashCode()) * (-862048943)), 15)) * 461845907);
        while (true) {
            int i3 = iRotateLeft & this.f17900n;
            Object obj2 = objArr[i3];
            if (obj2 == null) {
                return false;
            }
            if (obj2.equals(obj)) {
                return true;
            }
            iRotateLeft = i3 + 1;
        }
    }

    @Override
    public final int d(Object[] objArr) {
        Object[] objArr2 = this.f17897k;
        int i3 = this.f17901o;
        System.arraycopy(objArr2, 0, objArr, 0, i3);
        return i3;
    }

    @Override
    public final int e() {
        return this.f17901o;
    }

    @Override
    public final int f() {
        return 0;
    }

    @Override
    public final int hashCode() {
        return this.f17898l;
    }

    @Override
    public final Iterator iterator() {
        return q().listIterator(0);
    }

    @Override
    public final Object[] n() {
        return this.f17897k;
    }

    @Override
    public final j r() {
        return j.p(this.f17897k, this.f17901o);
    }

    @Override
    public final int size() {
        return this.f17901o;
    }
}
