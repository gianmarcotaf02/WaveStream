package p076i4;

import java.util.Collection;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

public class C2211o extends AbstractC2207m implements List {

    public final AbstractC2215q f22926m;

    public C2211o(AbstractC2215q abstractC2215q, Object obj, List list, C2211o c2211o) {
        super(abstractC2215q, obj, list, c2211o);
        this.f22926m = abstractC2215q;
    }

    @Override
    public final void add(int i3, Object obj) {
        e();
        boolean zIsEmpty = this.f22918i.isEmpty();
        ((List) this.f22918i).add(i3, obj);
        this.f22926m.f22930m++;
        if (zIsEmpty) {
            d();
        }
    }

    @Override
    public final boolean addAll(int i3, Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean zAddAll = ((List) this.f22918i).addAll(i3, collection);
        if (zAddAll) {
            this.f22926m.f22930m += this.f22918i.size() - size;
            if (size == 0) {
                d();
            }
        }
        return zAddAll;
    }

    @Override
    public final Object get(int i3) {
        e();
        return ((List) this.f22918i).get(i3);
    }

    @Override
    public final int indexOf(Object obj) {
        e();
        return ((List) this.f22918i).indexOf(obj);
    }

    @Override
    public final int lastIndexOf(Object obj) {
        e();
        return ((List) this.f22918i).lastIndexOf(obj);
    }

    @Override
    public final ListIterator listIterator() {
        e();
        return new C2209n(this);
    }

    @Override
    public final Object remove(int i3) {
        e();
        Object objRemove = ((List) this.f22918i).remove(i3);
        this.f22926m.f22930m--;
        f();
        return objRemove;
    }

    @Override
    public final Object set(int i3, Object obj) {
        e();
        return ((List) this.f22918i).set(i3, obj);
    }

    @Override
    public final List subList(int i3, int i9) {
        e();
        List listSubList = ((List) this.f22918i).subList(i3, i9);
        C2211o c2211o = this.j;
        if (c2211o == null) {
            c2211o = this;
        }
        AbstractC2215q abstractC2215q = this.f22926m;
        abstractC2215q.getClass();
        boolean z6 = listSubList instanceof RandomAccess;
        Object obj = this.f22917h;
        return z6 ? new C2201j(abstractC2215q, obj, listSubList, c2211o) : new C2211o(abstractC2215q, obj, listSubList, c2211o);
    }

    @Override
    public final ListIterator listIterator(int i3) {
        e();
        return new C2209n(this, i3);
    }
}
