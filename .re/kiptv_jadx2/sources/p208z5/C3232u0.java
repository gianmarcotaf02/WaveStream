package p208z5;

import com.kiptv.core.model.XtreamVODStream;
import kotlin.jvm.internal.m;
import p194x6.j;

public final class C3232u0 implements j {

    public static final C3232u0 f32847i = new C3232u0(0);
    public static final C3232u0 j = new C3232u0(1);

    public final int f32848h;

    public C3232u0(int i3) {
        this.f32848h = i3;
    }

    @Override
    public final Object invoke(Object obj) {
        switch (this.f32848h) {
            case 0:
                XtreamVODStream it = (XtreamVODStream) obj;
                m.e(it, "it");
                return Integer.valueOf(it.f20725d);
            default:
                XtreamVODStream it2 = (XtreamVODStream) obj;
                m.e(it2, "it");
                return it2.f20723b;
        }
    }
}
