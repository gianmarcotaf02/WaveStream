package N7;

import java.util.Iterator;
import java.util.NoSuchElementException;

public final class h implements Iterator, p201y6.a {

    public final int f7443h;

    public final Iterator f7444i;
    public int j;

    public Object f7445k;

    public final m f7446l;

    public h(i iVar) {
        this.f7443h = 0;
        this.f7446l = iVar;
        this.f7444i = iVar.f7447a.iterator();
        this.j = -1;
    }

    public void a() {
        Object next;
        i iVar;
        do {
            Iterator it = this.f7444i;
            if (!it.hasNext()) {
                this.j = 0;
                return;
            } else {
                next = it.next();
                iVar = (i) this.f7446l;
            }
        } while (((Boolean) iVar.f7449c.invoke(next)).booleanValue() != iVar.f7448b);
        this.f7445k = next;
        this.j = 1;
    }

    public void b() {
        Iterator it = this.f7444i;
        if (it.hasNext()) {
            Object next = it.next();
            if (((Boolean) ((c) this.f7446l).f7436c.invoke(next)).booleanValue()) {
                this.j = 1;
                this.f7445k = next;
                return;
            }
        }
        this.j = 0;
    }

    public boolean c() {
        Iterator it;
        Iterator it2 = (Iterator) this.f7445k;
        if (it2 != null && it2.hasNext()) {
            this.j = 1;
            return true;
        }
        do {
            Iterator it3 = this.f7444i;
            if (!it3.hasNext()) {
                this.j = 2;
                this.f7445k = null;
                return false;
            }
            Object next = it3.next();
            j jVar = (j) this.f7446l;
            it = (Iterator) jVar.f7452c.invoke(jVar.f7451b.invoke(next));
        } while (!it.hasNext());
        this.f7445k = it;
        this.j = 1;
        return true;
    }

    @Override
    public final boolean hasNext() {
        switch (this.f7443h) {
            case 0:
                if (this.j == -1) {
                    a();
                }
                return this.j == 1;
            case 1:
                int i3 = this.j;
                if (i3 == 1) {
                    return true;
                }
                if (i3 == 2) {
                    return false;
                }
                return c();
            default:
                if (this.j == -1) {
                    b();
                }
                return this.j == 1;
        }
    }

    @Override
    public final Object next() {
        switch (this.f7443h) {
            case 0:
                if (this.j == -1) {
                    a();
                }
                if (this.j == 0) {
                    throw new NoSuchElementException();
                }
                Object obj = this.f7445k;
                this.f7445k = null;
                this.j = -1;
                return obj;
            case 1:
                int i3 = this.j;
                if (i3 == 2) {
                    throw new NoSuchElementException();
                }
                if (i3 == 0 && !c()) {
                    throw new NoSuchElementException();
                }
                this.j = 0;
                Iterator it = (Iterator) this.f7445k;
                kotlin.jvm.internal.m.b(it);
                return it.next();
            default:
                if (this.j == -1) {
                    b();
                }
                if (this.j == 0) {
                    throw new NoSuchElementException();
                }
                Object obj2 = this.f7445k;
                this.f7445k = null;
                this.j = -1;
                return obj2;
        }
    }

    @Override
    public final void remove() {
        switch (this.f7443h) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public h(j jVar) {
        this.f7443h = 1;
        this.f7446l = jVar;
        this.f7444i = jVar.f7450a.iterator();
    }

    public h(c cVar) {
        this.f7443h = 2;
        this.f7446l = cVar;
        this.f7444i = cVar.f7435b.iterator();
        this.j = -1;
    }
}
