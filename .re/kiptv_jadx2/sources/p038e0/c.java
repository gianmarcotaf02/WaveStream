package p038e0;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.jvm.internal.l;
import kotlin.jvm.internal.m;
import p136q.N;

public final class c implements List, p201y6.c {

    public final int f21319h;

    public final Object f21320i;
    public final int j;

    public int f21321k;

    public c(List list, int i3, int i9, int i10) {
        this.f21319h = i10;
        this.f21320i = list;
        this.j = i3;
        this.f21321k = i9;
    }

    @Override
    public final boolean add(Object obj) {
        switch (this.f21319h) {
            case 0:
                int i3 = this.f21321k;
                this.f21321k = i3 + 1;
                this.f21320i.add(i3, obj);
                break;
            default:
                int i9 = this.f21321k;
                this.f21321k = i9 + 1;
                this.f21320i.add(i9, obj);
                break;
        }
        return true;
    }

    @Override
    public final boolean addAll(int i3, Collection elements) {
        switch (this.f21319h) {
            case 0:
                this.f21320i.addAll(i3 + this.j, elements);
                int size = elements.size();
                this.f21321k += size;
                return size > 0;
            default:
                m.e(elements, "elements");
                this.f21320i.addAll(i3 + this.j, elements);
                this.f21321k = elements.size() + this.f21321k;
                return elements.size() > 0;
        }
    }

    @Override
    public final void clear() {
        switch (this.f21319h) {
            case 0:
                int i3 = this.f21321k - 1;
                int i9 = this.j;
                if (i9 <= i3) {
                    while (true) {
                        this.f21320i.remove(i3);
                        if (i3 != i9) {
                            i3--;
                        }
                    }
                }
                this.f21321k = i9;
                break;
            default:
                int i10 = this.f21321k - 1;
                int i11 = this.j;
                if (i11 <= i10) {
                    while (true) {
                        this.f21320i.remove(i10);
                        if (i10 != i11) {
                            i10--;
                        }
                    }
                }
                this.f21321k = i11;
                break;
        }
    }

    @Override
    public final boolean contains(Object obj) {
        switch (this.f21319h) {
            case 0:
                int i3 = this.f21321k;
                for (int i9 = this.j; i9 < i3; i9++) {
                    if (m.a(this.f21320i.get(i9), obj)) {
                        return true;
                    }
                }
                return false;
            default:
                int i10 = this.f21321k;
                for (int i11 = this.j; i11 < i10; i11++) {
                    if (m.a(this.f21320i.get(i11), obj)) {
                        return true;
                    }
                }
                return false;
        }
    }

    @Override
    public final boolean containsAll(Collection elements) {
        switch (this.f21319h) {
            case 0:
                Iterator it = elements.iterator();
                while (it.hasNext()) {
                    if (!contains(it.next())) {
                        return false;
                    }
                }
                return true;
            default:
                m.e(elements, "elements");
                Iterator it2 = elements.iterator();
                while (it2.hasNext()) {
                    if (!contains(it2.next())) {
                        return false;
                    }
                }
                return true;
        }
    }

    @Override
    public final Object get(int i3) {
        switch (this.f21319h) {
            case 0:
                f.a(i3, this);
                return this.f21320i.get(i3 + this.j);
            default:
                N.a(i3, this);
                return this.f21320i.get(i3 + this.j);
        }
    }

    @Override
    public final int indexOf(Object obj) {
        switch (this.f21319h) {
            case 0:
                int i3 = this.f21321k;
                int i9 = this.j;
                for (int i10 = i9; i10 < i3; i10++) {
                    if (m.a(this.f21320i.get(i10), obj)) {
                        return i10 - i9;
                    }
                }
                return -1;
            default:
                int i11 = this.f21321k;
                int i12 = this.j;
                for (int i13 = i12; i13 < i11; i13++) {
                    if (m.a(this.f21320i.get(i13), obj)) {
                        return i13 - i12;
                    }
                }
                return -1;
        }
    }

    @Override
    public final boolean isEmpty() {
        switch (this.f21319h) {
            case 0:
                return this.f21321k == this.j;
            default:
                return this.f21321k == this.j;
        }
    }

    @Override
    public final Iterator iterator() {
        switch (this.f21319h) {
            case 0:
                return new d(0, 0, this);
            default:
                return new d(0, 1, this);
        }
    }

    @Override
    public final int lastIndexOf(Object obj) {
        switch (this.f21319h) {
            case 0:
                int i3 = this.f21321k - 1;
                int i9 = this.j;
                if (i9 <= i3) {
                    while (!m.a(this.f21320i.get(i3), obj)) {
                        if (i3 != i9) {
                            i3--;
                        }
                    }
                    return i3 - i9;
                }
                return -1;
            default:
                int i10 = this.f21321k - 1;
                int i11 = this.j;
                if (i11 <= i10) {
                    while (!m.a(this.f21320i.get(i10), obj)) {
                        if (i10 != i11) {
                            i10--;
                        }
                    }
                    return i10 - i11;
                }
                return -1;
        }
    }

