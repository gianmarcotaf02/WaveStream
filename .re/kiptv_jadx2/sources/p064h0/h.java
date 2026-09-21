package p064h0;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import kotlin.jvm.internal.m;
import p086j6.c;
import p086j6.e;
import p089k0.i;
import p201y6.b;

public final class h extends AbstractCollection implements Collection, b {

    public final int f22442h;

    public final Object f22443i;

    public h(int i3, Object obj) {
        this.f22442h = i3;
        this.f22443i = obj;
    }

    @Override
    public final boolean add(Object obj) {
        switch (this.f22442h) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override
    public boolean addAll(Collection elements) {
        switch (this.f22442h) {
            case 1:
                m.e(elements, "elements");
                throw new UnsupportedOperationException();
            default:
                return super.addAll(elements);
        }
    }

    @Override
    public final void clear() {
        switch (this.f22442h) {
            case 0:
                ((i) this.f22443i).clear();
                break;
            default:
                ((e) this.f22443i).clear();
                break;
        }
    }

    @Override
    public final boolean contains(Object obj) {
        switch (this.f22442h) {
            case 0:
                return ((i) this.f22443i).containsValue(obj);
            default:
                return ((e) this.f22443i).containsValue(obj);
        }
    }

    @Override
    public boolean isEmpty() {
        switch (this.f22442h) {
            case 1:
                return ((e) this.f22443i).isEmpty();
            default:
                return super.isEmpty();
        }
    }

    @Override
    public final Iterator iterator() {
        switch (this.f22442h) {
            case 0:
                l[] lVarArr = new l[8];
                for (int i3 = 0; i3 < 8; i3++) {
                    lVarArr[i3] = new m(2);
                }
                return new g((i) this.f22443i, lVarArr);
            default:
                e eVar = (e) this.f22443i;
                eVar.getClass();
                return new c(eVar, 2);
        }
    }

    @Override
    public boolean remove(Object obj) {
        switch (this.f22442h) {
            case 1:
                e eVar = (e) this.f22443i;
                eVar.c();
                int iL = eVar.l(obj);
                if (iL < 0) {
                    return false;
                }
                eVar.o(iL);
                return true;
            default:
                return super.remove(obj);
        }
    }

    @Override
    public boolean removeAll(Collection elements) {
        switch (this.f22442h) {
            case 1:
                m.e(elements, "elements");
                ((e) this.f22443i).c();
                break;
        }
        return super.removeAll(elements);
    }

    @Override
    public boolean retainAll(Collection elements) {
        switch (this.f22442h) {
            case 1:
                m.e(elements, "elements");
                ((e) this.f22443i).c();
                break;
        }
        return super.retainAll(elements);
    }

    @Override
    public final int size() {
        switch (this.f22442h) {
            case 0:
                i iVar = (i) this.f22443i;
                iVar.getClass();
                return iVar.f24420l;
            default:
                return ((e) this.f22443i).f24248p;
        }
    }
}
