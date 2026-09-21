package p020c0;

import Q0.C0784s;
import Y6.f;
import androidx.media3.common.C;
import java.util.ArrayList;

public final class J0 {

    public final K0 f18122a;

    public final int[] f18123b;

    public final int f18124c;

    public Object[] f18125d;

    public final int f18126e;

    public boolean f18127f;
    public int g;

    public int f18128h;

    public int f18129i;
    public final C0784s j;

    public int f18130k;

    public int f18131l;

    public int f18132m;

    public boolean f18133n;

    public J0(K0 k1) {
        this.f18122a = k1;
        this.f18123b = k1.f18134h;
        int i3 = k1.f18135i;
        this.f18124c = i3;
        this.f18125d = k1.j;
        this.f18126e = k1.f18136k;
        this.f18128h = i3;
        this.f18129i = -1;
        this.j = new C0784s();
    }

    public final C1668a a(int i3) {
        ArrayList arrayList = this.f18122a.f18141p;
        int iE = M0.e(arrayList, i3, this.f18124c);
        if (iE >= 0) {
            return (C1668a) arrayList.get(iE);
        }
        C1668a c1668a = new C1668a(i3);
        arrayList.add(-(iE + 1), c1668a);
        return c1668a;
    }

    public final Object b(int[] iArr, int i3) {
        int i9 = i3 * 5;
        int i10 = iArr[i9 + 1];
        if ((268435456 & i10) != 0) {
            return this.f18125d[i9 >= iArr.length ? iArr.length : iArr[i9 + 4] + Integer.bitCount(i10 >> 29)];
        }
        return C1690l.f18284a;
    }

    public final void c() {
        this.f18127f = true;
        K0 k1 = this.f18122a;
        k1.getClass();
        if (this.f18122a != k1 || k1.f18137l <= 0) {
            AbstractC1705t.a("Unexpected reader close()");
        }
        k1.f18137l--;
        this.f18125d = new Object[0];
    }

    public final boolean d(int i3) {
        return (this.f18123b[(i3 * 5) + 1] & C.BUFFER_FLAG_NOT_DEPENDED_ON) != 0;
    }

    public final void e() {
        if (this.f18130k == 0) {
            if (!(this.g == this.f18128h)) {
                AbstractC1705t.a("endGroup() not called at the end of a group");
            }
            int i3 = (this.f18129i * 5) + 2;
            int[] iArr = this.f18123b;
            int i9 = iArr[i3];
            this.f18129i = i9;
            int i10 = this.f18124c;
            this.f18128h = i9 < 0 ? i10 : M0.a(iArr, i9) + i9;
            int iB = this.j.b();
            if (iB < 0) {
                this.f18131l = 0;
                this.f18132m = 0;
            } else {
                this.f18131l = iB;
                this.f18132m = i9 >= i10 - 1 ? this.f18126e : iArr[((i9 + 1) * 5) + 4];
            }
        }
    }

    public final Object f() {
        int i3 = this.g;
        if (i3 < this.f18128h) {
            return b(this.f18123b, i3);
        }
        return 0;
    }

    public final int g() {
        int i3 = this.g;
        if (i3 >= this.f18128h) {
            return 0;
        }
        return this.f18123b[i3 * 5];
    }

    public final Object h(int i3, int i9) {
        int[] iArr = this.f18123b;
        int iC = M0.c(iArr, i3);
        int i10 = i3 + 1;
        int i11 = iC + i9;
        return i11 < (i10 < this.f18124c ? iArr[(i10 * 5) + 4] : this.f18126e) ? this.f18125d[i11] : C1690l.f18284a;
    }

    public final int i(int i3) {
        return this.f18123b[i3 * 5];
    }

    public final boolean j(int i3) {
        return (this.f18123b[(i3 * 5) + 1] & C.BUFFER_FLAG_FIRST_SAMPLE) != 0;
    }

