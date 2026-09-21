package S4;

public abstract class q {

    public static volatile Object f9432a;

    public static volatile Object f9433b;

    public static volatile Object f9434c;

    public static volatile Object f9435d;

    public static volatile int f9436e;

    static {
        p078i6.x xVar = p078i6.x.f23206h;
        f9432a = xVar;
        f9433b = xVar;
        f9434c = xVar;
        f9435d = xVar;
    }

    public static String a(String displayKey) {
        kotlin.jvm.internal.m.e(displayKey, "displayKey");
        return (String) f9434c.get(displayKey);
    }

    public static Integer b(String displayKey) {
        kotlin.jvm.internal.m.e(displayKey, "displayKey");
        return (Integer) f9435d.get(displayKey);
    }

    public static String c(String displayKey) {
        kotlin.jvm.internal.m.e(displayKey, "displayKey");
        return (String) f9433b.get(displayKey);
    }
}
