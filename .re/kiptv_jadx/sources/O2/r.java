package O2;

/* JADX INFO: loaded from: classes.dex */
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.util.LinkedHashMap f7936a;

    public r(O2.s sVar) {
        java.util.Map map = sVar.f7938a;
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        for (java.util.Map.Entry entry : map.entrySet()) {
            linkedHashMap.put(entry.getKey(), p078i6.o.O1((java.util.Collection) entry.getValue()));
        }
        this.f7936a = linkedHashMap;
    }

    public void a(java.lang.String str) {
        java.lang.String lowerCase = "Cache-Control".toLowerCase(java.util.Locale.ROOT);
        kotlin.jvm.internal.m.d(lowerCase, "toLowerCase(...)");
        this.f7936a.put(lowerCase, p078i6.p.D0(str));
    }

    public r() {
        this.f7936a = new java.util.LinkedHashMap();
    }
}
