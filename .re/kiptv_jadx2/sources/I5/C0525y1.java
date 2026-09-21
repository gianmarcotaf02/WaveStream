package I5;

import com.kiptv.core.model.XtreamSeries;
import com.kiptv.core.model.XtreamVODStream;

public final class C0525y1 implements p194x6.j {

    public final int f5465h;

    public final String f5466i;
    public final p175v0.y j;

    public final Object f5467k;

    public C0525y1(String str, p175v0.y yVar, Object obj, int i3) {
        this.f5465h = i3;
        this.f5466i = str;
        this.j = yVar;
        this.f5467k = obj;
    }

    @Override
    public final Object invoke(Object obj) {
        switch (this.f5465h) {
            case 0:
                XtreamSeries it = (XtreamSeries) obj;
                kotlin.jvm.internal.m.e(it, "it");
                if (kotlin.jvm.internal.m.a(this.f5467k, this.f5466i + ":" + it.f20684c)) {
                    return this.j;
                }
                return null;
            default:
                XtreamVODStream it2 = (XtreamVODStream) obj;
                kotlin.jvm.internal.m.e(it2, "it");
                if (kotlin.jvm.internal.m.a(this.f5467k, this.f5466i + ":" + it2.f20725d)) {
                    return this.j;
                }
                return null;
        }
    }
}
