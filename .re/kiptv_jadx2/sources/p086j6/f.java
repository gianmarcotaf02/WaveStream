package p086j6;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.m;
import p078i6.AbstractC2258i;

public final class f extends AbstractC2258i {

    public final int f24253h;

    public final e f24254i;

    public f(e eVar, int i3) {
        this.f24253h = i3;
        this.f24254i = eVar;
    }

    @Override
    public final boolean add(Object obj) {
        switch (this.f24253h) {
            case 0:
                Map.Entry element = (Map.Entry) obj;
                m.e(element, "element");
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override
    public final boolean addAll(Collection elements) {
        switch (this.f24253h) {
            case 0:
                m.e(elements, "elements");
                throw new UnsupportedOperationException();
            default:
                m.e(elements, "elements");
                throw new UnsupportedOperationException();
        }
    }

    @Override
    public final void clear() {
        switch (this.f24253h) {
            case 0:
                this.f24254i.clear();
                break;
            default:
                this.f24254i.clear();
                break;
        }
    }

    @Override
    public final boolean contains(Object obj) {
        switch (this.f24253h) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry element = (Map.Entry) obj;
                m.e(element, "element");
                return this.f24254i.g(element);
            default:
                return this.f24254i.containsKey(obj);
        }
    }

    @Override
    public boolean containsAll(Collection elements) {
        switch (this.f24253h) {
            case 0:
                m.e(elements, "elements");
                return this.f24254i.e(elements);
            default:
                return super.containsAll(elements);
        }
    }

    @Override
    public final int d() {
        switch (this.f24253h) {
            case 0:
                break;
        }
        return this.f24254i.f24248p;
    }

    @Override
    public final boolean isEmpty() {
        switch (this.f24253h) {
            case 0:
                break;
        }
        return this.f24254i.isEmpty();
    }

    @Override
    public final Iterator iterator() {
        switch (this.f24253h) {
            case 0:
                e eVar = this.f24254i;
                eVar.getClass();
                return new c(eVar, 0);
            default:
                e eVar2 = this.f24254i;
                eVar2.getClass();
                return new c(eVar2, 1);
        }
    }

    @Override
    public final boolean remove(Object obj) {
        switch (this.f24253h) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry element = (Map.Entry) obj;
                m.e(element, "element");
                e eVar = this.f24254i;
                eVar.getClass();
                eVar.c();
                int iJ = eVar.j(element.getKey());
                if (iJ < 0) {
                    return false;
                }
                Object[] objArr = eVar.f24242i;
                m.b(objArr);
                if (!m.a(objArr[iJ], element.getValue())) {
                    return false;
                }
                eVar.o(iJ);
                return true;
            default:
                e eVar2 = this.f24254i;
                eVar2.c();
                int iJ2 = eVar2.j(obj);
                if (iJ2 < 0) {
                    return false;
                }
                eVar2.o(iJ2);
                return true;
        }
    }

    @Override
    public final boolean removeAll(Collection elements) {
        switch (this.f24253h) {
            case 0:
                m.e(elements, "elements");
                this.f24254i.c();
                break;
            default:
                m.e(elements, "elements");
                this.f24254i.c();
                break;
        }
        return super.removeAll(elements);
    }

    @Override
    public final boolean retainAll(Collection elements) {
        switch (this.f24253h) {
            case 0:
                m.e(elements, "elements");
                this.f24254i.c();
                break;
            default:
                m.e(elements, "elements");
                this.f24254i.c();
                break;
        }
        return super.retainAll(elements);
    }
}
