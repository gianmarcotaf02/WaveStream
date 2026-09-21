package p056g0;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import p078i6.AbstractC2254e;
import p201y6.a;

public abstract class c extends AbstractC2254e implements List, Collection, a {
    @Override
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override
    public final boolean containsAll(Collection collection) {
        Collection collection2 = collection;
        if ((collection2 instanceof Collection) && collection2.isEmpty()) {
            return true;
        }
        Iterator it = collection2.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    public abstract c e(int i3, Object obj);

    @Override
    public final Iterator iterator() {
        return listIterator(0);
    }

    @Override
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    public abstract c n(Object obj);

    public c o(Collection collection) {
        f fVarP = p();
        fVarP.addAll(collection);
        return fVarP.n();
    }

    public abstract f p();

    public abstract c q(b bVar);

    public abstract c r(int i3);

    public abstract c s(int i3, Object obj);

    @Override
    public final List subList(int i3, int i9) {
        return new p047f0.a(this, i3, i9);
    }
}
