package p136q;

import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.m;

public final class C2659c implements Iterator, Map.Entry {

    public int f26374h;

    public int f26375i = -1;
    public boolean j;

    public final C2661e f26376k;

    public C2659c(C2661e c2661e) {
        this.f26376k = c2661e;
        this.f26374h = c2661e.j - 1;
    }

    @Override
    public final boolean equals(Object obj) {
        if (!this.j) {
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Object key = entry.getKey();
        int i3 = this.f26375i;
        C2661e c2661e = this.f26376k;
        return m.a(key, c2661e.e(i3)) && m.a(entry.getValue(), c2661e.i(this.f26375i));
    }

    @Override
    public final Object getKey() {
        if (this.j) {
            return this.f26376k.e(this.f26375i);
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    @Override
    public final Object getValue() {
        if (this.j) {
            return this.f26376k.i(this.f26375i);
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    @Override
    public final boolean hasNext() {
        return this.f26375i < this.f26374h;
    }

    @Override
    public final int hashCode() {
        if (!this.j) {
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }
        int i3 = this.f26375i;
        C2661e c2661e = this.f26376k;
        Object objE = c2661e.e(i3);
        Object objI = c2661e.i(this.f26375i);
        return (objE == null ? 0 : objE.hashCode()) ^ (objI != null ? objI.hashCode() : 0);
    }

    @Override
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f26375i++;
        this.j = true;
        return this;
    }

    @Override
    public final void remove() {
        if (!this.j) {
            throw new IllegalStateException();
        }
        this.f26376k.g(this.f26375i);
        this.f26375i--;
        this.f26374h--;
        this.j = false;
    }

    @Override
    public final Object setValue(Object obj) {
        if (this.j) {
            return this.f26376k.h(this.f26375i, obj);
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    public final String toString() {
        return getKey() + "=" + getValue();
    }
}
