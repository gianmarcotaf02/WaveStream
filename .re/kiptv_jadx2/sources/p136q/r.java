package p136q;

import java.util.Arrays;
import kotlin.jvm.internal.m;
import p144r.a;

public final class r implements Cloneable {

    public boolean f26415h;

    public long[] f26416i;
    public Object[] j;

    public int f26417k;

    public r(int i3) {
        if (i3 == 0) {
            this.f26416i = a.f26670b;
            this.j = a.f26671c;
            return;
        }
        int i9 = i3 * 8;
        for (int i10 = 4; i10 < 32; i10++) {
            int i11 = (1 << i10) - 12;
            if (i9 <= i11) {
                i9 = i11;
                break;
            }
        }
        int i12 = i9 / 8;
        this.f26416i = new long[i12];
        this.j = new Object[i12];
    }

    public final void a() {
        int i3 = this.f26417k;
        Object[] objArr = this.j;
        for (int i9 = 0; i9 < i3; i9++) {
            objArr[i9] = null;
        }
        this.f26417k = 0;
        this.f26415h = false;
    }

    public final Object b(long j) {
        Object obj;
        int iB = a.b(this.f26416i, this.f26417k, j);
        if (iB < 0 || (obj = this.j[iB]) == AbstractC2674s.f26418a) {
            return null;
        }
        return obj;
    }

    public final long c(int i3) {
        if (!(i3 >= 0 && i3 < this.f26417k)) {
            a.c("Expected index to be within 0..size()-1, but was " + i3);
            throw null;
        }
        if (this.f26415h) {
            int i9 = this.f26417k;
            long[] jArr = this.f26416i;
            Object[] objArr = this.j;
            int i10 = 0;
            for (int i11 = 0; i11 < i9; i11++) {
                Object obj = objArr[i11];
                if (obj != AbstractC2674s.f26418a) {
                    if (i11 != i10) {
                        jArr[i10] = jArr[i11];
                        objArr[i10] = obj;
                        objArr[i11] = null;
                    }
                    i10++;
                }
            }
            this.f26415h = false;
            this.f26417k = i10;
        }
        return this.f26416i[i3];
    }

    public final Object clone() throws CloneNotSupportedException {
        Object objClone = super.clone();
        m.c(objClone, "null cannot be cast to non-null type androidx.collection.LongSparseArray<E of androidx.collection.LongSparseArray>");
        r rVar = (r) objClone;
        rVar.f26416i = (long[]) this.f26416i.clone();
        rVar.j = (Object[]) this.j.clone();
        return rVar;
    }

    public final void d(long j, Object obj) {
        int iB = a.b(this.f26416i, this.f26417k, j);
        if (iB >= 0) {
            this.j[iB] = obj;
            return;
        }
        int i3 = ~iB;
        int i9 = this.f26417k;
        Object obj2 = AbstractC2674s.f26418a;
        if (i3 < i9) {
            Object[] objArr = this.j;
            if (objArr[i3] == obj2) {
                this.f26416i[i3] = j;
                objArr[i3] = obj;
                return;
            }
        }
        if (this.f26415h) {
            long[] jArr = this.f26416i;
            if (i9 >= jArr.length) {
                Object[] objArr2 = this.j;
                int i10 = 0;
                for (int i11 = 0; i11 < i9; i11++) {
                    Object obj3 = objArr2[i11];
                    if (obj3 != obj2) {
                        if (i11 != i10) {
                            jArr[i10] = jArr[i11];
                            objArr2[i10] = obj3;
                            objArr2[i11] = null;
                        }
                        i10++;
                    }
                }
                this.f26415h = false;
                this.f26417k = i10;
                i3 = ~a.b(this.f26416i, i10, j);
            }
        }
        int i12 = this.f26417k;
        if (i12 >= this.f26416i.length) {
            int i13 = (i12 + 1) * 8;
            for (int i14 = 4; i14 < 32; i14++) {
                int i15 = (1 << i14) - 12;
                if (i13 <= i15) {
                    i13 = i15;
                    break;
                }
            }
            int i16 = i13 / 8;
            long[] jArrCopyOf = Arrays.copyOf(this.f26416i, i16);
            m.d(jArrCopyOf, "copyOf(...)");
            this.f26416i = jArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.j, i16);
            m.d(objArrCopyOf, "copyOf(...)");
            this.j = objArrCopyOf;
        }
        int i17 = this.f26417k;
        if (i17 - i3 != 0) {
            long[] jArr2 = this.f26416i;
            int i18 = i3 + 1;
            p078i6.m.c0(jArr2, jArr2, i18, i3, i17);
            Object[] objArr3 = this.j;
            p078i6.m.Z(i18, i3, this.f26417k, objArr3, objArr3);
        }
        this.f26416i[i3] = j;
        this.j[i3] = obj;
        this.f26417k++;
    }

    public final void e(long j) {
        int iB = a.b(this.f26416i, this.f26417k, j);
        if (iB >= 0) {
            Object[] objArr = this.j;
            Object obj = objArr[iB];
            Object obj2 = AbstractC2674s.f26418a;
            if (obj != obj2) {
                objArr[iB] = obj2;
                this.f26415h = true;
            }
        }
    }

    public final int f() {
        if (this.f26415h) {
            int i3 = this.f26417k;
            long[] jArr = this.f26416i;
            Object[] objArr = this.j;
            int i9 = 0;
            for (int i10 = 0; i10 < i3; i10++) {
                Object obj = objArr[i10];
                if (obj != AbstractC2674s.f26418a) {
                    if (i10 != i9) {
                        jArr[i9] = jArr[i10];
                        objArr[i9] = obj;
                        objArr[i10] = null;
                    }
                    i9++;
                }
            }
            this.f26415h = false;
            this.f26417k = i9;
        }
        return this.f26417k;
    }

    public final Object g(int i3) {
        if (!(i3 >= 0 && i3 < this.f26417k)) {
            a.c("Expected index to be within 0..size()-1, but was " + i3);
            throw null;
        }
        if (this.f26415h) {
            int i9 = this.f26417k;
            long[] jArr = this.f26416i;
            Object[] objArr = this.j;
            int i10 = 0;
            for (int i11 = 0; i11 < i9; i11++) {
                Object obj = objArr[i11];
                if (obj != AbstractC2674s.f26418a) {
                    if (i11 != i10) {
                        jArr[i10] = jArr[i11];
                        objArr[i10] = obj;
                        objArr[i11] = null;
                    }
                    i10++;
                }
            }
            this.f26415h = false;
            this.f26417k = i10;
        }
        return this.j[i3];
    }

    public final String toString() {
        if (f() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f26417k * 28);
        sb.append('{');
        int i3 = this.f26417k;
        for (int i9 = 0; i9 < i3; i9++) {
            if (i9 > 0) {
                sb.append(", ");
            }
            sb.append(c(i9));
            sb.append('=');
            Object objG = g(i9);
            if (objG != sb) {
                sb.append(objG);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        String string = sb.toString();
        m.d(string, "toString(...)");
        return string;
    }

    public r(Object obj) {
        this(10);
    }
}
