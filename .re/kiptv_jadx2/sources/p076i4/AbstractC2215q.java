package p076i4;

import com.google.android.gms.internal.play_billing.AbstractC1864o0;
import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public abstract class AbstractC2215q extends AbstractC2222u implements Serializable {

    public final transient Map f22929l;

    public transient int f22930m;

    public AbstractC2215q(Map map) {
        AbstractC1864o0.L(map.isEmpty());
        this.f22929l = map;
    }

    @Override
    public final void clear() {
        Map map = this.f22929l;
        Iterator it = map.values().iterator();
        while (it.hasNext()) {
            ((Collection) it.next()).clear();
        }
        map.clear();
        this.f22930m = 0;
    }

    @Override
    public Map d() {
        return new C2193f(this, this.f22929l);
    }

    @Override
    public final Collection e() {
        return this instanceof Q ? new C2220t(0, this) : new C2218s(0, this);
    }

    @Override
    public Set f() {
        return new C2195g(this, this.f22929l);
    }

    @Override
    public final Collection g() {
        return new C2218s(1, this);
    }

    @Override
    public Collection get(Object obj) {
        Collection collectionJ = (Collection) this.f22929l.get(obj);
        if (collectionJ == null) {
            collectionJ = j();
        }
        return k(obj, collectionJ);
    }

    @Override
    public final Iterator h() {
        return new C2187c(this, 1);
    }

    public abstract Collection j();

    public abstract Collection k(Object obj, Collection collection);

    @Override
    public boolean put(Object obj, Object obj2) {
        Map map = this.f22929l;
        Collection collection = (Collection) map.get(obj);
        if (collection != null) {
            if (!collection.add(obj2)) {
                return false;
            }
            this.f22930m++;
            return true;
        }
        Collection collectionJ = j();
        if (!collectionJ.add(obj2)) {
            throw new AssertionError("New Collection violated the Collection spec");
        }
        this.f22930m++;
        map.put(obj, collectionJ);
        return true;
    }

    @Override
    public final int size() {
        return this.f22930m;
    }
}
