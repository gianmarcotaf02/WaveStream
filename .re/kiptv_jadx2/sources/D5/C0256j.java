package D5;

import java.util.Map;
import p175v0.C2906a;

public final class C0256j implements p194x6.j {

    public final int f2308h;

    public final Map f2309i;

    public C0256j(Map map, int i3) {
        this.f2308h = i3;
        this.f2309i = map;
    }

    @Override
    public final Object invoke(Object obj) {
        switch (this.f2308h) {
            case 0:
                kotlin.jvm.internal.m.e((C2906a) obj, "<this>");
                p175v0.y yVar = (p175v0.y) this.f2309i.get(C5.U.f1139h);
                if (yVar != null) {
                    p175v0.y.a(yVar);
                }
                break;
            default:
                p175v0.r focusProperties = (p175v0.r) obj;
                kotlin.jvm.internal.m.e(focusProperties, "$this$focusProperties");
                focusProperties.c(new C0256j(this.f2309i, 0));
                break;
        }
        return p070h6.A.f22523a;
    }
}