    @Override
    public final ListIterator listIterator() {
        switch (this.f21319h) {
            case 0:
                return new d(0, 0, this);
            default:
                return new d(0, 1, this);
        }
    }

    @Override
    public final boolean remove(Object obj) {
        switch (this.f21319h) {
            case 0:
                int i3 = this.f21321k;
                for (int i9 = this.j; i9 < i3; i9++) {
                    ?? r9 = this.f21320i;
                    if (m.a(r9.get(i9), obj)) {
                        r9.remove(i9);
                        this.f21321k--;
                        return true;
                    }
                }
                return false;
            default:
                int i10 = this.f21321k;
                for (int i11 = this.j; i11 < i10; i11++) {
                    ?? r10 = this.f21320i;
                    if (m.a(r10.get(i11), obj)) {
                        r10.remove(i11);
                        this.f21321k--;
                        return true;
                    }
                }
                return false;
        }
    }

    @Override
    public final boolean removeAll(Collection elements) {
        switch (this.f21319h) {
            case 0:
                int i3 = this.f21321k;
                Iterator it = elements.iterator();
                while (it.hasNext()) {
                    remove(it.next());
                }
                return i3 != this.f21321k;
            default:
                m.e(elements, "elements");
                int i9 = this.f21321k;
                Iterator it2 = elements.iterator();
                while (it2.hasNext()) {
                    remove(it2.next());
                }
                return i9 != this.f21321k;
        }
    }

    @Override
    public final boolean retainAll(Collection elements) {
        switch (this.f21319h) {
            case 0:
                int i3 = this.f21321k;
                int i9 = i3 - 1;
                int i10 = this.j;
                if (i10 <= i9) {
                    while (true) {
                        ?? r9 = this.f21320i;
                        if (!elements.contains(r9.get(i9))) {
                            r9.remove(i9);
                            this.f21321k--;
                        }
                        if (i9 != i10) {
                            i9--;
                        }
                    }
                }
                return i3 != this.f21321k;
            default:
                m.e(elements, "elements");
                int i11 = this.f21321k;
                int i12 = i11 - 1;
                int i13 = this.j;
                if (i13 <= i12) {
                    while (true) {
                        ?? r10 = this.f21320i;
                        if (!elements.contains(r10.get(i12))) {
                            r10.remove(i12);
                            this.f21321k--;
                        }
                        if (i12 != i13) {
                            i12--;
                        }
                    }
                }
                return i11 != this.f21321k;
        }
    }

    @Override
    public final Object set(int i3, Object obj) {
        switch (this.f21319h) {
            case 0:
                f.a(i3, this);
                return this.f21320i.set(i3 + this.j, obj);
            default:
                N.a(i3, this);
                return this.f21320i.set(i3 + this.j, obj);
        }
    }

    @Override
    public final int size() {
        switch (this.f21319h) {
            case 0:
                break;
        }
        return this.f21321k - this.j;
    }

    @Override
    public final List subList(int i3, int i9) {
        switch (this.f21319h) {
            case 0:
                f.b(i3, i9, this);
                return new c(this, i3, i9, 0);
            default:
                N.b(i3, i9, this);
                return new c(this, i3, i9, 1);
        }
    }

    @Override
    public final Object[] toArray() {
        switch (this.f21319h) {
            case 0:
                break;
        }
        return l.a(this);
    }

    @Override
    public final void add(int i3, Object obj) {
        switch (this.f21319h) {
            case 0:
                this.f21320i.add(i3 + this.j, obj);
                this.f21321k++;
                break;
            default:
                this.f21320i.add(i3 + this.j, obj);
                this.f21321k++;
                break;
        }
    }

    @Override
    public final ListIterator listIterator(int i3) {
        switch (this.f21319h) {
            case 0:
                return new d(i3, 0, this);
            default:
                return new d(i3, 1, this);
        }
    }

    @Override
    public final Object[] toArray(Object[] array) {
        switch (this.f21319h) {
            case 0:
                break;
            default:
                m.e(array, "array");
                break;
        }
        return l.b(this, array);
    }

    @Override
    public final boolean addAll(Collection elements) {
        switch (this.f21319h) {
            case 0:
                this.f21320i.addAll(this.f21321k, elements);
                int size = elements.size();
                this.f21321k += size;
                return size > 0;
            default:
                m.e(elements, "elements");
                this.f21320i.addAll(this.f21321k, elements);
                this.f21321k = elements.size() + this.f21321k;
                return elements.size() > 0;
        }
    }

    @Override
    public final Object remove(int i3) {
        switch (this.f21319h) {
            case 0:
                f.a(i3, this);
                Object objRemove = this.f21320i.remove(i3 + this.j);
                this.f21321k--;
                return objRemove;
            default:
                N.a(i3, this);
                Object objRemove2 = this.f21320i.remove(i3 + this.j);
                this.f21321k--;
                return objRemove2;
        }
    }
}
