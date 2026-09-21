package E;

import java.util.ArrayList;

public final class c implements d {

    public final float f2616a;

    public c(float f9) {
        this.f2616a = f9;
        if (p113n1.f.b(f9, 0) > 0) {
            return;
        }
        A.b.a("Provided size should be larger than zero.");
    }

    @Override
    public final ArrayList a(p113n1.c cVar, int i3, int i9) {
        int iK0 = cVar.k0(this.f2616a);
        int i10 = iK0 + i9;
        int i11 = i9 + i3;
        if (i10 >= i11) {
            ArrayList arrayList = new ArrayList(1);
            arrayList.add(Integer.valueOf(i3));
            return arrayList;
        }
        int i12 = i11 / i10;
        ArrayList arrayList2 = new ArrayList(i12);
        for (int i13 = 0; i13 < i12; i13++) {
            arrayList2.add(Integer.valueOf(iK0));
        }
        return arrayList2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof c) {
            return p113n1.f.c(this.f2616a, ((c) obj).f2616a);
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.f2616a);
    }
}
