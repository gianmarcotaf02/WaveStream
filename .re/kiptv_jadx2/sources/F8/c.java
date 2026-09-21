package F8;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArraySet;
import p078i6.C;
import w8.s;

public abstract class c {

    public static final CopyOnWriteArraySet f3722a = new CopyOnWriteArraySet();

    public static final Map f3723b;

    static {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Package r9 = s.class.getPackage();
        String name = r9 != null ? r9.getName() : null;
        if (name != null) {
            linkedHashMap.put(name, "OkHttp");
        }
        linkedHashMap.put(s.class.getName(), "okhttp.OkHttpClient");
        linkedHashMap.put(D8.f.class.getName(), "okhttp.Http2");
        linkedHashMap.put(z8.c.class.getName(), "okhttp.TaskRunner");
        linkedHashMap.put("okhttp3.mockwebserver.MockWebServer", "okhttp.MockWebServer");
        f3723b = C.Y0(linkedHashMap);
    }
}
