package p076i4;

import com.google.android.gms.internal.play_billing.AbstractC1853k0;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

public class C2218s extends AbstractCollection {

    public final int f22935h;

    public final Object f22936i;

    public C2218s(int i3, Object obj) {
        this.f22935h = i3;
        this.f22936i = obj;
    }

    @Override
    public final void clear() {
        switch (this.f22935h) {
            case 0:
                ((AbstractC2222u) this.f22936i).clear();
                break;
            case 1:
                ((AbstractC2215q) this.f22936i).clear();
                break;
            case 2:
                ((D) this.f22936i).clear();
                break;
            default:
                ((AbstractMap) this.f22936i).clear();
                break;
        }
    }

    @Override
    public boolean contains(Object obj) {
        switch (this.f22935h) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                return ((AbstractC2222u) this.f22936i).b(entry.getKey(), entry.getValue());
            case 1:
                return ((AbstractC2215q) this.f22936i).c(obj);
            case 2:
            default:
                return super.contains(obj);
            case 3:
                return ((AbstractMap) this.f22936i).containsValue(obj);
        }
    }

    @Override
    public boolean isEmpty() {
        switch (this.f22935h) {
            case 3:
                return ((AbstractMap) this.f22936i).isEmpty();
            default:
                return super.isEmpty();
        }
    }

    @Override
    public final Iterator iterator() {
        switch (this.f22935h) {
            case 0:
                return ((AbstractC2222u) this.f22936i).h();
            case 1:
                return new C2187c((AbstractC2215q) this.f22936i, 0);
            case 2:
                D d4 = (D) this.f22936i;
                Map mapC = d4.c();
                return mapC != null ? mapC.values().iterator() : new A(d4, 2);
            default:
                return new D0(((AbstractMap) this.f22936i).entrySet().iterator(), 1);
        }
    }

    @Override
    public boolean remove(Object obj) {
        switch (this.f22935h) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                return ((AbstractC2222u) this.f22936i).remove(entry.getKey(), entry.getValue());
            case 3:
                try {
                    return super.remove(obj);
                } catch (UnsupportedOperationException unused) {
                    AbstractMap abstractMap = (AbstractMap) this.f22936i;
                    for (Map.Entry entry2 : abstractMap.entrySet()) {
                        if (AbstractC1853k0.m(obj, entry2.getValue())) {
                            abstractMap.remove(entry2.getKey());
                            return true;
                        }
                    }
                    return false;
                }
            default:
                return super.remove(obj);
        }
    }

    @Override
    public boolean removeAll(Collection collection) {
        switch (this.f22935h) {
            case 3:
                try {
                    collection.getClass();
                    return super.removeAll(collection);
                } catch (UnsupportedOperationException unused) {
                    HashSet hashSet = new HashSet();
                    AbstractMap abstractMap = (AbstractMap) this.f22936i;
                    for (Map.Entry entry : abstractMap.entrySet()) {
                        if (collection.contains(entry.getValue())) {
                            hashSet.add(entry.getKey());
                        }
                    }
                    return abstractMap.keySet().removeAll(hashSet);
                }
            default:
                return super.removeAll(collection);
        }
    }

    @Override
    public boolean retainAll(Collection collection) {
        switch (this.f22935h) {
            case 3:
                try {
                    collection.getClass();
                    return super.retainAll(collection);
                } catch (UnsupportedOperationException unused) {
                    HashSet hashSet = new HashSet();
                    AbstractMap abstractMap = (AbstractMap) this.f22936i;
                    for (Map.Entry entry : abstractMap.entrySet()) {
                        if (collection.contains(entry.getValue())) {
                            hashSet.add(entry.getKey());
                        }
                    }
                    return abstractMap.keySet().retainAll(hashSet);
                }
            default:
                return super.retainAll(collection);
        }
    }

    @Override
    public final int size() {
        switch (this.f22935h) {
            case 0:
                return ((AbstractC2222u) this.f22936i).size();
            case 1:
                return ((AbstractC2215q) this.f22936i).f22930m;
            case 2:
                return ((D) this.f22936i).size();
            default:
                return ((AbstractMap) this.f22936i).size();
        }
    }

    public C2218s(AbstractMap abstractMap) {
        this.f22935h = 3;
        this.f22936i = abstractMap;
    }
}