    public final boolean k(int i3) {
        return (this.f18123b[(i3 * 5) + 1] & C.BUFFER_FLAG_LAST_SAMPLE) != 0;
    }

    public final boolean l(int i3) {
        return (this.f18123b[(i3 * 5) + 1] & 1073741824) != 0;
    }

    public final Object m() {
        int i3;
        if (this.f18130k > 0 || (i3 = this.f18131l) >= this.f18132m) {
            this.f18133n = false;
            return C1690l.f18284a;
        }
        this.f18133n = true;
        Object[] objArr = this.f18125d;
        this.f18131l = i3 + 1;
        return objArr[i3];
    }

    public final Object n(int i3) {
        int i9 = i3 * 5;
        int[] iArr = this.f18123b;
        int i10 = iArr[i9 + 1] & 1073741824;
        if (i10 != 0) {
            return i10 != 0 ? this.f18125d[iArr[i9 + 4]] : C1690l.f18284a;
        }
        return null;
    }

    public final int o(int i3) {
        return this.f18123b[(i3 * 5) + 1] & 67108863;
    }

    public final Object p(int[] iArr, int i3) {
        int i9 = i3 * 5;
        int i10 = iArr[i9 + 1];
        if ((536870912 & i10) == 0) {
            return null;
        }
        return this.f18125d[Integer.bitCount(i10 >> 30) + iArr[i9 + 4]];
    }

    public final int q(int i3) {
        return this.f18123b[(i3 * 5) + 2];
    }

    public final void r(int i3) {
        if (!(this.f18130k == 0)) {
            AbstractC1705t.a("Cannot reposition while in an empty region");
        }
        this.g = i3;
        int[] iArr = this.f18123b;
        int i9 = this.f18124c;
        int i10 = i3 < i9 ? iArr[(i3 * 5) + 2] : -1;
        if (i10 != this.f18129i) {
            this.f18129i = i10;
            if (i10 < 0) {
                this.f18128h = i9;
            } else {
                this.f18128h = M0.a(iArr, i10) + i10;
            }
            this.f18131l = 0;
            this.f18132m = 0;
        }
    }

    public final int s() {
        if (!(this.f18130k == 0)) {
            AbstractC1705t.a("Cannot skip while in an empty region");
        }
        int i3 = this.g;
        int[] iArr = this.f18123b;
        int i9 = (iArr[(i3 * 5) + 1] & 1073741824) == 0 ? iArr[(i3 * 5) + 1] & 67108863 : 1;
        this.g = M0.a(iArr, i3) + i3;
        return i9;
    }

    public final void t() {
        if (!(this.f18130k == 0)) {
            AbstractC1705t.a("Cannot skip the enclosing group while in an empty region");
        }
        this.g = this.f18128h;
        this.f18131l = 0;
        this.f18132m = 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SlotReader(current=");
        sb.append(this.g);
        sb.append(", key=");
        sb.append(g());
        sb.append(", parent=");
        sb.append(this.f18129i);
        sb.append(", end=");
        return f.j(sb, this.f18128h, ')');
    }

    public final void u() {
        if (this.f18130k <= 0) {
            int i3 = this.f18129i;
            int i9 = this.g;
            int[] iArr = this.f18123b;
            if (!(iArr[(i9 * 5) + 2] == i3)) {
                AbstractC1693m0.a("Invalid slot table detected");
            }
            int i10 = this.f18131l;
            int i11 = this.f18132m;
            C0784s c0784s = this.j;
            if (i10 == 0 && i11 == 0) {
                c0784s.c(-1);
            } else {
                c0784s.c(i10);
            }
            this.f18129i = i9;
            this.f18128h = M0.a(iArr, i9) + i9;
            int i12 = i9 + 1;
            this.g = i12;
            this.f18131l = M0.c(iArr, i9);
            this.f18132m = i9 >= this.f18124c - 1 ? this.f18126e : iArr[(i12 * 5) + 4];
        }
    }
}
