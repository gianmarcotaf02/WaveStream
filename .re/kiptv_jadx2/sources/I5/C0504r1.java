package I5;

import com.kiptv.core.model.XtreamCategory;
import com.kiptv.core.model.XtreamSeries;
import com.kiptv.core.model.XtreamVODStream;

public final class C0504r1 implements p194x6.j {

    public final int f5340h;

    public final XtreamCategory f5341i;
    public final p175v0.y j;

    public final Object f5342k;

    public C0504r1(XtreamCategory xtreamCategory, p175v0.y yVar, Object obj, int i3) {
        this.f5340h = i3;
        this.f5341i = xtreamCategory;
        this.j = yVar;
        this.f5342k = obj;
    }

    @Override
    public final Object invoke(Object obj) {
        switch (this.f5340h) {
            case 0:
                XtreamSeries it = (XtreamSeries) obj;
                kotlin.jvm.internal.m.e(it, "it");
                if (kotlin.jvm.internal.m.a(this.f5342k, "cat-" + this.f5341i.f20649a + ":" + it.f20684c)) {
                    return this.j;
                }
                return null;
            default:
                XtreamVODStream it2 = (XtreamVODStream) obj;
                kotlin.jvm.internal.m.e(it2, "it");
                if (kotlin.jvm.internal.m.a(this.f5342k, "cat-" + this.f5341i.f20649a + ":" + it2.f20725d)) {
                    return this.j;
                }
                return null;
        }
    }
}
