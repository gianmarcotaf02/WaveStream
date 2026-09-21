package p076i4;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

public final class C2187c implements Iterator {

    public final Iterator f22871h;

    public Object f22872i = null;
    public Collection j = null;

    public Iterator f22873k = EnumC2223u0.f22942h;

    public final AbstractC2215q f22874l;

    public final int f22875m;

    public C2187c(AbstractC2215q abstractC2215q, int i3) {
        this.f22875m = i3;
        this.f22874l = abstractC2215q;
        this.f22871h = abstractC2215q.f22929l.entrySet().iterator();
    }

    @Override
    public final boolean hasNext() {
        return this.f22871h.hasNext() || this.f22873k.hasNext();
    }

    @Override
    public final Object next() {
        if (!this.f22873k.hasNext()) {
            Map.Entry entry = (Map.Entry) this.f22871h.next();
            this.f22872i = entry.getKey();
            Collection collection = (Collection) entry.getValue();
            this.j = collection;
            this.f22873k = collection.iterator();
        }
        Object obj = this.f22872i;
        Object next = this.f22873k.next();
        switch (this.f22875m) {
            case 0:
                return next;
            default:
                return new X(obj, next);
        }
    }

    @Override
    public final void remove() {
        this.f22873k.remove();
        Collection collection = this.j;
        Objects.requireNonNull(collection);
        if (collection.isEmpty()) {
            this.f22871h.remove();
        }
        this.f22874l.f22930m--;
    }
}
