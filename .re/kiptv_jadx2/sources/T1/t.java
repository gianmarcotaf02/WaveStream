package T1;

import android.util.SparseArray;

public final class t {

    public final SparseArray f9714a;

    public w f9715b;

    public t(int i3) {
        this.f9714a = new SparseArray(i3);
    }

    public final void a(w wVar, int i3, int i9) {
        int iA = wVar.a(i3);
        SparseArray sparseArray = this.f9714a;
        t tVar = sparseArray == null ? null : (t) sparseArray.get(iA);
        if (tVar == null) {
            tVar = new t(1);
            sparseArray.put(wVar.a(i3), tVar);
        }
        if (i9 > i3) {
            tVar.a(wVar, i3 + 1, i9);
        } else {
            tVar.f9715b = wVar;
        }
    }
}
