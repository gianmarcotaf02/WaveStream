package p005a5;

import java.util.LinkedHashMap;
import java.util.Map;

public final class C1372p5 extends LinkedHashMap {
    @Override
    public final boolean containsKey(Object obj) {
        if (obj instanceof String) {
            return super.containsKey((String) obj);
        }
        return false;
    }

    @Override
    public final boolean containsValue(Object obj) {
        if (obj instanceof C1390r4) {
            return super.containsValue((C1390r4) obj);
        }
        return false;
    }

    @Override
    public final Object get(Object obj) {
        if (obj instanceof String) {
            return (C1390r4) super.get((String) obj);
        }
        return null;
    }

    @Override
    public final Object getOrDefault(Object obj, Object obj2) {
        return !(obj instanceof String) ? obj2 : (C1390r4) super.getOrDefault((String) obj, (C1390r4) obj2);
    }

    @Override
    public final Object remove(Object obj) {
        if (obj instanceof String) {
            return (C1390r4) super.remove((String) obj);
        }
        return null;
    }

    @Override
    public final boolean removeEldestEntry(Map.Entry entry) {
        return super.size() > 200;
    }

    @Override
    public final boolean remove(Object obj, Object obj2) {
        if ((obj instanceof String) && (obj2 instanceof C1390r4)) {
            return super.remove((String) obj, (C1390r4) obj2);
        }
        return false;
    }
}
