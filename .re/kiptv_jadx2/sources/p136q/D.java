package p136q;

import D6.g;
import O7.r;
import java.util.List;
import kotlin.jvm.internal.m;
import p038e0.b;
import p121o0.p;
import p144r.a;

public final class D {

    public Object[] f26303a;

    public int f26304b;

    public b f26305c;

    public D(int i3) {
        this.f26303a = i3 == 0 ? N.f26348a : new Object[i3];
    }

    public final void a(Object obj) {
        int i3 = this.f26304b + 1;
        Object[] objArr = this.f26303a;
        if (objArr.length < i3) {
            m(objArr, i3);
        }
        Object[] objArr2 = this.f26303a;
        int i9 = this.f26304b;
        objArr2[i9] = obj;
        this.f26304b = i9 + 1;
    }

    public final void b(List list) {
        if (list.isEmpty()) {
            return;
        }
        int i3 = this.f26304b;
        int size = list.size() + i3;
        Object[] objArr = this.f26303a;
        if (objArr.length < size) {
            m(objArr, size);
        }
        Object[] objArr2 = this.f26303a;
        int size2 = list.size();
        for (int i9 = 0; i9 < size2; i9++) {
            objArr2[i9 + i3] = list.get(i9);
        }
        this.f26304b = list.size() + this.f26304b;
    }

    public final void c(D elements) {
        m.e(elements, "elements");
        if (elements.h()) {
            return;
        }
        int i3 = this.f26304b + elements.f26304b;
        Object[] objArr = this.f26303a;
        if (objArr.length < i3) {
            m(objArr, i3);
        }
        p078i6.m.Z(this.f26304b, 0, elements.f26304b, elements.f26303a, this.f26303a);
        this.f26304b += elements.f26304b;
    }

    public final void d() {
        p078i6.m.h0(this.f26303a, null, 0, this.f26304b);
        this.f26304b = 0;
    }

    public final Object e() {
        if (!h()) {
            return this.f26303a[0];
        }
        a.e("ObjectList is empty.");
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof D) {
            D d4 = (D) obj;
            int i3 = d4.f26304b;
            int i9 = this.f26304b;
            if (i3 == i9) {
                Object[] objArr = this.f26303a;
                Object[] objArr2 = d4.f26303a;
                g gVarW = r.W(0, i9);
                int i10 = gVarW.f2458h;
                int i11 = gVarW.f2459i;
                if (i10 > i11) {
                    return true;
                }
                while (m.a(objArr[i10], objArr2[i10])) {
                    if (i10 == i11) {
                        return true;
                    }
                    i10++;
                }
                return false;
            }
        }
        return false;
    }

    public final Object f(int i3) {
        if (i3 >= 0 && i3 < this.f26304b) {
            return this.f26303a[i3];
        }
        n(i3);
        throw null;
    }

    public final int g(Object obj) {
        int i3 = 0;
        if (obj == null) {
            Object[] objArr = this.f26303a;
            int i9 = this.f26304b;
            while (i3 < i9) {
                if (objArr[i3] == null) {
                    return i3;
                }
                i3++;
            }
            return -1;
        }
        Object[] objArr2 = this.f26303a;
        int i10 = this.f26304b;
        while (i3 < i10) {
            if (obj.equals(objArr2[i3])) {
                return i3;
            }
            i3++;
        }
        return -1;
    }

    public final boolean h() {
        return this.f26304b == 0;
    }

    public final int hashCode() {
        Object[] objArr = this.f26303a;
        int i3 = this.f26304b;
        int iHashCode = 0;
        for (int i9 = 0; i9 < i3; i9++) {
            Object obj = objArr[i9];
            iHashCode += (obj != null ? obj.hashCode() : 0) * 31;
        }
        return iHashCode;
    }

    public final boolean i() {
        return this.f26304b != 0;
    }

    public final boolean j(Object obj) {
        int iG = g(obj);
        if (iG < 0) {
            return false;
        }
        k(iG);
        return true;
    }

    public final Object k(int i3) {
        int i9;
        if (i3 < 0 || i3 >= (i9 = this.f26304b)) {
            n(i3);
            throw null;
        }
        Object[] objArr = this.f26303a;
        Object obj = objArr[i3];
        if (i3 != i9 - 1) {
            p078i6.m.Z(i3, i3 + 1, i9, objArr, objArr);
        }
        int i10 = this.f26304b - 1;
        this.f26304b = i10;
        objArr[i10] = null;
        return obj;
    }

    public final void l(int i3, int i9) {
        int i10;
        if (i3 < 0 || i3 > (i10 = this.f26304b) || i9 < 0 || i9 > i10) {
            StringBuilder sbS = p.s(i3, i9, "Start (", ") and end (", ") must be in 0..");
            sbS.append(this.f26304b);
            a.d(sbS.toString());
            throw null;
        }
        if (i9 < i3) {
            a.c("Start (" + i3 + ") is more than end (" + i9 + ')');
            throw null;
        }
        if (i9 != i3) {
            if (i9 < i10) {
                Object[] objArr = this.f26303a;
                p078i6.m.Z(i3, i9, i10, objArr, objArr);
            }
            int i11 = this.f26304b;
            int i12 = i11 - (i9 - i3);
            p078i6.m.h0(this.f26303a, null, i12, i11);
            this.f26304b = i12;
        }
    }

    public final void m(Object[] oldContent, int i3) {
        m.e(oldContent, "oldContent");
        int length = oldContent.length;
        Object[] objArr = new Object[Math.max(i3, (length * 3) / 2)];
        p078i6.m.Z(0, 0, length, oldContent, objArr);
        this.f26303a = objArr;
    }

    public final void n(int i3) {
        StringBuilder sbT = p.t(i3, "Index ", " must be in 0..");
        sbT.append(this.f26304b - 1);
        a.d(sbT.toString());
        throw null;
    }

    public final String toString() {
        A0.b bVar = new A0.b(18, this);
        StringBuilder sb = new StringBuilder("[");
        Object[] objArr = this.f26303a;
        int i3 = this.f26304b;
        for (int i9 = 0; i9 < i3; i9++) {
            Object obj = objArr[i9];
            if (i9 == -1) {
                sb.append((CharSequence) "...");
                String string = sb.toString();
                m.d(string, "toString(...)");
                return string;
            }
            if (i9 != 0) {
                sb.append((CharSequence) ", ");
            }
            sb.append((CharSequence) bVar.invoke(obj));
        }
        sb.append((CharSequence) "]");
        String string2 = sb.toString();
        m.d(string2, "toString(...)");
        return string2;
    }

    public D() {
        this(16);
    }
}
