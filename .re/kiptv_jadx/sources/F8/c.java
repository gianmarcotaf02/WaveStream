package F8;

/* JADX INFO: loaded from: classes4.dex */
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final java.util.concurrent.CopyOnWriteArraySet f3722a = new java.util.concurrent.CopyOnWriteArraySet();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final java.util.Map f3723b;

    static {
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        java.lang.Package r9 = w8.s.class.getPackage();
        java.lang.String name = r9 != null ? r9.getName() : null;
        if (name != null) {
            linkedHashMap.put(name, "OkHttp");
        }
        linkedHashMap.put(w8.s.class.getName(), "okhttp.OkHttpClient");
        linkedHashMap.put(D8.f.class.getName(), "okhttp.Http2");
        linkedHashMap.put(z8.c.class.getName(), "okhttp.TaskRunner");
        linkedHashMap.put("okhttp3.mockwebserver.MockWebServer", "okhttp.MockWebServer");
        f3723b = p078i6.C.Y0(linkedHashMap);
    }
}
