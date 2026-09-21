package H5;

import com.kiptv.core.model.XtreamSeries;
import com.kiptv.core.model.XtreamVODStream;

public final class N implements p194x6.j {

    public final int f4117h;

    public final p175v0.y f4118i;
    public final Object j;

    public N(p175v0.y yVar, Object obj, int i3) {
        this.f4117h = i3;
        this.f4118i = yVar;
        this.j = obj;
    }

    @Override
    public final Object invoke(Object obj) {
        switch (this.f4117h) {
            case 0:
                String key = (String) obj;
                kotlin.jvm.internal.m.e(key, "key");
                if (kotlin.jvm.internal.m.a(this.j, key)) {
                    return this.f4118i;
                }
                return null;
            case 1:
                XtreamSeries it = (XtreamSeries) obj;
                kotlin.jvm.internal.m.e(it, "it");
                if (kotlin.jvm.internal.m.a(this.j, "recent:" + it.f20684c)) {
                    return this.f4118i;
                }
                return null;
            default:
                XtreamVODStream it2 = (XtreamVODStream) obj;
                kotlin.jvm.internal.m.e(it2, "it");
                if (kotlin.jvm.internal.m.a(this.j, "recent:" + it2.f20725d)) {
                    return this.f4118i;
                }
                return null;
        }
    }
}
