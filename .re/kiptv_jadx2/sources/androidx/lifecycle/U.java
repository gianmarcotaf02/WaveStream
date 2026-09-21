package androidx.lifecycle;

import V7.n0;
import java.util.LinkedHashMap;

public final class U {

    public final LinkedHashMap f16318a;

    public final E2.d f16319b;

    public U(p086j6.e eVar) {
        this.f16318a = new LinkedHashMap();
        this.f16319b = new E2.d(eVar);
    }

    public final Object a(String str) {
        Object value;
        E2.d dVar = this.f16319b;
        LinkedHashMap linkedHashMap = (LinkedHashMap) dVar.f2771h;
        LinkedHashMap linkedHashMap2 = (LinkedHashMap) dVar.f2773k;
        try {
            V7.U u6 = (V7.U) linkedHashMap2.get(str);
            if (u6 != null && (value = ((n0) u6).getValue()) != null) {
                return value;
            }
            return linkedHashMap.get(str);
        } catch (ClassCastException unused) {
            linkedHashMap.remove(str);
            ((LinkedHashMap) dVar.j).remove(str);
            linkedHashMap2.remove(str);
            return null;
        }
    }

    public U() {
        this.f16318a = new LinkedHashMap();
        this.f16319b = new E2.d(p078i6.x.f23206h);
    }
}
