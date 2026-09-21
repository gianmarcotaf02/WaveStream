package T4;

import java.util.LinkedHashMap;
import java.util.Map;

public final class e extends LinkedHashMap {

    public final g f9824h;

    public e(g gVar) {
        super(16, 0.75f, true);
        this.f9824h = gVar;
    }

    @Override
    public final boolean containsValue(Object obj) {
        if (obj instanceof b) {
            return super.containsValue((b) obj);
        }
        return false;
    }

    @Override
    public final boolean remove(Object obj, Object obj2) {
        if (obj != null && (obj2 instanceof b)) {
            return super.remove(obj, (b) obj2);
        }
        return false;
    }

    @Override
    public final boolean removeEldestEntry(Map.Entry entry) {
        return super.size() > this.f9824h.f9831a;
    }
}
