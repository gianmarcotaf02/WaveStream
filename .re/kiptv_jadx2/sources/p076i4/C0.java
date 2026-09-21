package p076i4;

import java.util.Map;

public final class C0 extends r {

    public final Map.Entry f22777h;

    public final E0 f22778i;

    public C0(Map.Entry entry, E0 e6) {
        this.f22777h = entry;
        this.f22778i = e6;
    }

    @Override
    public final Object getKey() {
        return this.f22777h.getKey();
    }

    @Override
    public final Object getValue() {
        Map.Entry entry = this.f22777h;
        return this.f22778i.a(entry.getKey(), entry.getValue());
    }
}
