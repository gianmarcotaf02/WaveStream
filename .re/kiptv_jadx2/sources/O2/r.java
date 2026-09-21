package O2;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;

public final class r {

    public final LinkedHashMap f7936a;

    public r(s sVar) {
        Map map = sVar.f7938a;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : map.entrySet()) {
            linkedHashMap.put(entry.getKey(), p078i6.o.O1((Collection) entry.getValue()));
        }
        this.f7936a = linkedHashMap;
    }

    public void a(String str) {
        String lowerCase = "Cache-Control".toLowerCase(Locale.ROOT);
        kotlin.jvm.internal.m.d(lowerCase, "toLowerCase(...)");
        this.f7936a.put(lowerCase, p078i6.p.D0(str));
    }

    public r() {
        this.f7936a = new LinkedHashMap();
    }
}
