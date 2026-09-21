package p035d7;

/* JADX INFO: loaded from: classes4.dex */
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.util.LinkedHashMap f21297a;

    public r(java.util.LinkedHashMap linkedHashMap) {
        this.f21297a = linkedHashMap;
    }

    public final p035d7.r a() {
        java.util.LinkedHashMap linkedHashMap = this.f21297a;
        java.util.LinkedHashMap linkedHashMap2 = new java.util.LinkedHashMap(p078i6.D.I0(linkedHashMap.size()));
        for (java.util.Map.Entry entry : linkedHashMap.entrySet()) {
            java.lang.Object key = entry.getKey();
            p035d7.d dVar = (p035d7.d) entry.getValue();
            linkedHashMap2.put(key, new p035d7.d(dVar.f21255a, dVar.f21256b, dVar.f21257c, true));
        }
        return new p035d7.r(linkedHashMap2);
    }
}
