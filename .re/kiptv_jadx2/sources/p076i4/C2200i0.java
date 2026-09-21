package p076i4;

import java.util.Map;

public final class C2200i0 extends W {

    public final C2188c0 f22908i;

    public C2200i0(C2188c0 c2188c0) {
        this.f22908i = c2188c0;
    }

    @Override
    public final boolean contains(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        return this.f22908i.b(entry.getKey(), entry.getValue());
    }

    @Override
    public final j1 iterator() {
        C2188c0 c2188c0 = this.f22908i;
        c2188c0.getClass();
        return new C2196g0(c2188c0);
    }

    @Override
    public final int size() {
        return this.f22908i.f22877m;
    }
}
