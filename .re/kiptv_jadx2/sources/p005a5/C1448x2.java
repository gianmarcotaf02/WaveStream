package p005a5;

import kotlin.jvm.internal.m;
import p070h6.k;
import p078i6.o;
import p194x6.j;

public final class C1448x2 implements j {

    public static final C1448x2 f15287i = new C1448x2(0);
    public static final C1448x2 j = new C1448x2(1);

    public static final C1448x2 f15288k = new C1448x2(2);

    public final int f15289h;

    public C1448x2(int i3) {
        this.f15289h = i3;
    }

    @Override
    public final Object invoke(Object obj) {
        switch (this.f15289h) {
            case 0:
                k it = (k) obj;
                m.e(it, "it");
                return o.o1((Iterable) it.f22540i, ",", null, null, new C1438w2(it, 0), 30);
            case 1:
                k it2 = (k) obj;
                m.e(it2, "it");
                return o.o1((Iterable) it2.f22540i, ",", null, null, new C1438w2(it2, 1), 30);
            default:
                k it3 = (k) obj;
                m.e(it3, "it");
                return o.o1((Iterable) it3.f22540i, ",", null, null, new C1438w2(it3, 2), 30);
        }
    }
}
