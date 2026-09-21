package androidx.recyclerview.widget;

import android.util.SparseArray;
import java.util.Set;

public final class N {

    public SparseArray f17239a;

    public int f17240b;

    public Set f17241c;

    public final M a(int i3) {
        SparseArray sparseArray = this.f17239a;
        M m8 = (M) sparseArray.get(i3);
        if (m8 != null) {
            return m8;
        }
        M m9 = new M();
        sparseArray.put(i3, m9);
        return m9;
    }
}
