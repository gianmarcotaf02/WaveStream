package R8;

import java.util.HashMap;
import java.util.Map;

public final class a extends InheritableThreadLocal {
    @Override
    public final Object childValue(Object obj) {
        Map map = (Map) obj;
        if (map == null) {
            return null;
        }
        return new HashMap(map);
    }
}
