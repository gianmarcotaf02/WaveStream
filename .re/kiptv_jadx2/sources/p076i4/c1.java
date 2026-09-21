package p076i4;

import com.google.android.gms.internal.play_billing.AbstractC1864o0;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;
import java.util.Set;
import p068h4.l;

public class c1 extends AbstractCollection implements Set {

    public final Set f22878h;

    public final l f22879i;

    public c1(Set set, l lVar) {
        this.f22878h = set;
        this.f22879i = lVar;
    }

    @Override
    public final boolean add(Object obj) {
        AbstractC1864o0.L(this.f22879i.apply(obj));
        return this.f22878h.add(obj);
    }

    @Override
    public final boolean addAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            AbstractC1864o0.L(this.f22879i.apply(it.next()));
        }
        return this.f22878h.addAll(collection);
    }

    @Override
    public final void clear() {
        Set set = this.f22878h;
        boolean z6 = set instanceof RandomAccess;
        l lVar = this.f22879i;
        if (!z6 || !(set instanceof List)) {
            Iterator it = set.iterator();
            lVar.getClass();
            while (it.hasNext()) {
                if (lVar.apply(it.next())) {
                    it.remove();
                }
            }
            return;
        }
        List list = (List) set;
        lVar.getClass();
        int i3 = 0;
        for (int i9 = 0; i9 < list.size(); i9++) {
            Object obj = list.get(i9);
            if (!lVar.apply(obj)) {
                if (i9 > i3) {
                    try {
                        list.set(i3, obj);
                    } catch (IllegalArgumentException unused) {
                        AbstractC2230y.u(list, lVar, i3, i9);
                        return;
                    } catch (UnsupportedOperationException unused2) {
                        AbstractC2230y.u(list, lVar, i3, i9);
                        return;
                    }
                }
                i3++;
            }
        }
        list.subList(i3, list.size()).clear();
    }

    @Override
    public final boolean contains(Object obj) {
        boolean zContains;
        Set set = this.f22878h;
        set.getClass();
        try {
            zContains = set.contains(obj);
        } catch (ClassCastException | NullPointerException unused) {
            zContains = false;
        }
        if (zContains) {
            return this.f22879i.apply(obj);
        }
        return false;
    }

    @Override
    public final boolean containsAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override
    public final boolean equals(Object obj) {
        return AbstractC2230y.i(this, obj);
    }

    @Override
    public final int hashCode() {
        return AbstractC2230y.n(this);
    }

    @Override
    public final boolean isEmpty() {
        Iterator it = this.f22878h.iterator();
        l lVar = this.f22879i;
        AbstractC1864o0.U(lVar, "predicate");
        int i3 = 0;
        while (true) {
            if (!it.hasNext()) {
                i3 = -1;
                break;
            }
            if (lVar.apply(it.next())) {
                break;
            }
            i3++;
        }
        return true ^ (i3 != -1);
    }

    @Override
    public final Iterator iterator() {
        Iterator it = this.f22878h.iterator();
        it.getClass();
        l lVar = this.f22879i;
        lVar.getClass();
        return new C2217r0(it, lVar);
    }

    @Override
    public final boolean remove(Object obj) {
        return contains(obj) && this.f22878h.remove(obj);
    }

    @Override
    public final boolean removeAll(Collection collection) {
        Iterator it = this.f22878h.iterator();
        boolean z6 = false;
        while (it.hasNext()) {
            Object next = it.next();
            if (this.f22879i.apply(next) && collection.contains(next)) {
                it.remove();
                z6 = true;
            }
        }
        return z6;
    }

    @Override
    public final boolean retainAll(Collection collection) {
        Iterator it = this.f22878h.iterator();
        boolean z6 = false;
        while (it.hasNext()) {
            Object next = it.next();
            if (this.f22879i.apply(next) && !collection.contains(next)) {
                it.remove();
                z6 = true;
            }
        }
        return z6;
    }

    @Override
    public final int size() {
        Iterator it = this.f22878h.iterator();
        int i3 = 0;
        while (it.hasNext()) {
            if (this.f22879i.apply(it.next())) {
                i3++;
            }
        }
        return i3;
    }

    @Override
    public final Object[] toArray() {
        Iterator it = iterator();
        ArrayList arrayList = new ArrayList();
        while (true) {
            C2217r0 c2217r0 = (C2217r0) it;
            if (!c2217r0.hasNext()) {
                return arrayList.toArray();
            }
            arrayList.add(c2217r0.next());
        }
    }

    @Override
    public final Object[] toArray(Object[] objArr) {
        Iterator it = iterator();
        ArrayList arrayList = new ArrayList();
        while (true) {
            C2217r0 c2217r0 = (C2217r0) it;
            if (c2217r0.hasNext()) {
                arrayList.add(c2217r0.next());
            } else {
                return arrayList.toArray(objArr);
            }
        }
    }
}
