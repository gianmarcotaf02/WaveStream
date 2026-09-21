package S7;

public abstract class E {

    public static final H f9539a;

    static {
        String property;
        T7.e eVar;
        H h9;
        int i3 = X7.s.f10935a;
        try {
            property = System.getProperty("kotlinx.coroutines.main.delay");
        } catch (SecurityException unused) {
            property = null;
        }
        if (property != null ? Boolean.parseBoolean(property) : false) {
            Z7.e eVar2 = M.f9549a;
            eVar = X7.m.f10930a;
            T7.e eVar3 = eVar.f9882l;
            if (eVar == null) {
                h9 = eVar;
                h9 = D.f9535p;
            }
        } else {
            h9 = D.f9535p;
        }
        h9 = eVar;
        f9539a = h9;
    }
}
