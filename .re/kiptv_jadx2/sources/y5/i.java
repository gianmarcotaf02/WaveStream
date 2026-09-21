package y5;

import java.util.Map;
import p175v0.C2906a;

public final class i implements p194x6.j {

    public final int f31909h;

    public final Map f31910i;
    public final B j;

    public i(Map map, B b9, int i3) {
        this.f31909h = i3;
        this.f31910i = map;
        this.j = b9;
    }

    @Override
    public final Object invoke(Object obj) {
        switch (this.f31909h) {
            case 0:
                kotlin.jvm.internal.m.e((C2906a) obj, "<this>");
                p175v0.y yVar = (p175v0.y) this.f31910i.get(this.j);
                if (yVar != null) {
                    p175v0.y.a(yVar);
                }
                break;
            default:
                p175v0.r focusProperties = (p175v0.r) obj;
                kotlin.jvm.internal.m.e(focusProperties, "$this$focusProperties");
                focusProperties.c(new i(this.f31910i, this.j, 0));
                break;
        }
        return p070h6.A.f22523a;
    }
}
