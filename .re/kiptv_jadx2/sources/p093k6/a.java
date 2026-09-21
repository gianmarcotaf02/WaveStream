package p093k6;

import java.util.Comparator;
import kotlin.jvm.internal.m;

public final class a implements Comparator {

    public static final a f24495i = new a(0);
    public static final a j = new a(1);

    public final int f24496h;

    public a(int i3) {
        this.f24496h = i3;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        switch (this.f24496h) {
            case 0:
                Comparable a2 = (Comparable) obj;
                Comparable b9 = (Comparable) obj2;
                m.e(a2, "a");
                m.e(b9, "b");
                return a2.compareTo(b9);
            default:
                Comparable a9 = (Comparable) obj;
                Comparable b10 = (Comparable) obj2;
                m.e(a9, "a");
                m.e(b10, "b");
                return b10.compareTo(a9);
        }
    }

    @Override
    public final Comparator reversed() {
        switch (this.f24496h) {
            case 0:
                return j;
            default:
                return f24495i;
        }
    }
}
