package p076i4;

import java.util.Map;
import p020c0.C1704s0;
import p068h4.j;

public final class B0 implements j {

    public final int f22773a;

    public final E0 f22774b;

    public B0(E0 e6, int i3) {
        this.f22773a = i3;
        this.f22774b = e6;
    }

    @Override
    public final Object apply(Object obj) {
        switch (this.f22773a) {
            case 0:
                Map.Entry entry = (Map.Entry) obj;
                entry.getKey();
                return ((j) ((C1704s0) this.f22774b).f18362i).apply(entry.getValue());
            default:
                Map.Entry entry2 = (Map.Entry) obj;
                E0 e6 = this.f22774b;
                e6.getClass();
                entry2.getClass();
                return new C0(entry2, e6);
        }
    }
}
