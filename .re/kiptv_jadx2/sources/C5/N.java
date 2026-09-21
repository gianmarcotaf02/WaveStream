package C5;

import com.kiptv.core.model.XtreamVODStream;
import java.util.ArrayList;

public final class N implements p194x6.j {

    public final int f1081h;

    public final ArrayList f1082i;

    public N(int i3, ArrayList arrayList) {
        this.f1081h = i3;
        this.f1082i = arrayList;
    }

    @Override
    public final Object invoke(Object obj) {
        switch (this.f1081h) {
            case 0:
                this.f1082i.get(((Number) obj).intValue());
                return null;
            case 1:
                this.f1082i.get(((Number) obj).intValue());
                return null;
            case 2:
                this.f1082i.get(((Number) obj).intValue());
                return null;
            case 3:
                this.f1082i.get(((Number) obj).intValue());
                return null;
            case 4:
                this.f1082i.get(((Number) obj).intValue());
                return null;
            case 5:
                XtreamVODStream m8 = (XtreamVODStream) this.f1082i.get(((Number) obj).intValue());
                kotlin.jvm.internal.m.e(m8, "m");
                return Integer.valueOf(m8.f20725d);
            case 6:
                this.f1082i.get(((Number) obj).intValue());
                return null;
            case 7:
                S4.p g = (S4.p) this.f1082i.get(((Number) obj).intValue());
                kotlin.jvm.internal.m.e(g, "g");
                return Integer.valueOf(g.f9429a);
            default:
                this.f1082i.get(((Number) obj).intValue());
                return null;
        }
    }
}
