package p076i4;

import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.SortedSet;
import p068h4.l;

public final class d1 extends c1 implements SortedSet {
    @Override
    public final Comparator comparator() {
        return ((SortedSet) this.f22878h).comparator();
    }

    @Override
    public final Object first() {
        Iterator it = this.f22878h.iterator();
        it.getClass();
        l lVar = this.f22879i;
        lVar.getClass();
        while (it.hasNext()) {
            Object next = it.next();
            if (lVar.apply(next)) {
                return next;
            }
        }
        throw new NoSuchElementException();
    }

    @Override
    public final SortedSet headSet(Object obj) {
        return new d1(((SortedSet) this.f22878h).headSet(obj), this.f22879i);
    }

    @Override
    public final Object last() {
        SortedSet sortedSetHeadSet = (SortedSet) this.f22878h;
        while (true) {
            Object objLast = sortedSetHeadSet.last();
            if (this.f22879i.apply(objLast)) {
                return objLast;
            }
            sortedSetHeadSet = sortedSetHeadSet.headSet(objLast);
        }
    }

    @Override
    public final SortedSet subSet(Object obj, Object obj2) {
        return new d1(((SortedSet) this.f22878h).subSet(obj, obj2), this.f22879i);
    }

    @Override
    public final SortedSet tailSet(Object obj) {
        return new d1(((SortedSet) this.f22878h).tailSet(obj), this.f22879i);
    }
}
