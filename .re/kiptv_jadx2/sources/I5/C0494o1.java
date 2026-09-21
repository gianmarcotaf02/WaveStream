package I5;

import com.kiptv.core.model.XtreamSeries;

public final class C0494o1 implements p194x6.j {

    public static final C0494o1 f5301i = new C0494o1(0);
    public static final C0494o1 j = new C0494o1(1);

    public final int f5302h;

    public C0494o1(int i3) {
        this.f5302h = i3;
    }

    @Override
    public final Object invoke(Object obj) {
        switch (this.f5302h) {
            case 0:
                XtreamSeries it = (XtreamSeries) obj;
                kotlin.jvm.internal.m.e(it, "it");
                return Integer.valueOf(it.f20684c);
            default:
                XtreamSeries it2 = (XtreamSeries) obj;
                kotlin.jvm.internal.m.e(it2, "it");
                return it2.f20683b;
        }
    }
}
