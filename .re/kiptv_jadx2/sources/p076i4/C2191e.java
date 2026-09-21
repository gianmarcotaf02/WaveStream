package p076i4;

import com.google.android.gms.internal.play_billing.AbstractC1864o0;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;

public class C2191e implements Iterator {

    public final int f22885h = 0;

    public final Iterator f22886i;
    public Object j;

    public final Object f22887k;

    public C2191e(AbstractC2207m abstractC2207m) {
        this.f22887k = abstractC2207m;
        Collection collection = abstractC2207m.f22918i;
        this.j = collection;
        this.f22886i = collection instanceof List ? ((List) collection).listIterator() : collection.iterator();
    }

    public void a() {
        AbstractC2207m abstractC2207m = (AbstractC2207m) this.f22887k;
        abstractC2207m.e();
        if (abstractC2207m.f22918i != ((Collection) this.j)) {
            throw new ConcurrentModificationException();
        }
    }

    @Override
    public final boolean hasNext() {
        switch (this.f22885h) {
            case 0:
                break;
            case 1:
                break;
            default:
                a();
                break;
        }
        return this.f22886i.hasNext();
    }

    @Override
    public final Object next() {
        switch (this.f22885h) {
            case 0:
                Map.Entry entry = (Map.Entry) this.f22886i.next();
                this.j = (Collection) entry.getValue();
                return ((C2193f) this.f22887k).a(entry);
            case 1:
                Map.Entry entry2 = (Map.Entry) this.f22886i.next();
                this.j = entry2;
                return entry2.getKey();
            default:
                a();
                return this.f22886i.next();
        }
    }

    @Override
    public final void remove() {
        switch (this.f22885h) {
            case 0:
                AbstractC1864o0.Z(((Collection) this.j) != null, "no calls to next() since the last call to remove()");
                this.f22886i.remove();
                C2193f c2193f = (C2193f) this.f22887k;
                c2193f.f22893k.f22930m -= ((Collection) this.j).size();
                ((Collection) this.j).clear();
                this.j = null;
                break;
            case 1:
                AbstractC1864o0.Z(((Map.Entry) this.j) != null, "no calls to next() since the last call to remove()");
                Collection collection = (Collection) ((Map.Entry) this.j).getValue();
                this.f22886i.remove();
                C2195g c2195g = (C2195g) this.f22887k;
                c2195g.f22898i.f22930m -= collection.size();
                collection.clear();
                this.j = null;
                break;
            default:
                this.f22886i.remove();
                AbstractC2207m abstractC2207m = (AbstractC2207m) this.f22887k;
                abstractC2207m.f22920l.f22930m--;
                abstractC2207m.f();
                break;
        }
    }

    public C2191e(C2211o c2211o, ListIterator listIterator) {
        this.f22887k = c2211o;
        this.j = c2211o.f22918i;
        this.f22886i = listIterator;
    }

    public C2191e(C2195g c2195g, Iterator it) {
        this.f22886i = it;
        this.f22887k = c2195g;
    }

    public C2191e(C2193f c2193f) {
        this.f22887k = c2193f;
        this.f22886i = c2193f.j.entrySet().iterator();
    }
}
