package p076i4;

import java.io.Serializable;

public final class L0 extends O0 implements Serializable {

    public static final L0 f22810i = new L0(0);
    public static final L0 j = new L0(1);

    public final int f22811h;

    public L0(int i3) {
        this.f22811h = i3;
    }

    @Override
    public final O0 a() {
        switch (this.f22811h) {
            case 0:
                return j;
            default:
                return f22810i;
        }
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        switch (this.f22811h) {
            case 0:
                Comparable comparable = (Comparable) obj;
                Comparable comparable2 = (Comparable) obj2;
                comparable.getClass();
                comparable2.getClass();
                return comparable.compareTo(comparable2);
            default:
                Comparable comparable3 = (Comparable) obj;
                Comparable comparable4 = (Comparable) obj2;
                comparable3.getClass();
                if (comparable3 == comparable4) {
                    return 0;
                }
                return comparable4.compareTo(comparable3);
        }
    }

    public final String toString() {
        switch (this.f22811h) {
            case 0:
                return "Ordering.natural()";
            default:
                return "Ordering.natural().reverse()";
        }
    }
}
