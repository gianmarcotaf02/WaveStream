package p078i6;

import androidx.media3.common.util.Log;
import com.google.common.util.concurrent.U;
import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;
import kotlin.jvm.internal.m;
import p070h6.k;

public abstract class D extends U {
    public static int I0(int i3) {
        if (i3 < 0) {
            return i3;
        }
        if (i3 < 3) {
            return i3 + 1;
        }
        return i3 < 1073741824 ? (int) ((i3 / 0.75f) + 1.0f) : Log.LOG_LEVEL_OFF;
    }

    public static Map J0(k pair) {
        m.e(pair, "pair");
        Map mapSingletonMap = Collections.singletonMap(pair.f22539h, pair.f22540i);
        m.d(mapSingletonMap, "singletonMap(...)");
        return mapSingletonMap;
    }

    public static final Map K0(Map map) {
        m.e(map, "<this>");
        Map.Entry entry = (Map.Entry) map.entrySet().iterator().next();
        Map mapSingletonMap = Collections.singletonMap(entry.getKey(), entry.getValue());
        m.d(mapSingletonMap, "with(...)");
        return mapSingletonMap;
    }

    public static TreeMap L0(Map map) {
        m.e(map, "<this>");
        return new TreeMap(map);
    }
}
