package p038e0;

import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;
import kotlin.jvm.internal.m;
import p078i6.p;

public final class e implements RandomAccess {

    public Object[] f21324h;

    public b f21325i;
    public int j = 0;

    public e(Object[] objArr) {
        this.f21324h = objArr;
    }

    public final void b(int i3, Object obj) {
        int i9 = this.j + 1;
        if (this.f21324h.length < i9) {
            o(i9);
        }
        Object[] objArr = this.f21324h;
        int i10 = this.j;
        if (i3 != i10) {
            System.arraycopy(objArr, i3, objArr, i3 + 1, i10 - i3);
        }
        objArr[i3] = obj;
        this.j++;
    }

    public final void c(Object obj) {
        int i3 = this.j + 1;
        if (this.f21324h.length < i3) {
            o(i3);
        }
        Object[] objArr = this.f21324h;
        int i9 = this.j;
        objArr[i9] = obj;
        this.j = i9 + 1;
    }

    public final void d(int i3, e eVar) {
        int i9 = eVar.j;
        if (i9 == 0) {
            return;
        }
        int i10 = this.j + i9;
        if (this.f21324h.length < i10) {
            o(i10);
        }
        Object[] objArr = this.f21324h;
        int i11 = this.j;
        if (i3 != i11) {
            System.arraycopy(objArr, i3, objArr, i3 + i9, i11 - i3);
        }
        System.arraycopy(eVar.f21324h, 0, objArr, i3, i9);
        this.j += i9;
    }

    public final void e(int i3, List list) {
        if (list.isEmpty()) {
            return;
        }
        int size = list.size();
        int i9 = this.j + size;
        if (this.f21324h.length < i9) {
            o(i9);
        }
        Object[] objArr = this.f21324h;
        int i10 = this.j;
        if (i3 != i10) {
            System.arraycopy(objArr, i3, objArr, i3 + size, i10 - i3);
        }
        int size2 = list.size();
        for (int i11 = 0; i11 < size2; i11++) {
            objArr[i3 + i11] = list.get(i11);
        }
        this.j += size;
    }

    public final boolean f(int i3, Collection collection) {
        int i9 = 0;
        if (collection.isEmpty()) {
            return false;
        }
        int size = collection.size();
        int i10 = this.j + size;
        if (this.f21324h.length < i10) {
            o(i10);
        }
        Object[] objArr = this.f21324h;
        int i11 = this.j;
        if (i3 != i11) {
            System.arraycopy(objArr, i3, objArr, i3 + size, i11 - i3);
        }
        for (Object obj : collection) {
            int i12 = i9 + 1;
            if (i9 < 0) {
                p.H0();
                throw null;
            }
            objArr[i9 + i3] = obj;
            i9 = i12;
        }
        this.j += size;
        return true;
    }

    public final List h() {
        b bVar = this.f21325i;
        if (bVar != null) {
            return bVar;
        }
        b bVar2 = new b(this);
        this.f21325i = bVar2;
        return bVar2;
    }

    public final void i() {
        Object[] objArr = this.f21324h;
        int i3 = this.j;
        for (int i9 = 0; i9 < i3; i9++) {
            objArr[i9] = null;
        }
        this.j = 0;
    }

    public final boolean j(Object obj) {
        int i3 = this.j - 1;
        if (i3 >= 0) {
            for (int i9 = 0; !m.a(this.f21324h[i9], obj); i9++) {
                if (i9 != i3) {
                }
            }
            return true;
        }
        return false;
    }

    public final int k(Object obj) {
        Object[] objArr = this.f21324h;
        int i3 = this.j;
        for (int i9 = 0; i9 < i3; i9++) {
            if (m.a(obj, objArr[i9])) {
                return i9;
            }
        }
        return -1;
    }

    public final boolean l(Object obj) {
        int iK = k(obj);
        if (iK < 0) {
            return false;
        }
        m(iK);
        return true;
    }

    public final Object m(int i3) {
        Object[] objArr = this.f21324h;
        Object obj = objArr[i3];
        int i9 = this.j;
        if (i3 != i9 - 1) {
            int i10 = i3 + 1;
            System.arraycopy(objArr, i10, objArr, i3, i9 - i10);
        }
        int i11 = this.j - 1;
        this.j = i11;
        objArr[i11] = null;
        return obj;
    }

    public final void n(int i3, int i9) {
        if (i9 > i3) {
            int i10 = this.j;
            if (i9 < i10) {
                Object[] objArr = this.f21324h;
                System.arraycopy(objArr, i9, objArr, i3, i10 - i9);
            }
            int i11 = this.j;
            int i12 = i11 - (i9 - i3);
            int i13 = i11 - 1;
            if (i12 <= i13) {
                int i14 = i12;
                while (true) {
                    this.f21324h[i14] = null;
                    if (i14 == i13) {
                        break;
                    } else {
                        i14++;
                    }
                }
            }
            this.j = i12;
        }
    }

    public final void o(int i3) {
        Object[] objArr = this.f21324h;
        int length = objArr.length;
        Object[] objArr2 = new Object[Math.max(i3, length * 2)];
        System.arraycopy(objArr, 0, objArr2, 0, length);
        this.f21324h = objArr2;
    }
}
