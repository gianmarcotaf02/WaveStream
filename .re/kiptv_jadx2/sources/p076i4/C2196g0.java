package p076i4;

import java.util.Map;
import java.util.Objects;

public final class C2196g0 extends j1 {

    public final j1 f22899h;

    public Object f22900i = null;
    public j1 j = C2221t0.f22938k;

    public C2196g0(C2188c0 c2188c0) {
        this.f22899h = c2188c0.f22876l.entrySet().iterator();
    }

    @Override
    public final boolean hasNext() {
        return this.j.hasNext() || this.f22899h.hasNext();
    }

    @Override
    public final Object next() {
        if (!this.j.hasNext()) {
            Map.Entry entry = (Map.Entry) this.f22899h.next();
            this.f22900i = entry.getKey();
            this.j = ((W) entry.getValue()).iterator();
        }
        Object obj = this.f22900i;
        Objects.requireNonNull(obj);
        return new X(obj, this.j.next());
    }
}
