package S4;

/* JADX INFO: loaded from: classes.dex */
public abstract class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static volatile java.lang.Object f9432a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static volatile java.lang.Object f9433b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static volatile java.lang.Object f9434c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static volatile java.lang.Object f9435d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static volatile int f9436e;

    static {
        p078i6.x xVar = p078i6.x.f23206h;
        f9432a = xVar;
        f9433b = xVar;
        f9434c = xVar;
        f9435d = xVar;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Map] */
    public static java.lang.String a(java.lang.String displayKey) {
        kotlin.jvm.internal.m.e(displayKey, "displayKey");
        return (java.lang.String) f9434c.get(displayKey);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Map] */
    public static java.lang.Integer b(java.lang.String displayKey) {
        kotlin.jvm.internal.m.e(displayKey, "displayKey");
        return (java.lang.Integer) f9435d.get(displayKey);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Map] */
    public static java.lang.String c(java.lang.String displayKey) {
        kotlin.jvm.internal.m.e(displayKey, "displayKey");
        return (java.lang.String) f9433b.get(displayKey);
    }
}
