package p105m2;

import android.util.SparseArray;

public final class S implements Runnable {

    public final int f25232h;

    public final T f25233i;

    public S(T t9, int i3) {
        this.f25232h = i3;
        this.f25233i = t9;
    }

    @Override
    public final void run() {
        switch (this.f25232h) {
            case 0:
                SparseArray sparseArray = this.f25233i.f25240h;
                int size = sparseArray.size();
                for (int i3 = 0; i3 < size; i3++) {
                    ((V) sparseArray.valueAt(i3)).getClass();
                    V.a(null, null);
                }
                sparseArray.clear();
                break;
            default:
                T t9 = this.f25233i;
                Y y = t9.f25241i;
                if (y.f25261u == t9) {
                    y.k();
                }
                break;
        }
    }
}
