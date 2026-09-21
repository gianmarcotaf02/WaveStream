package S4;

import com.kiptv.core.model.XtreamCategory;
import com.kiptv.core.model.XtreamSeries;
import com.kiptv.core.model.XtreamVODStream;
import java.text.Collator;

public final class A implements p194x6.m {

    public final int f9300h;

    public final Collator f9301i;

    public A(Collator collator, int i3) {
        this.f9300h = i3;
        this.f9301i = collator;
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f9300h) {
            case 0:
                return Integer.valueOf(this.f9301i.compare(((XtreamVODStream) obj).f20723b, ((XtreamVODStream) obj2).f20723b));
            case 1:
                return Integer.valueOf(this.f9301i.compare(((XtreamVODStream) obj2).f20723b, ((XtreamVODStream) obj).f20723b));
            case 2:
                return Integer.valueOf(this.f9301i.compare(((XtreamSeries) obj).f20683b, ((XtreamSeries) obj2).f20683b));
            case 3:
                return Integer.valueOf(this.f9301i.compare(((XtreamSeries) obj2).f20683b, ((XtreamSeries) obj).f20683b));
            case 4:
                return Integer.valueOf(this.f9301i.compare(((XtreamCategory) obj).f20650b, ((XtreamCategory) obj2).f20650b));
            case 5:
                return Integer.valueOf(this.f9301i.compare(((XtreamCategory) obj2).f20650b, ((XtreamCategory) obj).f20650b));
            case 6:
                return Integer.valueOf(this.f9301i.compare(((p) obj).f9430b, ((p) obj2).f9430b));
            default:
                return Integer.valueOf(this.f9301i.compare(((p) obj2).f9430b, ((p) obj).f9430b));
        }
    }
}
