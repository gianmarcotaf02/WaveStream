package j$.time.format;

/* JADX INFO: loaded from: classes3.dex */
public final class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.util.Map f23749a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.util.HashMap f23750b;

    public z(java.util.Map map) {
        this.f23749a = map;
        java.util.HashMap map2 = new java.util.HashMap();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.util.Map.Entry entry : map.entrySet()) {
            java.util.HashMap map3 = new java.util.HashMap();
            for (java.util.Map.Entry entry2 : ((java.util.Map) entry.getValue()).entrySet()) {
                java.lang.String str = (java.lang.String) entry2.getValue();
                java.lang.String str2 = (java.lang.String) entry2.getValue();
                java.lang.Long l2 = (java.lang.Long) entry2.getKey();
                java.util.concurrent.ConcurrentHashMap concurrentHashMap = j$.time.format.A.f23650a;
                map3.put(str, new java.util.AbstractMap.SimpleImmutableEntry(str2, l2));
            }
            java.util.ArrayList arrayList2 = new java.util.ArrayList(map3.values());
            java.util.Collections.sort(arrayList2, j$.time.format.A.f23651b);
            map2.put((j$.time.format.F) entry.getKey(), arrayList2);
            arrayList.addAll(arrayList2);
            map2.put(null, arrayList);
        }
        java.util.Collections.sort(arrayList, j$.time.format.A.f23651b);
        this.f23750b = map2;
    }

    public final java.lang.String a(long j, j$.time.format.F f9) {
        java.util.Map map = (java.util.Map) this.f23749a.get(f9);
        if (map != null) {
            return (java.lang.String) map.get(java.lang.Long.valueOf(j));
        }
        return null;
    }
}
