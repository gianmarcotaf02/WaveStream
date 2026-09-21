package p064h0;

import java.util.Iterator;
import java.util.Map;
import p078i6.AbstractC2259j;

public final class i extends AbstractC2259j {

    public final int f22444h;

    public final c f22445i;

    public i(c cVar, int i3) {
        this.f22444h = i3;
        this.f22445i = cVar;
    }

    @Override
    public final boolean contains(Object obj) {
        Map.Entry entry;
        switch (this.f22444h) {
            case 0:
                if (!(obj instanceof Map.Entry) || (entry = (Map.Entry) obj) == null) {
                    return false;
                }
                Object key = entry.getKey();
                c cVar = this.f22445i;
                Object obj2 = cVar.get(key);
                if (obj2 != null) {
                    return obj2.equals(entry.getValue());
                }
                return entry.getValue() == null && cVar.containsKey(entry.getKey());
            default:
                return this.f22445i.containsKey(obj);
        }
    }

    @Override
    public final int d() {
        switch (this.f22444h) {
            case 0:
                c cVar = this.f22445i;
                cVar.getClass();
                return cVar.f22433i;
            default:
                c cVar2 = this.f22445i;
                cVar2.getClass();
                return cVar2.f22433i;
        }
    }

    @Override
    public final Iterator iterator() {
        switch (this.f22444h) {
            case 0:
                c cVar = this.f22445i;
                l[] lVarArr = new l[8];
                for (int i3 = 0; i3 < 8; i3++) {
                    lVarArr[i3] = new m(0);
                }
                return new j(cVar.f22432h, lVarArr);
            default:
                c cVar2 = this.f22445i;
                l[] lVarArr2 = new l[8];
                for (int i9 = 0; i9 < 8; i9++) {
                    lVarArr2[i9] = new m(1);
                }
                return new j(cVar2.f22432h, lVarArr2);
        }
    }
}
