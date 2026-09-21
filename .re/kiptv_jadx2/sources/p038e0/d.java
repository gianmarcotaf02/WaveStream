package p038e0;

import java.util.List;
import java.util.ListIterator;
import p201y6.a;

public final class d implements ListIterator, a {

    public final int f21322h;

    public final Object f21323i;
    public int j;

    public d(int i3, int i9, List list) {
        this.f21322h = i9;
        switch (i9) {
            case 1:
                this.f21323i = list;
                this.j = i3 - 1;
                break;
            default:
                this.f21323i = list;
                this.j = i3;
                break;
        }
    }

    @Override
    public final void add(Object obj) {
        switch (this.f21322h) {
            case 0:
                this.f21323i.add(this.j, obj);
                this.j++;
                break;
            default:
                int i3 = this.j + 1;
                this.j = i3;
                this.f21323i.add(i3, obj);
                break;
        }
    }

    @Override
    public final boolean hasNext() {
        switch (this.f21322h) {
            case 0:
                return this.j < this.f21323i.size();
            default:
                return this.j < this.f21323i.size() - 1;
        }
    }

    @Override
    public final boolean hasPrevious() {
        switch (this.f21322h) {
            case 0:
                return this.j > 0;
            default:
                return this.j >= 0;
        }
    }

    @Override
    public final Object next() {
        switch (this.f21322h) {
            case 0:
                int i3 = this.j;
                this.j = i3 + 1;
                return this.f21323i.get(i3);
            default:
                int i9 = this.j + 1;
                this.j = i9;
                return this.f21323i.get(i9);
        }
    }

    @Override
    public final int nextIndex() {
        switch (this.f21322h) {
            case 0:
                return this.j;
            default:
                return this.j + 1;
        }
    }

    @Override
    public final Object previous() {
        switch (this.f21322h) {
            case 0:
                int i3 = this.j - 1;
                this.j = i3;
                return this.f21323i.get(i3);
            default:
                int i9 = this.j;
                this.j = i9 - 1;
                return this.f21323i.get(i9);
        }
    }

    @Override
    public final int previousIndex() {
        switch (this.f21322h) {
            case 0:
                return this.j - 1;
            default:
                return this.j;
        }
    }

    @Override
    public final void remove() {
        switch (this.f21322h) {
            case 0:
                int i3 = this.j - 1;
                this.j = i3;
                this.f21323i.remove(i3);
                break;
            default:
                this.f21323i.remove(this.j);
                this.j--;
                break;
        }
    }

    @Override
    public final void set(Object obj) {
        switch (this.f21322h) {
            case 0:
                this.f21323i.set(this.j, obj);
                break;
            default:
                this.f21323i.set(this.j, obj);
                break;
        }
    }
}
