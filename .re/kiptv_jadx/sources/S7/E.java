package S7;

/* JADX INFO: loaded from: classes4.dex */
public abstract class E {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final S7.H f9539a;

    static {
        java.lang.String property;
        T7.e eVar;
        S7.H h9;
        int i3 = X7.s.f10935a;
        try {
            property = java.lang.System.getProperty("kotlinx.coroutines.main.delay");
        } catch (java.lang.SecurityException unused) {
            property = null;
        }
        if (property != null ? java.lang.Boolean.parseBoolean(property) : false) {
            Z7.e eVar2 = S7.M.f9549a;
            eVar = X7.m.f10930a;
            T7.e eVar3 = eVar.f9882l;
            if (eVar == null) {
                h9 = eVar;
                h9 = S7.D.f9535p;
            }
        } else {
            h9 = S7.D.f9535p;
        }
        h9 = eVar;
        f9539a = h9;
    }
}
