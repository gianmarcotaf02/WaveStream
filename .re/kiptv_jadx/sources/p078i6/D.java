package p078i6;

/* JADX INFO: loaded from: classes4.dex */
public abstract class D extends com.google.common.util.concurrent.U {
    public static int I0(int i3) {
        if (i3 < 0) {
            return i3;
        }
        if (i3 < 3) {
            return i3 + 1;
        }
        return i3 < 1073741824 ? (int) ((i3 / 0.75f) + 1.0f) : androidx.media3.common.util.Log.LOG_LEVEL_OFF;
    }

    public static java.util.Map J0(p070h6.k pair) {
        kotlin.jvm.internal.m.e(pair, "pair");
        java.util.Map mapSingletonMap = java.util.Collections.singletonMap(pair.f22539h, pair.f22540i);
        kotlin.jvm.internal.m.d(mapSingletonMap, "singletonMap(...)");
        return mapSingletonMap;
    }

    public static final java.util.Map K0(java.util.Map map) {
        kotlin.jvm.internal.m.e(map, "<this>");
        java.util.Map.Entry entry = (java.util.Map.Entry) map.entrySet().iterator().next();
        java.util.Map mapSingletonMap = java.util.Collections.singletonMap(entry.getKey(), entry.getValue());
        kotlin.jvm.internal.m.d(mapSingletonMap, "with(...)");
        return mapSingletonMap;
    }

    public static java.util.TreeMap L0(java.util.Map map) {
        kotlin.jvm.internal.m.e(map, "<this>");
        return new java.util.TreeMap(map);
    }
}
