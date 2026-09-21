package p079i7;

import Y6.f;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.m;
import p078i6.C2253d;
import p078i6.n;
import p078i6.o;
import p078i6.w;

public abstract class a {

    public final int[] f23210a;

    public final int f23211b;

    public final int f23212c;

    public final int f23213d;

    public final List f23214e;

    public a(int... numbers) {
        List listN1;
        m.e(numbers, "numbers");
        this.f23210a = numbers;
        Integer numQ0 = p078i6.m.q0(numbers, 0);
        this.f23211b = numQ0 != null ? numQ0.intValue() : -1;
        Integer numQ1 = p078i6.m.q0(numbers, 1);
        this.f23212c = numQ1 != null ? numQ1.intValue() : -1;
        Integer numQ2 = p078i6.m.q0(numbers, 2);
        this.f23213d = numQ2 != null ? numQ2.intValue() : -1;
        if (numbers.length <= 3) {
            listN1 = w.f23205h;
        } else {
            if (numbers.length > 1024) {
                throw new IllegalArgumentException(f.j(new StringBuilder("BinaryVersion with length more than 1024 are not supported. Provided length "), numbers.length, '.'));
            }
            listN1 = o.N1(new C2253d(new n(numbers), 3, numbers.length));
        }
        this.f23214e = listN1;
    }

    public final boolean a(int i3, int i9, int i10) {
        int i11 = this.f23211b;
        if (i11 > i3) {
            return true;
        }
        if (i11 < i3) {
            return false;
        }
        int i12 = this.f23212c;
        if (i12 > i9) {
            return true;
        }
        return i12 >= i9 && this.f23213d >= i10;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !getClass().equals(obj.getClass())) {
            return false;
        }
        a aVar = (a) obj;
        return this.f23211b == aVar.f23211b && this.f23212c == aVar.f23212c && this.f23213d == aVar.f23213d && m.a(this.f23214e, aVar.f23214e);
    }

    public final int hashCode() {
        int i3 = this.f23211b;
        int i9 = (i3 * 31) + this.f23212c + i3;
        int i10 = (i9 * 31) + this.f23213d + i9;
        return this.f23214e.hashCode() + (i10 * 31) + i10;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        for (int i3 : this.f23210a) {
            if (i3 == -1) {
                break;
            }
            arrayList.add(Integer.valueOf(i3));
        }
        return arrayList.isEmpty() ? "unknown" : o.o1(arrayList, ".", null, null, null, 62);
    }
}
