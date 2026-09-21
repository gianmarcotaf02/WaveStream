package p076i4;

import com.google.android.gms.internal.play_billing.AbstractC1853k0;
import java.util.AbstractMap;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

public final class C2189d extends e1 {

    public final int f22880h;

    public final AbstractMap f22881i;

    public C2189d(AbstractMap abstractMap, int i3) {
        this.f22880h = i3;
        this.f22881i = abstractMap;
    }

    @Override
    public final void clear() {
        e().clear();
    }

    @Override
    public boolean contains(Object obj) {
        switch (this.f22880h) {
            case 0:
                Set setEntrySet = ((C2193f) this.f22881i).j.entrySet();
                setEntrySet.getClass();
                try {
                    return setEntrySet.contains(obj);
                } catch (ClassCastException | NullPointerException unused) {
                    return false;
                }
            default:
                return d(obj);
        }
    }

    public final boolean d(Object obj) {
        Object obj2;
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Object key = entry.getKey();
        Map mapE = e();
        mapE.getClass();
        try {
            obj2 = mapE.get(key);
        } catch (ClassCastException | NullPointerException unused) {
            obj2 = null;
        }
        if (AbstractC1853k0.m(obj2, entry.getValue())) {
            return obj2 != null || e().containsKey(key);
        }
        return false;
    }

    public final Map e() {
        switch (this.f22880h) {
            case 0:
                return (C2193f) this.f22881i;
            default:
                return (F0) this.f22881i;
        }
    }

    public final boolean f(Object obj) {
        if (contains(obj) && (obj instanceof Map.Entry)) {
            return e().keySet().remove(((Map.Entry) obj).getKey());
        }
        return false;
    }

    @Override
    public final boolean isEmpty() {
        return e().isEmpty();
    }

    @Override
    public final Iterator iterator() {
        switch (this.f22880h) {
            case 0:
                return new C2191e((C2193f) this.f22881i);
            default:
                return ((F0) this.f22881i).b();
        }
    }

    @Override
    public boolean remove(Object obj) {
        Object objRemove;
        switch (this.f22880h) {
            case 0:
                if (!contains(obj)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                Objects.requireNonNull(entry);
                AbstractC2215q abstractC2215q = ((C2193f) this.f22881i).f22893k;
                Object key = entry.getKey();
                Map map = abstractC2215q.f22929l;
                map.getClass();
                try {
                    objRemove = map.remove(key);
                    break;
                } catch (ClassCastException | NullPointerException unused) {
                    objRemove = null;
                }
                Collection collection = (Collection) objRemove;
                if (collection != null) {
                    int size = collection.size();
                    collection.clear();
                    abstractC2215q.f22930m -= size;
                }
                return true;
            default:
                return f(obj);
        }
    }

    @Override
    public final boolean removeAll(Collection collection) {
        try {
            collection.getClass();
            return AbstractC2230y.t(this, collection);
        } catch (UnsupportedOperationException unused) {
            Iterator it = collection.iterator();
            boolean zRemove = false;
            while (it.hasNext()) {
                zRemove |= remove(it.next());
            }
            return zRemove;
        }
    }

    @Override
    public final boolean retainAll(Collection collection) {
        try {
            collection.getClass();
            return super.retainAll(collection);
        } catch (UnsupportedOperationException unused) {
            HashSet hashSet = new HashSet(AbstractC2230y.a(collection.size()));
            for (Object obj : collection) {
                if (contains(obj) && (obj instanceof Map.Entry)) {
                    hashSet.add(((Map.Entry) obj).getKey());
                }
            }
            return e().keySet().retainAll(hashSet);
        }
    }

    @Override
    public final int size() {
        return e().size();
    }
}
