package p018b8;

import P8.e;
import V1.b;
import java.util.Map;
import p100l6.f;
import p100l6.h;

public final class a extends p100l6.a implements f {

    public static final b f18024i = new b(12);

    public final Map f18025h;

    public a() {
        super(f18024i);
        S8.a aVar = e.f8188a;
        if (aVar == null) {
            throw new IllegalStateException("MDCAdapter cannot be null. See also http://www.slf4j.org/codes.html#null_MDCA");
        }
        Map mapW = aVar.w();
        this.f18025h = mapW;
    }

    public static void W(Map map) {
        if (map == null) {
            S8.a aVar = e.f8188a;
            if (aVar == null) {
                throw new IllegalStateException("MDCAdapter cannot be null. See also http://www.slf4j.org/codes.html#null_MDCA");
            }
            aVar.clear();
            return;
        }
        S8.a aVar2 = e.f8188a;
        if (aVar2 == null) {
            throw new IllegalStateException("MDCAdapter cannot be null. See also http://www.slf4j.org/codes.html#null_MDCA");
        }
        aVar2.r(map);
    }

    public final void V(Object obj) {
        W((Map) obj);
    }

    public final Object X(h hVar) {
        S8.a aVar = e.f8188a;
        if (aVar == null) {
            throw new IllegalStateException("MDCAdapter cannot be null. See also http://www.slf4j.org/codes.html#null_MDCA");
        }
        Map mapW = aVar.w();
        W(this.f18025h);
        return mapW;
    }
}
