package p064h0;

import D0.G;
import java.util.NoSuchElementException;
import p089k0.i;

public final class b extends a {

    public final G f22430k;

    public Object f22431l;

    public b(G g, Object obj, Object obj2) {
        super(obj, obj2, 0);
        this.f22430k = g;
        this.f22431l = obj2;
    }

    @Override
    public final Object getValue() {
        return this.f22431l;
    }

    @Override
    public final Object setValue(Object obj) {
        Object obj2 = this.f22431l;
        this.f22431l = obj;
        e eVar = (e) this.f22430k.f1810i;
        i iVar = eVar.f22436k;
        Object obj3 = this.f22429i;
        if (!iVar.containsKey(obj3)) {
            return obj2;
        }
        boolean z6 = eVar.j;
        if (!z6) {
            iVar.put(obj3, obj);
        } else {
            if (!z6) {
                throw new NoSuchElementException();
            }
            l lVar = eVar.f22434h[eVar.f22435i];
            Object obj4 = lVar.f22451h[lVar.j];
            iVar.put(obj3, obj);
            eVar.c(obj4 != null ? obj4.hashCode() : 0, iVar.f24418i, obj4, 0);
        }
        eVar.f22439n = iVar.f24419k;
        return obj2;
    }
}
