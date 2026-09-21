package p162s8;

import java.util.LinkedHashMap;
import kotlin.jvm.internal.m;
import kotlinx.serialization.json.b;
import kotlinx.serialization.json.c;

public final class v {

    public final LinkedHashMap f27426a = new LinkedHashMap();

    public final c a() {
        return new c(this.f27426a);
    }

    public final b b(String key, b element) {
        m.e(key, "key");
        m.e(element, "element");
        return (b) this.f27426a.put(key, element);
    }
}
