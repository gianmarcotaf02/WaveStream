package androidx.datastore.preferences.protobuf;

import java.util.AbstractMap;
import java.util.Iterator;
import java.util.Map;

public final class b0 implements Iterator {

    public final int f16182h;

    public int f16183i = -1;
    public boolean j;

    public Iterator f16184k;

    public final AbstractMap f16185l;

    public b0(AbstractMap abstractMap, int i3) {
        this.f16182h = i3;
        this.f16185l = abstractMap;
    }

    public final Iterator a() {
        switch (this.f16182h) {
            case 0:
                if (this.f16184k == null) {
                    this.f16184k = ((Z) this.f16185l).f16176i.entrySet().iterator();
                }
                break;
            default:
                if (this.f16184k == null) {
                    this.f16184k = ((p110m7.A) this.f16185l).j.entrySet().iterator();
                }
                break;
        }
        return this.f16184k;
    }

    @Override
    public final boolean hasNext() {
        switch (this.f16182h) {
            case 0:
                int i3 = this.f16183i + 1;
                Z z6 = (Z) this.f16185l;
                if (i3 >= z6.f16175h.size()) {
                    return !z6.f16176i.isEmpty() && a().hasNext();
                }
                return true;
            default:
                return this.f16183i + 1 < ((p110m7.A) this.f16185l).f25443i.size() || a().hasNext();
        }
    }

    @Override
    public final Object next() {
        switch (this.f16182h) {
            case 0:
                this.j = true;
                int i3 = this.f16183i + 1;
                this.f16183i = i3;
                Z z6 = (Z) this.f16185l;
                return i3 < z6.f16175h.size() ? (Map.Entry) z6.f16175h.get(this.f16183i) : (Map.Entry) a().next();
            default:
                this.j = true;
                int i9 = this.f16183i + 1;
                this.f16183i = i9;
                p110m7.A a2 = (p110m7.A) this.f16185l;
                return i9 < a2.f25443i.size() ? (Map.Entry) a2.f25443i.get(this.f16183i) : (Map.Entry) a().next();
        }
    }

    @Override
    public final void remove() {
        AbstractMap abstractMap = this.f16185l;
        switch (this.f16182h) {
            case 0:
                if (!this.j) {
                    throw new IllegalStateException("remove() was called before next()");
                }
                this.j = false;
                int i3 = Z.f16174m;
                Z z6 = (Z) abstractMap;
                z6.b();
                if (this.f16183i >= z6.f16175h.size()) {
                    a().remove();
                    return;
                }
                int i9 = this.f16183i;
                this.f16183i = i9 - 1;
                z6.i(i9);
                return;
            default:
                if (!this.j) {
                    throw new IllegalStateException("remove() was called before next()");
                }
                this.j = false;
                int i10 = p110m7.A.f25441m;
                p110m7.A a2 = (p110m7.A) abstractMap;
                a2.b();
                if (this.f16183i >= a2.f25443i.size()) {
                    a().remove();
                    return;
                }
                int i11 = this.f16183i;
                this.f16183i = i11 - 1;
                a2.g(i11);
                return;
        }
    }
}
