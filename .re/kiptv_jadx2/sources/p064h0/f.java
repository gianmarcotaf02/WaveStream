package p064h0;

import D0.G;
import java.util.Iterator;
import java.util.Map;
import p078i6.AbstractC2258i;
import p089k0.i;

public final class f extends AbstractC2258i {

    public final int f22440h;

    public final i f22441i;

    public f(int i3, i iVar) {
        this.f22440h = i3;
        this.f22441i = iVar;
    }

    @Override
    public final boolean add(Object obj) {
        switch (this.f22440h) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override
    public final void clear() {
        switch (this.f22440h) {
            case 0:
                this.f22441i.clear();
                break;
            default:
                this.f22441i.clear();
                break;
        }
    }

    @Override
    public final boolean contains(Object obj) {
        switch (this.f22440h) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                if ((entry != null ? entry : null) == null) {
                    return false;
                }
                Object key = entry.getKey();
                i iVar = this.f22441i;
                Object obj2 = iVar.get(key);
                if (obj2 != null) {
                    return obj2.equals(entry.getValue());
                }
                return entry.getValue() == null && iVar.containsKey(entry.getKey());
            default:
                return this.f22441i.containsKey(obj);
        }
    }

    @Override
    public final int d() {
        switch (this.f22440h) {
            case 0:
                i iVar = this.f22441i;
                iVar.getClass();
                return iVar.f24420l;
            default:
                i iVar2 = this.f22441i;
                iVar2.getClass();
                return iVar2.f24420l;
        }
    }

    @Override
    public final Iterator iterator() {
        switch (this.f22440h) {
            case 0:
                return new G(this.f22441i);
            default:
                l[] lVarArr = new l[8];
                for (int i3 = 0; i3 < 8; i3++) {
                    lVarArr[i3] = new m(1);
                }
                return new g(this.f22441i, lVarArr);
        }
    }

    @Override
    public final boolean remove(Object obj) {
        switch (this.f22440h) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                if ((entry != null ? entry : null) == null) {
                    return false;
                }
                return this.f22441i.remove(entry.getKey(), entry.getValue());
            default:
                i iVar = this.f22441i;
                if (!iVar.containsKey(obj)) {
                    return false;
                }
                iVar.remove(obj);
                return true;
        }
    }
}
