package N7;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.jvm.functions.Function0;
import p136q.F;
import p136q.G;
import p136q.J;
import p136q.K;

public final class k implements Iterator, p201y6.a {

    public final int f7453h;

    public int f7454i;
    public Object j;

    public final Object f7455k;

    public k(Object obj, Map map) {
        this.f7453h = 2;
        this.j = obj;
        this.f7455k = map;
    }

    public void a() {
        Object objInvoke;
        int i3 = this.f7454i;
        l lVar = (l) this.f7455k;
        if (i3 == -2) {
            objInvoke = ((Function0) lVar.f7457b).invoke();
        } else {
            p194x6.j jVar = (p194x6.j) lVar.f7458c;
            Object obj = this.j;
            kotlin.jvm.internal.m.b(obj);
            objInvoke = jVar.invoke(obj);
        }
        this.j = objInvoke;
        this.f7454i = objInvoke == null ? 0 : 1;
    }

    @Override
    public final boolean hasNext() {
        t tVar;
        Iterator it;
        switch (this.f7453h) {
            case 0:
                if (this.f7454i < 0) {
                    a();
                }
                return this.f7454i == 1;
            case 1:
                break;
            case 2:
                return this.f7454i < ((Map) this.f7455k).size();
            case 3:
                return ((n) this.j).hasNext();
            default:
                return ((n) this.j).hasNext();
        }
        while (true) {
            int i3 = this.f7454i;
            tVar = (t) this.f7455k;
            int i9 = tVar.f7468b;
            it = (Iterator) this.j;
            if (i3 < i9 && it.hasNext()) {
                it.next();
                this.f7454i++;
            }
        }
        return this.f7454i < tVar.f7469c && it.hasNext();
    }

    @Override
    public final Object next() {
        t tVar;
        Iterator it;
        switch (this.f7453h) {
            case 0:
                if (this.f7454i < 0) {
                    a();
                }
                if (this.f7454i == 0) {
                    throw new NoSuchElementException();
                }
                Object obj = this.j;
                kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type T of kotlin.sequences.GeneratorSequence");
                this.f7454i = -1;
                return obj;
            case 1:
                break;
            case 2:
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                Object obj2 = this.j;
                this.f7454i++;
                Object obj3 = ((Map) this.f7455k).get(obj2);
                if (obj3 != null) {
                    this.j = ((p073i0.a) obj3).f22742b;
                    return obj2;
                }
                throw new ConcurrentModificationException("Hash code of an element (" + obj2 + ") has changed after it was added to the persistent set.");
            case 3:
                return ((n) this.j).next();
            default:
                return ((n) this.j).next();
        }
        while (true) {
            int i3 = this.f7454i;
            tVar = (t) this.f7455k;
            int i9 = tVar.f7468b;
            it = (Iterator) this.j;
            if (i3 < i9 && it.hasNext()) {
                it.next();
                this.f7454i++;
            }
        }
        int i10 = this.f7454i;
        if (i10 >= tVar.f7469c) {
            throw new NoSuchElementException();
        }
        this.f7454i = i10 + 1;
        return it.next();
    }

    @Override
    public final void remove() {
        switch (this.f7453h) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 2:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 3:
                int i3 = this.f7454i;
                if (i3 != -1) {
                    ((G) this.f7455k).f26321i.h(i3);
                    this.f7454i = -1;
                    return;
                }
                return;
            default:
                int i9 = this.f7454i;
                if (i9 != -1) {
                    ((K) this.f7455k).f26345i.m(i9);
                    this.f7454i = -1;
                    return;
                }
                return;
        }
    }

    public k(t tVar) {
        this.f7453h = 1;
        this.f7455k = tVar;
        this.j = tVar.f7467a.iterator();
    }

    public k(l lVar) {
        this.f7453h = 0;
        this.f7455k = lVar;
        this.f7454i = -2;
    }

    public k(K k9) {
        this.f7453h = 4;
        this.f7455k = k9;
        this.f7454i = -1;
        this.j = E8.d.T(new J(k9, this, null));
    }

    public k(G g) {
        this.f7453h = 3;
        this.f7455k = g;
        this.f7454i = -1;
        this.j = E8.d.T(new F(g, this, null));
    }
}
