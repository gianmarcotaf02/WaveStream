package p110m7;

import androidx.datastore.preferences.protobuf.C1497d;
import java.util.Iterator;

public final class y implements Iterator {

    public final x f25509h;

    public C1497d f25510i;
    public int j;

    public y(z zVar) {
        x xVar = new x(zVar);
        this.f25509h = xVar;
        this.f25510i = new C1497d(xVar.next());
        this.j = zVar.f25512i;
    }

    @Override
    public final boolean hasNext() {
        return this.j > 0;
    }

    @Override
    public final Object next() {
        if (!this.f25510i.hasNext()) {
            this.f25510i = new C1497d(this.f25509h.next());
        }
        this.j--;
        return Byte.valueOf(this.f25510i.a());
    }

    @Override
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
